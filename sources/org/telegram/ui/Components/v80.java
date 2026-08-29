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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v80 {
    public View a;
    public org.telegram.ui.Cells.a1 b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f = 0;

    public v80() {
    }

    public static c90 i(Layout layout, CharacterStyle characterStyle, float f9) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        s80 s80Var = new s80(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        s80Var.d(layout, spanStart, f9);
        layout.getSelectionPath(spanStart, spanEnd, s80Var);
        c90 c90Var = new c90();
        c90Var.x = s80Var;
        c90Var.C = true;
        c90Var.j(4.0f);
        c90Var.k();
        return c90Var;
    }

    public final void a(z80 z80Var, Object obj) {
        this.c.add(new Pair(z80Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(c90 c90Var, Object obj) {
        this.e.add(new Pair(c90Var, obj));
        this.f++;
        h(obj, true);
    }

    public final void c() {
        d(true);
    }

    public final void d(boolean z10) {
        if (z10) {
            for (int i10 = 0; i10 < this.d; i10++) {
                j(i10);
            }
        } else {
            if (this.d <= 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                int i12 = this.d;
                ArrayList arrayList = this.c;
                if (i11 >= i12) {
                    arrayList.clear();
                    this.d = 0;
                    h(null, true);
                    return;
                } else {
                    ((z80) ((Pair) arrayList.get(i11)).first).c();
                    h(((Pair) arrayList.get(i11)).second, false);
                    i11++;
                }
            }
        }
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f) {
            ((c90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            z10 = ((z80) ((Pair) this.c.get(i11)).first).a(canvas) || z10;
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((c90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                z10 = ((z80) ((Pair) arrayList2.get(i11)).first).a(canvas) || z10;
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
        } else if (obj instanceof org.telegram.ui.f3) {
            org.telegram.ui.f3 f3Var = (org.telegram.ui.f3) obj;
            if (!f3Var.c && (view2 = f3Var.b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.a1 a1Var = this.b;
        if (a1Var != null) {
            a1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.d) {
            return;
        }
        Pair pair = (Pair) this.c.get(i10);
        z80 z80Var = (z80) pair.first;
        if (z80Var.p < 0) {
            z80Var.p = Math.max(z80Var.o + z80Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new u80(this, z80Var, 1), Math.max(0L, (z80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void k(z80 z80Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (z80Var == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = this.d;
            arrayList = this.c;
            if (i10 >= i11) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i10)).first == z80Var) {
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
            z80Var.c();
            this.d = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (z80Var.p < 0) {
            z80Var.p = Math.max(z80Var.o + z80Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new u80(this, z80Var, 0), Math.max(0L, (z80Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void l(c90 c90Var, boolean z10) {
        if (c90Var == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (((Pair) this.e.get(i10)).first == c90Var) {
                m(i10, z10);
                return;
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f) {
            return;
        }
        ArrayList arrayList = this.e;
        Pair pair = (Pair) arrayList.get(i10);
        if (pair == null) {
            return;
        }
        c90 c90Var = (c90) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            c90Var.b = -1L;
            c90Var.c = -1L;
            this.f = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (c90Var.b()) {
            l(c90Var, false);
            return;
        }
        if (!c90Var.c()) {
            c90Var.a();
        }
        AndroidUtilities.runOnUIThread(new gt(23, this, c90Var), c90Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - c90Var.c) : 0L);
    }

    public v80(View view) {
        this.a = view;
    }
}
