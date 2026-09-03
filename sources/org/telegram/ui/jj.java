package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jj(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                zn znVar = ((lj) this.c).b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.qc.a0(znVar).m(this.b ? org.telegram.ui.Components.pc.D : org.telegram.ui.Components.pc.F, i10, 0, 0, znVar.ba).j();
                    break;
                }
                break;
            default:
                kj kjVar = (kj) this.c;
                zn znVar2 = kjVar.b.b;
                if (i10 < 50) {
                    znVar2.qa(znVar2.a4, true);
                    break;
                } else {
                    TLRPC.Chat chat = znVar2.e;
                    TLRPC.User user = znVar2.f;
                    boolean z4 = this.b;
                    org.telegram.ui.Components.z4.s(znVar2, true, chat, user, false, false, false, z4, new c1(kjVar, z4));
                    break;
                }
        }
    }
}
