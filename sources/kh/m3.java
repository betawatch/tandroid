package kh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m3 extends FrameLayout {
    public static int W;
    public float A;
    public StaticLayout B;
    public float C;
    public float D;
    public final FrameLayout E;
    public final k3 F;
    public final float G;
    public final boolean H;
    public i3 I;
    public i3 J;
    public String K;
    public final f1 L;
    public DispatchQueue M;
    public String N;
    public Object O;
    public ih.h3 P;
    public boolean Q;
    public boolean R;
    public final Path S;
    public final float[] T;
    public final Paint U;
    public Bitmap a;
    public final Paint b;
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
    public static final ArrayList V = new ArrayList();
    public static final HashMap a0 = new HashMap();
    public static final l3 b0 = new l3(45);

    public m3(Context context, org.telegram.ui.ActionBar.b6 b6Var, float f10, boolean z10) {
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
        this.L = new f1(this, 6);
        this.S = new Path();
        this.T = new float[8];
        this.U = new Paint(1);
        this.G = f10;
        this.H = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
        textPaint2.setColor(-1);
        this.v = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        k3 k3Var = new k3(this, context, b6Var);
        this.F = k3Var;
        if (z10) {
            k3Var.setDrawBackgroundAsArc(7);
        } else {
            k3Var.setDrawBackgroundAsArc(6);
        }
        k3Var.b(org.telegram.ui.ActionBar.f6.W9, org.telegram.ui.ActionBar.f6.X9, org.telegram.ui.ActionBar.f6.V9);
        CheckBoxBase checkBoxBase = k3Var.getCheckBoxBase();
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        if (checkBoxBase.u != i9) {
            checkBoxBase.u = i9;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.addView(k3Var, g7.e6.e(26, 26, 17));
        addView(frameLayout, g7.e6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        k3Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str == null) {
            return;
        }
        HashMap hashMap = a0;
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
        DispatchQueue dispatchQueue = this.M;
        if (dispatchQueue != null) {
            return dispatchQueue;
        }
        ArrayList arrayList = V;
        if (arrayList.size() < 4) {
            DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + arrayList.size());
            this.M = dispatchQueue2;
            arrayList.add(dispatchQueue2);
        } else {
            int i9 = W + 1;
            W = i9;
            if (i9 >= arrayList.size()) {
                W = 0;
            }
            this.M = (DispatchQueue) arrayList.get(W);
        }
        return this.M;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.N);
            this.N = null;
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
        } else if (obj instanceof a8) {
            str = "d" + ((a8) obj).b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.N)) {
            return;
        }
        String str2 = this.N;
        if (str2 != null) {
            this.a = null;
            d(str2);
            invalidate();
        }
        this.N = str;
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
            bitmap = (Bitmap) b0.get(str);
            if (bitmap != null) {
                HashMap hashMap = a0;
                Integer num = (Integer) hashMap.get(str);
                hashMap.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
        this.a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.P != null) {
            a().cancelRunnable(this.P);
            this.P = null;
        }
        DispatchQueue a2 = a();
        ih.h3 h3Var = new ih.h3(this, obj, str, 11);
        this.P = h3Var;
        a2.postRunnable(h3Var);
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
        if (this.Q || this.R) {
            canvas.save();
            Path path = this.S;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float dp = this.Q ? AndroidUtilities.dp(6.0f) : 0.0f;
            float[] fArr = this.T;
            fArr[1] = dp;
            fArr[0] = dp;
            float dp2 = this.R ? AndroidUtilities.dp(6.0f) : 0.0f;
            fArr[3] = dp2;
            fArr[2] = dp2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        } else {
            z10 = false;
        }
        float progress = this.F.getProgress() * AndroidUtilities.dp(12.66f);
        if (progress > 0.0f) {
            if (!z10) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.U;
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
        StaticLayout staticLayout = this.B;
        Paint paint2 = this.n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.C + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.B.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.D, rectF2.top + AndroidUtilities.dp(1.33f));
            this.B.draw(canvas2);
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
            canvas2.translate((rectF3.left + (this.w ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(5.0f))) - this.A, rectF3.top + AndroidUtilities.dp(1.0f));
            this.x.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i9, a8 a8Var) {
        this.O = a8Var;
        String str = null;
        if (i9 > 0) {
            this.B = null;
            g(LocaleController.formatPluralString("StoryDrafts", i9, new Object[0]));
            this.w = false;
            this.K = LocaleController.formatPluralString("StoryDrafts", i9, new Object[0]);
        } else {
            if (a8Var != null && a8Var.c) {
                StaticLayout staticLayout = new StaticLayout(LocaleController.getString("StoryDraft"), this.s, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.B = staticLayout;
                this.C = staticLayout.getLineCount() > 0 ? this.B.getLineWidth(0) : 0.0f;
                this.D = this.B.getLineCount() > 0 ? this.B.getLineLeft(0) : 0.0f;
            } else {
                this.B = null;
            }
            if (a8Var != null && a8Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((a8Var.a0 - a8Var.Z) * a8Var.h0) / 1000.0f));
            }
            g(str);
            if (a8Var == null || !a8Var.K) {
                this.K = LocaleController.getString(R.string.StoryDraft);
            } else {
                this.K = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, ((a8Var.a0 - a8Var.Z) * a8Var.h0) / 1000.0f));
            }
        }
        b(a8Var);
    }

    public final void f(int i9, boolean z10, boolean z11) {
        if (this.H) {
            z10 = true;
        }
        FrameLayout frameLayout = this.E;
        k3 k3Var = this.F;
        if (z11) {
            frameLayout.setVisibility(0);
            ll.r(k3Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).withEndAction(new eh.f(7, this, z10)), gr.h, 320L);
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
        }
        if (i9 < 0) {
            k3Var.a(false, z11);
        } else {
            k3Var.a(true, z11);
            k3Var.setNum(i9);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.x = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.r, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.x = staticLayout;
            this.y = staticLayout.getLineCount() > 0 ? this.x.getLineWidth(0) : 0.0f;
            this.A = this.x.getLineCount() > 0 ? this.x.getLineLeft(0) : 0.0f;
        }
        this.w = true;
    }

    public final void h() {
        Bitmap bitmap;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.a) != null) {
            float max = ((float) bitmap.getHeight()) / ((float) this.a.getWidth()) > this.G - 0.1f ? Math.max(getMeasuredWidth() / this.a.getWidth(), getMeasuredHeight() / this.a.getHeight()) : getMeasuredWidth() / this.a.getWidth();
            Matrix matrix = this.f;
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(e2.c.d(max, this.a.getWidth(), getMeasuredWidth(), 2.0f), e2.c.d(max, this.a.getHeight(), getMeasuredHeight(), 2.0f));
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
        AndroidUtilities.cancelRunOnUIThread(this.L);
        Object obj = this.O;
        if (obj != null) {
            b(obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.runOnUIThread(this.L, 250L);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.E;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        } else {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            k3 k3Var = this.F;
            accessibilityNodeInfo.setChecked(k3Var != null && k3Var.a.q);
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.J != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.K;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * this.G), TLObject.FLAG_30));
        h();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        i3 i3Var;
        i3 i3Var2;
        if (i9 == 16 && (i3Var2 = this.I) != null) {
            i3Var2.run();
            return true;
        }
        if (i9 != 32 || (i3Var = this.J) == null) {
            return super.performAccessibilityAction(i9, bundle);
        }
        i3Var.run();
        return true;
    }
}
