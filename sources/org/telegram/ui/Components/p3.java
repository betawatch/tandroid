package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ hb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(Context context, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7) {
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
                int i7 = org.telegram.ui.ActionBar.k6.G6;
                ((my0) this.c).c((getWidth() - ((my0) this.c).c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.id.c0) {
                    boolean z9 = ((o3) this.e).getValue() % 24 < 12;
                    if (this.b != z9 || ((my0) this.d) == null) {
                        this.b = z9;
                        this.d = new my0(z9 ? "AM" : "PM", 18.0f, null);
                    }
                    ((my0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i7, false), canvas);
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
                t3 t3Var = (t3) this.e;
                s3 s3Var = (s3) this.d;
                hb0 hb0Var = (hb0) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                hb0Var.setItemCount(i11);
                s3Var.setItemCount(i11);
                t3Var.setItemCount(i11);
                hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                s3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                t3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 2:
                v3 v3Var = (v3) this.e;
                u3 u3Var = (u3) this.d;
                hb0 hb0Var2 = (hb0) this.c;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                hb0Var2.setItemCount(i12);
                u3Var.setItemCount(i12);
                v3Var.setItemCount(i12);
                hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                u3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                v3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 3:
                a4 a4Var = (a4) this.e;
                z3 z3Var = (z3) this.d;
                hb0 hb0Var3 = (hb0) this.c;
                this.b = true;
                Point point3 = org.telegram.messenger.g0.q;
                int i13 = point3.x > point3.y ? 3 : 5;
                hb0Var3.setItemCount(i13);
                z3Var.setItemCount(i13);
                a4Var.setItemCount(i13);
                hb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                a4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 4:
                d4 d4Var = (d4) this.e;
                c4 c4Var = (c4) this.d;
                hb0 hb0Var4 = (hb0) this.c;
                this.b = true;
                Point point4 = org.telegram.messenger.g0.q;
                int i14 = point4.x > point4.y ? 3 : 5;
                hb0Var4.setItemCount(i14);
                c4Var.setItemCount(i14);
                d4Var.setItemCount(i14);
                hb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                d4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 5:
                h4 h4Var = (h4) this.d;
                g4 g4Var = (g4) this.c;
                this.b = true;
                Point point5 = org.telegram.messenger.g0.q;
                int i15 = point5.x > point5.y ? 3 : 5;
                g4Var.setItemCount(i15);
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                h4Var.setItemCount(i15);
                h4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
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
                o4 o4Var = (o4) this.e;
                n4 n4Var = (n4) this.d;
                hb0 hb0Var9 = (hb0) this.c;
                this.b = true;
                Point point7 = org.telegram.messenger.g0.q;
                int i17 = point7.x > point7.y ? 3 : 5;
                hb0Var9.setItemCount(i17);
                n4Var.setItemCount(i17);
                o4Var.setItemCount(i17);
                hb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                o4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
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
    public p3(Context context, o3 o3Var) {
        super(context);
        this.a = 0;
        this.e = o3Var;
        this.c = new my0(":", 18.0f, null);
    }
}
