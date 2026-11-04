package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ di(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.v10
    public final Object a(Object obj) {
        int i3 = this.a;
        char c2 = 1;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                return Boolean.valueOf(ni.O((ni) obj2, (org.telegram.messenger.zi) obj));
            case 1:
                uh.f fVar = (uh.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                org.telegram.messenger.jz c10 = org.telegram.messenger.t5.c((org.telegram.ui.ActionBar.k6.I.q() ? 3 : 6) * 0.12f, org.telegram.ui.ActionBar.k6.Dc);
                c10.t = true;
                c10.m = org.telegram.ui.ActionBar.k6.ef;
                imageReceiver.s0(org.telegram.messenger.ac.p(org.telegram.messenger.e20.b(fVar.b.geo, org.telegram.messenger.hs.X4, org.telegram.messenger.hs.y2, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), null, null, null, new np(c10), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.k8(imageReceiver, c2 == true ? 1 : 0));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new mc(4, imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                l41 l41Var = (l41) obj2;
                View view2 = (View) obj;
                l41Var.getClass();
                return view2.getParent() != l41Var ? Boolean.FALSE : Boolean.valueOf(!f41.K(l41Var.T(view2).f));
        }
    }
}
