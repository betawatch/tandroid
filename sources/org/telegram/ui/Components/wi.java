package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wi(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.y10
    public final Object a(Object obj) {
        int i7 = this.a;
        char c10 = 1;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                return Boolean.valueOf(ej.P((ej) obj2, (org.telegram.messenger.fj) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                org.telegram.messenger.lz c11 = org.telegram.messenger.u5.c((org.telegram.ui.ActionBar.m6.I.q() ? 3 : 6) * 0.12f, org.telegram.ui.ActionBar.m6.Gc);
                c11.t = true;
                c11.m = org.telegram.ui.ActionBar.m6.hf;
                imageReceiver.s0(org.telegram.messenger.fc.p(org.telegram.messenger.h20.b(fVar.b.geo, org.telegram.messenger.ks.X4, org.telegram.messenger.ks.y2, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), null, null, null, new eq(c11), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.m8(imageReceiver, c10 == true ? 1 : 0));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new sc(4, imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                h51 h51Var = (h51) obj2;
                View view2 = (View) obj;
                h51Var.getClass();
                return view2.getParent() != h51Var ? Boolean.FALSE : Boolean.valueOf(!c51.K(h51Var.T(view2).f));
        }
    }
}
