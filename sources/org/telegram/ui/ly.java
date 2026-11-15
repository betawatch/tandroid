package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz b;

    public /* synthetic */ ly(hz hzVar, int i7) {
        this.a = i7;
        this.b = hzVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                this.b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
