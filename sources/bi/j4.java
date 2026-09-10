package bi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class j4 extends FrameLayout {
    public static int d0;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final FrameLayout I;
    public final h4 J;
    public final float K;
    public final boolean L;
    public f4 M;
    public f4 N;
    public String O;
    public final a3.d P;
    public DispatchQueue Q;
    public String R;
    public Object S;
    public a3.k0 T;
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
    public final Drawable v;
    public boolean w;
    public StaticLayout x;
    public float y;
    public static final ArrayList c0 = new ArrayList();
    public static final HashMap e0 = new HashMap();
    public static final i4 f0 = new i4(45);

    public j4(Context context, org.telegram.ui.ActionBar.f6 f6Var, float f7, boolean z10) {
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
        this.P = new a3.d(this, 22);
        this.W = new Path();
        this.a0 = new float[8];
        this.b0 = new Paint(1);
        this.K = f7;
        this.L = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
        textPaint2.setColor(-1);
        this.v = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        h4 h4Var = new h4(this, context, f6Var);
        this.J = h4Var;
        if (z10) {
            h4Var.setDrawBackgroundAsArc(7);
        } else {
            h4Var.setDrawBackgroundAsArc(6);
        }
        h4Var.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        CheckBoxBase checkBoxBase = h4Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        if (checkBoxBase.u != i10) {
            checkBoxBase.u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.addView(h4Var, w7.a6.e(26, 26, 17));
        addView(frameLayout, w7.a6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        h4Var.setImportantForAccessibility(2);
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

    public final DispatchQueue a() {
        DispatchQueue dispatchQueue = this.Q;
        if (dispatchQueue != null) {
            return dispatchQueue;
        }
        ArrayList arrayList = c0;
        if (arrayList.size() < 4) {
            DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + arrayList.size());
            this.Q = dispatchQueue2;
            arrayList.add(dispatchQueue2);
        } else {
            int i10 = d0 + 1;
            d0 = i10;
            if (i10 >= arrayList.size()) {
                d0 = 0;
            }
            this.Q = (DispatchQueue) arrayList.get(d0);
        }
        return this.Q;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.R);
            this.R = null;
            this.a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        if (z10) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            str = photoEntry.thumbPath;
            if (str == null) {
                if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                    str = photoEntry.path;
                } else {
                    str = "" + photoEntry.imageId;
                }
            }
        } else if (obj instanceof r9) {
            str = "d" + ((r9) obj).b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.R)) {
            return;
        }
        String str2 = this.R;
        if (str2 != null) {
            this.a = null;
            d(str2);
            invalidate();
        }
        this.R = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z10) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
            if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
        DispatchQueue a2 = a();
        a3.k0 k0Var = new a3.k0(this, obj, str, 5);
        this.T = k0Var;
        a2.postRunnable(k0Var);
    }

    public final Bitmap c(MediaController.PhotoEntry photoEntry, BitmapFactory.Options options) {
        if (photoEntry == null) {
            return null;
        }
        String str = photoEntry.thumbPath;
        return str != null ? BitmapFactory.decodeFile(str, options) : (!photoEntry.isVideo || photoEntry.isLivePhoto()) ? MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        boolean z11 = true;
        if (this.U || this.V) {
            canvas.save();
            Path path = this.W;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float dp = this.U ? AndroidUtilities.dp(6.0f) : 0.0f;
            float[] fArr = this.a0;
            fArr[1] = dp;
            fArr[0] = dp;
            float dp2 = this.V ? AndroidUtilities.dp(6.0f) : 0.0f;
            fArr[3] = dp2;
            fArr[2] = dp2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        } else {
            z10 = false;
        }
        float progress = this.J.getProgress() * AndroidUtilities.dp(12.66f);
        if (progress > 0.0f) {
            if (!z10) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.b0;
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
        StaticLayout staticLayout = this.F;
        Paint paint2 = this.n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.G + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.F.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.H, rectF2.top + AndroidUtilities.dp(1.33f));
            this.F.draw(canvas2);
            canvas2.restore();
        }
        if (this.x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(AndroidUtilities.dp(4.0f), ((getHeight() - AndroidUtilities.dp(4.0f)) - this.x.getHeight()) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + (this.w ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(4.0f)) + this.y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.w) {
                int dp3 = (int) (rectF3.left + AndroidUtilities.dp(6.0f));
                int centerY = (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2));
                int dp4 = (int) (rectF3.left + AndroidUtilities.dp(13.0f));
                int centerY2 = (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2));
                Drawable drawable = this.v;
                drawable.setBounds(dp3, centerY, dp4, centerY2);
                drawable.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate((rectF3.left + (this.w ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(5.0f))) - this.E, rectF3.top + AndroidUtilities.dp(1.0f));
            this.x.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, r9 r9Var) {
        this.S = r9Var;
        String str = null;
        if (i10 > 0) {
            this.F = null;
            g(LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]));
            this.w = false;
            this.O = LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]);
        } else {
            if (r9Var != null && r9Var.c) {
                StaticLayout staticLayout = new StaticLayout(LocaleController.getString("StoryDraft"), this.s, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.F = staticLayout;
                this.G = staticLayout.getLineCount() > 0 ? this.F.getLineWidth(0) : 0.0f;
                this.H = this.F.getLineCount() > 0 ? this.F.getLineLeft(0) : 0.0f;
            } else {
                this.F = null;
            }
            if (r9Var != null && r9Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((r9Var.a0 - r9Var.Z) * r9Var.h0) / 1000.0f));
            }
            g(str);
            if (r9Var == null || !r9Var.K) {
                this.O = LocaleController.getString(R.string.StoryDraft);
            } else {
                this.O = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, ((r9Var.a0 - r9Var.Z) * r9Var.h0) / 1000.0f));
            }
        }
        b(r9Var);
    }

    public final void f(int i10, boolean z10, boolean z11) {
        if (this.L) {
            z10 = true;
        }
        FrameLayout frameLayout = this.I;
        h4 h4Var = this.J;
        if (z11) {
            frameLayout.setVisibility(0);
            em.q(h4Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).withEndAction(new ai.j(1, this, z10)), wr.h, 320L);
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
        }
        if (i10 < 0) {
            h4Var.a(false, z11);
        } else {
            h4Var.a(true, z11);
            h4Var.setNum(i10);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.x = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.r, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.x = staticLayout;
            this.y = staticLayout.getLineCount() > 0 ? this.x.getLineWidth(0) : 0.0f;
            this.E = this.x.getLineCount() > 0 ? this.x.getLineLeft(0) : 0.0f;
        }
        this.w = true;
    }

    public final void h() {
        Bitmap bitmap;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.a) != null) {
            float max = ((float) bitmap.getHeight()) / ((float) this.a.getWidth()) > this.K - 0.1f ? Math.max(getMeasuredWidth() / this.a.getWidth(), getMeasuredHeight() / this.a.getHeight()) : getMeasuredWidth() / this.a.getWidth();
            Matrix matrix = this.f;
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(com.google.android.gms.internal.vision.e2.v(max, this.a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.gms.internal.vision.e2.v(max, this.a.getHeight(), getMeasuredHeight(), 2.0f));
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
        AndroidUtilities.cancelRunOnUIThread(this.P);
        Object obj = this.S;
        if (obj != null) {
            b(obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.runOnUIThread(this.P, 250L);
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
            h4 h4Var = this.J;
            accessibilityNodeInfo.setChecked(h4Var != null && h4Var.a.q);
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
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * this.K), TLObject.FLAG_30));
        h();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        f4 f4Var;
        f4 f4Var2;
        if (i10 == 16 && (f4Var2 = this.M) != null) {
            f4Var2.run();
            return true;
        }
        if (i10 != 32 || (f4Var = this.N) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        f4Var.run();
        return true;
    }
}
