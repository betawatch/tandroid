package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements RequestDelegate {
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
    public /* synthetic */ h7(i7 i7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.g = i7Var;
        this.b = task;
        this.h = arrayList;
        this.c = j10;
        this.d = z10;
        this.e = timer;
        this.i = iArr;
        this.f = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i7 i7Var = (i7) this.g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.i;
                int i9 = i7Var.a;
                Timer.done(this.b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.c;
                            if (i11 >= size) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = i7.e(messageObject);
                                i7.b(i9, j10, messageObject, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i11).id == i7.e(messageObject)) {
                                i7.b(i9, j10, messageObject, tL_stories_stories.stories.get(i11));
                            } else {
                                i11++;
                            }
                        }
                        if (this.d) {
                            i7Var.b.getStorageQueue().postRunnable(new h3.g0(28, i7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f.run();
                    break;
                }
                break;
            default:
                ((MediaDataController) this.g).lambda$loadReplyMessagesForMessages$176(this.b, this.c, (a0.h) this.h, this.d, this.e, (AtomicInteger) this.i, this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ h7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = mediaDataController;
        this.b = task;
        this.c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = timer;
        this.i = atomicInteger;
        this.f = runnable;
    }
}
