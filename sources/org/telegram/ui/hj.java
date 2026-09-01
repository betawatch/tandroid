package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hj(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                xn xnVar = ((jj) this.c).b;
                if (i10 > 0 && xnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.qc.a0(xnVar).m(this.b ? org.telegram.ui.Components.pc.D : org.telegram.ui.Components.pc.F, i10, 0, 0, xnVar.ba).j();
                    break;
                }
                break;
            default:
                ij ijVar = (ij) this.c;
                xn xnVar2 = ijVar.b.b;
                if (i10 < 50) {
                    xnVar2.qa(xnVar2.a4, true);
                    break;
                } else {
                    TLRPC.Chat chat = xnVar2.e;
                    TLRPC.User user = xnVar2.f;
                    boolean z4 = this.b;
                    org.telegram.ui.Components.z4.s(xnVar2, true, chat, user, false, false, false, z4, new a1(ijVar, z4));
                    break;
                }
        }
    }
}
