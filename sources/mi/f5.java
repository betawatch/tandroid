package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class f5 extends y implements org.telegram.ui.ActionBar.z5, g9 {
    public final org.telegram.ui.ActionBar.e6 n;
    public final h1 r;
    public d5 s;
    public final ArrayList w;
    public boolean x;

    public f5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.w = new ArrayList();
        this.n = e6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        h1 h1Var = new h1(context, e6Var);
        this.r = h1Var;
        h1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, az.W0 - 2));
        h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        h1Var.setTextColorKey(k6.Ci);
        h1Var.setAccentHint(true);
        h1Var.setHint(bd.M0(2131754020, null));
        h1Var.setListener(new gi.v5(this, 17));
        h1Var.setDelegate(new l5.b(this, 12));
        addView(h1Var, mf.e(-1, -2, 51));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ci));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d5 d5Var = this.s;
        h9 textSelectionHelper = d5Var != null ? ((a3) d5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            k(arrayList);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                s9 s9Var = (s9) arrayList.get(i3);
                canvas.save();
                canvas.translate(s9Var.getX(), s9Var.getY());
                textSelectionHelper.Z(canvas, this, i3);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        a aVar;
        d5 d5Var = this.s;
        if (d5Var == null || (aVar = this.a) == null) {
            return;
        }
        long j10 = aVar.t;
        TL_iv.RichText f10 = d6.f(this.r.getText());
        t3 t3Var = ((a3) d5Var).a;
        if (f10 == null || (f10 instanceof TL_iv.textEmpty)) {
            t3Var.u3.remove(Long.valueOf(j10));
        } else {
            t3Var.u3.put(Long.valueOf(j10), f10);
        }
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        h1 h1Var = this.r;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new c5(layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop(), 0));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        h1 h1Var = this.r;
        h1Var.updateColors();
        int i3 = k6.Ci;
        org.telegram.ui.ActionBar.e6 e6Var = this.n;
        h1Var.setTextColor(k6.w0(i3, e6Var));
        h1Var.setHintTextColor(k6.r1(0.5f, k6.w0(i3, e6Var)));
    }
}
