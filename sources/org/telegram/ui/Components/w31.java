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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class w31 extends org.telegram.ui.ActionBar.w2 {
    public final int m1;
    public final GradientDrawable n1;
    public final k41 o1;
    public int p1;

    public w31(Context context, org.telegram.ui.ActionBar.g2 g2Var, k41 k41Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        this.m1 = org.telegram.messenger.g0.L(12.0f);
        this.n1 = new GradientDrawable();
        v31 v31Var = new v31(this, context);
        v31Var.addView(k41Var, c8.ma.c(-1.0f, -1));
        this.b = v31Var;
        this.o1 = k41Var;
        k41Var.setParentFragment(g2Var);
        k41Var.setOnScrollListener(new t31(this));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h5));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        k41 k41Var = this.o1;
        Objects.requireNonNull(k41Var);
        x6 x6Var = new x6(k41Var, 7);
        z31 z31Var = k41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.v6(z31Var.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(z31Var.b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Q5));
        j41 j41Var = k41Var.s;
        a41 a41Var = k41Var.n;
        j41Var.getClass();
        org.telegram.ui.Cells.v3.a(arrayList, x6Var);
        arrayList.add(new org.telegram.ui.ActionBar.v6(a41Var, 4, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.m6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.m6.Hi));
        jg.c2 c2Var = k41Var.w;
        c2Var.getClass();
        org.telegram.ui.Cells.v3.a(arrayList, x6Var);
        int i7 = org.telegram.ui.ActionBar.m6.Lf;
        arrayList.add(new org.telegram.ui.ActionBar.v6(a41Var, 4, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(a41Var, 4, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(a41Var, 8, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.m6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i7));
        ImageView imageView = c2Var.M;
        int i10 = org.telegram.ui.ActionBar.m6.Df;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(c2Var.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(k41Var.f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(k41Var.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public void dismiss() {
        super.dismiss();
        k41 k41Var = this.o1;
        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(k41Var.a);
        f10.n(k41Var, org.telegram.messenger.ls.x0);
        f10.n(k41Var, org.telegram.messenger.ls.z0);
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.k1, 2);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.j1, 2);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void u0(boolean z10) {
        this.r0 = true;
    }
}
