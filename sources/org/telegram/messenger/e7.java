package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements Runnable {
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

    public /* synthetic */ e7(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.a = i15;
        this.b = mediaDataController;
        this.c = messages_messages;
        this.d = i10;
        this.e = j3;
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
