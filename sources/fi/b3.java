package fi;

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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout {
    public static int d0;
    public float D;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final FrameLayout I;
    public final a3 J;
    public final float K;
    public final boolean L;
    public y2 M;
    public y2 N;
    public String O;
    public final di.s7 P;
    public org.telegram.messenger.q5 Q;
    public String R;
    public Object S;
    public x1 T;
    public boolean U;
    public boolean V;
    public final Path W;
    public Bitmap a;
    public final float[] a0;
    public final Paint b;
    public final Paint b0;
    public final Paint c;
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
    public static final ArrayList c0 = new ArrayList();
    public static final HashMap e0 = new HashMap();
    public static final fh.i f0 = new fh.i(45, 1);

    public b3(Context context, org.telegram.ui.ActionBar.f6 f6Var, float f10, boolean z9) {
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
        this.P = new di.s7(this, 23);
        this.W = new Path();
        this.a0 = new float[8];
        this.b0 = new Paint(1);
        this.K = f10;
        this.L = z9;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.33f));
        textPaint2.setColor(-1);
        this.w = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        a3 a3Var = new a3(this, context, f6Var);
        this.J = a3Var;
        if (z9) {
            a3Var.setDrawBackgroundAsArc(7);
        } else {
            a3Var.setDrawBackgroundAsArc(6);
        }
        a3Var.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        CheckBoxBase checkBoxBase = a3Var.getCheckBoxBase();
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        if (checkBoxBase.u != i7) {
            checkBoxBase.u = i7;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.addView(a3Var, c8.ha.e(26, 26, 17));
        addView(frameLayout, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        a3Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str == null) {
            return;
        }
        HashMap hashMap = e0;
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
        org.telegram.messenger.q5 q5Var = this.Q;
        if (q5Var != null) {
            return q5Var;
        }
        ArrayList arrayList = c0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.q5 q5Var2 = new org.telegram.messenger.q5("gallery_load_" + arrayList.size(), true);
            this.Q = q5Var2;
            arrayList.add(q5Var2);
        } else {
            int i7 = d0 + 1;
            d0 = i7;
            if (i7 >= arrayList.size()) {
                d0 = 0;
            }
            this.Q = (org.telegram.messenger.q5) arrayList.get(d0);
        }
        return this.Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        String str;
        String str2;
        Bitmap bitmap;
        if (obj == null) {
            d(this.R);
            this.R = null;
            this.a = null;
            invalidate();
            return;
        }
        boolean z9 = obj instanceof gf;
        if (z9) {
            gf gfVar = (gf) obj;
            str2 = gfVar.c;
            if (str2 == null) {
                if (!gfVar.b || gfVar.d()) {
                    str2 = gfVar.I;
                } else {
                    str2 = "" + gfVar.C;
                }
            }
        } else {
            if (!(obj instanceof e7)) {
                str = null;
                if (TextUtils.equals(str, this.R)) {
                    String str3 = this.R;
                    if (str3 != null) {
                        this.a = null;
                        d(str3);
                        invalidate();
                    }
                    this.R = str;
                    Paint paint = this.d;
                    paint.setShader(null);
                    this.e = null;
                    if (z9) {
                        gf gfVar2 = (gf) obj;
                        if (gfVar2.T != 0 && gfVar2.U != 0) {
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{gfVar2.T, gfVar2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            this.e = linearGradient;
                            paint.setShader(linearGradient);
                            h();
                        }
                    }
                    if (str == null) {
                        bitmap = null;
                    } else {
                        bitmap = (Bitmap) f0.get(str);
                        if (bitmap != null) {
                            HashMap hashMap = e0;
                            Integer num = (Integer) hashMap.get(str);
                            hashMap.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                        }
                    }
                    this.a = bitmap;
                    if (bitmap != null) {
                        invalidate();
                        return;
                    }
                    if (this.T != null) {
                        a().cancelRunnable(this.T);
                        this.T = null;
                    }
                    org.telegram.messenger.q5 a10 = a();
                    x1 x1Var = new x1(this, obj, str, false, 1);
                    this.T = x1Var;
                    a10.postRunnable(x1Var);
                    return;
                }
                return;
            }
            str2 = "d" + ((e7) obj).b;
        }
        str = str2;
        if (TextUtils.equals(str, this.R)) {
        }
    }

    public final Bitmap c(gf gfVar, BitmapFactory.Options options) {
        if (gfVar == null) {
            return null;
        }
        int i7 = gfVar.C;
        String str = gfVar.c;
        return str != null ? BitmapFactory.decodeFile(str, options) : (!gfVar.b || gfVar.d()) ? MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i7, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i7, 1, options);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z9;
        Canvas canvas2;
        boolean z10 = true;
        if (this.U || this.V) {
            canvas.save();
            Path path = this.W;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float L = this.U ? org.telegram.messenger.g0.L(6.0f) : 0.0f;
            float[] fArr = this.a0;
            fArr[1] = L;
            fArr[0] = L;
            float L2 = this.V ? org.telegram.messenger.g0.L(6.0f) : 0.0f;
            fArr[3] = L2;
            fArr[2] = L2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z9 = true;
        } else {
            z9 = false;
        }
        float progress = this.J.getProgress() * org.telegram.messenger.g0.L(12.66f);
        if (progress > 0.0f) {
            if (!z9) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.b0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z10 = z9;
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
        StaticLayout staticLayout = this.F;
        Paint paint2 = this.n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + this.G + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + this.F.getHeight() + org.telegram.messenger.g0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(6.0f)) - this.H, rectF2.top + org.telegram.messenger.g0.L(1.33f));
            this.F.draw(canvas2);
            canvas2.restore();
        }
        if (this.y != null) {
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(org.telegram.messenger.g0.L(4.0f), ((getHeight() - org.telegram.messenger.g0.L(4.0f)) - this.y.getHeight()) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f) + (this.x ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(4.0f)) + this.D + org.telegram.messenger.g0.L(5.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
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
            canvas2.translate((rectF3.left + (this.x ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(5.0f))) - this.E, rectF3.top + org.telegram.messenger.g0.L(1.0f));
            this.y.draw(canvas2);
            canvas2.restore();
        }
        if (z10) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i7, e7 e7Var) {
        this.S = e7Var;
        if (i7 > 0) {
            this.F = null;
            g(hd.G(i7, "StoryDrafts", new Object[0]));
            this.x = false;
            this.O = hd.G(i7, "StoryDrafts", new Object[0]);
        } else {
            if (e7Var != null && e7Var.c) {
                StaticLayout staticLayout = new StaticLayout(hd.N0("StoryDraft"), this.s, getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.F = staticLayout;
                this.G = staticLayout.getLineCount() > 0 ? this.F.getLineWidth(0) : 0.0f;
                this.H = this.F.getLineCount() > 0 ? this.F.getLineLeft(0) : 0.0f;
            } else {
                this.F = null;
            }
            g((e7Var == null || !e7Var.K) ? null : org.telegram.messenger.g0.g0((int) Math.max(0.0f, ((e7Var.a0 - e7Var.Z) * e7Var.h0) / 1000.0f), false, false));
            if (e7Var == null || !e7Var.K) {
                this.O = hd.M0(2131744683, null);
            } else {
                this.O = hd.M0(2131744683, null) + ", " + hd.z((int) Math.max(0.0f, ((e7Var.a0 - e7Var.Z) * e7Var.h0) / 1000.0f));
            }
        }
        b(e7Var);
    }

    public final void f(int i7, boolean z9, boolean z10) {
        if (this.L) {
            z9 = true;
        }
        FrameLayout frameLayout = this.I;
        a3 a3Var = this.J;
        if (z10) {
            frameLayout.setVisibility(0);
            org.telegram.messenger.camera.q.l(a3Var.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.7f).scaleY(z9 ? 1.0f : 0.7f).withEndAction(new bi.k1(5, this, z9)), xq.h, 320L);
        } else {
            frameLayout.setVisibility(z9 ? 0 : 8);
        }
        if (i7 < 0) {
            a3Var.a(false, z10);
        } else {
            a3Var.a(true, z10);
            a3Var.setNum(i7);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.y = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.r, getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.y = staticLayout;
            this.D = staticLayout.getLineCount() > 0 ? this.y.getLineWidth(0) : 0.0f;
            this.E = this.y.getLineCount() > 0 ? this.y.getLineLeft(0) : 0.0f;
        }
        this.x = true;
    }

    public final void h() {
        Bitmap bitmap;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.a) != null) {
            float max = ((float) bitmap.getHeight()) / ((float) this.a.getWidth()) > this.K - 0.1f ? Math.max(getMeasuredWidth() / this.a.getWidth(), getMeasuredHeight() / this.a.getHeight()) : getMeasuredWidth() / this.a.getWidth();
            Matrix matrix = this.f;
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(com.google.android.recaptcha.internal.a.w(max, this.a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.recaptcha.internal.a.w(max, this.a.getHeight(), getMeasuredHeight(), 2.0f));
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
        org.telegram.messenger.g0.r(this.P);
        Object obj = this.S;
        if (obj != null) {
            b(obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.i3(this.P, 250L);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.I;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        } else {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            a3 a3Var = this.J;
            accessibilityNodeInfo.setChecked(a3Var != null && a3Var.a.q);
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.N != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.O;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * this.K), TLObject.FLAG_30));
        h();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        y2 y2Var;
        y2 y2Var2;
        if (i7 == 16 && (y2Var2 = this.M) != null) {
            y2Var2.run();
            return true;
        }
        if (i7 != 32 || (y2Var = this.N) == null) {
            return super.performAccessibilityAction(i7, bundle);
        }
        y2Var.run();
        return true;
    }
}
