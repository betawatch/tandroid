package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ BaseController h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ y8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i9, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.c = z10;
        this.n = arrayList;
        this.f = i9;
        this.b = j10;
        this.d = z11;
        this.r = arrayList2;
        this.e = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.c, (ArrayList) this.n, this.f, this.b, this.d, (ArrayList) this.r, this.e);
                break;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.n, this.b, this.c, this.d, this.e, this.f, (CountDownLatch) this.r);
                break;
        }
    }

    public /* synthetic */ y8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i9, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.n = chatFullArr;
        this.b = j10;
        this.c = z10;
        this.d = z11;
        this.e = z12;
        this.f = i9;
        this.r = countDownLatch;
    }
}
