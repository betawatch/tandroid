package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ yc0 c;
    public final /* synthetic */ yc0 d;
    public final /* synthetic */ yc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Context context, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = yc0Var;
        this.d = yc0Var2;
        this.e = yc0Var3;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                r3 r3Var = (r3) this.e;
                q3 q3Var = (q3) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                yc0 yc0Var = this.c;
                yc0Var.setItemCount(i12);
                q3Var.setItemCount(i12);
                r3Var.setItemCount(i12);
                yc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                r3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                v3 v3Var = (v3) this.e;
                t3 t3Var = (t3) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                yc0 yc0Var2 = this.c;
                yc0Var2.setItemCount(i13);
                t3Var.setItemCount(i13);
                v3Var.setItemCount(i13);
                yc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                z3 z3Var = (z3) this.e;
                y3 y3Var = (y3) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                yc0 yc0Var3 = this.c;
                yc0Var3.setItemCount(i14);
                y3Var.setItemCount(i14);
                z3Var.setItemCount(i14);
                yc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                z3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                c4 c4Var = (c4) this.e;
                b4 b4Var = (b4) this.d;
                this.b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i15 = point4.x > point4.y ? 3 : 5;
                yc0 yc0Var4 = this.c;
                yc0Var4.setItemCount(i15);
                b4Var.setItemCount(i15);
                c4Var.setItemCount(i15);
                yc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                g4 g4Var = (g4) this.e;
                f4 f4Var = (f4) this.d;
                this.b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i16 = point5.x > point5.y ? 3 : 5;
                f4Var.setItemCount(i16);
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                g4Var.setItemCount(i16);
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                yc0 yc0Var5 = this.c;
                yc0Var5.setItemCount(i16);
                yc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                q4 q4Var = (q4) this.e;
                p4 p4Var = (p4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                yc0 yc0Var6 = this.c;
                yc0Var6.setItemCount(i17);
                p4Var.setItemCount(i17);
                q4Var.setItemCount(i17);
                yc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                p4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                q4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
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
    public s3(Activity activity, f4 f4Var, g4 g4Var, yc0 yc0Var) {
        super(activity);
        this.a = 4;
        this.d = f4Var;
        this.e = g4Var;
        this.c = yc0Var;
        this.b = false;
    }
}
