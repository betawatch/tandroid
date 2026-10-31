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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class h41 extends org.telegram.ui.ActionBar.z2 {
    public final int i1;
    public final GradientDrawable j1;
    public final w41 k1;
    public int l1;

    public h41(Context context, org.telegram.ui.ActionBar.k2 k2Var, w41 w41Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, true);
        this.i1 = org.telegram.messenger.i0.L(12.0f);
        this.j1 = new GradientDrawable();
        g41 g41Var = new g41(this, context);
        g41Var.addView(w41Var, w7.b6.c(-1.0f, -1));
        this.b = g41Var;
        this.k1 = w41Var;
        w41Var.setParentFragment(k2Var);
        w41Var.setOnScrollListener(new e41(this));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h5));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        w41 w41Var = this.k1;
        Objects.requireNonNull(w41Var);
        o6 o6Var = new o6(w41Var, 7);
        k41 k41Var = w41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.c7(k41Var.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(k41Var.b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q5));
        v41 v41Var = w41Var.s;
        l41 l41Var = w41Var.n;
        v41Var.getClass();
        org.telegram.ui.Cells.w3.a(arrayList, o6Var);
        arrayList.add(new org.telegram.ui.ActionBar.c7(l41Var, 4, new Class[]{org.telegram.ui.Cells.t3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.Ei));
        zf.o1 o1Var = w41Var.w;
        o1Var.getClass();
        org.telegram.ui.Cells.w3.a(arrayList, o6Var);
        int i10 = org.telegram.ui.ActionBar.t6.If;
        arrayList.add(new org.telegram.ui.ActionBar.c7(l41Var, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(l41Var, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(l41Var, 8, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kf));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.Jf));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i10));
        ImageView imageView = o1Var.L;
        int i11 = org.telegram.ui.ActionBar.t6.Af;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(o1Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w41Var.f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w41Var.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public void dismiss() {
        super.dismiss();
        w41 w41Var = this.k1;
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(w41Var.a);
        f7.n(w41Var, org.telegram.messenger.zs.x0);
        f7.n(w41Var, org.telegram.messenger.zs.z0);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 2);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 2);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void u0(boolean z10) {
        this.q0 = true;
    }
}
