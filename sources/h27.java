// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h27 implements jg7 {
    public float E;
    public k27 F;
    public int G;
    public n41 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public tgb M;
    public int N;
    public boolean O;
    public int P;
    public Drawable Q;
    public tgb R;
    public int S;
    public ff0 T;
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

    @Override // jg7
    public final Layout a() {
        return this.e;
    }

    public final int c() {
        return gl.L(this.V ? 28.0f : 15.0f);
    }

    public final float d(nb2 nb2Var) {
        boolean f;
        if (nb2Var.f3) {
            HashSet hashSet = nb2Var.e3;
            f = true;
            if (hashSet != null && hashSet.contains(Integer.valueOf(this.c))) {
                f = false;
            }
        } else {
            f = f();
        }
        return gl.R1(f ? 1.0f : 0.0f, f() ? 1.0f : 0.0f, nb2Var.L1);
    }

    @Override // jg7
    public final View e() {
        return null;
    }

    public final boolean f() {
        HashSet hashSet;
        k27 k27Var = this.F;
        return k27Var == null || (hashSet = k27Var.K0) == null || !hashSet.contains(Integer.valueOf(this.c));
    }

    public final int g() {
        return gl.L(this.M != null ? 32.0f : 12.0f);
    }

    public final int h() {
        StaticLayout staticLayout;
        return (this.M != null || (staticLayout = this.e) == null || staticLayout.getLineCount() == 0) ? gl.L(8.0f) + (-g()) : Math.round(((this.e.getLineBottom(0) + this.e.getLineTop(0)) / 2.0f) - (gl.L(18.0f) / 2.0f));
    }

    public final void i(Canvas canvas, RectF rectF, int i, int i2, float f) {
        if (this.O) {
            int p1 = bkb.p1(0.1f, i);
            if (this.S != p1) {
                ff0 ff0Var = this.T;
                this.S = p1;
                bkb.F1(ff0Var, p1, true);
            }
            this.T.setBounds(gl.L(3.0f) + ((int) rectF.left), (int) (rectF.bottom - gl.L(38.0f)), (int) rectF.right, (int) rectF.bottom);
            int i3 = (int) (255.0f * f);
            this.T.setAlpha(i3);
            if (this.T.getCallback() != null) {
                this.T.draw(canvas);
            }
            this.U.setColor(bm2.o(i2, 38));
            canvas.drawRect(rectF.left + gl.L(10.0f), (rectF.bottom - gl.L(38.0f)) - gl.e1(), rectF.right - gl.L(6.66f), rectF.bottom - gl.L(38.0f), this.U);
            float centerX = rectF.centerX() - (Math.min(rectF.width() - gl.L(12.0f), ((this.Q.getIntrinsicWidth() * 0.8f) + gl.L(5.0f)) + this.R.c) / 2.0f);
            float L = rectF.bottom - (gl.L(38.0f) / 2.0f);
            if (this.P != i) {
                Drawable drawable = this.Q;
                this.P = i;
                drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            this.Q.setAlpha(i3);
            this.Q.setBounds((int) centerX, (int) (L - ((r1.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.Q.getIntrinsicWidth() * 0.8f) + centerX), (int) ls6.d(this.Q.getIntrinsicHeight(), 0.8f, 2.0f, L));
            this.Q.draw(canvas);
            float intrinsicWidth = (this.Q.getIntrinsicWidth() * 0.8f) + gl.L(5.0f) + centerX;
            tgb tgbVar = this.R;
            tgbVar.p = gl.L(12.0f) + ((int) (r11 - ((this.Q.getIntrinsicWidth() * 0.8f) + gl.L(5.0f))));
            tgbVar.c(intrinsicWidth, L, f, i, canvas);
        }
    }

    public final int j(nb2 nb2Var) {
        boolean z = this.K;
        int i = this.w;
        if (!z) {
            return i;
        }
        return gl.U1(d(nb2Var), i, this.G);
    }

    public final boolean k(float f, float f2, float f3) {
        if (!this.O || f < f3 - gl.L(38.0f) || f > f3 || f2 < (-g())) {
            return false;
        }
        return f2 <= ((float) (gl.L(26.0f) + h()));
    }

    public final boolean l() {
        byte b = this.x;
        return (b & 1) != 0 && (b & 2) == 0;
    }

    public final void m(int i, String str, boolean z) {
        boolean z2 = i >= 75 && !z;
        this.O = z2;
        if (z2) {
            this.R = new tgb(k96.M0(2131751753, null).toUpperCase(), gba.S0 - 3, gl.o());
            Drawable d = b00.d(a.b, R.drawable.msg_copy);
            this.Q = d;
            d.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = bkb.a0(this.S, 0, 0, Math.min(5, gba.U0), 0);
            this.U = new Paint(1);
        }
        if (TextUtils.isEmpty(str)) {
            this.L = null;
            this.M = null;
            return;
        }
        this.L = str;
        String b = b(str);
        int i2 = gba.S0 - 1;
        jj8 jj8Var = qj2.a;
        tgb tgbVar = new tgb(b, i2 - ((i <= 120 ? i > 50 ? 3 : 2 : 5) / 2), gl.o());
        this.M = tgbVar;
        this.N = gl.L(4.0f) + ((int) (tgbVar.a.getTextSize() * 1.714f));
    }

    public final void n(String str, boolean z) {
        this.V = true;
        this.O = !z;
        if (!z) {
            Drawable d = b00.d(a.b, R.drawable.msg_copy);
            this.Q = d;
            d.setColorFilter(new PorterDuffColorFilter(this.P, PorterDuff.Mode.SRC_IN));
            this.T = bkb.a0(this.S, 0, 0, Math.min(5, gba.U0), 0);
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.L = str;
        this.M = str != null ? new tgb(str, Math.max(8, gba.S0 - 4), null) : null;
        this.N = 0;
    }

    public final float o(ArrayList arrayList) {
        h27 h27Var;
        if (arrayList == null) {
            return 0.0f;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size() && (h27Var = (h27) arrayList.get(i2)) != this; i2++) {
            i += ((h27Var.K && h27Var.f()) ? h27Var.G : h27Var.w) + h27Var.f + h27Var.h;
        }
        return i;
    }

    public final float p(ArrayList arrayList, nb2 nb2Var) {
        h27 h27Var;
        if (arrayList == null) {
            return 0.0f;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size() && (h27Var = (h27) arrayList.get(i2)) != this; i2++) {
            i += h27Var.j(nb2Var) + h27Var.f + h27Var.h;
        }
        return i;
    }
}
