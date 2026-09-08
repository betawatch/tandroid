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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class ca {
    public e90 a;
    public org.telegram.ui.Components.z5 b;
    public final a90 c;
    public org.telegram.ui.Components.v5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.v5 f;
    public StaticLayout g;
    public aa[] h;
    public final ArrayList i;
    public final Stack j;
    public final wh.m k;
    public int l;
    public int m;
    public CharSequence n;
    public z9 o;
    public z9 p;
    public boolean q;
    public final org.telegram.ui.Components.e6 r;
    public final h90 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ da v;

    public ca(da daVar) {
        this.v = daVar;
        this.c = new a90(daVar);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.e6(daVar.J, 0L, 400L, pr.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new wh.m(daVar, arrayList, new a1.c(this, 9));
        h90 h90Var = new h90();
        this.s = h90Var;
        h90Var.x = path;
        h90Var.j(4.0f);
        h90Var.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        h90Var.setCallback(daVar);
    }

    public final int a(int i10) {
        int i11;
        z9 z9Var = this.o;
        int i12 = 0;
        if (z9Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + z9Var.b();
        } else {
            i11 = 0;
        }
        z9 z9Var2 = this.p;
        if (z9Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + z9Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        da daVar = this.v;
        if (staticLayout == null) {
            return i10 - ((daVar.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!daVar.b) {
            return i10 - ((daVar.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * daVar.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        da daVar = this.v;
        ea eaVar = daVar.J;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, eaVar.getWidth(), eaVar.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e7);
            canvas2.restore();
        }
        if (e7 > 0.0f || this.q) {
            int i10 = (int) (e7 * 255.0f * lerp);
            h90 h90Var = this.s;
            h90Var.setAlpha(i10);
            h90Var.draw(canvas2);
            daVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        da daVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = daVar.a;
        ea eaVar = daVar.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(daVar.E, daVar.F);
            z9 z9Var = this.o;
            int width = daVar.getWidth();
            int i12 = daVar.E;
            z9Var.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(daVar.E, daVar.F + i10);
        if (this.c.f(canvas)) {
            daVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (eaVar.W.y()) {
                canvas.save();
                canvas.translate(daVar.E, daVar.F + i10);
                eaVar.W.X(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(daVar.E, daVar.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.v5 update = org.telegram.ui.Components.z5.update(0, daVar, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, daVar.E, daVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    aa[] aaVarArr = this.h;
                    if (i13 >= aaVarArr.length) {
                        break;
                    }
                    aa aaVar = aaVarArr[i13];
                    if (aaVar != null) {
                        canvas.save();
                        float f11 = aaVar.c;
                        float f12 = aaVar.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, daVar.w);
                            float lerp2 = AndroidUtilities.lerp(aaVar.d, aaVar.f, pr.g.getInterpolation(daVar.w));
                            canvas.translate(daVar.E + lerp, daVar.F + i10 + lerp2);
                            if (z10) {
                                f(aaVar.b, daVar.E + lerp, daVar.F + i10 + lerp2);
                            }
                            aaVar.b.draw(canvas);
                            org.telegram.ui.Components.v5 update2 = org.telegram.ui.Components.z5.update(0, daVar, aaVar.a, aaVar.b);
                            aaVar.a = update2;
                            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, aaVar.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (daVar.w != f10) {
                            canvas.translate(daVar.E + f12, daVar.F + i10 + aaVar.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, aaVar.b.getWidth(), aaVar.b.getHeight(), (int) (daVar.w * 255.0f), 31);
                            d(aaVar.b, canvas, arrayList);
                            if (z10) {
                                f(aaVar.b, daVar.E + aaVar.e, daVar.F + i10 + aaVar.f);
                            }
                            aaVar.b.draw(canvas);
                            org.telegram.ui.Components.v5 update3 = org.telegram.ui.Components.z5.update(0, daVar, aaVar.a, aaVar.b);
                            aaVar.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, aaVar.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, daVar.w, porterDuffColorFilter);
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
            canvas.translate(daVar.E, daVar.F + i10);
            if (eaVar.W.y()) {
                eaVar.W.X(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.v5 update4 = org.telegram.ui.Components.z5.update(0, daVar, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, daVar.E, daVar.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(daVar.E, (AndroidUtilities.lerp(this.m, this.l, daVar.w) + daVar.F) - this.p.b());
            z9 z9Var2 = this.p;
            int width2 = daVar.getWidth();
            int i14 = daVar.E;
            z9Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            wh.h.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i10) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        da daVar = this.v;
        ea eaVar = daVar.J;
        TextPaint textPaint = daVar.d;
        ca[] caVarArr = daVar.r;
        TextPaint textPaint2 = daVar.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            z9 z9Var = this.o;
            if (z9Var != null) {
                this.l = AndroidUtilities.dp(4.0f) + z9Var.b();
            }
            z9 z9Var2 = this.p;
            if (z9Var2 != null) {
                this.l = org.telegram.messenger.w1.C(4.0f, z9Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == caVarArr[0]) {
                daVar.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = da.a(daVar, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        z9 z9Var3 = this.o;
        int dp = z9Var3 != null ? AndroidUtilities.dp(8.0f) + z9Var3.b() : 0;
        z9 z9Var4 = this.p;
        if (z9Var4 != null) {
            this.l = org.telegram.messenger.w1.C(8.0f, z9Var4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        daVar.b = z10;
        if (!z10) {
            staticLayout = null;
        } else if (this.e.getLineCount() == 4) {
            staticLayout = null;
            if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                daVar.b = false;
            }
        } else {
            staticLayout = null;
        }
        if (daVar.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == caVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                daVar.v = da.a(daVar, textPaint, string, i10);
                daVar.h = ((daVar.F + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                daVar.n = (daVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            z9 z9Var5 = this.o;
            int dp2 = topPadding2 + (z9Var5 != null ? AndroidUtilities.dp(8.0f) + z9Var5.b() : 0);
            z9 z9Var6 = this.p;
            this.m = dp2 + (z9Var6 != null ? AndroidUtilities.dp(8.0f) + z9Var6.b() : 0);
            this.g = da.a(daVar, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.h.c(eaVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i11 = 0;
                while (true) {
                    aa[] aaVarArr = this.h;
                    if (i11 >= aaVarArr.length) {
                        break;
                    }
                    aa aaVar = aaVarArr[i11];
                    if (aaVar != null) {
                        org.telegram.ui.Components.z5.release(eaVar, aaVar.a);
                    }
                    i11++;
                }
            }
            this.h = new aa[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i12 = 3; i12 < this.e.getLineCount(); i12++) {
                    int lineStart = this.e.getLineStart(i12);
                    int lineEnd = this.e.getLineEnd(i12);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i12 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = da.a(daVar, textPaint2, subSequence, i10);
                        aa aaVar2 = new aa();
                        this.h[i12 - 3] = aaVar2;
                        aaVar2.b = a10;
                        aaVar2.e = this.e.getLineLeft(i12);
                        aaVar2.f = this.e.getTopPadding() + this.e.getLineTop(i12);
                        if (lineRight < daVar.n - AndroidUtilities.dp(16.0f)) {
                            aaVar2.d = topPadding;
                            aaVar2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            aaVar2.d = aaVar2.f;
                            aaVar2.c = aaVar2.e;
                        }
                    }
                }
            }
        } else {
            if (this == caVarArr[0]) {
                staticLayout2 = staticLayout;
                daVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.h.c(daVar, this.e, stack, arrayList);
        }
        int i13 = daVar.E;
        int i14 = daVar.F;
        wh.m mVar = this.k;
        mVar.c = i13;
        mVar.d = i14;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            da daVar = this.v;
            float f12 = lineLeft - (daVar.E / 3.0f);
            float lineRight = (daVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (daVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (daVar.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, z9 z9Var, z9 z9Var2) {
        this.n = charSequence;
        this.o = z9Var;
        this.p = z9Var2;
        da daVar = this.v;
        if (z9Var != null) {
            ba baVar = new ba(this, 0);
            z9Var.r = daVar;
            z9Var.s = baVar;
            new sl0(daVar);
            z9Var.j.setCallback(daVar);
            z9Var.h.a = daVar;
            z9Var.i.a = daVar;
            z9Var.c();
        }
        z9 z9Var3 = this.p;
        if (z9Var3 != null) {
            ba baVar2 = new ba(this, 1);
            z9Var3.r = daVar;
            z9Var3.s = baVar2;
            new sl0(daVar);
            z9Var3.j.setCallback(daVar);
            z9Var3.h.a = daVar;
            z9Var3.i.a = daVar;
            z9Var3.c();
        }
        daVar.s = 0;
        daVar.requestLayout();
    }
}
