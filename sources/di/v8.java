package di;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v8 extends View {
    public int a;
    public int b;
    public final Matrix c;
    public final Paint[] d;
    public final org.telegram.ui.Components.v5 e;
    public boolean f;
    public int h;
    public final Drawable[] n;
    public final float[] r;
    public boolean s;
    public final Paint w;
    public final Path x;
    public final hc y;

    public v8(Context context) {
        super(context);
        this.c = new Matrix();
        this.d = new Paint[]{new Paint(1), new Paint(1)};
        this.e = new org.telegram.ui.Components.v5(this, 0L, 260L, wq.h);
        this.n = new Drawable[2];
        this.r = new float[2];
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new hc(this, 0.6f, 5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z9, y6 y6Var, boolean z10) {
        fi.q8 q8Var;
        this.s = z9;
        this.f = true;
        if (y6Var == null || (q8Var = y6Var.c.E0) == null) {
            this.f = false;
        } else {
            int i7 = q8Var.a;
            org.telegram.ui.Components.v5 v5Var = this.e;
            if (i7 == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                v5Var.f(z10, !z10);
            } else if (i7 == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                v5Var.f(z10, !z10);
            } else if (i7 == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                v5Var.f(z10, !z10);
            } else if (z9) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                v5Var.f(z10, !z10);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void b(boolean z9, TL_stories.StoryItem storyItem, boolean z10) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.s = z9;
        this.f = true;
        if (storyItem == null) {
            this.f = false;
        } else {
            boolean z11 = storyItem.close_friends;
            org.telegram.ui.Components.v5 v5Var = this.e;
            if (z11) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                v5Var.f(z10, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                v5Var.f(z10, true);
            } else if (storyItem.selected_contacts || (z9 && ((arrayList = storyItem.privacy) == null || arrayList.isEmpty()))) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                v5Var.f(z10, true);
            } else if (z9) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                v5Var.f(z10, true);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void c(float f10, int i7) {
        if (i7 == R.drawable.msg_stories_closefriends) {
            setContentDescription(id.M0(2131744532, null));
        } else if (i7 == R.drawable.msg_folders_private) {
            setContentDescription(id.M0(2131744530, null));
        } else if (i7 == R.drawable.msg_folders_groups) {
            setContentDescription(id.M0(2131744520, null));
        } else if (i7 == R.drawable.msg_folders_channels) {
            setContentDescription(id.M0(2131744528, null));
        }
        Drawable[] drawableArr = this.n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.r;
        fArr[1] = fArr[0];
        if (drawable == null || i7 != this.h) {
            Resources resources = getContext().getResources();
            this.h = i7;
            drawableArr[0] = resources.getDrawable(i7).mutate();
            drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fArr[0] = org.telegram.messenger.g0.N(f10);
            invalidate();
        }
    }

    public final void d(int i7, int i10) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.a == i7 && this.b == i10) {
            return;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        this.a = i7;
        this.b = i10;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
        char c10;
        float f11;
        if (this.f) {
            float N = this.s ? 0.0f : org.telegram.messenger.g0.N(7.0f);
            float N2 = this.s ? org.telegram.messenger.g0.N(43.0f) : org.telegram.messenger.g0.N(23.66f);
            float N3 = org.telegram.messenger.g0.N(23.66f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(com.google.android.recaptcha.internal.a.A(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, org.telegram.messenger.k5.a(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
            float a10 = this.y.a(0.075f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float e10 = this.e.e(false, 0.0f);
            Paint[] paintArr = this.d;
            if (e10 > 0.0f) {
                paintArr[1].setAlpha(qs.e4);
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
                c10 = 0;
                f11 = 12.0f;
            } else {
                float N4 = this.s ? org.telegram.messenger.g0.N(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable2 = drawableArr[1];
                int v = (int) org.telegram.messenger.camera.q.v(fArr[1], 2.0f, abs, N4);
                float centerY = rectF.centerY();
                float f12 = (fArr[1] / 2.0f) * abs;
                f10 = 0.5f;
                c10 = 0;
                f11 = 12.0f;
                drawable2.setBounds(v, (int) (centerY - f12), (int) (f12 + N4), (int) com.google.android.recaptcha.internal.a.c(fArr[1], 2.0f, abs, rectF.centerY()));
                drawableArr[1].draw(canvas);
            }
            if (drawableArr[c10] != null && e10 <= f10) {
                float N5 = this.s ? org.telegram.messenger.g0.N(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable3 = drawableArr[c10];
                int v10 = (int) org.telegram.messenger.camera.q.v(fArr[c10], 2.0f, abs, N5);
                float centerY2 = rectF.centerY();
                float f13 = (fArr[c10] / 2.0f) * abs;
                drawable3.setBounds(v10, (int) (centerY2 - f13), (int) (f13 + N5), (int) com.google.android.recaptcha.internal.a.c(fArr[c10], 2.0f, abs, rectF.centerY()));
                drawableArr[c10].draw(canvas);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.y.c(z9);
    }
}
