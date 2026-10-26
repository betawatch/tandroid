package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ej(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                un unVar = ((gj) this.c).b;
                if (i10 > 0 && unVar.getParentActivity() != null) {
                    org.telegram.ui.Components.wc.b0(unVar).m(this.b ? org.telegram.ui.Components.vc.G : org.telegram.ui.Components.vc.I, i10, 0, 0, unVar.qa).j();
                    break;
                }
                break;
            default:
                fj fjVar = (fj) this.c;
                un unVar2 = fjVar.b.b;
                if (i10 < 50) {
                    unVar2.Aa(unVar2.p4, true);
                    break;
                } else {
                    TLRPC.Chat chat = unVar2.e;
                    TLRPC.User user = unVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.g5.r(unVar2, true, chat, user, false, false, false, z10, new y0(fjVar, z10));
                    break;
                }
        }
    }
}
