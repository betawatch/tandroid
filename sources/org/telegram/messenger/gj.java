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
import org.telegram.ui.Components.qz0;
import org.telegram.ui.xh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class gj implements xh0 {
    public float D;
    public jj E;
    public int F;
    public org.telegram.ui.Components.dc G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public qz0 L;
    public int M;
    public boolean N;
    public int O;
    public Drawable P;
    public qz0 Q;
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

    @Override // org.telegram.ui.xh0
    public final Layout a() {
        return this.e;
    }

    public final int c() {
        return i0.L(this.U ? 28.0f : 15.0f);
    }

    public final float d(org.telegram.ui.Cells.x1 x1Var) {
        boolean f7;
        if (x1Var.f3) {
            HashSet hashSet = x1Var.e3;
            f7 = true;
            if (hashSet != null && hashSet.contains(Integer.valueOf(this.c))) {
                f7 = false;
            }
        } else {
            f7 = f();
        }
        return i0.T1(f7 ? 1.0f : 0.0f, f() ? 1.0f : 0.0f, x1Var.L1);
    }

    @Override // org.telegram.ui.xh0
    public final View e() {
        return null;
    }

    public final boolean f() {
        HashSet hashSet;
        jj jjVar = this.E;
        return jjVar == null || (hashSet = jjVar.I0) == null || !hashSet.contains(Integer.valueOf(this.c));
    }

    public final int g() {
        return i0.L(this.L != null ? 32.0f : 12.0f);
    }

    public final int h() {
        StaticLayout staticLayout;
        return (this.L != null || (staticLayout = this.e) == null || staticLayout.getLineCount() == 0) ? i0.L(8.0f) + (-g()) : Math.round(((this.e.getLineBottom(0) + this.e.getLineTop(0)) / 2.0f) - (i0.L(18.0f) / 2.0f));
    }

    public final void i(Canvas canvas, RectF rectF, int i10, int i11, float f7) {
        if (this.N) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, i10);
            if (this.R != r12) {
                org.telegram.ui.Cells.y yVar = this.S;
                this.R = r12;
                org.telegram.ui.ActionBar.t6.H1(yVar, r12, true);
            }
            this.S.setBounds(i0.L(3.0f) + ((int) rectF.left), (int) (rectF.bottom - i0.L(38.0f)), (int) rectF.right, (int) rectF.bottom);
            int i12 = (int) (255.0f * f7);
            this.S.setAlpha(i12);
            if (this.S.getCallback() != null) {
                this.S.draw(canvas);
            }
            this.T.setColor(i0.b.o(i11, 38));
            canvas.drawRect(rectF.left + i0.L(10.0f), (rectF.bottom - i0.L(38.0f)) - i0.f1(), rectF.right - i0.L(6.66f), rectF.bottom - i0.L(38.0f), this.T);
            float centerX = rectF.centerX() - (Math.min(rectF.width() - i0.L(12.0f), ((this.P.getIntrinsicWidth() * 0.8f) + i0.L(5.0f)) + this.Q.c) / 2.0f);
            float L = rectF.bottom - (i0.L(38.0f) / 2.0f);
            if (this.O != i10) {
                Drawable drawable = this.P;
                this.O = i10;
                drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            this.P.setAlpha(i12);
            this.P.setBounds((int) centerX, (int) (L - ((r2.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.P.getIntrinsicWidth() * 0.8f) + centerX), (int) a1.g.A(this.P.getIntrinsicHeight(), 0.8f, 2.0f, L));
            this.P.draw(canvas);
            qz0 qz0Var = this.Q;
            qz0Var.p = i0.L(12.0f) + ((int) (r1 - ((this.P.getIntrinsicWidth() * 0.8f) + i0.L(5.0f))));
            qz0Var.c((this.P.getIntrinsicWidth() * 0.8f) + i0.L(5.0f) + centerX, L, f7, i10, canvas);
        }
    }

    public final int j(org.telegram.ui.Cells.x1 x1Var) {
        if (!this.J) {
            return this.w;
        }
        return i0.W1(d(x1Var), this.w, this.F);
    }

    public final boolean k(float f7, float f10, float f11) {
        if (!this.N || f7 < f11 - i0.L(38.0f) || f7 > f11 || f10 < (-g())) {
            return false;
        }
        return f10 <= ((float) (i0.L(26.0f) + h()));
    }

    public final boolean l() {
        byte b10 = this.x;
        return (b10 & 1) != 0 && (b10 & 2) == 0;
    }

    public final void m(int i10, String str, boolean z10) {
        boolean z11 = i10 >= 75 && !z10;
        this.N = z11;
        if (z11) {
            this.Q = new qz0(cd.L0(2131751765, null).toUpperCase(), tz.W0 - 3, i0.o());
            Drawable f7 = i0.a.f(w0.b, R.drawable.msg_copy);
            this.P = f7;
            f7.setColorFilter(new PorterDuffColorFilter(this.O, PorterDuff.Mode.SRC_IN));
            this.S = org.telegram.ui.ActionBar.t6.c0(this.R, 0, 0, Math.min(5, tz.Y0), 0);
            this.T = new Paint(1);
        }
        if (TextUtils.isEmpty(str)) {
            this.K = null;
            this.L = null;
            return;
        }
        this.K = str;
        String b10 = b(str);
        int i11 = tz.W0 - 1;
        di.s sVar = di.l.a;
        qz0 qz0Var = new qz0(b10, i11 - ((i10 <= 120 ? i10 > 50 ? 3 : 2 : 5) / 2), i0.o());
        this.L = qz0Var;
        this.M = i0.L(4.0f) + ((int) (qz0Var.a.getTextSize() * 1.714f));
    }

    public final void n(String str, boolean z10) {
        this.U = true;
        this.N = !z10;
        if (!z10) {
            Drawable f7 = i0.a.f(w0.b, R.drawable.msg_copy);
            this.P = f7;
            f7.setColorFilter(new PorterDuffColorFilter(this.O, PorterDuff.Mode.SRC_IN));
            this.S = org.telegram.ui.ActionBar.t6.c0(this.R, 0, 0, Math.min(5, tz.Y0), 0);
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.K = str;
        this.L = str != null ? new qz0(str, Math.max(8, tz.W0 - 4), null) : null;
        this.M = 0;
    }

    public final float o(ArrayList arrayList) {
        gj gjVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && (gjVar = (gj) arrayList.get(i11)) != this; i11++) {
            i10 += ((gjVar.J && gjVar.f()) ? gjVar.F : gjVar.w) + gjVar.f + gjVar.h;
        }
        return i10;
    }

    public final float p(ArrayList arrayList, org.telegram.ui.Cells.x1 x1Var) {
        gj gjVar;
        if (arrayList == null) {
            return 0.0f;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && (gjVar = (gj) arrayList.get(i11)) != this; i11++) {
            i10 += gjVar.j(x1Var) + gjVar.f + gjVar.h;
        }
        return i10;
    }
}
