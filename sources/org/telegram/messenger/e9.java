package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ BaseController h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ e9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, boolean z10, ArrayList arrayList2, boolean z11) {
        this.h = mediaDataController;
        this.c = z4;
        this.n = arrayList;
        this.f = i10;
        this.b = j10;
        this.d = z10;
        this.r = arrayList2;
        this.e = z11;
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

    public /* synthetic */ e9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z4, boolean z10, boolean z11, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.n = chatFullArr;
        this.b = j10;
        this.c = z4;
        this.d = z10;
        this.e = z11;
        this.f = i10;
        this.r = countDownLatch;
    }
}
