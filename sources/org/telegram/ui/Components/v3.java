package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ sb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Context context, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, int i7) {
        super(context);
        this.a = i7;
        this.c = sb0Var;
        this.d = sb0Var2;
        this.e = sb0Var3;
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int i7 = org.telegram.ui.ActionBar.n6.G6;
                ((vy0) this.c).c((getWidth() - ((vy0) this.c).c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.gd.c0) {
                    boolean z10 = ((u3) this.e).getValue() % 24 < 12;
                    if (this.b != z10 || ((vy0) this.d) == null) {
                        this.b = z10;
                        this.d = new vy0(z10 ? "AM" : "PM", 18.0f, null);
                    }
                    ((vy0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i7, false), canvas);
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
                z3 z3Var = (z3) this.e;
                y3 y3Var = (y3) this.d;
                sb0 sb0Var = (sb0) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                sb0Var.setItemCount(i11);
                y3Var.setItemCount(i11);
                z3Var.setItemCount(i11);
                sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                y3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 2:
                b4 b4Var = (b4) this.e;
                a4 a4Var = (a4) this.d;
                sb0 sb0Var2 = (sb0) this.c;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                sb0Var2.setItemCount(i12);
                a4Var.setItemCount(i12);
                b4Var.setItemCount(i12);
                sb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                a4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                b4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 3:
                g4 g4Var = (g4) this.e;
                f4 f4Var = (f4) this.d;
                sb0 sb0Var3 = (sb0) this.c;
                this.b = true;
                Point point3 = org.telegram.messenger.g0.q;
                int i13 = point3.x > point3.y ? 3 : 5;
                sb0Var3.setItemCount(i13);
                f4Var.setItemCount(i13);
                g4Var.setItemCount(i13);
                sb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                f4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 4:
                j4 j4Var = (j4) this.e;
                i4 i4Var = (i4) this.d;
                sb0 sb0Var4 = (sb0) this.c;
                this.b = true;
                Point point4 = org.telegram.messenger.g0.q;
                int i14 = point4.x > point4.y ? 3 : 5;
                sb0Var4.setItemCount(i14);
                i4Var.setItemCount(i14);
                j4Var.setItemCount(i14);
                sb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                i4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                j4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 5:
                n4 n4Var = (n4) this.d;
                m4 m4Var = (m4) this.c;
                this.b = true;
                Point point5 = org.telegram.messenger.g0.q;
                int i15 = point5.x > point5.y ? 3 : 5;
                m4Var.setItemCount(i15);
                m4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                n4Var.setItemCount(i15);
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                sb0 sb0Var5 = this.e;
                sb0Var5.setItemCount(i15);
                sb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 6:
                sb0 sb0Var6 = (sb0) this.d;
                sb0 sb0Var7 = (sb0) this.c;
                this.b = true;
                Point point6 = org.telegram.messenger.g0.q;
                int i16 = point6.x > point6.y ? 3 : 5;
                sb0Var7.setItemCount(i16);
                sb0Var6.setItemCount(i16);
                sb0 sb0Var8 = this.e;
                sb0Var8.setItemCount(i16);
                sb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                sb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                sb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 7:
                u4 u4Var = (u4) this.e;
                t4 t4Var = (t4) this.d;
                sb0 sb0Var9 = (sb0) this.c;
                this.b = true;
                Point point7 = org.telegram.messenger.g0.q;
                int i17 = point7.x > point7.y ? 3 : 5;
                sb0Var9.setItemCount(i17);
                t4Var.setItemCount(i17);
                u4Var.setItemCount(i17);
                sb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                t4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                u4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
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
    public v3(Context context, u3 u3Var) {
        super(context);
        this.a = 0;
        this.e = u3Var;
        this.c = new vy0(":", 18.0f, null);
    }
}
