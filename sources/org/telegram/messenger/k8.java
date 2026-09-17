package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ a0.i d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ BaseController f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ k8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f = mediaDataController;
        this.h = task;
        this.n = timer;
        this.c = arrayList;
        this.b = j3;
        this.d = iVar;
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

    public /* synthetic */ k8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.b = j3;
        this.c = arrayList;
        this.d = iVar;
        this.n = hashSet;
        this.e = runnable;
    }
}
