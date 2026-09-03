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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nh extends rl0 {
    public final /* synthetic */ int U2;
    public final Paint V2;
    public final Paint W2;
    public boolean X2;
    public boolean Y2;
    public final Object Z2;
    public final Object a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.V2 = paint;
                Paint paint2 = new Paint(1);
                this.W2 = paint2;
                this.Z2 = new z5(this);
                this.a3 = new z5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                break;
            default:
                mr mrVar = mr.h;
                this.Z2 = new xd.a(this, mrVar, 320L);
                this.a3 = new xd.a(this, mrVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.V2 = paint3;
                Paint paint4 = new Paint(1);
                this.W2 = paint4;
                paint3.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint4.setShader(linearGradient2);
                paint4.setXfermode(new PorterDuffXfermode(mode));
                break;
        }
    }

    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.U2) {
            case 0:
                this.Y2 = false;
                this.X2 = false;
                super.dispatchDraw(canvas);
                ((xd.a) this.Z2).a(this.X2, true);
                ((xd.a) this.a3).a(this.Y2, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int d = (int) (((z5) this.Z2).d(this.X2 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint = this.V2;
                paint.setAlpha(d);
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                int d10 = (int) (((z5) this.a3).d(this.Y2 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint2 = this.W2;
                paint2.setAlpha(d10);
                canvas.save();
                canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.U2) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z4 = true;
                boolean z10 = x10 < ((float) AndroidUtilities.dp(10.0f));
                boolean z11 = width > ((float) (getMeasuredWidth() - AndroidUtilities.dp(10.0f)));
                if (!z10 && !z11) {
                    z4 = false;
                }
                this.X2 |= z10;
                this.Y2 |= z11;
                canvas.save();
                if (z4) {
                    canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z10) {
                    float dp = AndroidUtilities.dp(11.0f);
                    canvas.saveLayer(dp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(org.telegram.ui.ai.c(1.0f, ((xd.a) this.Z2).e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.V2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(e2.c.w(1.0f, ((xd.a) this.a3).e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.W2);
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
        switch (this.U2) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.X2 || canScrollVertically2 != this.Y2) {
                    this.X2 = canScrollVertically;
                    this.Y2 = canScrollVertically2;
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.U2) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof gi) {
                        f10 = ((gi) childAt).a.c() + f10;
                    }
                }
                int floor = (size <= f10 || childCount <= 0) ? 0 : (int) Math.floor((r1 - f10) / childCount);
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 instanceof gi) {
                        ((gi) childAt2).a.setAdditionalWidth(floor);
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
