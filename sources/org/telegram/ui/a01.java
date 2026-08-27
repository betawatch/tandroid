package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g01 g01Var = (g01) this.b;
                String str = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = g01Var.e;
                if (str.equals(g01Var.y)) {
                    if (!g01Var.w && (n2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) n2Var).L.b.getImageReceiver().startAnimation();
                            ((ProfileActivity) n2Var).L.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    g01Var.w = true;
                    g01Var.r = arrayList;
                    g01Var.s = arrayList2;
                    g01Var.n = arrayList3;
                    g01Var.l();
                    if (n2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) n2Var).L.b.getImageReceiver().startAnimation();
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                break;
            case 1:
                a61 a61Var = (a61) this.b;
                View view = (View) this.c;
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                j51 j51Var = (j51) this.f;
                a61Var.getClass();
                a61Var.p(view, Long.valueOf(t5Var.documentId), document, j51Var.v, null);
                break;
            case 2:
                k61 k61Var = (k61) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                k61Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    k61Var.T(user, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 3:
                pf.k1 k1Var = (pf.k1) this.b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                ArrayList arrayList4 = (ArrayList) this.d;
                LongSparseArray longSparseArray = (LongSparseArray) this.f;
                k1Var.getClass();
                String str2 = tL_messages_getStickers.emoticon;
                pf.l1 l1Var = k1Var.a;
                if (str2.equals(l1Var.N)) {
                    l1Var.K = 0;
                    if (tLObject2 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                        int size = arrayList4.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i10);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList4.add(document2);
                            }
                        }
                        if (size != arrayList4.size()) {
                            l1Var.E.put(arrayList4, l1Var.N);
                            if (size == 0) {
                                l1Var.F.add(arrayList4);
                            }
                            l1Var.l();
                            break;
                        }
                    }
                }
                break;
            case 4:
                qf.q1 q1Var = (qf.q1) this.b;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.f;
                Runnable runnable = (Runnable) this.c;
                q1Var.e = false;
                int i11 = q1Var.a;
                MessagesController.getInstance(i11).putUsers(arrayList5, true);
                MessagesController.getInstance(i11).putChats(arrayList6, true);
                ArrayList arrayList8 = q1Var.b;
                arrayList8.clear();
                arrayList8.addAll(arrayList7);
                if (runnable != null) {
                    runnable.run();
                } else {
                    q1Var.i(null, false);
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 5:
                qf.q1 q1Var2 = (qf.q1) this.b;
                ArrayList<TLRPC.User> arrayList9 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList10 = (ArrayList) this.e;
                qf.p1 p1Var = (qf.p1) this.c;
                MessageObject messageObject = (MessageObject) this.f;
                int i12 = q1Var2.a;
                MessagesController.getInstance(i12).putUsers(arrayList9, true);
                MessagesController.getInstance(i12).putChats(arrayList10, true);
                p1Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(p1Var.b, p1Var.a);
                }
                q1Var2.l();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            default:
                qf.q1 q1Var3 = (qf.q1) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList<Integer> arrayList11 = (ArrayList) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                q1Var3.getClass();
                if (tLObject3 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList12 = ((TLRPC.TL_messages_messages) tLObject3).messages;
                    arrayList11.clear();
                    int size3 = arrayList12.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TLRPC.Message message = arrayList12.get(i13);
                        i13++;
                        arrayList11.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList11;
                    for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(q1Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    FileLog.e("received " + tLObject3 + " " + tL_error2 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
        }
    }

    public /* synthetic */ a01(pf.k1 k1Var, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
        this.a = 3;
        this.b = k1Var;
        this.c = tL_messages_getStickers;
        this.e = tLObject;
        this.d = arrayList;
        this.f = longSparseArray;
    }

    public /* synthetic */ a01(qf.q1 q1Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable) {
        this.a = 4;
        this.b = q1Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
        this.c = runnable;
    }

    public /* synthetic */ a01(qf.q1 q1Var, ArrayList arrayList, ArrayList arrayList2, qf.p1 p1Var, MessageObject messageObject) {
        this.a = 5;
        this.b = q1Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.c = p1Var;
        this.f = messageObject;
    }
}
