package ci;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class q8 {
    public y90 a;
    public org.telegram.ui.Components.a6 b;
    public final u90 c;
    public org.telegram.ui.Components.w5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.w5 f;
    public StaticLayout g;
    public o8[] h;
    public final ArrayList i;
    public final Stack j;
    public final wh.l k;
    public int l;
    public int m;
    public CharSequence n;
    public n8 o;
    public n8 p;
    public boolean q;
    public final org.telegram.ui.Components.f6 r;
    public final ba0 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ r8 v;

    public q8(r8 r8Var) {
        this.v = r8Var;
        this.c = new u90(r8Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.f6(r8Var.J, 0L, 400L, bs.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new wh.l(r8Var, arrayList, new a1.c(this, 20));
        ba0 ba0Var = new ba0();
        this.s = ba0Var;
        ba0Var.y = path;
        ba0Var.k(4.0f);
        ba0Var.g(org.telegram.ui.ActionBar.h6.m1(0.3f, -1), org.telegram.ui.ActionBar.h6.m1(0.1f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1), org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
        ba0Var.setCallback(r8Var);
    }

    public final int a(int i10) {
        int i11;
        n8 n8Var = this.o;
        int i12 = 0;
        if (n8Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + n8Var.b();
        } else {
            i11 = 0;
        }
        n8 n8Var2 = this.p;
        if (n8Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + n8Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        r8 r8Var = this.v;
        if (staticLayout == null) {
            return i10 - ((r8Var.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!r8Var.b) {
            return i10 - ((r8Var.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * r8Var.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        r8 r8Var = this.v;
        s8 s8Var = r8Var.J;
        float e = this.r.e(this.q);
        if (f7 <= 0.0f) {
            return;
        }
        float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e);
        if (lerp >= 1.0f) {
            c(canvas, e);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, s8Var.getWidth(), s8Var.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e);
            canvas2.restore();
        }
        if (e > 0.0f || this.q) {
            int i10 = (int) (e * 255.0f * lerp);
            ba0 ba0Var = this.s;
            ba0Var.setAlpha(i10);
            ba0Var.draw(canvas2);
            r8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        r8 r8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = r8Var.a;
        s8 s8Var = r8Var.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(r8Var.E, r8Var.F);
            n8 n8Var = this.o;
            int width = r8Var.getWidth();
            int i12 = r8Var.E;
            n8Var.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(r8Var.E, r8Var.F + i10);
        if (this.c.f(canvas)) {
            r8Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (s8Var.W.x()) {
                canvas.save();
                canvas.translate(r8Var.E, r8Var.F + i10);
                s8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(r8Var.E, r8Var.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.w5 update = org.telegram.ui.Components.a6.update(0, r8Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, r8Var.E, r8Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    o8[] o8VarArr = this.h;
                    if (i13 >= o8VarArr.length) {
                        break;
                    }
                    o8 o8Var = o8VarArr[i13];
                    if (o8Var != null) {
                        canvas.save();
                        float f11 = o8Var.c;
                        float f12 = o8Var.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, r8Var.w);
                            float lerp2 = AndroidUtilities.lerp(o8Var.d, o8Var.f, bs.g.getInterpolation(r8Var.w));
                            canvas.translate(r8Var.E + lerp, r8Var.F + i10 + lerp2);
                            if (z10) {
                                f(o8Var.b, r8Var.E + lerp, r8Var.F + i10 + lerp2);
                            }
                            o8Var.b.draw(canvas);
                            org.telegram.ui.Components.w5 update2 = org.telegram.ui.Components.a6.update(0, r8Var, o8Var.a, o8Var.b);
                            o8Var.a = update2;
                            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, o8Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (r8Var.w != f10) {
                            canvas.translate(r8Var.E + f12, r8Var.F + i10 + o8Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, o8Var.b.getWidth(), o8Var.b.getHeight(), (int) (r8Var.w * 255.0f), 31);
                            d(o8Var.b, canvas, arrayList);
                            if (z10) {
                                f(o8Var.b, r8Var.E + o8Var.e, r8Var.F + i10 + o8Var.f);
                            }
                            o8Var.b.draw(canvas);
                            org.telegram.ui.Components.w5 update3 = org.telegram.ui.Components.a6.update(0, r8Var, o8Var.a, o8Var.b);
                            o8Var.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, o8Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, r8Var.w, porterDuffColorFilter);
                            canvas.restore();
                        }
                        canvas.restore();
                        i13 = i11 + 1;
                        arrayList = arrayList2;
                        f10 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i11 = i13;
                    i13 = i11 + 1;
                    arrayList = arrayList2;
                    f10 = 0.0f;
                }
            }
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(r8Var.E, r8Var.F + i10);
            if (s8Var.W.x()) {
                s8Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.w5 update4 = org.telegram.ui.Components.a6.update(0, r8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, r8Var.E, r8Var.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(r8Var.E, (AndroidUtilities.lerp(this.m, this.l, r8Var.w) + r8Var.F) - this.p.b());
            n8 n8Var2 = this.p;
            int width2 = r8Var.getWidth();
            int i14 = r8Var.E;
            n8Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            wh.g.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i10) {
        StaticLayout staticLayout;
        int i11;
        StaticLayout staticLayout2;
        r8 r8Var = this.v;
        s8 s8Var = r8Var.J;
        TextPaint textPaint = r8Var.d;
        q8[] q8VarArr = r8Var.r;
        TextPaint textPaint2 = r8Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            n8 n8Var = this.o;
            if (n8Var != null) {
                this.l = AndroidUtilities.dp(4.0f) + n8Var.b();
            }
            n8 n8Var2 = this.p;
            if (n8Var2 != null) {
                this.l = org.telegram.messenger.g0.C(4.0f, n8Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == q8VarArr[0]) {
                r8Var.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = r8.a(r8Var, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        n8 n8Var3 = this.o;
        int dp = n8Var3 != null ? AndroidUtilities.dp(8.0f) + n8Var3.b() : 0;
        n8 n8Var4 = this.p;
        if (n8Var4 != null) {
            this.l = org.telegram.messenger.g0.C(8.0f, n8Var4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        r8Var.b = z10;
        if (z10) {
            i11 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    r8Var.b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i11 = 3;
        }
        if (r8Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == q8VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                r8Var.v = r8.a(r8Var, textPaint, string, i10);
                r8Var.h = ((r8Var.F + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                r8Var.n = (r8Var.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            n8 n8Var5 = this.o;
            int dp2 = topPadding2 + (n8Var5 != null ? AndroidUtilities.dp(8.0f) + n8Var5.b() : 0);
            n8 n8Var6 = this.p;
            this.m = dp2 + (n8Var6 != null ? AndroidUtilities.dp(8.0f) + n8Var6.b() : 0);
            this.g = r8.a(r8Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(s8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    o8[] o8VarArr = this.h;
                    if (i12 >= o8VarArr.length) {
                        break;
                    }
                    o8 o8Var = o8VarArr[i12];
                    if (o8Var != null) {
                        org.telegram.ui.Components.a6.release(s8Var, o8Var.a);
                    }
                    i12++;
                }
            }
            this.h = new o8[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i13 = i11; i13 < this.e.getLineCount(); i13++) {
                    int lineStart = this.e.getLineStart(i13);
                    int lineEnd = this.e.getLineEnd(i13);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i13 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = r8.a(r8Var, textPaint2, subSequence, i10);
                        o8 o8Var2 = new o8();
                        this.h[i13 - 3] = o8Var2;
                        o8Var2.b = a10;
                        o8Var2.e = this.e.getLineLeft(i13);
                        o8Var2.f = this.e.getTopPadding() + this.e.getLineTop(i13);
                        if (lineRight < r8Var.n - AndroidUtilities.dp(16.0f)) {
                            o8Var2.d = topPadding;
                            o8Var2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            o8Var2.d = o8Var2.f;
                            o8Var2.c = o8Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == q8VarArr[0]) {
                staticLayout2 = staticLayout;
                r8Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(r8Var, this.e, stack, arrayList);
        }
        int i14 = r8Var.E;
        int i15 = r8Var.F;
        wh.l lVar = this.k;
        lVar.c = i14;
        lVar.d = i15;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            r8 r8Var = this.v;
            float f12 = lineLeft - (r8Var.E / 3.0f);
            float lineRight = (r8Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (r8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (r8Var.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, n8 n8Var, n8 n8Var2) {
        this.n = charSequence;
        this.o = n8Var;
        this.p = n8Var2;
        r8 r8Var = this.v;
        if (n8Var != null) {
            p8 p8Var = new p8(this, 0);
            n8Var.r = r8Var;
            n8Var.s = p8Var;
            new pm0(r8Var);
            n8Var.j.setCallback(r8Var);
            n8Var.h.a = r8Var;
            n8Var.i.a = r8Var;
            n8Var.c();
        }
        n8 n8Var3 = this.p;
        if (n8Var3 != null) {
            p8 p8Var2 = new p8(this, 1);
            n8Var3.r = r8Var;
            n8Var3.s = p8Var2;
            new pm0(r8Var);
            n8Var3.j.setCallback(r8Var);
            n8Var3.h.a = r8Var;
            n8Var3.i.a = r8Var;
            n8Var3.c();
        }
        r8Var.s = 0;
        r8Var.requestLayout();
    }
}
