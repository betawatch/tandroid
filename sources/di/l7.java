package di;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.a00;
import org.telegram.messenger.gc;
import org.telegram.messenger.ij;
import org.telegram.messenger.ui;
import org.telegram.messenger.zz;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a00 e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Serializable i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l7(m7 m7Var, zz zzVar, ArrayList arrayList, long j3, boolean z9, a00 a00Var, int[] iArr, Runnable runnable) {
        this.g = m7Var;
        this.b = zzVar;
        this.h = arrayList;
        this.c = j3;
        this.d = z9;
        this.e = a00Var;
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
                int i7 = m7Var.a;
                a00.a(this.b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ij ijVar = (ij) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.c;
                            if (i11 >= size) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = m7.e(ijVar);
                                m7.b(i7, j3, ijVar, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i11).id == m7.e(ijVar)) {
                                m7.b(i7, j3, ijVar, tL_stories_stories.stories.get(i11));
                            } else {
                                i11++;
                            }
                        }
                        if (this.d) {
                            m7Var.b.a.c(new z0(16, m7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    a00.c(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f.run();
                    break;
                }
                break;
            default:
                ui uiVar = (ui) this.g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.i;
                uiVar.getClass();
                a00.a(this.b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (true) {
                        int size2 = messages_messages.messages.size();
                        long j10 = this.c;
                        if (i13 < size2) {
                            TLRPC.Message message = messages_messages.messages.get(i13);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j10;
                            }
                            i13++;
                        } else {
                            gc.X(messages_messages.messages);
                            uiVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            uiVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    a00.c(this.e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l7(ui uiVar, zz zzVar, long j3, a0.h hVar, boolean z9, a00 a00Var, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = uiVar;
        this.b = zzVar;
        this.c = j3;
        this.h = hVar;
        this.d = z9;
        this.e = a00Var;
        this.i = atomicInteger;
        this.f = runnable;
    }
}
