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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class p8 {
    public z90 a;
    public org.telegram.ui.Components.a6 b;
    public final v90 c;
    public org.telegram.ui.Components.w5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.w5 f;
    public StaticLayout g;
    public n8[] h;
    public final ArrayList i;
    public final Stack j;
    public final wh.l k;
    public int l;
    public int m;
    public CharSequence n;
    public m8 o;
    public m8 p;
    public boolean q;
    public final org.telegram.ui.Components.f6 r;
    public final ca0 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ q8 v;

    public p8(q8 q8Var) {
        this.v = q8Var;
        this.c = new v90(q8Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.f6(q8Var.J, 0L, 400L, bs.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new wh.l(q8Var, arrayList, new a1.c(this, 20));
        ca0 ca0Var = new ca0();
        this.s = ca0Var;
        ca0Var.y = path;
        ca0Var.k(4.0f);
        ca0Var.g(org.telegram.ui.ActionBar.k6.o1(0.3f, -1), org.telegram.ui.ActionBar.k6.o1(0.1f, -1), org.telegram.ui.ActionBar.k6.o1(0.2f, -1), org.telegram.ui.ActionBar.k6.o1(0.7f, -1));
        ca0Var.setCallback(q8Var);
    }

    public final int a(int i10) {
        int i11;
        m8 m8Var = this.o;
        int i12 = 0;
        if (m8Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + m8Var.b();
        } else {
            i11 = 0;
        }
        m8 m8Var2 = this.p;
        if (m8Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + m8Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        q8 q8Var = this.v;
        if (staticLayout == null) {
            return i10 - ((q8Var.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!q8Var.b) {
            return i10 - ((q8Var.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * q8Var.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        q8 q8Var = this.v;
        r8 r8Var = q8Var.J;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, r8Var.getWidth(), r8Var.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e);
            canvas2.restore();
        }
        if (e > 0.0f || this.q) {
            int i10 = (int) (e * 255.0f * lerp);
            ca0 ca0Var = this.s;
            ca0Var.setAlpha(i10);
            ca0Var.draw(canvas2);
            q8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        q8 q8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = q8Var.a;
        r8 r8Var = q8Var.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(q8Var.E, q8Var.F);
            m8 m8Var = this.o;
            int width = q8Var.getWidth();
            int i12 = q8Var.E;
            m8Var.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(q8Var.E, q8Var.F + i10);
        if (this.c.f(canvas)) {
            q8Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (r8Var.W.x()) {
                canvas.save();
                canvas.translate(q8Var.E, q8Var.F + i10);
                r8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(q8Var.E, q8Var.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.w5 update = org.telegram.ui.Components.a6.update(0, q8Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, q8Var.E, q8Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    n8[] n8VarArr = this.h;
                    if (i13 >= n8VarArr.length) {
                        break;
                    }
                    n8 n8Var = n8VarArr[i13];
                    if (n8Var != null) {
                        canvas.save();
                        float f11 = n8Var.c;
                        float f12 = n8Var.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, q8Var.w);
                            float lerp2 = AndroidUtilities.lerp(n8Var.d, n8Var.f, bs.g.getInterpolation(q8Var.w));
                            canvas.translate(q8Var.E + lerp, q8Var.F + i10 + lerp2);
                            if (z10) {
                                f(n8Var.b, q8Var.E + lerp, q8Var.F + i10 + lerp2);
                            }
                            n8Var.b.draw(canvas);
                            org.telegram.ui.Components.w5 update2 = org.telegram.ui.Components.a6.update(0, q8Var, n8Var.a, n8Var.b);
                            n8Var.a = update2;
                            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, n8Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (q8Var.w != f10) {
                            canvas.translate(q8Var.E + f12, q8Var.F + i10 + n8Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, n8Var.b.getWidth(), n8Var.b.getHeight(), (int) (q8Var.w * 255.0f), 31);
                            d(n8Var.b, canvas, arrayList);
                            if (z10) {
                                f(n8Var.b, q8Var.E + n8Var.e, q8Var.F + i10 + n8Var.f);
                            }
                            n8Var.b.draw(canvas);
                            org.telegram.ui.Components.w5 update3 = org.telegram.ui.Components.a6.update(0, q8Var, n8Var.a, n8Var.b);
                            n8Var.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, n8Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, q8Var.w, porterDuffColorFilter);
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
            canvas.translate(q8Var.E, q8Var.F + i10);
            if (r8Var.W.x()) {
                r8Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.w5 update4 = org.telegram.ui.Components.a6.update(0, q8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, q8Var.E, q8Var.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(q8Var.E, (AndroidUtilities.lerp(this.m, this.l, q8Var.w) + q8Var.F) - this.p.b());
            m8 m8Var2 = this.p;
            int width2 = q8Var.getWidth();
            int i14 = q8Var.E;
            m8Var2.a(canvas, (width2 - i14) - i14);
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
        q8 q8Var = this.v;
        r8 r8Var = q8Var.J;
        TextPaint textPaint = q8Var.d;
        p8[] p8VarArr = q8Var.r;
        TextPaint textPaint2 = q8Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            m8 m8Var = this.o;
            if (m8Var != null) {
                this.l = AndroidUtilities.dp(4.0f) + m8Var.b();
            }
            m8 m8Var2 = this.p;
            if (m8Var2 != null) {
                this.l = org.telegram.messenger.v0.C(4.0f, m8Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == p8VarArr[0]) {
                q8Var.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = q8.a(q8Var, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        m8 m8Var3 = this.o;
        int dp = m8Var3 != null ? AndroidUtilities.dp(8.0f) + m8Var3.b() : 0;
        m8 m8Var4 = this.p;
        if (m8Var4 != null) {
            this.l = org.telegram.messenger.v0.C(8.0f, m8Var4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        q8Var.b = z10;
        if (z10) {
            i11 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    q8Var.b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i11 = 3;
        }
        if (q8Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == p8VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                q8Var.v = q8.a(q8Var, textPaint, string, i10);
                q8Var.h = ((q8Var.F + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                q8Var.n = (q8Var.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            m8 m8Var5 = this.o;
            int dp2 = topPadding2 + (m8Var5 != null ? AndroidUtilities.dp(8.0f) + m8Var5.b() : 0);
            m8 m8Var6 = this.p;
            this.m = dp2 + (m8Var6 != null ? AndroidUtilities.dp(8.0f) + m8Var6.b() : 0);
            this.g = q8.a(q8Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(r8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    n8[] n8VarArr = this.h;
                    if (i12 >= n8VarArr.length) {
                        break;
                    }
                    n8 n8Var = n8VarArr[i12];
                    if (n8Var != null) {
                        org.telegram.ui.Components.a6.release(r8Var, n8Var.a);
                    }
                    i12++;
                }
            }
            this.h = new n8[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i13 = i11; i13 < this.e.getLineCount(); i13++) {
                    int lineStart = this.e.getLineStart(i13);
                    int lineEnd = this.e.getLineEnd(i13);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i13 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = q8.a(q8Var, textPaint2, subSequence, i10);
                        n8 n8Var2 = new n8();
                        this.h[i13 - 3] = n8Var2;
                        n8Var2.b = a10;
                        n8Var2.e = this.e.getLineLeft(i13);
                        n8Var2.f = this.e.getTopPadding() + this.e.getLineTop(i13);
                        if (lineRight < q8Var.n - AndroidUtilities.dp(16.0f)) {
                            n8Var2.d = topPadding;
                            n8Var2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            n8Var2.d = n8Var2.f;
                            n8Var2.c = n8Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == p8VarArr[0]) {
                staticLayout2 = staticLayout;
                q8Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(q8Var, this.e, stack, arrayList);
        }
        int i14 = q8Var.E;
        int i15 = q8Var.F;
        wh.l lVar = this.k;
        lVar.c = i14;
        lVar.d = i15;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            q8 q8Var = this.v;
            float f12 = lineLeft - (q8Var.E / 3.0f);
            float lineRight = (q8Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (q8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (q8Var.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, m8 m8Var, m8 m8Var2) {
        this.n = charSequence;
        this.o = m8Var;
        this.p = m8Var2;
        q8 q8Var = this.v;
        if (m8Var != null) {
            o8 o8Var = new o8(this, 0);
            m8Var.r = q8Var;
            m8Var.s = o8Var;
            new tm0(q8Var);
            m8Var.j.setCallback(q8Var);
            m8Var.h.a = q8Var;
            m8Var.i.a = q8Var;
            m8Var.c();
        }
        m8 m8Var3 = this.p;
        if (m8Var3 != null) {
            o8 o8Var2 = new o8(this, 1);
            m8Var3.r = q8Var;
            m8Var3.s = o8Var2;
            new tm0(q8Var);
            m8Var3.j.setCallback(q8Var);
            m8Var3.h.a = q8Var;
            m8Var3.i.a = q8Var;
            m8Var3.c();
        }
        q8Var.s = 0;
        q8Var.requestLayout();
    }
}
