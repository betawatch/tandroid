package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lz implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i00 b;

    public /* synthetic */ lz(i00 i00Var, int i10) {
        this.a = i10;
        this.b = i00Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                this.b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.b.q0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
