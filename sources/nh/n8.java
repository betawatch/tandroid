package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class n8 extends View {
    public int a;
    public int b;
    public final Matrix c;
    public final Paint[] d;
    public final org.telegram.ui.Components.z5 e;
    public boolean f;
    public int h;
    public final Drawable[] n;
    public final float[] r;
    public boolean s;
    public final Paint v;
    public final Path w;
    public final rc x;

    public n8(Context context) {
        super(context);
        this.c = new Matrix();
        this.d = new Paint[]{new Paint(1), new Paint(1)};
        this.e = new org.telegram.ui.Components.z5(this, 0L, 260L, nr.h);
        this.n = new Drawable[2];
        this.r = new float[2];
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new rc(this, 0.6f, 5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z4, s6 s6Var, boolean z10) {
        ph.d8 d8Var;
        this.s = z4;
        this.f = true;
        if (s6Var == null || (d8Var = s6Var.c.E0) == null) {
            this.f = false;
        } else {
            int i10 = d8Var.a;
            org.telegram.ui.Components.z5 z5Var = this.e;
            if (i10 == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                z5Var.f(z10, !z10);
            } else if (i10 == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                z5Var.f(z10, !z10);
            } else if (i10 == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                z5Var.f(z10, !z10);
            } else if (z4) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                z5Var.f(z10, !z10);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void b(boolean z4, TL_stories.StoryItem storyItem, boolean z10) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.s = z4;
        this.f = true;
        if (storyItem == null) {
            this.f = false;
        } else {
            boolean z11 = storyItem.close_friends;
            org.telegram.ui.Components.z5 z5Var = this.e;
            if (z11) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                z5Var.f(z10, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                z5Var.f(z10, true);
            } else if (storyItem.selected_contacts || (z4 && ((arrayList = storyItem.privacy) == null || arrayList.isEmpty()))) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                z5Var.f(z10, true);
            } else if (z4) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                z5Var.f(z10, true);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void c(float f10, int i10) {
        if (i10 == R.drawable.msg_stories_closefriends) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends));
        } else if (i10 == R.drawable.msg_folders_private) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionContacts));
        } else if (i10 == R.drawable.msg_folders_groups) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts));
        } else if (i10 == R.drawable.msg_folders_channels) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionEveryone));
        }
        Drawable[] drawableArr = this.n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.r;
        fArr[1] = fArr[0];
        if (drawable == null || i10 != this.h) {
            Resources resources = getContext().getResources();
            this.h = i10;
            drawableArr[0] = resources.getDrawable(i10).mutate();
            drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fArr[0] = AndroidUtilities.dpf2(f10);
            invalidate();
        }
    }

    public final void d(int i10, int i11) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.a == i10 && this.b == i11) {
            return;
        }
        float dp = AndroidUtilities.dp(23.0f);
        this.a = i10;
        this.b = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.postTranslate(0.0f, AndroidUtilities.dp(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        return (getWidth() / 2.0f) + getX() + (this.s ? 0 : AndroidUtilities.dp(14.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        char c3;
        float f10;
        float f11;
        if (this.f) {
            float dpf2 = this.s ? 0.0f : AndroidUtilities.dpf2(7.0f);
            float dpf22 = this.s ? AndroidUtilities.dpf2(43.0f) : AndroidUtilities.dpf2(23.66f);
            float dpf23 = AndroidUtilities.dpf2(23.66f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(e2.c.x(getWidth(), dpf22, 2.0f, dpf2), (getHeight() - dpf23) / 2.0f, kh.a2.b(getWidth(), dpf22, 2.0f, dpf2), (getHeight() + dpf23) / 2.0f);
            float a2 = this.x.a(0.075f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float d = this.e.d(0.0f, false);
            Paint[] paintArr = this.d;
            if (d > 0.0f) {
                paintArr[1].setAlpha(255);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[1]);
            }
            if (d < 1.0f) {
                paintArr[0].setAlpha((int) ((1.0f - d) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[0]);
            }
            float abs = Math.abs(d - 0.5f) + 0.5f;
            Drawable[] drawableArr = this.n;
            Drawable drawable = drawableArr[1];
            float[] fArr = this.r;
            if (drawable == null || d <= 0.5f) {
                c3 = 0;
                f10 = 12.0f;
                f11 = 0.5f;
            } else {
                float dpf24 = this.s ? AndroidUtilities.dpf2(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable2 = drawableArr[1];
                int A = (int) org.telegram.messenger.y3.A(fArr[1], 2.0f, abs, dpf24);
                float centerY = rectF.centerY();
                float f12 = (fArr[1] / 2.0f) * abs;
                f11 = 0.5f;
                c3 = 0;
                f10 = 12.0f;
                drawable2.setBounds(A, (int) (centerY - f12), (int) (f12 + dpf24), (int) vh.v2.c(fArr[1], 2.0f, abs, rectF.centerY()));
                drawableArr[1].draw(canvas);
            }
            if (drawableArr[c3] != null && d <= f11) {
                float dpf25 = this.s ? AndroidUtilities.dpf2(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable3 = drawableArr[c3];
                int A2 = (int) org.telegram.messenger.y3.A(fArr[c3], 2.0f, abs, dpf25);
                float centerY2 = rectF.centerY();
                float f13 = (fArr[c3] / 2.0f) * abs;
                drawable3.setBounds(A2, (int) (centerY2 - f13), (int) (f13 + dpf25), (int) vh.v2.c(fArr[c3], 2.0f, abs, rectF.centerY()));
                drawableArr[c3].draw(canvas);
            }
            if (this.s) {
                Path path = this.w;
                path.rewind();
                path.moveTo(rectF.right - AndroidUtilities.dpf2(15.66f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
                path.lineTo(rectF.right - AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(2.33f) + rectF.centerY());
                path.lineTo(rectF.right - AndroidUtilities.dpf2(8.16f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
                float dpf26 = AndroidUtilities.dpf2(1.33f);
                Paint paint = this.v;
                paint.setStrokeWidth(dpf26);
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.x.c(z4);
    }
}
