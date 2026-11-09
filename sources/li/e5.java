package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class e5 extends y implements org.telegram.ui.ActionBar.b6, h9 {
    public final g6 n;
    public final g1 r;
    public c5 s;
    public final ArrayList w;
    public boolean x;

    public e5(Context context, g6 g6Var) {
        super(context);
        this.w = new ArrayList();
        this.n = g6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g1 g1Var = new g1(context, g6Var);
        this.r = g1Var;
        g1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(8388659);
        g1Var.setTextSize(1, Math.max(8, iz.W0 - 2));
        g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        g1Var.setTextColorKey(l6.Ci);
        g1Var.setAccentHint(true);
        g1Var.setHint(id.M0(2131754020, null));
        g1Var.setListener(new h9.f1(this, 11));
        g1Var.setDelegate(new l2.x(this, 10));
        addView(g1Var, ha.e(-1, -2, 51));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.Ci));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c5 c5Var = this.s;
        i9 textSelectionHelper = c5Var != null ? ((z2) c5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            k(arrayList);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                t9 t9Var = (t9) arrayList.get(i7);
                canvas.save();
                canvas.translate(t9Var.getX(), t9Var.getY());
                textSelectionHelper.Z(canvas, this, i7);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        a aVar;
        c5 c5Var = this.s;
        if (c5Var == null || (aVar = this.a) == null) {
            return;
        }
        long j3 = aVar.t;
        TL_iv.RichText f10 = c6.f(this.r.getText());
        t3 t3Var = ((z2) c5Var).a;
        if (f10 == null || (f10 instanceof TL_iv.textEmpty)) {
            t3Var.t3.remove(Long.valueOf(j3));
        } else {
            t3Var.t3.put(Long.valueOf(j3), f10);
        }
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        g1 g1Var = this.r;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new b5(layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop(), 0));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        g1 g1Var = this.r;
        g1Var.updateColors();
        int i7 = l6.Ci;
        g6 g6Var = this.n;
        g1Var.setTextColor(l6.w0(i7, g6Var));
        g1Var.setHintTextColor(l6.r1(0.5f, l6.w0(i7, g6Var)));
    }
}
