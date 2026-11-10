package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk implements s4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ nk(vk vkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.a = i7;
        this.b = vkVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.s4
    public final void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 0:
                vk vkVar = this.b;
                vkVar.n0.d(this.c, vkVar.o0, z9, i7, 0L);
                vkVar.b.a(true);
                break;
            default:
                vk vkVar2 = this.b;
                vkVar2.n0.d(this.c, vkVar2.o0, z9, i7, 0L);
                vkVar2.b.a(true);
                break;
        }
    }
}
