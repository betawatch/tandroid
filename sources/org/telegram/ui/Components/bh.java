package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bh extends tk0 {
    public final /* synthetic */ int e3;
    public final Paint f3;
    public final Paint g3;
    public boolean h3;
    public boolean i3;
    public final Object j3;
    public final Object k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(Context context, int i10) {
        super(context, null);
        this.e3 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.f3 = paint;
                Paint paint2 = new Paint(1);
                this.g3 = paint2;
                this.j3 = new t5(this);
                this.k3 = new t5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                break;
            default:
                gr grVar = gr.h;
                this.j3 = new fe.b(this, grVar, 320L);
                this.k3 = new fe.b(this, grVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.f3 = paint3;
                Paint paint4 = new Paint(1);
                this.g3 = paint4;
                paint3.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint4.setShader(linearGradient2);
                paint4.setXfermode(new PorterDuffXfermode(mode));
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                this.i3 = false;
                this.h3 = false;
                super.dispatchDraw(canvas);
                ((fe.b) this.j3).a(this.h3, true);
                ((fe.b) this.k3).a(this.i3, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int e = (int) (((t5) this.j3).e(false, this.h3 ? 1.0f : 0.0f) * 255.0f);
                Paint paint = this.f3;
                paint.setAlpha(e);
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(8.0f), paint);
                int e7 = (int) (((t5) this.k3).e(false, this.i3 ? 1.0f : 0.0f) * 255.0f);
                Paint paint2 = this.g3;
                paint2.setAlpha(e7);
                canvas.save();
                canvas.translate(0.0f, getHeight() - org.telegram.messenger.i0.L(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.e3) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z10 = true;
                boolean z11 = x10 < ((float) org.telegram.messenger.i0.L(10.0f));
                boolean z12 = width > ((float) (getMeasuredWidth() - org.telegram.messenger.i0.L(10.0f)));
                if (!z11 && !z12) {
                    z10 = false;
                }
                this.h3 |= z11;
                this.i3 |= z12;
                canvas.save();
                if (z10) {
                    canvas.clipRect(org.telegram.messenger.i0.L(19.0f), 0, getMeasuredWidth() - org.telegram.messenger.i0.L(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z11) {
                    float L = org.telegram.messenger.i0.L(11.0f);
                    canvas.saveLayer(L, getPaddingTop(), org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(sc.e.z(1.0f, ((fe.b) this.j3).e, org.telegram.messenger.i0.L(8.0f), L), 0.0f);
                    canvas.drawPaint(this.f3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z12) {
                    float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - org.telegram.messenger.i0.L(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(c3.i0.z(1.0f, ((fe.b) this.k3).e, org.telegram.messenger.i0.L(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.g3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i10) {
        switch (this.e3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.h3 || canScrollVertically2 != this.i3) {
                    this.h3 = canScrollVertically;
                    this.i3 = canScrollVertically2;
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f7 = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof xh) {
                        f7 = ((xh) childAt).a.d() + f7;
                    }
                }
                int floor = (size <= f7 || childCount <= 0) ? 0 : (int) Math.floor((r1 - f7) / childCount);
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 instanceof xh) {
                        ((xh) childAt2).a.setAdditionalWidth(floor);
                    }
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
