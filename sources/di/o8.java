package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.w90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class o8 extends View implements org.telegram.ui.Cells.ba {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final /* synthetic */ p8 J;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final n8[] r;
    public int s;
    public StaticLayout v;
    public float w;
    public boolean x;
    public final boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(p8 p8Var, Context context) {
        super(context);
        this.J = p8Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = new n8[]{new n8(this), null};
        this.s = 0;
        new Path();
        this.y = true;
        this.H = false;
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(o8 o8Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
        if (LocaleController.isRTL) {
            alignment = px0.a();
        } else {
            Layout.Alignment[] alignmentArr = px0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    public final void b(CharSequence charSequence, k8 k8Var, k8 k8Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        n8[] n8VarArr = this.r;
        if (MediaDataController.stringsEqual(n8VarArr[0].n, charSequence)) {
            n8 n8Var = n8VarArr[0];
            if (n8Var.o == k8Var && n8Var.p == k8Var2) {
                n8Var.q = z10;
                invalidate();
                return;
            }
        }
        this.x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (!z11) {
            n8VarArr[0].g(charSequence, k8Var, k8Var2);
            n8VarArr[0].q = z10;
            invalidate();
            this.G = 0.0f;
            return;
        }
        if (n8VarArr[1] == null) {
            n8VarArr[1] = new n8(this);
        }
        n8 n8Var2 = n8VarArr[1];
        n8 n8Var3 = n8VarArr[0];
        n8Var2.g(n8Var3.n, n8Var3.o, n8Var3.p);
        n8 n8Var4 = n8VarArr[1];
        n8 n8Var5 = n8VarArr[0];
        n8Var4.q = n8Var5.q;
        n8Var4.r.d(n8Var5.r.c, true);
        n8VarArr[0].g(charSequence, k8Var, k8Var2);
        n8 n8Var6 = n8VarArr[0];
        n8Var6.q = z10;
        n8Var6.r.d(0.0f, true);
        this.G = 1.0f;
        ValueAnimator valueAnimator2 = this.I;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new ai.g0(this, 23));
        this.I.addListener(new bh.b(this, 16));
        this.I.setDuration(180L);
        this.I.setInterpolator(ds.g);
        this.I.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ce A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r8v14, types: [di.k8] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        n8[] n8VarArr;
        n8 n8Var;
        ?? r13;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        Layout staticTextLayout;
        n8 n8Var2;
        n8 n8Var3;
        boolean contains;
        ?? r132;
        k8 k8Var;
        boolean z14;
        p8 p8Var = this.J;
        org.telegram.ui.Cells.ca caVar = p8Var.W;
        if (motionEvent.getAction() == 0) {
            p8Var.g0 = motionEvent.getX();
            p8Var.h0 = motionEvent.getY();
        }
        p8Var.i0 = motionEvent.getX();
        p8Var.j0 = motionEvent.getY();
        if (this.v != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = this.n;
            rectF.set(f7, this.h, r4.getWidth() + f7, this.h + this.v.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = false;
                n8VarArr = this.r;
                n8Var = n8VarArr[0];
                if (n8Var != null || (k8Var = n8Var.o) == null) {
                    r13 = 0;
                    z11 = false;
                    i10 = 0;
                } else {
                    i10 = AndroidUtilities.dp(8.0f) + k8Var.b();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i11 = this.E;
                    int i12 = this.F;
                    k8 k8Var2 = n8VarArr[0].o;
                    rectF2.set(i11, i12, i11 + k8Var2.x, k8Var2.b() + i12);
                    z11 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                    if (z11) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() == 0 && z11) {
                        n8VarArr[0].o.e(motionEvent.getX(), motionEvent.getY(), true);
                        r13 = 0;
                    } else if (motionEvent.getAction() == 2) {
                        k8 k8Var3 = n8VarArr[0].o;
                        if (k8Var3.i.i && !z11) {
                            r13 = 0;
                            k8Var3.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                        r13 = 0;
                    } else {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (motionEvent.getAction() == 1 && z11) {
                                z14 = false;
                                z14 = false;
                                k8 k8Var4 = n8VarArr[0].o;
                                if (k8Var4.i.i) {
                                    p8Var.I(k8Var4);
                                }
                            } else {
                                z14 = false;
                            }
                            n8VarArr[z14 ? 1 : 0].o.e(motionEvent.getX(), motionEvent.getY(), z14);
                            r13 = z14;
                        }
                        r13 = 0;
                    }
                }
                if (!z11 && (n8Var3 = n8VarArr[r13]) != null && n8Var3.p != null) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f10 = this.E;
                    float lerp = (AndroidUtilities.lerp(n8Var3.m, n8Var3.l, this.w) + this.F) - n8VarArr[0].p.b();
                    int i13 = this.E;
                    n8 n8Var4 = n8VarArr[0];
                    rectF3.set(f10, lerp, i13 + n8Var4.p.x, AndroidUtilities.lerp(n8Var4.m, n8Var4.l, this.w) + this.F);
                    contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                    if (contains) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() != 0 && contains) {
                        n8VarArr[0].p.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() != 2) {
                        k8 k8Var5 = n8VarArr[0].p;
                        if (k8Var5.i.i && !contains) {
                            k8Var5.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && contains) {
                            r132 = 0;
                            r132 = 0;
                            k8 k8Var6 = n8VarArr[0].p;
                            if (k8Var6.i.i) {
                                p8Var.I(k8Var6);
                            }
                        } else {
                            r132 = 0;
                        }
                        n8VarArr[r132].p.e(motionEvent.getX(), motionEvent.getY(), r132);
                    }
                    if (contains) {
                        return true;
                    }
                }
                if (z10 && (p8Var.v0 || (n8Var2 = n8VarArr[0]) == null || n8Var2.g == null)) {
                    float f11 = this.E;
                    float f12 = this.F + i10;
                    Rect rect = caVar.B;
                    org.telegram.ui.Cells.ba baVar = caVar.p0;
                    staticTextLayout = baVar.getStaticTextLayout();
                    if (staticTextLayout != null) {
                        rect.setEmpty();
                        caVar.X = null;
                    } else {
                        caVar.X = baVar;
                        int i14 = (int) f11;
                        caVar.c = i14;
                        int i15 = (int) f12;
                        caVar.d = i15;
                        org.telegram.ui.Cells.v9 v9Var = caVar.a0;
                        v9Var.b = staticTextLayout;
                        v9Var.d = f11;
                        v9Var.c = f12;
                        v9Var.a = 0;
                        rect.set(i14, i15, (int) (f11 + staticTextLayout.getWidth()), (int) (f12 + staticTextLayout.getHeight()));
                    }
                    caVar.M(motionEvent);
                }
                if (caVar.x() && z10 && this.y) {
                    z13 = false;
                    if (((GestureDetector) n8VarArr[0].k.a.b).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        caVar.f(false);
                        return true;
                    }
                    z12 = true;
                } else {
                    z12 = true;
                    z13 = false;
                }
                return (super.dispatchTouchEvent(motionEvent) || z11) ? z12 : z13;
            }
        }
        z10 = true;
        n8VarArr = this.r;
        n8Var = n8VarArr[0];
        if (n8Var != null) {
        }
        r13 = 0;
        z11 = false;
        i10 = 0;
        if (!z11) {
            RectF rectF32 = AndroidUtilities.rectTmp;
            float f102 = this.E;
            float lerp2 = (AndroidUtilities.lerp(n8Var3.m, n8Var3.l, this.w) + this.F) - n8VarArr[0].p.b();
            int i132 = this.E;
            n8 n8Var42 = n8VarArr[0];
            rectF32.set(f102, lerp2, i132 + n8Var42.p.x, AndroidUtilities.lerp(n8Var42.m, n8Var42.l, this.w) + this.F);
            contains = rectF32.contains(motionEvent.getX(), motionEvent.getY());
            if (contains) {
            }
            if (motionEvent.getAction() != 0) {
            }
            if (motionEvent.getAction() != 2) {
            }
            if (contains) {
            }
        }
        if (z10) {
            float f112 = this.E;
            float f122 = this.F + i10;
            Rect rect2 = caVar.B;
            org.telegram.ui.Cells.ba baVar2 = caVar.p0;
            staticTextLayout = baVar2.getStaticTextLayout();
            if (staticTextLayout != null) {
            }
            caVar.M(motionEvent);
        }
        if (caVar.x()) {
        }
        z12 = true;
        z13 = false;
        if (super.dispatchTouchEvent(motionEvent)) {
            return z12;
        }
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        n8[] n8VarArr = this.r;
        int i11 = n8VarArr[0].l;
        return AndroidUtilities.lerp(i11, n8VarArr[1] != null ? r1.l : 0, this.G) + i10;
    }

    public Paint getPaint() {
        return this.c;
    }

    @Override // org.telegram.ui.Cells.ba
    public Layout getStaticTextLayout() {
        return this.r[0].e;
    }

    @Override // org.telegram.ui.Cells.ba
    public CharSequence getText() {
        return this.r[0].n;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        n8 n8Var = this.r[0];
        o8 o8Var = n8Var.v;
        org.telegram.ui.Components.c6.release(o8Var, n8Var.d);
        org.telegram.ui.Components.c6.release(o8Var, n8Var.f);
        if (n8Var.h == null) {
            return;
        }
        while (true) {
            l8[] l8VarArr = n8Var.h;
            if (i10 >= l8VarArr.length) {
                return;
            }
            l8 l8Var = l8VarArr[i10];
            if (l8Var != null) {
                org.telegram.ui.Components.c6.release(o8Var, l8Var.a);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        n8[] n8VarArr = this.r;
        n8VarArr[0].b(canvas2, 1.0f - this.G);
        n8 n8Var = n8VarArr[1];
        if (n8Var != null) {
            n8Var.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.n, scrollY);
            this.v.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(8.0f);
        int i13 = this.s;
        n8[] n8VarArr = this.r;
        if (i13 != i12) {
            this.s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            n8VarArr[0].e(max);
            n8 n8Var = n8VarArr[1];
            if (n8Var != null) {
                n8Var.e(max);
            }
        }
        int i14 = this.F * 2;
        int i15 = n8VarArr[0].l;
        n8 n8Var2 = n8VarArr[1];
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i15, n8Var2 != null ? n8Var2.l : 0, this.G) + i14, TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r9.contains(r20.getX(), r20.getY()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r1.a != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r1.b == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r20.getAction() != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        r3 = r4.r;
        r3[0].c.d(true);
        r3[0].a = null;
        r4.invalidate();
        r1.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01bf, code lost:
    
        if (r4 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01c5, code lost:
    
        if (super.onTouchEvent(r20) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r20.getAction() != 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r5 = r1.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r5 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r5 = r1.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r5 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        r5 = (int) (r20.getX() - r4.E);
        r9 = (int) ((r20.getY() - r4.F) - (r10 + r9));
        r10 = r1.e.getLineForVertical(r9);
        r5 = r5;
        r11 = r1.e.getOffsetForHorizontal(r10, r5);
        r12 = r1.e.getLineLeft(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r12 > r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if ((r1.e.getLineWidth(r10) + r12) < r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r9 < 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r9 > r1.e.getHeight()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
    
        r5 = new android.text.SpannableString(r1.n);
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, android.text.style.ClickableSpan.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r9 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        if (r9.length != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        if (r9 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
    
        if (r9.length == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
    
        r10 = r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
    
        if (r20.getAction() != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        r3.d(true);
        r1.b = null;
        r13 = new org.telegram.ui.Components.aa0(r9[0], null, r20.getX(), r20.getY(), 0);
        r1.a = r13;
        r13.d(org.telegram.ui.ActionBar.y6.o1(0.2f, -1));
        r3.a(r1.a, null);
        r9 = r5.getSpanStart(r1.a.i);
        r12 = r5.getSpanEnd(r1.a.i);
        r13 = r1.a.b();
        r13.d(r1.e, r9, r4.getPaddingTop());
        r1.e.getSelectionPath(r9, r12, r13);
        r9 = r1.a;
        r6.W.f(false);
        r4.postDelayed(new di.b4(19, r1, r9), android.view.ViewConfiguration.getLongPressTimeout());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r1.a != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        if (r4 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
    
        r5 = (org.telegram.ui.Components.c6[]) r5.getSpans(r11, r11, org.telegram.ui.Components.c6.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0184, code lost:
    
        if (r5.length == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0186, code lost:
    
        r9 = r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018c, code lost:
    
        if (r20.getAction() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018e, code lost:
    
        r1.a = null;
        r1.b = r5[0];
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019f, code lost:
    
        if (r20.getAction() != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        r3.d(true);
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a6, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a8, code lost:
    
        r3 = r3.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01aa, code lost:
    
        if (r3 != r10) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ac, code lost:
    
        r6.G(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b9, code lost:
    
        r1.a = null;
        r1.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b0, code lost:
    
        r3 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b2, code lost:
    
        if (r3 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b4, code lost:
    
        if (r3 != r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b6, code lost:
    
        r6.F(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0171, code lost:
    
        r4 = false;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f4, code lost:
    
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, org.telegram.ui.Components.w61.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        r4 = false;
        r9 = null;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0096, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0087, code lost:
    
        r10 = org.telegram.messenger.AndroidUtilities.dp(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x004f, code lost:
    
        if (r20.getAction() != 0) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n8[] n8VarArr;
        if (!this.J.s0 && (n8VarArr = this.r) != null) {
            n8 n8Var = n8VarArr[0];
            if (n8Var.e != null) {
                w90 w90Var = n8Var.c;
                o8 o8Var = n8Var.v;
                StaticLayout staticLayout = o8Var.v;
                p8 p8Var = o8Var.J;
                if (staticLayout != null) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f7 = o8Var.n;
                    rectF.set(f7, o8Var.h, staticLayout.getWidth() + f7, o8Var.h + o8Var.v.getHeight());
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        boolean z11 = z10 != isPressed();
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.J.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        n8 n8Var;
        k8 k8Var;
        k8 k8Var2;
        k8 k8Var3;
        k8 k8Var4;
        n8[] n8VarArr = this.r;
        n8 n8Var2 = n8VarArr[0];
        if ((n8Var2 == null || (n8Var2.s != drawable && (((k8Var3 = n8Var2.o) == null || k8Var3.j != drawable) && ((k8Var4 = n8Var2.p) == null || k8Var4.j != drawable)))) && ((n8Var = n8VarArr[1]) == null || (n8Var.s != drawable && (((k8Var = n8Var.o) == null || k8Var.j != drawable) && ((k8Var2 = n8Var.p) == null || k8Var2.j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
