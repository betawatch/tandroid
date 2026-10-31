package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;
    public final /* synthetic */ org.telegram.messenger.vp c;
    public final /* synthetic */ int d;

    public /* synthetic */ ei(mi miVar, org.telegram.messenger.vp vpVar, int i10, int i11) {
        this.a = i11;
        this.b = miVar;
        this.c = vpVar;
        this.d = i10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                mi miVar = this.b;
                miVar.d0 = -1;
                miVar.m0 = false;
                if (messages_botresults != null) {
                    this.c.V3(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i10);
                        i10++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i11 = miVar.l0;
                                miVar.l0 = i11 - 1;
                                tL_message.id = i11;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i12 = this.d;
                                long e = org.telegram.messenger.d20.i(i12).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                                org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(i12, tL_message, false, true);
                                xeVar.e = jjVar;
                                TLRPC.Document F0 = jjVar.F0();
                                if (F0 != null) {
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= F0.attributes.size()) {
                                            tL_documentAttributeAudio = null;
                                        } else if (F0.attributes.get(i13) instanceof TLRPC.TL_documentAttributeAudio) {
                                            tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) F0.attributes.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        xeVar.a = tL_documentAttributeAudio.performer;
                                        xeVar.b = tL_documentAttributeAudio.title;
                                        xeVar.c = (int) tL_documentAttributeAudio.duration;
                                        miVar.M.add(xeVar);
                                    }
                                }
                            }
                        }
                    }
                    miVar.k0 = messages_botresults.next_offset;
                    miVar.g0 = !TextUtils.isEmpty(r13);
                    miVar.S();
                    break;
                }
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                mi miVar2 = this.b;
                ArrayList arrayList2 = miVar2.L;
                miVar2.U = -1;
                boolean z10 = false;
                miVar2.W = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.vp vpVar = this.c;
                    vpVar.V3(arrayList3, false);
                    vpVar.P3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        TLRPC.Message message = arrayList4.get(i14);
                        i14++;
                        org.telegram.messenger.xe xeVar2 = new org.telegram.messenger.xe();
                        org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(this.d, message, false, true);
                        xeVar2.e = jjVar2;
                        TLRPC.Document F02 = jjVar2.F0();
                        if (F02 != null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= F02.attributes.size()) {
                                    tL_documentAttributeAudio2 = null;
                                } else if (F02.attributes.get(i15) instanceof TLRPC.TL_documentAttributeAudio) {
                                    tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) F02.attributes.get(i15);
                                } else {
                                    i15++;
                                }
                            }
                            if (tL_documentAttributeAudio2 != null) {
                                xeVar2.a = tL_documentAttributeAudio2.performer;
                                xeVar2.b = tL_documentAttributeAudio2.title;
                                xeVar2.c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(xeVar2);
                            }
                        }
                    }
                    int i16 = messages_messages.next_rate;
                    miVar2.b0 = i16;
                    if (i16 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    miVar2.c0 = z10;
                    miVar2.S();
                    break;
                }
                break;
        }
    }
}
