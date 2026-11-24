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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class k5b extends View implements okb {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final /* synthetic */ l5b K;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final j5b[] r;
    public int s;
    public StaticLayout w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5b(l5b l5bVar, Context context) {
        super(context);
        this.K = l5bVar;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = new j5b[]{new j5b(this), null};
        this.s = 0;
        this.E = true;
        this.I = false;
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(gm.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(gm.o());
        textPaint2.setTextSize(gm.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, gm.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(int i, TextPaint textPaint, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setBreakStrategy(0).setHyphenationFrequency(0);
        if (jb6.a0) {
            alignment = oya.a();
        } else {
            Layout.Alignment[] alignmentArr = oya.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    public final void b(CharSequence charSequence, g5b g5bVar, g5b g5bVar2, boolean z, boolean z2) {
        if (charSequence == null) {
            charSequence = "";
        }
        j5b[] j5bVarArr = this.r;
        CharSequence charSequence2 = j5bVarArr[0].n;
        Pattern pattern = hs6.U1;
        if ((charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) ? false : hs6.M(hs6.d0(z8c.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), hs6.d0(z8c.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true))) {
            j5b j5bVar = j5bVarArr[0];
            if (j5bVar.o == g5bVar && j5bVar.p == g5bVar2) {
                j5bVar.q = z;
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
            j5bVarArr[0].g(charSequence, g5bVar, g5bVar2);
            j5bVarArr[0].q = z;
            invalidate();
            this.H = 0.0f;
            return;
        }
        if (j5bVarArr[1] == null) {
            j5bVarArr[1] = new j5b(this);
        }
        j5b j5bVar2 = j5bVarArr[1];
        j5b j5bVar3 = j5bVarArr[0];
        j5bVar2.g(j5bVar3.n, j5bVar3.o, j5bVar3.p);
        j5b j5bVar4 = j5bVarArr[1];
        j5b j5bVar5 = j5bVarArr[0];
        j5bVar4.q = j5bVar5.q;
        j5bVar4.r.e(true, j5bVar5.r.c);
        j5bVarArr[0].g(charSequence, g5bVar, g5bVar2);
        j5b j5bVar6 = j5bVarArr[0];
        j5bVar6.q = z;
        j5bVar6.r.e(true, 0.0f);
        this.H = 1.0f;
        ValueAnimator valueAnimator2 = this.J;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.I = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new rha(this, (byte) 16));
        this.J.addListener(new c39((Object) this, (byte) 29));
        this.J.setDuration(180L);
        this.J.setInterpolator(d53.g);
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
    /* JADX WARN: Type inference failed for: r8v14, types: [g5b] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        j5b[] j5bVarArr;
        j5b j5bVar;
        ?? r13;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        Layout staticTextLayout;
        j5b j5bVar2;
        j5b j5bVar3;
        boolean contains;
        ?? r132;
        g5b g5bVar;
        boolean z5;
        l5b l5bVar = this.K;
        pkb pkbVar = l5bVar.W;
        if (motionEvent.getAction() == 0) {
            l5bVar.g0 = motionEvent.getX();
            l5bVar.h0 = motionEvent.getY();
        }
        l5bVar.i0 = motionEvent.getX();
        l5bVar.j0 = motionEvent.getY();
        if (this.w != null) {
            RectF rectF = gm.P;
            float f = this.n;
            rectF.set(f, this.h, r4.getWidth() + f, this.h + this.w.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z = false;
                j5bVarArr = this.r;
                j5bVar = j5bVarArr[0];
                if (j5bVar != null || (g5bVar = j5bVar.o) == null) {
                    r13 = 0;
                    z2 = false;
                    i = 0;
                } else {
                    i = gm.L(8.0f) + g5bVar.b();
                    RectF rectF2 = gm.P;
                    int i2 = this.F;
                    int i3 = this.G;
                    g5b g5bVar2 = j5bVarArr[0].o;
                    rectF2.set(i2, i3, i2 + g5bVar2.x, g5bVar2.b() + i3);
                    z2 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                    if (z2) {
                        z = false;
                    }
                    if (motionEvent.getAction() == 0 && z2) {
                        j5bVarArr[0].o.e(motionEvent.getX(), motionEvent.getY(), true);
                        r13 = 0;
                    } else if (motionEvent.getAction() == 2) {
                        g5b g5bVar3 = j5bVarArr[0].o;
                        if (g5bVar3.i.i && !z2) {
                            r13 = 0;
                            g5bVar3.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                        r13 = 0;
                    } else {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (motionEvent.getAction() == 1 && z2) {
                                z5 = false;
                                z5 = false;
                                g5b g5bVar4 = j5bVarArr[0].o;
                                if (g5bVar4.i.i) {
                                    l5bVar.I(g5bVar4);
                                }
                            } else {
                                z5 = false;
                            }
                            j5bVarArr[z5 ? 1 : 0].o.e(motionEvent.getX(), motionEvent.getY(), z5);
                            r13 = z5;
                        }
                        r13 = 0;
                    }
                }
                if (!z2 && (j5bVar3 = j5bVarArr[r13]) != null && j5bVar3.p != null) {
                    RectF rectF3 = gm.P;
                    float f2 = this.F;
                    float U1 = (gm.U1(this.x, j5bVar3.m, j5bVar3.l) + this.G) - j5bVarArr[0].p.b();
                    int i4 = this.F;
                    j5b j5bVar4 = j5bVarArr[0];
                    rectF3.set(f2, U1, i4 + j5bVar4.p.x, gm.U1(this.x, j5bVar4.m, j5bVar4.l) + this.G);
                    contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                    if (contains) {
                        z = false;
                    }
                    if (motionEvent.getAction() != 0 && contains) {
                        j5bVarArr[0].p.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() != 2) {
                        g5b g5bVar5 = j5bVarArr[0].p;
                        if (g5bVar5.i.i && !contains) {
                            g5bVar5.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && contains) {
                            r132 = 0;
                            r132 = 0;
                            g5b g5bVar6 = j5bVarArr[0].p;
                            if (g5bVar6.i.i) {
                                l5bVar.I(g5bVar6);
                            }
                        } else {
                            r132 = 0;
                        }
                        j5bVarArr[r132].p.e(motionEvent.getX(), motionEvent.getY(), r132);
                    }
                    if (contains) {
                        return true;
                    }
                }
                if (z && (l5bVar.v0 || (j5bVar2 = j5bVarArr[0]) == null || j5bVar2.g == null)) {
                    float f3 = this.F;
                    float f4 = this.G + i;
                    Rect rect = pkbVar.B;
                    k5b k5bVar = pkbVar.p0;
                    staticTextLayout = k5bVar.getStaticTextLayout();
                    if (staticTextLayout != null) {
                        rect.setEmpty();
                        pkbVar.X = null;
                    } else {
                        pkbVar.X = k5bVar;
                        int i5 = (int) f3;
                        pkbVar.c = i5;
                        int i6 = (int) f4;
                        pkbVar.d = i6;
                        vj2 vj2Var = pkbVar.a0;
                        vj2Var.d = staticTextLayout;
                        vj2Var.c = f3;
                        vj2Var.b = f4;
                        vj2Var.a = 0;
                        rect.set(i5, i6, (int) (f3 + staticTextLayout.getWidth()), (int) (f4 + staticTextLayout.getHeight()));
                    }
                    pkbVar.L(motionEvent);
                }
                if (pkbVar.w() && z && this.E) {
                    z4 = false;
                    if (((GestureDetector) ((lj4) j5bVarArr[0].k.d).a).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        pkbVar.e(false);
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
        j5bVarArr = this.r;
        j5bVar = j5bVarArr[0];
        if (j5bVar != null) {
        }
        r13 = 0;
        z2 = false;
        i = 0;
        if (!z2) {
            RectF rectF32 = gm.P;
            float f22 = this.F;
            float U12 = (gm.U1(this.x, j5bVar3.m, j5bVar3.l) + this.G) - j5bVarArr[0].p.b();
            int i42 = this.F;
            j5b j5bVar42 = j5bVarArr[0];
            rectF32.set(f22, U12, i42 + j5bVar42.p.x, gm.U1(this.x, j5bVar42.m, j5bVar42.l) + this.G);
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
            Rect rect2 = pkbVar.B;
            k5b k5bVar2 = pkbVar.p0;
            staticTextLayout = k5bVar2.getStaticTextLayout();
            if (staticTextLayout != null) {
            }
            pkbVar.L(motionEvent);
        }
        if (pkbVar.w()) {
        }
        z3 = true;
        z4 = false;
        if (super.dispatchTouchEvent(motionEvent)) {
            return z3;
        }
    }

    public float getAnimatedHeight() {
        int i = this.G << 1;
        j5b[] j5bVarArr = this.r;
        int i2 = j5bVarArr[0].l;
        return gm.U1(this.H, i2, j5bVarArr[1] != null ? r1.l : 0) + i;
    }

    public Paint getPaint() {
        return this.c;
    }

    @Override // okb
    public Layout getStaticTextLayout() {
        return this.r[0].e;
    }

    @Override // okb
    public CharSequence getText() {
        return this.r[0].n;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        j5b j5bVar = this.r[0];
        k5b k5bVar = j5bVar.v;
        gn.release(k5bVar, j5bVar.d);
        gn.release(k5bVar, j5bVar.f);
        if (j5bVar.h == null) {
            return;
        }
        while (true) {
            h5b[] h5bVarArr = j5bVar.h;
            if (i >= h5bVarArr.length) {
                return;
            }
            h5b h5bVar = h5bVarArr[i];
            if (h5bVar != null) {
                gn.release(k5bVar, h5bVar.a);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), nm7.d4, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        j5b[] j5bVarArr = this.r;
        j5bVarArr[0].b(canvas2, 1.0f - this.H);
        j5b j5bVar = j5bVarArr[1];
        if (j5bVar != null) {
            j5bVar.b(canvas2, this.H);
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
            canvas2.translate(this.n - gm.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, gm.L(32.0f), this.w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - gm.L(16.0f), scrollY, getMeasuredWidth(), this.w.getHeight() + scrollY + this.G, paint2);
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
        this.F = gm.L(16.0f);
        this.G = gm.L(8.0f);
        int i4 = this.s;
        j5b[] j5bVarArr = this.r;
        if (i4 != i3) {
            this.s = i3;
            int max = Math.max(0, View.MeasureSpec.getSize(i) - (this.F << 1));
            j5bVarArr[0].e(max);
            j5b j5bVar = j5bVarArr[1];
            if (j5bVar != null) {
                j5bVar.e(max);
            }
        }
        int i5 = this.G << 1;
        int i6 = j5bVarArr[0].l;
        j5b j5bVar2 = j5bVarArr[1];
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.U1(this.H, i6, j5bVar2 != null ? j5bVar2.l : 0) + i5, TLObject.FLAG_30));
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
        r13 = new m66(r9[0], null, r20.getX(), r20.getY(), 0);
        r1.a = r13;
        r13.d(cmb.p1(0.2f, -1));
        r3.a(r1.a, null);
        r9 = r5.getSpanStart(r1.a.i);
        r12 = r5.getSpanEnd(r1.a.i);
        r13 = r1.a.b();
        r13.d(r1.e, r9, r4.getPaddingTop());
        r1.e.getSelectionPath(r9, r12, r13);
        r9 = r1.a;
        r6.W.e(false);
        r4.postDelayed(new uva(r1, r9, 24), android.view.ViewConfiguration.getLongPressTimeout());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016f, code lost:
    
        if (r1.a != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0171, code lost:
    
        if (r4 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0173, code lost:
    
        r5 = (gn[]) r5.getSpans(r11, r11, gn.class);
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
    
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, f6c.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r4 = false;
        r9 = null;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0090, code lost:
    
        r9 = gm.L(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0081, code lost:
    
        r10 = gm.L(8.0f) + r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x004a, code lost:
    
        if (r20.getAction() != 0) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j5b[] j5bVarArr;
        if (!this.K.s0 && (j5bVarArr = this.r) != null) {
            j5b j5bVar = j5bVarArr[0];
            if (j5bVar.e != null) {
                i66 i66Var = j5bVar.c;
                k5b k5bVar = j5bVar.v;
                StaticLayout staticLayout = k5bVar.w;
                l5b l5bVar = k5bVar.K;
                if (staticLayout != null) {
                    RectF rectF = gm.P;
                    float f = k5bVar.n;
                    rectF.set(f, k5bVar.h, staticLayout.getWidth() + f, k5bVar.h + k5bVar.w.getHeight());
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
        j5b j5bVar;
        g5b g5bVar;
        g5b g5bVar2;
        g5b g5bVar3;
        g5b g5bVar4;
        j5b[] j5bVarArr = this.r;
        j5b j5bVar2 = j5bVarArr[0];
        if ((j5bVar2 == null || (j5bVar2.s != drawable && (((g5bVar3 = j5bVar2.o) == null || g5bVar3.j != drawable) && ((g5bVar4 = j5bVar2.p) == null || g5bVar4.j != drawable)))) && ((j5bVar = j5bVarArr[1]) == null || (j5bVar.s != drawable && (((g5bVar = j5bVar.o) == null || g5bVar.j != drawable) && ((g5bVar2 = j5bVar.p) == null || g5bVar2.j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
