package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ oy(kz kzVar, int i7) {
        this.a = i7;
        this.b = kzVar;
    }

    @Override // org.telegram.messenger.x10
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
