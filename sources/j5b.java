// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class j5b {
    public m66 a;
    public gn b;
    public final i66 c;
    public cn d;
    public StaticLayout e;
    public cn f;
    public StaticLayout g;
    public h5b[] h;
    public final ArrayList i;
    public final Stack j;
    public final ml0 k;
    public int l;
    public int m;
    public CharSequence n;
    public g5b o;
    public g5b p;
    public boolean q;
    public final ln r;
    public final qa6 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ k5b v;

    public j5b(k5b k5bVar) {
        this.v = k5bVar;
        this.c = new i66(k5bVar);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new ln(k5bVar.K, 0L, 400L, d53.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new ml0(k5bVar, arrayList, new wta(this, (byte) 10));
        qa6 qa6Var = new qa6();
        this.s = qa6Var;
        qa6Var.y = path;
        qa6Var.j(4.0f);
        qa6Var.g(cmb.p1(0.3f, -1), cmb.p1(0.1f, -1), cmb.p1(0.2f, -1), cmb.p1(0.7f, -1));
        qa6Var.setCallback(k5bVar);
    }

    public final int a(int i) {
        int i2;
        g5b g5bVar = this.o;
        int i3 = 0;
        if (g5bVar != null) {
            i2 = gm.L(8.0f) + g5bVar.b();
        } else {
            i2 = 0;
        }
        g5b g5bVar2 = this.p;
        if (g5bVar2 != null) {
            i3 = gm.L(8.0f) + g5bVar2.b();
        }
        int i4 = i2 + i3;
        StaticLayout staticLayout = this.e;
        k5b k5bVar = this.v;
        if (staticLayout == null) {
            return i - ((k5bVar.G << 1) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!k5bVar.b) {
            return i - ((k5bVar.G << 1) + this.l);
        }
        return (i - ((Math.min(3, lineCount) + 1) * k5bVar.c.getFontMetricsInt(null))) - i4;
    }

    public final void b(Canvas canvas, float f) {
        Canvas canvas2;
        k5b k5bVar = this.v;
        l5b l5bVar = k5bVar.K;
        float d = this.r.d(this.q);
        if (f > 0.0f) {
            float R1 = gm.R1(f, 0.7f * f, d);
            if (R1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, l5bVar.getWidth(), l5bVar.getHeight(), (int) (R1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d > 0.0f || this.q) {
                qa6 qa6Var = this.s;
                qa6Var.setAlpha((int) (d * 255.0f * R1));
                qa6Var.draw(canvas2);
                k5bVar.invalidate();
            }
        }
    }

    public final void c(Canvas canvas, float f) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        k5b k5bVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = k5bVar.a;
        l5b l5bVar = k5bVar.K;
        if (this.o != null) {
            canvas.save();
            canvas.translate(k5bVar.F, k5bVar.G);
            g5b g5bVar = this.o;
            int width = k5bVar.getWidth();
            int i3 = k5bVar.F;
            g5bVar.a(canvas, (width - i3) - i3);
            int L = gm.L(8.0f) + this.o.b();
            canvas.restore();
            i = L;
        } else {
            i = 0;
        }
        canvas.save();
        canvas.translate(k5bVar.F, k5bVar.G + i);
        if (this.c.g(canvas)) {
            k5bVar.invalidate();
        }
        canvas.restore();
        float f2 = 0.0f;
        boolean z = f > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (l5bVar.W.w()) {
                canvas.save();
                canvas.translate(k5bVar.F, k5bVar.G + i);
                l5bVar.W.V(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(k5bVar.F, k5bVar.G + i);
                d(this.g, canvas, arrayList3);
                cn update = gn.update(0, k5bVar, this.f, this.g);
                this.f = update;
                gn.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z) {
                    f(this.g, k5bVar.F, k5bVar.G + i);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i4 = 0;
                while (true) {
                    h5b[] h5bVarArr = this.h;
                    if (i4 >= h5bVarArr.length) {
                        break;
                    }
                    h5b h5bVar = h5bVarArr[i4];
                    if (h5bVar != null) {
                        canvas.save();
                        float f3 = h5bVar.c;
                        float f4 = h5bVar.e;
                        float f5 = k5bVar.x;
                        if (f3 != f4) {
                            arrayList2 = arrayList;
                            i2 = i4;
                            float R1 = gm.R1(f3, f4, f5);
                            float R12 = gm.R1(h5bVar.d, h5bVar.f, d53.g.getInterpolation(k5bVar.x));
                            canvas.translate(k5bVar.F + R1, k5bVar.G + i + R12);
                            if (z) {
                                f(h5bVar.b, k5bVar.F + R1, k5bVar.G + i + R12);
                            }
                            h5bVar.b.draw(canvas);
                            cn update2 = gn.update(0, k5bVar, h5bVar.a, h5bVar.b);
                            h5bVar.a = update2;
                            gn.drawAnimatedEmojis(canvas, h5bVar.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (f5 != f2) {
                            canvas.translate(k5bVar.F + f4, k5bVar.G + i + h5bVar.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, h5bVar.b.getWidth(), h5bVar.b.getHeight(), (int) (k5bVar.x * 255.0f), 31);
                            d(h5bVar.b, canvas, arrayList);
                            if (z) {
                                f(h5bVar.b, k5bVar.F + h5bVar.e, k5bVar.G + i + h5bVar.f);
                            }
                            h5bVar.b.draw(canvas);
                            cn update3 = gn.update(0, k5bVar, h5bVar.a, h5bVar.b);
                            h5bVar.a = update3;
                            arrayList2 = arrayList;
                            i2 = i4;
                            gn.drawAnimatedEmojis(canvas, h5bVar.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, k5bVar.x, porterDuffColorFilter);
                            canvas.restore();
                        }
                        canvas.restore();
                        i4 = i2 + 1;
                        arrayList = arrayList2;
                        f2 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i2 = i4;
                    i4 = i2 + 1;
                    arrayList = arrayList2;
                    f2 = 0.0f;
                }
            }
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(k5bVar.F, k5bVar.G + i);
            if (l5bVar.W.w()) {
                l5bVar.W.V(canvas);
            }
            d(this.e, canvas, arrayList3);
            cn update4 = gn.update(0, k5bVar, this.d, this.e);
            this.d = update4;
            gn.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z) {
                f(this.e, k5bVar.F, k5bVar.G + i);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(k5bVar.F, (gm.U1(k5bVar.x, this.m, this.l) + k5bVar.G) - this.p.b());
            g5b g5bVar2 = this.p;
            int width2 = k5bVar.getWidth();
            int i5 = k5bVar.F;
            g5bVar2.a(canvas, (width2 - i5) - i5);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            rna.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    public final void e(int i) {
        int i2;
        int i3;
        k5b k5bVar = this.v;
        l5b l5bVar = k5bVar.K;
        TextPaint textPaint = k5bVar.d;
        j5b[] j5bVarArr = k5bVar.r;
        TextPaint textPaint2 = k5bVar.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            g5b g5bVar = this.o;
            if (g5bVar != null) {
                i3 = gm.L(4.0f) + g5bVar.b();
                this.l = i3;
            } else {
                i3 = 0;
            }
            g5b g5bVar2 = this.p;
            if (g5bVar2 != null) {
                i3 = hg9.v(4.0f, g5bVar2.b(), i3);
                this.l = i3;
            }
            this.m = i3;
            if (this == j5bVarArr[0]) {
                k5bVar.w = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a = k5b.a(i, textPaint2, this.n);
        this.e = a;
        this.l = a.getHeight();
        g5b g5bVar3 = this.o;
        int L = g5bVar3 != null ? gm.L(8.0f) + g5bVar3.b() : 0;
        g5b g5bVar4 = this.p;
        if (g5bVar4 != null) {
            this.l = hg9.v(8.0f, g5bVar4.b(), this.l);
        }
        this.l += L;
        float measureText = textPaint2.measureText(" ");
        boolean z = this.e.getLineCount() > 3;
        k5bVar.b = z;
        if (z) {
            i2 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    k5bVar.b = false;
                }
            }
        } else {
            i2 = 3;
        }
        if (k5bVar.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == j5bVarArr[0]) {
                String M0 = jb6.M0(2131745073, null);
                k5bVar.w = k5b.a(i, textPaint, M0);
                k5bVar.h = ((k5bVar.G + L) + topPadding) - gm.N(0.3f);
                k5bVar.n = (k5bVar.F + i) - textPaint.measureText(M0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            g5b g5bVar5 = this.o;
            int L2 = topPadding2 + (g5bVar5 != null ? gm.L(8.0f) + g5bVar5.b() : 0);
            g5b g5bVar6 = this.p;
            this.m = L2 + (g5bVar6 != null ? gm.L(8.0f) + g5bVar6.b() : 0);
            this.g = k5b.a(i, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)));
            stack.addAll(arrayList);
            arrayList.clear();
            rna.c(l5bVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i4 = 0;
                while (true) {
                    h5b[] h5bVarArr = this.h;
                    if (i4 >= h5bVarArr.length) {
                        break;
                    }
                    h5b h5bVar = h5bVarArr[i4];
                    if (h5bVar != null) {
                        gn.release(l5bVar, h5bVar.a);
                    }
                    i4++;
                }
            }
            this.h = new h5b[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i5 = i2; i5 < this.e.getLineCount(); i5++) {
                    int lineStart = this.e.getLineStart(i5);
                    int lineEnd = this.e.getLineEnd(i5);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i5 - 3] = null;
                    } else {
                        StaticLayout a2 = k5b.a(i, textPaint2, subSequence);
                        h5b h5bVar2 = new h5b();
                        this.h[i5 - 3] = h5bVar2;
                        h5bVar2.b = a2;
                        h5bVar2.e = this.e.getLineLeft(i5);
                        h5bVar2.f = this.e.getTopPadding() + this.e.getLineTop(i5);
                        if (lineRight < k5bVar.n - gm.L(16.0f)) {
                            h5bVar2.d = topPadding;
                            h5bVar2.c = lineRight;
                            lineRight = Math.abs(a2.getLineRight(0) - a2.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            h5bVar2.d = h5bVar2.f;
                            h5bVar2.c = h5bVar2.e;
                        }
                    }
                }
            }
        } else {
            if (this == j5bVarArr[0]) {
                k5bVar.w = null;
            }
            this.g = null;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            rna.c(k5bVar, this.e, stack, arrayList);
        }
        int i6 = k5bVar.F;
        int i7 = k5bVar.G;
        ml0 ml0Var = this.k;
        ml0Var.b = i6;
        ml0Var.c = i7;
    }

    public final void f(Layout layout, float f, float f2) {
        float f3 = 0.0f;
        int i = 0;
        while (i < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i);
            k5b k5bVar = this.v;
            float f4 = lineLeft - (k5bVar.F / 3.0f);
            float lineRight = (k5bVar.F / 3.0f) + layout.getLineRight(i);
            if (i == 0) {
                f3 = layout.getLineTop(i) - (k5bVar.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i);
            float f5 = i >= layout.getLineCount() + (-1) ? (k5bVar.G / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f + f4, f2 + f3, f + lineRight, f2 + f5, Path.Direction.CW);
            i++;
            f3 = f5;
        }
    }

    public final void g(CharSequence charSequence, g5b g5bVar, g5b g5bVar2) {
        this.n = charSequence;
        this.o = g5bVar;
        this.p = g5bVar2;
        byte b = 0;
        k5b k5bVar = this.v;
        if (g5bVar != null) {
            i5b i5bVar = new i5b(this, b);
            g5bVar.r = k5bVar;
            g5bVar.s = i5bVar;
            new p99(k5bVar);
            g5bVar.j.setCallback(k5bVar);
            g5bVar.h.a = k5bVar;
            g5bVar.i.a = k5bVar;
            g5bVar.c();
        }
        g5b g5bVar3 = this.p;
        if (g5bVar3 != null) {
            i5b i5bVar2 = new i5b(this, (byte) 1);
            g5bVar3.r = k5bVar;
            g5bVar3.s = i5bVar2;
            new p99(k5bVar);
            g5bVar3.j.setCallback(k5bVar);
            g5bVar3.h.a = k5bVar;
            g5bVar3.i.a = k5bVar;
            g5bVar3.c();
        }
        k5bVar.s = 0;
        k5bVar.requestLayout();
    }
}
