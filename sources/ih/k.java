package ih;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.style.ForegroundColorSpan;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import cg.l0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] a;
    public final float[] b;
    public final Stack c;
    public int d;
    public final float[] e;
    public final int[] f;
    public RectF g;
    public final ArrayList h;
    public View i;
    public long j;
    public float k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public boolean p;
    public Runnable q;
    public ValueAnimator r;
    public int s;
    public TimeInterpolator t;
    public boolean u;
    public PorterDuffColorFilter v;
    public int w;
    public int x;
    public boolean y;
    public final RectF z;

    static {
        int i10 = SharedConfig.getDevicePerformanceClass() != 2 ? 100 : ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        A = i10;
        B = SharedConfig.getDevicePerformanceClass() != 2 ? 10 : 30;
        float[] fArr = {0.3f, 0.6f, 1.0f};
        C = fArr;
        D = (float[][]) Array.newInstance((Class<?>) Float.TYPE, fArr.length, i10 * 5);
        E = new Path();
    }

    public k() {
        float[] fArr = C;
        this.a = new Paint[fArr.length];
        this.b = new float[fArr.length];
        this.c = new Stack();
        this.e = new float[14];
        this.f = new int[fArr.length];
        this.h = new ArrayList();
        this.n = -1.0f;
        this.s = 255;
        this.t = new a(0);
        this.z = new RectF();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            this.a[i10] = new Paint();
            if (i10 == 0) {
                this.a[i10].setStrokeWidth(AndroidUtilities.dp(1.4f));
                this.a[i10].setStyle(Paint.Style.STROKE);
                this.a[i10].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.a[i10].setStrokeWidth(AndroidUtilities.dp(1.2f));
                this.a[i10].setStyle(Paint.Style.STROKE);
                this.a[i10].setStrokeCap(Paint.Cap.ROUND);
            }
            this.b[i10] = this.a[i10].getStrokeWidth() * 0.5f;
        }
        SharedConfig.getDevicePerformanceClass();
        h(0);
    }

    public static void a(View view, Layout layout, int i10, int i11, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i12;
        int i13;
        if (layout == null) {
            return;
        }
        t01[] t01VarArr = (t01[]) spanned.getSpans(0, layout.getText().length(), t01.class);
        for (int i14 = 0; i14 < Math.min(100, t01VarArr.length); i14++) {
            if (t01VarArr[i14].c()) {
                int spanStart = spanned.getSpanStart(t01VarArr[i14]);
                int spanEnd = spanned.getSpanEnd(t01VarArr[i14]);
                if (i10 == -1 && i11 == -1) {
                    int lineForOffset = layout.getLineForOffset(spanEnd);
                    int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i16 = TLObject.FLAG_31;
                    for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                        i15 = Math.min(i15, (int) layout.getLineLeft(lineForOffset2));
                        i16 = Math.max(i16, (int) layout.getLineRight(lineForOffset2));
                    }
                    i12 = i15;
                    i13 = i16;
                } else {
                    i12 = i10;
                    i13 = i11;
                }
                layout.getSelectionPath(spanStart, spanEnd, new c(view, layout, stack, list, i12, i13, arrayList));
            }
        }
        if (!(view instanceof TextView) || stack == null) {
            return;
        }
        stack.clear();
    }

    public static void b(View view, Layout layout, int i10, int i11, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, i10, i11, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void c(View view, Layout layout, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, -1, -1, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void d(Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Rect bounds = ((k) arrayList.get(i10)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (!(canvas instanceof ov0)) {
            layout.draw(canvas);
            return;
        }
        int alpha = layout.getPaint().getAlpha();
        layout.getPaint().setAlpha((int) (alpha * 0.4f));
        if (G == null) {
            G = new WeakHashMap();
        }
        ArrayList arrayList = (ArrayList) G.get(layout);
        if (arrayList == null) {
            arrayList = new ArrayList();
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                arrayList.add(new RectF(layout.getLineLeft(i10), layout.getLineTop(i10), layout.getLineRight(i10), layout.getLineBottom(i10)));
            }
            G.put(layout, arrayList);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            canvas.drawRect((RectF) arrayList.get(i11), layout.getPaint());
        }
        layout.getPaint().setAlpha(alpha);
    }

    public static void g(View view, boolean z4, int i10, int i11, AtomicReference atomicReference, int i12, Layout layout, List list, Canvas canvas, boolean z10) {
        StaticLayout staticLayout;
        AtomicReference atomicReference2;
        t01[] t01VarArr;
        int i13;
        if (list == null || list.isEmpty()) {
            f(canvas, layout);
            return;
        }
        Layout layout2 = (Layout) atomicReference.get();
        int i14 = 0;
        if (layout2 == null || !layout.getText().toString().equals(layout2.getText().toString()) || layout.getWidth() != layout2.getWidth() || layout.getHeight() != layout2.getHeight()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
            if (layout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) layout.getText();
                t01[] t01VarArr2 = (t01[]) spanned.getSpans(0, spanned.length(), t01.class);
                int i15 = 0;
                while (i15 < Math.min(100, t01VarArr2.length)) {
                    t01 t01Var = t01VarArr2[i15];
                    if (t01Var.c()) {
                        int spanStart = spanned.getSpanStart(t01Var);
                        int spanEnd = spanned.getSpanEnd(t01Var);
                        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(spanStart, spanEnd, Emoji.EmojiSpan.class);
                        int length = emojiSpanArr.length;
                        while (i14 < length) {
                            t01[] t01VarArr3 = t01VarArr2;
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[i14];
                            spannableStringBuilder.setSpan(new d(emojiSpan), spanned.getSpanStart(emojiSpan), spanned.getSpanEnd(emojiSpan), spanned.getSpanFlags(t01Var));
                            spannableStringBuilder.removeSpan(emojiSpan);
                            i14++;
                            t01VarArr2 = t01VarArr3;
                            i15 = i15;
                            length = length;
                            emojiSpanArr = emojiSpanArr;
                        }
                        t01VarArr = t01VarArr2;
                        i13 = i15;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(t01Var));
                        spannableStringBuilder.removeSpan(t01Var);
                    } else {
                        t01VarArr = t01VarArr2;
                        i13 = i15;
                    }
                    i15 = i13 + 1;
                    t01VarArr2 = t01VarArr;
                    i14 = 0;
                }
            }
            if (i12 == 1) {
                staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(1.66f), false);
            } else if (Build.VERSION.SDK_INT >= 24) {
                layout2 = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), layout.getPaint(), layout.getWidth()).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).build();
                atomicReference2 = atomicReference;
                atomicReference2.set(layout2);
            } else {
                staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
            }
            atomicReference2 = atomicReference;
            layout2 = staticLayout;
            atomicReference2.set(layout2);
        }
        if (list.isEmpty()) {
            f(canvas, layout);
        } else {
            canvas.save();
            canvas.translate(0.0f, i11);
            layout2.draw(canvas);
            canvas.restore();
        }
        if (list.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect bounds = ((k) it.next()).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        int i16 = 0;
        if (!list.isEmpty() && ((k) list.get(0)).n != -1.0f) {
            canvas.save();
            canvas.clipPath(path);
            path.rewind();
            if (!list.isEmpty()) {
                ((k) list.get(0)).e(path);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, -view.getPaddingTop());
            f(canvas, layout);
            canvas.restore();
            i16 = 0;
        }
        boolean z11 = ((k) list.get(i16)).n != -1.0f;
        if (z11) {
            int measuredWidth = view.getMeasuredWidth();
            if (z10 && (view.getParent() instanceof View)) {
                measuredWidth = ((View) view.getParent()).getMeasuredWidth();
            }
            canvas.saveLayer(0.0f, 0.0f, measuredWidth, view.getMeasuredHeight(), null, 31);
        } else {
            canvas.save();
        }
        canvas.translate(0.0f, -view.getPaddingTop());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            kVar.u = z4;
            if (kVar.i != view) {
                kVar.i = view;
            }
            boolean z12 = kVar.p;
            kVar.p = false;
            if (z12) {
                kVar.h(i0.a.d(Math.max(0.0f, kVar.n), i10, (i12 == 1 ? layout.getPaint() : j6.o2).getColor()));
            } else {
                kVar.h(i10);
            }
            kVar.draw(canvas);
        }
        if (z11) {
            path.rewind();
            ((k) list.get(0)).e(path);
            if (F == null) {
                Paint paint = new Paint(1);
                F = paint;
                paint.setColor(-16777216);
                F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            canvas.drawPath(path, F);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        if (m.q == null) {
            m.q = new m();
        }
        m mVar = m.q;
        int i11 = mVar.k;
        f7.b[] bVarArr = mVar.c;
        if (bVarArr[0] == null) {
            bVarArr[0] = new f7.b(i11);
            mVar.g = new Paint();
            mVar.i = new ArrayList(100);
            float f10 = i11;
            int i12 = (int) (f10 / 10.0f);
            int dp = (int) ((f10 / AndroidUtilities.dp(200.0f)) * 60.0f);
            int i13 = 0;
            while (true) {
                if (i13 >= 10) {
                    break;
                }
                int i14 = 0;
                for (int i15 = 10; i14 < i15; i15 = 10) {
                    k kVar = new k();
                    kVar.x = i11;
                    int i16 = i12 * i13;
                    int i17 = i12 * i14;
                    kVar.setBounds(i16, i17 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f) + i16 + i12, AndroidUtilities.dp(5.0f) + i17 + i12);
                    int min = Math.min(A * 5, dp);
                    kVar.d = min;
                    while (true) {
                        Stack stack = kVar.c;
                        if (kVar.h.size() + stack.size() < min) {
                            stack.push(new e());
                        }
                    }
                    kVar.h(-1);
                    mVar.i.add(kVar);
                    i14++;
                }
                i13++;
            }
            i10 = 128;
            mVar.a(new Canvas((Bitmap) bVarArr[0].b), new Rect(0, 0, i11, i11));
            mVar.g.setShader((BitmapShader) bVarArr[0].c);
            mVar.h = System.currentTimeMillis();
        } else {
            i10 = 128;
            if (mVar.p && !LiteMode.isEnabled(128)) {
                mVar.d = 0;
                mVar.a(new Canvas((Bitmap) bVarArr[0].b), new Rect(0, 0, i11, i11));
                mVar.g.setShader((BitmapShader) bVarArr[0].c);
                mVar.h = System.currentTimeMillis();
                mVar.p = false;
            }
        }
        Paint paint = mVar.g;
        paint.setColorFilter(this.v);
        canvas.drawRect(bounds, paint);
        if (LiteMode.isEnabled(i10)) {
            lf.j d = lf.j.d();
            d.getClass();
            lf.j.c();
            d.d.add(this);
            if (m.q == null) {
                m.q = new m();
            }
            m mVar2 = m.q;
            mVar2.getClass();
            int i18 = bounds.left;
            int i19 = mVar2.k;
            int i20 = ((i18 % i19) + i19) % i19;
            int i21 = ((bounds.top % i19) + i19) % i19;
            int min2 = Math.min(bounds.width(), i19) + i20;
            int min3 = Math.min(bounds.height(), i19) + i21;
            Rect rect = mVar2.m;
            rect.union(i20, i21, Math.min(min2, i19), Math.min(min3, i19));
            if (min2 > i19) {
                rect.union(0, i21, min2 - i19, Math.min(min3, i19));
            }
            if (min3 > i19) {
                rect.union(i20, 0, Math.min(min2, i19), min3 - i19);
            }
            if (min2 > i19 && min3 > i19) {
                rect.union(0, 0, min2 - i19, min3 - i19);
            }
            if (mVar2.l || rect.isEmpty()) {
                return;
            }
            mVar2.l = true;
            Choreographer.getInstance().postFrameCallback(mVar2.n);
        }
    }

    public final void e(Path path) {
        path.addCircle(this.k, this.l, k7.n.a(this.n, 0.0f, 1.0f) * this.m, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i10) {
        if (this.w == i10) {
            return;
        }
        int i11 = 0;
        while (true) {
            float[] fArr = C;
            if (i11 >= fArr.length) {
                this.v = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                this.w = i10;
                return;
            } else {
                this.a[i11].setColor(i0.a.k(i10, (int) (this.s * fArr[i11])));
                i11++;
            }
        }
    }

    public final void i(float f10, float f11, float f12) {
        if (this.g == null) {
            this.g = new RectF();
        }
        RectF rectF = this.g;
        if (rectF.left == 0.0f && rectF.right == f11 && rectF.top == f10 && rectF.bottom == f12) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f10;
        rectF.right = f11;
        rectF.bottom = f12;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.i;
        if (view != null) {
            if (view.getParent() != null && this.u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof a0) {
                ((a0) view).l();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f10, float f11, float f12, boolean z4) {
        this.k = f10;
        this.l = f11;
        this.m = f12;
        this.n = z4 ? 1.0f : 0.0f;
        this.o = z4;
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = this.o ? 255 : this.a[C.length - 1].getAlpha();
        ValueAnimator duration = ValueAnimator.ofFloat(this.n, z4 ? 0.0f : 1.0f).setDuration((long) k7.n.a(this.m * 0.3f, 250.0f, 550.0f));
        this.r = duration;
        duration.setInterpolator(this.t);
        this.r.addUpdateListener(new b(this, alpha, 0));
        this.r.addListener(new l0(this, 7));
        this.r.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.z;
        rectF.set(rect);
        rectF.inset(0.0f, AndroidUtilities.dp(2.5f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.s = i10;
        int i11 = 0;
        while (true) {
            float[] fArr = C;
            if (i11 >= fArr.length) {
                return;
            }
            this.a[i11].setAlpha((int) (fArr[i11] * i10));
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (!getBounds().contains((int) eVar.a, (int) eVar.b)) {
                it.remove();
            }
            Stack stack = this.c;
            if (stack.size() < this.d) {
                stack.push(eVar);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
