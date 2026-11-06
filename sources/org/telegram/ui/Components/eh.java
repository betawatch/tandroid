package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class eh extends pj0 {
    public final /* synthetic */ int e3;
    public final Paint f3;
    public final Paint g3;
    public boolean h3;
    public boolean i3;
    public final Object j3;
    public final Object k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(Context context, int i7) {
        super(context, null);
        this.e3 = i7;
        switch (i7) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.f3 = paint;
                Paint paint2 = new Paint(1);
                this.g3 = paint2;
                this.j3 = new w5(this);
                this.k3 = new w5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                break;
            default:
                xq xqVar = xq.h;
                this.j3 = new te.a(this, xqVar, 320L);
                this.k3 = new te.a(this, xqVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
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

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                this.i3 = false;
                this.h3 = false;
                super.dispatchDraw(canvas);
                ((te.a) this.j3).a(this.h3, true);
                ((te.a) this.k3).a(this.i3, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int e10 = (int) (((w5) this.j3).e(false, this.h3 ? 1.0f : 0.0f) * 255.0f);
                Paint paint = this.f3;
                paint.setAlpha(e10);
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f), paint);
                int e11 = (int) (((w5) this.k3).e(false, this.i3 ? 1.0f : 0.0f) * 255.0f);
                Paint paint2 = this.g3;
                paint2.setAlpha(e11);
                canvas.save();
                canvas.translate(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.e3) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z9 = true;
                boolean z10 = x10 < ((float) org.telegram.messenger.g0.L(10.0f));
                boolean z11 = width > ((float) (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)));
                if (!z10 && !z11) {
                    z9 = false;
                }
                this.h3 |= z10;
                this.i3 |= z11;
                canvas.save();
                if (z9) {
                    canvas.clipRect(org.telegram.messenger.g0.L(19.0f), 0, getMeasuredWidth() - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                if (z10) {
                    float L = org.telegram.messenger.g0.L(11.0f);
                    canvas.saveLayer(L, getPaddingTop(), org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j3);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.v(1.0f, ((te.a) this.j3).e, org.telegram.messenger.g0.L(8.0f), L), 0.0f);
                    canvas.drawPaint(this.f3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - org.telegram.messenger.g0.L(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j3);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, ((te.a) this.k3).e, org.telegram.messenger.g0.L(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.g3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i7) {
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

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.e3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt instanceof yh) {
                        f10 = ((yh) childAt).a.d() + f10;
                    }
                }
                int floor = (size <= f10 || childCount <= 0) ? 0 : (int) Math.floor((r1 - f10) / childCount);
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof yh) {
                        ((yh) childAt2).a.setAdditionalWidth(floor);
                    }
                }
                super.onMeasure(i7, i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }
}
