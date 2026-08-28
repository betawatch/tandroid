package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i80 {
    public View a;
    public org.telegram.ui.Cells.b1 b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f = 0;

    public i80() {
    }

    public static p80 i(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        f80 f80Var = new f80(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        f80Var.d(layout, spanStart, f10);
        layout.getSelectionPath(spanStart, spanEnd, f80Var);
        p80 p80Var = new p80();
        p80Var.x = f80Var;
        p80Var.C = true;
        p80Var.j(4.0f);
        p80Var.k();
        return p80Var;
    }

    public final void a(m80 m80Var, Object obj) {
        this.c.add(new Pair(m80Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(p80 p80Var, Object obj) {
        this.e.add(new Pair(p80Var, obj));
        this.f++;
        h(obj, true);
    }

    public final void c() {
        d(true);
    }

    public final void d(boolean z10) {
        if (z10) {
            for (int i9 = 0; i9 < this.d; i9++) {
                j(i9);
            }
        } else {
            if (this.d <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                ArrayList arrayList = this.c;
                if (i10 >= i11) {
                    arrayList.clear();
                    this.d = 0;
                    h(null, true);
                    return;
                } else {
                    ((m80) ((Pair) arrayList.get(i10)).first).c();
                    h(((Pair) arrayList.get(i10)).second, false);
                    i10++;
                }
            }
        }
    }

    public final void e() {
        for (int i9 = 0; i9 < this.f; i9++) {
            m(i9, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i9 = 0;
        boolean z10 = false;
        while (i9 < this.f) {
            ((p80) ((Pair) this.e.get(i9)).first).draw(canvas);
            i9++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.d; i10++) {
            z10 = ((m80) ((Pair) this.c.get(i10)).first).a(canvas) || z10;
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i9 = 0; i9 < this.f; i9++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i9)).second == obj) {
                ((p80) ((Pair) arrayList.get(i9)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i10 = 0; i10 < this.d; i10++) {
            ArrayList arrayList2 = this.c;
            if (((Pair) arrayList2.get(i10)).second == obj) {
                z10 = ((m80) ((Pair) arrayList2.get(i10)).first).a(canvas) || z10;
            }
        }
        h(obj, false);
        return z10;
    }

    public final void h(Object obj, boolean z10) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof org.telegram.ui.e3) {
            org.telegram.ui.e3 e3Var = (org.telegram.ui.e3) obj;
            if (!e3Var.c && (view2 = e3Var.b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i9) {
        if (i9 < 0 || i9 >= this.d) {
            return;
        }
        Pair pair = (Pair) this.c.get(i9);
        m80 m80Var = (m80) pair.first;
        if (m80Var.p < 0) {
            m80Var.p = Math.max(m80Var.o + m80Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new h80(this, m80Var, 1), Math.max(0L, (m80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void k(m80 m80Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (m80Var == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            int i10 = this.d;
            arrayList = this.c;
            if (i9 >= i10) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i9)).first == m80Var) {
                    pair = (Pair) arrayList.get(i9);
                    break;
                }
                i9++;
            }
        }
        if (pair == null) {
            return;
        }
        if (!z10) {
            arrayList.remove(pair);
            m80Var.c();
            this.d = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (m80Var.p < 0) {
            m80Var.p = Math.max(m80Var.o + m80Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new h80(this, m80Var, 0), Math.max(0L, (m80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void l(p80 p80Var, boolean z10) {
        if (p80Var == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            if (((Pair) this.e.get(i9)).first == p80Var) {
                m(i9, z10);
                return;
            }
        }
    }

    public final void m(int i9, boolean z10) {
        if (i9 < 0 || i9 >= this.f) {
            return;
        }
        ArrayList arrayList = this.e;
        Pair pair = (Pair) arrayList.get(i9);
        if (pair == null) {
            return;
        }
        p80 p80Var = (p80) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            p80Var.b = -1L;
            p80Var.c = -1L;
            this.f = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (p80Var.b()) {
            l(p80Var, false);
            return;
        }
        if (!p80Var.c()) {
            p80Var.a();
        }
        AndroidUtilities.runOnUIThread(new zq(26, this, p80Var), p80Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - p80Var.c) : 0L);
    }

    public i80(View view) {
        this.a = view;
    }
}
