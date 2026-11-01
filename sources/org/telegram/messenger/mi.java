package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class mi implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ l00 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ m00 e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Serializable i;

    public /* synthetic */ mi(vi viVar, l00 l00Var, long j10, a0.h hVar, boolean z10, m00 m00Var, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = viVar;
        this.b = l00Var;
        this.c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = m00Var;
        this.i = atomicInteger;
        this.f = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.i;
                viVar.getClass();
                m00.a(this.b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i10 = 0;
                    while (true) {
                        int size = messages_messages.messages.size();
                        long j10 = this.c;
                        if (i10 < size) {
                            TLRPC.Message message = messages_messages.messages.get(i10);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j10;
                            }
                            i10++;
                        } else {
                            ic.X(messages_messages.messages);
                            viVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            viVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            viVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    m00.c(this.e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f) != null) {
                    i0.g3(runnable);
                    break;
                }
                break;
            default:
                th.r5 r5Var = (th.r5) this.g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.i;
                int i11 = r5Var.a;
                m00.a(this.b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        kj kjVar = (kj) arrayList.get(i12);
                        int i13 = 0;
                        while (true) {
                            int size2 = tL_stories_stories.stories.size();
                            long j11 = this.c;
                            if (i13 >= size2) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = th.r5.e(kjVar);
                                th.r5.b(i11, j11, kjVar, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i13).id == th.r5.e(kjVar)) {
                                th.r5.b(i11, j11, kjVar, tL_stories_stories.stories.get(i13));
                            } else {
                                i13++;
                            }
                        }
                        if (this.d) {
                            r5Var.b.a.c(new th.o0(16, r5Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    m00.c(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    this.f.run();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mi(th.r5 r5Var, l00 l00Var, ArrayList arrayList, long j10, boolean z10, m00 m00Var, int[] iArr, Runnable runnable) {
        this.g = r5Var;
        this.b = l00Var;
        this.h = arrayList;
        this.c = j10;
        this.d = z10;
        this.e = m00Var;
        this.i = iArr;
        this.f = runnable;
    }
}
