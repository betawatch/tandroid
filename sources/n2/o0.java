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
import org.telegram.ui.Cells.e1;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.q80;
import org.telegram.ui.z2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class o0 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public o0() {
        this.e = new ArrayList();
        this.a = 0;
        this.f = new ArrayList();
        this.b = 0;
    }

    public static boolean a(o0 o0Var) {
        return Objects.equals(((e2.u) o0Var.c).s, "audio/raw");
    }

    public static q80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        h80 h80Var = new h80(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        h80Var.d(layout, spanStart, f10);
        layout.getSelectionPath(spanStart, spanEnd, h80Var);
        q80 q80Var = new q80();
        q80Var.y = h80Var;
        q80Var.D = true;
        q80Var.k(4.0f);
        q80Var.l();
        return q80Var;
    }

    public void b(n80 n80Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(n80Var, obj));
        this.a++;
        j(obj, true);
    }

    public void c(q80 q80Var, Object obj) {
        ((ArrayList) this.f).add(new Pair(q80Var, obj));
        this.b++;
        j(obj, true);
    }

    public xi.a d() {
        if (this.a == 3) {
            String str = (String) this.c;
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                int indexOf = str.indexOf(47);
                String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                String substring2 = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                if (!TextUtils.isEmpty(substring) && substring.indexOf(58) < 0 && substring.indexOf(63) < 0 && substring.indexOf(35) < 0 && (substring2 == null || (substring2.length() <= 128 && xi.a.g.matcher(substring2).matches()))) {
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
                String b10 = xi.a.b((String) this.f);
                if (b10 == null) {
                    b10 = ((String) this.f).toLowerCase(Locale.US);
                }
                this.f = b10;
            }
        }
        return new xi.a(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.e;
        if (z10) {
            for (int i7 = 0; i7 < this.a; i7++) {
                l(i7);
            }
        } else if (this.a > 0) {
            for (int i10 = 0; i10 < this.a; i10++) {
                ((n80) ((Pair) arrayList.get(i10)).first).c();
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
        boolean z10 = false;
        while (i7 < this.b) {
            ((q80) ((Pair) ((ArrayList) this.f).get(i7)).first).draw(canvas);
            i7++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            z10 = ((n80) ((Pair) ((ArrayList) this.e).get(i10)).first).a(canvas) || z10;
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        boolean z10 = false;
        for (int i7 = 0; i7 < this.b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((q80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                z10 = ((n80) ((Pair) arrayList.get(i10)).first).a(canvas) || z10;
            }
        }
        j(obj, false);
        return z10;
    }

    public void j(Object obj, boolean z10) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            if (!z2Var.c && (view2 = z2Var.b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = (View) this.c) != null) {
            view.invalidate();
        }
        e1 e1Var = (e1) this.d;
        if (e1Var != null) {
            e1Var.run();
        }
    }

    public void l(int i7) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i7 < 0 || i7 >= this.a) {
            return;
        }
        Pair pair = (Pair) arrayList.get(i7);
        n80 n80Var = (n80) pair.first;
        if (n80Var.p < 0) {
            n80Var.p = Math.max(n80Var.o + n80Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.h3(new j80(this, n80Var, 1), Math.max(0L, (n80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void m(n80 n80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (n80Var == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.a) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i7)).first == n80Var) {
                    pair = (Pair) arrayList.get(i7);
                    break;
                }
                i7++;
            }
        }
        if (pair == null) {
            return;
        }
        if (!z10) {
            arrayList.remove(pair);
            n80Var.c();
            this.a = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (n80Var.p < 0) {
            n80Var.p = Math.max(n80Var.o + n80Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.h3(new j80(this, n80Var, 0), Math.max(0L, (n80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void n(q80 q80Var, boolean z10) {
        if (q80Var == null) {
            return;
        }
        for (int i7 = 0; i7 < this.b; i7++) {
            if (((Pair) ((ArrayList) this.f).get(i7)).first == q80Var) {
                o(i7, z10);
                return;
            }
        }
    }

    public void o(int i7, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f;
        if (i7 < 0 || i7 >= this.b || (pair = (Pair) arrayList.get(i7)) == null) {
            return;
        }
        q80 q80Var = (q80) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            q80Var.b = -1L;
            q80Var.c = -1L;
            this.b = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (q80Var.c()) {
            n(q80Var, false);
            return;
        }
        if (!q80Var.d()) {
            q80Var.a();
        }
        org.telegram.messenger.g0.h3(new ou(20, this, q80Var), q80Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - q80Var.c) : 0L);
    }

    public void p(int i7) {
        if (i7 == 0) {
            i7 = 1;
        }
        this.a = i7;
    }

    public o0(View view) {
        this.e = new ArrayList();
        this.a = 0;
        this.f = new ArrayList();
        this.b = 0;
        this.c = view;
    }

    public o0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.j jVar) {
        this.c = uVar;
        this.d = uVar2;
        this.a = i7;
        this.b = i10;
        this.e = nVar;
        this.f = jVar;
    }
}
