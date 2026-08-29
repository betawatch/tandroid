package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f3 extends k {
    public final int m0;
    public boolean n0;
    public final d6 o0;
    public final bv0 p0;
    public final TextureView q0;
    public final Bitmap r0;
    public final Rect s0;
    public final Rect t0;
    public float u0;
    public final Path v0;
    public boolean w0;
    public boolean x0;
    public final d6 y0;

    public f3(Context context, PointF pointF, bv0 bv0Var, String str) {
        super(context, pointF);
        this.m0 = -1;
        this.n0 = false;
        Rect rect = new Rect();
        this.s0 = rect;
        this.t0 = new Rect();
        this.u0 = 1.0f;
        this.v0 = new Path();
        this.w0 = true;
        this.x0 = true;
        jr jrVar = jr.h;
        this.y0 = new d6(this, 0L, 350L, jrVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.p0 = bv0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.r0 = decodeFile;
        if (decodeFile != null) {
            this.u0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.q0 = textureView;
        addView(textureView, f6.c(-1.0f, -1));
        this.o0 = new d6(this, 0L, 500L, jrVar);
        k();
        setWillNotDraw(false);
    }

    @Override // bg.k
    public final j a() {
        return new d3(this, getContext());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        if (!this.w0) {
            return false;
        }
        if (view != this.q0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float e10 = this.o0.e(this.n0);
        canvas.scale(1.0f - (e10 * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, org.telegram.messenger.x3.y(1.0f, e10, 4.0f * e10, 0.25f));
        float e11 = this.y0.e(this.x0);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Rect rect2 = this.s0;
        Rect rect3 = this.t0;
        Bitmap bitmap2 = this.r0;
        Path path2 = this.v0;
        if (e11 < 1.0f) {
            rect = rect3;
            bitmap = bitmap2;
            canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), 128, 31);
            path2.rewind();
            path = path2;
            path.addCircle(width, height, min, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
        } else {
            rect = rect3;
            bitmap = bitmap2;
            path = path2;
        }
        canvas.save();
        path.rewind();
        path.addCircle(width, height, min * e11, Path.Direction.CW);
        canvas.clipPath(path);
        if (bitmap != null) {
            rect.set(0, 0, view.getWidth(), view.getHeight());
            canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
        }
        boolean drawChild = ((getParent() instanceof d) && ((d) getParent()).a) ? true : super.drawChild(canvas, view, j10);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    public int getAnchor() {
        return this.m0;
    }

    public bv0 getBaseSize() {
        return this.p0;
    }

    @Override // bg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override // bg.k
    public final void k() {
        bv0 bv0Var = this.p0;
        float f9 = bv0Var.a / 2.0f;
        float f10 = bv0Var.b / 2.0f;
        setX(getPositionX() - f9);
        setY(getPositionY() - f10);
        m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.q0;
        if (textureView != null) {
            int measuredHeight = ((i13 - i11) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i12 - i10) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        bv0 bv0Var = this.p0;
        int i12 = (int) bv0Var.a;
        int i13 = (int) bv0Var.b;
        TextureView textureView = this.q0;
        if (textureView != null) {
            float f9 = this.u0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f9 >= 1.0f ? (int) (f9 * i13) : i12, TLObject.FLAG_30);
            float f10 = this.u0;
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f10 >= 1.0f ? i13 : (int) (i12 / f10), TLObject.FLAG_30));
        }
        setMeasuredDimension(i12, i13);
    }

    public void setDraw(boolean z10) {
        if (this.w0 != z10) {
            this.w0 = z10;
            invalidate();
        }
    }
}
