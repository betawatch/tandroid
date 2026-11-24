// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a12 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h12 b;
    public final /* synthetic */ na7 c;
    public final /* synthetic */ int d;

    public /* synthetic */ a12(h12 h12Var, na7 na7Var, int i, byte b) {
        this.a = b;
        this.b = h12Var;
        this.c = na7Var;
        this.d = i;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        byte b = this.a;
        boolean z = false;
        int i = this.d;
        na7 na7Var = this.c;
        h12 h12Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                h12Var.e0 = -1;
                h12Var.n0 = false;
                if (messages_botresults != null) {
                    na7Var.b4(messages_botresults.users, false);
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
                                int i3 = h12Var.m0;
                                h12Var.m0 = i3 - 1;
                                tL_message.id = i3;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = y6c.h(i).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                yl6 yl6Var = new yl6();
                                k27 k27Var = new k27(i, tL_message, false, true);
                                yl6Var.e = k27Var;
                                TLRPC.Document F0 = k27Var.F0();
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
                                        yl6Var.a = tL_documentAttributeAudio.performer;
                                        yl6Var.b = tL_documentAttributeAudio.title;
                                        yl6Var.c = (int) tL_documentAttributeAudio.duration;
                                        h12Var.N.add(yl6Var);
                                    }
                                }
                            }
                        }
                    }
                    h12Var.l0 = messages_botresults.next_offset;
                    h12Var.h0 = !TextUtils.isEmpty(r13);
                    h12Var.T();
                    break;
                }
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                ArrayList arrayList2 = h12Var.M;
                h12Var.V = -1;
                h12Var.a0 = false;
                if (messages_messages != null) {
                    na7Var.b4(messages_messages.users, false);
                    na7Var.V3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                    int size2 = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        TLRPC.Message message = arrayList3.get(i5);
                        i5++;
                        yl6 yl6Var2 = new yl6();
                        k27 k27Var2 = new k27(i, message, false, true);
                        yl6Var2.e = k27Var2;
                        TLRPC.Document F02 = k27Var2.F0();
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
                                yl6Var2.a = tL_documentAttributeAudio2.performer;
                                yl6Var2.b = tL_documentAttributeAudio2.title;
                                yl6Var2.c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(yl6Var2);
                            }
                        }
                    }
                    int i7 = messages_messages.next_rate;
                    h12Var.c0 = i7;
                    if (i7 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z = true;
                    }
                    h12Var.d0 = z;
                    h12Var.T();
                    break;
                }
                break;
        }
    }
}
