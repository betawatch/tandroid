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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class t31 extends org.telegram.ui.ActionBar.x2 {
    public final int m1;
    public final GradientDrawable n1;
    public final h41 o1;
    public int p1;

    public t31(Context context, org.telegram.ui.ActionBar.h2 h2Var, h41 h41Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        this.m1 = org.telegram.messenger.g0.L(12.0f);
        this.n1 = new GradientDrawable();
        s31 s31Var = new s31(this, context);
        s31Var.addView(h41Var, c8.ma.c(-1.0f, -1));
        this.b = s31Var;
        this.o1 = h41Var;
        h41Var.setParentFragment(h2Var);
        h41Var.setOnScrollListener(new q31(this));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h5));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        h41 h41Var = this.o1;
        Objects.requireNonNull(h41Var);
        w6 w6Var = new w6(h41Var, 7);
        w31 w31Var = h41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.w6(w31Var.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(w31Var.b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q5));
        g41 g41Var = h41Var.s;
        x31 x31Var = h41Var.n;
        g41Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, w6Var);
        arrayList.add(new org.telegram.ui.ActionBar.w6(x31Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.Hi));
        jg.c2 c2Var = h41Var.w;
        c2Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, w6Var);
        int i7 = org.telegram.ui.ActionBar.n6.Lf;
        arrayList.add(new org.telegram.ui.ActionBar.w6(x31Var, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(x31Var, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(x31Var, 8, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i7));
        ImageView imageView = c2Var.M;
        int i10 = org.telegram.ui.ActionBar.n6.Df;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(c2Var.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(h41Var.f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(h41Var.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public void dismiss() {
        super.dismiss();
        h41 h41Var = this.o1;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(h41Var.a);
        f10.n(h41Var, org.telegram.messenger.ks.x0);
        f10.n(h41Var, org.telegram.messenger.ks.z0);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 2);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, 2);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void u0(boolean z10) {
        this.r0 = true;
    }
}
