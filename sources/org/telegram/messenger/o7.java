package org.telegram.messenger;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ o7(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
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
                uf.z zVar = (uf.z) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                uf.s sVar = zVar.g0;
                ArrayList arrayList2 = zVar.E;
                int i16 = zVar.p0;
                if (i15 == zVar.Q && (i14 <= 0 || i14 == zVar.a0)) {
                    zVar.A0--;
                    if (tL_error == null) {
                        zVar.Y = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i16).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i16).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        zVar.Z = messages_messages.next_rate;
                        for (int i17 = 0; i17 < messages_messages.messages.size(); i17++) {
                            TLRPC.Message message = messages_messages.messages.get(i17);
                            int i18 = MessagesController.getInstance(i16).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i18 == 0 || message.id > i18) {
                                arrayList2.add((MessageObject) arrayList.get(i17));
                            }
                        }
                        zVar.K = true;
                        zVar.U = messages_messages.messages.size() != 20;
                        if (i14 > 0) {
                            zVar.d0 = i14;
                            if (zVar.c0 != i14) {
                                zVar.s.clear();
                            }
                            if (zVar.b0 != i14) {
                                sVar.b();
                            }
                        }
                        sVar.f(zVar.s, zVar.s0);
                        ay ayVar = zVar.R;
                        if (ayVar != null) {
                            ayVar.d(zVar.A0 > 0, true);
                            zVar.R.c();
                        }
                        zVar.l();
                    }
                }
                zVar.N = 0;
                break;
            default:
                uf.z zVar2 = (uf.z) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                uf.s sVar2 = zVar2.g0;
                ArrayList arrayList3 = zVar2.F;
                ArrayList arrayList4 = zVar2.E;
                int i19 = zVar2.p0;
                if (i15 == zVar2.M && (i14 <= 0 || i14 == zVar2.a0)) {
                    zVar2.A0--;
                    if (tL_error2 == null) {
                        zVar2.Y = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i19).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i19).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i19).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        zVar2.Z = messages_messages2.next_rate;
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
                        zVar2.K = true;
                        zVar2.T = messages_messages2.messages.size() != 20;
                        if (i14 > 0) {
                            zVar2.d0 = i14;
                            if (zVar2.c0 != i14) {
                                zVar2.s.clear();
                            }
                            if (zVar2.b0 != i14) {
                                sVar2.b();
                            }
                        }
                        sVar2.f(zVar2.s, zVar2.s0);
                        ay ayVar2 = zVar2.R;
                        if (ayVar2 != null) {
                            i11 = 1;
                            ayVar2.d(zVar2.A0 > 0, true);
                            zVar2.R.c();
                        } else {
                            i11 = 1;
                        }
                        zVar2.D0 = i11;
                        zVar2.E0 = i11;
                        i10 = 0;
                        zVar2.d = false;
                        uf.v vVar = zVar2.B0;
                        if (vVar != null) {
                            String str3 = zVar2.W;
                            TextView textView = vVar.a;
                            int i22 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i22, objArr));
                        }
                        zVar2.l();
                        zVar2.L = i10;
                        break;
                    }
                }
                i10 = 0;
                zVar2.L = i10;
                break;
        }
    }

    public /* synthetic */ o7(uf.z zVar, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
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
