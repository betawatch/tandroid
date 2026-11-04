package ei;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u8 extends View {
    public int a;
    public int b;
    public final Matrix c;
    public final Paint[] d;
    public final org.telegram.ui.Components.u5 e;
    public boolean f;
    public int h;
    public final Drawable[] n;
    public final float[] r;
    public boolean s;
    public final Paint w;
    public final Path x;
    public final gc y;

    public u8(Context context) {
        super(context);
        this.c = new Matrix();
        this.d = new Paint[]{new Paint(1), new Paint(1)};
        this.e = new org.telegram.ui.Components.u5(this, 0L, 260L, xq.h);
        this.n = new Drawable[2];
        this.r = new float[2];
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new gc(this, 0.6f, 5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z10, y6 y6Var, boolean z11) {
        gi.r8 r8Var;
        this.s = z10;
        this.f = true;
        if (y6Var == null || (r8Var = y6Var.c.E0) == null) {
            this.f = false;
        } else {
            int i3 = r8Var.a;
            org.telegram.ui.Components.u5 u5Var = this.e;
            if (i3 == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                u5Var.f(z11, !z11);
            } else if (i3 == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                u5Var.f(z11, !z11);
            } else if (i3 == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                u5Var.f(z11, !z11);
            } else if (z10) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                u5Var.f(z11, !z11);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void b(boolean z10, TL_stories.StoryItem storyItem, boolean z11) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.s = z10;
        this.f = true;
        if (storyItem == null) {
            this.f = false;
        } else {
            boolean z12 = storyItem.close_friends;
            org.telegram.ui.Components.u5 u5Var = this.e;
            if (z12) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                u5Var.f(z11, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                u5Var.f(z11, true);
            } else if (storyItem.selected_contacts || (z10 && ((arrayList = storyItem.privacy) == null || arrayList.isEmpty()))) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                u5Var.f(z11, true);
            } else if (z10) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                u5Var.f(z11, true);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void c(float f10, int i3) {
        if (i3 == R.drawable.msg_stories_closefriends) {
            setContentDescription(bd.M0(2131744542, null));
        } else if (i3 == R.drawable.msg_folders_private) {
            setContentDescription(bd.M0(2131744540, null));
        } else if (i3 == R.drawable.msg_folders_groups) {
            setContentDescription(bd.M0(2131744530, null));
        } else if (i3 == R.drawable.msg_folders_channels) {
            setContentDescription(bd.M0(2131744538, null));
        }
        Drawable[] drawableArr = this.n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.r;
        fArr[1] = fArr[0];
        if (drawable == null || i3 != this.h) {
            Resources resources = getContext().getResources();
            this.h = i3;
            drawableArr[0] = resources.getDrawable(i3).mutate();
            drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fArr[0] = org.telegram.messenger.g0.N(f10);
            invalidate();
        }
    }

    public final void d(int i3, int i10) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.a == i3 && this.b == i10) {
            return;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        this.a = i3;
        this.b = i10;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{i3, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.postTranslate(0.0f, org.telegram.messenger.g0.L(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        return (getWidth() / 2.0f) + getX() + (this.s ? 0 : org.telegram.messenger.g0.L(14.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        char c2;
        float f11;
        if (this.f) {
            float N = this.s ? 0.0f : org.telegram.messenger.g0.N(7.0f);
            float N2 = this.s ? org.telegram.messenger.g0.N(43.0f) : org.telegram.messenger.g0.N(23.66f);
            float N3 = org.telegram.messenger.g0.N(23.66f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(com.google.android.recaptcha.internal.a.z(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, org.telegram.messenger.k5.a(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
            float a10 = this.y.a(0.075f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float e10 = this.e.e(false, 0.0f);
            Paint[] paintArr = this.d;
            if (e10 > 0.0f) {
                paintArr[1].setAlpha(hs.e4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paintArr[1]);
            }
            if (e10 < 1.0f) {
                paintArr[0].setAlpha((int) ((1.0f - e10) * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paintArr[0]);
            }
            float abs = Math.abs(e10 - 0.5f) + 0.5f;
            Drawable[] drawableArr = this.n;
            Drawable drawable = drawableArr[1];
            float[] fArr = this.r;
            if (drawable == null || e10 <= 0.5f) {
                f10 = 0.5f;
                c2 = 0;
                f11 = 12.0f;
            } else {
                float N4 = this.s ? org.telegram.messenger.g0.N(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable2 = drawableArr[1];
                int v = (int) org.telegram.messenger.camera.q.v(fArr[1], 2.0f, abs, N4);
                float centerY = rectF.centerY();
                float f12 = (fArr[1] / 2.0f) * abs;
                f10 = 0.5f;
                c2 = 0;
                f11 = 12.0f;
                drawable2.setBounds(v, (int) (centerY - f12), (int) (f12 + N4), (int) a1.g.A(fArr[1], 2.0f, abs, rectF.centerY()));
                drawableArr[1].draw(canvas);
            }
            if (drawableArr[c2] != null && e10 <= f10) {
                float N5 = this.s ? org.telegram.messenger.g0.N(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable3 = drawableArr[c2];
                int v10 = (int) org.telegram.messenger.camera.q.v(fArr[c2], 2.0f, abs, N5);
                float centerY2 = rectF.centerY();
                float f13 = (fArr[c2] / 2.0f) * abs;
                drawable3.setBounds(v10, (int) (centerY2 - f13), (int) (f13 + N5), (int) a1.g.A(fArr[c2], 2.0f, abs, rectF.centerY()));
                drawableArr[c2].draw(canvas);
            }
            if (this.s) {
                Path path = this.x;
                path.rewind();
                path.moveTo(rectF.right - org.telegram.messenger.g0.N(15.66f), rectF.centerY() - org.telegram.messenger.g0.N(1.33f));
                path.lineTo(rectF.right - org.telegram.messenger.g0.N(f11), org.telegram.messenger.g0.N(2.33f) + rectF.centerY());
                path.lineTo(rectF.right - org.telegram.messenger.g0.N(8.16f), rectF.centerY() - org.telegram.messenger.g0.N(1.33f));
                float N6 = org.telegram.messenger.g0.N(1.33f);
                Paint paint = this.w;
                paint.setStrokeWidth(N6);
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.y.c(z10);
    }
}
