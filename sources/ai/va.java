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
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r90;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class va {
    public o90 a;
    public org.telegram.ui.Components.y5 b;
    public final k90 c;
    public org.telegram.ui.Components.u5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.u5 f;
    public StaticLayout g;
    public ta[] h;
    public final ArrayList i;
    public final Stack j;
    public final vh.l k;
    public int l;
    public int m;
    public CharSequence n;
    public sa o;
    public sa p;
    public boolean q;
    public final org.telegram.ui.Components.d6 r;
    public final r90 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ wa v;

    public va(wa waVar) {
        this.v = waVar;
        this.c = new k90(waVar);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.d6(waVar.J, 0L, 400L, qr.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new vh.l(waVar, arrayList, new a1.c(this, 9));
        r90 r90Var = new r90();
        this.s = r90Var;
        r90Var.x = path;
        r90Var.j(4.0f);
        r90Var.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        r90Var.setCallback(waVar);
    }

    public final int a(int i10) {
        int i11;
        sa saVar = this.o;
        int i12 = 0;
        if (saVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar.b();
        } else {
            i11 = 0;
        }
        sa saVar2 = this.p;
        if (saVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + saVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        wa waVar = this.v;
        if (staticLayout == null) {
            return i10 - ((waVar.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!waVar.b) {
            return i10 - ((waVar.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * waVar.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        wa waVar = this.v;
        xa xaVar = waVar.J;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, xaVar.getWidth(), xaVar.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e);
            canvas2.restore();
        }
        if (e > 0.0f || this.q) {
            int i10 = (int) (e * 255.0f * lerp);
            r90 r90Var = this.s;
            r90Var.setAlpha(i10);
            r90Var.draw(canvas2);
            waVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        wa waVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = waVar.a;
        xa xaVar = waVar.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(waVar.E, waVar.F);
            sa saVar = this.o;
            int width = waVar.getWidth();
            int i12 = waVar.E;
            saVar.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(waVar.E, waVar.F + i10);
        if (this.c.f(canvas)) {
            waVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (xaVar.W.y()) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                xaVar.W.X(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.u5 update = org.telegram.ui.Components.y5.update(0, waVar, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, waVar.E, waVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    ta[] taVarArr = this.h;
                    if (i13 >= taVarArr.length) {
                        break;
                    }
                    ta taVar = taVarArr[i13];
                    if (taVar != null) {
                        canvas.save();
                        float f11 = taVar.c;
                        float f12 = taVar.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, waVar.w);
                            float lerp2 = AndroidUtilities.lerp(taVar.d, taVar.f, qr.g.getInterpolation(waVar.w));
                            canvas.translate(waVar.E + lerp, waVar.F + i10 + lerp2);
                            if (z10) {
                                f(taVar.b, waVar.E + lerp, waVar.F + i10 + lerp2);
                            }
                            taVar.b.draw(canvas);
                            org.telegram.ui.Components.u5 update2 = org.telegram.ui.Components.y5.update(0, waVar, taVar.a, taVar.b);
                            taVar.a = update2;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, taVar.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (waVar.w != f10) {
                            canvas.translate(waVar.E + f12, waVar.F + i10 + taVar.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, taVar.b.getWidth(), taVar.b.getHeight(), (int) (waVar.w * 255.0f), 31);
                            d(taVar.b, canvas, arrayList);
                            if (z10) {
                                f(taVar.b, waVar.E + taVar.e, waVar.F + i10 + taVar.f);
                            }
                            taVar.b.draw(canvas);
                            org.telegram.ui.Components.u5 update3 = org.telegram.ui.Components.y5.update(0, waVar, taVar.a, taVar.b);
                            taVar.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, taVar.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, waVar.w, porterDuffColorFilter);
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
            canvas.translate(waVar.E, waVar.F + i10);
            if (xaVar.W.y()) {
                xaVar.W.X(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.u5 update4 = org.telegram.ui.Components.y5.update(0, waVar, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, waVar.E, waVar.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(waVar.E, (AndroidUtilities.lerp(this.m, this.l, waVar.w) + waVar.F) - this.p.b());
            sa saVar2 = this.p;
            int width2 = waVar.getWidth();
            int i14 = waVar.E;
            saVar2.a(canvas, (width2 - i14) - i14);
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
        StaticLayout staticLayout2;
        wa waVar = this.v;
        xa xaVar = waVar.J;
        TextPaint textPaint = waVar.d;
        va[] vaVarArr = waVar.r;
        TextPaint textPaint2 = waVar.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            sa saVar = this.o;
            if (saVar != null) {
                this.l = AndroidUtilities.dp(4.0f) + saVar.b();
            }
            sa saVar2 = this.p;
            if (saVar2 != null) {
                this.l = org.telegram.messenger.l0.C(4.0f, saVar2.b(), this.l);
            }
            this.m = this.l;
            if (this == vaVarArr[0]) {
                waVar.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = wa.a(waVar, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        sa saVar3 = this.o;
        int dp = saVar3 != null ? AndroidUtilities.dp(8.0f) + saVar3.b() : 0;
        sa saVar4 = this.p;
        if (saVar4 != null) {
            this.l = org.telegram.messenger.l0.C(8.0f, saVar4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        waVar.b = z10;
        if (!z10) {
            staticLayout = null;
        } else if (this.e.getLineCount() == 4) {
            staticLayout = null;
            if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                waVar.b = false;
            }
        } else {
            staticLayout = null;
        }
        if (waVar.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == vaVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                waVar.v = wa.a(waVar, textPaint, string, i10);
                waVar.h = ((waVar.F + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                waVar.n = (waVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            sa saVar5 = this.o;
            int dp2 = topPadding2 + (saVar5 != null ? AndroidUtilities.dp(8.0f) + saVar5.b() : 0);
            sa saVar6 = this.p;
            this.m = dp2 + (saVar6 != null ? AndroidUtilities.dp(8.0f) + saVar6.b() : 0);
            this.g = wa.a(waVar, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(xaVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i11 = 0;
                while (true) {
                    ta[] taVarArr = this.h;
                    if (i11 >= taVarArr.length) {
                        break;
                    }
                    ta taVar = taVarArr[i11];
                    if (taVar != null) {
                        org.telegram.ui.Components.y5.release(xaVar, taVar.a);
                    }
                    i11++;
                }
            }
            this.h = new ta[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i12 = 3; i12 < this.e.getLineCount(); i12++) {
                    int lineStart = this.e.getLineStart(i12);
                    int lineEnd = this.e.getLineEnd(i12);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i12 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = wa.a(waVar, textPaint2, subSequence, i10);
                        ta taVar2 = new ta();
                        this.h[i12 - 3] = taVar2;
                        taVar2.b = a10;
                        taVar2.e = this.e.getLineLeft(i12);
                        taVar2.f = this.e.getTopPadding() + this.e.getLineTop(i12);
                        if (lineRight < waVar.n - AndroidUtilities.dp(16.0f)) {
                            taVar2.d = topPadding;
                            taVar2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            taVar2.d = taVar2.f;
                            taVar2.c = taVar2.e;
                        }
                    }
                }
            }
        } else {
            if (this == vaVarArr[0]) {
                staticLayout2 = staticLayout;
                waVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(waVar, this.e, stack, arrayList);
        }
        int i13 = waVar.E;
        int i14 = waVar.F;
        vh.l lVar = this.k;
        lVar.c = i13;
        lVar.d = i14;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            wa waVar = this.v;
            float f12 = lineLeft - (waVar.E / 3.0f);
            float lineRight = (waVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (waVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (waVar.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, sa saVar, sa saVar2) {
        this.n = charSequence;
        this.o = saVar;
        this.p = saVar2;
        wa waVar = this.v;
        if (saVar != null) {
            ua uaVar = new ua(this, 0);
            saVar.r = waVar;
            saVar.s = uaVar;
            new fm0(waVar);
            saVar.j.setCallback(waVar);
            saVar.h.a = waVar;
            saVar.i.a = waVar;
            saVar.c();
        }
        sa saVar3 = this.p;
        if (saVar3 != null) {
            ua uaVar2 = new ua(this, 1);
            saVar3.r = waVar;
            saVar3.s = uaVar2;
            new fm0(waVar);
            saVar3.j.setCallback(waVar);
            saVar3.h.a = waVar;
            saVar3.i.a = waVar;
            saVar3.c();
        }
        waVar.s = 0;
        waVar.requestLayout();
    }
}
