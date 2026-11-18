package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ey implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ey(zy zyVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.a = i7;
        this.b = zyVar;
        this.c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zy zyVar = this.b;
                zyVar.getMessagesController().V3(this.c, false);
                g0.g3(new lw(zyVar, this.d, this.e, 0));
                break;
            default:
                zy zyVar2 = this.b;
                zyVar2.getMessagesController().V3(this.c, false);
                g0.g3(new lw(zyVar2, this.d, this.e, 1));
                break;
        }
    }
}
