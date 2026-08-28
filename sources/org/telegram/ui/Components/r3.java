package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ bc0 c;
    public final /* synthetic */ bc0 d;
    public final /* synthetic */ bc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(Context context, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, int i9) {
        super(context);
        this.a = i9;
        this.c = bc0Var;
        this.d = bc0Var2;
        this.e = bc0Var3;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                q3 q3Var = (q3) this.e;
                p3 p3Var = (p3) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i11 = point.x > point.y ? 3 : 5;
                bc0 bc0Var = this.c;
                bc0Var.setItemCount(i11);
                p3Var.setItemCount(i11);
                q3Var.setItemCount(i11);
                bc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                p3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                this.b = false;
                super.onMeasure(i9, i10);
                break;
            case 1:
                u3 u3Var = (u3) this.e;
                s3 s3Var = (s3) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i12 = point2.x > point2.y ? 3 : 5;
                bc0 bc0Var2 = this.c;
                bc0Var2.setItemCount(i12);
                s3Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                bc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i9, i10);
                break;
            case 2:
                y3 y3Var = (y3) this.e;
                x3 x3Var = (x3) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i13 = point3.x > point3.y ? 3 : 5;
                bc0 bc0Var3 = this.c;
                bc0Var3.setItemCount(i13);
                x3Var.setItemCount(i13);
                y3Var.setItemCount(i13);
                bc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i9, i10);
                break;
            case 3:
                b4 b4Var = (b4) this.e;
                a4 a4Var = (a4) this.d;
                this.b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i14 = point4.x > point4.y ? 3 : 5;
                bc0 bc0Var4 = this.c;
                bc0Var4.setItemCount(i14);
                a4Var.setItemCount(i14);
                b4Var.setItemCount(i14);
                bc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                a4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.b = false;
                super.onMeasure(i9, i10);
                break;
            case 4:
                f4 f4Var = (f4) this.e;
                e4 e4Var = (e4) this.d;
                this.b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i15 = point5.x > point5.y ? 3 : 5;
                e4Var.setItemCount(i15);
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                f4Var.setItemCount(i15);
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                bc0 bc0Var5 = this.c;
                bc0Var5.setItemCount(i15);
                bc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.b = false;
                super.onMeasure(i9, i10);
                break;
            default:
                p4 p4Var = (p4) this.e;
                o4 o4Var = (o4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i16 = point6.x > point6.y ? 3 : 5;
                bc0 bc0Var6 = this.c;
                bc0Var6.setItemCount(i16);
                o4Var.setItemCount(i16);
                p4Var.setItemCount(i16);
                bc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                o4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                p4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i9, i10);
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
    public r3(Activity activity, e4 e4Var, f4 f4Var, bc0 bc0Var) {
        super(activity);
        this.a = 4;
        this.d = e4Var;
        this.e = f4Var;
        this.c = bc0Var;
        this.b = false;
    }
}
