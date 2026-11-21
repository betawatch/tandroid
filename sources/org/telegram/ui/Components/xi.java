package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej b;
    public final /* synthetic */ org.telegram.messenger.mp c;
    public final /* synthetic */ int d;

    public /* synthetic */ xi(ej ejVar, org.telegram.messenger.mp mpVar, int i7, int i10) {
        this.a = i10;
        this.b = ejVar;
        this.c = mpVar;
        this.d = i7;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                ej ejVar = this.b;
                ejVar.e0 = -1;
                ejVar.n0 = false;
                if (messages_botresults != null) {
                    this.c.f4(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i7);
                        i7++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i10 = ejVar.m0;
                                ejVar.m0 = i10 - 1;
                                tL_message.id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i11 = this.d;
                                long e10 = org.telegram.messenger.j10.i(i11).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                org.telegram.messenger.ve veVar = new org.telegram.messenger.ve();
                                org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i11, tL_message, false, true);
                                veVar.e = fjVar;
                                TLRPC.Document F0 = fjVar.F0();
                                if (F0 != null) {
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= F0.attributes.size()) {
                                            tL_documentAttributeAudio = null;
                                        } else if (F0.attributes.get(i12) instanceof TLRPC.TL_documentAttributeAudio) {
                                            tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) F0.attributes.get(i12);
                                        } else {
                                            i12++;
                                        }
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        veVar.a = tL_documentAttributeAudio.performer;
                                        veVar.b = tL_documentAttributeAudio.title;
                                        veVar.c = (int) tL_documentAttributeAudio.duration;
                                        ejVar.N.add(veVar);
                                    }
                                }
                            }
                        }
                    }
                    ejVar.l0 = messages_botresults.next_offset;
                    ejVar.h0 = !TextUtils.isEmpty(r13);
                    ejVar.U();
                    break;
                }
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                ej ejVar2 = this.b;
                ArrayList arrayList2 = ejVar2.M;
                ejVar2.V = -1;
                boolean z10 = false;
                ejVar2.a0 = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.mp mpVar = this.c;
                    mpVar.f4(arrayList3, false);
                    mpVar.Z3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        org.telegram.messenger.ve veVar2 = new org.telegram.messenger.ve();
                        org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(this.d, message, false, true);
                        veVar2.e = fjVar2;
                        TLRPC.Document F02 = fjVar2.F0();
                        if (F02 != null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= F02.attributes.size()) {
                                    tL_documentAttributeAudio2 = null;
                                } else if (F02.attributes.get(i14) instanceof TLRPC.TL_documentAttributeAudio) {
                                    tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) F02.attributes.get(i14);
                                } else {
                                    i14++;
                                }
                            }
                            if (tL_documentAttributeAudio2 != null) {
                                veVar2.a = tL_documentAttributeAudio2.performer;
                                veVar2.b = tL_documentAttributeAudio2.title;
                                veVar2.c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(veVar2);
                            }
                        }
                    }
                    int i15 = messages_messages.next_rate;
                    ejVar2.c0 = i15;
                    if (i15 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    ejVar2.d0 = z10;
                    ejVar2.U();
                    break;
                }
                break;
        }
    }
}
