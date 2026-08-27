package jh;

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
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.tv0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z7 extends View implements s9 {
    public int A;
    public int B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final /* synthetic */ a8 F;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final y7[] r;
    public int s;
    public StaticLayout v;
    public float w;
    public boolean x;
    public final boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(a8 a8Var, Context context) {
        super(context);
        this.F = a8Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = new y7[]{new y7(this), null};
        this.s = 0;
        new Path();
        this.y = true;
        this.D = false;
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

    public static StaticLayout a(z7 z7Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
        if (LocaleController.isRTL) {
            alignment = tv0.a();
        } else {
            Layout.Alignment[] alignmentArr = tv0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    public final void b(CharSequence charSequence, v7 v7Var, v7 v7Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        y7[] y7VarArr = this.r;
        if (MediaDataController.stringsEqual(y7VarArr[0].n, charSequence)) {
            y7 y7Var = y7VarArr[0];
            if (y7Var.o == v7Var && y7Var.p == v7Var2) {
                y7Var.q = z10;
                invalidate();
                return;
            }
        }
        this.x = false;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = false;
        if (!z11) {
            y7VarArr[0].g(charSequence, v7Var, v7Var2);
            y7VarArr[0].q = z10;
            invalidate();
            this.C = 0.0f;
            return;
        }
        if (y7VarArr[1] == null) {
            y7VarArr[1] = new y7(this);
        }
        y7 y7Var2 = y7VarArr[1];
        y7 y7Var3 = y7VarArr[0];
        y7Var2.g(y7Var3.n, y7Var3.o, y7Var3.p);
        y7 y7Var4 = y7VarArr[1];
        y7 y7Var5 = y7VarArr[0];
        y7Var4.q = y7Var5.q;
        y7Var4.r.d(y7Var5.r.c, true);
        y7VarArr[0].g(charSequence, v7Var, v7Var2);
        y7 y7Var6 = y7VarArr[0];
        y7Var6.q = z10;
        y7Var6.r.d(0.0f, true);
        this.C = 1.0f;
        ValueAnimator valueAnimator2 = this.E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ag.u(this, 26));
        this.E.addListener(new ag.r1(this, 21));
        this.E.setDuration(180L);
        this.E.setInterpolator(er.g);
        this.E.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r8v14, types: [jh.v7] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        y7[] y7VarArr;
        y7 y7Var;
        ?? r13;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        Layout staticTextLayout;
        y7 y7Var2;
        y7 y7Var3;
        boolean contains;
        ?? r132;
        v7 v7Var;
        boolean z14;
        a8 a8Var = this.F;
        t9 t9Var = a8Var.S;
        if (motionEvent.getAction() == 0) {
            a8Var.c0 = motionEvent.getX();
            a8Var.d0 = motionEvent.getY();
        }
        a8Var.e0 = motionEvent.getX();
        a8Var.f0 = motionEvent.getY();
        if (this.v != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = this.n;
            rectF.set(f10, this.h, r4.getWidth() + f10, this.h + this.v.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = false;
                y7VarArr = this.r;
                y7Var = y7VarArr[0];
                if (y7Var != null || (v7Var = y7Var.o) == null) {
                    r13 = 0;
                    z11 = false;
                    i10 = 0;
                } else {
                    i10 = AndroidUtilities.dp(8.0f) + v7Var.b();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i11 = this.A;
                    int i12 = this.B;
                    v7 v7Var2 = y7VarArr[0].o;
                    rectF2.set(i11, i12, i11 + v7Var2.x, v7Var2.b() + i12);
                    z11 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                    if (z11) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() == 0 && z11) {
                        y7VarArr[0].o.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() == 2) {
                        v7 v7Var3 = y7VarArr[0].o;
                        if (v7Var3.i.h && !z11) {
                            r13 = 0;
                            v7Var3.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && z11) {
                            z14 = false;
                            z14 = false;
                            v7 v7Var4 = y7VarArr[0].o;
                            if (v7Var4.i.h) {
                                a8Var.I(v7Var4);
                            }
                        } else {
                            z14 = false;
                        }
                        y7VarArr[z14 ? 1 : 0].o.e(motionEvent.getX(), motionEvent.getY(), z14);
                        r13 = z14;
                    }
                    r13 = 0;
                }
                if (!z11 && (y7Var3 = y7VarArr[r13]) != null && y7Var3.p != null) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f11 = this.A;
                    float lerp = (AndroidUtilities.lerp(y7Var3.m, y7Var3.l, this.w) + this.B) - y7VarArr[0].p.b();
                    int i13 = this.A;
                    y7 y7Var4 = y7VarArr[0];
                    rectF3.set(f11, lerp, i13 + y7Var4.p.x, AndroidUtilities.lerp(y7Var4.m, y7Var4.l, this.w) + this.B);
                    contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                    if (contains) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() != 0 && contains) {
                        y7VarArr[0].p.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() != 2) {
                        v7 v7Var5 = y7VarArr[0].p;
                        if (v7Var5.i.h && !contains) {
                            v7Var5.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && contains) {
                            r132 = 0;
                            r132 = 0;
                            v7 v7Var6 = y7VarArr[0].p;
                            if (v7Var6.i.h) {
                                a8Var.I(v7Var6);
                            }
                        } else {
                            r132 = 0;
                        }
                        y7VarArr[r132].p.e(motionEvent.getX(), motionEvent.getY(), r132);
                    }
                    if (contains) {
                        return true;
                    }
                }
                if (z10 && (a8Var.r0 || (y7Var2 = y7VarArr[0]) == null || y7Var2.g == null)) {
                    float f12 = this.A;
                    float f13 = this.B + i10;
                    Rect rect = t9Var.B;
                    s9 s9Var = t9Var.u0;
                    staticTextLayout = s9Var.getStaticTextLayout();
                    if (staticTextLayout != null) {
                        rect.setEmpty();
                        t9Var.X = null;
                    } else {
                        t9Var.X = s9Var;
                        int i14 = (int) f12;
                        t9Var.c = i14;
                        int i15 = (int) f13;
                        t9Var.d = i15;
                        org.telegram.ui.Cells.m9 m9Var = t9Var.a0;
                        m9Var.b = staticTextLayout;
                        m9Var.d = f12;
                        m9Var.c = f13;
                        m9Var.a = 0;
                        rect.set(i14, i15, (int) (f12 + staticTextLayout.getWidth()), (int) (f13 + staticTextLayout.getHeight()));
                    }
                    t9Var.N(motionEvent);
                }
                if (t9Var.y() && z10 && this.y) {
                    z13 = false;
                    if (((GestureDetector) y7VarArr[0].k.a.b).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        t9Var.f(false);
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
        y7VarArr = this.r;
        y7Var = y7VarArr[0];
        if (y7Var != null) {
        }
        r13 = 0;
        z11 = false;
        i10 = 0;
        if (!z11) {
            RectF rectF32 = AndroidUtilities.rectTmp;
            float f112 = this.A;
            float lerp2 = (AndroidUtilities.lerp(y7Var3.m, y7Var3.l, this.w) + this.B) - y7VarArr[0].p.b();
            int i132 = this.A;
            y7 y7Var42 = y7VarArr[0];
            rectF32.set(f112, lerp2, i132 + y7Var42.p.x, AndroidUtilities.lerp(y7Var42.m, y7Var42.l, this.w) + this.B);
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
            float f122 = this.A;
            float f132 = this.B + i10;
            Rect rect2 = t9Var.B;
            s9 s9Var2 = t9Var.u0;
            staticTextLayout = s9Var2.getStaticTextLayout();
            if (staticTextLayout != null) {
            }
            t9Var.N(motionEvent);
        }
        if (t9Var.y()) {
        }
        z12 = true;
        z13 = false;
        if (super.dispatchTouchEvent(motionEvent)) {
            return z12;
        }
    }

    public float getAnimatedHeight() {
        int i10 = this.B * 2;
        y7[] y7VarArr = this.r;
        int i11 = y7VarArr[0].l;
        return AndroidUtilities.lerp(i11, y7VarArr[1] != null ? r1.l : 0, this.C) + i10;
    }

    public Paint getPaint() {
        return this.c;
    }

    @Override // org.telegram.ui.Cells.s9
    public Layout getStaticTextLayout() {
        return this.r[0].e;
    }

    @Override // org.telegram.ui.Cells.s9
    public CharSequence getText() {
        return this.r[0].n;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        y7 y7Var = this.r[0];
        z7 z7Var = y7Var.v;
        org.telegram.ui.Components.t5.release(z7Var, y7Var.d);
        org.telegram.ui.Components.t5.release(z7Var, y7Var.f);
        if (y7Var.h == null) {
            return;
        }
        while (true) {
            w7[] w7VarArr = y7Var.h;
            if (i10 >= w7VarArr.length) {
                return;
            }
            w7 w7Var = w7VarArr[i10];
            if (w7Var != null) {
                org.telegram.ui.Components.t5.release(z7Var, w7Var.a);
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
        y7[] y7VarArr = this.r;
        y7VarArr[0].b(canvas2, 1.0f - this.C);
        y7 y7Var = y7VarArr[1];
        if (y7Var != null) {
            y7Var.b(canvas2, this.C);
        }
        if (this.v != null) {
            float scrollY = this.h + this.F.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.B, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.B, paint2);
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
        this.A = AndroidUtilities.dp(16.0f);
        this.B = AndroidUtilities.dp(8.0f);
        int i13 = this.s;
        y7[] y7VarArr = this.r;
        if (i13 != i12) {
            this.s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.A * 2));
            y7VarArr[0].e(max);
            y7 y7Var = y7VarArr[1];
            if (y7Var != null) {
                y7Var.e(max);
            }
        }
        int i14 = this.B * 2;
        int i15 = y7VarArr[0].l;
        y7 y7Var2 = y7VarArr[1];
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i15, y7Var2 != null ? y7Var2.l : 0, this.C) + i14, TLObject.FLAG_30));
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
    
        r5 = (int) (r20.getX() - r4.A);
        r9 = (int) ((r20.getY() - r4.B) - (r10 + r9));
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
        r13 = new org.telegram.ui.Components.q80(r9[0], null, r20.getX(), r20.getY(), 0);
        r1.a = r13;
        r13.d(org.telegram.ui.ActionBar.g6.l1(0.2f, -1));
        r3.a(r1.a, null);
        r9 = r5.getSpanStart(r1.a.i);
        r12 = r5.getSpanEnd(r1.a.i);
        r13 = r1.a.b();
        r13.d(r1.e, r9, r4.getPaddingTop());
        r1.e.getSelectionPath(r9, r12, r13);
        r9 = r1.a;
        r6.S.f(false);
        r4.postDelayed(new jh.p6(12, r1, r9), android.view.ViewConfiguration.getLongPressTimeout());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r1.a != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        if (r4 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
    
        r5 = (org.telegram.ui.Components.t5[]) r5.getSpans(r11, r11, org.telegram.ui.Components.t5.class);
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
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f4, code lost:
    
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, org.telegram.ui.Components.q41.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        r9 = null;
        r10 = null;
        r4 = false;
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
        y7[] y7VarArr;
        if (!this.F.o0 && (y7VarArr = this.r) != null) {
            y7 y7Var = y7VarArr[0];
            if (y7Var.e != null) {
                m80 m80Var = y7Var.c;
                z7 z7Var = y7Var.v;
                StaticLayout staticLayout = z7Var.v;
                a8 a8Var = z7Var.F;
                if (staticLayout != null) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f10 = z7Var.n;
                    rectF.set(f10, z7Var.h, staticLayout.getWidth() + f10, z7Var.h + z7Var.v.getHeight());
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
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.F.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        y7 y7Var;
        v7 v7Var;
        v7 v7Var2;
        v7 v7Var3;
        v7 v7Var4;
        y7[] y7VarArr = this.r;
        y7 y7Var2 = y7VarArr[0];
        if ((y7Var2 == null || (y7Var2.s != drawable && (((v7Var3 = y7Var2.o) == null || v7Var3.j != drawable) && ((v7Var4 = y7Var2.p) == null || v7Var4.j != drawable)))) && ((y7Var = y7VarArr[1]) == null || (y7Var.s != drawable && (((v7Var = y7Var.o) == null || v7Var.j != drawable) && ((v7Var2 = y7Var.p) == null || v7Var2.j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
