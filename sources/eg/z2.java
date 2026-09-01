package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z2 extends j {
    public final int n0;
    public boolean o0;
    public final z5 p0;
    public final kv0 q0;
    public final TextureView r0;
    public final Bitmap s0;
    public final Rect t0;
    public final Rect u0;
    public float v0;
    public final Path w0;
    public boolean x0;
    public boolean y0;
    public final z5 z0;

    public z2(Context context, PointF pointF, kv0 kv0Var, String str) {
        super(context, pointF);
        this.n0 = -1;
        this.o0 = false;
        Rect rect = new Rect();
        this.t0 = rect;
        this.u0 = new Rect();
        this.v0 = 1.0f;
        this.w0 = new Path();
        this.x0 = true;
        this.y0 = true;
        pr prVar = pr.h;
        this.z0 = new z5(this, 0L, 350L, prVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.q0 = kv0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.s0 = decodeFile;
        if (decodeFile != null) {
            this.v0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.r0 = textureView;
        addView(textureView, c6.c(-1.0f, -1));
        this.p0 = new z5(this, 0L, 500L, prVar);
        k();
        setWillNotDraw(false);
    }

    @Override // eg.j
    public final i a() {
        return new x2(this, getContext());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        if (!this.x0) {
            return false;
        }
        if (view != this.r0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float e6 = this.p0.e(this.o0);
        canvas.scale(1.0f - (e6 * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e6, 4.0f * e6, 0.25f));
        float e10 = this.z0.e(this.y0);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Rect rect2 = this.t0;
        Rect rect3 = this.u0;
        Bitmap bitmap2 = this.s0;
        Path path2 = this.w0;
        if (e10 < 1.0f) {
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
        path.addCircle(width, height, min * e10, Path.Direction.CW);
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
        return this.n0;
    }

    public kv0 getBaseSize() {
        return this.q0;
    }

    @Override // eg.j
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new tk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new tk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override // eg.j
    public final void k() {
        kv0 kv0Var = this.q0;
        float f10 = kv0Var.a / 2.0f;
        float f11 = kv0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.r0;
        if (textureView != null) {
            int measuredHeight = ((i13 - i11) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i12 - i10) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        kv0 kv0Var = this.q0;
        int i12 = (int) kv0Var.a;
        int i13 = (int) kv0Var.b;
        TextureView textureView = this.r0;
        if (textureView != null) {
            float f10 = this.v0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f10 >= 1.0f ? (int) (f10 * i13) : i12, TLObject.FLAG_30);
            float f11 = this.v0;
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f11 >= 1.0f ? i13 : (int) (i12 / f11), TLObject.FLAG_30));
        }
        setMeasuredDimension(i12, i13);
    }

    public void setDraw(boolean z4) {
        if (this.x0 != z4) {
            this.x0 = z4;
            invalidate();
        }
    }
}
