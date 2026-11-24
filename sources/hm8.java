// default package

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hm8 implements ku4, h59, jc5 {
    public final /* synthetic */ km8 a;

    public /* synthetic */ hm8(km8 km8Var) {
        this.a = km8Var;
    }

    @Override // jc5
    public final void a(ArrayList arrayList, boolean z, boolean z2) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // h59
    public final boolean g(int i, View view) {
        km8 km8Var = this.a;
        if (i < km8Var.r || i >= km8Var.s) {
            return false;
        }
        if (!km8Var.E) {
            throw null;
        }
        km8Var.Z(Long.valueOf(km8Var.getMessagesController().x0.keyAt(i - km8Var.r)), view);
        return true;
    }

    @Override // ku4
    public final Object l(Object obj) {
        if (((Integer) obj).intValue() == this.a.x) {
            return Integer.valueOf(cmb.p1(0.12f, cmb.w0(null, cmb.o7, false)));
        }
        return null;
    }
}
