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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class k90 {
    public View a;
    public org.telegram.ui.Cells.b1 b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f = 0;

    public k90() {
    }

    public static r90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        h90 h90Var = new h90(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        h90Var.d(layout, spanStart, f7);
        layout.getSelectionPath(spanStart, spanEnd, h90Var);
        r90 r90Var = new r90();
        r90Var.x = h90Var;
        r90Var.C = true;
        r90Var.j(4.0f);
        r90Var.k();
        return r90Var;
    }

    public final void a(o90 o90Var, Object obj) {
        this.c.add(new Pair(o90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(r90 r90Var, Object obj) {
        this.e.add(new Pair(r90Var, obj));
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
                    ((o90) ((Pair) arrayList.get(i11)).first).c();
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
            ((r90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            z10 = ((o90) ((Pair) this.c.get(i11)).first).a(canvas) || z10;
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((r90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                z10 = ((o90) ((Pair) arrayList2.get(i11)).first).a(canvas) || z10;
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
        } else if (obj instanceof org.telegram.ui.b3) {
            org.telegram.ui.b3 b3Var = (org.telegram.ui.b3) obj;
            if (!b3Var.c && (view2 = b3Var.b) != null) {
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
        o90 o90Var = (o90) pair.first;
        if (o90Var.p < 0) {
            o90Var.p = Math.max(o90Var.o + o90Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new j90(this, o90Var, 1), Math.max(0L, (o90Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void k(o90 o90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (o90Var == null) {
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
                if (((Pair) arrayList.get(i10)).first == o90Var) {
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
            o90Var.c();
            this.d = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (o90Var.p < 0) {
            o90Var.p = Math.max(o90Var.o + o90Var.q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new j90(this, o90Var, 0), Math.max(0L, (o90Var.p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void l(r90 r90Var, boolean z10) {
        if (r90Var == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (((Pair) this.e.get(i10)).first == r90Var) {
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
        r90 r90Var = (r90) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            r90Var.b = -1L;
            r90Var.c = -1L;
            this.f = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (r90Var.b()) {
            l(r90Var, false);
            return;
        }
        if (!r90Var.c()) {
            r90Var.a();
        }
        AndroidUtilities.runOnUIThread(new vw(19, this, r90Var), r90Var.c > 0 ? 320 - (SystemClock.elapsedRealtime() - r90Var.c) : 0L);
    }

    public k90(View view) {
        this.a = view;
    }
}
