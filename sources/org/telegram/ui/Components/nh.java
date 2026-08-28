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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nh extends wk0 {
    public final /* synthetic */ int T2;
    public final Paint U2;
    public final Paint V2;
    public boolean W2;
    public boolean X2;
    public final Object Y2;
    public final Object Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(Context context, int i9) {
        super(context, null);
        this.T2 = i9;
        switch (i9) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.U2 = paint;
                Paint paint2 = new Paint(1);
                this.V2 = paint2;
                this.Y2 = new y5(this);
                this.Z2 = new y5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                break;
            default:
                gr grVar = gr.h;
                this.Y2 = new td.a(this, grVar, 320L);
                this.Z2 = new td.a(this, grVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.U2 = paint3;
                Paint paint4 = new Paint(1);
                this.V2 = paint4;
                paint3.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint4.setShader(linearGradient2);
                paint4.setXfermode(new PorterDuffXfermode(mode));
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                this.X2 = false;
                this.W2 = false;
                super.dispatchDraw(canvas);
                ((td.a) this.Y2).a(this.W2, true);
                ((td.a) this.Z2).a(this.X2, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int d = (int) (((y5) this.Y2).d(this.W2 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint = this.U2;
                paint.setAlpha(d);
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                int d9 = (int) (((y5) this.Z2).d(this.X2 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint2 = this.V2;
                paint2.setAlpha(d9);
                canvas.save();
                canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T2) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z10 = true;
                boolean z11 = x10 < ((float) AndroidUtilities.dp(10.0f));
                boolean z12 = width > ((float) (getMeasuredWidth() - AndroidUtilities.dp(10.0f)));
                if (!z11 && !z12) {
                    z10 = false;
                }
                this.W2 |= z11;
                this.X2 |= z12;
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
                    canvas.translate(j3.r0.C(1.0f, ((td.a) this.Y2).e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.U2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z12) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(e2.c.z(1.0f, ((td.a) this.Z2).e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.V2);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i9, int i10) {
        switch (this.T2) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.W2 || canScrollVertically2 != this.X2) {
                    this.W2 = canScrollVertically;
                    this.X2 = canScrollVertically2;
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.T2) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt instanceof fi) {
                        f10 = ((fi) childAt).a.c() + f10;
                    }
                }
                int floor = (size <= f10 || childCount <= 0) ? 0 : (int) Math.floor((r1 - f10) / childCount);
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof fi) {
                        ((fi) childAt2).a.setAdditionalWidth(floor);
                    }
                }
                super.onMeasure(i9, i10);
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }
}
