package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;
    public final /* synthetic */ org.telegram.messenger.hp c;
    public final /* synthetic */ int d;

    public /* synthetic */ fi(ni niVar, org.telegram.messenger.hp hpVar, int i3, int i10) {
        this.a = i10;
        this.b = niVar;
        this.c = hpVar;
        this.d = i3;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                ni niVar = this.b;
                niVar.e0 = -1;
                niVar.n0 = false;
                if (messages_botresults != null) {
                    this.c.Y3(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i3);
                        i3++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i10 = niVar.m0;
                                niVar.m0 = i10 - 1;
                                tL_message.id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i11 = this.d;
                                long e10 = org.telegram.messenger.h10.i(i11).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                org.telegram.messenger.qe qeVar = new org.telegram.messenger.qe();
                                org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i11, tL_message, false, true);
                                qeVar.e = ziVar;
                                TLRPC.Document F0 = ziVar.F0();
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
                                        qeVar.a = tL_documentAttributeAudio.performer;
                                        qeVar.b = tL_documentAttributeAudio.title;
                                        qeVar.c = (int) tL_documentAttributeAudio.duration;
                                        niVar.N.add(qeVar);
                                    }
                                }
                            }
                        }
                    }
                    niVar.l0 = messages_botresults.next_offset;
                    niVar.h0 = !TextUtils.isEmpty(r13);
                    niVar.T();
                    break;
                }
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                ni niVar2 = this.b;
                ArrayList arrayList2 = niVar2.M;
                niVar2.V = -1;
                boolean z10 = false;
                niVar2.a0 = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.hp hpVar = this.c;
                    hpVar.Y3(arrayList3, false);
                    hpVar.S3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        org.telegram.messenger.qe qeVar2 = new org.telegram.messenger.qe();
                        org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(this.d, message, false, true);
                        qeVar2.e = ziVar2;
                        TLRPC.Document F02 = ziVar2.F0();
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
                                qeVar2.a = tL_documentAttributeAudio2.performer;
                                qeVar2.b = tL_documentAttributeAudio2.title;
                                qeVar2.c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(qeVar2);
                            }
                        }
                    }
                    int i15 = messages_messages.next_rate;
                    niVar2.c0 = i15;
                    if (i15 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    niVar2.d0 = z10;
                    niVar2.T();
                    break;
                }
                break;
        }
    }
}
