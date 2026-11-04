package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sf implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sf(c1 c1Var, Object obj, long j10, long j11, int i3) {
        this.a = i3;
        this.b = c1Var;
        this.e = obj;
        this.c = j10;
        this.d = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        switch (this.a) {
            case 0:
                li liVar = (li) this.b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.e;
                long j10 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    li.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        liVar.getMessagesController().M0(Long.valueOf(this.c));
                        zb.X(messages_messages.messages);
                        liVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        liVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            liVar.getMessagesStorage().a.c(new a4(liVar, arrayList, j10, 14));
                            break;
                        }
                    }
                }
                liVar.getMessagesStorage().c2(j10, tL_channels_getMessages.id, false, -1, 0, false, null);
                break;
            case 1:
                li liVar2 = (li) this.b;
                int[] iArr = (int[]) this.e;
                liVar2.getClass();
                for (int i10 = 0; i10 < 9; i10++) {
                    if (iArr[i10] < 0) {
                        iArr[i10] = 0;
                    }
                }
                boolean z10 = tLObject instanceof Vector;
                long j11 = this.c;
                long j12 = this.d;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i11);
                        TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                        if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                            i3 = 0;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                            i3 = 1;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                            i3 = 2;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                            i3 = 3;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                            i3 = 4;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                            i3 = 5;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                            i3 = 6;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                            i3 = 7;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                            i3 = 8;
                        }
                        int i12 = tL_messages_searchCounter.count;
                        iArr[i3] = i12;
                        liVar2.H1(j11, j12, i3, i12);
                    }
                }
                g0.h3(new zf(liVar2, j11, j12, iArr, 2));
                break;
            default:
                g0.h3(new f9((c00) this.b, tLObject, (TLRPC.TL_forumTopic) this.e, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ sf(li liVar, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = 0;
        this.b = liVar;
        this.c = j10;
        this.d = j11;
        this.e = tL_channels_getMessages;
    }
}
