package ih;

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
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.rv0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d8 extends View implements w9 {
    public int A;
    public int B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final /* synthetic */ e8 F;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final c8[] r;
    public int s;
    public StaticLayout v;
    public float w;
    public boolean x;
    public final boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(e8 e8Var, Context context) {
        super(context);
        this.F = e8Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = new c8[]{new c8(this), null};
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

    public static StaticLayout a(d8 d8Var, TextPaint textPaint, CharSequence charSequence, int i9) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9).setBreakStrategy(0).setHyphenationFrequency(0);
        if (LocaleController.isRTL) {
            alignment = rv0.a();
        } else {
            Layout.Alignment[] alignmentArr = rv0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    public final void b(CharSequence charSequence, z7 z7Var, z7 z7Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        c8[] c8VarArr = this.r;
        if (MediaDataController.stringsEqual(c8VarArr[0].n, charSequence)) {
            c8 c8Var = c8VarArr[0];
            if (c8Var.o == z7Var && c8Var.p == z7Var2) {
                c8Var.q = z10;
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
            c8VarArr[0].g(charSequence, z7Var, z7Var2);
            c8VarArr[0].q = z10;
            invalidate();
            this.C = 0.0f;
            return;
        }
        if (c8VarArr[1] == null) {
            c8VarArr[1] = new c8(this);
        }
        c8 c8Var2 = c8VarArr[1];
        c8 c8Var3 = c8VarArr[0];
        c8Var2.g(c8Var3.n, c8Var3.o, c8Var3.p);
        c8 c8Var4 = c8VarArr[1];
        c8 c8Var5 = c8VarArr[0];
        c8Var4.q = c8Var5.q;
        c8Var4.r.d(c8Var5.r.c, true);
        c8VarArr[0].g(charSequence, z7Var, z7Var2);
        c8 c8Var6 = c8VarArr[0];
        c8Var6.q = z10;
        c8Var6.r.d(0.0f, true);
        this.C = 1.0f;
        ValueAnimator valueAnimator2 = this.E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 23));
        this.E.addListener(new ag.e(this, 19));
        this.E.setDuration(180L);
        this.E.setInterpolator(gr.g);
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
    /* JADX WARN: Type inference failed for: r8v14, types: [ih.z7] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        c8[] c8VarArr;
        c8 c8Var;
        ?? r13;
        boolean z11;
        int i9;
        boolean z12;
        boolean z13;
        Layout staticTextLayout;
        c8 c8Var2;
        c8 c8Var3;
        boolean contains;
        ?? r132;
        z7 z7Var;
        boolean z14;
        e8 e8Var = this.F;
        x9 x9Var = e8Var.S;
        if (motionEvent.getAction() == 0) {
            e8Var.c0 = motionEvent.getX();
            e8Var.d0 = motionEvent.getY();
        }
        e8Var.e0 = motionEvent.getX();
        e8Var.f0 = motionEvent.getY();
        if (this.v != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = this.n;
            rectF.set(f10, this.h, r4.getWidth() + f10, this.h + this.v.getHeight());
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = false;
                c8VarArr = this.r;
                c8Var = c8VarArr[0];
                if (c8Var != null || (z7Var = c8Var.o) == null) {
                    r13 = 0;
                    z11 = false;
                    i9 = 0;
                } else {
                    i9 = AndroidUtilities.dp(8.0f) + z7Var.b();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i10 = this.A;
                    int i11 = this.B;
                    z7 z7Var2 = c8VarArr[0].o;
                    rectF2.set(i10, i11, i10 + z7Var2.x, z7Var2.b() + i11);
                    z11 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                    if (z11) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() == 0 && z11) {
                        c8VarArr[0].o.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() == 2) {
                        z7 z7Var3 = c8VarArr[0].o;
                        if (z7Var3.i.h && !z11) {
                            r13 = 0;
                            z7Var3.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && z11) {
                            z14 = false;
                            z14 = false;
                            z7 z7Var4 = c8VarArr[0].o;
                            if (z7Var4.i.h) {
                                e8Var.I(z7Var4);
                            }
                        } else {
                            z14 = false;
                        }
                        c8VarArr[z14 ? 1 : 0].o.e(motionEvent.getX(), motionEvent.getY(), z14);
                        r13 = z14;
                    }
                    r13 = 0;
                }
                if (!z11 && (c8Var3 = c8VarArr[r13]) != null && c8Var3.p != null) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f11 = this.A;
                    float lerp = (AndroidUtilities.lerp(c8Var3.m, c8Var3.l, this.w) + this.B) - c8VarArr[0].p.b();
                    int i12 = this.A;
                    c8 c8Var4 = c8VarArr[0];
                    rectF3.set(f11, lerp, i12 + c8Var4.p.x, AndroidUtilities.lerp(c8Var4.m, c8Var4.l, this.w) + this.B);
                    contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                    if (contains) {
                        z10 = false;
                    }
                    if (motionEvent.getAction() != 0 && contains) {
                        c8VarArr[0].p.e(motionEvent.getX(), motionEvent.getY(), true);
                    } else if (motionEvent.getAction() != 2) {
                        z7 z7Var5 = c8VarArr[0].p;
                        if (z7Var5.i.h && !contains) {
                            z7Var5.e(motionEvent.getX(), motionEvent.getY(), false);
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (motionEvent.getAction() == 1 && contains) {
                            r132 = 0;
                            r132 = 0;
                            z7 z7Var6 = c8VarArr[0].p;
                            if (z7Var6.i.h) {
                                e8Var.I(z7Var6);
                            }
                        } else {
                            r132 = 0;
                        }
                        c8VarArr[r132].p.e(motionEvent.getX(), motionEvent.getY(), r132);
                    }
                    if (contains) {
                        return true;
                    }
                }
                if (z10 && (e8Var.r0 || (c8Var2 = c8VarArr[0]) == null || c8Var2.g == null)) {
                    float f12 = this.A;
                    float f13 = this.B + i9;
                    Rect rect = x9Var.B;
                    w9 w9Var = x9Var.u0;
                    staticTextLayout = w9Var.getStaticTextLayout();
                    if (staticTextLayout != null) {
                        rect.setEmpty();
                        x9Var.X = null;
                    } else {
                        x9Var.X = w9Var;
                        int i13 = (int) f12;
                        x9Var.c = i13;
                        int i14 = (int) f13;
                        x9Var.d = i14;
                        org.telegram.ui.Cells.q9 q9Var = x9Var.a0;
                        q9Var.b = staticTextLayout;
                        q9Var.d = f12;
                        q9Var.c = f13;
                        q9Var.a = 0;
                        rect.set(i13, i14, (int) (f12 + staticTextLayout.getWidth()), (int) (f13 + staticTextLayout.getHeight()));
                    }
                    x9Var.N(motionEvent);
                }
                if (x9Var.y() && z10 && this.y) {
                    z13 = false;
                    if (((GestureDetector) c8VarArr[0].k.a.b).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        x9Var.f(false);
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
        c8VarArr = this.r;
        c8Var = c8VarArr[0];
        if (c8Var != null) {
        }
        r13 = 0;
        z11 = false;
        i9 = 0;
        if (!z11) {
            RectF rectF32 = AndroidUtilities.rectTmp;
            float f112 = this.A;
            float lerp2 = (AndroidUtilities.lerp(c8Var3.m, c8Var3.l, this.w) + this.B) - c8VarArr[0].p.b();
            int i122 = this.A;
            c8 c8Var42 = c8VarArr[0];
            rectF32.set(f112, lerp2, i122 + c8Var42.p.x, AndroidUtilities.lerp(c8Var42.m, c8Var42.l, this.w) + this.B);
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
            float f132 = this.B + i9;
            Rect rect2 = x9Var.B;
            w9 w9Var2 = x9Var.u0;
            staticTextLayout = w9Var2.getStaticTextLayout();
            if (staticTextLayout != null) {
            }
            x9Var.N(motionEvent);
        }
        if (x9Var.y()) {
        }
        z12 = true;
        z13 = false;
        if (super.dispatchTouchEvent(motionEvent)) {
            return z12;
        }
    }

    public float getAnimatedHeight() {
        int i9 = this.B * 2;
        c8[] c8VarArr = this.r;
        int i10 = c8VarArr[0].l;
        return AndroidUtilities.lerp(i10, c8VarArr[1] != null ? r1.l : 0, this.C) + i9;
    }

    public Paint getPaint() {
        return this.c;
    }

    @Override // org.telegram.ui.Cells.w9
    public Layout getStaticTextLayout() {
        return this.r[0].e;
    }

    @Override // org.telegram.ui.Cells.w9
    public CharSequence getText() {
        return this.r[0].n;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        c8 c8Var = this.r[0];
        d8 d8Var = c8Var.v;
        org.telegram.ui.Components.t5.release(d8Var, c8Var.d);
        org.telegram.ui.Components.t5.release(d8Var, c8Var.f);
        if (c8Var.h == null) {
            return;
        }
        while (true) {
            a8[] a8VarArr = c8Var.h;
            if (i9 >= a8VarArr.length) {
                return;
            }
            a8 a8Var = a8VarArr[i9];
            if (a8Var != null) {
                org.telegram.ui.Components.t5.release(d8Var, a8Var.a);
            }
            i9++;
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
        c8[] c8VarArr = this.r;
        c8VarArr[0].b(canvas2, 1.0f - this.C);
        c8 c8Var = c8VarArr[1];
        if (c8Var != null) {
            c8Var.b(canvas2, this.C);
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
    public final void onMeasure(int i9, int i10) {
        int i11 = (i10 + i9) << 16;
        this.A = AndroidUtilities.dp(16.0f);
        this.B = AndroidUtilities.dp(8.0f);
        int i12 = this.s;
        c8[] c8VarArr = this.r;
        if (i12 != i11) {
            this.s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i9) - (this.A * 2));
            c8VarArr[0].e(max);
            c8 c8Var = c8VarArr[1];
            if (c8Var != null) {
                c8Var.e(max);
            }
        }
        int i13 = this.B * 2;
        int i14 = c8VarArr[0].l;
        c8 c8Var2 = c8VarArr[1];
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i14, c8Var2 != null ? c8Var2.l : 0, this.C) + i13, TLObject.FLAG_30));
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
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01be, code lost:
    
        if (r4 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01c4, code lost:
    
        if (super.onTouchEvent(r20) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c6, code lost:
    
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
        r13 = new org.telegram.ui.Components.m80(r9[0], null, r20.getX(), r20.getY(), 0);
        r1.a = r13;
        r13.d(org.telegram.ui.ActionBar.f6.l1(0.2f, -1));
        r3.a(r1.a, null);
        r9 = r5.getSpanStart(r1.a.i);
        r12 = r5.getSpanEnd(r1.a.i);
        r13 = r1.a.b();
        r13.d(r1.e, r9, r4.getPaddingTop());
        r1.e.getSelectionPath(r9, r12, r13);
        r9 = r1.a;
        r6.S.f(false);
        r4.postDelayed(new ih.j7(3, r1, r9), android.view.ViewConfiguration.getLongPressTimeout());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0174, code lost:
    
        if (r1.a != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0176, code lost:
    
        if (r4 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0178, code lost:
    
        r5 = (org.telegram.ui.Components.t5[]) r5.getSpans(r11, r11, org.telegram.ui.Components.t5.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0180, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0183, code lost:
    
        if (r5.length == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0185, code lost:
    
        r9 = r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018b, code lost:
    
        if (r20.getAction() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018d, code lost:
    
        r1.a = null;
        r1.b = r5[0];
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019e, code lost:
    
        if (r20.getAction() != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a0, code lost:
    
        r3.d(true);
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a5, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a7, code lost:
    
        r3 = r3.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a9, code lost:
    
        if (r3 != r10) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ab, code lost:
    
        r6.G(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b8, code lost:
    
        r1.a = null;
        r1.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01af, code lost:
    
        r3 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b1, code lost:
    
        if (r3 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b3, code lost:
    
        if (r3 != r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b5, code lost:
    
        r6.F(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016e, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0170, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f4, code lost:
    
        r9 = (android.text.style.CharacterStyle[]) r5.getSpans(r11, r11, org.telegram.ui.Components.o41.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
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
        c8[] c8VarArr;
        if (!this.F.o0 && (c8VarArr = this.r) != null) {
            c8 c8Var = c8VarArr[0];
            if (c8Var.e != null) {
                i80 i80Var = c8Var.c;
                d8 d8Var = c8Var.v;
                StaticLayout staticLayout = d8Var.v;
                e8 e8Var = d8Var.F;
                if (staticLayout != null) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f10 = d8Var.n;
                    rectF.set(f10, d8Var.h, staticLayout.getWidth() + f10, d8Var.h + d8Var.v.getHeight());
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
        c8 c8Var;
        z7 z7Var;
        z7 z7Var2;
        z7 z7Var3;
        z7 z7Var4;
        c8[] c8VarArr = this.r;
        c8 c8Var2 = c8VarArr[0];
        if ((c8Var2 == null || (c8Var2.s != drawable && (((z7Var3 = c8Var2.o) == null || z7Var3.j != drawable) && ((z7Var4 = c8Var2.p) == null || z7Var4.j != drawable)))) && ((c8Var = c8VarArr[1]) == null || (c8Var.s != drawable && (((z7Var = c8Var.o) == null || z7Var.j != drawable) && ((z7Var2 = c8Var.p) == null || z7Var2.j != drawable))))) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
