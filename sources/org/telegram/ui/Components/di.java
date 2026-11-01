package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di implements org.telegram.messenger.s20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ di(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.s20
    public final Object a(Object obj) {
        int i10 = this.a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(mi.N((mi) obj2, (org.telegram.messenger.kj) obj));
            case 1:
                jh.h hVar = (jh.h) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                org.telegram.messenger.d00 c10 = org.telegram.messenger.v5.c((org.telegram.ui.ActionBar.t6.I.q() ? 3 : 6) * 0.12f, org.telegram.ui.ActionBar.t6.Dc);
                c10.t = true;
                c10.m = org.telegram.ui.ActionBar.t6.ef;
                imageReceiver.s0(org.telegram.messenger.jc.p(org.telegram.messenger.c30.b(hVar.b.geo, org.telegram.messenger.at.X4, org.telegram.messenger.at.y2, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.i0.p)))), null, null, null, new up(c10), null, 0);
                view.addOnAttachStateChangeListener(new jh.f(imageReceiver, objArr2 == true ? 1 : 0));
                imageReceiver.J0(org.telegram.messenger.i0.L(14.0f));
                return new jh.g(objArr == true ? 1 : 0, imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i11 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i11 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i11 == 1);
            default:
                v51 v51Var = (v51) obj2;
                View view2 = (View) obj;
                v51Var.getClass();
                return view2.getParent() != v51Var ? Boolean.FALSE : Boolean.valueOf(!q51.K(v51Var.T(view2).f));
        }
    }
}
