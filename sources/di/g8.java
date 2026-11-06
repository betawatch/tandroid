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
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g8 extends View implements org.telegram.ui.Cells.r9 {
    public final boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final /* synthetic */ h8 J;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final f8[] r;
    public int s;
    public StaticLayout w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(h8 h8Var, Context context) {
        super(context);
        this.J = h8Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = new f8[]{new f8(this), null};
        this.s = 0;
        new Path();
        this.D = true;
        this.H = false;
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

    public static StaticLayout a(g8 g8Var, TextPaint textPaint, CharSequence charSequence, int i7) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7).setBreakStrategy(0).setHyphenationFrequency(0);
        if (hd.a0) {
            alignment = mu0.a();
        } else {
            Layout.Alignment[] alignmentArr = mu0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    public final void b(CharSequence charSequence, c8 c8Var, c8 c8Var2, boolean z9, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        f8[] f8VarArr = this.r;
        CharSequence charSequence2 = f8VarArr[0].n;
        Pattern pattern = ui.R1;
        if ((charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) ? false : ui.K(ui.b0(p10.s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ui.b0(p10.s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true))) {
            f8 f8Var = f8VarArr[0];
            if (f8Var.o == c8Var && f8Var.p == c8Var2) {
                f8Var.q = z9;
                invalidate();
                return;
            }
        }
        this.y = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (!z10) {
            f8VarArr[0].g(charSequence, c8Var, c8Var2);
            f8VarArr[0].q = z9;
            invalidate();
            this.G = 0.0f;
            return;
        }
        if (f8VarArr[1] == null) {
            f8VarArr[1] = new f8(this);
        }
        f8 f8Var2 = f8VarArr[1];
        f8 f8Var3 = f8VarArr[0];
        f8Var2.g(f8Var3.n, f8Var3.o, f8Var3.p);
        f8 f8Var4 = f8VarArr[1];
        f8 f8Var5 = f8VarArr[0];
        f8Var4.q = f8Var5.q;
        f8Var4.r.e(true, f8Var5.r.c);
        f8VarArr[0].g(charSequence, c8Var, c8Var2);
        f8 f8Var6 = f8VarArr[0];
        f8Var6.q = z9;
        f8Var6.r.e(true, 0.0f);
        this.G = 1.0f;
        ValueAnimator valueAnimator2 = this.I;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 23));
        this.I.addListener(new bi.t5(this, 15));
        this.I.setDuration(180L);
        this.I.setInterpolator(xq.g);
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
    /* JADX WARN: Type inference failed for: r8v14, types: [di.c8] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        f8[] f8VarArr;
        f8 f8Var;
        ?? r13;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        Layout staticTextLayout;
        f8 f8Var2;
        f8 f8Var3;
        boolean contains;
        ?? r132;
        c8 c8Var;
        boolean z13;
        h8 h8Var = this.J;
        org.telegram.ui.Cells.s9 s9Var = h8Var.W;
        if (motionEvent.getAction() == 0) {
            h8Var.g0 = motionEvent.getX();
            h8Var.h0 = motionEvent.getY();
        }
        h8Var.i0 = motionEvent.getX();
        h8Var.j0 = motionEvent.getY();
        if (this.w != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = this.n;
            rectF.set(f10, this.h, r4.getWidth() + f10, this.h + this.w.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z9 = false;
                f8VarArr = this.r;
                f8Var = f8VarArr[0];
                if (f8Var != null || (c8Var = f8Var.o) == null) {
                    r13 = 0;
                    z10 = false;
                    i7 = 0;
                } else {
                    i7 = org.telegram.messenger.g0.L(8.0f) + c8Var.b();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    int i10 = this.E;
                    int i11 = this.F;
                    c8 c8Var2 = f8VarArr[0].o;
                    rectF2.set(i10, i11, i10 + c8Var2.x, c8Var2.b() + i11);
                    z10 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                    if (z10) {
                        z9 = false;
                    }
                    if (motionEvent.getAction() == 0 && z10) {
                        f8VarArr[0].o.e(motionEvent.getX(), motionEvent.getY(), true);
                        r13 = 0;
                    } else if (motionEvent.getAction() == 2) {
                        c8 c8Var3 = f8VarArr[0].o;
                        if (c8Var3.i.i && !z10) {
                            r13 = 0;
                            c8Var3.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                        r13 = 0;
                    } else {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (motionEvent.getAction() == 1 && z10) {
                                z13 = false;
                                z13 = false;
                                c8 c8Var4 = f8VarArr[0].o;
                                if (c8Var4.i.i) {
                                    h8Var.I(c8Var4);
                                }
                            } else {
                                z13 = false;
                            }
                            f8VarArr[z13 ? 1 : 0].o.e(motionEvent.getX(), motionEvent.getY(), z13);
                            r13 = z13;
                        }
                        r13 = 0;
                    }
                }
                if (!z10 && (f8Var3 = f8VarArr[r13]) != null && f8Var3.p != null) {
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f11 = this.E;
                    float W1 = (org.telegram.messenger.g0.W1(this.x, f8Var3.m, f8Var3.l) + this.F) - f8VarArr[0].p.b();
                    int i12 = this.E;
                    f8 f8Var4 = f8VarArr[0];
                    rectF3.set(f11, W1, i12 + f8Var4.p.x, org.telegram.messenger.g0.W1(this.x, f8Var4.m, f8Var4.l) + this.F);
                    contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                    if (contains) {
                        z9 = false;
                    }
                    if (motionEvent.getAction() != 0 && contains) {
                        f8VarArr[0].p.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() != 2) {
                        c8 c8Var5 = f8VarArr[0].p;
                        if (c8Var5.i.i && !contains) {
                            c8Var5.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && contains) {
                            r132 = 0;
                            r132 = 0;
                            c8 c8Var6 = f8VarArr[0].p;
                            if (c8Var6.i.i) {
                                h8Var.I(c8Var6);
                            }
                        } else {
                            r132 = 0;
                        }
                        f8VarArr[r132].p.e(motionEvent.getX(), motionEvent.getY(), r132);
                    }
                    if (contains) {
                        return true;
                    }
                }
                if (z9 && (h8Var.v0 || (f8Var2 = f8VarArr[0]) == null || f8Var2.g == null)) {
                    float f12 = this.E;
                    float f13 = this.F + i7;
                    Rect rect = s9Var.B;
                    org.telegram.ui.Cells.r9 r9Var = s9Var.p0;
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
                if (s9Var.x() && z9 && this.D) {
                    z12 = false;
                    if (((GestureDetector) ((uy) f8VarArr[0].k.d).b).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        s9Var.f(false);
                        return true;
                    }
                    z11 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                return (super.dispatchTouchEvent(motionEvent) || z10) ? z11 : z12;
            }
        }
        z9 = true;
        f8VarArr = this.r;
        f8Var = f8VarArr[0];
        if (f8Var != null) {
        }
        r13 = 0;
        z10 = false;
        i7 = 0;
        if (!z10) {
            RectF rectF32 = org.telegram.messenger.g0.P;
            float f112 = this.E;
            float W12 = (org.telegram.messenger.g0.W1(this.x, f8Var3.m, f8Var3.l) + this.F) - f8VarArr[0].p.b();
            int i122 = this.E;
            f8 f8Var42 = f8VarArr[0];
            rectF32.set(f112, W12, i122 + f8Var42.p.x, org.telegram.messenger.g0.W1(this.x, f8Var42.m, f8Var42.l) + this.F);
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
        if (z9) {
            float f122 = this.E;
            float f132 = this.F + i7;
            Rect rect2 = s9Var.B;
            org.telegram.ui.Cells.r9 r9Var2 = s9Var.p0;
            staticTextLayout = r9Var2.getStaticTextLayout();
            if (staticTextLayout != null) {
            }
            s9Var.M(motionEvent);
        }
        if (s9Var.x()) {
        }
        z11 = true;
        z12 = false;
        if (super.dispatchTouchEvent(motionEvent)) {
            return z11;
        }
    }

    public float getAnimatedHeight() {
        int i7 = this.F * 2;
        f8[] f8VarArr = this.r;
        int i10 = f8VarArr[0].l;
        return org.telegram.messenger.g0.W1(this.G, i10, f8VarArr[1] != null ? r1.l : 0) + i7;
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
        f8 f8Var = this.r[0];
        g8 g8Var = f8Var.v;
        org.telegram.ui.Components.r5.release(g8Var, f8Var.d);
        org.telegram.ui.Components.r5.release(g8Var, f8Var.f);
        if (f8Var.h == null) {
            return;
        }
        while (true) {
            d8[] d8VarArr = f8Var.h;
            if (i7 >= d8VarArr.length) {
                return;
            }
            d8 d8Var = d8VarArr[i7];
            if (d8Var != null) {
                org.telegram.ui.Components.r5.release(g8Var, d8Var.a);
            }
            i7++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), qs.e4, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        f8[] f8VarArr = this.r;
        f8VarArr[0].b(canvas2, 1.0f - this.G);
        f8 f8Var = f8VarArr[1];
        if (f8Var != null) {
            f8Var.b(canvas2, this.G);
        }
        if (this.w != null) {
            float scrollY = this.h + this.J.getScrollY();
            int i7 = (int) ((1.0f - Utilities.i(this.x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f;
            paint.setAlpha(i7);
            Paint paint2 = this.e;
            paint2.setAlpha(i7);
            this.d.setAlpha(i7);
            canvas2.save();
            canvas2.translate(this.n - org.telegram.messenger.g0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(32.0f), this.w.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - org.telegram.messenger.g0.L(16.0f), scrollY, getMeasuredWidth(), this.w.getHeight() + scrollY + this.F, paint2);
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
        this.E = org.telegram.messenger.g0.L(16.0f);
        this.F = org.telegram.messenger.g0.L(8.0f);
        int i12 = this.s;
        f8[] f8VarArr = this.r;
        if (i12 != i11) {
            this.s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i7) - (this.E * 2));
            f8VarArr[0].e(max);
            f8 f8Var = f8VarArr[1];
            if (f8Var != null) {
                f8Var.e(max);
            }
        }
        int i13 = this.F * 2;
        int i14 = f8VarArr[0].l;
        f8 f8Var2 = f8VarArr[1];
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.G, i14, f8Var2 != null ? f8Var2.l : 0) + i13, TLObject.FLAG_30));
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
    
        r3.f(true);
        r1.b = null;
        r13 = new org.telegram.ui.Components.x70(r9[0], null, r20.getX(), r20.getY(), 0);
        r1.a = r13;
        r13.d(org.telegram.ui.ActionBar.k6.r1(0.2f, -1));
        r3.b(r1.a, null);
        r9 = r5.getSpanStart(r1.a.i);
        r12 = r5.getSpanEnd(r1.a.i);
        r13 = r1.a.b();
        r13.d(r1.e, r9, r4.getPaddingTop());
        r1.e.getSelectionPath(r9, r12, r13);
        r9 = r1.a;
        r6.W.f(false);
        r4.postDelayed(new di.z0(23, r1, r9), android.view.ViewConfiguration.getLongPressTimeout());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r1.a != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        if (r4 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
    
        r5 = (org.telegram.ui.Components.r5[]) r5.getSpans(r11, r11, org.telegram.ui.Components.r5.class);
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
    
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, org.telegram.ui.Components.u31.class);
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
        f8[] f8VarArr;
        if (!this.J.s0 && (f8VarArr = this.r) != null) {
            f8 f8Var = f8VarArr[0];
            if (f8Var.e != null) {
                n2.n0 n0Var = f8Var.c;
                g8 g8Var = f8Var.v;
                StaticLayout staticLayout = g8Var.w;
                h8 h8Var = g8Var.J;
                if (staticLayout != null) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f10 = g8Var.n;
                    rectF.set(f10, g8Var.h, staticLayout.getWidth() + f10, g8Var.h + g8Var.w.getHeight());
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        boolean z10 = z9 != isPressed();
        super.setPressed(z9);
        if (z10) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.J.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        f8 f8Var;
        c8 c8Var;
        c8 c8Var2;
        c8 c8Var3;
        c8 c8Var4;
        f8[] f8VarArr = this.r;
        f8 f8Var2 = f8VarArr[0];
        if ((f8Var2 == null || (f8Var2.s != drawable && (((c8Var3 = f8Var2.o) == null || c8Var3.j != drawable) && ((c8Var4 = f8Var2.p) == null || c8Var4.j != drawable)))) && ((f8Var = f8VarArr[1]) == null || (f8Var.s != drawable && (((c8Var = f8Var.o) == null || c8Var.j != drawable) && ((c8Var2 = f8Var.p) == null || c8Var2.j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
