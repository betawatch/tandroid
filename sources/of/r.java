package of;

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
import org.telegram.ui.ox;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ r(f0 f0Var, int i9, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = f0Var;
        this.c = i9;
        this.d = i10;
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
        int i9;
        int i10;
        int i11;
        int i12 = this.a;
        ArrayList arrayList = this.n;
        TLObject tLObject = this.h;
        int i13 = this.d;
        int i14 = this.c;
        TLObject tLObject2 = this.r;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                f0 f0Var = (f0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                w wVar = f0Var.f0;
                ArrayList arrayList2 = f0Var.D;
                int i15 = f0Var.o0;
                if (i14 == f0Var.P && (i13 <= 0 || i13 == f0Var.Z)) {
                    f0Var.z0--;
                    if (tL_error == null) {
                        f0Var.X = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i15).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i15).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i15).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        f0Var.Y = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = MessagesController.getInstance(i15).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i17 == 0 || message.id > i17) {
                                arrayList2.add((MessageObject) arrayList.get(i16));
                            }
                        }
                        f0Var.J = true;
                        f0Var.T = messages_messages.messages.size() != 20;
                        if (i13 > 0) {
                            f0Var.c0 = i13;
                            if (f0Var.b0 != i13) {
                                f0Var.s.clear();
                            }
                            if (f0Var.a0 != i13) {
                                wVar.b();
                            }
                        }
                        wVar.f(f0Var.s, f0Var.r0);
                        ox oxVar = f0Var.Q;
                        if (oxVar != null) {
                            oxVar.d(f0Var.z0 > 0, true);
                            f0Var.Q.c();
                        }
                        f0Var.l();
                    }
                }
                f0Var.M = 0;
                break;
            case 1:
                f0 f0Var2 = (f0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                w wVar2 = f0Var2.f0;
                ArrayList arrayList3 = f0Var2.E;
                ArrayList arrayList4 = f0Var2.D;
                int i18 = f0Var2.o0;
                if (i14 == f0Var2.L && (i13 <= 0 || i13 == f0Var2.Z)) {
                    f0Var2.z0--;
                    if (tL_error2 == null) {
                        f0Var2.X = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i18).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i18).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i18).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        f0Var2.Y = messages_messages2.next_rate;
                        for (int i19 = 0; i19 < messages_messages2.messages.size(); i19++) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = MessagesController.getInstance(i18).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i20 == 0 || message2.id > i20) {
                                MessageObject messageObject = (MessageObject) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    while (i11 < arrayList4.size()) {
                                        MessageObject messageObject2 = (MessageObject) arrayList4.get(i11);
                                        i11 = (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) ? i11 + 1 : 0;
                                    }
                                }
                                arrayList3.add(messageObject);
                                Integer num = (message2.out ? MessagesController.getInstance(i18).dialogs_read_outbox_max : MessagesController.getInstance(i18).dialogs_read_inbox_max).get(Long.valueOf(MessageObject.getDialogId(message2)));
                                if (num != null) {
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                        }
                        f0Var2.J = true;
                        f0Var2.S = messages_messages2.messages.size() != 20;
                        if (i13 > 0) {
                            f0Var2.c0 = i13;
                            if (f0Var2.b0 != i13) {
                                f0Var2.s.clear();
                            }
                            if (f0Var2.a0 != i13) {
                                wVar2.b();
                            }
                        }
                        wVar2.f(f0Var2.s, f0Var2.r0);
                        ox oxVar2 = f0Var2.Q;
                        if (oxVar2 != null) {
                            i10 = 1;
                            oxVar2.d(f0Var2.z0 > 0, true);
                            f0Var2.Q.c();
                        } else {
                            i10 = 1;
                        }
                        f0Var2.C0 = i10;
                        f0Var2.D0 = i10;
                        i9 = 0;
                        f0Var2.d = false;
                        b0 b0Var = f0Var2.A0;
                        if (b0Var != null) {
                            String str3 = f0Var2.V;
                            TextView textView = b0Var.a;
                            int i21 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i10];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i21, objArr));
                        }
                        f0Var2.l();
                        f0Var2.K = i9;
                        break;
                    }
                }
                i9 = 0;
                f0Var2.K = i9;
                break;
            default:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.h, this.n, this.c, (a0.h) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.d);
                break;
        }
    }

    public /* synthetic */ r(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i9, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.a = 2;
        this.b = mediaDataController;
        this.h = tLObject;
        this.n = arrayList;
        this.c = i9;
        this.e = hVar;
        this.f = stickerSet;
        this.r = tL_messages_allStickers;
        this.d = i10;
    }
}
