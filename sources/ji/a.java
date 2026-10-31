package ji;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.View;
import b2.x;
import j$.util.Objects;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Locale;
import k2.o;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.z2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class a {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public a() {
        this.e = new ArrayList();
        this.a = 0;
        this.f = new ArrayList();
        this.b = 0;
    }

    public static boolean a(a aVar) {
        return Objects.equals(((x) aVar.c).s, "audio/raw");
    }

    public static t80 k(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        k80 k80Var = new k80(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        k80Var.d(layout, spanStart, f7);
        layout.getSelectionPath(spanStart, spanEnd, k80Var);
        t80 t80Var = new t80();
        t80Var.y = k80Var;
        t80Var.D = true;
        t80Var.k(4.0f);
        t80Var.l();
        return t80Var;
    }

    public void b(q80 q80Var, Object obj) {
        ((ArrayList) this.e).add(new Pair(q80Var, obj));
        this.a++;
        j(obj, true);
    }

    public void c(t80 t80Var, Object obj) {
        ((ArrayList) this.f).add(new Pair(t80Var, obj));
        this.b++;
        j(obj, true);
    }

    public b d() {
        if (this.a == 3) {
            String str = (String) this.c;
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                int indexOf = str.indexOf(47);
                String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                String substring2 = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                if (!TextUtils.isEmpty(substring) && substring.indexOf(58) < 0 && substring.indexOf(63) < 0 && substring.indexOf(35) < 0 && (substring2 == null || (substring2.length() <= 128 && b.g.matcher(substring2).matches()))) {
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
                String b10 = b.b((String) this.f);
                if (b10 == null) {
                    b10 = ((String) this.f).toLowerCase(Locale.US);
                }
                this.f = b10;
            }
        }
        return new b(this);
    }

    public void e() {
        f(true);
    }

    public void f(boolean z10) {
        ArrayList arrayList = (ArrayList) this.e;
        if (z10) {
            for (int i10 = 0; i10 < this.a; i10++) {
                l(i10);
            }
        } else if (this.a > 0) {
            for (int i11 = 0; i11 < this.a; i11++) {
                ((q80) ((Pair) arrayList.get(i11)).first).c();
                j(((Pair) arrayList.get(i11)).second, false);
            }
            arrayList.clear();
            this.a = 0;
            j(null, true);
        }
    }

    public void g() {
        for (int i10 = 0; i10 < this.b; i10++) {
            o(i10, true);
        }
    }

    public boolean h(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.b) {
            ((t80) ((Pair) ((ArrayList) this.f).get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.a; i11++) {
            z10 = ((q80) ((Pair) ((ArrayList) this.e).get(i11)).first).a(canvas) || z10;
        }
        return z10;
    }

    public boolean i(Canvas canvas, Object obj) {
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        boolean z10 = false;
        for (int i10 = 0; i10 < this.b; i10++) {
            if (((Pair) arrayList2.get(i10)).second == obj) {
                ((t80) ((Pair) arrayList2.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.a; i11++) {
            if (((Pair) arrayList.get(i11)).second == obj) {
                z10 = ((q80) ((Pair) arrayList.get(i11)).first).a(canvas) || z10;
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
        b1 b1Var = (b1) this.d;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public void l(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i10 < 0 || i10 >= this.a) {
            return;
        }
        Pair pair = (Pair) arrayList.get(i10);
        q80 q80Var = (q80) pair.first;
        if (q80Var.p < 0) {
            q80Var.p = Math.max(q80Var.o + q80Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            i0.h3(new m80(this, q80Var, 1), Math.max(0L, (q80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void m(q80 q80Var, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.e;
        if (q80Var == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.a) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i10)).first == q80Var) {
                    pair = (Pair) arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (pair == null) {
            return;
        }
        if (!z10) {
            arrayList.remove(pair);
            q80Var.c();
            this.a = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (q80Var.p < 0) {
            q80Var.p = Math.max(q80Var.o + q80Var.q, SystemClock.elapsedRealtime());
            j(pair.second, true);
            i0.h3(new m80(this, q80Var, 0), Math.max(0L, (q80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public void n(t80 t80Var, boolean z10) {
        if (t80Var == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b; i10++) {
            if (((Pair) ((ArrayList) this.f).get(i10)).first == t80Var) {
                o(i10, z10);
                return;
            }
        }
    }

    public void o(int i10, boolean z10) {
        Pair pair;
        ArrayList arrayList = (ArrayList) this.f;
        if (i10 < 0 || i10 >= this.b || (pair = (Pair) arrayList.get(i10)) == null) {
            return;
        }
        t80 t80Var = (t80) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            t80Var.b = -1L;
            t80Var.c = -1L;
            this.b = arrayList.size();
            j(pair.second, true);
            return;
        }
        if (t80Var.c()) {
            n(t80Var, false);
            return;
        }
        if (!t80Var.d()) {
            t80Var.a();
        }
        i0.h3(new at(22, this, t80Var), t80Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - t80Var.c) : 0L);
    }

    public a(View view) {
        this.e = new ArrayList();
        this.a = 0;
        this.f = new ArrayList();
        this.b = 0;
        this.c = view;
    }

    public a(x xVar, x xVar2, int i10, int i11, o oVar, c2.i iVar) {
        this.c = xVar;
        this.d = xVar2;
        this.a = i10;
        this.b = i11;
        this.e = oVar;
        this.f = iVar;
    }
}
