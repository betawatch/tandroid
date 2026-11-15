package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk implements r4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ vk(dl dlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.a = i7;
        this.b = dlVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.r4
    public final void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                dl dlVar = this.b;
                dlVar.o0.d(this.c, dlVar.p0, z10, i7, 0L);
                dlVar.b.a(true);
                break;
            default:
                dl dlVar2 = this.b;
                dlVar2.o0.d(this.c, dlVar2.p0, z10, i7, 0L);
                dlVar2.b.a(true);
                break;
        }
    }
}
