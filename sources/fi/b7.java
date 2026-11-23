package fi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.messenger.tz;
import org.telegram.messenger.uz;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ uz e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Serializable i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b7(c7 c7Var, tz tzVar, ArrayList arrayList, long j3, boolean z10, uz uzVar, int[] iArr, Runnable runnable) {
        this.g = c7Var;
        this.b = tzVar;
        this.h = arrayList;
        this.c = j3;
        this.d = z10;
        this.e = uzVar;
        this.i = iArr;
        this.f = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                c7 c7Var = (c7) this.g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.i;
                int i7 = c7Var.a;
                uz.a(this.b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        gj gjVar = (gj) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.c;
                            if (i11 >= size) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = c7.e(gjVar);
                                c7.b(i7, j3, gjVar, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i11).id == c7.e(gjVar)) {
                                c7.b(i7, j3, gjVar, tL_stories_stories.stories.get(i11));
                            } else {
                                i11++;
                            }
                        }
                        if (this.d) {
                            c7Var.b.a.c(new l4(11, c7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    uz.c(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f.run();
                    break;
                }
                break;
            default:
                si siVar = (si) this.g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.i;
                siVar.getClass();
                uz.a(this.b);
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
                            fc.X(messages_messages.messages);
                            siVar.n(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            siVar.Y1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    uz.c(this.e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f) != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b7(si siVar, tz tzVar, long j3, a0.h hVar, boolean z10, uz uzVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = siVar;
        this.b = tzVar;
        this.c = j3;
        this.h = hVar;
        this.d = z10;
        this.e = uzVar;
        this.i = atomicInteger;
        this.f = runnable;
    }
}
