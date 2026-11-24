// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lg9 {
    public final /* synthetic */ ch9 a;

    public lg9(ch9 ch9Var) {
        this.a = ch9Var;
    }

    public final void a(ll0 ll0Var) {
        ch9 ch9Var = this.a;
        ArrayList arrayList = ch9Var.t3;
        int indexOf = arrayList.indexOf(ll0Var);
        if (indexOf < 0 || !ch9.t3(ll0Var)) {
            return;
        }
        int M3 = ch9Var.M3(indexOf);
        if (M3 >= arrayList.size()) {
            M3 = arrayList.size() - 1;
        }
        of9 of9Var = ch9Var.R3;
        if (of9Var != null) {
            of9Var.d();
        }
        while (M3 >= indexOf) {
            arrayList.remove(M3);
            M3--;
        }
        ll0 ll0Var2 = null;
        ll0 ll0Var3 = indexOf > 0 ? (ll0) arrayList.get(indexOf - 1) : null;
        if (ll0Var3 != null && !ll0Var3.i && !ch9.t3(ll0Var3) && !ch9.A3(ll0Var3.b)) {
            ll0Var2 = ll0Var3;
        }
        if (arrayList.isEmpty()) {
            ll0Var2 = new ll0(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(ll0Var2);
        }
        ch9Var.g3.O(false);
        of9 of9Var2 = ch9Var.R3;
        if (of9Var2 != null) {
            of9Var2.h();
        }
        if (ll0Var2 != null) {
            ch9Var.post(new vf9(ch9Var, ll0Var2, (byte) 22));
        }
    }
}
