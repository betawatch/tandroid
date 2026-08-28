package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x6 implements Runnable {
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

    public /* synthetic */ x6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i9, long j10, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.a = i14;
        this.b = mediaDataController;
        this.c = messages_messages;
        this.d = i9;
        this.e = j10;
        this.f = arrayList;
        this.h = i10;
        this.n = i11;
        this.r = z10;
        this.s = i12;
        this.v = i13;
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
