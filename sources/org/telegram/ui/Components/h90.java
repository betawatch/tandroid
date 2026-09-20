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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h90 {
    public View a;
    public org.telegram.ui.Cells.b1 b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f = 0;

    public h90() {
    }

    public static o90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        e90 e90Var = new e90(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        e90Var.d(layout, spanStart, f7);
        layout.getSelectionPath(spanStart, spanEnd, e90Var);
        o90 o90Var = new o90();
        o90Var.x = e90Var;
        o90Var.C = true;
        o90Var.j(4.0f);
        o90Var.k();
        return o90Var;
    }

    public final void a(l90 l90Var, Object obj) {
        this.c.add(new Pair(l90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(o90 o90Var, Object obj) {
        this.e.add(new Pair(o90Var, obj));
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
                    ((l90) ((Pair) arrayList.get(i11)).first).c();
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
            ((o90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            z10 = ((l90) ((Pair) this.c.get(i11)).first).a(canvas) || z10;
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((o90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                z10 = ((l90) ((Pair) arrayList2.get(i11)).first).a(canvas) || z10;
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
        org.telegram.ui.Cells.b1 b1Var = this.b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.d) {
            return;
        }
        Pair pair = (Pair) this.c.get(i10);
        l90 l90Var = (l90) pair.first;
        if (l90Var.p < 0) {
            l90Var.p = Math.max(l90Var.o + l90Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new g90(this, l90Var, 1), Math.max(0L, (l90Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void k(l90 l90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (l90Var == null) {
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
                if (((Pair) arrayList.get(i10)).first == l90Var) {
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
            l90Var.c();
            this.d = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (l90Var.p < 0) {
            l90Var.p = Math.max(l90Var.o + l90Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new g90(this, l90Var, 0), Math.max(0L, (l90Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void l(o90 o90Var, boolean z10) {
        if (o90Var == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (((Pair) this.e.get(i10)).first == o90Var) {
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
        o90 o90Var = (o90) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            o90Var.b = -1L;
            o90Var.c = -1L;
            this.f = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (o90Var.b()) {
            l(o90Var, false);
            return;
        }
        if (!o90Var.c()) {
            o90Var.a();
        }
        AndroidUtilities.runOnUIThread(new bv(20, this, o90Var), o90Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - o90Var.c) : 0L);
    }

    public h90(View view) {
        this.a = view;
    }
}
