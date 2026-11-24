// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l22 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s22 b;
    public final /* synthetic */ oc7 c;
    public final /* synthetic */ int d;

    public /* synthetic */ l22(s22 s22Var, oc7 oc7Var, int i, byte b) {
        this.a = b;
        this.b = s22Var;
        this.c = oc7Var;
        this.d = i;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        byte b = this.a;
        boolean z = false;
        int i = this.d;
        oc7 oc7Var = this.c;
        s22 s22Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                s22Var.e0 = -1;
                s22Var.n0 = false;
                if (messages_botresults != null) {
                    oc7Var.d4(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i2);
                        i2++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i3 = s22Var.m0;
                                s22Var.m0 = i3 - 1;
                                tL_message.id = i3;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(i).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                zn6 zn6Var = new zn6();
                                k47 k47Var = new k47(i, tL_message, false, true);
                                zn6Var.e = k47Var;
                                TLRPC.Document F0 = k47Var.F0();
                                if (F0 != null) {
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= F0.attributes.size()) {
                                            tL_documentAttributeAudio = null;
                                        } else if (F0.attributes.get(i4) instanceof TLRPC.TL_documentAttributeAudio) {
                                            tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) F0.attributes.get(i4);
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        zn6Var.a = tL_documentAttributeAudio.performer;
                                        zn6Var.b = tL_documentAttributeAudio.title;
                                        zn6Var.c = (int) tL_documentAttributeAudio.duration;
                                        s22Var.N.add(zn6Var);
                                    }
                                }
                            }
                        }
                    }
                    s22Var.l0 = messages_botresults.next_offset;
                    s22Var.h0 = !TextUtils.isEmpty(r13);
                    s22Var.S();
                    break;
                }
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                ArrayList arrayList2 = s22Var.M;
                s22Var.V = -1;
                s22Var.a0 = false;
                if (messages_messages != null) {
                    oc7Var.d4(messages_messages.users, false);
                    oc7Var.X3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                    int size2 = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        TLRPC.Message message = arrayList3.get(i5);
                        i5++;
                        zn6 zn6Var2 = new zn6();
                        k47 k47Var2 = new k47(i, message, false, true);
                        zn6Var2.e = k47Var2;
                        TLRPC.Document F02 = k47Var2.F0();
                        if (F02 != null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= F02.attributes.size()) {
                                    tL_documentAttributeAudio2 = null;
                                } else if (F02.attributes.get(i6) instanceof TLRPC.TL_documentAttributeAudio) {
                                    tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) F02.attributes.get(i6);
                                } else {
                                    i6++;
                                }
                            }
                            if (tL_documentAttributeAudio2 != null) {
                                zn6Var2.a = tL_documentAttributeAudio2.performer;
                                zn6Var2.b = tL_documentAttributeAudio2.title;
                                zn6Var2.c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(zn6Var2);
                            }
                        }
                    }
                    int i7 = messages_messages.next_rate;
                    s22Var.c0 = i7;
                    if (i7 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z = true;
                    }
                    s22Var.d0 = z;
                    s22Var.S();
                    break;
                }
                break;
        }
    }
}
