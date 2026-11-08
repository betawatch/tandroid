package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;
    public final /* synthetic */ org.telegram.messenger.qp c;
    public final /* synthetic */ int d;

    public /* synthetic */ gi(ni niVar, org.telegram.messenger.qp qpVar, int i7, int i10) {
        this.a = i10;
        this.b = niVar;
        this.c = qpVar;
        this.d = i7;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                ni niVar = this.b;
                niVar.d0 = -1;
                niVar.m0 = false;
                if (messages_botresults != null) {
                    this.c.Y3(messages_botresults.users, false);
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
                                int i10 = niVar.l0;
                                niVar.l0 = i10 - 1;
                                tL_message.id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i11 = this.d;
                                long e10 = org.telegram.messenger.p10.i(i11).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                                org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i11, tL_message, false, true);
                                xeVar.e = ijVar;
                                TLRPC.Document F0 = ijVar.F0();
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
                                        xeVar.a = tL_documentAttributeAudio.performer;
                                        xeVar.b = tL_documentAttributeAudio.title;
                                        xeVar.c = (int) tL_documentAttributeAudio.duration;
                                        niVar.M.add(xeVar);
                                    }
                                }
                            }
                        }
                    }
                    niVar.k0 = messages_botresults.next_offset;
                    niVar.g0 = !TextUtils.isEmpty(r13);
                    niVar.T();
                    break;
                }
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                ni niVar2 = this.b;
                ArrayList arrayList2 = niVar2.L;
                niVar2.U = -1;
                boolean z9 = false;
                niVar2.W = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.qp qpVar = this.c;
                    qpVar.Y3(arrayList3, false);
                    qpVar.S3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        org.telegram.messenger.xe xeVar2 = new org.telegram.messenger.xe();
                        org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(this.d, message, false, true);
                        xeVar2.e = ijVar2;
                        TLRPC.Document F02 = ijVar2.F0();
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
                                xeVar2.a = tL_documentAttributeAudio2.performer;
                                xeVar2.b = tL_documentAttributeAudio2.title;
                                xeVar2.c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(xeVar2);
                            }
                        }
                    }
                    int i15 = messages_messages.next_rate;
                    niVar2.b0 = i15;
                    if (i15 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z9 = true;
                    }
                    niVar2.c0 = z9;
                    niVar2.T();
                    break;
                }
                break;
        }
    }
}
