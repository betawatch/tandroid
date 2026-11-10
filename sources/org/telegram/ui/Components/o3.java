package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ hb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Context context, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7) {
        super(context);
        this.a = i7;
        this.c = hb0Var;
        this.d = hb0Var2;
        this.e = hb0Var3;
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                ((my0) this.c).c((getWidth() - ((my0) this.c).c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.id.c0) {
                    boolean z9 = ((n3) this.e).getValue() % 24 < 12;
                    if (this.b != z9 || ((my0) this.d) == null) {
                        this.b = z9;
                        this.d = new my0(z9 ? "AM" : "PM", 18.0f, null);
                    }
                    ((my0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), canvas);
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
                s3 s3Var = (s3) this.e;
                r3 r3Var = (r3) this.d;
                hb0 hb0Var = (hb0) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                hb0Var.setItemCount(i11);
                r3Var.setItemCount(i11);
                s3Var.setItemCount(i11);
                hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                r3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                s3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 2:
                u3 u3Var = (u3) this.e;
                t3 t3Var = (t3) this.d;
                hb0 hb0Var2 = (hb0) this.c;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                hb0Var2.setItemCount(i12);
                t3Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                t3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                u3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 3:
                z3 z3Var = (z3) this.e;
                y3 y3Var = (y3) this.d;
                hb0 hb0Var3 = (hb0) this.c;
                this.b = true;
                Point point3 = org.telegram.messenger.g0.q;
                int i13 = point3.x > point3.y ? 3 : 5;
                hb0Var3.setItemCount(i13);
                y3Var.setItemCount(i13);
                z3Var.setItemCount(i13);
                hb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                y3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 4:
                c4 c4Var = (c4) this.e;
                b4 b4Var = (b4) this.d;
                hb0 hb0Var4 = (hb0) this.c;
                this.b = true;
                Point point4 = org.telegram.messenger.g0.q;
                int i14 = point4.x > point4.y ? 3 : 5;
                hb0Var4.setItemCount(i14);
                b4Var.setItemCount(i14);
                c4Var.setItemCount(i14);
                hb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                b4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 5:
                g4 g4Var = (g4) this.d;
                f4 f4Var = (f4) this.c;
                this.b = true;
                Point point5 = org.telegram.messenger.g0.q;
                int i15 = point5.x > point5.y ? 3 : 5;
                f4Var.setItemCount(i15);
                f4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                g4Var.setItemCount(i15);
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                hb0 hb0Var5 = this.e;
                hb0Var5.setItemCount(i15);
                hb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 6:
                hb0 hb0Var6 = (hb0) this.d;
                hb0 hb0Var7 = (hb0) this.c;
                this.b = true;
                Point point6 = org.telegram.messenger.g0.q;
                int i16 = point6.x > point6.y ? 3 : 5;
                hb0Var7.setItemCount(i16);
                hb0Var6.setItemCount(i16);
                hb0 hb0Var8 = this.e;
                hb0Var8.setItemCount(i16);
                hb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                hb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                hb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 7:
                n4 n4Var = (n4) this.e;
                m4 m4Var = (m4) this.d;
                hb0 hb0Var9 = (hb0) this.c;
                this.b = true;
                Point point7 = org.telegram.messenger.g0.q;
                int i17 = point7.x > point7.y ? 3 : 5;
                hb0Var9.setItemCount(i17);
                m4Var.setItemCount(i17);
                n4Var.setItemCount(i17);
                hb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                m4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
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
    public o3(Context context, n3 n3Var) {
        super(context);
        this.a = 0;
        this.e = n3Var;
        this.c = new my0(":", 18.0f, null);
    }
}
