package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.x10
    public final Object a(Object obj) {
        int i7 = this.a;
        char c10 = 1;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                return Boolean.valueOf(dj.P((dj) obj2, (org.telegram.messenger.fj) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                org.telegram.messenger.kz c11 = org.telegram.messenger.u5.c((org.telegram.ui.ActionBar.n6.I.q() ? 3 : 6) * 0.12f, org.telegram.ui.ActionBar.n6.Gc);
                c11.t = true;
                c11.m = org.telegram.ui.ActionBar.n6.hf;
                imageReceiver.t0(org.telegram.messenger.fc.p(org.telegram.messenger.g20.b(fVar.b.geo, org.telegram.messenger.ks.X4, org.telegram.messenger.ks.y2, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), null, null, null, new bq(c11), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.l8(imageReceiver, c10 == true ? 1 : 0));
                imageReceiver.K0(org.telegram.messenger.g0.L(14.0f));
                return new sc(4, imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                g51 g51Var = (g51) obj2;
                View view2 = (View) obj;
                g51Var.getClass();
                return view2.getParent() != g51Var ? Boolean.FALSE : Boolean.valueOf(!b51.K(g51Var.T(view2).f));
        }
    }
}
