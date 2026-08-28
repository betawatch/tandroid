package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ a0.h d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ BaseController f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ i8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f = mediaDataController;
        this.h = task;
        this.n = timer;
        this.c = arrayList;
        this.b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.n, this.c, this.b, this.d, this.e);
                break;
            default:
                ((TopicsController) this.f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.b, this.c, this.d, (HashSet) this.n, this.e);
                break;
        }
    }

    public /* synthetic */ i8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.b = j10;
        this.c = arrayList;
        this.d = hVar;
        this.n = hashSet;
        this.e = runnable;
    }
}
