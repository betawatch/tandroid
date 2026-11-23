package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class bg implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bg(c1 c1Var, Object obj, long j3, long j10, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.e = obj;
        this.c = j3;
        this.d = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.a) {
            case 0:
                si siVar = (si) this.b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.e;
                long j3 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    si.P1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        siVar.getMessagesController().O0(Long.valueOf(this.c));
                        fc.X(messages_messages.messages);
                        siVar.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            siVar.getMessagesStorage().a.c(new d4(siVar, arrayList, j3, 14));
                            break;
                        }
                    }
                }
                siVar.getMessagesStorage().c2(j3, tL_channels_getMessages.id, false, -1, 0, false, null);
                break;
            case 1:
                si siVar2 = (si) this.b;
                int[] iArr = (int[]) this.e;
                siVar2.getClass();
                for (int i10 = 0; i10 < 9; i10++) {
                    if (iArr[i10] < 0) {
                        iArr[i10] = 0;
                    }
                }
                boolean z10 = tLObject instanceof Vector;
                long j10 = this.c;
                long j11 = this.d;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i11);
                        TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                        if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                            i7 = 0;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                            i7 = 1;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                            i7 = 2;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                            i7 = 3;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                            i7 = 4;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                            i7 = 5;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                            i7 = 6;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                            i7 = 7;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                            i7 = 8;
                        }
                        int i12 = tL_messages_searchCounter.count;
                        iArr[i7] = i12;
                        siVar2.M1(j10, j11, i7, i12);
                    }
                }
                g0.g3(new hg(siVar2, j10, j11, iArr, 2));
                break;
            default:
                g0.g3(new k9((f00) this.b, tLObject, (TLRPC.TL_forumTopic) this.e, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ bg(si siVar, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.a = 0;
        this.b = siVar;
        this.c = j3;
        this.d = j10;
        this.e = tL_channels_getMessages;
    }
}
