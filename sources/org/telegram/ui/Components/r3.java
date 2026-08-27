package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ fc0 c;
    public final /* synthetic */ fc0 d;
    public final /* synthetic */ fc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(Context context, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = fc0Var;
        this.d = fc0Var2;
        this.e = fc0Var3;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                q3 q3Var = (q3) this.e;
                p3 p3Var = (p3) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                fc0 fc0Var = this.c;
                fc0Var.setItemCount(i12);
                p3Var.setItemCount(i12);
                q3Var.setItemCount(i12);
                fc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                p3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                u3 u3Var = (u3) this.e;
                s3 s3Var = (s3) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                fc0 fc0Var2 = this.c;
                fc0Var2.setItemCount(i13);
                s3Var.setItemCount(i13);
                u3Var.setItemCount(i13);
                fc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                y3 y3Var = (y3) this.e;
                x3 x3Var = (x3) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                fc0 fc0Var3 = this.c;
                fc0Var3.setItemCount(i14);
                x3Var.setItemCount(i14);
                y3Var.setItemCount(i14);
                fc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                b4 b4Var = (b4) this.e;
                a4 a4Var = (a4) this.d;
                this.b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i15 = point4.x > point4.y ? 3 : 5;
                fc0 fc0Var4 = this.c;
                fc0Var4.setItemCount(i15);
                a4Var.setItemCount(i15);
                b4Var.setItemCount(i15);
                fc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                a4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                f4 f4Var = (f4) this.e;
                e4 e4Var = (e4) this.d;
                this.b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i16 = point5.x > point5.y ? 3 : 5;
                e4Var.setItemCount(i16);
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                f4Var.setItemCount(i16);
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                fc0 fc0Var5 = this.c;
                fc0Var5.setItemCount(i16);
                fc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                p4 p4Var = (p4) this.e;
                o4 o4Var = (o4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                fc0 fc0Var6 = this.c;
                fc0Var6.setItemCount(i17);
                o4Var.setItemCount(i17);
                p4Var.setItemCount(i17);
                fc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                o4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                p4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
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
    public r3(Activity activity, e4 e4Var, f4 f4Var, fc0 fc0Var) {
        super(activity);
        this.a = 4;
        this.d = e4Var;
        this.e = f4Var;
        this.c = fc0Var;
        this.b = false;
    }
}
