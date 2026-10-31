package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ ac0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(Context context, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = ac0Var;
        this.d = ac0Var2;
        this.e = ac0Var3;
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.t6.G6;
                ((qz0) this.c).c((getWidth() - ((qz0) this.c).c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, i10, false), canvas);
                if (!org.telegram.messenger.cd.Z) {
                    boolean z10 = ((m3) this.e).getValue() % 24 < 12;
                    if (this.b != z10 || ((qz0) this.d) == null) {
                        this.b = z10;
                        this.d = new qz0(z10 ? "AM" : "PM", 18.0f, null);
                    }
                    ((qz0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.i0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.t6.x0(null, i10, false), canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                r3 r3Var = (r3) this.e;
                q3 q3Var = (q3) this.d;
                ac0 ac0Var = (ac0) this.c;
                this.b = true;
                Point point = org.telegram.messenger.i0.q;
                int i12 = point.x > point.y ? 3 : 5;
                ac0Var.setItemCount(i12);
                q3Var.setItemCount(i12);
                r3Var.setItemCount(i12);
                ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                q3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                r3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                t3 t3Var = (t3) this.e;
                s3 s3Var = (s3) this.d;
                ac0 ac0Var2 = (ac0) this.c;
                this.b = true;
                Point point2 = org.telegram.messenger.i0.q;
                int i13 = point2.x > point2.y ? 3 : 5;
                ac0Var2.setItemCount(i13);
                s3Var.setItemCount(i13);
                t3Var.setItemCount(i13);
                ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                s3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                t3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                x3 x3Var = (x3) this.e;
                w3 w3Var = (w3) this.d;
                ac0 ac0Var3 = (ac0) this.c;
                this.b = true;
                Point point3 = org.telegram.messenger.i0.q;
                int i14 = point3.x > point3.y ? 3 : 5;
                ac0Var3.setItemCount(i14);
                w3Var.setItemCount(i14);
                x3Var.setItemCount(i14);
                ac0Var3.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i14;
                w3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i14;
                x3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i14;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                a4 a4Var = (a4) this.e;
                z3 z3Var = (z3) this.d;
                ac0 ac0Var4 = (ac0) this.c;
                this.b = true;
                Point point4 = org.telegram.messenger.i0.q;
                int i15 = point4.x > point4.y ? 3 : 5;
                ac0Var4.setItemCount(i15);
                z3Var.setItemCount(i15);
                a4Var.setItemCount(i15);
                ac0Var4.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i15;
                z3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i15;
                a4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i15;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 5:
                e4 e4Var = (e4) this.d;
                d4 d4Var = (d4) this.c;
                this.b = true;
                Point point5 = org.telegram.messenger.i0.q;
                int i16 = point5.x > point5.y ? 3 : 5;
                d4Var.setItemCount(i16);
                d4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i16;
                e4Var.setItemCount(i16);
                e4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i16;
                ac0 ac0Var5 = this.e;
                ac0Var5.setItemCount(i16);
                ac0Var5.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 6:
                ac0 ac0Var6 = (ac0) this.d;
                ac0 ac0Var7 = (ac0) this.c;
                this.b = true;
                Point point6 = org.telegram.messenger.i0.q;
                int i17 = point6.x > point6.y ? 3 : 5;
                ac0Var7.setItemCount(i17);
                ac0Var6.setItemCount(i17);
                ac0 ac0Var8 = this.e;
                ac0Var8.setItemCount(i17);
                ac0Var7.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i17;
                ac0Var6.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i17;
                ac0Var8.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i17;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 7:
                l4 l4Var = (l4) this.e;
                k4 k4Var = (k4) this.d;
                ac0 ac0Var9 = (ac0) this.c;
                this.b = true;
                Point point7 = org.telegram.messenger.i0.q;
                int i18 = point7.x > point7.y ? 3 : 5;
                ac0Var9.setItemCount(i18);
                k4Var.setItemCount(i18);
                l4Var.setItemCount(i18);
                ac0Var9.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i18;
                k4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i18;
                l4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i18;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
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
            case 5:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 6:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 7:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(Context context, m3 m3Var) {
        super(context);
        this.a = 0;
        this.e = m3Var;
        this.c = new qz0(":", 18.0f, null);
    }
}
