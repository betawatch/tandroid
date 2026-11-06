package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.my0;
import org.telegram.ui.rg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class fj implements rg0 {
    public float D;
    public ij E;
    public int F;
    public org.telegram.ui.Components.ic G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public my0 L;
    public int M;
    public boolean N;
    public int O;
    public Drawable P;
    public my0 Q;
    public int R;
    public org.telegram.ui.Cells.y S;
    public Paint T;
    public boolean U;
    public Paint V;
    public boolean a;
    public boolean b;
    public int c;
    public StaticLayout e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public byte x;
    public final AtomicReference d = new AtomicReference();
    public final ArrayList y = new ArrayList();

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String replaceAll = str.toLowerCase().replaceAll("\\W|lang$", "");
        replaceAll.getClass();
        switch (replaceAll) {
            case "actionscript":
                return "ActionScript";
            case "aspnet":
                return "ASP.NET";
            case "bbcode":
                return "BBCode";
            case "csharp":
            case "cs":
                return "C#";
            case "fsharp":
                return "F#";
            case "matlab":
            case "r":
            case "tl":
            case "asm":
            case "css":
            case "csv":
            case "ini":
            case "jsx":
            case "php":
            case "qml":
            case "sql":
            case "tsx":
            case "xml":
            case "yml":
            case "glsl":
            case "hlsl":
            case "html":
            case "http":
            case "json":
            case "less":
            case "nasm":
            case "sass":
            case "scss":
            case "wasm":
            case "yaml":
            case "cobol":
            case "json5":
            case "jsonp":
                return str.toUpperCase();
            case "python":
            case "py":
                return "Python";
            case "typescript":
            case "ts":
                return "TypeScript";
            case "js":
            case "javascript":
                return "JavaScript";
            case "md":
            case "markdown":
                return "Markdown";
            case "rb":
            case "ruby":
                return "Ruby";
            case "cpp":
                return "C++";
            case "tlb":
            case "tl-b":
                return "TL-B";
            case "func":
                return "FunC";
            case "objc":
            case "objectivec":
                return "Objective-C";
            case "vbnet":
                return "VB.NET";
            case "autohotkey":
                return "AutoHotKey";
            case "visual-basic":
                return "Visual Basic";
            case "gdscript":
                return "GDScript";
            default:
                return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
    }

    @Override // org.telegram.ui.rg0
    public final Layout a() {
        return this.e;
    }

    public final int c() {
        return g0.L(this.U ? 28.0f : 15.0f);
    }

    public final float d(org.telegram.ui.Cells.x1 x1Var) {
        boolean f10;
        if (x1Var.f3) {
            HashSet hashSet = x1Var.e3;
            f10 = true;
            if (hashSet != null && hashSet.contains(Integer.valueOf(this.c))) {
                f10 = false;
            }
        } else {
            f10 = f();
        }
        return g0.T1(f10 ? 1.0f : 0.0f, f() ? 1.0f : 0.0f, x1Var.L1);
    }

    @Override // org.telegram.ui.rg0
    public final View e() {
        return null;
    }

    public final boolean f() {
        HashSet hashSet;
        ij ijVar = this.E;
        return ijVar == null || (hashSet = ijVar.I0) == null || !hashSet.contains(Integer.valueOf(this.c));
    }

    public final int g() {
        return g0.L(this.L != null ? 32.0f : 12.0f);
    }

    public final int h() {
        StaticLayout staticLayout;
        return (this.L != null || (staticLayout = this.e) == null || staticLayout.getLineCount() == 0) ? g0.L(8.0f) + (-g()) : Math.round(((this.e.getLineBottom(0) + this.e.getLineTop(0)) / 2.0f) - (g0.L(18.0f) / 2.0f));
    }

    public final void i(Canvas canvas, RectF rectF, int i7, int i10, float f10) {
        if (this.N) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i7);
            if (this.R != r12) {
                org.telegram.ui.Cells.y yVar = this.S;
                this.R = r12;
                org.telegram.ui.ActionBar.k6.H1(yVar, r12, true);
            }
            this.S.setBounds(g0.L(3.0f) + ((int) rectF.left), (int) (rectF.bottom - g0.L(38.0f)), (int) rectF.right, (int) rectF.bottom);
            int i11 = (int) (255.0f * f10);
            this.S.setAlpha(i11);
            if (this.S.getCallback() != null) {
                this.S.draw(canvas);
            }
            this.T.setColor(i0.a.o(i10, 38));
            canvas.drawRect(rectF.left + g0.L(10.0f), (rectF.bottom - g0.L(38.0f)) - g0.f1(), rectF.right - g0.L(6.66f), rectF.bottom - g0.L(38.0f), this.T);
            float centerX = rectF.centerX() - (Math.min(rectF.width() - g0.L(12.0f), ((this.P.getIntrinsicWidth() * 0.8f) + g0.L(5.0f)) + this.Q.c) / 2.0f);
            float L = rectF.bottom - (g0.L(38.0f) / 2.0f);
            if (this.O != i7) {
                Drawable drawable = this.P;
                this.O = i7;
                drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            this.P.setAlpha(i11);
            this.P.setBounds((int) centerX, (int) (L - ((r2.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.P.getIntrinsicWidth() * 0.8f) + centerX), (int) a8.p0.f(this.P.getIntrinsicHeight(), 0.8f, 2.0f, L));
            this.P.draw(canvas);
            my0 my0Var = this.Q;
            my0Var.p = g0.L(12.0f) + ((int) (r1 - ((this.P.getIntrinsicWidth() * 0.8f) + g0.L(5.0f))));
            my0Var.c((this.P.getIntrinsicWidth() * 0.8f) + g0.L(5.0f) + centerX, L, f10, i7, canvas);
        }
    }

    public final int j(org.telegram.ui.Cells.x1 x1Var) {
        if (!this.J) {
            return this.w;
        }
        return g0.W1(d(x1Var), this.w, this.F);
    }

    public final boolean k(float f10, float f11, float f12) {
        if (!this.N || f10 < f12 - g0.L(38.0f) || f10 > f12 || f11 < (-g())) {
            return false;
        }
        return f11 <= ((float) (g0.L(26.0f) + h()));
    }

    public final boolean l() {
        byte b10 = this.x;
        return (b10 & 1) != 0 && (b10 & 2) == 0;
    }

    public final void m(int i7, String str, boolean z9) {
        boolean z10 = i7 >= 75 && !z9;
        this.N = z10;
        if (z10) {
            this.Q = new my0(hd.M0(2131751765, null).toUpperCase(), iz.W0 - 3, g0.o());
            Drawable h = jg.g.h(t0.b, R.drawable.msg_copy);
            this.P = h;
            h.setColorFilter(new PorterDuffColorFilter(this.O, PorterDuff.Mode.SRC_IN));
            this.S = org.telegram.ui.ActionBar.k6.c0(this.R, 0, 0, Math.min(5, iz.Y0), 0);
            this.T = new Paint(1);
        }
        if (TextUtils.isEmpty(str)) {
            this.K = null;
            this.L = null;
            return;
        }
        this.K = str;
        String b10 = b(str);
        int i10 = iz.W0 - 1;
        ni.s sVar = ni.m.a;
        my0 my0Var = new my0(b10, i10 - ((i7 <= 120 ? i7 > 50 ? 3 : 2 : 5) / 2), g0.o());
        this.L = my0Var;
        this.M = g0.L(4.0f) + ((int) (my0Var.a.getTextSize() * 1.714f));
    }

    public final void n(String str, boolean z9) {
        this.U = true;
        this.N = !z9;
        if (!z9) {
            Drawable h = jg.g.h(t0.b, R.drawable.msg_copy);
            this.P = h;
            h.setColorFilter(new PorterDuffColorFilter(this.O, PorterDuff.Mode.SRC_IN));
            this.S = org.telegram.ui.ActionBar.k6.c0(this.R, 0, 0, Math.min(5, iz.Y0), 0);
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.K = str;
        this.L = str != null ? new my0(str, Math.max(8, iz.W0 - 4), null) : null;
        this.M = 0;
    }

    public final float o(ArrayList arrayList) {
        fj fjVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && (fjVar = (fj) arrayList.get(i10)) != this; i10++) {
            i7 += ((fjVar.J && fjVar.f()) ? fjVar.F : fjVar.w) + fjVar.f + fjVar.h;
        }
        return i7;
    }

    public final float p(ArrayList arrayList, org.telegram.ui.Cells.x1 x1Var) {
        fj fjVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && (fjVar = (fj) arrayList.get(i10)) != this; i10++) {
            i7 += fjVar.j(x1Var) + fjVar.f + fjVar.h;
        }
        return i7;
    }
}
