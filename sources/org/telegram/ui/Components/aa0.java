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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class aa0 {
    public View a;
    public org.telegram.ui.Cells.c1 b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f = 0;

    public aa0() {
    }

    public static ha0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        x90 x90Var = new x90(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        x90Var.d(layout, spanStart, f7);
        layout.getSelectionPath(spanStart, spanEnd, x90Var);
        ha0 ha0Var = new ha0();
        ha0Var.y = x90Var;
        ha0Var.D = true;
        ha0Var.k(4.0f);
        ha0Var.l();
        return ha0Var;
    }

    public final void a(ea0 ea0Var, Object obj) {
        this.c.add(new Pair(ea0Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(ha0 ha0Var, Object obj) {
        this.e.add(new Pair(ha0Var, obj));
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
                    ((ea0) ((Pair) arrayList.get(i11)).first).c();
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
            ((ha0) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            z10 = ((ea0) ((Pair) this.c.get(i11)).first).a(canvas) || z10;
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((ha0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                z10 = ((ea0) ((Pair) arrayList2.get(i11)).first).a(canvas) || z10;
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
        } else if (obj instanceof org.telegram.ui.d3) {
            org.telegram.ui.d3 d3Var = (org.telegram.ui.d3) obj;
            if (!d3Var.c && (view2 = d3Var.b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.c1 c1Var = this.b;
        if (c1Var != null) {
            c1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.d) {
            return;
        }
        Pair pair = (Pair) this.c.get(i10);
        ea0 ea0Var = (ea0) pair.first;
        if (ea0Var.p < 0) {
            ea0Var.p = Math.max(ea0Var.o + ea0Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new z90(this, ea0Var, 1), Math.max(0L, (ea0Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void k(ea0 ea0Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (ea0Var == null) {
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
                if (((Pair) arrayList.get(i10)).first == ea0Var) {
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
            ea0Var.c();
            this.d = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (ea0Var.p < 0) {
            ea0Var.p = Math.max(ea0Var.o + ea0Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new z90(this, ea0Var, 0), Math.max(0L, (ea0Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void l(ha0 ha0Var, boolean z10) {
        if (ha0Var == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (((Pair) this.e.get(i10)).first == ha0Var) {
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
        ha0 ha0Var = (ha0) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            ha0Var.b = -1L;
            ha0Var.c = -1L;
            this.f = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (ha0Var.c()) {
            l(ha0Var, false);
            return;
        }
        if (!ha0Var.d()) {
            ha0Var.a();
        }
        AndroidUtilities.runOnUIThread(new f60(7, this, ha0Var), ha0Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - ha0Var.c) : 0L);
    }

    public aa0(View view) {
        this.a = view;
    }
}
