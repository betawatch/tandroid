package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class y21 extends org.telegram.ui.ActionBar.v2 {
    public final int i1;
    public final GradientDrawable j1;
    public final n31 k1;
    public int l1;

    public y21(Context context, org.telegram.ui.ActionBar.f2 f2Var, n31 n31Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.i1 = org.telegram.messenger.g0.L(12.0f);
        this.j1 = new GradientDrawable();
        x21 x21Var = new x21(this, context);
        x21Var.addView(n31Var, c8.ha.c(-1.0f, -1));
        this.b = x21Var;
        this.k1 = n31Var;
        n31Var.setParentFragment(f2Var);
        n31Var.setOnScrollListener(new v21(this));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h5));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        n31 n31Var = this.k1;
        Objects.requireNonNull(n31Var);
        s6 s6Var = new s6(n31Var, 7);
        b31 b31Var = n31Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.t6(b31Var.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(b31Var.b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q5));
        m31 m31Var = n31Var.s;
        c31 c31Var = n31Var.n;
        m31Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, s6Var);
        arrayList.add(new org.telegram.ui.ActionBar.t6(c31Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Ei));
        jg.d2 d2Var = n31Var.w;
        d2Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, s6Var);
        int i7 = org.telegram.ui.ActionBar.k6.If;
        arrayList.add(new org.telegram.ui.ActionBar.t6(c31Var, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(c31Var, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(c31Var, 8, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Jf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i7));
        ImageView imageView = d2Var.L;
        int i10 = org.telegram.ui.ActionBar.k6.Af;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(d2Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(n31Var.f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(n31Var.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public void dismiss() {
        super.dismiss();
        n31 n31Var = this.k1;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(n31Var.a);
        f10.n(n31Var, org.telegram.messenger.qs.x0);
        f10.n(n31Var, org.telegram.messenger.qs.z0);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 2);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 2);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void u0(boolean z9) {
        this.q0 = true;
    }
}
