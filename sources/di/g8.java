package di;

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
import org.telegram.messenger.id;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g8 {
    public x70 a;
    public org.telegram.ui.Components.q5 b;
    public final n2.n0 c;
    public org.telegram.ui.Components.m5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.m5 f;
    public StaticLayout g;
    public d8[] h;
    public final ArrayList i;
    public final Stack j;
    public final gf.c k;
    public int l;
    public int m;
    public CharSequence n;
    public c8 o;
    public c8 p;
    public boolean q;
    public final org.telegram.ui.Components.v5 r;
    public final a80 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ h8 v;

    public g8(h8 h8Var) {
        this.v = h8Var;
        this.c = new n2.n0(h8Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.v5(h8Var.J, 0L, 400L, wq.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new gf.c(h8Var, arrayList, new r4(this, 3));
        a80 a80Var = new a80();
        this.s = a80Var;
        a80Var.y = path;
        a80Var.k(4.0f);
        a80Var.g(org.telegram.ui.ActionBar.m6.r1(0.3f, -1), org.telegram.ui.ActionBar.m6.r1(0.1f, -1), org.telegram.ui.ActionBar.m6.r1(0.2f, -1), org.telegram.ui.ActionBar.m6.r1(0.7f, -1));
        a80Var.setCallback(h8Var);
    }

    public final int a(int i7) {
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
        h8 h8Var = this.v;
        if (staticLayout == null) {
            return i7 - ((h8Var.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!h8Var.b) {
            return i7 - ((h8Var.F * 2) + this.l);
        }
        return (i7 - ((Math.min(3, lineCount) + 1) * h8Var.c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        h8 h8Var = this.v;
        i8 i8Var = h8Var.J;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, i8Var.getWidth(), i8Var.getHeight(), (int) (T1 * 255.0f), 31);
            c(canvas2, d);
            canvas2.restore();
        }
        if (d > 0.0f || this.q) {
            int i7 = (int) (d * 255.0f * T1);
            a80 a80Var = this.s;
            a80Var.setAlpha(i7);
            a80Var.draw(canvas2);
            h8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        h8 h8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = h8Var.a;
        i8 i8Var = h8Var.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(h8Var.E, h8Var.F);
            c8 c8Var = this.o;
            int width = h8Var.getWidth();
            int i11 = h8Var.E;
            c8Var.a(canvas, (width - i11) - i11);
            int L = org.telegram.messenger.g0.L(8.0f) + this.o.b();
            canvas.restore();
            i7 = L;
        } else {
            i7 = 0;
        }
        canvas.save();
        canvas.translate(h8Var.E, h8Var.F + i7);
        if (this.c.h(canvas)) {
            h8Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        boolean z9 = f10 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (i8Var.W.x()) {
                canvas.save();
                canvas.translate(h8Var.E, h8Var.F + i7);
                i8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(h8Var.E, h8Var.F + i7);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.m5 update = org.telegram.ui.Components.q5.update(0, h8Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z9) {
                    f(this.g, h8Var.E, h8Var.F + i7);
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
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, h8Var.x);
                            float T12 = org.telegram.messenger.g0.T1(d8Var.d, d8Var.f, wq.g.getInterpolation(h8Var.x));
                            canvas.translate(h8Var.E + T1, h8Var.F + i7 + T12);
                            if (z9) {
                                f(d8Var.b, h8Var.E + T1, h8Var.F + i7 + T12);
                            }
                            d8Var.b.draw(canvas);
                            org.telegram.ui.Components.m5 update2 = org.telegram.ui.Components.q5.update(0, h8Var, d8Var.a, d8Var.b);
                            d8Var.a = update2;
                            org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas, d8Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (h8Var.x != f11) {
                            canvas.translate(h8Var.E + f13, h8Var.F + i7 + d8Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, d8Var.b.getWidth(), d8Var.b.getHeight(), (int) (h8Var.x * 255.0f), 31);
                            d(d8Var.b, canvas, arrayList);
                            if (z9) {
                                f(d8Var.b, h8Var.E + d8Var.e, h8Var.F + i7 + d8Var.f);
                            }
                            d8Var.b.draw(canvas);
                            org.telegram.ui.Components.m5 update3 = org.telegram.ui.Components.q5.update(0, h8Var, d8Var.a, d8Var.b);
                            d8Var.a = update3;
                            arrayList2 = arrayList;
                            i10 = i12;
                            org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas, d8Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, h8Var.x, porterDuffColorFilter);
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
            canvas.translate(h8Var.E, h8Var.F + i7);
            if (i8Var.W.x()) {
                i8Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.m5 update4 = org.telegram.ui.Components.q5.update(0, h8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z9) {
                f(this.e, h8Var.E, h8Var.F + i7);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(h8Var.E, (org.telegram.messenger.g0.W1(h8Var.x, this.m, this.l) + h8Var.F) - this.p.b());
            c8 c8Var2 = this.p;
            int width2 = h8Var.getWidth();
            int i13 = h8Var.E;
            c8Var2.a(canvas, (width2 - i13) - i13);
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
        h8 h8Var = this.v;
        i8 i8Var = h8Var.J;
        TextPaint textPaint = h8Var.d;
        g8[] g8VarArr = h8Var.r;
        TextPaint textPaint2 = h8Var.c;
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
            if (this == g8VarArr[0]) {
                h8Var.w = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = h8.a(h8Var, textPaint2, this.n, i7);
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
        boolean z9 = this.e.getLineCount() > 3;
        h8Var.b = z9;
        if (z9) {
            i10 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    h8Var.b = false;
                }
            }
        } else {
            i10 = 3;
        }
        if (h8Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == g8VarArr[0]) {
                String M0 = id.M0(2131745339, null);
                h8Var.w = h8.a(h8Var, textPaint, M0, i7);
                h8Var.h = ((h8Var.F + L) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                h8Var.n = (h8Var.E + i7) - textPaint.measureText(M0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            c8 c8Var5 = this.o;
            int L2 = topPadding2 + (c8Var5 != null ? org.telegram.messenger.g0.L(8.0f) + c8Var5.b() : 0);
            c8 c8Var6 = this.p;
            this.m = L2 + (c8Var6 != null ? org.telegram.messenger.g0.L(8.0f) + c8Var6.b() : 0);
            this.g = h8.a(h8Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i7);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(i8Var, this.e, stack, arrayList);
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
                        org.telegram.ui.Components.q5.release(i8Var, d8Var.a);
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
                        StaticLayout a11 = h8.a(h8Var, textPaint2, subSequence, i7);
                        d8 d8Var2 = new d8();
                        this.h[i12 - 3] = d8Var2;
                        d8Var2.b = a11;
                        d8Var2.e = this.e.getLineLeft(i12);
                        d8Var2.f = this.e.getTopPadding() + this.e.getLineTop(i12);
                        if (lineRight < h8Var.n - org.telegram.messenger.g0.L(16.0f)) {
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
            if (this == g8VarArr[0]) {
                h8Var.w = null;
            }
            this.g = null;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(h8Var, this.e, stack, arrayList);
        }
        int i13 = h8Var.E;
        int i14 = h8Var.F;
        gf.c cVar = this.k;
        cVar.a = i13;
        cVar.c = i14;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12 = 0.0f;
        int i7 = 0;
        while (i7 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i7);
            h8 h8Var = this.v;
            float f13 = lineLeft - (h8Var.E / 3.0f);
            float lineRight = (h8Var.E / 3.0f) + layout.getLineRight(i7);
            if (i7 == 0) {
                f12 = layout.getLineTop(i7) - (h8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i7);
            float f14 = i7 >= layout.getLineCount() + (-1) ? (h8Var.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f10 + f13, f11 + f12, f10 + lineRight, f11 + f14, Path.Direction.CW);
            i7++;
            f12 = f14;
        }
    }

    public final void g(CharSequence charSequence, c8 c8Var, c8 c8Var2) {
        this.n = charSequence;
        this.o = c8Var;
        this.p = c8Var2;
        h8 h8Var = this.v;
        if (c8Var != null) {
            e8 e8Var = new e8(this, 0);
            c8Var.r = h8Var;
            c8Var.s = e8Var;
            new zj0(h8Var);
            c8Var.j.setCallback(h8Var);
            c8Var.h.a = h8Var;
            c8Var.i.a = h8Var;
            c8Var.c();
        }
        c8 c8Var3 = this.p;
        if (c8Var3 != null) {
            e8 e8Var2 = new e8(this, 1);
            c8Var3.r = h8Var;
            c8Var3.s = e8Var2;
            new zj0(h8Var);
            c8Var3.j.setCallback(h8Var);
            c8Var3.h.a = h8Var;
            c8Var3.i.a = h8Var;
            c8Var3.c();
        }
        h8Var.s = 0;
        h8Var.requestLayout();
    }
}
