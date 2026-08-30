package nh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Timer.Task b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Timer e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Serializable i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f7(g7 g7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z4, Timer timer, int[] iArr, Runnable runnable) {
        this.g = g7Var;
        this.b = task;
        this.h = arrayList;
        this.c = j10;
        this.d = z4;
        this.e = timer;
        this.i = iArr;
        this.f = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g7 g7Var = (g7) this.g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.i;
                int i10 = g7Var.a;
                Timer.done(this.b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.c;
                            if (i12 >= size) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = g7.e(messageObject);
                                g7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i12).id == g7.e(messageObject)) {
                                g7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                            } else {
                                i12++;
                            }
                        }
                        if (this.d) {
                            g7Var.b.getStorageQueue().postRunnable(new n4(13, g7Var, arrayList));
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
            default:
                ((MediaDataController) this.g).lambda$loadReplyMessagesForMessages$176(this.b, this.c, (a0.h) this.h, this.d, this.e, (AtomicInteger) this.i, this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ f7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z4, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = mediaDataController;
        this.b = task;
        this.c = j10;
        this.h = hVar;
        this.d = z4;
        this.e = timer;
        this.i = atomicInteger;
        this.f = runnable;
    }
}
