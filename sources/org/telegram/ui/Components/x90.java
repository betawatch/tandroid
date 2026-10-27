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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x90 {
    public View a;
    public org.telegram.ui.Cells.a1 b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f = 0;

    public x90() {
    }

    public static ea0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        t90 t90Var = new t90(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        t90Var.d(layout, spanStart, f7);
        layout.getSelectionPath(spanStart, spanEnd, t90Var);
        ea0 ea0Var = new ea0();
        ea0Var.y = t90Var;
        ea0Var.D = true;
        ea0Var.k(4.0f);
        ea0Var.l();
        return ea0Var;
    }

    public final void a(ba0 ba0Var, Object obj) {
        this.c.add(new Pair(ba0Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(ea0 ea0Var, Object obj) {
        this.e.add(new Pair(ea0Var, obj));
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
                    ((ba0) ((Pair) arrayList.get(i11)).first).c();
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
            ((ea0) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            z10 = ((ba0) ((Pair) this.c.get(i11)).first).a(canvas) || z10;
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((ea0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                z10 = ((ba0) ((Pair) arrayList2.get(i11)).first).a(canvas) || z10;
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
        } else if (obj instanceof org.telegram.ui.a3) {
            org.telegram.ui.a3 a3Var = (org.telegram.ui.a3) obj;
            if (!a3Var.c && (view2 = a3Var.b) != null) {
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
        ba0 ba0Var = (ba0) pair.first;
        if (ba0Var.p < 0) {
            ba0Var.p = Math.max(ba0Var.o + ba0Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new w90(this, ba0Var, 1), Math.max(0L, (ba0Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void k(ba0 ba0Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (ba0Var == null) {
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
                if (((Pair) arrayList.get(i10)).first == ba0Var) {
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
            ba0Var.c();
            this.d = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (ba0Var.p < 0) {
            ba0Var.p = Math.max(ba0Var.o + ba0Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new w90(this, ba0Var, 0), Math.max(0L, (ba0Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void l(ea0 ea0Var, boolean z10) {
        if (ea0Var == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (((Pair) this.e.get(i10)).first == ea0Var) {
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
        ea0 ea0Var = (ea0) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            ea0Var.b = -1L;
            ea0Var.c = -1L;
            this.f = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (ea0Var.c()) {
            l(ea0Var, false);
            return;
        }
        if (!ea0Var.d()) {
            ea0Var.a();
        }
        AndroidUtilities.runOnUIThread(new u90(1, this, ea0Var), ea0Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - ea0Var.c) : 0L);
    }

    public x90(View view) {
        this.a = view;
    }
}
