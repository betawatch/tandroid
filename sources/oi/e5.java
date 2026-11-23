package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import c8.na;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e5 extends y implements org.telegram.ui.ActionBar.c6, h9 {
    public final i6 n;
    public final f1 r;
    public c5 s;
    public final ArrayList w;
    public boolean x;

    public e5(Context context, i6 i6Var) {
        super(context);
        this.w = new ArrayList();
        this.n = i6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f1 f1Var = new f1(context, i6Var);
        this.r = f1Var;
        f1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        f1Var.setAllowNewlines(false);
        f1Var.setInputType(147457);
        f1Var.setGravity(8388659);
        f1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        f1Var.setTextColorKey(n6.Fi);
        f1Var.setAccentHint(true);
        f1Var.setHint(gd.N0(2131754017, null));
        f1Var.setListener(new h6.o(this, 21));
        f1Var.setDelegate(new kg.f1(this, 27));
        addView(f1Var, na.e(-1, -2, 51));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Fi));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c5 c5Var = this.s;
        i9 textSelectionHelper = c5Var != null ? ((a3) c5Var).a.getTextSelectionHelper() : null;
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
        t3 t3Var = ((a3) c5Var).a;
        if (f10 == null || (f10 instanceof TL_iv.textEmpty)) {
            t3Var.u3.remove(Long.valueOf(j3));
        } else {
            t3Var.u3.put(Long.valueOf(j3), f10);
        }
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        f1 f1Var = this.r;
        Layout layout = f1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new b5(layout, f1Var.getPaddingLeft() + f1Var.getLeft(), f1Var.getPaddingTop() + f1Var.getTop(), 0));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        f1 f1Var = this.r;
        f1Var.updateColors();
        int i7 = n6.Fi;
        i6 i6Var = this.n;
        f1Var.setTextColor(n6.w0(i7, i6Var));
        f1Var.setHintTextColor(n6.r1(0.5f, n6.w0(i7, i6Var)));
    }
}
