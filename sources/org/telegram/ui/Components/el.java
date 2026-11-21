package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements a5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ el(ml mlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.a = i7;
        this.b = mlVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.a5
    public final void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                ml mlVar = this.b;
                mlVar.o0.b(this.c, mlVar.p0, z10, i7, 0L);
                mlVar.b.a(true);
                break;
            default:
                ml mlVar2 = this.b;
                mlVar2.o0.b(this.c, mlVar2.p0, z10, i7, 0L);
                mlVar2.b.a(true);
                break;
        }
    }
}
