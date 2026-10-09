package ai;

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
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.xm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class wa {
    public fa0 a;
    public org.telegram.ui.Components.b6 b;
    public final ba0 c;
    public org.telegram.ui.Components.x5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.x5 f;
    public StaticLayout g;
    public ua[] h;
    public final ArrayList i;
    public final Stack j;
    public final vh.l k;
    public int l;
    public int m;
    public CharSequence n;
    public ta o;
    public ta p;
    public boolean q;
    public final org.telegram.ui.Components.g6 r;
    public final ia0 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ xa v;

    public wa(xa xaVar) {
        this.v = xaVar;
        this.c = new ba0(xaVar);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.g6(xaVar.J, 0L, 400L, hs.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new vh.l(xaVar, arrayList, new a1.c(this, 9));
        ia0 ia0Var = new ia0();
        this.s = ia0Var;
        ia0Var.y = path;
        ia0Var.k(4.0f);
        ia0Var.g(org.telegram.ui.ActionBar.i6.m1(0.3f, -1), org.telegram.ui.ActionBar.i6.m1(0.1f, -1), org.telegram.ui.ActionBar.i6.m1(0.2f, -1), org.telegram.ui.ActionBar.i6.m1(0.7f, -1));
        ia0Var.setCallback(xaVar);
    }

    public final int a(int i10) {
        int i11;
        ta taVar = this.o;
        int i12 = 0;
        if (taVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + taVar.b();
        } else {
            i11 = 0;
        }
        ta taVar2 = this.p;
        if (taVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + taVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        xa xaVar = this.v;
        if (staticLayout == null) {
            return i10 - ((xaVar.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!xaVar.b) {
            return i10 - ((xaVar.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * xaVar.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        xa xaVar = this.v;
        ya yaVar = xaVar.J;
        float e7 = this.r.e(this.q);
        if (f7 <= 0.0f) {
            return;
        }
        float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e7);
        if (lerp >= 1.0f) {
            c(canvas, e7);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, yaVar.getWidth(), yaVar.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e7);
            canvas2.restore();
        }
        if (e7 > 0.0f || this.q) {
            int i10 = (int) (e7 * 255.0f * lerp);
            ia0 ia0Var = this.s;
            ia0Var.setAlpha(i10);
            ia0Var.draw(canvas2);
            xaVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        xa xaVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = xaVar.a;
        ya yaVar = xaVar.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(xaVar.E, xaVar.F);
            ta taVar = this.o;
            int width = xaVar.getWidth();
            int i12 = xaVar.E;
            taVar.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(xaVar.E, xaVar.F + i10);
        if (this.c.f(canvas)) {
            xaVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (yaVar.W.x()) {
                canvas.save();
                canvas.translate(xaVar.E, xaVar.F + i10);
                yaVar.W.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(xaVar.E, xaVar.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.x5 update = org.telegram.ui.Components.b6.update(0, xaVar, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, xaVar.E, xaVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    ua[] uaVarArr = this.h;
                    if (i13 >= uaVarArr.length) {
                        break;
                    }
                    ua uaVar = uaVarArr[i13];
                    if (uaVar != null) {
                        canvas.save();
                        float f11 = uaVar.c;
                        float f12 = uaVar.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, xaVar.w);
                            float lerp2 = AndroidUtilities.lerp(uaVar.d, uaVar.f, hs.g.getInterpolation(xaVar.w));
                            canvas.translate(xaVar.E + lerp, xaVar.F + i10 + lerp2);
                            if (z10) {
                                f(uaVar.b, xaVar.E + lerp, xaVar.F + i10 + lerp2);
                            }
                            uaVar.b.draw(canvas);
                            org.telegram.ui.Components.x5 update2 = org.telegram.ui.Components.b6.update(0, xaVar, uaVar.a, uaVar.b);
                            uaVar.a = update2;
                            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, uaVar.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (xaVar.w != f10) {
                            canvas.translate(xaVar.E + f12, xaVar.F + i10 + uaVar.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, uaVar.b.getWidth(), uaVar.b.getHeight(), (int) (xaVar.w * 255.0f), 31);
                            d(uaVar.b, canvas, arrayList);
                            if (z10) {
                                f(uaVar.b, xaVar.E + uaVar.e, xaVar.F + i10 + uaVar.f);
                            }
                            uaVar.b.draw(canvas);
                            org.telegram.ui.Components.x5 update3 = org.telegram.ui.Components.b6.update(0, xaVar, uaVar.a, uaVar.b);
                            uaVar.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, uaVar.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, xaVar.w, porterDuffColorFilter);
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
            canvas.translate(xaVar.E, xaVar.F + i10);
            if (yaVar.W.x()) {
                yaVar.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.x5 update4 = org.telegram.ui.Components.b6.update(0, xaVar, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, xaVar.E, xaVar.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(xaVar.E, (AndroidUtilities.lerp(this.m, this.l, xaVar.w) + xaVar.F) - this.p.b());
            ta taVar2 = this.p;
            int width2 = xaVar.getWidth();
            int i14 = xaVar.E;
            taVar2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            vh.g.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i10) {
        StaticLayout staticLayout;
        int i11;
        StaticLayout staticLayout2;
        xa xaVar = this.v;
        ya yaVar = xaVar.J;
        TextPaint textPaint = xaVar.d;
        wa[] waVarArr = xaVar.r;
        TextPaint textPaint2 = xaVar.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            ta taVar = this.o;
            if (taVar != null) {
                this.l = AndroidUtilities.dp(4.0f) + taVar.b();
            }
            ta taVar2 = this.p;
            if (taVar2 != null) {
                this.l = org.telegram.messenger.q.C(4.0f, taVar2.b(), this.l);
            }
            this.m = this.l;
            if (this == waVarArr[0]) {
                xaVar.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = xa.a(xaVar, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        ta taVar3 = this.o;
        int dp = taVar3 != null ? AndroidUtilities.dp(8.0f) + taVar3.b() : 0;
        ta taVar4 = this.p;
        if (taVar4 != null) {
            this.l = org.telegram.messenger.q.C(8.0f, taVar4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        xaVar.b = z10;
        if (z10) {
            i11 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    xaVar.b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i11 = 3;
        }
        if (xaVar.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == waVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                xaVar.v = xa.a(xaVar, textPaint, string, i10);
                xaVar.h = ((xaVar.F + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                xaVar.n = (xaVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            ta taVar5 = this.o;
            int dp2 = topPadding2 + (taVar5 != null ? AndroidUtilities.dp(8.0f) + taVar5.b() : 0);
            ta taVar6 = this.p;
            this.m = dp2 + (taVar6 != null ? AndroidUtilities.dp(8.0f) + taVar6.b() : 0);
            this.g = xa.a(xaVar, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(yaVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    ua[] uaVarArr = this.h;
                    if (i12 >= uaVarArr.length) {
                        break;
                    }
                    ua uaVar = uaVarArr[i12];
                    if (uaVar != null) {
                        org.telegram.ui.Components.b6.release(yaVar, uaVar.a);
                    }
                    i12++;
                }
            }
            this.h = new ua[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i13 = i11; i13 < this.e.getLineCount(); i13++) {
                    int lineStart = this.e.getLineStart(i13);
                    int lineEnd = this.e.getLineEnd(i13);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i13 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = xa.a(xaVar, textPaint2, subSequence, i10);
                        ua uaVar2 = new ua();
                        this.h[i13 - 3] = uaVar2;
                        uaVar2.b = a10;
                        uaVar2.e = this.e.getLineLeft(i13);
                        uaVar2.f = this.e.getTopPadding() + this.e.getLineTop(i13);
                        if (lineRight < xaVar.n - AndroidUtilities.dp(16.0f)) {
                            uaVar2.d = topPadding;
                            uaVar2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            uaVar2.d = uaVar2.f;
                            uaVar2.c = uaVar2.e;
                        }
                    }
                }
            }
        } else {
            if (this == waVarArr[0]) {
                staticLayout2 = staticLayout;
                xaVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(xaVar, this.e, stack, arrayList);
        }
        int i14 = xaVar.E;
        int i15 = xaVar.F;
        vh.l lVar = this.k;
        lVar.c = i14;
        lVar.d = i15;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            xa xaVar = this.v;
            float f12 = lineLeft - (xaVar.E / 3.0f);
            float lineRight = (xaVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (xaVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (xaVar.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, ta taVar, ta taVar2) {
        this.n = charSequence;
        this.o = taVar;
        this.p = taVar2;
        xa xaVar = this.v;
        if (taVar != null) {
            va vaVar = new va(this, 0);
            taVar.r = xaVar;
            taVar.s = vaVar;
            new xm0(xaVar);
            taVar.j.setCallback(xaVar);
            taVar.h.a = xaVar;
            taVar.i.a = xaVar;
            taVar.c();
        }
        ta taVar3 = this.p;
        if (taVar3 != null) {
            va vaVar2 = new va(this, 1);
            taVar3.r = xaVar;
            taVar3.s = vaVar2;
            new xm0(xaVar);
            taVar3.j.setCallback(xaVar);
            taVar3.h.a = xaVar;
            taVar3.i.a = xaVar;
            taVar3.c();
        }
        xaVar.s = 0;
        xaVar.requestLayout();
    }
}
