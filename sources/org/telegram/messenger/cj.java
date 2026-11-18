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
import org.telegram.ui.Components.vy0;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class cj implements wg0 {
    public float E;
    public fj F;
    public int G;
    public org.telegram.ui.Components.mc H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public vy0 M;
    public int N;
    public boolean O;
    public int P;
    public Drawable Q;
    public vy0 R;
    public int S;
    public org.telegram.ui.Cells.y T;
    public Paint U;
    public boolean V;
    public Paint W;
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

    @Override // org.telegram.ui.wg0
    public final Layout a() {
        return this.e;
    }

    public final int c() {
        return g0.L(this.V ? 28.0f : 15.0f);
    }

    public final float d(org.telegram.ui.Cells.y1 y1Var) {
        boolean f10;
        if (y1Var.f3) {
            HashSet hashSet = y1Var.e3;
            f10 = true;
            if (hashSet != null && hashSet.contains(Integer.valueOf(this.c))) {
                f10 = false;
            }
        } else {
            f10 = f();
        }
        return g0.T1(f10 ? 1.0f : 0.0f, f() ? 1.0f : 0.0f, y1Var.L1);
    }

    @Override // org.telegram.ui.wg0
    public final View e() {
        return null;
    }

    public final boolean f() {
        HashSet hashSet;
        fj fjVar = this.F;
        return fjVar == null || (hashSet = fjVar.K0) == null || !hashSet.contains(Integer.valueOf(this.c));
    }

    public final int g() {
        return g0.L(this.M != null ? 32.0f : 12.0f);
    }

    public final int h() {
        StaticLayout staticLayout;
        return (this.M != null || (staticLayout = this.e) == null || staticLayout.getLineCount() == 0) ? g0.L(8.0f) + (-g()) : Math.round(((this.e.getLineBottom(0) + this.e.getLineTop(0)) / 2.0f) - (g0.L(18.0f) / 2.0f));
    }

    public final void i(Canvas canvas, RectF rectF, int i7, int i10, float f10) {
        if (this.O) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, i7);
            if (this.S != r12) {
                org.telegram.ui.Cells.y yVar = this.T;
                this.S = r12;
                org.telegram.ui.ActionBar.n6.H1(yVar, r12, true);
            }
            this.T.setBounds(g0.L(3.0f) + ((int) rectF.left), (int) (rectF.bottom - g0.L(38.0f)), (int) rectF.right, (int) rectF.bottom);
            int i11 = (int) (255.0f * f10);
            this.T.setAlpha(i11);
            if (this.T.getCallback() != null) {
                this.T.draw(canvas);
            }
            this.U.setColor(i0.a.o(i10, 38));
            canvas.drawRect(rectF.left + g0.L(10.0f), (rectF.bottom - g0.L(38.0f)) - g0.f1(), rectF.right - g0.L(6.66f), rectF.bottom - g0.L(38.0f), this.U);
            float centerX = rectF.centerX() - (Math.min(rectF.width() - g0.L(12.0f), ((this.Q.getIntrinsicWidth() * 0.8f) + g0.L(5.0f)) + this.R.c) / 2.0f);
            float L = rectF.bottom - (g0.L(38.0f) / 2.0f);
            if (this.P != i7) {
                Drawable drawable = this.Q;
                this.P = i7;
                drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            this.Q.setAlpha(i11);
            this.Q.setBounds((int) centerX, (int) (L - ((r2.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.Q.getIntrinsicWidth() * 0.8f) + centerX), (int) a8.p0.f(this.Q.getIntrinsicHeight(), 0.8f, 2.0f, L));
            this.Q.draw(canvas);
            vy0 vy0Var = this.R;
            vy0Var.p = g0.L(12.0f) + ((int) (r1 - ((this.Q.getIntrinsicWidth() * 0.8f) + g0.L(5.0f))));
            vy0Var.c((this.Q.getIntrinsicWidth() * 0.8f) + g0.L(5.0f) + centerX, L, f10, i7, canvas);
        }
    }

    public final int j(org.telegram.ui.Cells.y1 y1Var) {
        if (!this.K) {
            return this.w;
        }
        return g0.W1(d(y1Var), this.w, this.G);
    }

    public final boolean k(float f10, float f11, float f12) {
        if (!this.O || f10 < f12 - g0.L(38.0f) || f10 > f12 || f11 < (-g())) {
            return false;
        }
        return f11 <= ((float) (g0.L(26.0f) + h()));
    }

    public final boolean l() {
        byte b10 = this.x;
        return (b10 & 1) != 0 && (b10 & 2) == 0;
    }

    public final void m(int i7, String str, boolean z10) {
        boolean z11 = i7 >= 75 && !z10;
        this.O = z11;
        if (z11) {
            this.R = new vy0(gd.M0(2131751754, null).toUpperCase(), bz.W0 - 3, g0.o());
            Drawable g10 = i5.c.g(t0.b, R.drawable.msg_copy);
            this.Q = g10;
            g10.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = org.telegram.ui.ActionBar.n6.c0(this.S, 0, 0, Math.min(5, bz.Y0), 0);
            this.U = new Paint(1);
        }
        if (TextUtils.isEmpty(str)) {
            this.L = null;
            this.M = null;
            return;
        }
        this.L = str;
        String b10 = b(str);
        int i10 = bz.W0 - 1;
        qi.p pVar = qi.j.a;
        vy0 vy0Var = new vy0(b10, i10 - ((i7 <= 120 ? i7 > 50 ? 3 : 2 : 5) / 2), g0.o());
        this.M = vy0Var;
        this.N = g0.L(4.0f) + ((int) (vy0Var.a.getTextSize() * 1.714f));
    }

    public final void n(String str, boolean z10) {
        this.V = true;
        this.O = !z10;
        if (!z10) {
            Drawable g10 = i5.c.g(t0.b, R.drawable.msg_copy);
            this.Q = g10;
            g10.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = org.telegram.ui.ActionBar.n6.c0(this.S, 0, 0, Math.min(5, bz.Y0), 0);
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.L = str;
        this.M = str != null ? new vy0(str, Math.max(8, bz.W0 - 4), null) : null;
        this.N = 0;
    }

    public final float o(ArrayList arrayList) {
        cj cjVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && (cjVar = (cj) arrayList.get(i10)) != this; i10++) {
            i7 += ((cjVar.K && cjVar.f()) ? cjVar.G : cjVar.w) + cjVar.f + cjVar.h;
        }
        return i7;
    }

    public final float p(ArrayList arrayList, org.telegram.ui.Cells.y1 y1Var) {
        cj cjVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && (cjVar = (cj) arrayList.get(i10)) != this; i10++) {
            i7 += cjVar.j(y1Var) + cjVar.f + cjVar.h;
        }
        return i7;
    }
}
