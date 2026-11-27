// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class f7b extends View implements imb {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final /* synthetic */ g7b K;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final e7b[] r;
    public int s;
    public StaticLayout w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7b(g7b g7bVar, Context context) {
        super(context);
        this.K = g7bVar;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = new e7b[]{new e7b(this), null};
        this.s = 0;
        this.E = true;
        this.I = false;
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(hl.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(hl.o());
        textPaint2.setTextSize(hl.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, hl.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(int i, TextPaint textPaint, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setBreakStrategy(0).setHyphenationFrequency(0);
        if (ob6.a0) {
            alignment = o0b.a();
        } else {
            Layout.Alignment[] alignmentArr = o0b.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    public final void b(CharSequence charSequence, b7b b7bVar, b7b b7bVar2, boolean z, boolean z2) {
        if (charSequence == null) {
            charSequence = "";
        }
        e7b[] e7bVarArr = this.r;
        CharSequence charSequence2 = e7bVarArr[0].n;
        Pattern pattern = ls6.U1;
        if ((charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) ? false : ls6.M(ls6.d0(yac.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ls6.d0(yac.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true))) {
            e7b e7bVar = e7bVarArr[0];
            if (e7bVar.o == b7bVar && e7bVar.p == b7bVar2) {
                e7bVar.q = z;
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
        if (!z2) {
            e7bVarArr[0].g(charSequence, b7bVar, b7bVar2);
            e7bVarArr[0].q = z;
            invalidate();
            this.H = 0.0f;
            return;
        }
        if (e7bVarArr[1] == null) {
            e7bVarArr[1] = new e7b(this);
        }
        e7b e7bVar2 = e7bVarArr[1];
        e7b e7bVar3 = e7bVarArr[0];
        e7bVar2.g(e7bVar3.n, e7bVar3.o, e7bVar3.p);
        e7b e7bVar4 = e7bVarArr[1];
        e7b e7bVar5 = e7bVarArr[0];
        e7bVar4.q = e7bVar5.q;
        e7bVar4.r.e(true, e7bVar5.r.c);
        e7bVarArr[0].g(charSequence, b7bVar, b7bVar2);
        e7b e7bVar6 = e7bVarArr[0];
        e7bVar6.q = z;
        e7bVar6.r.e(true, 0.0f);
        this.H = 1.0f;
        ValueAnimator valueAnimator2 = this.J;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.I = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new ija(this, (byte) 16));
        this.J.addListener(new po9((Object) this, (byte) 26));
        this.J.setDuration(180L);
        this.J.setInterpolator(k43.g);
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
    /* JADX WARN: Type inference failed for: r8v14, types: [b7b] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        e7b[] e7bVarArr;
        e7b e7bVar;
        ?? r13;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        Layout staticTextLayout;
        e7b e7bVar2;
        e7b e7bVar3;
        boolean contains;
        ?? r132;
        b7b b7bVar;
        boolean z5;
        g7b g7bVar = this.K;
        jmb jmbVar = g7bVar.W;
        if (motionEvent.getAction() == 0) {
            g7bVar.g0 = motionEvent.getX();
            g7bVar.h0 = motionEvent.getY();
        }
        g7bVar.i0 = motionEvent.getX();
        g7bVar.j0 = motionEvent.getY();
        if (this.w != null) {
            RectF rectF = hl.P;
            float f = this.n;
            rectF.set(f, this.h, r4.getWidth() + f, this.h + this.w.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z = false;
                e7bVarArr = this.r;
                e7bVar = e7bVarArr[0];
                if (e7bVar != null || (b7bVar = e7bVar.o) == null) {
                    r13 = 0;
                    z2 = false;
                    i = 0;
                } else {
                    i = hl.L(8.0f) + b7bVar.b();
                    RectF rectF2 = hl.P;
                    int i2 = this.F;
                    int i3 = this.G;
                    b7b b7bVar2 = e7bVarArr[0].o;
                    rectF2.set(i2, i3, i2 + b7bVar2.x, b7bVar2.b() + i3);
                    z2 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                    if (z2) {
                        z = false;
                    }
                    if (motionEvent.getAction() == 0 && z2) {
                        e7bVarArr[0].o.e(motionEvent.getX(), motionEvent.getY(), true);
                        r13 = 0;
                    } else if (motionEvent.getAction() == 2) {
                        b7b b7bVar3 = e7bVarArr[0].o;
                        if (b7bVar3.i.i && !z2) {
                            r13 = 0;
                            b7bVar3.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                        r13 = 0;
                    } else {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (motionEvent.getAction() == 1 && z2) {
                                z5 = false;
                                z5 = false;
                                b7b b7bVar4 = e7bVarArr[0].o;
                                if (b7bVar4.i.i) {
                                    g7bVar.I(b7bVar4);
                                }
                            } else {
                                z5 = false;
                            }
                            e7bVarArr[z5 ? 1 : 0].o.e(motionEvent.getX(), motionEvent.getY(), z5);
                            r13 = z5;
                        }
                        r13 = 0;
                    }
                }
                if (!z2 && (e7bVar3 = e7bVarArr[r13]) != null && e7bVar3.p != null) {
                    RectF rectF3 = hl.P;
                    float f2 = this.F;
                    float U1 = (hl.U1(this.x, e7bVar3.m, e7bVar3.l) + this.G) - e7bVarArr[0].p.b();
                    int i4 = this.F;
                    e7b e7bVar4 = e7bVarArr[0];
                    rectF3.set(f2, U1, i4 + e7bVar4.p.x, hl.U1(this.x, e7bVar4.m, e7bVar4.l) + this.G);
                    contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                    if (contains) {
                        z = false;
                    }
                    if (motionEvent.getAction() != 0 && contains) {
                        e7bVarArr[0].p.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() != 2) {
                        b7b b7bVar5 = e7bVarArr[0].p;
                        if (b7bVar5.i.i && !contains) {
                            b7bVar5.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && contains) {
                            r132 = 0;
                            r132 = 0;
                            b7b b7bVar6 = e7bVarArr[0].p;
                            if (b7bVar6.i.i) {
                                g7bVar.I(b7bVar6);
                            }
                        } else {
                            r132 = 0;
                        }
                        e7bVarArr[r132].p.e(motionEvent.getX(), motionEvent.getY(), r132);
                    }
                    if (contains) {
                        return true;
                    }
                }
                if (z && (g7bVar.v0 || (e7bVar2 = e7bVarArr[0]) == null || e7bVar2.g == null)) {
                    float f3 = this.F;
                    float f4 = this.G + i;
                    Rect rect = jmbVar.B;
                    f7b f7bVar = jmbVar.p0;
                    staticTextLayout = f7bVar.getStaticTextLayout();
                    if (staticTextLayout != null) {
                        rect.setEmpty();
                        jmbVar.X = null;
                    } else {
                        jmbVar.X = f7bVar;
                        int i5 = (int) f3;
                        jmbVar.c = i5;
                        int i6 = (int) f4;
                        jmbVar.d = i6;
                        dj2 dj2Var = jmbVar.a0;
                        dj2Var.d = staticTextLayout;
                        dj2Var.c = f3;
                        dj2Var.b = f4;
                        dj2Var.a = 0;
                        rect.set(i5, i6, (int) (f3 + staticTextLayout.getWidth()), (int) (f4 + staticTextLayout.getHeight()));
                    }
                    jmbVar.L(motionEvent);
                }
                if (jmbVar.w() && z && this.E) {
                    z4 = false;
                    if (((GestureDetector) ((kj4) e7bVarArr[0].k.d).b).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        jmbVar.e(false);
                        return true;
                    }
                    z3 = true;
                } else {
                    z3 = true;
                    z4 = false;
                }
                return (super.dispatchTouchEvent(motionEvent) || z2) ? z3 : z4;
            }
        }
        z = true;
        e7bVarArr = this.r;
        e7bVar = e7bVarArr[0];
        if (e7bVar != null) {
        }
        r13 = 0;
        z2 = false;
        i = 0;
        if (!z2) {
            RectF rectF32 = hl.P;
            float f22 = this.F;
            float U12 = (hl.U1(this.x, e7bVar3.m, e7bVar3.l) + this.G) - e7bVarArr[0].p.b();
            int i42 = this.F;
            e7b e7bVar42 = e7bVarArr[0];
            rectF32.set(f22, U12, i42 + e7bVar42.p.x, hl.U1(this.x, e7bVar42.m, e7bVar42.l) + this.G);
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
        if (z) {
            float f32 = this.F;
            float f42 = this.G + i;
            Rect rect2 = jmbVar.B;
            f7b f7bVar2 = jmbVar.p0;
            staticTextLayout = f7bVar2.getStaticTextLayout();
            if (staticTextLayout != null) {
            }
            jmbVar.L(motionEvent);
        }
        if (jmbVar.w()) {
        }
        z3 = true;
        z4 = false;
        if (super.dispatchTouchEvent(motionEvent)) {
            return z3;
        }
    }

    public float getAnimatedHeight() {
        int i = this.G << 1;
        e7b[] e7bVarArr = this.r;
        int i2 = e7bVarArr[0].l;
        return hl.U1(this.H, i2, e7bVarArr[1] != null ? r1.l : 0) + i;
    }

    public Paint getPaint() {
        return this.c;
    }

    @Override // imb
    public Layout getStaticTextLayout() {
        return this.r[0].e;
    }

    @Override // imb
    public CharSequence getText() {
        return this.r[0].n;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        e7b e7bVar = this.r[0];
        f7b f7bVar = e7bVar.v;
        hm.release(f7bVar, e7bVar.d);
        hm.release(f7bVar, e7bVar.f);
        if (e7bVar.h == null) {
            return;
        }
        while (true) {
            c7b[] c7bVarArr = e7bVar.h;
            if (i >= c7bVarArr.length) {
                return;
            }
            c7b c7bVar = c7bVarArr[i];
            if (c7bVar != null) {
                hm.release(f7bVar, c7bVar.a);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), jn7.d4, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        e7b[] e7bVarArr = this.r;
        e7bVarArr[0].b(canvas2, 1.0f - this.H);
        e7b e7bVar = e7bVarArr[1];
        if (e7bVar != null) {
            e7bVar.b(canvas2, this.H);
        }
        if (this.w != null) {
            float scrollY = this.h + this.K.getScrollY();
            int i = (int) ((1.0f - Utilities.i(this.x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f;
            paint.setAlpha(i);
            Paint paint2 = this.e;
            paint2.setAlpha(i);
            this.d.setAlpha(i);
            canvas2.save();
            canvas2.translate(this.n - hl.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, hl.L(32.0f), this.w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - hl.L(16.0f), scrollY, getMeasuredWidth(), this.w.getHeight() + scrollY + this.G, paint2);
            canvas2.save();
            canvas2.translate(this.n, scrollY);
            this.w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = (i2 + i) << 16;
        this.F = hl.L(16.0f);
        this.G = hl.L(8.0f);
        int i4 = this.s;
        e7b[] e7bVarArr = this.r;
        if (i4 != i3) {
            this.s = i3;
            int max = Math.max(0, View.MeasureSpec.getSize(i) - (this.F << 1));
            e7bVarArr[0].e(max);
            e7b e7bVar = e7bVarArr[1];
            if (e7bVar != null) {
                e7bVar.e(max);
            }
        }
        int i5 = this.G << 1;
        int i6 = e7bVarArr[0].l;
        e7b e7bVar2 = e7bVarArr[1];
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.U1(this.H, i6, e7bVar2 != null ? e7bVar2.l : 0) + i5, TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r9.contains(r20.getX(), r20.getY()) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r1.a != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r1.b == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r20.getAction() != 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r3 = r4.r;
        r3[0].c.e(true);
        r3[0].a = null;
        r4.invalidate();
        r1.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01b9, code lost:
    
        if (r4 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01bf, code lost:
    
        if (super.onTouchEvent(r20) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r20.getAction() == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        r5 = r1.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r5 = r1.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r5 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r5 = (int) (r20.getX() - r4.F);
        r9 = (int) ((r20.getY() - r4.G) - (r10 + r9));
        r10 = r1.e.getLineForVertical(r9);
        r5 = r5;
        r11 = r1.e.getOffsetForHorizontal(r10, r5);
        r12 = r1.e.getLineLeft(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        if (r12 > r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if ((r1.e.getLineWidth(r10) + r12) < r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        if (r9 < 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r9 > r1.e.getHeight()) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        r5 = new android.text.SpannableString(r1.n);
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, android.text.style.ClickableSpan.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
    
        if (r9 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
    
        if (r9.length != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        if (r9 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        if (r9.length == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        r10 = r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
    
        if (r20.getAction() != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        r3.e(true);
        r1.b = null;
        r13 = new q66(r9[0], null, r20.getX(), r20.getY(), 0);
        r1.a = r13;
        r13.d(aob.p1(0.2f, -1));
        r3.a(r1.a, null);
        r9 = r5.getSpanStart(r1.a.i);
        r12 = r5.getSpanEnd(r1.a.i);
        r13 = r1.a.b();
        r13.d(r1.e, r9, r4.getPaddingTop());
        r1.e.getSelectionPath(r9, r12, r13);
        r9 = r1.a;
        r6.W.e(false);
        r4.postDelayed(new z3b(r1, r9, 19), android.view.ViewConfiguration.getLongPressTimeout());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016f, code lost:
    
        if (r1.a != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0171, code lost:
    
        if (r4 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0173, code lost:
    
        r5 = (hm[]) r5.getSpans(r11, r11, hm.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
    
        if (r5 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017e, code lost:
    
        if (r5.length == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0180, code lost:
    
        r9 = r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0186, code lost:
    
        if (r20.getAction() != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0188, code lost:
    
        r1.a = null;
        r1.b = r5[0];
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0199, code lost:
    
        if (r20.getAction() != 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019b, code lost:
    
        r3.e(true);
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a0, code lost:
    
        if (r3 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a2, code lost:
    
        r3 = r3.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a4, code lost:
    
        if (r3 != r10) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a6, code lost:
    
        r6.G(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b3, code lost:
    
        r1.a = null;
        r1.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:
    
        r3 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ac, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ae, code lost:
    
        if (r3 != r9) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b0, code lost:
    
        r6.F(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0169, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016b, code lost:
    
        r4 = false;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ee, code lost:
    
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, e8c.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r4 = false;
        r9 = null;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0090, code lost:
    
        r9 = hl.L(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0081, code lost:
    
        r10 = hl.L(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x004a, code lost:
    
        if (r20.getAction() != 0) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e7b[] e7bVarArr;
        if (!this.K.s0 && (e7bVarArr = this.r) != null) {
            e7b e7bVar = e7bVarArr[0];
            if (e7bVar.e != null) {
                m66 m66Var = e7bVar.c;
                f7b f7bVar = e7bVar.v;
                StaticLayout staticLayout = f7bVar.w;
                g7b g7bVar = f7bVar.K;
                if (staticLayout != null) {
                    RectF rectF = hl.P;
                    float f = f7bVar.n;
                    rectF.set(f, f7bVar.h, staticLayout.getWidth() + f, f7bVar.h + f7bVar.w.getHeight());
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        boolean z2 = z != isPressed();
        super.setPressed(z);
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.K.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        e7b e7bVar;
        b7b b7bVar;
        b7b b7bVar2;
        b7b b7bVar3;
        b7b b7bVar4;
        e7b[] e7bVarArr = this.r;
        e7b e7bVar2 = e7bVarArr[0];
        if ((e7bVar2 == null || (e7bVar2.s != drawable && (((b7bVar3 = e7bVar2.o) == null || b7bVar3.j != drawable) && ((b7bVar4 = e7bVar2.p) == null || b7bVar4.j != drawable)))) && ((e7bVar = e7bVarArr[1]) == null || (e7bVar.s != drawable && (((b7bVar = e7bVar.o) == null || b7bVar.j != drawable) && ((b7bVar2 = e7bVar.p) == null || b7bVar2.j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
