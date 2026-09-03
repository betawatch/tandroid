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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c90 {
    public View a;
    public org.telegram.ui.Cells.a1 b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f = 0;

    public c90() {
    }

    public static j90 i(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        y80 y80Var = new y80(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        y80Var.d(layout, spanStart, f10);
        layout.getSelectionPath(spanStart, spanEnd, y80Var);
        j90 j90Var = new j90();
        j90Var.x = y80Var;
        j90Var.C = true;
        j90Var.j(4.0f);
        j90Var.k();
        return j90Var;
    }

    public final void a(g90 g90Var, Object obj) {
        this.c.add(new Pair(g90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(j90 j90Var, Object obj) {
        this.e.add(new Pair(j90Var, obj));
        this.f++;
        h(obj, true);
    }

    public final void c() {
        d(true);
    }

    public final void d(boolean z4) {
        if (z4) {
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
                    ((g90) ((Pair) arrayList.get(i11)).first).c();
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
        boolean z4 = false;
        while (i10 < this.f) {
            ((j90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z4 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            z4 = ((g90) ((Pair) this.c.get(i11)).first).a(canvas) || z4;
        }
        return z4;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z4 = false;
        for (int i10 = 0; i10 < this.f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((j90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z4 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                z4 = ((g90) ((Pair) arrayList2.get(i11)).first).a(canvas) || z4;
            }
        }
        h(obj, false);
        return z4;
    }

    public final void h(Object obj, boolean z4) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof org.telegram.ui.f3) {
            org.telegram.ui.f3 f3Var = (org.telegram.ui.f3) obj;
            if (!f3Var.c && (view2 = f3Var.b) != null) {
                view2.invalidate();
            }
        } else if (z4 && (view = this.a) != null) {
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
        g90 g90Var = (g90) pair.first;
        if (g90Var.p < 0) {
            g90Var.p = Math.max(g90Var.o + g90Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new b90(this, g90Var, 1), Math.max(0L, (g90Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void k(g90 g90Var, boolean z4) {
        ArrayList arrayList;
        Pair pair;
        if (g90Var == null) {
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
                if (((Pair) arrayList.get(i10)).first == g90Var) {
                    pair = (Pair) arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (pair == null) {
            return;
        }
        if (!z4) {
            arrayList.remove(pair);
            g90Var.c();
            this.d = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (g90Var.p < 0) {
            g90Var.p = Math.max(g90Var.o + g90Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new b90(this, g90Var, 0), Math.max(0L, (g90Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void l(j90 j90Var, boolean z4) {
        if (j90Var == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (((Pair) this.e.get(i10)).first == j90Var) {
                m(i10, z4);
                return;
            }
        }
    }

    public final void m(int i10, boolean z4) {
        if (i10 < 0 || i10 >= this.f) {
            return;
        }
        ArrayList arrayList = this.e;
        Pair pair = (Pair) arrayList.get(i10);
        if (pair == null) {
            return;
        }
        j90 j90Var = (j90) pair.first;
        if (!z4) {
            arrayList.remove(pair);
            j90Var.b = -1L;
            j90Var.c = -1L;
            this.f = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (j90Var.b()) {
            l(j90Var, false);
            return;
        }
        if (!j90Var.c()) {
            j90Var.a();
        }
        AndroidUtilities.runOnUIThread(new z80(1, this, j90Var), j90Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - j90Var.c) : 0L);
    }

    public c90(View view) {
        this.a = view;
    }
}
