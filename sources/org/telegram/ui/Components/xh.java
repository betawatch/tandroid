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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xh extends mm0 {
    public final /* synthetic */ int Y2;
    public final Paint Z2;
    public final Paint a3;
    public boolean b3;
    public boolean c3;
    public final Object d3;
    public final Object e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(Context context, int i10) {
        super(context, null);
        this.Y2 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.Z2 = paint;
                Paint paint2 = new Paint(1);
                this.a3 = paint2;
                this.d3 = new f6(this);
                this.e3 = new f6(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                break;
            default:
                bs bsVar = bs.h;
                this.d3 = new ne.b(this, bsVar, 320L);
                this.e3 = new ne.b(this, bsVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.Z2 = paint3;
                Paint paint4 = new Paint(1);
                this.a3 = paint4;
                paint3.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint4.setShader(linearGradient2);
                paint4.setXfermode(new PorterDuffXfermode(mode));
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.Y2) {
            case 0:
                this.c3 = false;
                this.b3 = false;
                super.dispatchDraw(canvas);
                ((ne.b) this.d3).a(this.b3, true);
                ((ne.b) this.e3).a(this.c3, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int d = (int) (((f6) this.d3).d(this.b3 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint = this.Z2;
                paint.setAlpha(d);
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                int d10 = (int) (((f6) this.e3).d(this.c3 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint2 = this.a3;
                paint2.setAlpha(d10);
                canvas.save();
                canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.Y2) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z10 = true;
                boolean z11 = x10 < ((float) AndroidUtilities.dp(10.0f));
                boolean z12 = width > ((float) (getMeasuredWidth() - AndroidUtilities.dp(10.0f)));
                if (!z11 && !z12) {
                    z10 = false;
                }
                this.b3 |= z11;
                this.c3 |= z12;
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
                    canvas.translate(com.google.android.gms.internal.play_billing.k3.D(1.0f, ((ne.b) this.d3).e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.Z2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z12) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(com.google.android.gms.internal.play_billing.k3.y(1.0f, ((ne.b) this.e3).e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.a3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        switch (this.Y2) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.b3 || canScrollVertically2 != this.c3) {
                    this.b3 = canScrollVertically;
                    this.c3 = canScrollVertically2;
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.Y2) {
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
