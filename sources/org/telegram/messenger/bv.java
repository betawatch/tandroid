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
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class bv implements org.telegram.ui.Cells.s9, dx0 {
    public static Paint U;
    public final AtomicReference E;
    public org.telegram.ui.Components.l5 F;
    public final n70 G;
    public n70 H;
    public w70 I;
    public m2.p0 J;
    public vs K;
    public boolean L;
    public yh.f M;
    public CharacterStyle N;
    public int O;
    public int P;
    public org.telegram.ui.Components.p5 Q;
    public au R;
    public final RectF S;
    public View T;
    public final cv a;
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

    public bv(cv cvVar, CharSequence charSequence, int i3) {
        this(cvVar, charSequence, i3, Layout.Alignment.ALIGN_NORMAL);
    }

    public static a7.d s(Spanned spanned, int i3, int i10, TextPaint textPaint) {
        au[] auVarArr;
        int i11;
        a7.d dVar = new a7.d();
        int i12 = i10 - i3;
        if (i12 > 0) {
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned.getSpans(i3, i10, org.telegram.ui.Components.p5.class);
            f6[] f6VarArr = (f6[]) spanned.getSpans(i3, i10, f6.class);
            int[] iArr = (p5VarArr.length == 0 && f6VarArr.length == 0) ? null : new int[i12];
            int length = p5VarArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = i13;
                org.telegram.ui.Components.p5 p5Var = p5VarArr[i14];
                int spanStart = spanned.getSpanStart(p5Var);
                int min = Math.min(i10, spanned.getSpanEnd(p5Var));
                if (spanStart < i3 || spanStart >= i10 || min <= spanStart) {
                    i11 = i14;
                } else {
                    int i15 = spanStart - i3;
                    iArr[i15] = Math.max(iArr[i15], min);
                    i11 = i14;
                    dVar.c = Math.max(dVar.c, p5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                }
                i13 = i11 + 1;
            }
            for (f6 f6Var : f6VarArr) {
                int spanStart2 = spanned.getSpanStart(f6Var);
                int min2 = Math.min(i10, spanned.getSpanEnd(f6Var));
                if (spanStart2 >= i3 && spanStart2 < i10 && min2 > spanStart2) {
                    int i16 = spanStart2 - i3;
                    iArr[i16] = Math.max(iArr[i16], min2);
                    dVar.c = Math.max(dVar.c, f6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            au[] auVarArr2 = (au[]) spanned.getSpans(i3, i10, au.class);
            if (auVarArr2.length > 0) {
                auVarArr = null;
                for (au auVar : auVarArr2) {
                    int spanStart3 = spanned.getSpanStart(auVar);
                    if (auVar.a.a.s > 0 && spanStart3 >= i3 && spanStart3 < i10) {
                        if (auVarArr == null) {
                            auVarArr = new au[i12];
                        }
                        auVarArr[spanStart3 - i3] = auVar;
                    }
                }
            } else {
                auVarArr = null;
            }
            if (iArr != null || auVarArr != null) {
                int i17 = i3;
                while (i17 < i10) {
                    int i18 = i17 - i3;
                    au auVar2 = auVarArr == null ? null : auVarArr[i18];
                    if (auVar2 != null) {
                        yt ytVar = auVar2.a;
                        bv bvVar = ytVar.a;
                        bv bvVar2 = ytVar.a;
                        if (bvVar.b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) bvVar2.b.getText();
                            a7.d s6 = s(spanned2, 0, spanned2.length(), bvVar2.b.getPaint());
                            dVar.a += s6.a;
                            dVar.b += Math.max(1, s6.b);
                            dVar.c = Math.max(dVar.c, s6.c);
                            i17 = Math.min(i10, spanned.getSpanEnd(auVar2));
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

    @Override // org.telegram.ui.Cells.s9
    public final Layout a() {
        return this.b;
    }

    @Override // org.telegram.ui.Components.dx0
    public final int b() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.s9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void d(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        cv cvVar = this.a;
        boolean E = cvVar.E();
        TextPaint textPaint = cvVar.w;
        int w02 = org.telegram.ui.ActionBar.k6.w0(E ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, cvVar.D);
        textPaint.setColor(w02);
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, cvVar.D);
        n70 n70Var = this.G;
        if (n70Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(n70.c());
            }
            U.setColor((cvVar.y.i() & 16777215) | 855638016);
            canvas.drawPath(n70Var, U);
        }
        View view2 = view != null ? view : this.T;
        m2.p0 p0Var = this.J;
        if (p0Var != null && p0Var.h(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.x;
        yh.f.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.b;
        du0.a(canvas, staticLayout2);
        if (!cvVar.F()) {
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f10 = cvVar.V;
        if (f10 > 0.0f) {
            zi ziVar = cvVar.b;
            boolean z10 = cvVar.O || (ziVar != null && hp.s1(cvVar.a).s7.A(ziVar));
            if (this.I == null) {
                w70 w70Var = new w70();
                this.I = w70Var;
                w70Var.D = true;
                n70 n70Var2 = new n70(0);
                this.H = n70Var2;
                n70Var2.c = true;
                w70 w70Var2 = this.I;
                w70Var2.y = n70Var2;
                w70Var2.k(5.0f);
                this.I.b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                n70 n70Var3 = this.H;
                n70Var3.n = true;
                n70Var3.a();
                this.I.l();
            }
            if (z10 && (this.I.d() || this.I.c())) {
                w70 w70Var3 = this.I;
                w70Var3.b = -1L;
                w70Var3.c = -1L;
            } else if (!z10 && !this.I.d() && !this.I.c()) {
                this.I.a();
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, cvVar.D);
            this.I.g(org.telegram.ui.ActionBar.k6.r1(0.05f, w03), org.telegram.ui.ActionBar.k6.r1(0.15f, w03), org.telegram.ui.ActionBar.k6.r1(0.1f, w03), org.telegram.ui.ActionBar.k6.r1(0.3f, w03));
            this.I.setAlpha((int) (f10 * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(au auVar, float f10, float f11) {
        float L = g0.L(8.0f);
        RectF rectF = auVar.c;
        if (f10 < rectF.left - L || f10 >= rectF.right + L || f11 < rectF.top - L || f11 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.b;
            au auVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                au[] auVarArr = (au[]) spanned.getSpans(0, spanned.length(), au.class);
                if (auVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(auVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(auVarArr[0]);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= spanned.length()) {
                            auVar2 = auVarArr[0];
                            break;
                        }
                        if ((i3 < spanStart || i3 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            if (auVar != auVar2 || !this.S.contains(f10, f11)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void f(View view) {
        View view2 = this.T;
        if (view2 == view && view2 != null) {
            this.T = null;
            org.telegram.ui.Components.p5.release((View) null, this.F);
            this.F = null;
            m2.p0 p0Var = this.J;
            if (p0Var != null) {
                p0Var.c = null;
            }
            au[] p10 = p();
            if (p10 != null) {
                for (au auVar : p10) {
                    View view3 = this.T;
                    auVar.h = null;
                    auVar.a.a.f(view3);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.dx0
    public final void g(int i3) {
        this.e = i3;
    }

    @Override // org.telegram.ui.Cells.s9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getRow() {
        return this.e;
    }

    @Override // org.telegram.ui.Cells.s9
    public final CharSequence getText() {
        if (a() == null) {
            return null;
        }
        return a().getText();
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getX() {
        return this.c;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getY() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void h(int i3) {
        this.d = i3;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void i(View view) {
        View view2 = this.T;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            f(view2);
        }
        this.T = view;
        this.F = org.telegram.ui.Components.p5.update(0, view, this.a.v && !this.w, this.F, this.b);
        m2.p0 p0Var = this.J;
        if (p0Var != null) {
            p0Var.c = this.T;
        }
        au[] p10 = p();
        if (p10 != null) {
            for (au auVar : p10) {
                auVar.a(this.T);
            }
        }
    }

    @Override // org.telegram.ui.Components.dx0
    public final void j(int i3) {
        this.c = i3;
    }

    public final void k() {
        vs vsVar = this.K;
        if (vsVar != null) {
            g0.r(vsVar);
            this.K = null;
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
        cv cvVar = this.a;
        if (!z10 && (characterStyle instanceof URLSpan) && !(characterStyle instanceof v31) && url != null && url.startsWith("#")) {
            cvVar.getClass();
            if (url.startsWith("#")) {
                try {
                    substring = URLDecoder.decode(url.substring(1), "UTF-8");
                } catch (Exception unused) {
                    substring = url.substring(1);
                }
                if (!TextUtils.isEmpty(substring)) {
                    String lowerCase = substring.toLowerCase();
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) cvVar.k.get(lowerCase);
                    if (textanchor != null) {
                        View view3 = cvVar.Q;
                        if (view3 != null && (context = view3.getContext()) != null && (richText = textanchor.text) != null && !(richText instanceof TL_iv.textEmpty)) {
                            String str = textanchor.name;
                            SpannableStringBuilder l10 = cvVar.l(org.telegram.ui.web.u1.d(textanchor.text, "", str == null ? "" : str.toLowerCase()), 0);
                            org.telegram.ui.ActionBar.t2 l11 = k5.l(1, context, cvVar.D, true);
                            l11.v0 = false;
                            l11.w0 = false;
                            LinearLayout f10 = k5.f(context, 1);
                            TextView g7 = k5.g(context, 1, 16.0f);
                            g7.setTypeface(g0.o());
                            g7.setText(bd.M0(2131749200, null));
                            g7.setGravity((bd.a0 ? 5 : 3) | 16);
                            int i3 = org.telegram.ui.ActionBar.k6.j5;
                            org.telegram.ui.ActionBar.r6.V(g7, i3, cvVar.D);
                            g7.setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
                            f10.addView(g7, new LinearLayout.LayoutParams(-1, g0.L(48.0f)));
                            s70 s70Var = new s70(context, cvVar.D);
                            s70Var.setTextSize(1, az.W0);
                            org.telegram.ui.ActionBar.r6.V(s70Var, i3, cvVar.D);
                            org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.k5, cvVar.D);
                            s70Var.setMovementMethod(LinkMovementMethod.getInstance());
                            s70Var.setPadding(g0.L(22.0f), 0, g0.L(22.0f), g0.L(16.0f));
                            s70Var.setText(l10);
                            f10.addView(s70Var, new LinearLayout.LayoutParams(-1, -2));
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.addView(f10, b8.mf.c(-2.0f, -1));
                            l11.O = frameLayout;
                            l11.show();
                            view2 = this.T;
                            if (view2 == null) {
                                view2.playSoundEffect(0);
                                return;
                            }
                            return;
                        }
                    } else {
                        Integer num = (Integer) cvVar.j.get(lowerCase);
                        if (num != null) {
                            int intValue = num.intValue();
                            if (cvVar.E != null && intValue >= 0 && intValue < cvVar.g.size()) {
                                ViewParent parent = cvVar.E.getParent();
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
                                    recyclerView.w0(0, (((cvVar.E.getTop() + cvVar.E.u0) + cvVar.r(intValue, null)) - recyclerView.getPaddingTop()) - g0.L(8.0f), null);
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
        CharacterStyle u31Var = ((characterStyle instanceof yu) && TLObject.hasFlag(((yu) characterStyle).b, 256)) ? new u31(this.b.getText(), this.O, this.P, cvVar.E() ? (byte) 1 : (byte) 0, null) : characterStyle;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
        org.telegram.ui.Cells.q1 q1Var = cvVar.E;
        if (l1Var != null && q1Var != null) {
            View view4 = this.T;
            if (view4 != null && !z10) {
                view4.playSoundEffect(0);
            }
            l1Var.N0(q1Var, u31Var, z10);
            return;
        }
        if (z10 || (view = this.T) == null || !(characterStyle instanceof ClickableSpan)) {
            return;
        }
        view.playSoundEffect(0);
        ((ClickableSpan) characterStyle).onClick(this.T);
    }

    public final void m(Canvas canvas, int i3, float f10) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        cv cvVar = this.a;
        boolean E = cvVar.E();
        TextPaint textPaint = cvVar.w;
        final int w02 = org.telegram.ui.ActionBar.k6.w0(E ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, cvVar.D);
        textPaint.setColor(w02);
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, cvVar.D);
        final View view = this.T;
        ng0.b(canvas, this.b, i3, f10, new mg0() { // from class: org.telegram.messenger.av
            @Override // org.telegram.ui.mg0
            public final void d(Canvas canvas2) {
                bv bvVar = bv.this;
                AtomicReference atomicReference = bvVar.E;
                StaticLayout staticLayout = bvVar.b;
                ArrayList arrayList = bvVar.x;
                yh.f.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                du0.a(canvas2, bvVar.b);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, bvVar.b, bvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
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

    public final boolean o(CharacterStyle characterStyle, ot otVar) {
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
        otVar.a = staticLayout;
        otVar.b = spanStart;
        otVar.c = spanEnd;
        otVar.d = staticLayout.getWidth();
        return true;
    }

    public final au[] p() {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (au[]) spanned.getSpans(0, spanned.length(), au.class);
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
        yu yuVar;
        yu yuVar2;
        int spanEnd;
        yu yuVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n4 = n() + ((int) motionEvent.getX());
        int y9 = (int) motionEvent.getY();
        ArrayList arrayList = this.x;
        cv cvVar = this.a;
        StaticLayout staticLayout = this.b;
        boolean z12 = true;
        int i3 = 0;
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
                yh.f fVar = (yh.f) obj;
                if (fVar.getBounds().contains(n4, y9)) {
                    this.M = fVar;
                    return true;
                }
            }
            au[] p10 = p();
            if (p10 != null) {
                for (au auVar : p10) {
                    if (e(auVar, n4, y9)) {
                        yt ytVar = auVar.a;
                        if (ytVar.b) {
                            return true;
                        }
                        this.R = auVar;
                        this.L = false;
                        ytVar.m(true);
                        View view = this.T;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y9 >= 0 && y9 < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y9);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f10 = n4;
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
                        t70 t70Var = new t70(this.N, cvVar.D, f10, y9, 0);
                        n70 b10 = t70Var.b();
                        b10.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b10);
                        if (this.J == null) {
                            this.J = new m2.p0(this.T);
                        }
                        this.J.b(t70Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    yu[] yuVarArr = (yu[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, yu.class);
                    if (yuVarArr != null) {
                        int length = yuVarArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            z11 = z12;
                            yuVar = yuVarArr[i11];
                            if (TLObject.hasFlag(yuVar.b, 256)) {
                                break;
                            }
                            i11++;
                            z12 = z11;
                        }
                    }
                    z11 = z12;
                    yuVar = null;
                    if (yuVar != null) {
                        int spanStart2 = spannable.getSpanStart(yuVar);
                        int spanEnd2 = spannable.getSpanEnd(yuVar);
                        while (spanStart2 > 0) {
                            int i12 = spanStart2 - 1;
                            yu[] yuVarArr2 = (yu[]) spannable.getSpans(i12, i12, yu.class);
                            int length2 = yuVarArr2.length;
                            int i13 = i3;
                            while (true) {
                                if (i13 >= length2) {
                                    yuVar3 = null;
                                    break;
                                }
                                yuVar3 = yuVarArr2[i13];
                                if (TLObject.hasFlag(yuVar3.b, 256)) {
                                    break;
                                }
                                i13++;
                            }
                            if (yuVar3 == null || (spanStart = spannable.getSpanStart(yuVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i3 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            yu[] yuVarArr3 = (yu[]) spannable.getSpans(spanEnd2, spanEnd2, yu.class);
                            int length3 = yuVarArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    yuVar2 = null;
                                    break;
                                }
                                yuVar2 = yuVarArr3[i14];
                                if (TLObject.hasFlag(yuVar2.b, 256)) {
                                    break;
                                }
                                i14++;
                            }
                            if (yuVar2 == null || (spanEnd = spannable.getSpanEnd(yuVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = yuVar;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        t70 t70Var2 = new t70(yuVar, cvVar.D, f10, y9, 0);
                        n70 b11 = t70Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.J == null) {
                            this.J = new m2.p0(this.T);
                        }
                        this.J.b(t70Var2, null);
                        View view3 = this.T;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z11;
                    }
                    org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.p5.class);
                    if (p5VarArr != null && p5VarArr.length > 0) {
                        this.Q = p5VarArr[0];
                        return z11;
                    }
                }
            }
            return false;
        }
        if (actionMasked == 2) {
            au auVar2 = this.R;
            if (auVar2 != null) {
                if (e(auVar2, n4, y9)) {
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
                    au auVar3 = this.R;
                    this.R = null;
                    auVar3.a.m(false);
                    if (this.L) {
                        z10 = false;
                    } else {
                        View view4 = this.T;
                        if (view4 != null) {
                            view4.playSoundEffect(0);
                        }
                        org.telegram.ui.Cells.q1 q1Var = cvVar.E;
                        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
                        TL_iv.textButton textbutton = auVar3.b;
                        if (q1Var != null && l1Var != null) {
                            l1Var.d1(q1Var, textbutton);
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
                    this.M.q = new zu(this, view5, cvVar);
                    int size2 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj2 = arrayList.get(i15);
                        i15++;
                        ((yh.f) obj2).j(n4, y9, sqrt, false);
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
                    m2.p0 p0Var = this.J;
                    if (p0Var != null) {
                        p0Var.f(true);
                    }
                    this.N = null;
                    this.L = false;
                    return true;
                }
                org.telegram.ui.Components.p5 p5Var = this.Q;
                if (p5Var == null) {
                    return false;
                }
                this.Q = null;
                org.telegram.ui.Cells.q1 q1Var2 = cvVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = cvVar.F;
                if (q1Var2 == null || l1Var2 == null) {
                    return true;
                }
                View view6 = this.T;
                if (view6 != null) {
                    view6.playSoundEffect(0);
                }
                l1Var2.o0(p5Var);
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
                    m2.p0 p0Var2 = this.J;
                    if (p0Var2 != null) {
                        p0Var2.f(true);
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
        vs vsVar = new vs(this, 8);
        this.K = vsVar;
        g0.i3(vsVar, ViewConfiguration.getLongPressTimeout());
    }

    public bv(cv cvVar, CharSequence charSequence, int i3, Layout.Alignment alignment) {
        this(cvVar, charSequence, i3, alignment, 1.0f);
    }

    public bv(cv cvVar, CharSequence charSequence, int i3, Layout.Alignment alignment, float f10) {
        boolean z10;
        int i10;
        int L;
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.p5> cls;
        int i12;
        this.x = new ArrayList();
        this.y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.a = cvVar;
        TextPaint textPaint = cvVar.w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z11 = true;
        boolean z12 = false;
        if (charSequence instanceof Spanned) {
            for (yu yuVar : (yu[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), yu.class)) {
                int i13 = yuVar.b & 15;
                if (i13 >= 1 && i13 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    yuVar.a(textPaint2);
                    fontMetricsInt = textPaint2.getFontMetricsInt();
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        CharSequence n4 = i6.n(charSequence, fontMetricsInt, false, null, 0, z10 ? 0.85f : 1.0f, 0);
        if (n4 instanceof Spanned) {
            Spanned spanned = (Spanned) n4;
            Class<org.telegram.ui.Components.p5> cls2 = org.telegram.ui.Components.p5.class;
            if (((org.telegram.ui.Components.p5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((f6[]) spanned.getSpans(0, spanned.length(), f6.class)).length != 0 || ((au[]) spanned.getSpans(0, spanned.length(), au.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n4);
                for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    p5Var.setPreserveFontMetrics(true);
                }
                for (f6 f6Var : (f6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), f6.class)) {
                    f6Var.e = true;
                }
                for (au auVar : (au[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), au.class)) {
                    if (auVar.a.a.s > 0) {
                        auVar.e = true;
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
                    a7.d s6 = s(spannableStringBuilder2, i14, indexOf, textPaint);
                    int i15 = s6.b;
                    if (i15 <= 0 || s6.a * 100 < i15 * 70 || (i12 = s6.c) <= 0) {
                        spannableStringBuilder = spannableStringBuilder2;
                        cls = cls2;
                    } else {
                        org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannableStringBuilder2.getSpans(i14, indexOf, cls2);
                        int length = p5VarArr.length;
                        int i16 = 0;
                        while (i16 < length) {
                            org.telegram.ui.Components.p5 p5Var2 = p5VarArr[i16];
                            Class<org.telegram.ui.Components.p5> cls3 = cls2;
                            int spanStart = spannableStringBuilder2.getSpanStart(p5Var2);
                            if (spanStart >= i14 && spanStart < indexOf) {
                                p5Var2.setMinimumLineHeight(i12);
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
                        au[] auVarArr = (au[]) spannableStringBuilder2.getSpans(i14, indexOf, au.class);
                        int length2 = auVarArr.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            au auVar2 = auVarArr[i17];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(auVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (auVar2.a.a.s > 0 && spanStart3 >= i14 && spanStart3 < indexOf) {
                                auVar2.f = i12;
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
                n4 = spannableStringBuilder;
            }
        }
        int d = mi.d6.d(n4);
        this.s = d;
        if (d == 0 && (n4 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n4;
            au[] auVarArr2 = (au[]) spanned2.getSpans(0, n4.length(), au.class);
            if (auVarArr2.length > 0) {
                Arrays.sort(auVarArr2, new wt(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n4);
                int length3 = auVarArr2.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length3) {
                        au auVar3 = auVarArr2[i18];
                        int spanStart4 = spanned2.getSpanStart(auVar3);
                        int spanEnd = spanned2.getSpanEnd(auVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        bv bvVar = auVar3.a.a;
                        if (bvVar.s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, bvVar.b.getText());
                        i18++;
                    } else {
                        this.s = mi.d6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.s > 0 && (n4 instanceof Spanned)) {
            for (yu yuVar2 : (yu[]) ((Spanned) n4).getSpans(0, n4.length(), yu.class)) {
                if ((yuVar2.b & 15) == 14) {
                    yuVar2.d = true;
                }
            }
        }
        if (n4 instanceof Spanned) {
            yu[] yuVarArr = (yu[]) ((Spanned) n4).getSpans(0, n4.length(), yu.class);
            int length4 = yuVarArr.length;
            for (int i19 = 0; i19 < length4 && (yuVarArr[i19].b & 15) == 0; i19++) {
            }
        }
        this.b = zi.h5(n4, cvVar.w, i3, f10, 0.0f, false, alignment);
        this.f = i3;
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
        n70 n70Var = null;
        yh.f.c(null, this.b, this.y, this.x);
        if (this.b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.b.getText();
            for (yu yuVar3 : (yu[]) spanned3.getSpans(0, spanned3.length(), yu.class)) {
                int i21 = yuVar3.b;
                if (TLObject.hasFlag(i21, TLObject.FLAG_13)) {
                    int spanStart5 = spanned3.getSpanStart(yuVar3);
                    int spanEnd2 = spanned3.getSpanEnd(yuVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (n70Var == null) {
                            i10 = 0;
                            n70Var = new n70(0);
                            n70Var.n = false;
                        } else {
                            i10 = 0;
                        }
                        n70Var.d(this.b, spanStart5, 0.0f);
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
                        n70Var.o = i11;
                        this.b.getSelectionPath(spanStart5, spanEnd2, n70Var);
                    }
                }
            }
            if (n70Var != null) {
                n70Var.n = true;
                this.G = n70Var;
            }
        }
    }
}
