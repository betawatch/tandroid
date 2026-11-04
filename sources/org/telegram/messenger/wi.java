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
import org.telegram.ui.Components.ly0;
import org.telegram.ui.lg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class wi implements lg0 {
    public float E;
    public zi F;
    public int G;
    public org.telegram.ui.Components.gc H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public ly0 M;
    public int N;
    public boolean O;
    public int P;
    public Drawable Q;
    public ly0 R;
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

    @Override // org.telegram.ui.lg0
    public final Layout a() {
        return this.e;
    }

    public final int c() {
        return g0.L(this.V ? 28.0f : 15.0f);
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

    @Override // org.telegram.ui.lg0
    public final View e() {
        return null;
    }

    public final boolean f() {
        HashSet hashSet;
        zi ziVar = this.F;
        return ziVar == null || (hashSet = ziVar.I0) == null || !hashSet.contains(Integer.valueOf(this.c));
    }

    public final int g() {
        return g0.L(this.M != null ? 32.0f : 12.0f);
    }

    public final int h() {
        StaticLayout staticLayout;
        return (this.M != null || (staticLayout = this.e) == null || staticLayout.getLineCount() == 0) ? g0.L(8.0f) + (-g()) : Math.round(((this.e.getLineBottom(0) + this.e.getLineTop(0)) / 2.0f) - (g0.L(18.0f) / 2.0f));
    }

    public final void i(Canvas canvas, RectF rectF, int i3, int i10, float f10) {
        if (this.O) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i3);
            if (this.S != r12) {
                org.telegram.ui.Cells.y yVar = this.T;
                this.S = r12;
                org.telegram.ui.ActionBar.k6.H1(yVar, r12, true);
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
            if (this.P != i3) {
                Drawable drawable = this.Q;
                this.P = i3;
                drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            }
            this.Q.setAlpha(i11);
            this.Q.setBounds((int) centerX, (int) (L - ((r2.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.Q.getIntrinsicWidth() * 0.8f) + centerX), (int) a1.g.e(this.Q.getIntrinsicHeight(), 0.8f, 2.0f, L));
            this.Q.draw(canvas);
            ly0 ly0Var = this.R;
            ly0Var.p = g0.L(12.0f) + ((int) (r1 - ((this.Q.getIntrinsicWidth() * 0.8f) + g0.L(5.0f))));
            ly0Var.c((this.Q.getIntrinsicWidth() * 0.8f) + g0.L(5.0f) + centerX, L, f10, i3, canvas);
        }
    }

    public final int j(org.telegram.ui.Cells.x1 x1Var) {
        if (!this.K) {
            return this.w;
        }
        return g0.W1(d(x1Var), this.w, this.G);
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

    public final void m(int i3, String str, boolean z10) {
        boolean z11 = i3 >= 75 && !z10;
        this.O = z11;
        if (z11) {
            this.R = new ly0(bd.M0(2131751765, null).toUpperCase(), az.W0 - 3, g0.o());
            Drawable g7 = k2.p1.g(t0.b, R.drawable.msg_copy);
            this.Q = g7;
            g7.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = org.telegram.ui.ActionBar.k6.c0(this.S, 0, 0, Math.min(5, az.Y0), 0);
            this.U = new Paint(1);
        }
        if (TextUtils.isEmpty(str)) {
            this.L = null;
            this.M = null;
            return;
        }
        this.L = str;
        String b10 = b(str);
        int i10 = az.W0 - 1;
        oi.q qVar = oi.k.a;
        ly0 ly0Var = new ly0(b10, i10 - ((i3 <= 120 ? i3 > 50 ? 3 : 2 : 5) / 2), g0.o());
        this.M = ly0Var;
        this.N = g0.L(4.0f) + ((int) (ly0Var.a.getTextSize() * 1.714f));
    }

    public final void n(String str, boolean z10) {
        this.V = true;
        this.O = !z10;
        if (!z10) {
            Drawable g7 = k2.p1.g(t0.b, R.drawable.msg_copy);
            this.Q = g7;
            g7.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = org.telegram.ui.ActionBar.k6.c0(this.S, 0, 0, Math.min(5, az.Y0), 0);
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.L = str;
        this.M = str != null ? new ly0(str, Math.max(8, az.W0 - 4), null) : null;
        this.N = 0;
    }

    public final float o(ArrayList arrayList) {
        wi wiVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size() && (wiVar = (wi) arrayList.get(i10)) != this; i10++) {
            i3 += ((wiVar.K && wiVar.f()) ? wiVar.G : wiVar.w) + wiVar.f + wiVar.h;
        }
        return i3;
    }

    public final float p(ArrayList arrayList, org.telegram.ui.Cells.x1 x1Var) {
        wi wiVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size() && (wiVar = (wi) arrayList.get(i10)) != this; i10++) {
            i3 += wiVar.j(x1Var) + wiVar.f + wiVar.h;
        }
        return i3;
    }
}
