package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class li implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k00 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ l00 e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Serializable i;

    public /* synthetic */ li(ui uiVar, k00 k00Var, long j10, a0.h hVar, boolean z10, l00 l00Var, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = uiVar;
        this.b = k00Var;
        this.c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = l00Var;
        this.i = atomicInteger;
        this.f = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.i;
                uiVar.getClass();
                l00.a(this.b);
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
                            hc.X(messages_messages.messages);
                            uiVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            uiVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    l00.c(this.e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
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
                l00.a(this.b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        jj jjVar = (jj) arrayList.get(i12);
                        int i13 = 0;
                        while (true) {
                            int size2 = tL_stories_stories.stories.size();
                            long j11 = this.c;
                            if (i13 >= size2) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = th.r5.e(jjVar);
                                th.r5.b(i11, j11, jjVar, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i13).id == th.r5.e(jjVar)) {
                                th.r5.b(i11, j11, jjVar, tL_stories_stories.stories.get(i13));
                            } else {
                                i13++;
                            }
                        }
                        if (this.d) {
                            r5Var.b.a.c(new th.o0(15, r5Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    l00.c(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
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
    public /* synthetic */ li(th.r5 r5Var, k00 k00Var, ArrayList arrayList, long j10, boolean z10, l00 l00Var, int[] iArr, Runnable runnable) {
        this.g = r5Var;
        this.b = k00Var;
        this.h = arrayList;
        this.c = j10;
        this.d = z10;
        this.e = l00Var;
        this.i = iArr;
        this.f = runnable;
    }
}
