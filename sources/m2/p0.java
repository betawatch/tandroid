package m2;

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
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.a3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public p0() {
        this.e = new ArrayList();
        this.a = 0;
        this.f = new ArrayList();
        this.b = 0;
    }

    public static boolean a(p0 p0Var) {
        return Objects.equals(((d2.v) p0Var.c).s, "audio/raw");
    }

    public static w70 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        n70 n70Var = new n70(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        n70Var.d(layout, spanStart, f10);
        layout.getSelectionPath(spanStart, spanEnd, n70Var);
        w70 w70Var = new w70();
        w70Var.y = n70Var;
        w70Var.D = true;
        w70Var.k(4.0f);
        w70Var.l();
        return w70Var;
    }

    public void b(t70 t70Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(t70Var, obj));
        this.a++;
        j(obj, true);
    }

    public void c(w70 w70Var, Object obj) {
        ((ArrayList) this.f).add(new Pair(w70Var, obj));
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

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.e;
        if (z10) {
            for (int i3 = 0; i3 < this.a; i3++) {
                l(i3);
            }
        } else if (this.a > 0) {
            for (int i10 = 0; i10 < this.a; i10++) {
                ((t70) ((Pair) arrayList.get(i10)).first).c();
                j(((Pair) arrayList.get(i10)).second, false);
            }
            arrayList.clear();
            this.a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i3 = 0; i3 < this.b; i3++) {
            o(i3, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i3 = 0;
        boolean z10 = false;
        while (i3 < this.b) {
            ((w70) ((Pair) ((ArrayList) this.f).get(i3)).first).draw(canvas);
            i3++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            z10 = ((t70) ((Pair) ((ArrayList) this.e).get(i10)).first).a(canvas) || z10;
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        boolean z10 = false;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (((Pair) arrayList2.get(i3)).second == obj) {
                ((w70) ((Pair) arrayList2.get(i3)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                z10 = ((t70) ((Pair) arrayList.get(i10)).first).a(canvas) || z10;
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
        } else if (obj instanceof a3) {
            a3 a3Var = (a3) obj;
            if (!a3Var.c && (view2 = a3Var.b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = (View) this.c) != null) {
            view.invalidate();
        }
        c1 c1Var = (c1) this.d;
        if (c1Var != null) {
            c1Var.run();
        }
    }

    public void l(int i3) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i3 < 0 || i3 >= this.a) {
            return;
        }
        Pair pair = (Pair) arrayList.get(i3);
        t70 t70Var = (t70) pair.first;
        if (t70Var.p < 0) {
            t70Var.p = Math.max(t70Var.o + t70Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.i3(new p70(this, t70Var, 1), Math.max(0L, (t70Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void m(t70 t70Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (t70Var == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.a) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i3)).first == t70Var) {
                    pair = (Pair) arrayList.get(i3);
                    break;
                }
                i3++;
            }
        }
        if (pair == null) {
            return;
        }
        if (!z10) {
            arrayList.remove(pair);
            t70Var.c();
            this.a = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (t70Var.p < 0) {
            t70Var.p = Math.max(t70Var.o + t70Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.i3(new p70(this, t70Var, 0), Math.max(0L, (t70Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void n(w70 w70Var, boolean z10) {
        if (w70Var == null) {
            return;
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            if (((Pair) ((ArrayList) this.f).get(i3)).first == w70Var) {
                o(i3, z10);
                return;
            }
        }
    }

    public void o(int i3, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f;
        if (i3 < 0 || i3 >= this.b || (pair = (Pair) arrayList.get(i3)) == null) {
            return;
        }
        w70 w70Var = (w70) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            w70Var.b = -1L;
            w70Var.c = -1L;
            this.b = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (w70Var.c()) {
            n(w70Var, false);
            return;
        }
        if (!w70Var.d()) {
            w70Var.a();
        }
        org.telegram.messenger.g0.i3(new j50(3, this, w70Var), w70Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - w70Var.c) : 0L);
    }

    public void p(int i3) {
        if (i3 == 0) {
            i3 = 1;
        }
        this.a = i3;
    }

    public p0(View view) {
        this.e = new ArrayList();
        this.a = 0;
        this.f = new ArrayList();
        this.b = 0;
        this.c = view;
    }

    public p0(d2.v vVar, d2.v vVar2, int i3, int i10, n nVar, e2.i iVar) {
        this.c = vVar;
        this.d = vVar2;
        this.a = i3;
        this.b = i10;
        this.e = nVar;
        this.f = iVar;
    }
}
