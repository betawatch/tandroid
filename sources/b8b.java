// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class b8b extends View {
    public int a;
    public int b;
    public final Matrix c;
    public final Paint[] d;
    public final ln e;
    public boolean f;
    public int h;
    public final Drawable[] n;
    public final float[] r;
    public boolean s;
    public final Paint w;
    public final Path x;
    public final u51 y;

    public b8b(Context context) {
        super(context);
        this.c = new Matrix();
        this.d = new Paint[]{new Paint(1), new Paint(1)};
        this.e = new ln(this, 0L, 260L, d53.h);
        this.n = new Drawable[2];
        this.r = new float[2];
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new u51(this, 0.6f, 5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z, g4b g4bVar, boolean z2) {
        y7b y7bVar;
        this.s = z;
        this.f = true;
        if (g4bVar == null || (y7bVar = g4bVar.c.E0) == null) {
            this.f = false;
        } else {
            int i = y7bVar.a;
            ln lnVar = this.e;
            if (i == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                lnVar.f(z2, !z2);
            } else if (i == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                lnVar.f(z2, !z2);
            } else if (i == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                lnVar.f(z2, !z2);
            } else if (z) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                lnVar.f(z2, !z2);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void b(boolean z, TL_stories.StoryItem storyItem, boolean z2) {
        this.s = z;
        this.f = true;
        if (storyItem == null) {
            this.f = false;
        } else {
            boolean z3 = storyItem.close_friends;
            ln lnVar = this.e;
            if (z3) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                lnVar.f(z2, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                lnVar.f(z2, true);
            } else {
                if (!storyItem.selected_contacts) {
                    if (z) {
                        ArrayList<TLRPC.PrivacyRule> arrayList = storyItem.privacy;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            c(17.33f, R.drawable.msg_folders_channels);
                            d(-15292942, -15630089);
                            lnVar.f(z2, true);
                        }
                    } else {
                        this.f = false;
                    }
                }
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                lnVar.f(z2, true);
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void c(float f, int i) {
        if (i == R.drawable.msg_stories_closefriends) {
            setContentDescription(jb6.M0(2131744218, null));
        } else if (i == R.drawable.msg_folders_private) {
            setContentDescription(jb6.M0(2131744216, null));
        } else if (i == R.drawable.msg_folders_groups) {
            setContentDescription(jb6.M0(2131744206, null));
        } else if (i == R.drawable.msg_folders_channels) {
            setContentDescription(jb6.M0(2131744214, null));
        }
        Drawable[] drawableArr = this.n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.r;
        fArr[1] = fArr[0];
        if (drawable == null || i != this.h) {
            Resources resources = getContext().getResources();
            this.h = i;
            drawableArr[0] = resources.getDrawable(i).mutate();
            drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fArr[0] = gm.N(f);
            invalidate();
        }
    }

    public final void d(int i, int i2) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.a == i && this.b == i2) {
            return;
        }
        float L = gm.L(23.0f);
        this.a = i;
        this.b = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.postTranslate(0.0f, gm.L(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        return (getWidth() / 2.0f) + getX() + (this.s ? 0 : gm.L(14.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        char c;
        float f2;
        if (this.f) {
            float N = this.s ? 0.0f : gm.N(7.0f);
            float N2 = this.s ? gm.N(43.0f) : gm.N(23.66f);
            float N3 = gm.N(23.66f);
            RectF rectF = gm.P;
            rectF.set(aq1.z(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, td4.e(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
            float a = this.y.a(0.075f);
            canvas.save();
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            float e = this.e.e(false, 0.0f);
            Paint[] paintArr = this.d;
            if (e > 0.0f) {
                paintArr[1].setAlpha(nm7.d4);
                canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), paintArr[1]);
            }
            if (e < 1.0f) {
                paintArr[0].setAlpha((int) ((1.0f - e) * 255.0f));
                canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), paintArr[0]);
            }
            float abs = Math.abs(e - 0.5f) + 0.5f;
            Drawable[] drawableArr = this.n;
            Drawable drawable = drawableArr[1];
            float[] fArr = this.r;
            if (drawable == null || e <= 0.5f) {
                f = 0.5f;
                c = 0;
                f2 = 12.0f;
            } else {
                float N4 = this.s ? gm.N(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable2 = drawableArr[1];
                int x = (int) hg9.x(fArr[1], 2.0f, abs, N4);
                float centerY = rectF.centerY();
                float f3 = (fArr[1] / 2.0f) * abs;
                f = 0.5f;
                c = 0;
                f2 = 12.0f;
                drawable2.setBounds(x, (int) (centerY - f3), (int) (f3 + N4), (int) b10.A(fArr[1], 2.0f, abs, rectF.centerY()));
                drawableArr[1].draw(canvas);
            }
            if (drawableArr[c] != null && e <= f) {
                float N5 = this.s ? gm.N(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable3 = drawableArr[c];
                int x2 = (int) hg9.x(fArr[c], 2.0f, abs, N5);
                float centerY2 = rectF.centerY();
                float f4 = (fArr[c] / 2.0f) * abs;
                drawable3.setBounds(x2, (int) (centerY2 - f4), (int) (f4 + N5), (int) b10.A(fArr[c], 2.0f, abs, rectF.centerY()));
                drawableArr[c].draw(canvas);
            }
            if (this.s) {
                Path path = this.x;
                path.rewind();
                path.moveTo(rectF.right - gm.N(15.66f), rectF.centerY() - gm.N(1.33f));
                path.lineTo(rectF.right - gm.N(f2), gm.N(2.33f) + rectF.centerY());
                path.lineTo(rectF.right - gm.N(8.16f), rectF.centerY() - gm.N(1.33f));
                float N6 = gm.N(1.33f);
                Paint paint = this.w;
                paint.setStrokeWidth(N6);
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.y.c(z);
    }
}
