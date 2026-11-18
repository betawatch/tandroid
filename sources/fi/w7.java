package fi;

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
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.wu0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class w7 extends View implements r9 {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final /* synthetic */ x7 K;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final v7[] r;
    public int s;
    public StaticLayout w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(x7 x7Var, Context context) {
        super(context);
        this.K = x7Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = new v7[]{new v7(this), null};
        this.s = 0;
        new Path();
        this.E = true;
        this.I = false;
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(w7 w7Var, TextPaint textPaint, CharSequence charSequence, int i7) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7).setBreakStrategy(0).setHyphenationFrequency(0);
        if (gd.a0) {
            alignment = wu0.a();
        } else {
            Layout.Alignment[] alignmentArr = wu0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    public final void b(CharSequence charSequence, s7 s7Var, s7 s7Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        v7[] v7VarArr = this.r;
        CharSequence charSequence2 = v7VarArr[0].n;
        Pattern pattern = ri.U1;
        if ((charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) ? false : ri.M(ri.d0(j10.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ri.d0(j10.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true))) {
            v7 v7Var = v7VarArr[0];
            if (v7Var.o == s7Var && v7Var.p == s7Var2) {
                v7Var.q = z10;
                invalidate();
                return;
            }
        }
        this.y = false;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = false;
        if (!z11) {
            v7VarArr[0].g(charSequence, s7Var, s7Var2);
            v7VarArr[0].q = z10;
            invalidate();
            this.H = 0.0f;
            return;
        }
        if (v7VarArr[1] == null) {
            v7VarArr[1] = new v7(this);
        }
        v7 v7Var2 = v7VarArr[1];
        v7 v7Var3 = v7VarArr[0];
        v7Var2.g(v7Var3.n, v7Var3.o, v7Var3.p);
        v7 v7Var4 = v7VarArr[1];
        v7 v7Var5 = v7VarArr[0];
        v7Var4.q = v7Var5.q;
        v7Var4.r.e(true, v7Var5.r.c);
        v7VarArr[0].g(charSequence, s7Var, s7Var2);
        v7 v7Var6 = v7VarArr[0];
        v7Var6.q = z10;
        v7Var6.r.e(true, 0.0f);
        this.H = 1.0f;
        ValueAnimator valueAnimator2 = this.J;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.I = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 24));
        this.J.addListener(new ai.j0(this, 17));
        this.J.setDuration(180L);
        this.J.setInterpolator(lr.g);
        this.J.start();
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
    /* JADX WARN: Type inference failed for: r8v14, types: [fi.s7] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        v7[] v7VarArr;
        v7 v7Var;
        ?? r13;
        boolean z11;
        int i7;
        boolean z12;
        boolean z13;
        Layout staticTextLayout;
        v7 v7Var2;
        v7 v7Var3;
        boolean contains;
        ?? r132;
        s7 s7Var;
        boolean z14;
        x7 x7Var = this.K;
        s9 s9Var = x7Var.a0;
        if (motionEvent.getAction() == 0) {
            x7Var.h0 = motionEvent.getX();
            x7Var.i0 = motionEvent.getY();
        }
        x7Var.j0 = motionEvent.getX();
        x7Var.k0 = motionEvent.getY();
        if (this.w != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = this.n;
            rectF.set(f10, this.h, r4.getWidth() + f10, this.h + this.w.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = false;
                v7VarArr = this.r;
                v7Var = v7VarArr[0];
                if (v7Var != null || (s7Var = v7Var.o) == null) {
                    r13 = 0;
                    z11 = false;
                    i7 = 0;
                } else {
                    i7 = org.telegram.messenger.g0.L(8.0f) + s7Var.b();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    int i10 = this.F;
                    int i11 = this.G;
                    s7 s7Var2 = v7VarArr[0].o;
                    rectF2.set(i10, i11, i10 + s7Var2.x, s7Var2.b() + i11);
                    z11 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                    if (z11) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() == 0 && z11) {
                        v7VarArr[0].o.e(motionEvent.getX(), motionEvent.getY(), true);
                        r13 = 0;
                    } else if (motionEvent.getAction() == 2) {
                        s7 s7Var3 = v7VarArr[0].o;
                        if (s7Var3.i.i && !z11) {
                            r13 = 0;
                            s7Var3.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                        r13 = 0;
                    } else {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (motionEvent.getAction() == 1 && z11) {
                                z14 = false;
                                z14 = false;
                                s7 s7Var4 = v7VarArr[0].o;
                                if (s7Var4.i.i) {
                                    x7Var.I(s7Var4);
                                }
                            } else {
                                z14 = false;
                            }
                            v7VarArr[z14 ? 1 : 0].o.e(motionEvent.getX(), motionEvent.getY(), z14);
                            r13 = z14;
                        }
                        r13 = 0;
                    }
                }
                if (!z11 && (v7Var3 = v7VarArr[r13]) != null && v7Var3.p != null) {
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f11 = this.F;
                    float W1 = (org.telegram.messenger.g0.W1(this.x, v7Var3.m, v7Var3.l) + this.G) - v7VarArr[0].p.b();
                    int i12 = this.F;
                    v7 v7Var4 = v7VarArr[0];
                    rectF3.set(f11, W1, i12 + v7Var4.p.x, org.telegram.messenger.g0.W1(this.x, v7Var4.m, v7Var4.l) + this.G);
                    contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                    if (contains) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() != 0 && contains) {
                        v7VarArr[0].p.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() != 2) {
                        s7 s7Var5 = v7VarArr[0].p;
                        if (s7Var5.i.i && !contains) {
                            s7Var5.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && contains) {
                            r132 = 0;
                            r132 = 0;
                            s7 s7Var6 = v7VarArr[0].p;
                            if (s7Var6.i.i) {
                                x7Var.I(s7Var6);
                            }
                        } else {
                            r132 = 0;
                        }
                        v7VarArr[r132].p.e(motionEvent.getX(), motionEvent.getY(), r132);
                    }
                    if (contains) {
                        return true;
                    }
                }
                if (z10 && (x7Var.w0 || (v7Var2 = v7VarArr[0]) == null || v7Var2.g == null)) {
                    float f12 = this.F;
                    float f13 = this.G + i7;
                    Rect rect = s9Var.B;
                    r9 r9Var = s9Var.p0;
                    staticTextLayout = r9Var.getStaticTextLayout();
                    if (staticTextLayout != null) {
                        rect.setEmpty();
                        s9Var.X = null;
                    } else {
                        s9Var.X = r9Var;
                        int i13 = (int) f12;
                        s9Var.c = i13;
                        int i14 = (int) f13;
                        s9Var.d = i14;
                        org.telegram.ui.Cells.l9 l9Var = s9Var.a0;
                        l9Var.d = staticTextLayout;
                        l9Var.c = f12;
                        l9Var.b = f13;
                        l9Var.a = 0;
                        rect.set(i13, i14, (int) (f12 + staticTextLayout.getWidth()), (int) (f13 + staticTextLayout.getHeight()));
                    }
                    s9Var.M(motionEvent);
                }
                if (s9Var.x() && z10 && this.E) {
                    z13 = false;
                    if (((GestureDetector) ((hn) v7VarArr[0].k.d).b).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        s9Var.f(false);
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
        v7VarArr = this.r;
        v7Var = v7VarArr[0];
        if (v7Var != null) {
        }
        r13 = 0;
        z11 = false;
        i7 = 0;
        if (!z11) {
            RectF rectF32 = org.telegram.messenger.g0.P;
            float f112 = this.F;
            float W12 = (org.telegram.messenger.g0.W1(this.x, v7Var3.m, v7Var3.l) + this.G) - v7VarArr[0].p.b();
            int i122 = this.F;
            v7 v7Var42 = v7VarArr[0];
            rectF32.set(f112, W12, i122 + v7Var42.p.x, org.telegram.messenger.g0.W1(this.x, v7Var42.m, v7Var42.l) + this.G);
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
            float f122 = this.F;
            float f132 = this.G + i7;
            Rect rect2 = s9Var.B;
            r9 r9Var2 = s9Var.p0;
            staticTextLayout = r9Var2.getStaticTextLayout();
            if (staticTextLayout != null) {
            }
            s9Var.M(motionEvent);
        }
        if (s9Var.x()) {
        }
        z12 = true;
        z13 = false;
        if (super.dispatchTouchEvent(motionEvent)) {
            return z12;
        }
    }

    public float getAnimatedHeight() {
        int i7 = this.G * 2;
        v7[] v7VarArr = this.r;
        int i10 = v7VarArr[0].l;
        return org.telegram.messenger.g0.W1(this.H, i10, v7VarArr[1] != null ? r1.l : 0) + i7;
    }

    public Paint getPaint() {
        return this.c;
    }

    @Override // org.telegram.ui.Cells.r9
    public Layout getStaticTextLayout() {
        return this.r[0].e;
    }

    @Override // org.telegram.ui.Cells.r9
    public CharSequence getText() {
        return this.r[0].n;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        v7 v7Var = this.r[0];
        w7 w7Var = v7Var.v;
        org.telegram.ui.Components.x5.release(w7Var, v7Var.d);
        org.telegram.ui.Components.x5.release(w7Var, v7Var.f);
        if (v7Var.h == null) {
            return;
        }
        while (true) {
            t7[] t7VarArr = v7Var.h;
            if (i7 >= t7VarArr.length) {
                return;
            }
            t7 t7Var = t7VarArr[i7];
            if (t7Var != null) {
                org.telegram.ui.Components.x5.release(w7Var, t7Var.a);
            }
            i7++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ks.e4, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        v7[] v7VarArr = this.r;
        v7VarArr[0].b(canvas2, 1.0f - this.H);
        v7 v7Var = v7VarArr[1];
        if (v7Var != null) {
            v7Var.b(canvas2, this.H);
        }
        if (this.w != null) {
            float scrollY = this.h + this.K.getScrollY();
            int i7 = (int) ((1.0f - Utilities.i(this.x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f;
            paint.setAlpha(i7);
            Paint paint2 = this.e;
            paint2.setAlpha(i7);
            this.d.setAlpha(i7);
            canvas2.save();
            canvas2.translate(this.n - org.telegram.messenger.g0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(32.0f), this.w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - org.telegram.messenger.g0.L(16.0f), scrollY, getMeasuredWidth(), this.w.getHeight() + scrollY + this.G, paint2);
            canvas2.save();
            canvas2.translate(this.n, scrollY);
            this.w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = (i10 + i7) << 16;
        this.F = org.telegram.messenger.g0.L(16.0f);
        this.G = org.telegram.messenger.g0.L(8.0f);
        int i12 = this.s;
        v7[] v7VarArr = this.r;
        if (i12 != i11) {
            this.s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i7) - (this.F * 2));
            v7VarArr[0].e(max);
            v7 v7Var = v7VarArr[1];
            if (v7Var != null) {
                v7Var.e(max);
            }
        }
        int i13 = this.G * 2;
        int i14 = v7VarArr[0].l;
        v7 v7Var2 = v7VarArr[1];
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.H, i14, v7Var2 != null ? v7Var2.l : 0) + i13, TLObject.FLAG_30));
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
        r3[0].c.f(true);
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
    
        r5 = (int) (r20.getX() - r4.F);
        r9 = (int) ((r20.getY() - r4.G) - (r10 + r9));
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
    
        r3.f(true);
        r1.b = null;
        r13 = new org.telegram.ui.Components.l80(r9[0], null, r20.getX(), r20.getY(), 0);
        r1.a = r13;
        r13.d(org.telegram.ui.ActionBar.n6.r1(0.2f, -1));
        r3.b(r1.a, null);
        r9 = r5.getSpanStart(r1.a.i);
        r12 = r5.getSpanEnd(r1.a.i);
        r13 = r1.a.b();
        r13.d(r1.e, r9, r4.getPaddingTop());
        r1.e.getSelectionPath(r9, r12, r13);
        r9 = r1.a;
        r6.a0.f(false);
        r4.postDelayed(new fi.a6(16, r1, r9), android.view.ViewConfiguration.getLongPressTimeout());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r1.a != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        if (r4 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
    
        r5 = (org.telegram.ui.Components.x5[]) r5.getSpans(r11, r11, org.telegram.ui.Components.x5.class);
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
    
        r3.f(true);
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
    
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, org.telegram.ui.Components.o41.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        r4 = false;
        r9 = null;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0096, code lost:
    
        r9 = org.telegram.messenger.g0.L(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0087, code lost:
    
        r10 = org.telegram.messenger.g0.L(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x004f, code lost:
    
        if (r20.getAction() != 0) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v7[] v7VarArr;
        if (!this.K.t0 && (v7VarArr = this.r) != null) {
            v7 v7Var = v7VarArr[0];
            if (v7Var.e != null) {
                n2.o0 o0Var = v7Var.c;
                w7 w7Var = v7Var.v;
                StaticLayout staticLayout = w7Var.w;
                x7 x7Var = w7Var.K;
                if (staticLayout != null) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f10 = w7Var.n;
                    rectF.set(f10, w7Var.h, staticLayout.getWidth() + f10, w7Var.h + w7Var.w.getHeight());
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
            this.K.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        v7 v7Var;
        s7 s7Var;
        s7 s7Var2;
        s7 s7Var3;
        s7 s7Var4;
        v7[] v7VarArr = this.r;
        v7 v7Var2 = v7VarArr[0];
        if ((v7Var2 == null || (v7Var2.s != drawable && (((s7Var3 = v7Var2.o) == null || s7Var3.j != drawable) && ((s7Var4 = v7Var2.p) == null || s7Var4.j != drawable)))) && ((v7Var = v7VarArr[1]) == null || (v7Var.s != drawable && (((s7Var = v7Var.o) == null || s7Var.j != drawable) && ((s7Var2 = v7Var.p) == null || s7Var2.j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
