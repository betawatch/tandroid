package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.u9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class r5 extends c0 implements org.telegram.ui.ActionBar.k6, j9 {
    public final org.telegram.ui.ActionBar.p6 n;
    public final n1 r;
    public p5 s;
    public final ArrayList w;
    public boolean x;

    public r5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.w = new ArrayList();
        this.n = p6Var;
        f(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        n1 n1Var = new n1(context, p6Var);
        this.r = n1Var;
        n1Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f));
        n1Var.setAllowNewlines(false);
        n1Var.setInputType(147457);
        n1Var.setGravity(8388659);
        n1Var.setTextSize(1, Math.max(8, tz.W0 - 2));
        n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        n1Var.setTextColorKey(org.telegram.ui.ActionBar.t6.Ci);
        n1Var.setAccentHint(true);
        n1Var.setHint(cd.L0(2131754020, null));
        n1Var.setListener(new a4.l(this, 8));
        n1Var.setDelegate(new a1.c(this, 13));
        addView(n1Var, w7.b6.e(-1, -2, 51));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p5 p5Var = this.s;
        k9 textSelectionHelper = p5Var != null ? ((j3) p5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            h(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                u9 u9Var = (u9) arrayList.get(i10);
                canvas.save();
                canvas.translate(u9Var.getX(), u9Var.getY());
                textSelectionHelper.Z(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        a aVar;
        p5 p5Var = this.s;
        if (p5Var == null || (aVar = this.a) == null) {
            return;
        }
        long j10 = aVar.t;
        TL_iv.RichText f7 = s6.f(this.r.getText());
        d4 d4Var = ((j3) p5Var).a;
        if (f7 == null || (f7 instanceof TL_iv.textEmpty)) {
            d4Var.t3.remove(Long.valueOf(j10));
        } else {
            d4Var.t3.put(Long.valueOf(j10), f7);
        }
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        n1 n1Var = this.r;
        Layout layout = n1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new o5(layout, n1Var.getPaddingLeft() + n1Var.getLeft(), n1Var.getPaddingTop() + n1Var.getTop(), 0));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        n1 n1Var = this.r;
        n1Var.updateColors();
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.p6 p6Var = this.n;
        n1Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        n1Var.setHintTextColor(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
    }
}
