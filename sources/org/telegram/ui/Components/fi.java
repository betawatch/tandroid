package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi implements org.telegram.messenger.d20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fi(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.d20
    public final Object a(Object obj) {
        int i7 = this.a;
        char c10 = 1;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                return Boolean.valueOf(ni.O((ni) obj2, (org.telegram.messenger.ij) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                org.telegram.messenger.rz c11 = org.telegram.messenger.t5.c((org.telegram.ui.ActionBar.k6.I.q() ? 3 : 6) * 0.12f, org.telegram.ui.ActionBar.k6.Dc);
                c11.t = true;
                c11.m = org.telegram.ui.ActionBar.k6.ef;
                imageReceiver.s0(org.telegram.messenger.hc.p(org.telegram.messenger.m20.b(fVar.b.geo, org.telegram.messenger.qs.X4, org.telegram.messenger.qs.y2, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), null, null, null, new np(c11), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.l8(imageReceiver, c10 == true ? 1 : 0));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new oc(4, imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                q41 q41Var = (q41) obj2;
                View view2 = (View) obj;
                q41Var.getClass();
                return view2.getParent() != q41Var ? Boolean.FALSE : Boolean.valueOf(!l41.K(q41Var.T(view2).f));
        }
    }
}
