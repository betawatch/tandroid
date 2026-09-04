package bi;

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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g9 implements RequestDelegate {
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
    public /* synthetic */ g9(h9 h9Var, Timer.Task task, ArrayList arrayList, long j3, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.g = h9Var;
        this.b = task;
        this.h = arrayList;
        this.c = j3;
        this.d = z10;
        this.e = timer;
        this.i = iArr;
        this.f = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                h9 h9Var = (h9) this.g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.i;
                int i10 = h9Var.a;
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
                                tL_storyItemDeleted.id = h9.e(messageObject);
                                h9.b(i10, j3, messageObject, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i12).id == h9.e(messageObject)) {
                                h9.b(i10, j3, messageObject, tL_stories_stories.stories.get(i12));
                            } else {
                                i12++;
                            }
                        }
                        if (this.d) {
                            h9Var.b.getStorageQueue().postRunnable(new s8(5, h9Var, arrayList));
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
                ((MediaDataController) this.g).lambda$loadReplyMessagesForMessages$176(this.b, this.c, (a0.i) this.h, this.d, this.e, (AtomicInteger) this.i, this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ g9(MediaDataController mediaDataController, Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = mediaDataController;
        this.b = task;
        this.c = j3;
        this.h = iVar;
        this.d = z10;
        this.e = timer;
        this.i = atomicInteger;
        this.f = runnable;
    }
}
