package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.messages_Messages c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int v;

    public /* synthetic */ b7(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.a = i15;
        this.b = mediaDataController;
        this.c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f = arrayList;
        this.h = i11;
        this.n = i12;
        this.r = z10;
        this.s = i13;
        this.v = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processLoadedMedia$133(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v);
                break;
            default:
                this.b.lambda$processLoadedMedia$134(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v);
                break;
        }
    }
}
