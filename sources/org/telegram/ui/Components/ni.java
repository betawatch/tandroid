package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ int d;

    public /* synthetic */ ni(vi viVar, MessagesController messagesController, int i9, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = messagesController;
        this.d = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                vi viVar = this.b;
                viVar.a0 = -1;
                viVar.j0 = false;
                if (messages_botresults != null) {
                    this.c.putUsers(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i9);
                        i9++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i10 = viVar.i0;
                                viVar.i0 = i10 - 1;
                                tL_message.id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i11 = this.d;
                                long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                MessageObject messageObject = new MessageObject(i11, tL_message, false, true);
                                audioEntry.messageObject = messageObject;
                                TLRPC.Document document = messageObject.getDocument();
                                if (document != null) {
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= document.attributes.size()) {
                                            tL_documentAttributeAudio = null;
                                        } else if (document.attributes.get(i12) instanceof TLRPC.TL_documentAttributeAudio) {
                                            tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) document.attributes.get(i12);
                                        } else {
                                            i12++;
                                        }
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        audioEntry.author = tL_documentAttributeAudio.performer;
                                        audioEntry.title = tL_documentAttributeAudio.title;
                                        audioEntry.duration = (int) tL_documentAttributeAudio.duration;
                                        viVar.J.add(audioEntry);
                                    }
                                }
                            }
                        }
                    }
                    viVar.h0 = messages_botresults.next_offset;
                    viVar.d0 = !TextUtils.isEmpty(r13);
                    viVar.O();
                    break;
                }
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                vi viVar2 = this.b;
                ArrayList arrayList2 = viVar2.I;
                viVar2.R = -1;
                boolean z10 = false;
                viVar2.T = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    MessagesController messagesController = this.c;
                    messagesController.putUsers(arrayList3, false);
                    messagesController.putChats(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        MediaController.AudioEntry audioEntry2 = new MediaController.AudioEntry();
                        MessageObject messageObject2 = new MessageObject(this.d, message, false, true);
                        audioEntry2.messageObject = messageObject2;
                        TLRPC.Document document2 = messageObject2.getDocument();
                        if (document2 != null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= document2.attributes.size()) {
                                    tL_documentAttributeAudio2 = null;
                                } else if (document2.attributes.get(i14) instanceof TLRPC.TL_documentAttributeAudio) {
                                    tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) document2.attributes.get(i14);
                                } else {
                                    i14++;
                                }
                            }
                            if (tL_documentAttributeAudio2 != null) {
                                audioEntry2.author = tL_documentAttributeAudio2.performer;
                                audioEntry2.title = tL_documentAttributeAudio2.title;
                                audioEntry2.duration = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(audioEntry2);
                            }
                        }
                    }
                    int i15 = messages_messages.next_rate;
                    viVar2.V = i15;
                    if (i15 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    viVar2.W = z10;
                    viVar2.O();
                    break;
                }
                break;
        }
    }
}
