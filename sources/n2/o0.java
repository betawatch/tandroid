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
import org.telegram.ui.Cells.d1;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.z2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    public static o80 k(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        f80 f80Var = new f80(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        f80Var.d(layout, spanStart, f10);
        layout.getSelectionPath(spanStart, spanEnd, f80Var);
        o80 o80Var = new o80();
        o80Var.y = f80Var;
        o80Var.D = true;
        o80Var.k(4.0f);
        o80Var.l();
        return o80Var;
    }

    public void b(l80 l80Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(l80Var, obj));
        this.a++;
        j(obj, true);
    }

    public void c(o80 o80Var, Object obj) {
        ((ArrayList) this.f).add(new Pair(o80Var, obj));
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
                ((l80) ((Pair) arrayList.get(i10)).first).c();
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
            ((o80) ((Pair) ((ArrayList) this.f).get(i7)).first).draw(canvas);
            i7++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            z10 = ((l80) ((Pair) ((ArrayList) this.e).get(i10)).first).a(canvas) || z10;
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        boolean z10 = false;
        for (int i7 = 0; i7 < this.b; i7++) {
            if (((Pair) arrayList2.get(i7)).second == obj) {
                ((o80) ((Pair) arrayList2.get(i7)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i10 = 0; i10 < this.a; i10++) {
            if (((Pair) arrayList.get(i10)).second == obj) {
                z10 = ((l80) ((Pair) arrayList.get(i10)).first).a(canvas) || z10;
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

    public void l(int i7) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i7 < 0 || i7 >= this.a) {
            return;
        }
        Pair pair = (Pair) arrayList.get(i7);
        l80 l80Var = (l80) pair.first;
        if (l80Var.p < 0) {
            l80Var.p = Math.max(l80Var.o + l80Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.h3(new h80(this, l80Var, 1), Math.max(0L, (l80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void m(l80 l80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (l80Var == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.a) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i7)).first == l80Var) {
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
            l80Var.c();
            this.a = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (l80Var.p < 0) {
            l80Var.p = Math.max(l80Var.o + l80Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            org.telegram.messenger.g0.h3(new h80(this, l80Var, 0), Math.max(0L, (l80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void n(o80 o80Var, boolean z10) {
        if (o80Var == null) {
            return;
        }
        for (int i7 = 0; i7 < this.b; i7++) {
            if (((Pair) ((ArrayList) this.f).get(i7)).first == o80Var) {
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
        o80 o80Var = (o80) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            o80Var.b = -1L;
            o80Var.c = -1L;
            this.b = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (o80Var.c()) {
            n(o80Var, false);
            return;
        }
        if (!o80Var.d()) {
            o80Var.a();
        }
        org.telegram.messenger.g0.h3(new dw(18, this, o80Var), o80Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - o80Var.c) : 0L);
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
