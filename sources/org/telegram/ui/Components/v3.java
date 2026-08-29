package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ qc0 c;
    public final /* synthetic */ qc0 d;
    public final /* synthetic */ qc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Context context, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = qc0Var;
        this.d = qc0Var2;
        this.e = qc0Var3;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                u3 u3Var = (u3) this.e;
                t3 t3Var = (t3) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                qc0 qc0Var = this.c;
                qc0Var.setItemCount(i12);
                t3Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                qc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                y3 y3Var = (y3) this.e;
                w3 w3Var = (w3) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                qc0 qc0Var2 = this.c;
                qc0Var2.setItemCount(i13);
                w3Var.setItemCount(i13);
                y3Var.setItemCount(i13);
                qc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                w3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                c4 c4Var = (c4) this.e;
                b4 b4Var = (b4) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                qc0 qc0Var3 = this.c;
                qc0Var3.setItemCount(i14);
                b4Var.setItemCount(i14);
                c4Var.setItemCount(i14);
                qc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                f4 f4Var = (f4) this.e;
                e4 e4Var = (e4) this.d;
                this.b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i15 = point4.x > point4.y ? 3 : 5;
                qc0 qc0Var4 = this.c;
                qc0Var4.setItemCount(i15);
                e4Var.setItemCount(i15);
                f4Var.setItemCount(i15);
                qc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                j4 j4Var = (j4) this.e;
                i4 i4Var = (i4) this.d;
                this.b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i16 = point5.x > point5.y ? 3 : 5;
                i4Var.setItemCount(i16);
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                j4Var.setItemCount(i16);
                j4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                qc0 qc0Var5 = this.c;
                qc0Var5.setItemCount(i16);
                qc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                t4 t4Var = (t4) this.e;
                s4 s4Var = (s4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                qc0 qc0Var6 = this.c;
                qc0Var6.setItemCount(i17);
                s4Var.setItemCount(i17);
                t4Var.setItemCount(i17);
                qc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                s4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                t4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
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
    public v3(Activity activity, i4 i4Var, j4 j4Var, qc0 qc0Var) {
        super(activity);
        this.a = 4;
        this.d = i4Var;
        this.e = j4Var;
        this.c = qc0Var;
        this.b = false;
    }
}
