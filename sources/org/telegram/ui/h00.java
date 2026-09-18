package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h00 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h10 b;

    public /* synthetic */ h00(h10 h10Var, int i10) {
        this.a = i10;
        this.b = h10Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                this.b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
