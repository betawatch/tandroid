package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Timer.Task b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Timer e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Serializable i;

    public /* synthetic */ f8(MediaDataController mediaDataController, Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = mediaDataController;
        this.b = task;
        this.c = j3;
        this.h = iVar;
        this.d = z10;
        this.e = timer;
        this.i = atomicInteger;
        this.f = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.g).lambda$loadReplyMessagesForMessages$176(this.b, this.c, (a0.i) this.h, this.d, this.e, (AtomicInteger) this.i, this.f, tLObject, tL_error);
                break;
            default:
                zh.v5 v5Var = (zh.v5) this.g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.i;
                int i10 = v5Var.a;
                Timer.done(this.b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.c;
                            if (i12 >= size) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = zh.v5.e(messageObject);
                                zh.v5.b(i10, j3, messageObject, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i12).id == zh.v5.e(messageObject)) {
                                zh.v5.b(i10, j3, messageObject, tL_stories_stories.stories.get(i12));
                            } else {
                                i12++;
                            }
                        }
                        if (this.d) {
                            v5Var.b.getStorageQueue().postRunnable(new yg.q(25, v5Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f.run();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f8(zh.v5 v5Var, Timer.Task task, ArrayList arrayList, long j3, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.g = v5Var;
        this.b = task;
        this.h = arrayList;
        this.c = j3;
        this.d = z10;
        this.e = timer;
        this.i = iArr;
        this.f = runnable;
    }
}
