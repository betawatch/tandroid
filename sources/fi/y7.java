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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y7 {
    public a80 a;
    public org.telegram.ui.Components.p5 b;
    public final n2.o0 c;
    public org.telegram.ui.Components.l5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.l5 f;
    public StaticLayout g;
    public w7[] h;
    public final ArrayList i;
    public final Stack j;
    public final gf.c k;
    public int l;
    public int m;
    public CharSequence n;
    public v7 o;
    public v7 p;
    public boolean q;
    public final org.telegram.ui.Components.u5 r;
    public final d80 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ z7 v;

    public y7(z7 z7Var) {
        this.v = z7Var;
        this.c = new n2.o0(z7Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.u5(z7Var.K, 0L, 400L, er.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new gf.c(z7Var, arrayList, new di.z6(this, 10));
        d80 d80Var = new d80();
        this.s = d80Var;
        d80Var.y = path;
        d80Var.k(4.0f);
        d80Var.g(org.telegram.ui.ActionBar.j6.r1(0.3f, -1), org.telegram.ui.ActionBar.j6.r1(0.1f, -1), org.telegram.ui.ActionBar.j6.r1(0.2f, -1), org.telegram.ui.ActionBar.j6.r1(0.7f, -1));
        d80Var.setCallback(z7Var);
    }

    public final int a(int i7) {
        int i10;
        v7 v7Var = this.o;
        int i11 = 0;
        if (v7Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + v7Var.b();
        } else {
            i10 = 0;
        }
        v7 v7Var2 = this.p;
        if (v7Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + v7Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.e;
        z7 z7Var = this.v;
        if (staticLayout == null) {
            return i7 - ((z7Var.G * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!z7Var.b) {
            return i7 - ((z7Var.G * 2) + this.l);
        }
        return (i7 - ((Math.min(3, lineCount) + 1) * z7Var.c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.K;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, a8Var.getWidth(), a8Var.getHeight(), (int) (T1 * 255.0f), 31);
            c(canvas2, d);
            canvas2.restore();
        }
        if (d > 0.0f || this.q) {
            int i7 = (int) (d * 255.0f * T1);
            d80 d80Var = this.s;
            d80Var.setAlpha(i7);
            d80Var.draw(canvas2);
            z7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        z7 z7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = z7Var.a;
        a8 a8Var = z7Var.K;
        if (this.o != null) {
            canvas.save();
            canvas.translate(z7Var.F, z7Var.G);
            v7 v7Var = this.o;
            int width = z7Var.getWidth();
            int i11 = z7Var.F;
            v7Var.a(canvas, (width - i11) - i11);
            int L = org.telegram.messenger.g0.L(8.0f) + this.o.b();
            canvas.restore();
            i7 = L;
        } else {
            i7 = 0;
        }
        canvas.save();
        canvas.translate(z7Var.F, z7Var.G + i7);
        if (this.c.h(canvas)) {
            z7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        boolean z10 = f10 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (a8Var.a0.x()) {
                canvas.save();
                canvas.translate(z7Var.F, z7Var.G + i7);
                a8Var.a0.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(z7Var.F, z7Var.G + i7);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.l5 update = org.telegram.ui.Components.p5.update(0, z7Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, z7Var.F, z7Var.G + i7);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i12 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i12];
                    if (w7Var != null) {
                        canvas.save();
                        float f12 = w7Var.c;
                        float f13 = w7Var.e;
                        if (f12 != f13) {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, z7Var.x);
                            float T12 = org.telegram.messenger.g0.T1(w7Var.d, w7Var.f, er.g.getInterpolation(z7Var.x));
                            canvas.translate(z7Var.F + T1, z7Var.G + i7 + T12);
                            if (z10) {
                                f(w7Var.b, z7Var.F + T1, z7Var.G + i7 + T12);
                            }
                            w7Var.b.draw(canvas);
                            org.telegram.ui.Components.l5 update2 = org.telegram.ui.Components.p5.update(0, z7Var, w7Var.a, w7Var.b);
                            w7Var.a = update2;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, w7Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (z7Var.x != f11) {
                            canvas.translate(z7Var.F + f13, z7Var.G + i7 + w7Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, w7Var.b.getWidth(), w7Var.b.getHeight(), (int) (z7Var.x * 255.0f), 31);
                            d(w7Var.b, canvas, arrayList);
                            if (z10) {
                                f(w7Var.b, z7Var.F + w7Var.e, z7Var.G + i7 + w7Var.f);
                            }
                            w7Var.b.draw(canvas);
                            org.telegram.ui.Components.l5 update3 = org.telegram.ui.Components.p5.update(0, z7Var, w7Var.a, w7Var.b);
                            w7Var.a = update3;
                            arrayList2 = arrayList;
                            i10 = i12;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, w7Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, z7Var.x, porterDuffColorFilter);
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
            canvas.translate(z7Var.F, z7Var.G + i7);
            if (a8Var.a0.x()) {
                a8Var.a0.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.l5 update4 = org.telegram.ui.Components.p5.update(0, z7Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, z7Var.F, z7Var.G + i7);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(z7Var.F, (org.telegram.messenger.g0.W1(z7Var.x, this.m, this.l) + z7Var.G) - this.p.b());
            v7 v7Var2 = this.p;
            int width2 = z7Var.getWidth();
            int i13 = z7Var.F;
            v7Var2.a(canvas, (width2 - i13) - i13);
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
        z7 z7Var = this.v;
        a8 a8Var = z7Var.K;
        TextPaint textPaint = z7Var.d;
        y7[] y7VarArr = z7Var.r;
        TextPaint textPaint2 = z7Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            v7 v7Var = this.o;
            if (v7Var != null) {
                this.l = org.telegram.messenger.g0.L(4.0f) + v7Var.b();
            }
            v7 v7Var2 = this.p;
            if (v7Var2 != null) {
                this.l = org.telegram.messenger.k5.C(4.0f, v7Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == y7VarArr[0]) {
                z7Var.w = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = z7.a(z7Var, textPaint2, this.n, i7);
        this.e = a10;
        this.l = a10.getHeight();
        v7 v7Var3 = this.o;
        int L = v7Var3 != null ? org.telegram.messenger.g0.L(8.0f) + v7Var3.b() : 0;
        v7 v7Var4 = this.p;
        if (v7Var4 != null) {
            this.l = org.telegram.messenger.k5.C(8.0f, v7Var4.b(), this.l);
        }
        this.l += L;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        z7Var.b = z10;
        if (z10) {
            i10 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    z7Var.b = false;
                }
            }
        } else {
            i10 = 3;
        }
        if (z7Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == y7VarArr[0]) {
                String M0 = hd.M0(2131745339, null);
                z7Var.w = z7.a(z7Var, textPaint, M0, i7);
                z7Var.h = ((z7Var.G + L) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                z7Var.n = (z7Var.F + i7) - textPaint.measureText(M0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            v7 v7Var5 = this.o;
            int L2 = topPadding2 + (v7Var5 != null ? org.telegram.messenger.g0.L(8.0f) + v7Var5.b() : 0);
            v7 v7Var6 = this.p;
            this.m = L2 + (v7Var6 != null ? org.telegram.messenger.g0.L(8.0f) + v7Var6.b() : 0);
            this.g = z7.a(z7Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i7);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(a8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i11 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i11 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i11];
                    if (w7Var != null) {
                        org.telegram.ui.Components.p5.release(a8Var, w7Var.a);
                    }
                    i11++;
                }
            }
            this.h = new w7[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i12 = i10; i12 < this.e.getLineCount(); i12++) {
                    int lineStart = this.e.getLineStart(i12);
                    int lineEnd = this.e.getLineEnd(i12);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i12 - 3] = null;
                    } else {
                        StaticLayout a11 = z7.a(z7Var, textPaint2, subSequence, i7);
                        w7 w7Var2 = new w7();
                        this.h[i12 - 3] = w7Var2;
                        w7Var2.b = a11;
                        w7Var2.e = this.e.getLineLeft(i12);
                        w7Var2.f = this.e.getTopPadding() + this.e.getLineTop(i12);
                        if (lineRight < z7Var.n - org.telegram.messenger.g0.L(16.0f)) {
                            w7Var2.d = topPadding;
                            w7Var2.c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            w7Var2.d = w7Var2.f;
                            w7Var2.c = w7Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == y7VarArr[0]) {
                z7Var.w = null;
            }
            this.g = null;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(z7Var, this.e, stack, arrayList);
        }
        int i13 = z7Var.F;
        int i14 = z7Var.G;
        gf.c cVar = this.k;
        cVar.a = i13;
        cVar.c = i14;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12 = 0.0f;
        int i7 = 0;
        while (i7 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i7);
            z7 z7Var = this.v;
            float f13 = lineLeft - (z7Var.F / 3.0f);
            float lineRight = (z7Var.F / 3.0f) + layout.getLineRight(i7);
            if (i7 == 0) {
                f12 = layout.getLineTop(i7) - (z7Var.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i7);
            float f14 = i7 >= layout.getLineCount() + (-1) ? (z7Var.G / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f10 + f13, f11 + f12, f10 + lineRight, f11 + f14, Path.Direction.CW);
            i7++;
            f12 = f14;
        }
    }

    public final void g(CharSequence charSequence, v7 v7Var, v7 v7Var2) {
        this.n = charSequence;
        this.o = v7Var;
        this.p = v7Var2;
        z7 z7Var = this.v;
        if (v7Var != null) {
            x7 x7Var = new x7(this, 0);
            v7Var.r = z7Var;
            v7Var.s = x7Var;
            new ek0(z7Var);
            v7Var.j.setCallback(z7Var);
            v7Var.h.a = z7Var;
            v7Var.i.a = z7Var;
            v7Var.c();
        }
        v7 v7Var3 = this.p;
        if (v7Var3 != null) {
            x7 x7Var2 = new x7(this, 1);
            v7Var3.r = z7Var;
            v7Var3.s = x7Var2;
            new ek0(z7Var);
            v7Var3.j.setCallback(z7Var);
            v7Var3.h.a = z7Var;
            v7Var3.i.a = z7Var;
            v7Var3.c();
        }
        z7Var.s = 0;
        z7Var.requestLayout();
    }
}
