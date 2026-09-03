package mh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import org.telegram.ui.vg1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ p a;

    public /* synthetic */ g(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        p pVar = this.a;
        pVar.getClass();
        pVar.presentFragment(new vg1(6, null));
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p.W(this.a, (h51) obj);
    }
}
