package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;

    public /* synthetic */ ny(jz jzVar, int i7) {
        this.a = i7;
        this.b = jzVar;
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
