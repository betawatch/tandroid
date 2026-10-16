package bi;

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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.tm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class fa {
    public ea0 a;
    public org.telegram.ui.Components.b6 b;
    public final aa0 c;
    public org.telegram.ui.Components.x5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.x5 f;
    public StaticLayout g;
    public da[] h;
    public final ArrayList i;
    public final Stack j;
    public final wh.l k;
    public int l;
    public int m;
    public CharSequence n;
    public ca o;
    public ca p;
    public boolean q;
    public final org.telegram.ui.Components.g6 r;
    public final ha0 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ ga v;

    public fa(ga gaVar) {
        this.v = gaVar;
        this.c = new aa0(gaVar);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.g6(gaVar.J, 0L, 400L, es.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new wh.l(gaVar, arrayList, new a1.c(this, 10));
        ha0 ha0Var = new ha0();
        this.s = ha0Var;
        ha0Var.y = path;
        ha0Var.k(4.0f);
        ha0Var.g(org.telegram.ui.ActionBar.g6.m1(0.3f, -1), org.telegram.ui.ActionBar.g6.m1(0.1f, -1), org.telegram.ui.ActionBar.g6.m1(0.2f, -1), org.telegram.ui.ActionBar.g6.m1(0.7f, -1));
        ha0Var.setCallback(gaVar);
    }

    public final int a(int i10) {
        int i11;
        ca caVar = this.o;
        int i12 = 0;
        if (caVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + caVar.b();
        } else {
            i11 = 0;
        }
        ca caVar2 = this.p;
        if (caVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + caVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        ga gaVar = this.v;
        if (staticLayout == null) {
            return i10 - ((gaVar.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!gaVar.b) {
            return i10 - ((gaVar.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * gaVar.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        ga gaVar = this.v;
        ha haVar = gaVar.J;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, haVar.getWidth(), haVar.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e);
            canvas2.restore();
        }
        if (e > 0.0f || this.q) {
            int i10 = (int) (e * 255.0f * lerp);
            ha0 ha0Var = this.s;
            ha0Var.setAlpha(i10);
            ha0Var.draw(canvas2);
            gaVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        ga gaVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = gaVar.a;
        ha haVar = gaVar.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(gaVar.E, gaVar.F);
            ca caVar = this.o;
            int width = gaVar.getWidth();
            int i12 = gaVar.E;
            caVar.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(gaVar.E, gaVar.F + i10);
        if (this.c.f(canvas)) {
            gaVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (haVar.W.x()) {
                canvas.save();
                canvas.translate(gaVar.E, gaVar.F + i10);
                haVar.W.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(gaVar.E, gaVar.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.x5 update = org.telegram.ui.Components.b6.update(0, gaVar, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, gaVar.E, gaVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    da[] daVarArr = this.h;
                    if (i13 >= daVarArr.length) {
                        break;
                    }
                    da daVar = daVarArr[i13];
                    if (daVar != null) {
                        canvas.save();
                        float f11 = daVar.c;
                        float f12 = daVar.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, gaVar.w);
                            float lerp2 = AndroidUtilities.lerp(daVar.d, daVar.f, es.g.getInterpolation(gaVar.w));
                            canvas.translate(gaVar.E + lerp, gaVar.F + i10 + lerp2);
                            if (z10) {
                                f(daVar.b, gaVar.E + lerp, gaVar.F + i10 + lerp2);
                            }
                            daVar.b.draw(canvas);
                            org.telegram.ui.Components.x5 update2 = org.telegram.ui.Components.b6.update(0, gaVar, daVar.a, daVar.b);
                            daVar.a = update2;
                            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, daVar.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (gaVar.w != f10) {
                            canvas.translate(gaVar.E + f12, gaVar.F + i10 + daVar.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, daVar.b.getWidth(), daVar.b.getHeight(), (int) (gaVar.w * 255.0f), 31);
                            d(daVar.b, canvas, arrayList);
                            if (z10) {
                                f(daVar.b, gaVar.E + daVar.e, gaVar.F + i10 + daVar.f);
                            }
                            daVar.b.draw(canvas);
                            org.telegram.ui.Components.x5 update3 = org.telegram.ui.Components.b6.update(0, gaVar, daVar.a, daVar.b);
                            daVar.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, daVar.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, gaVar.w, porterDuffColorFilter);
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
            canvas.translate(gaVar.E, gaVar.F + i10);
            if (haVar.W.x()) {
                haVar.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.x5 update4 = org.telegram.ui.Components.b6.update(0, gaVar, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, gaVar.E, gaVar.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(gaVar.E, (AndroidUtilities.lerp(this.m, this.l, gaVar.w) + gaVar.F) - this.p.b());
            ca caVar2 = this.p;
            int width2 = gaVar.getWidth();
            int i14 = gaVar.E;
            caVar2.a(canvas, (width2 - i14) - i14);
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
        ga gaVar = this.v;
        ha haVar = gaVar.J;
        TextPaint textPaint = gaVar.d;
        fa[] faVarArr = gaVar.r;
        TextPaint textPaint2 = gaVar.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            ca caVar = this.o;
            if (caVar != null) {
                this.l = AndroidUtilities.dp(4.0f) + caVar.b();
            }
            ca caVar2 = this.p;
            if (caVar2 != null) {
                this.l = org.telegram.messenger.g0.C(4.0f, caVar2.b(), this.l);
            }
            this.m = this.l;
            if (this == faVarArr[0]) {
                gaVar.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = ga.a(gaVar, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        ca caVar3 = this.o;
        int dp = caVar3 != null ? AndroidUtilities.dp(8.0f) + caVar3.b() : 0;
        ca caVar4 = this.p;
        if (caVar4 != null) {
            this.l = org.telegram.messenger.g0.C(8.0f, caVar4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        gaVar.b = z10;
        if (z10) {
            i11 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    gaVar.b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i11 = 3;
        }
        if (gaVar.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == faVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                gaVar.v = ga.a(gaVar, textPaint, string, i10);
                gaVar.h = ((gaVar.F + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                gaVar.n = (gaVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            ca caVar5 = this.o;
            int dp2 = topPadding2 + (caVar5 != null ? AndroidUtilities.dp(8.0f) + caVar5.b() : 0);
            ca caVar6 = this.p;
            this.m = dp2 + (caVar6 != null ? AndroidUtilities.dp(8.0f) + caVar6.b() : 0);
            this.g = ga.a(gaVar, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(haVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    da[] daVarArr = this.h;
                    if (i12 >= daVarArr.length) {
                        break;
                    }
                    da daVar = daVarArr[i12];
                    if (daVar != null) {
                        org.telegram.ui.Components.b6.release(haVar, daVar.a);
                    }
                    i12++;
                }
            }
            this.h = new da[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i13 = i11; i13 < this.e.getLineCount(); i13++) {
                    int lineStart = this.e.getLineStart(i13);
                    int lineEnd = this.e.getLineEnd(i13);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i13 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = ga.a(gaVar, textPaint2, subSequence, i10);
                        da daVar2 = new da();
                        this.h[i13 - 3] = daVar2;
                        daVar2.b = a10;
                        daVar2.e = this.e.getLineLeft(i13);
                        daVar2.f = this.e.getTopPadding() + this.e.getLineTop(i13);
                        if (lineRight < gaVar.n - AndroidUtilities.dp(16.0f)) {
                            daVar2.d = topPadding;
                            daVar2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            daVar2.d = daVar2.f;
                            daVar2.c = daVar2.e;
                        }
                    }
                }
            }
        } else {
            if (this == faVarArr[0]) {
                staticLayout2 = staticLayout;
                gaVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(gaVar, this.e, stack, arrayList);
        }
        int i14 = gaVar.E;
        int i15 = gaVar.F;
        wh.l lVar = this.k;
        lVar.c = i14;
        lVar.d = i15;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            ga gaVar = this.v;
            float f12 = lineLeft - (gaVar.E / 3.0f);
            float lineRight = (gaVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (gaVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (gaVar.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, ca caVar, ca caVar2) {
        this.n = charSequence;
        this.o = caVar;
        this.p = caVar2;
        ga gaVar = this.v;
        if (caVar != null) {
            ea eaVar = new ea(this, 0);
            caVar.r = gaVar;
            caVar.s = eaVar;
            new tm0(gaVar);
            caVar.j.setCallback(gaVar);
            caVar.h.a = gaVar;
            caVar.i.a = gaVar;
            caVar.c();
        }
        ca caVar3 = this.p;
        if (caVar3 != null) {
            ea eaVar2 = new ea(this, 1);
            caVar3.r = gaVar;
            caVar3.s = eaVar2;
            new tm0(gaVar);
            caVar3.j.setCallback(gaVar);
            caVar3.h.a = gaVar;
            caVar3.i.a = gaVar;
            caVar3.c();
        }
        gaVar.s = 0;
        gaVar.requestLayout();
    }
}
