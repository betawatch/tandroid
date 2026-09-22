package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ uc0 c;
    public final /* synthetic */ uc0 d;
    public final /* synthetic */ uc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3(Context context, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = uc0Var;
        this.d = uc0Var2;
        this.e = uc0Var3;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                t3 t3Var = (t3) this.e;
                s3 s3Var = (s3) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                uc0 uc0Var = this.c;
                uc0Var.setItemCount(i12);
                s3Var.setItemCount(i12);
                t3Var.setItemCount(i12);
                uc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                x3 x3Var = (x3) this.e;
                v3 v3Var = (v3) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                uc0 uc0Var2 = this.c;
                uc0Var2.setItemCount(i13);
                v3Var.setItemCount(i13);
                x3Var.setItemCount(i13);
                uc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                c4 c4Var = (c4) this.e;
                b4 b4Var = (b4) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                uc0 uc0Var3 = this.c;
                uc0Var3.setItemCount(i14);
                b4Var.setItemCount(i14);
                c4Var.setItemCount(i14);
                uc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
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
                uc0 uc0Var4 = this.c;
                uc0Var4.setItemCount(i15);
                e4Var.setItemCount(i15);
                f4Var.setItemCount(i15);
                uc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
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
                uc0 uc0Var5 = this.c;
                uc0Var5.setItemCount(i16);
                uc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                t4 t4Var = (t4) this.e;
                s4 s4Var = (s4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                uc0 uc0Var6 = this.c;
                uc0Var6.setItemCount(i17);
                s4Var.setItemCount(i17);
                t4Var.setItemCount(i17);
                uc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
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
    public u3(Activity activity, i4 i4Var, j4 j4Var, uc0 uc0Var) {
        super(activity);
        this.a = 4;
        this.d = i4Var;
        this.e = j4Var;
        this.c = uc0Var;
        this.b = false;
    }
}
