package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei implements org.telegram.messenger.d20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ei(Object obj, int i7) {
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
                return Boolean.valueOf(mi.O((mi) obj2, (org.telegram.messenger.ij) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                org.telegram.messenger.rz c11 = org.telegram.messenger.t5.c((org.telegram.ui.ActionBar.m6.I.q() ? 3 : 6) * 0.12f, org.telegram.ui.ActionBar.m6.Dc);
                c11.t = true;
                c11.m = org.telegram.ui.ActionBar.m6.ef;
                imageReceiver.s0(org.telegram.messenger.hc.p(org.telegram.messenger.m20.b(fVar.b.geo, org.telegram.messenger.qs.X4, org.telegram.messenger.qs.y2, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), null, null, null, new np(c11), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.l8(imageReceiver, c10 == true ? 1 : 0));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new nc(4, imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                r41 r41Var = (r41) obj2;
                View view2 = (View) obj;
                r41Var.getClass();
                return view2.getParent() != r41Var ? Boolean.FALSE : Boolean.valueOf(!m41.K(r41Var.T(view2).f));
        }
    }
}
