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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x70;
import org.telegram.ui.sg0;
import org.telegram.ui.tg0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class jv implements org.telegram.ui.Cells.t9, dx0 {
    public static Paint T;
    public final AtomicReference D;
    public org.telegram.ui.Components.n5 E;
    public final r70 F;
    public r70 G;
    public a80 H;
    public n2.n0 I;
    public ds J;
    public boolean K;
    public xh.f L;
    public CharacterStyle M;
    public int N;
    public int O;
    public org.telegram.ui.Components.r5 P;
    public iu Q;
    public final RectF R;
    public View S;
    public final kv a;
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

    public jv(kv kvVar, CharSequence charSequence, int i7) {
        this(kvVar, charSequence, i7, Layout.Alignment.ALIGN_NORMAL);
    }

    public static b7.d s(Spanned spanned, int i7, int i10, TextPaint textPaint) {
        iu[] iuVarArr;
        int i11;
        b7.d dVar = new b7.d();
        int i12 = i10 - i7;
        if (i12 > 0) {
            org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spanned.getSpans(i7, i10, org.telegram.ui.Components.r5.class);
            f6[] f6VarArr = (f6[]) spanned.getSpans(i7, i10, f6.class);
            int[] iArr = (r5VarArr.length == 0 && f6VarArr.length == 0) ? null : new int[i12];
            int length = r5VarArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = i13;
                org.telegram.ui.Components.r5 r5Var = r5VarArr[i14];
                int spanStart = spanned.getSpanStart(r5Var);
                int min = Math.min(i10, spanned.getSpanEnd(r5Var));
                if (spanStart < i7 || spanStart >= i10 || min <= spanStart) {
                    i11 = i14;
                } else {
                    int i15 = spanStart - i7;
                    iArr[i15] = Math.max(iArr[i15], min);
                    i11 = i14;
                    dVar.c = Math.max(dVar.c, r5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                }
                i13 = i11 + 1;
            }
            for (f6 f6Var : f6VarArr) {
                int spanStart2 = spanned.getSpanStart(f6Var);
                int min2 = Math.min(i10, spanned.getSpanEnd(f6Var));
                if (spanStart2 >= i7 && spanStart2 < i10 && min2 > spanStart2) {
                    int i16 = spanStart2 - i7;
                    iArr[i16] = Math.max(iArr[i16], min2);
                    dVar.c = Math.max(dVar.c, f6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            iu[] iuVarArr2 = (iu[]) spanned.getSpans(i7, i10, iu.class);
            if (iuVarArr2.length > 0) {
                iuVarArr = null;
                for (iu iuVar : iuVarArr2) {
                    int spanStart3 = spanned.getSpanStart(iuVar);
                    if (iuVar.a.a.s > 0 && spanStart3 >= i7 && spanStart3 < i10) {
                        if (iuVarArr == null) {
                            iuVarArr = new iu[i12];
                        }
                        iuVarArr[spanStart3 - i7] = iuVar;
                    }
                }
            } else {
                iuVarArr = null;
            }
            if (iArr != null || iuVarArr != null) {
                int i17 = i7;
                while (i17 < i10) {
                    int i18 = i17 - i7;
                    iu iuVar2 = iuVarArr == null ? null : iuVarArr[i18];
                    if (iuVar2 != null) {
                        gu guVar = iuVar2.a;
                        jv jvVar = guVar.a;
                        jv jvVar2 = guVar.a;
                        if (jvVar.b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) jvVar2.b.getText();
                            b7.d s5 = s(spanned2, 0, spanned2.length(), jvVar2.b.getPaint());
                            dVar.a += s5.a;
                            dVar.b += Math.max(1, s5.b);
                            dVar.c = Math.max(dVar.c, s5.c);
                            i17 = Math.min(i10, spanned.getSpanEnd(iuVar2));
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

    @Override // org.telegram.ui.Components.dx0
    public final int b() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.t9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void d(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        kv kvVar = this.a;
        boolean E = kvVar.E();
        TextPaint textPaint = kvVar.w;
        int w02 = org.telegram.ui.ActionBar.k6.w0(E ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, kvVar.D);
        textPaint.setColor(w02);
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, kvVar.D);
        r70 r70Var = this.F;
        if (r70Var != null) {
            if (T == null) {
                Paint paint = new Paint(1);
                T = paint;
                paint.setPathEffect(r70.c());
            }
            T.setColor((kvVar.y.i() & 16777215) | 855638016);
            canvas.drawPath(r70Var, T);
        }
        View view2 = view != null ? view : this.S;
        n2.n0 n0Var = this.I;
        if (n0Var != null && n0Var.h(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.b;
        AtomicReference atomicReference = this.D;
        ArrayList arrayList = this.x;
        xh.f.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.b;
        eu0.a(canvas, staticLayout2);
        if (!kvVar.F()) {
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.b, this.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f10 = kvVar.V;
        if (f10 > 0.0f) {
            ij ijVar = kvVar.b;
            boolean z9 = kvVar.O || (ijVar != null && qp.s1(kvVar.a).s7.A(ijVar));
            if (this.H == null) {
                a80 a80Var = new a80();
                this.H = a80Var;
                a80Var.D = true;
                r70 r70Var2 = new r70(0);
                this.G = r70Var2;
                r70Var2.c = true;
                a80 a80Var2 = this.H;
                a80Var2.y = r70Var2;
                a80Var2.k(5.0f);
                this.H.b = -1L;
                this.G.reset();
                this.G.d(staticLayout2, 0, 0.0f);
                this.G.n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.G);
                r70 r70Var3 = this.G;
                r70Var3.n = true;
                r70Var3.a();
                this.H.l();
            }
            if (z9 && (this.H.d() || this.H.c())) {
                a80 a80Var3 = this.H;
                a80Var3.b = -1L;
                a80Var3.c = -1L;
            } else if (!z9 && !this.H.d() && !this.H.c()) {
                this.H.a();
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, kvVar.D);
            this.H.g(org.telegram.ui.ActionBar.k6.r1(0.05f, w03), org.telegram.ui.ActionBar.k6.r1(0.15f, w03), org.telegram.ui.ActionBar.k6.r1(0.1f, w03), org.telegram.ui.ActionBar.k6.r1(0.3f, w03));
            this.H.setAlpha((int) (f10 * 255.0f));
            this.H.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(iu iuVar, float f10, float f11) {
        float L = g0.L(8.0f);
        RectF rectF = iuVar.c;
        if (f10 < rectF.left - L || f10 >= rectF.right + L || f11 < rectF.top - L || f11 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.b;
            iu iuVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                iu[] iuVarArr = (iu[]) spanned.getSpans(0, spanned.length(), iu.class);
                if (iuVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(iuVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(iuVarArr[0]);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= spanned.length()) {
                            iuVar2 = iuVarArr[0];
                            break;
                        }
                        if ((i7 < spanStart || i7 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i7))) {
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (iuVar != iuVar2 || !this.R.contains(f10, f11)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void f(View view) {
        View view2 = this.S;
        if (view2 == view && view2 != null) {
            this.S = null;
            org.telegram.ui.Components.r5.release((View) null, this.E);
            this.E = null;
            n2.n0 n0Var = this.I;
            if (n0Var != null) {
                n0Var.c = null;
            }
            iu[] p10 = p();
            if (p10 != null) {
                for (iu iuVar : p10) {
                    View view3 = this.S;
                    iuVar.h = null;
                    iuVar.a.a.f(view3);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.dx0
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

    @Override // org.telegram.ui.Components.dx0
    public final void h(int i7) {
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void i(View view) {
        View view2 = this.S;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            f(view2);
        }
        this.S = view;
        this.E = org.telegram.ui.Components.r5.update(0, view, this.a.v && !this.w, this.E, this.b);
        n2.n0 n0Var = this.I;
        if (n0Var != null) {
            n0Var.c = this.S;
        }
        iu[] p10 = p();
        if (p10 != null) {
            for (iu iuVar : p10) {
                iuVar.a(this.S);
            }
        }
    }

    @Override // org.telegram.ui.Components.dx0
    public final void j(int i7) {
        this.c = i7;
    }

    public final void k() {
        ds dsVar = this.J;
        if (dsVar != null) {
            g0.r(dsVar);
            this.J = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        r2 = ((android.text.style.URLSpan) r13).getURL();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(CharacterStyle characterStyle, boolean z9) {
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
        kv kvVar = this.a;
        if (!z9 && (characterStyle instanceof URLSpan) && !(characterStyle instanceof v31) && url != null && url.startsWith("#")) {
            kvVar.getClass();
            if (url.startsWith("#")) {
                try {
                    substring = URLDecoder.decode(url.substring(1), "UTF-8");
                } catch (Exception unused) {
                    substring = url.substring(1);
                }
                if (!TextUtils.isEmpty(substring)) {
                    String lowerCase = substring.toLowerCase();
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) kvVar.k.get(lowerCase);
                    if (textanchor != null) {
                        View view3 = kvVar.Q;
                        if (view3 != null && (context = view3.getContext()) != null && (richText = textanchor.text) != null && !(richText instanceof TL_iv.textEmpty)) {
                            String str = textanchor.name;
                            SpannableStringBuilder l10 = kvVar.l(org.telegram.ui.web.w1.d(textanchor.text, "", str == null ? "" : str.toLowerCase()), 0);
                            org.telegram.ui.ActionBar.v2 l11 = k5.l(1, context, kvVar.D, true);
                            l11.u0 = false;
                            l11.v0 = false;
                            LinearLayout f10 = k5.f(context, 1);
                            TextView g10 = k5.g(context, 1, 16.0f);
                            g10.setTypeface(g0.o());
                            g10.setText(hd.M0(2131749191, null));
                            g10.setGravity((hd.a0 ? 5 : 3) | 16);
                            int i7 = org.telegram.ui.ActionBar.k6.j5;
                            org.telegram.ui.ActionBar.r6.V(g10, i7, kvVar.D);
                            g10.setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
                            f10.addView(g10, new LinearLayout.LayoutParams(-1, g0.L(48.0f)));
                            w70 w70Var = new w70(context, kvVar.D);
                            w70Var.setTextSize(1, iz.W0);
                            org.telegram.ui.ActionBar.r6.V(w70Var, i7, kvVar.D);
                            org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.k5, kvVar.D);
                            w70Var.setMovementMethod(LinkMovementMethod.getInstance());
                            w70Var.setPadding(g0.L(22.0f), 0, g0.L(22.0f), g0.L(16.0f));
                            w70Var.setText(l10);
                            f10.addView(w70Var, new LinearLayout.LayoutParams(-1, -2));
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.addView(f10, c8.ha.c(-2.0f, -1));
                            l11.N = frameLayout;
                            l11.show();
                            view2 = this.S;
                            if (view2 == null) {
                                view2.playSoundEffect(0);
                                return;
                            }
                            return;
                        }
                    } else {
                        Integer num = (Integer) kvVar.j.get(lowerCase);
                        if (num != null) {
                            int intValue = num.intValue();
                            if (kvVar.E != null && intValue >= 0 && intValue < kvVar.g.size()) {
                                ViewParent parent = kvVar.E.getParent();
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
                                    recyclerView.w0(0, (((kvVar.E.getTop() + kvVar.E.t0) + kvVar.r(intValue, null)) - recyclerView.getPaddingTop()) - g0.L(8.0f), null);
                                }
                            }
                        }
                        view2 = this.S;
                        if (view2 == null) {
                        }
                    }
                }
            }
        }
        CharacterStyle u31Var = ((characterStyle instanceof gv) && TLObject.hasFlag(((gv) characterStyle).b, 256)) ? new u31(this.b.getText(), this.N, this.O, kvVar.E() ? (byte) 1 : (byte) 0, null) : characterStyle;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
        if (l1Var != null && q1Var != null) {
            View view4 = this.S;
            if (view4 != null && !z9) {
                view4.playSoundEffect(0);
            }
            l1Var.N0(q1Var, u31Var, z9);
            return;
        }
        if (z9 || (view = this.S) == null || !(characterStyle instanceof ClickableSpan)) {
            return;
        }
        view.playSoundEffect(0);
        ((ClickableSpan) characterStyle).onClick(this.S);
    }

    public final void m(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        kv kvVar = this.a;
        boolean E = kvVar.E();
        TextPaint textPaint = kvVar.w;
        final int w02 = org.telegram.ui.ActionBar.k6.w0(E ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, kvVar.D);
        textPaint.setColor(w02);
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, kvVar.D);
        final View view = this.S;
        tg0.b(canvas, this.b, i7, f10, new sg0() { // from class: org.telegram.messenger.iv
            @Override // org.telegram.ui.sg0
            public final void d(Canvas canvas2) {
                jv jvVar = jv.this;
                AtomicReference atomicReference = jvVar.D;
                StaticLayout staticLayout = jvVar.b;
                ArrayList arrayList = jvVar.x;
                xh.f.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                eu0.a(canvas2, jvVar.b);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, jvVar.b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
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

    public final boolean o(CharacterStyle characterStyle, wt wtVar) {
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
        wtVar.a = staticLayout;
        wtVar.b = spanStart;
        wtVar.c = spanEnd;
        wtVar.d = staticLayout.getWidth();
        return true;
    }

    public final iu[] p() {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (iu[]) spanned.getSpans(0, spanned.length(), iu.class);
    }

    public final int q() {
        return Math.max(0, this.n - this.f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        gv gvVar;
        gv gvVar2;
        int spanEnd;
        gv gvVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n10 = n() + ((int) motionEvent.getX());
        int y10 = (int) motionEvent.getY();
        ArrayList arrayList = this.x;
        kv kvVar = this.a;
        StaticLayout staticLayout = this.b;
        boolean z11 = true;
        int i7 = 0;
        if (actionMasked == 0) {
            this.L = null;
            this.M = null;
            this.P = null;
            this.Q = null;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                xh.f fVar = (xh.f) obj;
                if (fVar.getBounds().contains(n10, y10)) {
                    this.L = fVar;
                    return true;
                }
            }
            iu[] p10 = p();
            if (p10 != null) {
                for (iu iuVar : p10) {
                    if (e(iuVar, n10, y10)) {
                        gu guVar = iuVar.a;
                        if (guVar.b) {
                            return true;
                        }
                        this.Q = iuVar;
                        this.K = false;
                        guVar.m(true);
                        View view = this.S;
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
                        this.M = clickableSpan;
                        this.N = spannable.getSpanStart(clickableSpan);
                        this.O = spannable.getSpanEnd(this.M);
                        this.K = false;
                        x70 x70Var = new x70(this.M, kvVar.D, f10, y10, 0);
                        r70 b10 = x70Var.b();
                        b10.d(staticLayout, this.N, 0.0f);
                        staticLayout.getSelectionPath(this.N, this.O, b10);
                        if (this.I == null) {
                            this.I = new n2.n0(this.S);
                        }
                        this.I.b(x70Var, null);
                        View view2 = this.S;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    gv[] gvVarArr = (gv[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, gv.class);
                    if (gvVarArr != null) {
                        int length = gvVarArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            z10 = z11;
                            gvVar = gvVarArr[i11];
                            if (TLObject.hasFlag(gvVar.b, 256)) {
                                break;
                            }
                            i11++;
                            z11 = z10;
                        }
                    }
                    z10 = z11;
                    gvVar = null;
                    if (gvVar != null) {
                        int spanStart2 = spannable.getSpanStart(gvVar);
                        int spanEnd2 = spannable.getSpanEnd(gvVar);
                        while (spanStart2 > 0) {
                            int i12 = spanStart2 - 1;
                            gv[] gvVarArr2 = (gv[]) spannable.getSpans(i12, i12, gv.class);
                            int length2 = gvVarArr2.length;
                            int i13 = i7;
                            while (true) {
                                if (i13 >= length2) {
                                    gvVar3 = null;
                                    break;
                                }
                                gvVar3 = gvVarArr2[i13];
                                if (TLObject.hasFlag(gvVar3.b, 256)) {
                                    break;
                                }
                                i13++;
                            }
                            if (gvVar3 == null || (spanStart = spannable.getSpanStart(gvVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i7 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            gv[] gvVarArr3 = (gv[]) spannable.getSpans(spanEnd2, spanEnd2, gv.class);
                            int length3 = gvVarArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    gvVar2 = null;
                                    break;
                                }
                                gvVar2 = gvVarArr3[i14];
                                if (TLObject.hasFlag(gvVar2.b, 256)) {
                                    break;
                                }
                                i14++;
                            }
                            if (gvVar2 == null || (spanEnd = spannable.getSpanEnd(gvVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.M = gvVar;
                        this.N = spanStart2;
                        this.O = spanEnd2;
                        this.K = false;
                        x70 x70Var2 = new x70(gvVar, kvVar.D, f10, y10, 0);
                        r70 b11 = x70Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.I == null) {
                            this.I = new n2.n0(this.S);
                        }
                        this.I.b(x70Var2, null);
                        View view3 = this.S;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z10;
                    }
                    org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.r5.class);
                    if (r5VarArr != null && r5VarArr.length > 0) {
                        this.P = r5VarArr[0];
                        return z10;
                    }
                }
            }
            return false;
        }
        if (actionMasked == 2) {
            iu iuVar2 = this.Q;
            if (iuVar2 != null) {
                if (e(iuVar2, n10, y10)) {
                    return true;
                }
                k();
                this.Q.a.m(false);
                this.Q = null;
                this.K = false;
                return true;
            }
        } else {
            if (actionMasked == 1) {
                if (this.Q != null) {
                    k();
                    iu iuVar3 = this.Q;
                    this.Q = null;
                    iuVar3.a.m(false);
                    if (this.K) {
                        z9 = false;
                    } else {
                        View view4 = this.S;
                        if (view4 != null) {
                            view4.playSoundEffect(0);
                        }
                        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
                        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
                        TL_iv.textButton textbutton = iuVar3.b;
                        if (q1Var != null && l1Var != null) {
                            l1Var.b1(q1Var, textbutton);
                        }
                        z9 = false;
                    }
                    this.K = z9;
                    return true;
                }
                if (this.L != null) {
                    float width = staticLayout.getWidth();
                    float height = staticLayout.getHeight();
                    float sqrt = (float) Math.sqrt((height * height) + (width * width));
                    View view5 = this.S;
                    this.L.q = new hv(this, view5, kvVar);
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
                    this.L = null;
                    return true;
                }
                if (this.M != null) {
                    k();
                    if (!this.K) {
                        l(this.M, false);
                    }
                    n2.n0 n0Var = this.I;
                    if (n0Var != null) {
                        n0Var.f(true);
                    }
                    this.M = null;
                    this.K = false;
                    return true;
                }
                org.telegram.ui.Components.r5 r5Var = this.P;
                if (r5Var == null) {
                    return false;
                }
                this.P = null;
                org.telegram.ui.Cells.q1 q1Var2 = kvVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = kvVar.F;
                if (q1Var2 == null || l1Var2 == null) {
                    return true;
                }
                View view6 = this.S;
                if (view6 != null) {
                    view6.playSoundEffect(0);
                }
                l1Var2.n0(r5Var);
                return true;
            }
            if (actionMasked == 3) {
                this.L = null;
                this.P = null;
                if (this.Q != null) {
                    k();
                    this.Q.a.m(false);
                    this.Q = null;
                    this.K = false;
                }
                if (this.M != null) {
                    k();
                    n2.n0 n0Var2 = this.I;
                    if (n0Var2 != null) {
                        n0Var2.f(true);
                    }
                    this.M = null;
                    this.K = false;
                    return false;
                }
            }
        }
        return false;
    }

    public final void u() {
        k();
        ds dsVar = new ds(this, 8);
        this.J = dsVar;
        g0.i3(dsVar, ViewConfiguration.getLongPressTimeout());
    }

    public jv(kv kvVar, CharSequence charSequence, int i7, Layout.Alignment alignment) {
        this(kvVar, charSequence, i7, alignment, 1.0f);
    }

    public jv(kv kvVar, CharSequence charSequence, int i7, Layout.Alignment alignment, float f10) {
        boolean z9;
        int i10;
        int L;
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.r5> cls;
        int i12;
        this.x = new ArrayList();
        this.y = new Stack();
        this.D = new AtomicReference();
        this.R = new RectF();
        this.a = kvVar;
        TextPaint textPaint = kvVar.w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z10 = true;
        boolean z11 = false;
        if (charSequence instanceof Spanned) {
            for (gv gvVar : (gv[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), gv.class)) {
                int i13 = gvVar.b & 15;
                if (i13 >= 1 && i13 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    gvVar.a(textPaint2);
                    fontMetricsInt = textPaint2.getFontMetricsInt();
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        CharSequence n10 = i6.n(charSequence, fontMetricsInt, false, null, 0, z9 ? 0.85f : 1.0f, 0);
        if (n10 instanceof Spanned) {
            Spanned spanned = (Spanned) n10;
            Class<org.telegram.ui.Components.r5> cls2 = org.telegram.ui.Components.r5.class;
            if (((org.telegram.ui.Components.r5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((f6[]) spanned.getSpans(0, spanned.length(), f6.class)).length != 0 || ((iu[]) spanned.getSpans(0, spanned.length(), iu.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                for (org.telegram.ui.Components.r5 r5Var : (org.telegram.ui.Components.r5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    r5Var.setPreserveFontMetrics(true);
                }
                for (f6 f6Var : (f6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), f6.class)) {
                    f6Var.e = true;
                }
                for (iu iuVar : (iu[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), iu.class)) {
                    if (iuVar.a.a.s > 0) {
                        iuVar.e = true;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= spannableStringBuilder2.length()) {
                        spannableStringBuilder = spannableStringBuilder2;
                        break;
                    }
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i14);
                    boolean z12 = indexOf >= 0 ? z10 : z11;
                    indexOf = z12 ? indexOf : spannableStringBuilder2.length();
                    b7.d s5 = s(spannableStringBuilder2, i14, indexOf, textPaint);
                    int i15 = s5.b;
                    if (i15 <= 0 || s5.a * 100 < i15 * 70 || (i12 = s5.c) <= 0) {
                        spannableStringBuilder = spannableStringBuilder2;
                        cls = cls2;
                    } else {
                        org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spannableStringBuilder2.getSpans(i14, indexOf, cls2);
                        int length = r5VarArr.length;
                        int i16 = 0;
                        while (i16 < length) {
                            org.telegram.ui.Components.r5 r5Var2 = r5VarArr[i16];
                            Class<org.telegram.ui.Components.r5> cls3 = cls2;
                            int spanStart = spannableStringBuilder2.getSpanStart(r5Var2);
                            if (spanStart >= i14 && spanStart < indexOf) {
                                r5Var2.setMinimumLineHeight(i12);
                            }
                            i16++;
                            cls2 = cls3;
                        }
                        cls = cls2;
                        for (f6 f6Var2 : (f6[]) spannableStringBuilder2.getSpans(i14, indexOf, f6.class)) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(f6Var2);
                            if (spanStart2 >= i14 && spanStart2 < indexOf) {
                                f6Var2.f = i12;
                            }
                        }
                        iu[] iuVarArr = (iu[]) spannableStringBuilder2.getSpans(i14, indexOf, iu.class);
                        int length2 = iuVarArr.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            iu iuVar2 = iuVarArr[i17];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(iuVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (iuVar2.a.a.s > 0 && spanStart3 >= i14 && spanStart3 < indexOf) {
                                iuVar2.f = i12;
                            }
                            i17++;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        }
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (!z12) {
                        break;
                    }
                    i14 = indexOf + 1;
                    cls2 = cls;
                    spannableStringBuilder2 = spannableStringBuilder;
                    z10 = true;
                    z11 = false;
                }
                n10 = spannableStringBuilder;
            }
        }
        int d = li.c6.d(n10);
        this.s = d;
        if (d == 0 && (n10 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n10;
            iu[] iuVarArr2 = (iu[]) spanned2.getSpans(0, n10.length(), iu.class);
            if (iuVarArr2.length > 0) {
                Arrays.sort(iuVarArr2, new eu(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n10);
                int length3 = iuVarArr2.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length3) {
                        iu iuVar3 = iuVarArr2[i18];
                        int spanStart4 = spanned2.getSpanStart(iuVar3);
                        int spanEnd = spanned2.getSpanEnd(iuVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        jv jvVar = iuVar3.a.a;
                        if (jvVar.s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, jvVar.b.getText());
                        i18++;
                    } else {
                        this.s = li.c6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.s > 0 && (n10 instanceof Spanned)) {
            for (gv gvVar2 : (gv[]) ((Spanned) n10).getSpans(0, n10.length(), gv.class)) {
                if ((gvVar2.b & 15) == 14) {
                    gvVar2.d = true;
                }
            }
        }
        if (n10 instanceof Spanned) {
            gv[] gvVarArr = (gv[]) ((Spanned) n10).getSpans(0, n10.length(), gv.class);
            int length4 = gvVarArr.length;
            for (int i19 = 0; i19 < length4 && (gvVarArr[i19].b & 15) == 0; i19++) {
            }
        }
        this.b = ij.h5(n10, kvVar.w, i7, f10, 0.0f, false, alignment);
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
        r70 r70Var = null;
        xh.f.c(null, this.b, this.y, this.x);
        if (this.b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.b.getText();
            for (gv gvVar3 : (gv[]) spanned3.getSpans(0, spanned3.length(), gv.class)) {
                int i21 = gvVar3.b;
                if (TLObject.hasFlag(i21, TLObject.FLAG_13)) {
                    int spanStart5 = spanned3.getSpanStart(gvVar3);
                    int spanEnd2 = spanned3.getSpanEnd(gvVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (r70Var == null) {
                            i10 = 0;
                            r70Var = new r70(0);
                            r70Var.n = false;
                        } else {
                            i10 = 0;
                        }
                        r70Var.d(this.b, spanStart5, 0.0f);
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
                        r70Var.o = i11;
                        this.b.getSelectionPath(spanStart5, spanEnd2, r70Var);
                    }
                }
            }
            if (r70Var != null) {
                r70Var.n = true;
                this.F = r70Var;
            }
        }
    }
}
