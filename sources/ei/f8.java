package ei;

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
import org.telegram.messenger.bd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f8 {
    public t70 a;
    public org.telegram.ui.Components.p5 b;
    public final m2.p0 c;
    public org.telegram.ui.Components.l5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.l5 f;
    public StaticLayout g;
    public d8[] h;
    public final ArrayList i;
    public final Stack j;
    public final df.c k;
    public int l;
    public int m;
    public CharSequence n;
    public c8 o;
    public c8 p;
    public boolean q;
    public final org.telegram.ui.Components.u5 r;
    public final w70 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ g8 v;

    public f8(g8 g8Var) {
        this.v = g8Var;
        this.c = new m2.p0(g8Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.u5(g8Var.K, 0L, 400L, xq.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new df.c(g8Var, arrayList, new a1.c(this, 29));
        w70 w70Var = new w70();
        this.s = w70Var;
        w70Var.y = path;
        w70Var.k(4.0f);
        w70Var.g(org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
        w70Var.setCallback(g8Var);
    }

    public final int a(int i3) {
        int i10;
        c8 c8Var = this.o;
        int i11 = 0;
        if (c8Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + c8Var.b();
        } else {
            i10 = 0;
        }
        c8 c8Var2 = this.p;
        if (c8Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + c8Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.e;
        g8 g8Var = this.v;
        if (staticLayout == null) {
            return i3 - ((g8Var.G * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!g8Var.b) {
            return i3 - ((g8Var.G * 2) + this.l);
        }
        return (i3 - ((Math.min(3, lineCount) + 1) * g8Var.c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        g8 g8Var = this.v;
        h8 h8Var = g8Var.K;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, h8Var.getWidth(), h8Var.getHeight(), (int) (T1 * 255.0f), 31);
            c(canvas2, d);
            canvas2.restore();
        }
        if (d > 0.0f || this.q) {
            int i3 = (int) (d * 255.0f * T1);
            w70 w70Var = this.s;
            w70Var.setAlpha(i3);
            w70Var.draw(canvas2);
            g8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i3;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        g8 g8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = g8Var.a;
        h8 h8Var = g8Var.K;
        if (this.o != null) {
            canvas.save();
            canvas.translate(g8Var.F, g8Var.G);
            c8 c8Var = this.o;
            int width = g8Var.getWidth();
            int i11 = g8Var.F;
            c8Var.a(canvas, (width - i11) - i11);
            int L = org.telegram.messenger.g0.L(8.0f) + this.o.b();
            canvas.restore();
            i3 = L;
        } else {
            i3 = 0;
        }
        canvas.save();
        canvas.translate(g8Var.F, g8Var.G + i3);
        if (this.c.h(canvas)) {
            g8Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        boolean z10 = f10 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (h8Var.a0.x()) {
                canvas.save();
                canvas.translate(g8Var.F, g8Var.G + i3);
                h8Var.a0.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(g8Var.F, g8Var.G + i3);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.l5 update = org.telegram.ui.Components.p5.update(0, g8Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, g8Var.F, g8Var.G + i3);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    d8[] d8VarArr = this.h;
                    if (i12 >= d8VarArr.length) {
                        break;
                    }
                    d8 d8Var = d8VarArr[i12];
                    if (d8Var != null) {
                        canvas.save();
                        float f12 = d8Var.c;
                        float f13 = d8Var.e;
                        if (f12 != f13) {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, g8Var.x);
                            float T12 = org.telegram.messenger.g0.T1(d8Var.d, d8Var.f, xq.g.getInterpolation(g8Var.x));
                            canvas.translate(g8Var.F + T1, g8Var.G + i3 + T12);
                            if (z10) {
                                f(d8Var.b, g8Var.F + T1, g8Var.G + i3 + T12);
                            }
                            d8Var.b.draw(canvas);
                            org.telegram.ui.Components.l5 update2 = org.telegram.ui.Components.p5.update(0, g8Var, d8Var.a, d8Var.b);
                            d8Var.a = update2;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, d8Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (g8Var.x != f11) {
                            canvas.translate(g8Var.F + f13, g8Var.G + i3 + d8Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, d8Var.b.getWidth(), d8Var.b.getHeight(), (int) (g8Var.x * 255.0f), 31);
                            d(d8Var.b, canvas, arrayList);
                            if (z10) {
                                f(d8Var.b, g8Var.F + d8Var.e, g8Var.G + i3 + d8Var.f);
                            }
                            d8Var.b.draw(canvas);
                            org.telegram.ui.Components.l5 update3 = org.telegram.ui.Components.p5.update(0, g8Var, d8Var.a, d8Var.b);
                            d8Var.a = update3;
                            arrayList2 = arrayList;
                            i10 = i12;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, d8Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, g8Var.x, porterDuffColorFilter);
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
            canvas.translate(g8Var.F, g8Var.G + i3);
            if (h8Var.a0.x()) {
                h8Var.a0.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.l5 update4 = org.telegram.ui.Components.p5.update(0, g8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, g8Var.F, g8Var.G + i3);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(g8Var.F, (org.telegram.messenger.g0.W1(g8Var.x, this.m, this.l) + g8Var.G) - this.p.b());
            c8 c8Var2 = this.p;
            int width2 = g8Var.getWidth();
            int i13 = g8Var.F;
            c8Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            yh.f.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    public final void e(int i3) {
        int i10;
        g8 g8Var = this.v;
        h8 h8Var = g8Var.K;
        TextPaint textPaint = g8Var.d;
        f8[] f8VarArr = g8Var.r;
        TextPaint textPaint2 = g8Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            c8 c8Var = this.o;
            if (c8Var != null) {
                this.l = org.telegram.messenger.g0.L(4.0f) + c8Var.b();
            }
            c8 c8Var2 = this.p;
            if (c8Var2 != null) {
                this.l = org.telegram.messenger.k5.C(4.0f, c8Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == f8VarArr[0]) {
                g8Var.w = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = g8.a(g8Var, textPaint2, this.n, i3);
        this.e = a10;
        this.l = a10.getHeight();
        c8 c8Var3 = this.o;
        int L = c8Var3 != null ? org.telegram.messenger.g0.L(8.0f) + c8Var3.b() : 0;
        c8 c8Var4 = this.p;
        if (c8Var4 != null) {
            this.l = org.telegram.messenger.k5.C(8.0f, c8Var4.b(), this.l);
        }
        this.l += L;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        g8Var.b = z10;
        if (z10) {
            i10 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    g8Var.b = false;
                }
            }
        } else {
            i10 = 3;
        }
        if (g8Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == f8VarArr[0]) {
                String M0 = bd.M0(2131745349, null);
                g8Var.w = g8.a(g8Var, textPaint, M0, i3);
                g8Var.h = ((g8Var.G + L) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                g8Var.n = (g8Var.F + i3) - textPaint.measureText(M0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            c8 c8Var5 = this.o;
            int L2 = topPadding2 + (c8Var5 != null ? org.telegram.messenger.g0.L(8.0f) + c8Var5.b() : 0);
            c8 c8Var6 = this.p;
            this.m = L2 + (c8Var6 != null ? org.telegram.messenger.g0.L(8.0f) + c8Var6.b() : 0);
            this.g = g8.a(g8Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i3);
            stack.addAll(arrayList);
            arrayList.clear();
            yh.f.c(h8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i11 = 0;
                while (true) {
                    d8[] d8VarArr = this.h;
                    if (i11 >= d8VarArr.length) {
                        break;
                    }
                    d8 d8Var = d8VarArr[i11];
                    if (d8Var != null) {
                        org.telegram.ui.Components.p5.release(h8Var, d8Var.a);
                    }
                    i11++;
                }
            }
            this.h = new d8[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i12 = i10; i12 < this.e.getLineCount(); i12++) {
                    int lineStart = this.e.getLineStart(i12);
                    int lineEnd = this.e.getLineEnd(i12);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i12 - 3] = null;
                    } else {
                        StaticLayout a11 = g8.a(g8Var, textPaint2, subSequence, i3);
                        d8 d8Var2 = new d8();
                        this.h[i12 - 3] = d8Var2;
                        d8Var2.b = a11;
                        d8Var2.e = this.e.getLineLeft(i12);
                        d8Var2.f = this.e.getTopPadding() + this.e.getLineTop(i12);
                        if (lineRight < g8Var.n - org.telegram.messenger.g0.L(16.0f)) {
                            d8Var2.d = topPadding;
                            d8Var2.c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            d8Var2.d = d8Var2.f;
                            d8Var2.c = d8Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == f8VarArr[0]) {
                g8Var.w = null;
            }
            this.g = null;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            yh.f.c(g8Var, this.e, stack, arrayList);
        }
        int i13 = g8Var.F;
        int i14 = g8Var.G;
        df.c cVar = this.k;
        cVar.a = i13;
        cVar.c = i14;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12 = 0.0f;
        int i3 = 0;
        while (i3 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i3);
            g8 g8Var = this.v;
            float f13 = lineLeft - (g8Var.F / 3.0f);
            float lineRight = (g8Var.F / 3.0f) + layout.getLineRight(i3);
            if (i3 == 0) {
                f12 = layout.getLineTop(i3) - (g8Var.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i3);
            float f14 = i3 >= layout.getLineCount() + (-1) ? (g8Var.G / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f10 + f13, f11 + f12, f10 + lineRight, f11 + f14, Path.Direction.CW);
            i3++;
            f12 = f14;
        }
    }

    public final void g(CharSequence charSequence, c8 c8Var, c8 c8Var2) {
        this.n = charSequence;
        this.o = c8Var;
        this.p = c8Var2;
        g8 g8Var = this.v;
        if (c8Var != null) {
            e8 e8Var = new e8(this, 0);
            c8Var.r = g8Var;
            c8Var.s = e8Var;
            new dk0(g8Var);
            c8Var.j.setCallback(g8Var);
            c8Var.h.a = g8Var;
            c8Var.i.a = g8Var;
            c8Var.c();
        }
        c8 c8Var3 = this.p;
        if (c8Var3 != null) {
            e8 e8Var2 = new e8(this, 1);
            c8Var3.r = g8Var;
            c8Var3.s = e8Var2;
            new dk0(g8Var);
            c8Var3.j.setCallback(g8Var);
            c8Var3.h.a = g8Var;
            c8Var3.i.a = g8Var;
            c8Var3.c();
        }
        g8Var.s = 0;
        g8Var.requestLayout();
    }
}
