// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kf5 extends n7c {
    public boolean e;

    @Override // n7c
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        tja tjaVar = (tja) yed.j.a();
        sja sjaVar = (sja) yed.k.a();
        arrayList.add(c6c.u(jb6.M0(2131749097, null)));
        c6c x = c6c.x(11, jb6.M0(2131749096, null));
        x.L(tjaVar == tja.b);
        arrayList.add(x);
        c6c x2 = c6c.x(10, jb6.M0(2131749095, null));
        x2.L(tjaVar == tja.a);
        arrayList.add(x2);
        arrayList.add(c6c.C(jb6.M0(2131749094, null)));
        arrayList.add(c6c.u(jb6.M0(2131749090, null)));
        c6c x3 = c6c.x(20, jb6.M0(2131749089, null));
        x3.L(sjaVar == sja.a);
        arrayList.add(x3);
        c6c x4 = c6c.x(21, jb6.M0(2131749088, null));
        x4.L(sjaVar == sja.b);
        arrayList.add(x4);
        arrayList.add(c6c.C(null));
        arrayList.add(c6c.u(jb6.M0(2131749093, null)));
        c6c i = c6c.i(30, jb6.M0(2131749092, null));
        i.L(this.e);
        arrayList.add(i);
        arrayList.add(c6c.C(jb6.M0(2131749091, null)));
    }

    @Override // n7c
    public final CharSequence a0() {
        return jb6.M0(2131749087, null);
    }

    @Override // n7c
    public final void b0(c6c c6cVar, View view) {
        int i = c6cVar.d;
        if (i == 10 || i == 11) {
            yed.j.b(i == 10 ? tja.a : tja.b);
            d0();
        } else if (i == 20 || i == 21) {
            yed.k.b(i == 21 ? sja.b : sja.a);
            d0();
        } else {
            if (i != 30) {
                return;
            }
            this.e = !this.e;
            this.simpleActionBar.getDoneButton().a(this.e, true);
        }
        this.a.g3.O(true);
    }

    @Override // n7c
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override // n7c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        rja rjaVar = this.simpleActionBar;
        uja ujaVar = rjaVar.n;
        if (ujaVar != null) {
            rjaVar.removeView(ujaVar);
            rjaVar.n = null;
            rjaVar.l();
            rjaVar.requestLayout();
        }
        this.simpleActionBar.s(jb6.M0(2131745680, null)).a(this.e, false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
