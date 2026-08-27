package org.telegram.messenger;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ l7(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.a = 0;
        this.f = mediaDataController;
        this.d = tLObject;
        this.e = arrayList;
        this.b = i10;
        this.h = hVar;
        this.n = stickerSet;
        this.r = tL_messages_allStickers;
        this.c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        ArrayList arrayList = this.e;
        TLObject tLObject = this.d;
        int i14 = this.c;
        int i15 = this.b;
        TLObject tLObject2 = this.r;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.d, this.e, this.b, (a0.h) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.c);
                break;
            case 1:
                pf.z zVar = (pf.z) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                pf.s sVar = zVar.f0;
                ArrayList arrayList2 = zVar.D;
                int i16 = zVar.o0;
                if (i15 == zVar.P && (i14 <= 0 || i14 == zVar.Z)) {
                    zVar.z0--;
                    if (tL_error == null) {
                        zVar.X = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i16).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i16).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        zVar.Y = messages_messages.next_rate;
                        for (int i17 = 0; i17 < messages_messages.messages.size(); i17++) {
                            TLRPC.Message message = messages_messages.messages.get(i17);
                            int i18 = MessagesController.getInstance(i16).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i18 == 0 || message.id > i18) {
                                arrayList2.add((MessageObject) arrayList.get(i17));
                            }
                        }
                        zVar.J = true;
                        zVar.T = messages_messages.messages.size() != 20;
                        if (i14 > 0) {
                            zVar.c0 = i14;
                            if (zVar.b0 != i14) {
                                zVar.s.clear();
                            }
                            if (zVar.a0 != i14) {
                                sVar.b();
                            }
                        }
                        sVar.f(zVar.s, zVar.r0);
                        rx rxVar = zVar.Q;
                        if (rxVar != null) {
                            rxVar.d(zVar.z0 > 0, true);
                            zVar.Q.c();
                        }
                        zVar.l();
                    }
                }
                zVar.M = 0;
                break;
            default:
                pf.z zVar2 = (pf.z) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                pf.s sVar2 = zVar2.f0;
                ArrayList arrayList3 = zVar2.E;
                ArrayList arrayList4 = zVar2.D;
                int i19 = zVar2.o0;
                if (i15 == zVar2.L && (i14 <= 0 || i14 == zVar2.Z)) {
                    zVar2.z0--;
                    if (tL_error2 == null) {
                        zVar2.X = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i19).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i19).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i19).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        zVar2.Y = messages_messages2.next_rate;
                        for (int i20 = 0; i20 < messages_messages2.messages.size(); i20++) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i20);
                            int i21 = MessagesController.getInstance(i19).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i21 == 0 || message2.id > i21) {
                                MessageObject messageObject = (MessageObject) arrayList.get(i20);
                                if (!arrayList4.isEmpty()) {
                                    while (i12 < arrayList4.size()) {
                                        MessageObject messageObject2 = (MessageObject) arrayList4.get(i12);
                                        i12 = (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) ? i12 + 1 : 0;
                                    }
                                }
                                arrayList3.add(messageObject);
                                Integer num = (message2.out ? MessagesController.getInstance(i19).dialogs_read_outbox_max : MessagesController.getInstance(i19).dialogs_read_inbox_max).get(Long.valueOf(MessageObject.getDialogId(message2)));
                                if (num != null) {
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                        }
                        zVar2.J = true;
                        zVar2.S = messages_messages2.messages.size() != 20;
                        if (i14 > 0) {
                            zVar2.c0 = i14;
                            if (zVar2.b0 != i14) {
                                zVar2.s.clear();
                            }
                            if (zVar2.a0 != i14) {
                                sVar2.b();
                            }
                        }
                        sVar2.f(zVar2.s, zVar2.r0);
                        rx rxVar2 = zVar2.Q;
                        if (rxVar2 != null) {
                            i11 = 1;
                            rxVar2.d(zVar2.z0 > 0, true);
                            zVar2.Q.c();
                        } else {
                            i11 = 1;
                        }
                        zVar2.C0 = i11;
                        zVar2.D0 = i11;
                        i10 = 0;
                        zVar2.d = false;
                        pf.v vVar = zVar2.A0;
                        if (vVar != null) {
                            String str3 = zVar2.V;
                            TextView textView = vVar.a;
                            int i22 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i22, objArr));
                        }
                        zVar2.l();
                        zVar2.K = i10;
                        break;
                    }
                }
                i10 = 0;
                zVar2.K = i10;
                break;
        }
    }

    public /* synthetic */ l7(pf.z zVar, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.a = i12;
        this.f = zVar;
        this.b = i10;
        this.c = i11;
        this.h = tL_error;
        this.n = str;
        this.d = tLObject;
        this.r = tLMethod;
        this.e = arrayList;
    }
}
