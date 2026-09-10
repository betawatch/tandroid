package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ dd0 c;
    public final /* synthetic */ dd0 d;
    public final /* synthetic */ dd0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = dd0Var;
        this.d = dd0Var2;
        this.e = dd0Var3;
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
                dd0 dd0Var = this.c;
                dd0Var.setItemCount(i12);
                t3Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
                dd0 dd0Var2 = this.c;
                dd0Var2.setItemCount(i13);
                w3Var.setItemCount(i13);
                y3Var.setItemCount(i13);
                dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                w3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                d4 d4Var = (d4) this.e;
                c4 c4Var = (c4) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                dd0 dd0Var3 = this.c;
                dd0Var3.setItemCount(i14);
                c4Var.setItemCount(i14);
                d4Var.setItemCount(i14);
                dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                d4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                g4 g4Var = (g4) this.e;
                f4 f4Var = (f4) this.d;
                this.b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i15 = point4.x > point4.y ? 3 : 5;
                dd0 dd0Var4 = this.c;
                dd0Var4.setItemCount(i15);
                f4Var.setItemCount(i15);
                g4Var.setItemCount(i15);
                dd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                k4 k4Var = (k4) this.e;
                j4 j4Var = (j4) this.d;
                this.b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i16 = point5.x > point5.y ? 3 : 5;
                j4Var.setItemCount(i16);
                j4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                k4Var.setItemCount(i16);
                k4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                dd0 dd0Var5 = this.c;
                dd0Var5.setItemCount(i16);
                dd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                u4 u4Var = (u4) this.e;
                t4 t4Var = (t4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                dd0 dd0Var6 = this.c;
                dd0Var6.setItemCount(i17);
                t4Var.setItemCount(i17);
                u4Var.setItemCount(i17);
                dd0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                t4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                u4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
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
    public v3(Activity activity, j4 j4Var, k4 k4Var, dd0 dd0Var) {
        super(activity);
        this.a = 4;
        this.d = j4Var;
        this.e = k4Var;
        this.c = dd0Var;
        this.b = false;
    }
}
