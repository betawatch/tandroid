package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uh extends nm0 {
    public final /* synthetic */ int f3;
    public final Paint g3;
    public final Paint h3;
    public boolean i3;
    public boolean j3;
    public final Object k3;
    public final Object l3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(Context context, int i10) {
        super(context, null);
        this.f3 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.g3 = paint;
                Paint paint2 = new Paint(1);
                this.h3 = paint2;
                this.k3 = new h6(this);
                this.l3 = new h6(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                break;
            default:
                ds dsVar = ds.h;
                this.k3 = new oe.b(this, dsVar, 320L);
                this.l3 = new oe.b(this, dsVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
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

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                this.j3 = false;
                this.i3 = false;
                super.dispatchDraw(canvas);
                ((oe.b) this.k3).a(this.i3, true);
                ((oe.b) this.l3).a(this.j3, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int d = (int) (((h6) this.k3).d(this.i3 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint = this.g3;
                paint.setAlpha(d);
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                int d10 = (int) (((h6) this.l3).d(this.j3 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint2 = this.h3;
                paint2.setAlpha(d10);
                canvas.save();
                canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f3) {
            case 0:
                float x9 = view.getX();
                float width = view.getWidth() + x9;
                boolean z10 = true;
                boolean z11 = x9 < ((float) AndroidUtilities.dp(10.0f));
                boolean z12 = width > ((float) (getMeasuredWidth() - AndroidUtilities.dp(10.0f)));
                if (!z11 && !z12) {
                    z10 = false;
                }
                this.i3 |= z11;
                this.j3 |= z12;
                canvas.save();
                if (z10) {
                    canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z11) {
                    float dp = AndroidUtilities.dp(11.0f);
                    canvas.saveLayer(dp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(ic.a.d(1.0f, ((oe.b) this.k3).e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.g3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z12) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(c3.h0.z(1.0f, ((oe.b) this.l3).e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
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
    public void l0(int i10) {
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

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.f3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f7 = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof oi) {
                        f7 = ((oi) childAt).a.d() + f7;
                    }
                }
                int floor = (size <= f7 || childCount <= 0) ? 0 : (int) Math.floor((r1 - f7) / childCount);
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 instanceof oi) {
                        ((oi) childAt2).a.setAdditionalWidth(floor);
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
