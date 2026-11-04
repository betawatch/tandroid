package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bh extends tj0 {
    public final /* synthetic */ int f3;
    public final Paint g3;
    public final Paint h3;
    public boolean i3;
    public boolean j3;
    public final Object k3;
    public final Object l3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(Context context, int i3) {
        super(context, null);
        this.f3 = i3;
        switch (i3) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.g3 = paint;
                Paint paint2 = new Paint(1);
                this.h3 = paint2;
                this.k3 = new u5(this);
                this.l3 = new u5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                break;
            default:
                xq xqVar = xq.h;
                this.k3 = new qe.a(this, xqVar, 320L);
                this.l3 = new qe.a(this, xqVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.g3 = paint3;
                Paint paint4 = new Paint(1);
                this.h3 = paint4;
                paint3.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint4.setShader(linearGradient2);
                paint4.setXfermode(new PorterDuffXfermode(mode));
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                this.j3 = false;
                this.i3 = false;
                super.dispatchDraw(canvas);
                ((qe.a) this.k3).a(this.i3, true);
                ((qe.a) this.l3).a(this.j3, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int e10 = (int) (((u5) this.k3).e(false, this.i3 ? 1.0f : 0.0f) * 255.0f);
                Paint paint = this.g3;
                paint.setAlpha(e10);
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f), paint);
                int e11 = (int) (((u5) this.l3).e(false, this.j3 ? 1.0f : 0.0f) * 255.0f);
                Paint paint2 = this.h3;
                paint2.setAlpha(e11);
                canvas.save();
                canvas.translate(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f3) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z10 = true;
                boolean z11 = x10 < ((float) org.telegram.messenger.g0.L(10.0f));
                boolean z12 = width > ((float) (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)));
                if (!z11 && !z12) {
                    z10 = false;
                }
                this.i3 |= z11;
                this.j3 |= z12;
                canvas.save();
                if (z10) {
                    canvas.clipRect(org.telegram.messenger.g0.L(19.0f), 0, getMeasuredWidth() - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z11) {
                    float L = org.telegram.messenger.g0.L(11.0f);
                    canvas.saveLayer(L, getPaddingTop(), org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(a1.g.D(1.0f, ((qe.a) this.k3).e, org.telegram.messenger.g0.L(8.0f), L), 0.0f);
                    canvas.drawPaint(this.g3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z12) {
                    float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - org.telegram.messenger.g0.L(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.y(1.0f, ((qe.a) this.l3).e, org.telegram.messenger.g0.L(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.h3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i3) {
        switch (this.f3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.i3 || canScrollVertically2 != this.j3) {
                    this.i3 = canScrollVertically;
                    this.j3 = canScrollVertically2;
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.f3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt instanceof wh) {
                        f10 = ((wh) childAt).a.d() + f10;
                    }
                }
                int floor = (size <= f10 || childCount <= 0) ? 0 : (int) Math.floor((r1 - f10) / childCount);
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof wh) {
                        ((wh) childAt2).a.setAdditionalWidth(floor);
                    }
                }
                super.onMeasure(i3, i10);
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }
}
