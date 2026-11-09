package n2;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.View;
import j$.util.Objects;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.y70;
import org.telegram.ui.z2;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class n0 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public n0() {
        this.e = new ArrayList();
        this.a = 0;
        this.f = new ArrayList();
        this.b = 0;
    }

    public static boolean a(n0 n0Var) {
        return Objects.equals(((e2.u) n0Var.c).s, "audio/raw");
    }

    public static b80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        s70 s70Var = new s70(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        s70Var.d(layout, spanStart, f10);
        layout.getSelectionPath(spanStart, spanEnd, s70Var);
        b80 b80Var = new b80();
        b80Var.y = s70Var;
        b80Var.D = true;
        b80Var.k(4.0f);
        b80Var.l();
        return b80Var;
    }

    public void b(y70 y70Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(y70Var, obj));
        this.a++;
        j(obj, true);
    }

    public void c(b80 b80Var, Object obj) {
        ((ArrayList) this.f).add(new Pair(b80Var, obj));
        this.b++;
        j(obj, true);
    }

    public ui.a d() {
        if (this.a == 3) {
            String str = (String) this.c;
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                int indexOf = str.indexOf(47);
                String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                String substring2 = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                if (!TextUtils.isEmpty(substring) && substring.indexOf(58) < 0 && substring.indexOf(63) < 0 && substring.indexOf(35) < 0 && (substring2 == null || (substring2.length() <= 128 && ui.a.g.matcher(substring2).matches()))) {
                    try {
                        String lowerCase = IDN.toASCII(substring, 3).toLowerCase(Locale.US);
                        if (substring2 == null) {
                            str = lowerCase;
                        } else {
                            str = lowerCase + '/' + substring2;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            this.c = str;
            if (str == null || str.indexOf(47) < 0) {
                this.f = ((String) this.f).toLowerCase(Locale.US);
            } else {
                String b10 = ui.a.b((String) this.f);
                if (b10 == null) {
                    b10 = ((String) this.f).toLowerCase(Locale.US);
                }
                this.f = b10;
            }
        }
        return new ui.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z9) {
        ArrayList arrayList = (ArrayList) this.e;
        if (z9) {
            for (int i7 = 0; i7 < this.a; i7++) {
                l(i7);
            }
        } else if (this.a > 0) {
            for (int i10 = 0; i10 < this.a; i10++) {
                ((y70) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i7 = 0; i7 < this.b; i7++) {
            o(i7, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i7 = 0;
        boolean z9 = false;
        while (i7 < this.b) {
            ((b80) ((Pair) ((ArrayList) this.f).get(i7)).first).draw(canvas);
            i7++;
            z9 = true;
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            z9 = ((y70) ((Pair) ((ArrayList) this.e).get(i10)).first).a(canvas) || z9;
        }
        return z9;
    }

    public boolean i(Canvas canvas, Object obj) {
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        boolean z9 = false;
        for (int i7 = 0; i7 < this.b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((b80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z9 = true;
            }
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                z9 = ((y70) ((Pair) arrayList.get(i10)).first).a(canvas) || z9;
            }
        }
        j(obj, false);
        return z9;
    }

    public void j(Object obj, boolean z9) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            if (!z2Var.c && (view2 = z2Var.b) != null) {
                view2.invalidate();
            }
        } else if (z9 && (view = (View) this.c) != null) {
            view.invalidate();
        }
        c1 c1Var = (c1) this.d;
        if (c1Var != null) {
            c1Var.run();
        }
    }

    public void l(int i7) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i7 < 0 || i7 >= this.a) {
            return;
        }
        Pair pair = (Pair) arrayList.get(i7);
        y70 y70Var = (y70) pair.first;
        if (y70Var.p < 0) {
            y70Var.p = Math.max(y70Var.o + y70Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.i3(new u70(this, y70Var, 1), Math.max(0L, (y70Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void m(y70 y70Var, boolean z9) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (y70Var == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.a) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i7)).first == y70Var) {
                    pair = (Pair) arrayList.get(i7);
                    break;
                }
                i7++;
            }
        }
        if (pair == null) {
            return;
        }
        if (!z9) {
            arrayList.remove(pair);
            y70Var.c();
            this.a = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (y70Var.p < 0) {
            y70Var.p = Math.max(y70Var.o + y70Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.i3(new u70(this, y70Var, 0), Math.max(0L, (y70Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void n(b80 b80Var, boolean z9) {
        if (b80Var == null) {
            return;
        }
        for (int i7 = 0; i7 < this.b; i7++) {
            if (((Pair) ((ArrayList) this.f).get(i7)).first == b80Var) {
                o(i7, z9);
                return;
            }
        }
    }

    public void o(int i7, boolean z9) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f;
        if (i7 < 0 || i7 >= this.b || (pair = (Pair) arrayList.get(i7)) == null) {
            return;
        }
        b80 b80Var = (b80) pair.first;
        if (!z9) {
            arrayList.remove(pair);
            b80Var.b = -1L;
            b80Var.c = -1L;
            this.b = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (b80Var.c()) {
            n(b80Var, false);
            return;
        }
        if (!b80Var.d()) {
            b80Var.a();
        }
        org.telegram.messenger.g0.i3(new fq(28, this, b80Var), b80Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - b80Var.c) : 0L);
    }

    public void p(int i7) {
        if (i7 == 0) {
            i7 = 1;
        }
        this.a = i7;
    }

    public n0(View view) {
        this.e = new ArrayList();
        this.a = 0;
        this.f = new ArrayList();
        this.b = 0;
        this.c = view;
    }

    public n0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.j jVar) {
        this.c = uVar;
        this.d = uVar2;
        this.a = i7;
        this.b = i10;
        this.e = nVar;
        this.f = jVar;
    }
}
