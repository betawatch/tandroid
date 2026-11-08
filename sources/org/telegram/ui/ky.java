package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;

    public /* synthetic */ ky(gz gzVar, int i7) {
        this.a = i7;
        this.b = gzVar;
    }

    @Override // org.telegram.messenger.c20
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
