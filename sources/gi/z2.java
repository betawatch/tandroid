package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z2 extends FrameLayout {
    public static int e0;
    public float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final FrameLayout J;
    public final y2 K;
    public final float L;
    public final boolean M;
    public w2 N;
    public w2 O;
    public String P;
    public final ei.z5 Q;
    public org.telegram.messenger.q5 R;
    public String S;
    public Object T;
    public ei.h9 U;
    public boolean V;
    public boolean W;
    public Bitmap a;
    public final Path a0;
    public final Paint b;
    public final float[] b0;
    public final Paint c;
    public final Paint c0;
    public final Paint d;
    public LinearGradient e;
    public final Matrix f;
    public final Matrix h;
    public final Paint n;
    public final TextPaint r;
    public final TextPaint s;
    public final Drawable w;
    public boolean x;
    public StaticLayout y;
    public static final ArrayList d0 = new ArrayList();
    public static final HashMap f0 = new HashMap();
    public static final gh.i g0 = new gh.i(45, 1);

    public z2(Context context, org.telegram.ui.ActionBar.e6 e6Var, float f10, boolean z10) {
        super(context);
        this.b = new Paint(3);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.s = textPaint2;
        this.Q = new ei.z5(this, 27);
        this.a0 = new Path();
        this.b0 = new float[8];
        this.c0 = new Paint(1);
        this.L = f10;
        this.M = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.33f));
        textPaint2.setColor(-1);
        this.w = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        y2 y2Var = new y2(this, context, e6Var);
        this.K = y2Var;
        if (z10) {
            y2Var.setDrawBackgroundAsArc(7);
        } else {
            y2Var.setDrawBackgroundAsArc(6);
        }
        y2Var.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        CheckBoxBase checkBoxBase = y2Var.getCheckBoxBase();
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        if (checkBoxBase.u != i3) {
            checkBoxBase.u = i3;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.addView(y2Var, mf.e(26, 26, 17));
        addView(frameLayout, mf.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        y2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str == null) {
            return;
        }
        HashMap hashMap = f0;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            int intValue = num.intValue() - 1;
            Integer valueOf = Integer.valueOf(intValue);
            if (intValue <= 0) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, valueOf);
            }
        }
    }

    public final org.telegram.messenger.q5 a() {
        org.telegram.messenger.q5 q5Var = this.R;
        if (q5Var != null) {
            return q5Var;
        }
        ArrayList arrayList = d0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.q5 q5Var2 = new org.telegram.messenger.q5("gallery_load_" + arrayList.size(), true);
            this.R = q5Var2;
            arrayList.add(q5Var2);
        } else {
            int i3 = e0 + 1;
            e0 = i3;
            if (i3 >= arrayList.size()) {
                e0 = 0;
            }
            this.R = (org.telegram.messenger.q5) arrayList.get(e0);
        }
        return this.R;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.S);
            this.S = null;
            this.a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof ye;
        if (z10) {
            ye yeVar = (ye) obj;
            str = yeVar.c;
            if (str == null) {
                if (!yeVar.b || yeVar.d()) {
                    str = yeVar.I;
                } else {
                    str = "" + yeVar.C;
                }
            }
        } else if (obj instanceof f7) {
            str = "d" + ((f7) obj).b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.S)) {
            return;
        }
        String str2 = this.S;
        if (str2 != null) {
            this.a = null;
            d(str2);
            invalidate();
        }
        this.S = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z10) {
            ye yeVar2 = (ye) obj;
            if (yeVar2.T != 0 && yeVar2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{yeVar2.T, yeVar2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) g0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f0;
                Integer num = (Integer) hashMap.get(str);
                hashMap.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
        this.a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.U != null) {
            a().cancelRunnable(this.U);
            this.U = null;
        }
        org.telegram.messenger.q5 a10 = a();
        ei.h9 h9Var = new ei.h9(this, obj, str, 5);
        this.U = h9Var;
        a10.postRunnable(h9Var);
    }

    public final Bitmap c(ye yeVar, BitmapFactory.Options options) {
        if (yeVar == null) {
            return null;
        }
        int i3 = yeVar.C;
        String str = yeVar.c;
        return str != null ? BitmapFactory.decodeFile(str, options) : (!yeVar.b || yeVar.d()) ? MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i3, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i3, 1, options);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        boolean z11 = true;
        if (this.V || this.W) {
            canvas.save();
            Path path = this.a0;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float L = this.V ? org.telegram.messenger.g0.L(6.0f) : 0.0f;
            float[] fArr = this.b0;
            fArr[1] = L;
            fArr[0] = L;
            float L2 = this.W ? org.telegram.messenger.g0.L(6.0f) : 0.0f;
            fArr[3] = L2;
            fArr[2] = L2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        } else {
            z10 = false;
        }
        float progress = this.K.getProgress() * org.telegram.messenger.g0.L(12.66f);
        if (progress > 0.0f) {
            if (!z10) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.c0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.c);
        if (this.e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.a, this.f, this.b);
        }
        StaticLayout staticLayout = this.G;
        Paint paint2 = this.n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + this.H + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + this.G.getHeight() + org.telegram.messenger.g0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(6.0f)) - this.I, rectF2.top + org.telegram.messenger.g0.L(1.33f));
            this.G.draw(canvas2);
            canvas2.restore();
        }
        if (this.y != null) {
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(org.telegram.messenger.g0.L(4.0f), ((getHeight() - org.telegram.messenger.g0.L(4.0f)) - this.y.getHeight()) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f) + (this.x ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(4.0f)) + this.E + org.telegram.messenger.g0.L(5.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
            canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            if (this.x) {
                int L3 = (int) (rectF3.left + org.telegram.messenger.g0.L(6.0f));
                int centerY = (int) (rectF3.centerY() - (org.telegram.messenger.g0.L(8.0f) / 2));
                int L4 = (int) (rectF3.left + org.telegram.messenger.g0.L(13.0f));
                int centerY2 = (int) (rectF3.centerY() + (org.telegram.messenger.g0.L(8.0f) / 2));
                Drawable drawable = this.w;
                drawable.setBounds(L3, centerY, L4, centerY2);
                drawable.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate((rectF3.left + (this.x ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(5.0f))) - this.F, rectF3.top + org.telegram.messenger.g0.L(1.0f));
            this.y.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i3, f7 f7Var) {
        this.T = f7Var;
        if (i3 > 0) {
            this.G = null;
            g(bd.G(i3, "StoryDrafts", new Object[0]));
            this.x = false;
            this.P = bd.G(i3, "StoryDrafts", new Object[0]);
        } else {
            if (f7Var != null && f7Var.c) {
                StaticLayout staticLayout = new StaticLayout(bd.N0("StoryDraft"), this.s, getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.G = staticLayout;
                this.H = staticLayout.getLineCount() > 0 ? this.G.getLineWidth(0) : 0.0f;
                this.I = this.G.getLineCount() > 0 ? this.G.getLineLeft(0) : 0.0f;
            } else {
                this.G = null;
            }
            g((f7Var == null || !f7Var.K) ? null : org.telegram.messenger.g0.g0((int) Math.max(0.0f, ((f7Var.a0 - f7Var.Z) * f7Var.h0) / 1000.0f), false, false));
            if (f7Var == null || !f7Var.K) {
                this.P = bd.M0(2131744692, null);
            } else {
                this.P = bd.M0(2131744692, null) + ", " + bd.z((int) Math.max(0.0f, ((f7Var.a0 - f7Var.Z) * f7Var.h0) / 1000.0f));
            }
        }
        b(f7Var);
    }

    public final void f(int i3, boolean z10, boolean z11) {
        if (this.M) {
            z10 = true;
        }
        FrameLayout frameLayout = this.J;
        y2 y2Var = this.K;
        if (z11) {
            frameLayout.setVisibility(0);
            org.telegram.messenger.camera.q.l(y2Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).withEndAction(new ci.e1(5, this, z10)), xq.h, 320L);
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
        }
        if (i3 < 0) {
            y2Var.a(false, z11);
        } else {
            y2Var.a(true, z11);
            y2Var.setNum(i3);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.y = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.r, getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.y = staticLayout;
            this.E = staticLayout.getLineCount() > 0 ? this.y.getLineWidth(0) : 0.0f;
            this.F = this.y.getLineCount() > 0 ? this.y.getLineLeft(0) : 0.0f;
        }
        this.x = true;
    }

    public final void h() {
        Bitmap bitmap;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.a) != null) {
            float max = ((float) bitmap.getHeight()) / ((float) this.a.getWidth()) > this.L - 0.1f ? Math.max(getMeasuredWidth() / this.a.getWidth(), getMeasuredHeight() / this.a.getHeight()) : getMeasuredWidth() / this.a.getWidth();
            Matrix matrix = this.f;
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(com.google.android.recaptcha.internal.a.c(max, this.a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.recaptcha.internal.a.c(max, this.a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.r(this.Q);
        Object obj = this.T;
        if (obj != null) {
            b(obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.i3(this.Q, 250L);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.J;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        } else {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            y2 y2Var = this.K;
            accessibilityNodeInfo.setChecked(y2Var != null && y2Var.a.q);
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.O != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.P;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * this.L), TLObject.FLAG_30));
        h();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        w2 w2Var;
        w2 w2Var2;
        if (i3 == 16 && (w2Var2 = this.N) != null) {
            w2Var2.run();
            return true;
        }
        if (i3 != 32 || (w2Var = this.O) == null) {
            return super.performAccessibilityAction(i3, bundle);
        }
        w2Var.run();
        return true;
    }
}
