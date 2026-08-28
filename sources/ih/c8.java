package ih;

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
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c8 {
    public m80 a;
    public org.telegram.ui.Components.t5 b;
    public final i80 c;
    public org.telegram.ui.Components.p5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.p5 f;
    public StaticLayout g;
    public a8[] h;
    public final ArrayList i;
    public final Stack j;
    public final dh.r k;
    public int l;
    public int m;
    public CharSequence n;
    public z7 o;
    public z7 p;
    public boolean q;
    public final org.telegram.ui.Components.y5 r;
    public final p80 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ d8 v;

    public c8(d8 d8Var) {
        this.v = d8Var;
        this.c = new i80(d8Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.y5(d8Var.F, 0L, 400L, gr.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new dh.r(d8Var, arrayList, new gh.i3(this, 25));
        p80 p80Var = new p80();
        this.s = p80Var;
        p80Var.x = path;
        p80Var.j(4.0f);
        p80Var.f(org.telegram.ui.ActionBar.f6.l1(0.3f, -1), org.telegram.ui.ActionBar.f6.l1(0.1f, -1), org.telegram.ui.ActionBar.f6.l1(0.2f, -1), org.telegram.ui.ActionBar.f6.l1(0.7f, -1));
        p80Var.setCallback(d8Var);
    }

    public final int a(int i9) {
        int i10;
        z7 z7Var = this.o;
        int i11 = 0;
        if (z7Var != null) {
            i10 = AndroidUtilities.dp(8.0f) + z7Var.b();
        } else {
            i10 = 0;
        }
        z7 z7Var2 = this.p;
        if (z7Var2 != null) {
            i11 = AndroidUtilities.dp(8.0f) + z7Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.e;
        d8 d8Var = this.v;
        if (staticLayout == null) {
            return i9 - ((d8Var.B * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!d8Var.b) {
            return i9 - ((d8Var.B * 2) + this.l);
        }
        return (i9 - ((Math.min(3, lineCount) + 1) * d8Var.c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        d8 d8Var = this.v;
        e8 e8Var = d8Var.F;
        float e10 = this.r.e(this.q);
        if (f10 <= 0.0f) {
            return;
        }
        float lerp = AndroidUtilities.lerp(f10, 0.7f * f10, e10);
        if (lerp >= 1.0f) {
            c(canvas, e10);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, e8Var.getWidth(), e8Var.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e10);
            canvas2.restore();
        }
        if (e10 > 0.0f || this.q) {
            int i9 = (int) (e10 * 255.0f * lerp);
            p80 p80Var = this.s;
            p80Var.setAlpha(i9);
            p80Var.draw(canvas2);
            d8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i9;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        d8 d8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = d8Var.a;
        e8 e8Var = d8Var.F;
        if (this.o != null) {
            canvas.save();
            canvas.translate(d8Var.A, d8Var.B);
            z7 z7Var = this.o;
            int width = d8Var.getWidth();
            int i11 = d8Var.A;
            z7Var.a(canvas, (width - i11) - i11);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i9 = dp;
        } else {
            i9 = 0;
        }
        canvas.save();
        canvas.translate(d8Var.A, d8Var.B + i9);
        if (this.c.f(canvas)) {
            d8Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        boolean z10 = f10 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (e8Var.S.y()) {
                canvas.save();
                canvas.translate(d8Var.A, d8Var.B + i9);
                e8Var.S.X(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(d8Var.A, d8Var.B + i9);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.p5 update = org.telegram.ui.Components.t5.update(0, d8Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, d8Var.A, d8Var.B + i9);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    a8[] a8VarArr = this.h;
                    if (i12 >= a8VarArr.length) {
                        break;
                    }
                    a8 a8Var = a8VarArr[i12];
                    if (a8Var != null) {
                        canvas.save();
                        float f12 = a8Var.c;
                        float f13 = a8Var.e;
                        if (f12 != f13) {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float lerp = AndroidUtilities.lerp(f12, f13, d8Var.w);
                            float lerp2 = AndroidUtilities.lerp(a8Var.d, a8Var.f, gr.g.getInterpolation(d8Var.w));
                            canvas.translate(d8Var.A + lerp, d8Var.B + i9 + lerp2);
                            if (z10) {
                                f(a8Var.b, d8Var.A + lerp, d8Var.B + i9 + lerp2);
                            }
                            a8Var.b.draw(canvas);
                            org.telegram.ui.Components.p5 update2 = org.telegram.ui.Components.t5.update(0, d8Var, a8Var.a, a8Var.b);
                            a8Var.a = update2;
                            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, a8Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (d8Var.w != f11) {
                            canvas.translate(d8Var.A + f13, d8Var.B + i9 + a8Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, a8Var.b.getWidth(), a8Var.b.getHeight(), (int) (d8Var.w * 255.0f), 31);
                            d(a8Var.b, canvas, arrayList);
                            if (z10) {
                                f(a8Var.b, d8Var.A + a8Var.e, d8Var.B + i9 + a8Var.f);
                            }
                            a8Var.b.draw(canvas);
                            org.telegram.ui.Components.p5 update3 = org.telegram.ui.Components.t5.update(0, d8Var, a8Var.a, a8Var.b);
                            a8Var.a = update3;
                            arrayList2 = arrayList;
                            i10 = i12;
                            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, a8Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, d8Var.w, porterDuffColorFilter);
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
            canvas.translate(d8Var.A, d8Var.B + i9);
            if (e8Var.S.y()) {
                e8Var.S.X(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.p5 update4 = org.telegram.ui.Components.t5.update(0, d8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, d8Var.A, d8Var.B + i9);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(d8Var.A, (AndroidUtilities.lerp(this.m, this.l, d8Var.w) + d8Var.B) - this.p.b());
            z7 z7Var2 = this.p;
            int width2 = d8Var.getWidth();
            int i13 = d8Var.A;
            z7Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            dh.l.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i9) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        d8 d8Var = this.v;
        e8 e8Var = d8Var.F;
        TextPaint textPaint = d8Var.d;
        c8[] c8VarArr = d8Var.r;
        TextPaint textPaint2 = d8Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            z7 z7Var = this.o;
            if (z7Var != null) {
                this.l = AndroidUtilities.dp(4.0f) + z7Var.b();
            }
            z7 z7Var2 = this.p;
            if (z7Var2 != null) {
                this.l = org.telegram.messenger.l0.C(4.0f, z7Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == c8VarArr[0]) {
                d8Var.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = d8.a(d8Var, textPaint2, this.n, i9);
        this.e = a2;
        this.l = a2.getHeight();
        z7 z7Var3 = this.o;
        int dp = z7Var3 != null ? AndroidUtilities.dp(8.0f) + z7Var3.b() : 0;
        z7 z7Var4 = this.p;
        if (z7Var4 != null) {
            this.l = org.telegram.messenger.l0.C(8.0f, z7Var4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        d8Var.b = z10;
        if (!z10) {
            staticLayout = null;
        } else if (this.e.getLineCount() == 4) {
            staticLayout = null;
            if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                d8Var.b = false;
            }
        } else {
            staticLayout = null;
        }
        if (d8Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == c8VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                d8Var.v = d8.a(d8Var, textPaint, string, i9);
                d8Var.h = ((d8Var.B + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                d8Var.n = (d8Var.A + i9) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            z7 z7Var5 = this.o;
            int dp2 = topPadding2 + (z7Var5 != null ? AndroidUtilities.dp(8.0f) + z7Var5.b() : 0);
            z7 z7Var6 = this.p;
            this.m = dp2 + (z7Var6 != null ? AndroidUtilities.dp(8.0f) + z7Var6.b() : 0);
            this.g = d8.a(d8Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i9);
            stack.addAll(arrayList);
            arrayList.clear();
            dh.l.c(e8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i10 = 0;
                while (true) {
                    a8[] a8VarArr = this.h;
                    if (i10 >= a8VarArr.length) {
                        break;
                    }
                    a8 a8Var = a8VarArr[i10];
                    if (a8Var != null) {
                        org.telegram.ui.Components.t5.release(e8Var, a8Var.a);
                    }
                    i10++;
                }
            }
            this.h = new a8[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i11 = 3; i11 < this.e.getLineCount(); i11++) {
                    int lineStart = this.e.getLineStart(i11);
                    int lineEnd = this.e.getLineEnd(i11);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i11 - 3] = staticLayout;
                    } else {
                        StaticLayout a3 = d8.a(d8Var, textPaint2, subSequence, i9);
                        a8 a8Var2 = new a8();
                        this.h[i11 - 3] = a8Var2;
                        a8Var2.b = a3;
                        a8Var2.e = this.e.getLineLeft(i11);
                        a8Var2.f = this.e.getTopPadding() + this.e.getLineTop(i11);
                        if (lineRight < d8Var.n - AndroidUtilities.dp(16.0f)) {
                            a8Var2.d = topPadding;
                            a8Var2.c = lineRight;
                            lineRight = Math.abs(a3.getLineRight(0) - a3.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            a8Var2.d = a8Var2.f;
                            a8Var2.c = a8Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == c8VarArr[0]) {
                staticLayout2 = staticLayout;
                d8Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            dh.l.c(d8Var, this.e, stack, arrayList);
        }
        int i12 = d8Var.A;
        int i13 = d8Var.B;
        dh.r rVar = this.k;
        rVar.c = i12;
        rVar.d = i13;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12 = 0.0f;
        int i9 = 0;
        while (i9 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i9);
            d8 d8Var = this.v;
            float f13 = lineLeft - (d8Var.A / 3.0f);
            float lineRight = (d8Var.A / 3.0f) + layout.getLineRight(i9);
            if (i9 == 0) {
                f12 = layout.getLineTop(i9) - (d8Var.B / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i9);
            float f14 = i9 >= layout.getLineCount() + (-1) ? (d8Var.B / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f10 + f13, f11 + f12, f10 + lineRight, f11 + f14, Path.Direction.CW);
            i9++;
            f12 = f14;
        }
    }

    public final void g(CharSequence charSequence, z7 z7Var, z7 z7Var2) {
        this.n = charSequence;
        this.o = z7Var;
        this.p = z7Var2;
        d8 d8Var = this.v;
        if (z7Var != null) {
            b8 b8Var = new b8(this, 0);
            z7Var.r = d8Var;
            z7Var.s = b8Var;
            new dl0(d8Var);
            z7Var.j.setCallback(d8Var);
            z7Var.h.a = d8Var;
            z7Var.i.a = d8Var;
            z7Var.c();
        }
        z7 z7Var3 = this.p;
        if (z7Var3 != null) {
            b8 b8Var2 = new b8(this, 1);
            z7Var3.r = d8Var;
            z7Var3.s = b8Var2;
            new dl0(d8Var);
            z7Var3.j.setCallback(d8Var);
            z7Var3.h.a = d8Var;
            z7Var3.i.a = d8Var;
            z7Var3.c();
        }
        d8Var.s = 0;
        d8Var.requestLayout();
    }
}
