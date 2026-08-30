package nh;

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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class y7 {
    public f90 a;
    public org.telegram.ui.Components.u5 b;
    public final b90 c;
    public org.telegram.ui.Components.q5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.q5 f;
    public StaticLayout g;
    public w7[] h;
    public final ArrayList i;
    public final Stack j;
    public final ih.p k;
    public int l;
    public int m;
    public CharSequence n;
    public v7 o;
    public v7 p;
    public boolean q;
    public final org.telegram.ui.Components.z5 r;
    public final i90 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ z7 v;

    public y7(z7 z7Var) {
        this.v = z7Var;
        this.c = new b90(z7Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.z5(z7Var.G, 0L, 400L, nr.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new ih.p(z7Var, arrayList, new lh.m5(this, 12));
        i90 i90Var = new i90();
        this.s = i90Var;
        i90Var.x = path;
        i90Var.j(4.0f);
        i90Var.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        i90Var.setCallback(z7Var);
    }

    public final int a(int i10) {
        int i11;
        v7 v7Var = this.o;
        int i12 = 0;
        if (v7Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + v7Var.b();
        } else {
            i11 = 0;
        }
        v7 v7Var2 = this.p;
        if (v7Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + v7Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        z7 z7Var = this.v;
        if (staticLayout == null) {
            return i10 - ((z7Var.C * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!z7Var.b) {
            return i10 - ((z7Var.C * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * z7Var.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.G;
        float e = this.r.e(this.q);
        if (f10 <= 0.0f) {
            return;
        }
        float lerp = AndroidUtilities.lerp(f10, 0.7f * f10, e);
        if (lerp >= 1.0f) {
            c(canvas, e);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, a8Var.getWidth(), a8Var.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e);
            canvas2.restore();
        }
        if (e > 0.0f || this.q) {
            int i10 = (int) (e * 255.0f * lerp);
            i90 i90Var = this.s;
            i90Var.setAlpha(i10);
            i90Var.draw(canvas2);
            z7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        z7 z7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = z7Var.a;
        a8 a8Var = z7Var.G;
        if (this.o != null) {
            canvas.save();
            canvas.translate(z7Var.B, z7Var.C);
            v7 v7Var = this.o;
            int width = z7Var.getWidth();
            int i12 = z7Var.B;
            v7Var.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(z7Var.B, z7Var.C + i10);
        if (this.c.f(canvas)) {
            z7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        boolean z4 = f10 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (a8Var.T.y()) {
                canvas.save();
                canvas.translate(z7Var.B, z7Var.C + i10);
                a8Var.T.X(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(z7Var.B, z7Var.C + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.q5 update = org.telegram.ui.Components.u5.update(0, z7Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z4) {
                    f(this.g, z7Var.B, z7Var.C + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i13 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i13];
                    if (w7Var != null) {
                        canvas.save();
                        float f12 = w7Var.c;
                        float f13 = w7Var.e;
                        if (f12 != f13) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f12, f13, z7Var.w);
                            float lerp2 = AndroidUtilities.lerp(w7Var.d, w7Var.f, nr.g.getInterpolation(z7Var.w));
                            canvas.translate(z7Var.B + lerp, z7Var.C + i10 + lerp2);
                            if (z4) {
                                f(w7Var.b, z7Var.B + lerp, z7Var.C + i10 + lerp2);
                            }
                            w7Var.b.draw(canvas);
                            org.telegram.ui.Components.q5 update2 = org.telegram.ui.Components.u5.update(0, z7Var, w7Var.a, w7Var.b);
                            w7Var.a = update2;
                            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, w7Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (z7Var.w != f11) {
                            canvas.translate(z7Var.B + f13, z7Var.C + i10 + w7Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, w7Var.b.getWidth(), w7Var.b.getHeight(), (int) (z7Var.w * 255.0f), 31);
                            d(w7Var.b, canvas, arrayList);
                            if (z4) {
                                f(w7Var.b, z7Var.B + w7Var.e, z7Var.C + i10 + w7Var.f);
                            }
                            w7Var.b.draw(canvas);
                            org.telegram.ui.Components.q5 update3 = org.telegram.ui.Components.u5.update(0, z7Var, w7Var.a, w7Var.b);
                            w7Var.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, w7Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, z7Var.w, porterDuffColorFilter);
                            canvas.restore();
                        }
                        canvas.restore();
                        i13 = i11 + 1;
                        arrayList = arrayList2;
                        f11 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i11 = i13;
                    i13 = i11 + 1;
                    arrayList = arrayList2;
                    f11 = 0.0f;
                }
            }
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(z7Var.B, z7Var.C + i10);
            if (a8Var.T.y()) {
                a8Var.T.X(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.q5 update4 = org.telegram.ui.Components.u5.update(0, z7Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z4) {
                f(this.e, z7Var.B, z7Var.C + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(z7Var.B, (AndroidUtilities.lerp(this.m, this.l, z7Var.w) + z7Var.C) - this.p.b());
            v7 v7Var2 = this.p;
            int width2 = z7Var.getWidth();
            int i14 = z7Var.B;
            v7Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            ih.k.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i10) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.G;
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
                this.l = AndroidUtilities.dp(4.0f) + v7Var.b();
            }
            v7 v7Var2 = this.p;
            if (v7Var2 != null) {
                this.l = org.telegram.messenger.y3.C(4.0f, v7Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == y7VarArr[0]) {
                z7Var.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = z7.a(z7Var, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        v7 v7Var3 = this.o;
        int dp = v7Var3 != null ? AndroidUtilities.dp(8.0f) + v7Var3.b() : 0;
        v7 v7Var4 = this.p;
        if (v7Var4 != null) {
            this.l = org.telegram.messenger.y3.C(8.0f, v7Var4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z4 = this.e.getLineCount() > 3;
        z7Var.b = z4;
        if (!z4) {
            staticLayout = null;
        } else if (this.e.getLineCount() == 4) {
            staticLayout = null;
            if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                z7Var.b = false;
            }
        } else {
            staticLayout = null;
        }
        if (z7Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == y7VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                z7Var.v = z7.a(z7Var, textPaint, string, i10);
                z7Var.h = ((z7Var.C + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                z7Var.n = (z7Var.B + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            v7 v7Var5 = this.o;
            int dp2 = topPadding2 + (v7Var5 != null ? AndroidUtilities.dp(8.0f) + v7Var5.b() : 0);
            v7 v7Var6 = this.p;
            this.m = dp2 + (v7Var6 != null ? AndroidUtilities.dp(8.0f) + v7Var6.b() : 0);
            this.g = z7.a(z7Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            ih.k.c(a8Var, this.e, stack, arrayList);
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
                        org.telegram.ui.Components.u5.release(a8Var, w7Var.a);
                    }
                    i11++;
                }
            }
            this.h = new w7[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i12 = 3; i12 < this.e.getLineCount(); i12++) {
                    int lineStart = this.e.getLineStart(i12);
                    int lineEnd = this.e.getLineEnd(i12);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i12 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = z7.a(z7Var, textPaint2, subSequence, i10);
                        w7 w7Var2 = new w7();
                        this.h[i12 - 3] = w7Var2;
                        w7Var2.b = a10;
                        w7Var2.e = this.e.getLineLeft(i12);
                        w7Var2.f = this.e.getTopPadding() + this.e.getLineTop(i12);
                        if (lineRight < z7Var.n - AndroidUtilities.dp(16.0f)) {
                            w7Var2.d = topPadding;
                            w7Var2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            w7Var2.d = w7Var2.f;
                            w7Var2.c = w7Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == y7VarArr[0]) {
                staticLayout2 = staticLayout;
                z7Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            ih.k.c(z7Var, this.e, stack, arrayList);
        }
        int i13 = z7Var.B;
        int i14 = z7Var.C;
        ih.p pVar = this.k;
        pVar.c = i13;
        pVar.d = i14;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            z7 z7Var = this.v;
            float f13 = lineLeft - (z7Var.B / 3.0f);
            float lineRight = (z7Var.B / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (z7Var.C / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f14 = i10 >= layout.getLineCount() + (-1) ? (z7Var.C / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f10 + f13, f11 + f12, f10 + lineRight, f11 + f14, Path.Direction.CW);
            i10++;
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
            new am0(z7Var);
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
            new am0(z7Var);
            v7Var3.j.setCallback(z7Var);
            v7Var3.h.a = z7Var;
            v7Var3.i.a = z7Var;
            v7Var3.c();
        }
        z7Var.s = 0;
        z7Var.requestLayout();
    }
}
