package di;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nt;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class r8 extends View {
    public final boolean D;
    public boolean E;
    public long F;
    public final Path G;
    public final s7 H;
    public final org.telegram.ui.Components.w5 a;
    public final TL_stories.MediaArea b;
    public final Paint c;
    public final Paint d;
    public LinearGradient e;
    public LinearGradient f;
    public final Matrix h;
    public final org.telegram.ui.Cells.y n;
    public final ic r;
    public final boolean s;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public r8(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z9 = true;
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(1174405119, 2, -1);
        this.n = h02;
        this.r = new ic(this);
        this.s = false;
        this.w = false;
        this.E = false;
        this.G = new Path();
        this.H = new s7(this, 4);
        this.b = mediaArea;
        boolean z10 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        this.s = z10 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue) || (mediaArea instanceof TL_stories.TL_mediaAreaUrl);
        this.w = z10 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue);
        if (!z10 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z9 = false;
        }
        this.x = z9;
        this.D = z9;
        this.y = z9;
        this.a = new org.telegram.ui.Components.w5(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        h02.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (this.D) {
            float innerRadius = getInnerRadius();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.G;
            path.rewind();
            path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            int width = getWidth();
            int height = getHeight();
            org.telegram.ui.Cells.y yVar = this.n;
            yVar.setBounds(0, 0, width, height);
            yVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.n;
        ic icVar = this.r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                icVar.f = new nt(1, view);
            }
            icVar.c(true);
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            icVar.c(false);
            yVar.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        return (!(getParent() instanceof View) || (mediaArea = this.b) == null || (mediaAreaCoordinates = mediaArea.coordinates) == null) ? getMeasuredHeight() * 0.2f : (mediaAreaCoordinates.flags & 1) != 0 ? (float) (((mediaAreaCoordinates.radius / 100.0d) * getWidth()) / getScaleX()) : getMeasuredHeight() * 0.2f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float innerRadius = getInnerRadius();
        b(canvas);
        if (this.w && this.E && this.e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = (System.currentTimeMillis() - this.F) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.E = false;
                return;
            }
            Matrix matrix = this.h;
            matrix.reset();
            matrix.postScale(measuredWidth / 40.0f, 1.0f);
            matrix.postTranslate(measuredWidth2, 0.0f);
            this.e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.e;
            Paint paint = this.c;
            paint.setShader(linearGradient);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float N = org.telegram.messenger.g0.N(1.5f);
            paint2.setStrokeWidth(N);
            float f10 = N / 2.0f;
            rectF.inset(f10, f10);
            float f11 = innerRadius - f10;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public void a(Canvas canvas) {
    }
}
