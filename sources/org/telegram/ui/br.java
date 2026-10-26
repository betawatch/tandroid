package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class br implements m60 {
    public final /* synthetic */ r60 a;
    public final /* synthetic */ kr b;

    public br(kr krVar, r60 r60Var) {
        this.b = krVar;
        this.a = r60Var;
    }

    @Override // org.telegram.ui.m60
    public final void e(TLRPC.User user) {
        this.b.u0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.m60
    public final void f(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        kr krVar = this.b;
        krVar.getMessagesController().addUsersToChat(krVar.n, krVar, arrayList, i10, new h3(this, 2), new ar(0), null);
    }
}
