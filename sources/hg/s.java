package hg;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ s(i0 i0Var, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.a = i12;
        this.b = i0Var;
        this.c = i10;
        this.d = i11;
        this.e = tL_error;
        this.f = str;
        this.h = tLObject;
        this.r = tLMethod;
        this.n = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        ArrayList arrayList = this.n;
        TLObject tLObject = this.h;
        int i14 = this.d;
        int i15 = this.c;
        TLObject tLObject2 = this.r;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                i0 i0Var = (i0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                z zVar = i0Var.j0;
                ArrayList arrayList2 = i0Var.H;
                int i16 = i0Var.s0;
                if (i15 == i0Var.T && (i14 <= 0 || i14 == i0Var.d0)) {
                    i0Var.D0--;
                    if (tL_error == null) {
                        i0Var.b0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i16).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i16).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        i0Var.c0 = messages_messages.next_rate;
                        for (int i17 = 0; i17 < messages_messages.messages.size(); i17++) {
                            TLRPC.Message message = messages_messages.messages.get(i17);
                            int i18 = MessagesController.getInstance(i16).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i18 == 0 || message.id > i18) {
                                arrayList2.add((MessageObject) arrayList.get(i17));
                            }
                        }
                        i0Var.N = true;
                        i0Var.X = messages_messages.messages.size() != 20;
                        if (i14 > 0) {
                            i0Var.g0 = i14;
                            if (i0Var.f0 != i14) {
                                i0Var.s.clear();
                            }
                            if (i0Var.e0 != i14) {
                                zVar.b();
                            }
                        }
                        zVar.f(i0Var.s, i0Var.v0);
                        gy gyVar = i0Var.U;
                        if (gyVar != null) {
                            gyVar.d(i0Var.D0 > 0, true);
                            i0Var.U.c();
                        }
                        i0Var.l();
                    }
                }
                i0Var.Q = 0;
                break;
            case 1:
                i0 i0Var2 = (i0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                z zVar2 = i0Var2.j0;
                ArrayList arrayList3 = i0Var2.I;
                ArrayList arrayList4 = i0Var2.H;
                int i19 = i0Var2.s0;
                if (i15 == i0Var2.P && (i14 <= 0 || i14 == i0Var2.d0)) {
                    i0Var2.D0--;
                    if (tL_error2 == null) {
                        i0Var2.b0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i19).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i19).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i19).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        i0Var2.c0 = messages_messages2.next_rate;
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
                        i0Var2.N = true;
                        i0Var2.W = messages_messages2.messages.size() != 20;
                        if (i14 > 0) {
                            i0Var2.g0 = i14;
                            if (i0Var2.f0 != i14) {
                                i0Var2.s.clear();
                            }
                            if (i0Var2.e0 != i14) {
                                zVar2.b();
                            }
                        }
                        zVar2.f(i0Var2.s, i0Var2.v0);
                        gy gyVar2 = i0Var2.U;
                        if (gyVar2 != null) {
                            i11 = 1;
                            gyVar2.d(i0Var2.D0 > 0, true);
                            i0Var2.U.c();
                        } else {
                            i11 = 1;
                        }
                        i0Var2.G0 = i11;
                        i0Var2.H0 = i11;
                        i10 = 0;
                        i0Var2.d = false;
                        e0 e0Var = i0Var2.E0;
                        if (e0Var != null) {
                            String str3 = i0Var2.Z;
                            TextView textView = e0Var.a;
                            int i22 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i22, objArr));
                        }
                        i0Var2.l();
                        i0Var2.O = i10;
                        break;
                    }
                }
                i10 = 0;
                i0Var2.O = i10;
                break;
            default:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.h, this.n, this.c, (a0.i) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.d);
                break;
        }
    }

    public /* synthetic */ s(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.i iVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.a = 2;
        this.b = mediaDataController;
        this.h = tLObject;
        this.n = arrayList;
        this.c = i10;
        this.e = iVar;
        this.f = stickerSet;
        this.r = tL_messages_allStickers;
        this.d = i11;
    }
}
