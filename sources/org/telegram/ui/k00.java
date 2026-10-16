package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k00 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k10 b;

    public /* synthetic */ k00(k10 k10Var, int i10) {
        this.a = i10;
        this.b = k10Var;
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
