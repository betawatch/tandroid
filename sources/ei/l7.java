package ei;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.li;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ sz e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Serializable i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l7(m7 m7Var, rz rzVar, ArrayList arrayList, long j10, boolean z10, sz szVar, int[] iArr, Runnable runnable) {
        this.g = m7Var;
        this.b = rzVar;
        this.h = arrayList;
        this.c = j10;
        this.d = z10;
        this.e = szVar;
        this.i = iArr;
        this.f = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                m7 m7Var = (m7) this.g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.i;
                int i3 = m7Var.a;
                sz.a(this.b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        zi ziVar = (zi) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.c;
                            if (i11 >= size) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = m7.e(ziVar);
                                m7.b(i3, j10, ziVar, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i11).id == m7.e(ziVar)) {
                                m7.b(i3, j10, ziVar, tL_stories_stories.stories.get(i11));
                            } else {
                                i11++;
                            }
                        }
                        if (this.d) {
                            m7Var.b.a.c(new b0(19, m7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    sz.c(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f.run();
                    break;
                }
                break;
            default:
                li liVar = (li) this.g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.i;
                liVar.getClass();
                sz.a(this.b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (true) {
                        int size2 = messages_messages.messages.size();
                        long j11 = this.c;
                        if (i13 < size2) {
                            TLRPC.Message message = messages_messages.messages.get(i13);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j11;
                            }
                            i13++;
                        } else {
                            zb.X(messages_messages.messages);
                            liVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j11, false);
                            liVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            liVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    sz.c(this.e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l7(li liVar, rz rzVar, long j10, a0.h hVar, boolean z10, sz szVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = liVar;
        this.b = rzVar;
        this.c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = szVar;
        this.i = atomicInteger;
        this.f = runnable;
    }
}
