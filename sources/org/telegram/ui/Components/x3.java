package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class x3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ od0 c;
    public final /* synthetic */ od0 d;
    public final /* synthetic */ od0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(Context context, od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.e;
                v3 v3Var = (v3) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                od0 od0Var = this.c;
                od0Var.setItemCount(i12);
                v3Var.setItemCount(i12);
                w3Var.setItemCount(i12);
                od0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                w3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                a4 a4Var = (a4) this.e;
                y3 y3Var = (y3) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                od0 od0Var2 = this.c;
                od0Var2.setItemCount(i13);
                y3Var.setItemCount(i13);
                a4Var.setItemCount(i13);
                od0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                a4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                f4 f4Var = (f4) this.e;
                e4 e4Var = (e4) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                od0 od0Var3 = this.c;
                od0Var3.setItemCount(i14);
                e4Var.setItemCount(i14);
                f4Var.setItemCount(i14);
                od0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                i4 i4Var = (i4) this.e;
                h4 h4Var = (h4) this.d;
                this.b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i15 = point4.x > point4.y ? 3 : 5;
                od0 od0Var4 = this.c;
                od0Var4.setItemCount(i15);
                h4Var.setItemCount(i15);
                i4Var.setItemCount(i15);
                od0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                h4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                m4 m4Var = (m4) this.e;
                l4 l4Var = (l4) this.d;
                this.b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i16 = point5.x > point5.y ? 3 : 5;
                l4Var.setItemCount(i16);
                l4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                m4Var.setItemCount(i16);
                m4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                od0 od0Var5 = this.c;
                od0Var5.setItemCount(i16);
                od0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                w4 w4Var = (w4) this.e;
                v4 v4Var = (v4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                od0 od0Var6 = this.c;
                od0Var6.setItemCount(i17);
                v4Var.setItemCount(i17);
                w4Var.setItemCount(i17);
                od0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                v4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                w4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
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
    public x3(Activity activity, l4 l4Var, m4 m4Var, od0 od0Var) {
        super(activity);
        this.a = 4;
        this.d = l4Var;
        this.e = m4Var;
        this.c = od0Var;
        this.b = false;
    }
}
