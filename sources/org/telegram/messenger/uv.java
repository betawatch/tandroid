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
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.yh0;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class uv implements org.telegram.ui.Cells.u9, hy0 {
    public static Paint T;
    public final AtomicReference D;
    public org.telegram.ui.Components.k5 E;
    public final k80 F;
    public k80 G;
    public t80 H;
    public ji.a I;
    public ms J;
    public boolean K;
    public nh.i L;
    public CharacterStyle M;
    public int N;
    public int O;
    public org.telegram.ui.Components.o5 P;
    public tu Q;
    public final RectF R;
    public View S;
    public final vv a;
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

    public uv(vv vvVar, CharSequence charSequence, int i10) {
        this(vvVar, charSequence, i10, Layout.Alignment.ALIGN_NORMAL);
    }

    public static a3.l s(Spanned spanned, int i10, int i11, TextPaint textPaint) {
        tu[] tuVarArr;
        int i12;
        a3.l lVar = new a3.l();
        int i13 = i11 - i10;
        if (i13 > 0) {
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned.getSpans(i10, i11, org.telegram.ui.Components.o5.class);
            h6[] h6VarArr = (h6[]) spanned.getSpans(i10, i11, h6.class);
            int[] iArr = (o5VarArr.length == 0 && h6VarArr.length == 0) ? null : new int[i13];
            int length = o5VarArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14;
                org.telegram.ui.Components.o5 o5Var = o5VarArr[i15];
                int spanStart = spanned.getSpanStart(o5Var);
                int min = Math.min(i11, spanned.getSpanEnd(o5Var));
                if (spanStart < i10 || spanStart >= i11 || min <= spanStart) {
                    i12 = i15;
                } else {
                    int i16 = spanStart - i10;
                    iArr[i16] = Math.max(iArr[i16], min);
                    i12 = i15;
                    lVar.c = Math.max(lVar.c, o5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                }
                i14 = i12 + 1;
            }
            for (h6 h6Var : h6VarArr) {
                int spanStart2 = spanned.getSpanStart(h6Var);
                int min2 = Math.min(i11, spanned.getSpanEnd(h6Var));
                if (spanStart2 >= i10 && spanStart2 < i11 && min2 > spanStart2) {
                    int i17 = spanStart2 - i10;
                    iArr[i17] = Math.max(iArr[i17], min2);
                    lVar.c = Math.max(lVar.c, h6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            tu[] tuVarArr2 = (tu[]) spanned.getSpans(i10, i11, tu.class);
            if (tuVarArr2.length > 0) {
                tuVarArr = null;
                for (tu tuVar : tuVarArr2) {
                    int spanStart3 = spanned.getSpanStart(tuVar);
                    if (tuVar.a.a.s > 0 && spanStart3 >= i10 && spanStart3 < i11) {
                        if (tuVarArr == null) {
                            tuVarArr = new tu[i13];
                        }
                        tuVarArr[spanStart3 - i10] = tuVar;
                    }
                }
            } else {
                tuVarArr = null;
            }
            if (iArr != null || tuVarArr != null) {
                int i18 = i10;
                while (i18 < i11) {
                    int i19 = i18 - i10;
                    tu tuVar2 = tuVarArr == null ? null : tuVarArr[i19];
                    if (tuVar2 != null) {
                        ru ruVar = tuVar2.a;
                        uv uvVar = ruVar.a;
                        uv uvVar2 = ruVar.a;
                        if (uvVar.b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) uvVar2.b.getText();
                            a3.l s10 = s(spanned2, 0, spanned2.length(), uvVar2.b.getPaint());
                            lVar.a += s10.a;
                            lVar.b += Math.max(1, s10.b);
                            lVar.c = Math.max(lVar.c, s10.c);
                            i18 = Math.min(i11, spanned.getSpanEnd(tuVar2));
                        }
                    }
                    int i20 = iArr == null ? 0 : iArr[i19];
                    if (i20 > i18) {
                        lVar.a++;
                        lVar.b++;
                        i18 = i20;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i18);
                        if (!Character.isWhitespace(codePointAt)) {
                            lVar.b++;
                        }
                        i18 += Character.charCount(codePointAt);
                    }
                }
            }
        }
        return lVar;
    }

    @Override // org.telegram.ui.Cells.u9
    public final Layout a() {
        return this.b;
    }

    @Override // org.telegram.ui.Components.hy0
    public final int b() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void d(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        vv vvVar = this.a;
        boolean E = vvVar.E();
        TextPaint textPaint = vvVar.w;
        int w02 = org.telegram.ui.ActionBar.t6.w0(E ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D);
        textPaint.setColor(w02);
        textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Vc : org.telegram.ui.ActionBar.t6.Uc, vvVar.D);
        k80 k80Var = this.F;
        if (k80Var != null) {
            if (T == null) {
                Paint paint = new Paint(1);
                T = paint;
                paint.setPathEffect(k80.c());
            }
            T.setColor((vvVar.y.i() & 16777215) | 855638016);
            canvas.drawPath(k80Var, T);
        }
        View view2 = view != null ? view : this.S;
        ji.a aVar = this.I;
        if (aVar != null && aVar.h(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.b;
        AtomicReference atomicReference = this.D;
        ArrayList arrayList = this.x;
        nh.i.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.b;
        gv0.a(canvas, staticLayout2);
        if (!vvVar.F()) {
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.b, this.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f7 = vvVar.V;
        if (f7 > 0.0f) {
            jj jjVar = vvVar.b;
            boolean z10 = vvVar.O || (jjVar != null && vp.r1(vvVar.a).t7.A(jjVar));
            if (this.H == null) {
                t80 t80Var = new t80();
                this.H = t80Var;
                t80Var.D = true;
                k80 k80Var2 = new k80(0);
                this.G = k80Var2;
                k80Var2.c = true;
                t80 t80Var2 = this.H;
                t80Var2.y = k80Var2;
                t80Var2.k(5.0f);
                this.H.b = -1L;
                this.G.reset();
                this.G.d(staticLayout2, 0, 0.0f);
                this.G.n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.G);
                k80 k80Var3 = this.G;
                k80Var3.n = true;
                k80Var3.a();
                this.H.l();
            }
            if (z10 && (this.H.d() || this.H.c())) {
                t80 t80Var3 = this.H;
                t80Var3.b = -1L;
                t80Var3.c = -1L;
            } else if (!z10 && !this.H.d() && !this.H.c()) {
                this.H.a();
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Vc : org.telegram.ui.ActionBar.t6.Uc, vvVar.D);
            this.H.g(org.telegram.ui.ActionBar.t6.r1(0.05f, w03), org.telegram.ui.ActionBar.t6.r1(0.15f, w03), org.telegram.ui.ActionBar.t6.r1(0.1f, w03), org.telegram.ui.ActionBar.t6.r1(0.3f, w03));
            this.H.setAlpha((int) (f7 * 255.0f));
            this.H.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(tu tuVar, float f7, float f10) {
        float L = i0.L(8.0f);
        RectF rectF = tuVar.c;
        if (f7 < rectF.left - L || f7 >= rectF.right + L || f10 < rectF.top - L || f10 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.b;
            tu tuVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                tu[] tuVarArr = (tu[]) spanned.getSpans(0, spanned.length(), tu.class);
                if (tuVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(tuVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(tuVarArr[0]);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= spanned.length()) {
                            tuVar2 = tuVarArr[0];
                            break;
                        }
                        if ((i10 < spanStart || i10 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i10))) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (tuVar != tuVar2 || !this.R.contains(f7, f10)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void f(View view) {
        View view2 = this.S;
        if (view2 == view && view2 != null) {
            this.S = null;
            org.telegram.ui.Components.o5.release((View) null, this.E);
            this.E = null;
            ji.a aVar = this.I;
            if (aVar != null) {
                aVar.c = null;
            }
            tu[] p5 = p();
            if (p5 != null) {
                for (tu tuVar : p5) {
                    View view3 = this.S;
                    tuVar.h = null;
                    tuVar.a.a.f(view3);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.hy0
    public final void g(int i10) {
        this.e = i10;
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getRow() {
        return this.e;
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getText() {
        if (a() == null) {
            return null;
        }
        return a().getText();
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getX() {
        return this.c;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getY() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void h(int i10) {
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void i(View view) {
        View view2 = this.S;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            f(view2);
        }
        this.S = view;
        this.E = org.telegram.ui.Components.o5.update(0, view, this.a.v && !this.w, this.E, this.b);
        ji.a aVar = this.I;
        if (aVar != null) {
            aVar.c = this.S;
        }
        tu[] p5 = p();
        if (p5 != null) {
            for (tu tuVar : p5) {
                tuVar.a(this.S);
            }
        }
    }

    @Override // org.telegram.ui.Components.hy0
    public final void j(int i10) {
        this.c = i10;
    }

    public final void k() {
        ms msVar = this.J;
        if (msVar != null) {
            i0.r(msVar);
            this.J = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        r2 = ((android.text.style.URLSpan) r13).getURL();
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
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
        vv vvVar = this.a;
        if (!z10 && (characterStyle instanceof URLSpan) && url != null && url.startsWith("#")) {
            vvVar.getClass();
            if (url.startsWith("#")) {
                try {
                    substring = URLDecoder.decode(url.substring(1), "UTF-8");
                } catch (Exception unused) {
                    substring = url.substring(1);
                }
                if (!TextUtils.isEmpty(substring)) {
                    String lowerCase = substring.toLowerCase();
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) vvVar.k.get(lowerCase);
                    if (textanchor != null) {
                        View view3 = vvVar.Q;
                        if (view3 != null && (context = view3.getContext()) != null && (richText = textanchor.text) != null && !(richText instanceof TL_iv.textEmpty)) {
                            String str = textanchor.name;
                            SpannableStringBuilder l4 = vvVar.l(org.telegram.ui.web.y1.d(textanchor.text, "", str == null ? "" : str.toLowerCase()), 0);
                            org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context, vvVar.D, true);
                            k10.u0 = false;
                            k10.v0 = false;
                            LinearLayout f7 = m5.f(context, 1);
                            TextView g10 = m5.g(context, 1, 16.0f);
                            g10.setTypeface(i0.o());
                            g10.setText(cd.L0(2131749201, null));
                            g10.setGravity((cd.X ? 5 : 3) | 16);
                            int i10 = org.telegram.ui.ActionBar.t6.j5;
                            org.telegram.ui.ActionBar.a7.V(g10, i10, vvVar.D);
                            g10.setPadding(i0.L(22.0f), 0, i0.L(22.0f), 0);
                            f7.addView(g10, new LinearLayout.LayoutParams(-1, i0.L(48.0f)));
                            p80 p80Var = new p80(context, vvVar.D);
                            p80Var.setTextSize(1, tz.W0);
                            org.telegram.ui.ActionBar.a7.V(p80Var, i10, vvVar.D);
                            org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.k5, vvVar.D);
                            p80Var.setMovementMethod(LinkMovementMethod.getInstance());
                            p80Var.setPadding(i0.L(22.0f), 0, i0.L(22.0f), i0.L(16.0f));
                            p80Var.setText(l4);
                            f7.addView(p80Var, new LinearLayout.LayoutParams(-1, -2));
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.addView(f7, w7.b6.c(-2.0f, -1));
                            k10.N = frameLayout;
                            k10.show();
                            view2 = this.S;
                            if (view2 == null) {
                                view2.playSoundEffect(0);
                                return;
                            }
                            return;
                        }
                    } else {
                        Integer num = (Integer) vvVar.j.get(lowerCase);
                        if (num != null) {
                            int intValue = num.intValue();
                            if (vvVar.E != null && intValue >= 0 && intValue < vvVar.g.size()) {
                                ViewParent parent = vvVar.E.getParent();
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
                                    recyclerView.w0(0, (((vvVar.E.getTop() + vvVar.E.t0) + vvVar.r(intValue, null)) - recyclerView.getPaddingTop()) - i0.L(8.0f), null);
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
        CharacterStyle d51Var = ((characterStyle instanceof rv) && TLObject.hasFlag(((rv) characterStyle).b, 256)) ? new d51(this.b.getText(), this.N, this.O, vvVar.E() ? (byte) 1 : (byte) 0, null) : characterStyle;
        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
        org.telegram.ui.Cells.q1 q1Var = vvVar.E;
        if (l1Var != null && q1Var != null) {
            View view4 = this.S;
            if (view4 != null && !z10) {
                view4.playSoundEffect(0);
            }
            l1Var.L0(q1Var, d51Var, z10);
            return;
        }
        if (z10 || (view = this.S) == null || !(characterStyle instanceof ClickableSpan)) {
            return;
        }
        view.playSoundEffect(0);
        ((ClickableSpan) characterStyle).onClick(this.S);
    }

    public final void m(Canvas canvas, int i10, float f7) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        vv vvVar = this.a;
        boolean E = vvVar.E();
        TextPaint textPaint = vvVar.w;
        final int w02 = org.telegram.ui.ActionBar.t6.w0(E ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D);
        textPaint.setColor(w02);
        textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Vc : org.telegram.ui.ActionBar.t6.Uc, vvVar.D);
        final View view = this.S;
        zh0.b(canvas, this.b, i10, f7, new yh0() { // from class: org.telegram.messenger.tv
            @Override // org.telegram.ui.yh0
            public final void d(Canvas canvas2) {
                uv uvVar = uv.this;
                AtomicReference atomicReference = uvVar.D;
                StaticLayout staticLayout = uvVar.b;
                ArrayList arrayList = uvVar.x;
                nh.i.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                gv0.a(canvas2, uvVar.b);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, uvVar.b, uvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
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

    public final boolean o(CharacterStyle characterStyle, hu huVar) {
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
        huVar.a = staticLayout;
        huVar.b = spanStart;
        huVar.c = spanEnd;
        huVar.d = staticLayout.getWidth();
        return true;
    }

    public final tu[] p() {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (tu[]) spanned.getSpans(0, spanned.length(), tu.class);
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
        rv rvVar;
        rv rvVar2;
        int spanEnd;
        rv rvVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n10 = n() + ((int) motionEvent.getX());
        int y3 = (int) motionEvent.getY();
        ArrayList arrayList = this.x;
        vv vvVar = this.a;
        StaticLayout staticLayout = this.b;
        boolean z12 = true;
        int i10 = 0;
        if (actionMasked == 0) {
            this.L = null;
            this.M = null;
            this.P = null;
            this.Q = null;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                nh.i iVar = (nh.i) obj;
                if (iVar.getBounds().contains(n10, y3)) {
                    this.L = iVar;
                    return true;
                }
            }
            tu[] p5 = p();
            if (p5 != null) {
                for (tu tuVar : p5) {
                    if (e(tuVar, n10, y3)) {
                        ru ruVar = tuVar.a;
                        if (ruVar.b) {
                            return true;
                        }
                        this.Q = tuVar;
                        this.K = false;
                        ruVar.m(true);
                        View view = this.S;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y3 >= 0 && y3 < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y3);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f7 = n10;
                if (f7 >= lineLeft && f7 <= lineWidth) {
                    int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f7);
                    Spannable spannable = (Spannable) staticLayout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.M = clickableSpan;
                        this.N = spannable.getSpanStart(clickableSpan);
                        this.O = spannable.getSpanEnd(this.M);
                        this.K = false;
                        q80 q80Var = new q80(this.M, vvVar.D, f7, y3, 0);
                        k80 b10 = q80Var.b();
                        b10.d(staticLayout, this.N, 0.0f);
                        staticLayout.getSelectionPath(this.N, this.O, b10);
                        if (this.I == null) {
                            this.I = new ji.a(this.S);
                        }
                        this.I.b(q80Var, null);
                        View view2 = this.S;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    rv[] rvVarArr = (rv[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, rv.class);
                    if (rvVarArr != null) {
                        int length = rvVarArr.length;
                        int i12 = 0;
                        while (i12 < length) {
                            z11 = z12;
                            rvVar = rvVarArr[i12];
                            if (TLObject.hasFlag(rvVar.b, 256)) {
                                break;
                            }
                            i12++;
                            z12 = z11;
                        }
                    }
                    z11 = z12;
                    rvVar = null;
                    if (rvVar != null) {
                        int spanStart2 = spannable.getSpanStart(rvVar);
                        int spanEnd2 = spannable.getSpanEnd(rvVar);
                        while (spanStart2 > 0) {
                            int i13 = spanStart2 - 1;
                            rv[] rvVarArr2 = (rv[]) spannable.getSpans(i13, i13, rv.class);
                            int length2 = rvVarArr2.length;
                            int i14 = i10;
                            while (true) {
                                if (i14 >= length2) {
                                    rvVar3 = null;
                                    break;
                                }
                                rvVar3 = rvVarArr2[i14];
                                if (TLObject.hasFlag(rvVar3.b, 256)) {
                                    break;
                                }
                                i14++;
                            }
                            if (rvVar3 == null || (spanStart = spannable.getSpanStart(rvVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i10 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            rv[] rvVarArr3 = (rv[]) spannable.getSpans(spanEnd2, spanEnd2, rv.class);
                            int length3 = rvVarArr3.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length3) {
                                    rvVar2 = null;
                                    break;
                                }
                                rvVar2 = rvVarArr3[i15];
                                if (TLObject.hasFlag(rvVar2.b, 256)) {
                                    break;
                                }
                                i15++;
                            }
                            if (rvVar2 == null || (spanEnd = spannable.getSpanEnd(rvVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.M = rvVar;
                        this.N = spanStart2;
                        this.O = spanEnd2;
                        this.K = false;
                        q80 q80Var2 = new q80(rvVar, vvVar.D, f7, y3, 0);
                        k80 b11 = q80Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.I == null) {
                            this.I = new ji.a(this.S);
                        }
                        this.I.b(q80Var2, null);
                        View view3 = this.S;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z11;
                    }
                    org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.o5.class);
                    if (o5VarArr != null && o5VarArr.length > 0) {
                        this.P = o5VarArr[0];
                        return z11;
                    }
                }
            }
            return false;
        }
        if (actionMasked == 2) {
            tu tuVar2 = this.Q;
            if (tuVar2 != null) {
                if (e(tuVar2, n10, y3)) {
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
                    tu tuVar3 = this.Q;
                    this.Q = null;
                    tuVar3.a.m(false);
                    if (this.K) {
                        z10 = false;
                    } else {
                        View view4 = this.S;
                        if (view4 != null) {
                            view4.playSoundEffect(0);
                        }
                        org.telegram.ui.Cells.q1 q1Var = vvVar.E;
                        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
                        TL_iv.textButton textbutton = tuVar3.b;
                        if (q1Var != null && l1Var != null) {
                            l1Var.W0(q1Var, textbutton);
                        }
                        z10 = false;
                    }
                    this.K = z10;
                    return true;
                }
                if (this.L != null) {
                    float width = staticLayout.getWidth();
                    float height = staticLayout.getHeight();
                    float sqrt = (float) Math.sqrt((height * height) + (width * width));
                    View view5 = this.S;
                    this.L.q = new sv(this, view5, vvVar);
                    int size2 = arrayList.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj2 = arrayList.get(i16);
                        i16++;
                        ((nh.i) obj2).j(n10, y3, sqrt, false);
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
                    ji.a aVar = this.I;
                    if (aVar != null) {
                        aVar.f(true);
                    }
                    this.M = null;
                    this.K = false;
                    return true;
                }
                org.telegram.ui.Components.o5 o5Var = this.P;
                if (o5Var == null) {
                    return false;
                }
                this.P = null;
                org.telegram.ui.Cells.q1 q1Var2 = vvVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = vvVar.F;
                if (q1Var2 == null || l1Var2 == null) {
                    return true;
                }
                View view6 = this.S;
                if (view6 != null) {
                    view6.playSoundEffect(0);
                }
                l1Var2.m0(o5Var);
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
                    ji.a aVar2 = this.I;
                    if (aVar2 != null) {
                        aVar2.f(true);
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
        ms msVar = new ms(this, 9);
        this.J = msVar;
        i0.h3(msVar, ViewConfiguration.getLongPressTimeout());
    }

    public uv(vv vvVar, CharSequence charSequence, int i10, Layout.Alignment alignment) {
        this(vvVar, charSequence, i10, alignment, 1.0f);
    }

    public uv(vv vvVar, CharSequence charSequence, int i10, Layout.Alignment alignment, float f7) {
        boolean z10;
        int i11;
        int L;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.o5> cls;
        int i13;
        this.x = new ArrayList();
        this.y = new Stack();
        this.D = new AtomicReference();
        this.R = new RectF();
        this.a = vvVar;
        TextPaint textPaint = vvVar.w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z11 = true;
        boolean z12 = false;
        if (charSequence instanceof Spanned) {
            for (rv rvVar : (rv[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), rv.class)) {
                int i14 = rvVar.b & 15;
                if (i14 >= 1 && i14 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    rvVar.a(textPaint2);
                    fontMetricsInt = textPaint2.getFontMetricsInt();
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        CharSequence n10 = k6.n(charSequence, fontMetricsInt, false, null, 0, z10 ? 0.85f : 1.0f, 0);
        if (n10 instanceof Spanned) {
            Spanned spanned = (Spanned) n10;
            Class<org.telegram.ui.Components.o5> cls2 = org.telegram.ui.Components.o5.class;
            if (((org.telegram.ui.Components.o5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((h6[]) spanned.getSpans(0, spanned.length(), h6.class)).length != 0 || ((tu[]) spanned.getSpans(0, spanned.length(), tu.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                for (org.telegram.ui.Components.o5 o5Var : (org.telegram.ui.Components.o5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    o5Var.setPreserveFontMetrics(true);
                }
                for (h6 h6Var : (h6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), h6.class)) {
                    h6Var.e = true;
                }
                for (tu tuVar : (tu[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), tu.class)) {
                    if (tuVar.a.a.s > 0) {
                        tuVar.e = true;
                    }
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= spannableStringBuilder2.length()) {
                        spannableStringBuilder = spannableStringBuilder2;
                        break;
                    }
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i15);
                    boolean z13 = indexOf >= 0 ? z11 : z12;
                    indexOf = z13 ? indexOf : spannableStringBuilder2.length();
                    a3.l s10 = s(spannableStringBuilder2, i15, indexOf, textPaint);
                    int i16 = s10.b;
                    if (i16 <= 0 || s10.a * 100 < i16 * 70 || (i13 = s10.c) <= 0) {
                        spannableStringBuilder = spannableStringBuilder2;
                        cls = cls2;
                    } else {
                        org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannableStringBuilder2.getSpans(i15, indexOf, cls2);
                        int length = o5VarArr.length;
                        int i17 = 0;
                        while (i17 < length) {
                            org.telegram.ui.Components.o5 o5Var2 = o5VarArr[i17];
                            Class<org.telegram.ui.Components.o5> cls3 = cls2;
                            int spanStart = spannableStringBuilder2.getSpanStart(o5Var2);
                            if (spanStart >= i15 && spanStart < indexOf) {
                                o5Var2.setMinimumLineHeight(i13);
                            }
                            i17++;
                            cls2 = cls3;
                        }
                        cls = cls2;
                        for (h6 h6Var2 : (h6[]) spannableStringBuilder2.getSpans(i15, indexOf, h6.class)) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(h6Var2);
                            if (spanStart2 >= i15 && spanStart2 < indexOf) {
                                h6Var2.f = i13;
                            }
                        }
                        tu[] tuVarArr = (tu[]) spannableStringBuilder2.getSpans(i15, indexOf, tu.class);
                        int length2 = tuVarArr.length;
                        int i18 = 0;
                        while (i18 < length2) {
                            tu tuVar2 = tuVarArr[i18];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(tuVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (tuVar2.a.a.s > 0 && spanStart3 >= i15 && spanStart3 < indexOf) {
                                tuVar2.f = i13;
                            }
                            i18++;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        }
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (!z13) {
                        break;
                    }
                    i15 = indexOf + 1;
                    cls2 = cls;
                    spannableStringBuilder2 = spannableStringBuilder;
                    z11 = true;
                    z12 = false;
                }
                n10 = spannableStringBuilder;
            }
        }
        int d = bi.s6.d(n10);
        this.s = d;
        if (d == 0 && (n10 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n10;
            tu[] tuVarArr2 = (tu[]) spanned2.getSpans(0, n10.length(), tu.class);
            if (tuVarArr2.length > 0) {
                Arrays.sort(tuVarArr2, new pu(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n10);
                int length3 = tuVarArr2.length;
                int i19 = 0;
                while (true) {
                    if (i19 < length3) {
                        tu tuVar3 = tuVarArr2[i19];
                        int spanStart4 = spanned2.getSpanStart(tuVar3);
                        int spanEnd = spanned2.getSpanEnd(tuVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        uv uvVar = tuVar3.a.a;
                        if (uvVar.s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, uvVar.b.getText());
                        i19++;
                    } else {
                        this.s = bi.s6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.s > 0 && (n10 instanceof Spanned)) {
            for (rv rvVar2 : (rv[]) ((Spanned) n10).getSpans(0, n10.length(), rv.class)) {
                if ((rvVar2.b & 15) == 14) {
                    rvVar2.d = true;
                }
            }
        }
        if (n10 instanceof Spanned) {
            rv[] rvVarArr = (rv[]) ((Spanned) n10).getSpans(0, n10.length(), rv.class);
            int length4 = rvVarArr.length;
            for (int i20 = 0; i20 < length4 && (rvVarArr[i20].b & 15) == 0; i20++) {
            }
        }
        this.b = jj.g5(n10, vvVar.w, i10, f7, 0.0f, false, alignment);
        this.f = i10;
        this.h = 0;
        for (int i21 = 0; i21 < this.b.getLineCount(); i21++) {
            this.f = Math.min(this.f, (int) Math.floor(this.b.getLineLeft(i21)));
            this.h = Math.max(this.h, (int) Math.ceil(this.b.getLineRight(i21)));
        }
        this.n = 0;
        if (this.b.getLineCount() > 0) {
            StaticLayout staticLayout = this.b;
            this.n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        k80 k80Var = null;
        nh.i.c(null, this.b, this.y, this.x);
        if (this.b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.b.getText();
            for (rv rvVar3 : (rv[]) spanned3.getSpans(0, spanned3.length(), rv.class)) {
                int i22 = rvVar3.b;
                if (TLObject.hasFlag(i22, TLObject.FLAG_13)) {
                    int spanStart5 = spanned3.getSpanStart(rvVar3);
                    int spanEnd2 = spanned3.getSpanEnd(rvVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (k80Var == null) {
                            i11 = 0;
                            k80Var = new k80(0);
                            k80Var.n = false;
                        } else {
                            i11 = 0;
                        }
                        k80Var.d(this.b, spanStart5, 0.0f);
                        if (TLObject.hasFlag(i22, TLObject.FLAG_12)) {
                            L = -i0.L(6.0f);
                        } else {
                            L = TLObject.hasFlag(i22, 2048) ? i0.L(2.0f) : i11;
                        }
                        if (L != 0) {
                            i12 = L + i0.L(L > 0 ? 5.0f : -2.0f);
                        } else {
                            i12 = i11;
                        }
                        k80Var.o = i12;
                        this.b.getSelectionPath(spanStart5, spanEnd2, k80Var);
                    }
                }
            }
            if (k80Var != null) {
                k80Var.n = true;
                this.F = k80Var;
            }
        }
    }
}
