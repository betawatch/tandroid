package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class w3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ tb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Context context, tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3, int i7) {
        super(context);
        this.a = i7;
        this.c = tb0Var;
        this.d = tb0Var2;
        this.e = tb0Var3;
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                ((xy0) this.c).c((getWidth() - ((xy0) this.c).c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.hd.c0) {
                    boolean z10 = ((v3) this.e).getValue() % 24 < 12;
                    if (this.b != z10 || ((xy0) this.d) == null) {
                        this.b = z10;
                        this.d = new xy0(z10 ? "AM" : "PM", 18.0f, null);
                    }
                    ((xy0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                a4 a4Var = (a4) this.e;
                z3 z3Var = (z3) this.d;
                tb0 tb0Var = (tb0) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                tb0Var.setItemCount(i11);
                z3Var.setItemCount(i11);
                a4Var.setItemCount(i11);
                tb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                a4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 2:
                c4 c4Var = (c4) this.e;
                b4 b4Var = (b4) this.d;
                tb0 tb0Var2 = (tb0) this.c;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                tb0Var2.setItemCount(i12);
                b4Var.setItemCount(i12);
                c4Var.setItemCount(i12);
                tb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                b4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 3:
                h4 h4Var = (h4) this.e;
                g4 g4Var = (g4) this.d;
                tb0 tb0Var3 = (tb0) this.c;
                this.b = true;
                Point point3 = org.telegram.messenger.g0.q;
                int i13 = point3.x > point3.y ? 3 : 5;
                tb0Var3.setItemCount(i13);
                g4Var.setItemCount(i13);
                h4Var.setItemCount(i13);
                tb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                h4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 4:
                k4 k4Var = (k4) this.e;
                j4 j4Var = (j4) this.d;
                tb0 tb0Var4 = (tb0) this.c;
                this.b = true;
                Point point4 = org.telegram.messenger.g0.q;
                int i14 = point4.x > point4.y ? 3 : 5;
                tb0Var4.setItemCount(i14);
                j4Var.setItemCount(i14);
                k4Var.setItemCount(i14);
                tb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                j4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                k4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 5:
                o4 o4Var = (o4) this.d;
                n4 n4Var = (n4) this.c;
                this.b = true;
                Point point5 = org.telegram.messenger.g0.q;
                int i15 = point5.x > point5.y ? 3 : 5;
                n4Var.setItemCount(i15);
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                o4Var.setItemCount(i15);
                o4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                tb0 tb0Var5 = this.e;
                tb0Var5.setItemCount(i15);
                tb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 6:
                tb0 tb0Var6 = (tb0) this.d;
                tb0 tb0Var7 = (tb0) this.c;
                this.b = true;
                Point point6 = org.telegram.messenger.g0.q;
                int i16 = point6.x > point6.y ? 3 : 5;
                tb0Var7.setItemCount(i16);
                tb0Var6.setItemCount(i16);
                tb0 tb0Var8 = this.e;
                tb0Var8.setItemCount(i16);
                tb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                tb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                tb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 7:
                v4 v4Var = (v4) this.e;
                u4 u4Var = (u4) this.d;
                tb0 tb0Var9 = (tb0) this.c;
                this.b = true;
                Point point7 = org.telegram.messenger.g0.q;
                int i17 = point7.x > point7.y ? 3 : 5;
                tb0Var9.setItemCount(i17);
                u4Var.setItemCount(i17);
                v4Var.setItemCount(i17);
                tb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                u4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                v4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            default:
                super.onMeasure(i7, i10);
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
    public w3(Context context, v3 v3Var) {
        super(context);
        this.a = 0;
        this.e = v3Var;
        this.c = new xy0(":", 18.0f, null);
    }
}
