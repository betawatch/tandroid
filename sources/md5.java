// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class md5 extends n5c {
    public boolean e;

    @Override // n5c
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        rha rhaVar = (rha) wcd.j.a();
        qha qhaVar = (qha) wcd.k.a();
        arrayList.add(c4c.u(k96.M0(2131749148, null)));
        c4c x = c4c.x(11, k96.M0(2131749147, null));
        x.L(rhaVar == rha.b);
        arrayList.add(x);
        c4c x2 = c4c.x(10, k96.M0(2131749146, null));
        x2.L(rhaVar == rha.a);
        arrayList.add(x2);
        arrayList.add(c4c.C(k96.M0(2131749145, null)));
        arrayList.add(c4c.u(k96.M0(2131749141, null)));
        c4c x3 = c4c.x(20, k96.M0(2131749140, null));
        x3.L(qhaVar == qha.a);
        arrayList.add(x3);
        c4c x4 = c4c.x(21, k96.M0(2131749139, null));
        x4.L(qhaVar == qha.b);
        arrayList.add(x4);
        arrayList.add(c4c.C(null));
        arrayList.add(c4c.u(k96.M0(2131749144, null)));
        c4c i = c4c.i(30, k96.M0(2131749143, null));
        i.L(this.e);
        arrayList.add(i);
        arrayList.add(c4c.C(k96.M0(2131749142, null)));
    }

    @Override // n5c
    public final CharSequence Z() {
        return k96.M0(2131749138, null);
    }

    @Override // n5c
    public final void a0(c4c c4cVar, View view) {
        int i = c4cVar.d;
        if (i == 10 || i == 11) {
            wcd.j.b(i == 10 ? rha.a : rha.b);
            c0();
        } else if (i == 20 || i == 21) {
            wcd.k.b(i == 21 ? qha.b : qha.a);
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

    @Override // n5c
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    public final void c0() {
        pha phaVar = this.simpleActionBar;
        sha shaVar = phaVar.n;
        if (shaVar != null) {
            phaVar.removeView(shaVar);
            phaVar.n = null;
            phaVar.k();
            phaVar.requestLayout();
        }
        this.simpleActionBar.s(k96.M0(2131745754, null)).a(this.e, false);
    }

    @Override // n5c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        c0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
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
