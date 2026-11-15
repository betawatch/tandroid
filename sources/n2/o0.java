package n2;

import android.graphics.Canvas;
import android.graphics.Matrix;
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
import org.telegram.ui.Cells.d1;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.w70;
import org.telegram.ui.z2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

    public static d80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        u70 u70Var = new u70(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        u70Var.d(layout, spanStart, f10);
        layout.getSelectionPath(spanStart, spanEnd, u70Var);
        d80 d80Var = new d80();
        d80Var.y = u70Var;
        d80Var.D = true;
        d80Var.k(4.0f);
        d80Var.l();
        return d80Var;
    }

    public void b(a80 a80Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(a80Var, obj));
        this.a++;
        j(obj, true);
    }

    public void c(d80 d80Var, Object obj) {
        ((ArrayList) this.f).add(new Pair(d80Var, obj));
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
                m(i7);
            }
        } else if (this.a > 0) {
            for (int i10 = 0; i10 < this.a; i10++) {
                ((a80) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i7 = 0; i7 < this.b; i7++) {
            p(i7, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i7 = 0;
        boolean z10 = false;
        while (i7 < this.b) {
            ((d80) ((Pair) ((ArrayList) this.f).get(i7)).first).draw(canvas);
            i7++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            z10 = ((a80) ((Pair) ((ArrayList) this.e).get(i10)).first).a(canvas) || z10;
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        boolean z10 = false;
        for (int i7 = 0; i7 < this.b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((d80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                z10 = ((a80) ((Pair) arrayList.get(i10)).first).a(canvas) || z10;
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
        d1 d1Var = (d1) this.d;
        if (d1Var != null) {
            d1Var.run();
        }
    }

    public void l() {
        ((Canvas) this.c).restore();
        ((Matrix) this.d).set((Matrix) r.b.g(1, (ArrayList) this.e));
        this.a--;
    }

    public void m(int i7) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i7 < 0 || i7 >= this.a) {
            return;
        }
        Pair pair = (Pair) arrayList.get(i7);
        a80 a80Var = (a80) pair.first;
        if (a80Var.p < 0) {
            a80Var.p = Math.max(a80Var.o + a80Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.i3(new w70(this, a80Var, 1), Math.max(0L, (a80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void n(a80 a80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (a80Var == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.a) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i7)).first == a80Var) {
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
            a80Var.c();
            this.a = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (a80Var.p < 0) {
            a80Var.p = Math.max(a80Var.o + a80Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.i3(new w70(this, a80Var, 0), Math.max(0L, (a80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void o(d80 d80Var, boolean z10) {
        if (d80Var == null) {
            return;
        }
        for (int i7 = 0; i7 < this.b; i7++) {
            if (((Pair) ((ArrayList) this.f).get(i7)).first == d80Var) {
                p(i7, z10);
                return;
            }
        }
    }

    public void p(int i7, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f;
        if (i7 < 0 || i7 >= this.b || (pair = (Pair) arrayList.get(i7)) == null) {
            return;
        }
        d80 d80Var = (d80) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            d80Var.b = -1L;
            d80Var.c = -1L;
            this.b = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (d80Var.c()) {
            o(d80Var, false);
            return;
        }
        if (!d80Var.d()) {
            d80Var.a();
        }
        org.telegram.messenger.g0.i3(new vs(22, this, d80Var), d80Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - d80Var.c) : 0L);
    }

    public void q(int i7) {
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

    public o0(e2.u uVar, e2.u uVar2, int i7, int i10, n nVar, f2.i iVar) {
        this.c = uVar;
        this.d = uVar2;
        this.a = i7;
        this.b = i10;
        this.e = nVar;
        this.f = iVar;
    }
}
