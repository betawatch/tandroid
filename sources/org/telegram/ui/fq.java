package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class fq implements r40 {
    public final /* synthetic */ w40 a;
    public final /* synthetic */ oq b;

    public fq(oq oqVar, w40 w40Var) {
        this.b = oqVar;
        this.a = w40Var;
    }

    @Override // org.telegram.ui.r40
    public final void e(TLRPC.User user) {
        this.b.y0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.r40
    public final void f(int i7, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        oq oqVar = this.b;
        oqVar.getMessagesController().o(oqVar.n, oqVar, arrayList, i7, new f3(this, 2), new eq(0), null);
    }
}
