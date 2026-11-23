package fi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.q80;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v7 {
    public n80 a;
    public org.telegram.ui.Components.y5 b;
    public final n2.o0 c;
    public org.telegram.ui.Components.u5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.u5 f;
    public StaticLayout g;
    public t7[] h;
    public final ArrayList i;
    public final Stack j;
    public final gf.c k;
    public int l;
    public int m;
    public CharSequence n;
    public s7 o;
    public s7 p;
    public boolean q;
    public final org.telegram.ui.Components.d6 r;
    public final q80 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ w7 v;

    public v7(w7 w7Var) {
        this.v = w7Var;
        this.c = new n2.o0(w7Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.d6(w7Var.K, 0L, 400L, nr.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new gf.c(w7Var, arrayList, new di.v6(this, 11));
        q80 q80Var = new q80();
        this.s = q80Var;
        q80Var.y = path;
        q80Var.k(4.0f);
        q80Var.g(org.telegram.ui.ActionBar.m6.r1(0.3f, -1), org.telegram.ui.ActionBar.m6.r1(0.1f, -1), org.telegram.ui.ActionBar.m6.r1(0.2f, -1), org.telegram.ui.ActionBar.m6.r1(0.7f, -1));
        q80Var.setCallback(w7Var);
    }

    public final int a(int i7) {
        int i10;
        s7 s7Var = this.o;
        int i11 = 0;
        if (s7Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + s7Var.b();
        } else {
            i10 = 0;
        }
        s7 s7Var2 = this.p;
        if (s7Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + s7Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.e;
        w7 w7Var = this.v;
        if (staticLayout == null) {
            return i7 - ((w7Var.G * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!w7Var.b) {
            return i7 - ((w7Var.G * 2) + this.l);
        }
        return (i7 - ((Math.min(3, lineCount) + 1) * w7Var.c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        w7 w7Var = this.v;
        x7 x7Var = w7Var.K;
        float d = this.r.d(this.q);
        if (f10 <= 0.0f) {
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(f10, 0.7f * f10, d);
        if (T1 >= 1.0f) {
            c(canvas, d);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, x7Var.getWidth(), x7Var.getHeight(), (int) (T1 * 255.0f), 31);
            c(canvas2, d);
            canvas2.restore();
        }
        if (d > 0.0f || this.q) {
            int i7 = (int) (d * 255.0f * T1);
            q80 q80Var = this.s;
            q80Var.setAlpha(i7);
            q80Var.draw(canvas2);
            w7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        w7 w7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = w7Var.a;
        x7 x7Var = w7Var.K;
        if (this.o != null) {
            canvas.save();
            canvas.translate(w7Var.F, w7Var.G);
            s7 s7Var = this.o;
            int width = w7Var.getWidth();
            int i11 = w7Var.F;
            s7Var.a(canvas, (width - i11) - i11);
            int L = org.telegram.messenger.g0.L(8.0f) + this.o.b();
            canvas.restore();
            i7 = L;
        } else {
            i7 = 0;
        }
        canvas.save();
        canvas.translate(w7Var.F, w7Var.G + i7);
        if (this.c.h(canvas)) {
            w7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        boolean z10 = f10 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (x7Var.a0.x()) {
                canvas.save();
                canvas.translate(w7Var.F, w7Var.G + i7);
                x7Var.a0.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(w7Var.F, w7Var.G + i7);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.u5 update = org.telegram.ui.Components.y5.update(0, w7Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, w7Var.F, w7Var.G + i7);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    t7[] t7VarArr = this.h;
                    if (i12 >= t7VarArr.length) {
                        break;
                    }
                    t7 t7Var = t7VarArr[i12];
                    if (t7Var != null) {
                        canvas.save();
                        float f12 = t7Var.c;
                        float f13 = t7Var.e;
                        if (f12 != f13) {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, w7Var.x);
                            float T12 = org.telegram.messenger.g0.T1(t7Var.d, t7Var.f, nr.g.getInterpolation(w7Var.x));
                            canvas.translate(w7Var.F + T1, w7Var.G + i7 + T12);
                            if (z10) {
                                f(t7Var.b, w7Var.F + T1, w7Var.G + i7 + T12);
                            }
                            t7Var.b.draw(canvas);
                            org.telegram.ui.Components.u5 update2 = org.telegram.ui.Components.y5.update(0, w7Var, t7Var.a, t7Var.b);
                            t7Var.a = update2;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, t7Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (w7Var.x != f11) {
                            canvas.translate(w7Var.F + f13, w7Var.G + i7 + t7Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, t7Var.b.getWidth(), t7Var.b.getHeight(), (int) (w7Var.x * 255.0f), 31);
                            d(t7Var.b, canvas, arrayList);
                            if (z10) {
                                f(t7Var.b, w7Var.F + t7Var.e, w7Var.G + i7 + t7Var.f);
                            }
                            t7Var.b.draw(canvas);
                            org.telegram.ui.Components.u5 update3 = org.telegram.ui.Components.y5.update(0, w7Var, t7Var.a, t7Var.b);
                            t7Var.a = update3;
                            arrayList2 = arrayList;
                            i10 = i12;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, t7Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, w7Var.x, porterDuffColorFilter);
                            canvas.restore();
                        }
                        canvas.restore();
                        i12 = i10 + 1;
                        arrayList = arrayList2;
                        f11 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i10 = i12;
                    i12 = i10 + 1;
                    arrayList = arrayList2;
                    f11 = 0.0f;
                }
            }
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(w7Var.F, w7Var.G + i7);
            if (x7Var.a0.x()) {
                x7Var.a0.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.u5 update4 = org.telegram.ui.Components.y5.update(0, w7Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, w7Var.F, w7Var.G + i7);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(w7Var.F, (org.telegram.messenger.g0.W1(w7Var.x, this.m, this.l) + w7Var.G) - this.p.b());
            s7 s7Var2 = this.p;
            int width2 = w7Var.getWidth();
            int i13 = w7Var.F;
            s7Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            xh.f.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    public final void e(int i7) {
        int i10;
        w7 w7Var = this.v;
        x7 x7Var = w7Var.K;
        TextPaint textPaint = w7Var.d;
        v7[] v7VarArr = w7Var.r;
        TextPaint textPaint2 = w7Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            s7 s7Var = this.o;
            if (s7Var != null) {
                this.l = org.telegram.messenger.g0.L(4.0f) + s7Var.b();
            }
            s7 s7Var2 = this.p;
            if (s7Var2 != null) {
                this.l = org.telegram.messenger.f3.C(4.0f, s7Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == v7VarArr[0]) {
                w7Var.w = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = w7.a(w7Var, textPaint2, this.n, i7);
        this.e = a10;
        this.l = a10.getHeight();
        s7 s7Var3 = this.o;
        int L = s7Var3 != null ? org.telegram.messenger.g0.L(8.0f) + s7Var3.b() : 0;
        s7 s7Var4 = this.p;
        if (s7Var4 != null) {
            this.l = org.telegram.messenger.f3.C(8.0f, s7Var4.b(), this.l);
        }
        this.l += L;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        w7Var.b = z10;
        if (z10) {
            i10 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    w7Var.b = false;
                }
            }
        } else {
            i10 = 3;
        }
        if (w7Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == v7VarArr[0]) {
                String N0 = hd.N0(2131745143, null);
                w7Var.w = w7.a(w7Var, textPaint, N0, i7);
                w7Var.h = ((w7Var.G + L) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                w7Var.n = (w7Var.F + i7) - textPaint.measureText(N0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            s7 s7Var5 = this.o;
            int L2 = topPadding2 + (s7Var5 != null ? org.telegram.messenger.g0.L(8.0f) + s7Var5.b() : 0);
            s7 s7Var6 = this.p;
            this.m = L2 + (s7Var6 != null ? org.telegram.messenger.g0.L(8.0f) + s7Var6.b() : 0);
            this.g = w7.a(w7Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i7);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(x7Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i11 = 0;
                while (true) {
                    t7[] t7VarArr = this.h;
                    if (i11 >= t7VarArr.length) {
                        break;
                    }
                    t7 t7Var = t7VarArr[i11];
                    if (t7Var != null) {
                        org.telegram.ui.Components.y5.release(x7Var, t7Var.a);
                    }
                    i11++;
                }
            }
            this.h = new t7[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i12 = i10; i12 < this.e.getLineCount(); i12++) {
                    int lineStart = this.e.getLineStart(i12);
                    int lineEnd = this.e.getLineEnd(i12);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i12 - 3] = null;
                    } else {
                        StaticLayout a11 = w7.a(w7Var, textPaint2, subSequence, i7);
                        t7 t7Var2 = new t7();
                        this.h[i12 - 3] = t7Var2;
                        t7Var2.b = a11;
                        t7Var2.e = this.e.getLineLeft(i12);
                        t7Var2.f = this.e.getTopPadding() + this.e.getLineTop(i12);
                        if (lineRight < w7Var.n - org.telegram.messenger.g0.L(16.0f)) {
                            t7Var2.d = topPadding;
                            t7Var2.c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            t7Var2.d = t7Var2.f;
                            t7Var2.c = t7Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == v7VarArr[0]) {
                w7Var.w = null;
            }
            this.g = null;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(w7Var, this.e, stack, arrayList);
        }
        int i13 = w7Var.F;
        int i14 = w7Var.G;
        gf.c cVar = this.k;
        cVar.a = i13;
        cVar.c = i14;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12 = 0.0f;
        int i7 = 0;
        while (i7 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i7);
            w7 w7Var = this.v;
            float f13 = lineLeft - (w7Var.F / 3.0f);
            float lineRight = (w7Var.F / 3.0f) + layout.getLineRight(i7);
            if (i7 == 0) {
                f12 = layout.getLineTop(i7) - (w7Var.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i7);
            float f14 = i7 >= layout.getLineCount() + (-1) ? (w7Var.G / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f10 + f13, f11 + f12, f10 + lineRight, f11 + f14, Path.Direction.CW);
            i7++;
            f12 = f14;
        }
    }

    public final void g(CharSequence charSequence, s7 s7Var, s7 s7Var2) {
        this.n = charSequence;
        this.o = s7Var;
        this.p = s7Var2;
        w7 w7Var = this.v;
        if (s7Var != null) {
            u7 u7Var = new u7(this, 0);
            s7Var.r = w7Var;
            s7Var.s = u7Var;
            new ok0(w7Var);
            s7Var.j.setCallback(w7Var);
            s7Var.h.a = w7Var;
            s7Var.i.a = w7Var;
            s7Var.c();
        }
        s7 s7Var3 = this.p;
        if (s7Var3 != null) {
            u7 u7Var2 = new u7(this, 1);
            s7Var3.r = w7Var;
            s7Var3.s = u7Var2;
            new ok0(w7Var);
            s7Var3.j.setCallback(w7Var);
            s7Var3.h.a = w7Var;
            s7Var3.i.a = w7Var;
            s7Var3.c();
        }
        w7Var.s = 0;
        w7Var.requestLayout();
    }
}
