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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class v31 extends org.telegram.ui.ActionBar.w2 {
    public final int m1;
    public final GradientDrawable n1;
    public final j41 o1;
    public int p1;

    public v31(Context context, org.telegram.ui.ActionBar.g2 g2Var, j41 j41Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        this.m1 = org.telegram.messenger.g0.L(12.0f);
        this.n1 = new GradientDrawable();
        u31 u31Var = new u31(this, context);
        u31Var.addView(j41Var, c8.na.c(-1.0f, -1));
        this.b = u31Var;
        this.o1 = j41Var;
        j41Var.setParentFragment(g2Var);
        j41Var.setOnScrollListener(new s31(this));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h5));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        j41 j41Var = this.o1;
        Objects.requireNonNull(j41Var);
        w6 w6Var = new w6(j41Var, 7);
        y31 y31Var = j41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.w6(y31Var.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(y31Var.b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q5));
        i41 i41Var = j41Var.s;
        z31 z31Var = j41Var.n;
        i41Var.getClass();
        org.telegram.ui.Cells.v3.a(arrayList, w6Var);
        arrayList.add(new org.telegram.ui.ActionBar.w6(z31Var, 4, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.Hi));
        jg.c2 c2Var = j41Var.w;
        c2Var.getClass();
        org.telegram.ui.Cells.v3.a(arrayList, w6Var);
        int i7 = org.telegram.ui.ActionBar.n6.Lf;
        arrayList.add(new org.telegram.ui.ActionBar.w6(z31Var, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(z31Var, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(z31Var, 8, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i7));
        ImageView imageView = c2Var.M;
        int i10 = org.telegram.ui.ActionBar.n6.Df;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(c2Var.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(j41Var.f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(j41Var.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public void dismiss() {
        super.dismiss();
        j41 j41Var = this.o1;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(j41Var.a);
        f10.n(j41Var, org.telegram.messenger.ks.x0);
        f10.n(j41Var, org.telegram.messenger.ks.z0);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 2);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, 2);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void u0(boolean z10) {
        this.r0 = true;
    }
}
