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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n8 {
    public ba0 a;
    public org.telegram.ui.Components.c6 b;
    public final x90 c;
    public org.telegram.ui.Components.y5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.y5 f;
    public StaticLayout g;
    public l8[] h;
    public final ArrayList i;
    public final Stack j;
    public final xh.l k;
    public int l;
    public int m;
    public CharSequence n;
    public k8 o;
    public k8 p;
    public boolean q;
    public final org.telegram.ui.Components.h6 r;
    public final ea0 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ o8 v;

    public n8(o8 o8Var) {
        this.v = o8Var;
        this.c = new x90(o8Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.h6(o8Var.J, 0L, 400L, ds.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new xh.l(o8Var, arrayList, new a1.c(this, 28));
        ea0 ea0Var = new ea0();
        this.s = ea0Var;
        ea0Var.y = path;
        ea0Var.k(4.0f);
        ea0Var.g(org.telegram.ui.ActionBar.y6.o1(0.3f, -1), org.telegram.ui.ActionBar.y6.o1(0.1f, -1), org.telegram.ui.ActionBar.y6.o1(0.2f, -1), org.telegram.ui.ActionBar.y6.o1(0.7f, -1));
        ea0Var.setCallback(o8Var);
    }

    public final int a(int i10) {
        int i11;
        k8 k8Var = this.o;
        int i12 = 0;
        if (k8Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + k8Var.b();
        } else {
            i11 = 0;
        }
        k8 k8Var2 = this.p;
        if (k8Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + k8Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        o8 o8Var = this.v;
        if (staticLayout == null) {
            return i10 - ((o8Var.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!o8Var.b) {
            return i10 - ((o8Var.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * o8Var.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        o8 o8Var = this.v;
        p8 p8Var = o8Var.J;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, p8Var.getWidth(), p8Var.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e);
            canvas2.restore();
        }
        if (e > 0.0f || this.q) {
            int i10 = (int) (e * 255.0f * lerp);
            ea0 ea0Var = this.s;
            ea0Var.setAlpha(i10);
            ea0Var.draw(canvas2);
            o8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        o8 o8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = o8Var.a;
        p8 p8Var = o8Var.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(o8Var.E, o8Var.F);
            k8 k8Var = this.o;
            int width = o8Var.getWidth();
            int i12 = o8Var.E;
            k8Var.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(o8Var.E, o8Var.F + i10);
        if (this.c.f(canvas)) {
            o8Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (p8Var.W.x()) {
                canvas.save();
                canvas.translate(o8Var.E, o8Var.F + i10);
                p8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(o8Var.E, o8Var.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.y5 update = org.telegram.ui.Components.c6.update(0, o8Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, o8Var.E, o8Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    l8[] l8VarArr = this.h;
                    if (i13 >= l8VarArr.length) {
                        break;
                    }
                    l8 l8Var = l8VarArr[i13];
                    if (l8Var != null) {
                        canvas.save();
                        float f11 = l8Var.c;
                        float f12 = l8Var.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, o8Var.w);
                            float lerp2 = AndroidUtilities.lerp(l8Var.d, l8Var.f, ds.g.getInterpolation(o8Var.w));
                            canvas.translate(o8Var.E + lerp, o8Var.F + i10 + lerp2);
                            if (z10) {
                                f(l8Var.b, o8Var.E + lerp, o8Var.F + i10 + lerp2);
                            }
                            l8Var.b.draw(canvas);
                            org.telegram.ui.Components.y5 update2 = org.telegram.ui.Components.c6.update(0, o8Var, l8Var.a, l8Var.b);
                            l8Var.a = update2;
                            org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, l8Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (o8Var.w != f10) {
                            canvas.translate(o8Var.E + f12, o8Var.F + i10 + l8Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, l8Var.b.getWidth(), l8Var.b.getHeight(), (int) (o8Var.w * 255.0f), 31);
                            d(l8Var.b, canvas, arrayList);
                            if (z10) {
                                f(l8Var.b, o8Var.E + l8Var.e, o8Var.F + i10 + l8Var.f);
                            }
                            l8Var.b.draw(canvas);
                            org.telegram.ui.Components.y5 update3 = org.telegram.ui.Components.c6.update(0, o8Var, l8Var.a, l8Var.b);
                            l8Var.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, l8Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, o8Var.w, porterDuffColorFilter);
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
            canvas.translate(o8Var.E, o8Var.F + i10);
            if (p8Var.W.x()) {
                p8Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.y5 update4 = org.telegram.ui.Components.c6.update(0, o8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, o8Var.E, o8Var.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(o8Var.E, (AndroidUtilities.lerp(this.m, this.l, o8Var.w) + o8Var.F) - this.p.b());
            k8 k8Var2 = this.p;
            int width2 = o8Var.getWidth();
            int i14 = o8Var.E;
            k8Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            xh.g.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i10) {
        StaticLayout staticLayout;
        int i11;
        StaticLayout staticLayout2;
        o8 o8Var = this.v;
        p8 p8Var = o8Var.J;
        TextPaint textPaint = o8Var.d;
        n8[] n8VarArr = o8Var.r;
        TextPaint textPaint2 = o8Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            k8 k8Var = this.o;
            if (k8Var != null) {
                this.l = AndroidUtilities.dp(4.0f) + k8Var.b();
            }
            k8 k8Var2 = this.p;
            if (k8Var2 != null) {
                this.l = org.telegram.messenger.t.D(4.0f, k8Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == n8VarArr[0]) {
                o8Var.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = o8.a(o8Var, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        k8 k8Var3 = this.o;
        int dp = k8Var3 != null ? AndroidUtilities.dp(8.0f) + k8Var3.b() : 0;
        k8 k8Var4 = this.p;
        if (k8Var4 != null) {
            this.l = org.telegram.messenger.t.D(8.0f, k8Var4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        o8Var.b = z10;
        if (z10) {
            i11 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    o8Var.b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i11 = 3;
        }
        if (o8Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == n8VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                o8Var.v = o8.a(o8Var, textPaint, string, i10);
                o8Var.h = ((o8Var.F + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                o8Var.n = (o8Var.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            k8 k8Var5 = this.o;
            int dp2 = topPadding2 + (k8Var5 != null ? AndroidUtilities.dp(8.0f) + k8Var5.b() : 0);
            k8 k8Var6 = this.p;
            this.m = dp2 + (k8Var6 != null ? AndroidUtilities.dp(8.0f) + k8Var6.b() : 0);
            this.g = o8.a(o8Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.g.c(p8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    l8[] l8VarArr = this.h;
                    if (i12 >= l8VarArr.length) {
                        break;
                    }
                    l8 l8Var = l8VarArr[i12];
                    if (l8Var != null) {
                        org.telegram.ui.Components.c6.release(p8Var, l8Var.a);
                    }
                    i12++;
                }
            }
            this.h = new l8[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i13 = i11; i13 < this.e.getLineCount(); i13++) {
                    int lineStart = this.e.getLineStart(i13);
                    int lineEnd = this.e.getLineEnd(i13);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i13 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = o8.a(o8Var, textPaint2, subSequence, i10);
                        l8 l8Var2 = new l8();
                        this.h[i13 - 3] = l8Var2;
                        l8Var2.b = a10;
                        l8Var2.e = this.e.getLineLeft(i13);
                        l8Var2.f = this.e.getTopPadding() + this.e.getLineTop(i13);
                        if (lineRight < o8Var.n - AndroidUtilities.dp(16.0f)) {
                            l8Var2.d = topPadding;
                            l8Var2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            l8Var2.d = l8Var2.f;
                            l8Var2.c = l8Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == n8VarArr[0]) {
                staticLayout2 = staticLayout;
                o8Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.g.c(o8Var, this.e, stack, arrayList);
        }
        int i14 = o8Var.E;
        int i15 = o8Var.F;
        xh.l lVar = this.k;
        lVar.c = i14;
        lVar.d = i15;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            o8 o8Var = this.v;
            float f12 = lineLeft - (o8Var.E / 3.0f);
            float lineRight = (o8Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (o8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (o8Var.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, k8 k8Var, k8 k8Var2) {
        this.n = charSequence;
        this.o = k8Var;
        this.p = k8Var2;
        o8 o8Var = this.v;
        if (k8Var != null) {
            m8 m8Var = new m8(this, 0);
            k8Var.r = o8Var;
            k8Var.s = m8Var;
            new xm0(o8Var);
            k8Var.j.setCallback(o8Var);
            k8Var.h.a = o8Var;
            k8Var.i.a = o8Var;
            k8Var.c();
        }
        k8 k8Var3 = this.p;
        if (k8Var3 != null) {
            m8 m8Var2 = new m8(this, 1);
            k8Var3.r = o8Var;
            k8Var3.s = m8Var2;
            new xm0(o8Var);
            k8Var3.j.setCallback(o8Var);
            k8Var3.h.a = o8Var;
            k8Var3.i.a = o8Var;
            k8Var3.c();
        }
        o8Var.s = 0;
        o8Var.requestLayout();
    }
}
