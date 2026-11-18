package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.wg0;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class dv implements org.telegram.ui.Cells.t9, ox0 {
    public static Paint U;
    public final AtomicReference E;
    public org.telegram.ui.Components.t5 F;
    public final f80 G;
    public f80 H;
    public o80 I;
    public n2.o0 J;
    public xr K;
    public boolean L;
    public xh.f M;
    public CharacterStyle N;
    public int O;
    public int P;
    public org.telegram.ui.Components.x5 Q;
    public cu R;
    public final RectF S;
    public View T;
    public final ev a;
    public final StaticLayout b;
    public int c;
    public int d;
    public int e;
    public final int f;
    public final int h;
    public final int n;
    public boolean r;
    public final int s;
    public boolean w;
    public final ArrayList x;
    public final Stack y;

    public dv(ev evVar, CharSequence charSequence, int i7) {
        this(evVar, charSequence, i7, Layout.Alignment.ALIGN_NORMAL);
    }

    public static b7.d s(Spanned spanned, int i7, int i10, TextPaint textPaint) {
        cu[] cuVarArr;
        int i11;
        b7.d dVar = new b7.d();
        int i12 = i10 - i7;
        if (i12 > 0) {
            org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spanned.getSpans(i7, i10, org.telegram.ui.Components.x5.class);
            g6[] g6VarArr = (g6[]) spanned.getSpans(i7, i10, g6.class);
            int[] iArr = (x5VarArr.length == 0 && g6VarArr.length == 0) ? null : new int[i12];
            int length = x5VarArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = i13;
                org.telegram.ui.Components.x5 x5Var = x5VarArr[i14];
                int spanStart = spanned.getSpanStart(x5Var);
                int min = Math.min(i10, spanned.getSpanEnd(x5Var));
                if (spanStart < i7 || spanStart >= i10 || min <= spanStart) {
                    i11 = i14;
                } else {
                    int i15 = spanStart - i7;
                    iArr[i15] = Math.max(iArr[i15], min);
                    i11 = i14;
                    dVar.c = Math.max(dVar.c, x5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                }
                i13 = i11 + 1;
            }
            for (g6 g6Var : g6VarArr) {
                int spanStart2 = spanned.getSpanStart(g6Var);
                int min2 = Math.min(i10, spanned.getSpanEnd(g6Var));
                if (spanStart2 >= i7 && spanStart2 < i10 && min2 > spanStart2) {
                    int i16 = spanStart2 - i7;
                    iArr[i16] = Math.max(iArr[i16], min2);
                    dVar.c = Math.max(dVar.c, g6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            cu[] cuVarArr2 = (cu[]) spanned.getSpans(i7, i10, cu.class);
            if (cuVarArr2.length > 0) {
                cuVarArr = null;
                for (cu cuVar : cuVarArr2) {
                    int spanStart3 = spanned.getSpanStart(cuVar);
                    if (cuVar.a.a.s > 0 && spanStart3 >= i7 && spanStart3 < i10) {
                        if (cuVarArr == null) {
                            cuVarArr = new cu[i12];
                        }
                        cuVarArr[spanStart3 - i7] = cuVar;
                    }
                }
            } else {
                cuVarArr = null;
            }
            if (iArr != null || cuVarArr != null) {
                int i17 = i7;
                while (i17 < i10) {
                    int i18 = i17 - i7;
                    cu cuVar2 = cuVarArr == null ? null : cuVarArr[i18];
                    if (cuVar2 != null) {
                        au auVar = cuVar2.a;
                        dv dvVar = auVar.a;
                        dv dvVar2 = auVar.a;
                        if (dvVar.b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) dvVar2.b.getText();
                            b7.d s5 = s(spanned2, 0, spanned2.length(), dvVar2.b.getPaint());
                            dVar.a += s5.a;
                            dVar.b += Math.max(1, s5.b);
                            dVar.c = Math.max(dVar.c, s5.c);
                            i17 = Math.min(i10, spanned.getSpanEnd(cuVar2));
                        }
                    }
                    int i19 = iArr == null ? 0 : iArr[i18];
                    if (i19 > i17) {
                        dVar.a++;
                        dVar.b++;
                        i17 = i19;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i17);
                        if (!Character.isWhitespace(codePointAt)) {
                            dVar.b++;
                        }
                        i17 += Character.charCount(codePointAt);
                    }
                }
            }
        }
        return dVar;
    }

    @Override // org.telegram.ui.Cells.t9
    public final Layout a() {
        return this.b;
    }

    @Override // org.telegram.ui.Components.ox0
    public final int b() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.t9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Components.ox0
    public final void d(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        ev evVar = this.a;
        boolean E = evVar.E();
        TextPaint textPaint = evVar.w;
        int w02 = org.telegram.ui.ActionBar.n6.w0(E ? org.telegram.ui.ActionBar.n6.Wc : org.telegram.ui.ActionBar.n6.Vc, evVar.D);
        textPaint.setColor(w02);
        textPaint.linkColor = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Yc : org.telegram.ui.ActionBar.n6.Xc, evVar.D);
        f80 f80Var = this.G;
        if (f80Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(f80.c());
            }
            U.setColor((evVar.y.i() & 16777215) | 855638016);
            canvas.drawPath(f80Var, U);
        }
        View view2 = view != null ? view : this.T;
        n2.o0 o0Var = this.J;
        if (o0Var != null && o0Var.h(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.x;
        xh.f.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.b;
        nu0.a(canvas, staticLayout2);
        if (!evVar.F()) {
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f10 = evVar.V;
        if (f10 > 0.0f) {
            fj fjVar = evVar.b;
            boolean z10 = evVar.O || (fjVar != null && mp.u1(evVar.a).v7.A(fjVar));
            if (this.I == null) {
                o80 o80Var = new o80();
                this.I = o80Var;
                o80Var.D = true;
                f80 f80Var2 = new f80(0);
                this.H = f80Var2;
                f80Var2.c = true;
                o80 o80Var2 = this.I;
                o80Var2.y = f80Var2;
                o80Var2.k(5.0f);
                this.I.b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                f80 f80Var3 = this.H;
                f80Var3.n = true;
                f80Var3.a();
                this.I.l();
            }
            if (z10 && (this.I.d() || this.I.c())) {
                o80 o80Var3 = this.I;
                o80Var3.b = -1L;
                o80Var3.c = -1L;
            } else if (!z10 && !this.I.d() && !this.I.c()) {
                this.I.a();
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Yc : org.telegram.ui.ActionBar.n6.Xc, evVar.D);
            this.I.g(org.telegram.ui.ActionBar.n6.r1(0.05f, w03), org.telegram.ui.ActionBar.n6.r1(0.15f, w03), org.telegram.ui.ActionBar.n6.r1(0.1f, w03), org.telegram.ui.ActionBar.n6.r1(0.3f, w03));
            this.I.setAlpha((int) (f10 * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(cu cuVar, float f10, float f11) {
        float L = g0.L(8.0f);
        RectF rectF = cuVar.c;
        if (f10 < rectF.left - L || f10 >= rectF.right + L || f11 < rectF.top - L || f11 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.b;
            cu cuVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                cu[] cuVarArr = (cu[]) spanned.getSpans(0, spanned.length(), cu.class);
                if (cuVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(cuVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(cuVarArr[0]);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= spanned.length()) {
                            cuVar2 = cuVarArr[0];
                            break;
                        }
                        if ((i7 < spanStart || i7 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i7))) {
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (cuVar != cuVar2 || !this.S.contains(f10, f11)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ox0
    public final void f(View view) {
        View view2 = this.T;
        if (view2 == view && view2 != null) {
            this.T = null;
            org.telegram.ui.Components.x5.release((View) null, this.F);
            this.F = null;
            n2.o0 o0Var = this.J;
            if (o0Var != null) {
                o0Var.c = null;
            }
            cu[] p10 = p();
            if (p10 != null) {
                for (cu cuVar : p10) {
                    cuVar.b(this.T);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ox0
    public final void g(int i7) {
        this.e = i7;
    }

    @Override // org.telegram.ui.Cells.t9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getRow() {
        return this.e;
    }

    @Override // org.telegram.ui.Cells.t9
    public final CharSequence getText() {
        if (a() == null) {
            return null;
        }
        return a().getText();
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getX() {
        return this.c;
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getY() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.ox0
    public final void h(int i7) {
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.ox0
    public final void i(View view) {
        View view2 = this.T;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            f(view2);
        }
        this.T = view;
        this.F = org.telegram.ui.Components.x5.update(0, view, this.a.v && !this.w, this.F, this.b);
        n2.o0 o0Var = this.J;
        if (o0Var != null) {
            o0Var.c = this.T;
        }
        cu[] p10 = p();
        if (p10 != null) {
            for (cu cuVar : p10) {
                cuVar.a(this.T);
            }
        }
    }

    @Override // org.telegram.ui.Components.ox0
    public final void j(int i7) {
        this.c = i7;
    }

    public final void k() {
        xr xrVar = this.K;
        if (xrVar != null) {
            g0.r(xrVar);
            this.K = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        r2 = ((android.text.style.URLSpan) r13).getURL();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(CharacterStyle characterStyle, boolean z10) {
        View view;
        String url;
        String substring;
        RecyclerView recyclerView;
        View view2;
        Context context;
        TL_iv.RichText richText;
        if (characterStyle == null) {
            return;
        }
        ev evVar = this.a;
        if (!z10 && (characterStyle instanceof URLSpan) && !(characterStyle instanceof p41) && url != null && url.startsWith("#")) {
            evVar.getClass();
            if (url.startsWith("#")) {
                try {
                    substring = URLDecoder.decode(url.substring(1), "UTF-8");
                } catch (Exception unused) {
                    substring = url.substring(1);
                }
                if (!TextUtils.isEmpty(substring)) {
                    String lowerCase = substring.toLowerCase();
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) evVar.k.get(lowerCase);
                    if (textanchor != null) {
                        View view3 = evVar.Q;
                        if (view3 != null && (context = view3.getContext()) != null && (richText = textanchor.text) != null && !(richText instanceof TL_iv.textEmpty)) {
                            String str = textanchor.name;
                            SpannableStringBuilder l10 = evVar.l(org.telegram.ui.web.v1.d(textanchor.text, "", str == null ? "" : str.toLowerCase()), 0);
                            org.telegram.ui.ActionBar.x2 j3 = f3.j(1, context, evVar.D, true);
                            j3.v0 = false;
                            j3.w0 = false;
                            LinearLayout g10 = f3.g(context, 1);
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 16.0f);
                            textView.setTypeface(g0.o());
                            textView.setText(gd.M0(2131749000, null));
                            textView.setGravity((gd.a0 ? 5 : 3) | 16);
                            int i7 = org.telegram.ui.ActionBar.n6.j5;
                            org.telegram.ui.ActionBar.u6.U(textView, i7, evVar.D);
                            textView.setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
                            g10.addView(textView, new LinearLayout.LayoutParams(-1, g0.L(48.0f)));
                            k80 k80Var = new k80(context, evVar.D);
                            k80Var.setTextSize(1, bz.W0);
                            org.telegram.ui.ActionBar.u6.U(k80Var, i7, evVar.D);
                            org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.k5, evVar.D);
                            k80Var.setMovementMethod(LinkMovementMethod.getInstance());
                            k80Var.setPadding(g0.L(22.0f), 0, g0.L(22.0f), g0.L(16.0f));
                            k80Var.setText(l10);
                            g10.addView(k80Var, new LinearLayout.LayoutParams(-1, -2));
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.addView(g10, c8.ma.c(-2.0f, -1));
                            j3.O = frameLayout;
                            j3.show();
                            view2 = this.T;
                            if (view2 == null) {
                                view2.playSoundEffect(0);
                                return;
                            }
                            return;
                        }
                    } else {
                        Integer num = (Integer) evVar.j.get(lowerCase);
                        if (num != null) {
                            int intValue = num.intValue();
                            if (evVar.E != null && intValue >= 0 && intValue < evVar.g.size()) {
                                ViewParent parent = evVar.E.getParent();
                                while (true) {
                                    if (parent == null) {
                                        recyclerView = null;
                                        break;
                                    } else {
                                        if (parent instanceof RecyclerView) {
                                            recyclerView = (RecyclerView) parent;
                                            break;
                                        }
                                        parent = parent.getParent();
                                    }
                                }
                                if (recyclerView != null) {
                                    recyclerView.w0(0, (((evVar.E.getTop() + evVar.E.u0) + evVar.r(intValue, null)) - recyclerView.getPaddingTop()) - g0.L(8.0f), null);
                                }
                            }
                        }
                        view2 = this.T;
                        if (view2 == null) {
                        }
                    }
                }
            }
        }
        CharacterStyle o41Var = ((characterStyle instanceof av) && TLObject.hasFlag(((av) characterStyle).b, 256)) ? new o41(this.b.getText(), this.O, this.P, evVar.E() ? (byte) 1 : (byte) 0, null) : characterStyle;
        org.telegram.ui.Cells.l1 l1Var = evVar.F;
        org.telegram.ui.Cells.q1 q1Var = evVar.E;
        if (l1Var != null && q1Var != null) {
            View view4 = this.T;
            if (view4 != null && !z10) {
                view4.playSoundEffect(0);
            }
            l1Var.T0(q1Var, o41Var, z10);
            return;
        }
        if (z10 || (view = this.T) == null || !(characterStyle instanceof ClickableSpan)) {
            return;
        }
        view.playSoundEffect(0);
        ((ClickableSpan) characterStyle).onClick(this.T);
    }

    public final void m(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        ev evVar = this.a;
        boolean E = evVar.E();
        TextPaint textPaint = evVar.w;
        final int w02 = org.telegram.ui.ActionBar.n6.w0(E ? org.telegram.ui.ActionBar.n6.Wc : org.telegram.ui.ActionBar.n6.Vc, evVar.D);
        textPaint.setColor(w02);
        textPaint.linkColor = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Yc : org.telegram.ui.ActionBar.n6.Xc, evVar.D);
        final View view = this.T;
        xg0.b(canvas, this.b, i7, f10, new wg0() { // from class: org.telegram.messenger.cv
            @Override // org.telegram.ui.wg0
            public final void a(Canvas canvas2) {
                dv dvVar = dv.this;
                AtomicReference atomicReference = dvVar.E;
                StaticLayout staticLayout = dvVar.b;
                ArrayList arrayList = dvVar.x;
                xh.f.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                nu0.a(canvas2, dvVar.b);
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        });
        canvas.restore();
    }

    public final int n() {
        if (this.r) {
            return 0;
        }
        return this.f;
    }

    public final boolean o(CharacterStyle characterStyle, qt qtVar) {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return false;
        }
        qtVar.a = staticLayout;
        qtVar.b = spanStart;
        qtVar.c = spanEnd;
        qtVar.d = staticLayout.getWidth();
        return true;
    }

    public final cu[] p() {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (cu[]) spanned.getSpans(0, spanned.length(), cu.class);
    }

    public final int q() {
        return Math.max(0, this.n - this.f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        av avVar;
        av avVar2;
        int spanEnd;
        av avVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n10 = n() + ((int) motionEvent.getX());
        int y10 = (int) motionEvent.getY();
        ArrayList arrayList = this.x;
        ev evVar = this.a;
        StaticLayout staticLayout = this.b;
        boolean z12 = true;
        int i7 = 0;
        if (actionMasked == 0) {
            this.M = null;
            this.N = null;
            this.Q = null;
            this.R = null;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                xh.f fVar = (xh.f) obj;
                if (fVar.getBounds().contains(n10, y10)) {
                    this.M = fVar;
                    return true;
                }
            }
            cu[] p10 = p();
            if (p10 != null) {
                for (cu cuVar : p10) {
                    if (e(cuVar, n10, y10)) {
                        au auVar = cuVar.a;
                        if (auVar.b) {
                            return true;
                        }
                        this.R = cuVar;
                        this.L = false;
                        auVar.m(true);
                        View view = this.T;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y10 >= 0 && y10 < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y10);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f10 = n10;
                if (f10 >= lineLeft && f10 <= lineWidth) {
                    int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f10);
                    Spannable spannable = (Spannable) staticLayout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.N = clickableSpan;
                        this.O = spannable.getSpanStart(clickableSpan);
                        this.P = spannable.getSpanEnd(this.N);
                        this.L = false;
                        l80 l80Var = new l80(this.N, evVar.D, f10, y10, 0);
                        f80 b10 = l80Var.b();
                        b10.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b10);
                        if (this.J == null) {
                            this.J = new n2.o0(this.T);
                        }
                        this.J.b(l80Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    av[] avVarArr = (av[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, av.class);
                    if (avVarArr != null) {
                        int length = avVarArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            z11 = z12;
                            avVar = avVarArr[i11];
                            if (TLObject.hasFlag(avVar.b, 256)) {
                                break;
                            }
                            i11++;
                            z12 = z11;
                        }
                    }
                    z11 = z12;
                    avVar = null;
                    if (avVar != null) {
                        int spanStart2 = spannable.getSpanStart(avVar);
                        int spanEnd2 = spannable.getSpanEnd(avVar);
                        while (spanStart2 > 0) {
                            int i12 = spanStart2 - 1;
                            av[] avVarArr2 = (av[]) spannable.getSpans(i12, i12, av.class);
                            int length2 = avVarArr2.length;
                            int i13 = i7;
                            while (true) {
                                if (i13 >= length2) {
                                    avVar3 = null;
                                    break;
                                }
                                avVar3 = avVarArr2[i13];
                                if (TLObject.hasFlag(avVar3.b, 256)) {
                                    break;
                                }
                                i13++;
                            }
                            if (avVar3 == null || (spanStart = spannable.getSpanStart(avVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i7 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            av[] avVarArr3 = (av[]) spannable.getSpans(spanEnd2, spanEnd2, av.class);
                            int length3 = avVarArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    avVar2 = null;
                                    break;
                                }
                                avVar2 = avVarArr3[i14];
                                if (TLObject.hasFlag(avVar2.b, 256)) {
                                    break;
                                }
                                i14++;
                            }
                            if (avVar2 == null || (spanEnd = spannable.getSpanEnd(avVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = avVar;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        l80 l80Var2 = new l80(avVar, evVar.D, f10, y10, 0);
                        f80 b11 = l80Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.J == null) {
                            this.J = new n2.o0(this.T);
                        }
                        this.J.b(l80Var2, null);
                        View view3 = this.T;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z11;
                    }
                    org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.x5.class);
                    if (x5VarArr != null && x5VarArr.length > 0) {
                        this.Q = x5VarArr[0];
                        return z11;
                    }
                }
            }
            return false;
        }
        if (actionMasked == 2) {
            cu cuVar2 = this.R;
            if (cuVar2 != null) {
                if (e(cuVar2, n10, y10)) {
                    return true;
                }
                k();
                this.R.a.m(false);
                this.R = null;
                this.L = false;
                return true;
            }
        } else {
            if (actionMasked == 1) {
                if (this.R != null) {
                    k();
                    cu cuVar3 = this.R;
                    this.R = null;
                    cuVar3.a.m(false);
                    if (this.L) {
                        z10 = false;
                    } else {
                        View view4 = this.T;
                        if (view4 != null) {
                            view4.playSoundEffect(0);
                        }
                        org.telegram.ui.Cells.q1 q1Var = evVar.E;
                        org.telegram.ui.Cells.l1 l1Var = evVar.F;
                        TL_iv.textButton textbutton = cuVar3.b;
                        if (q1Var != null && l1Var != null) {
                            l1Var.k1(q1Var, textbutton);
                        }
                        z10 = false;
                    }
                    this.L = z10;
                    return true;
                }
                if (this.M != null) {
                    float width = staticLayout.getWidth();
                    float height = staticLayout.getHeight();
                    float sqrt = (float) Math.sqrt((height * height) + (width * width));
                    View view5 = this.T;
                    this.M.q = new bv(this, view5, evVar);
                    int size2 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj2 = arrayList.get(i15);
                        i15++;
                        ((xh.f) obj2).j(n10, y10, sqrt, false);
                    }
                    if (view5 != null) {
                        view5.playSoundEffect(0);
                    }
                    this.M = null;
                    return true;
                }
                if (this.N != null) {
                    k();
                    if (!this.L) {
                        l(this.N, false);
                    }
                    n2.o0 o0Var = this.J;
                    if (o0Var != null) {
                        o0Var.f(true);
                    }
                    this.N = null;
                    this.L = false;
                    return true;
                }
                org.telegram.ui.Components.x5 x5Var = this.Q;
                if (x5Var == null) {
                    return false;
                }
                this.Q = null;
                org.telegram.ui.Cells.q1 q1Var2 = evVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = evVar.F;
                if (q1Var2 == null || l1Var2 == null) {
                    return true;
                }
                View view6 = this.T;
                if (view6 != null) {
                    view6.playSoundEffect(0);
                }
                l1Var2.p0(x5Var);
                return true;
            }
            if (actionMasked == 3) {
                this.M = null;
                this.Q = null;
                if (this.R != null) {
                    k();
                    this.R.a.m(false);
                    this.R = null;
                    this.L = false;
                }
                if (this.N != null) {
                    k();
                    n2.o0 o0Var2 = this.J;
                    if (o0Var2 != null) {
                        o0Var2.f(true);
                    }
                    this.N = null;
                    this.L = false;
                    return false;
                }
            }
        }
        return false;
    }

    public final void u() {
        k();
        xr xrVar = new xr(this, 8);
        this.K = xrVar;
        g0.h3(xrVar, ViewConfiguration.getLongPressTimeout());
    }

    public dv(ev evVar, CharSequence charSequence, int i7, Layout.Alignment alignment) {
        this(evVar, charSequence, i7, alignment, 1.0f);
    }

    public dv(ev evVar, CharSequence charSequence, int i7, Layout.Alignment alignment, float f10) {
        boolean z10;
        int i10;
        int L;
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.x5> cls;
        int i12;
        this.x = new ArrayList();
        this.y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.a = evVar;
        TextPaint textPaint = evVar.w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z11 = true;
        boolean z12 = false;
        if (charSequence instanceof Spanned) {
            for (av avVar : (av[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), av.class)) {
                int i13 = avVar.b & 15;
                if (i13 >= 1 && i13 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    avVar.a(textPaint2);
                    fontMetricsInt = textPaint2.getFontMetricsInt();
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        CharSequence n10 = j6.n(charSequence, fontMetricsInt, false, null, 0, z10 ? 0.85f : 1.0f, 0);
        if (n10 instanceof Spanned) {
            Spanned spanned = (Spanned) n10;
            Class<org.telegram.ui.Components.x5> cls2 = org.telegram.ui.Components.x5.class;
            if (((org.telegram.ui.Components.x5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((g6[]) spanned.getSpans(0, spanned.length(), g6.class)).length != 0 || ((cu[]) spanned.getSpans(0, spanned.length(), cu.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                for (org.telegram.ui.Components.x5 x5Var : (org.telegram.ui.Components.x5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    x5Var.setPreserveFontMetrics(true);
                }
                for (g6 g6Var : (g6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), g6.class)) {
                    g6Var.e = true;
                }
                for (cu cuVar : (cu[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cu.class)) {
                    if (cuVar.a.a.s > 0) {
                        cuVar.e = true;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= spannableStringBuilder2.length()) {
                        spannableStringBuilder = spannableStringBuilder2;
                        break;
                    }
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i14);
                    boolean z13 = indexOf >= 0 ? z11 : z12;
                    indexOf = z13 ? indexOf : spannableStringBuilder2.length();
                    b7.d s5 = s(spannableStringBuilder2, i14, indexOf, textPaint);
                    int i15 = s5.b;
                    if (i15 <= 0 || s5.a * 100 < i15 * 70 || (i12 = s5.c) <= 0) {
                        spannableStringBuilder = spannableStringBuilder2;
                        cls = cls2;
                    } else {
                        org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spannableStringBuilder2.getSpans(i14, indexOf, cls2);
                        int length = x5VarArr.length;
                        int i16 = 0;
                        while (i16 < length) {
                            org.telegram.ui.Components.x5 x5Var2 = x5VarArr[i16];
                            Class<org.telegram.ui.Components.x5> cls3 = cls2;
                            int spanStart = spannableStringBuilder2.getSpanStart(x5Var2);
                            if (spanStart >= i14 && spanStart < indexOf) {
                                x5Var2.setMinimumLineHeight(i12);
                            }
                            i16++;
                            cls2 = cls3;
                        }
                        cls = cls2;
                        for (g6 g6Var2 : (g6[]) spannableStringBuilder2.getSpans(i14, indexOf, g6.class)) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(g6Var2);
                            if (spanStart2 >= i14 && spanStart2 < indexOf) {
                                g6Var2.f = i12;
                            }
                        }
                        cu[] cuVarArr = (cu[]) spannableStringBuilder2.getSpans(i14, indexOf, cu.class);
                        int length2 = cuVarArr.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            cu cuVar2 = cuVarArr[i17];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(cuVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (cuVar2.a.a.s > 0 && spanStart3 >= i14 && spanStart3 < indexOf) {
                                cuVar2.f = i12;
                            }
                            i17++;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        }
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (!z13) {
                        break;
                    }
                    i14 = indexOf + 1;
                    cls2 = cls;
                    spannableStringBuilder2 = spannableStringBuilder;
                    z11 = true;
                    z12 = false;
                }
                n10 = spannableStringBuilder;
            }
        }
        int d = oi.b6.d(n10);
        this.s = d;
        if (d == 0 && (n10 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n10;
            cu[] cuVarArr2 = (cu[]) spanned2.getSpans(0, n10.length(), cu.class);
            if (cuVarArr2.length > 0) {
                Arrays.sort(cuVarArr2, new yt(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n10);
                int length3 = cuVarArr2.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length3) {
                        cu cuVar3 = cuVarArr2[i18];
                        int spanStart4 = spanned2.getSpanStart(cuVar3);
                        int spanEnd = spanned2.getSpanEnd(cuVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        dv dvVar = cuVar3.a.a;
                        if (dvVar.s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, dvVar.b.getText());
                        i18++;
                    } else {
                        this.s = oi.b6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.s > 0 && (n10 instanceof Spanned)) {
            for (av avVar2 : (av[]) ((Spanned) n10).getSpans(0, n10.length(), av.class)) {
                if ((avVar2.b & 15) == 14) {
                    avVar2.d = true;
                }
            }
        }
        if (n10 instanceof Spanned) {
            av[] avVarArr = (av[]) ((Spanned) n10).getSpans(0, n10.length(), av.class);
            int length4 = avVarArr.length;
            for (int i19 = 0; i19 < length4 && (avVarArr[i19].b & 15) == 0; i19++) {
            }
        }
        this.b = fj.g5(n10, evVar.w, i7, f10, 0.0f, false, alignment);
        this.f = i7;
        this.h = 0;
        for (int i20 = 0; i20 < this.b.getLineCount(); i20++) {
            this.f = Math.min(this.f, (int) Math.floor(this.b.getLineLeft(i20)));
            this.h = Math.max(this.h, (int) Math.ceil(this.b.getLineRight(i20)));
        }
        this.n = 0;
        if (this.b.getLineCount() > 0) {
            StaticLayout staticLayout = this.b;
            this.n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        f80 f80Var = null;
        xh.f.c(null, this.b, this.y, this.x);
        if (this.b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.b.getText();
            for (av avVar3 : (av[]) spanned3.getSpans(0, spanned3.length(), av.class)) {
                int i21 = avVar3.b;
                if (TLObject.hasFlag(i21, TLObject.FLAG_13)) {
                    int spanStart5 = spanned3.getSpanStart(avVar3);
                    int spanEnd2 = spanned3.getSpanEnd(avVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (f80Var == null) {
                            i10 = 0;
                            f80Var = new f80(0);
                            f80Var.n = false;
                        } else {
                            i10 = 0;
                        }
                        f80Var.d(this.b, spanStart5, 0.0f);
                        if (TLObject.hasFlag(i21, TLObject.FLAG_12)) {
                            L = -g0.L(6.0f);
                        } else {
                            L = TLObject.hasFlag(i21, 2048) ? g0.L(2.0f) : i10;
                        }
                        if (L != 0) {
                            i11 = L + g0.L(L > 0 ? 5.0f : -2.0f);
                        } else {
                            i11 = i10;
                        }
                        f80Var.o = i11;
                        this.b.getSelectionPath(spanStart5, spanEnd2, f80Var);
                    }
                }
            }
            if (f80Var != null) {
                f80Var.n = true;
                this.G = f80Var;
            }
        }
    }
}
