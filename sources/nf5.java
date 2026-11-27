// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nf5 extends n9c {
    public boolean e;

    @Override // n9c
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        mla mlaVar = (mla) phd.j.a();
        lla llaVar = (lla) phd.k.a();
        arrayList.add(b8c.u(ob6.M0(2131749094, null)));
        b8c x = b8c.x(11, ob6.M0(2131749093, null));
        x.L(mlaVar == mla.b);
        arrayList.add(x);
        b8c x2 = b8c.x(10, ob6.M0(2131749092, null));
        x2.L(mlaVar == mla.a);
        arrayList.add(x2);
        arrayList.add(b8c.C(ob6.M0(2131749091, null)));
        arrayList.add(b8c.u(ob6.M0(2131749087, null)));
        b8c x3 = b8c.x(20, ob6.M0(2131749086, null));
        x3.L(llaVar == lla.a);
        arrayList.add(x3);
        b8c x4 = b8c.x(21, ob6.M0(2131749085, null));
        x4.L(llaVar == lla.b);
        arrayList.add(x4);
        arrayList.add(b8c.C(null));
        arrayList.add(b8c.u(ob6.M0(2131749090, null)));
        b8c i = b8c.i(30, ob6.M0(2131749089, null));
        i.L(this.e);
        arrayList.add(i);
        arrayList.add(b8c.C(ob6.M0(2131749088, null)));
    }

    @Override // n9c
    public final CharSequence Z() {
        return ob6.M0(2131749084, null);
    }

    @Override // n9c
    public final void a0(b8c b8cVar, View view) {
        int i = b8cVar.d;
        if (i == 10 || i == 11) {
            phd.j.b(i == 10 ? mla.a : mla.b);
            c0();
        } else if (i == 20 || i == 21) {
            phd.k.b(i == 21 ? lla.b : lla.a);
            c0();
        } else {
            if (i != 30) {
                return;
            }
            this.e = !this.e;
            this.simpleActionBar.getDoneButton().a(this.e, true);
        }
        this.a.g3.O(true);
    }

    @Override // n9c
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    public final void c0() {
        jla jlaVar = this.simpleActionBar;
        nla nlaVar = jlaVar.n;
        if (nlaVar != null) {
            jlaVar.removeView(nlaVar);
            jlaVar.n = null;
            jlaVar.l();
            jlaVar.requestLayout();
        }
        this.simpleActionBar.u(ob6.M0(2131745674, null)).a(this.e, false);
    }

    @Override // n9c, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        c0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
