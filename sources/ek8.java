// default package

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ek8 implements js4, e39, la5 {
    public final /* synthetic */ gk8 a;

    public /* synthetic */ ek8(gk8 gk8Var) {
        this.a = gk8Var;
    }

    @Override // la5
    public final void a(ArrayList arrayList, boolean z, boolean z2) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.Z();
    }

    @Override // e39
    public final boolean d(int i, View view) {
        gk8 gk8Var = this.a;
        if (i < gk8Var.r || i >= gk8Var.s) {
            return false;
        }
        if (!gk8Var.E) {
            throw null;
        }
        gk8Var.Y(Long.valueOf(gk8Var.getMessagesController().x0.keyAt(i - gk8Var.r)), view);
        return true;
    }

    @Override // js4
    public final Object m(Object obj) {
        if (((Integer) obj).intValue() == this.a.x) {
            return Integer.valueOf(bkb.p1(0.12f, bkb.w0(null, bkb.o7, false)));
        }
        return null;
    }
}
