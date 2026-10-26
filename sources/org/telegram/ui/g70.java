package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g70 extends org.telegram.ui.Components.m71 {
    public boolean e;

    @Override // org.telegram.ui.Components.m71
    public final void V(ArrayList arrayList, org.telegram.ui.Components.j71 j71Var) {
        org.telegram.ui.ActionBar.t5 t5Var = (org.telegram.ui.ActionBar.t5) wi.e.k.a();
        org.telegram.ui.ActionBar.s5 s5Var = (org.telegram.ui.ActionBar.s5) wi.e.l.a();
        ic.a.p(R.string.HeaderDoneButtonColor, arrayList);
        org.telegram.ui.Components.t61 x9 = org.telegram.ui.Components.t61.x(11, LocaleController.getString(R.string.HeaderDoneButtonColorAccent));
        x9.L(t5Var == org.telegram.ui.ActionBar.t5.b);
        arrayList.add(x9);
        org.telegram.ui.Components.t61 x10 = org.telegram.ui.Components.t61.x(10, LocaleController.getString(R.string.HeaderDoneButtonColorGlass));
        x10.L(t5Var == org.telegram.ui.ActionBar.t5.a);
        arrayList.add(x10);
        ic.a.z(R.string.HeaderDoneButtonColorInfo, arrayList);
        ic.a.p(R.string.HeaderDoneButtonShape, arrayList);
        org.telegram.ui.Components.t61 x11 = org.telegram.ui.Components.t61.x(20, LocaleController.getString(R.string.HeaderDoneButtonShapeIcon));
        x11.L(s5Var == org.telegram.ui.ActionBar.s5.a);
        arrayList.add(x11);
        org.telegram.ui.Components.t61 x12 = org.telegram.ui.Components.t61.x(21, LocaleController.getString(R.string.HeaderDoneButtonShapeText));
        x12.L(s5Var == org.telegram.ui.ActionBar.s5.b);
        arrayList.add(x12);
        arrayList.add(org.telegram.ui.Components.t61.C(null));
        ic.a.p(R.string.HeaderDoneButtonPreview, arrayList);
        org.telegram.ui.Components.t61 i10 = org.telegram.ui.Components.t61.i(30, LocaleController.getString(R.string.HeaderDoneButtonPreviewChanges));
        i10.L(this.e);
        arrayList.add(i10);
        ic.a.z(R.string.HeaderDoneButtonPreviewInfo, arrayList);
    }

    @Override // org.telegram.ui.Components.m71
    public final CharSequence W() {
        return LocaleController.getString(R.string.HeaderSettings);
    }

    @Override // org.telegram.ui.Components.m71
    public final void X(org.telegram.ui.Components.t61 t61Var, View view) {
        int i10 = t61Var.d;
        if (i10 == 10 || i10 == 11) {
            wi.e.k.b(i10 == 10 ? org.telegram.ui.ActionBar.t5.a : org.telegram.ui.ActionBar.t5.b);
            Z();
        } else if (i10 == 20 || i10 == 21) {
            wi.e.l.b(i10 == 21 ? org.telegram.ui.ActionBar.s5.b : org.telegram.ui.ActionBar.s5.a);
            Z();
        } else {
            if (i10 != 30) {
                return;
            }
            this.e = !this.e;
            this.simpleActionBar.getDoneButton().a(this.e, true);
        }
        this.a.g3.O(true);
    }

    @Override // org.telegram.ui.Components.m71
    public final boolean Y(org.telegram.ui.Components.t61 t61Var, View view) {
        return false;
    }

    public final void Z() {
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.u5 u5Var = r5Var.n;
        if (u5Var != null) {
            r5Var.removeView(u5Var);
            r5Var.n = null;
            r5Var.c();
            r5Var.requestLayout();
        }
        this.simpleActionBar.i(LocaleController.getString(R.string.Save)).a(this.e, false);
    }

    @Override // org.telegram.ui.Components.m71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.u1();
        this.a.setSectionsDrawBackground(true);
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
