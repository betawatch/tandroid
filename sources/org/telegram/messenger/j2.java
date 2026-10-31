package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j2 extends f1 {
    public static volatile j2[] f = new j2[4];
    public final l2.f a;
    public final l2.f b;
    public final Set c;
    public final LongSparseArray d;
    public final SharedPreferences e;

    public j2(int i10) {
        super(i10);
        this.a = new l2.f(9);
        this.b = new l2.f(9);
        this.c = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new LongSparseArray();
        this.e = w0.b.getSharedPreferences("bot_drafts" + i10, 0);
    }

    public static j2 b(int i10) {
        j2 j2Var;
        j2 j2Var2 = f[i10];
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (j2.class) {
            try {
                j2Var = f[i10];
                if (j2Var == null) {
                    j2[] j2VarArr = f;
                    j2 j2Var3 = new j2(i10);
                    j2VarArr[i10] = j2Var3;
                    j2Var = j2Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(final TLObject tLObject, List list, final Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        TLRPC.InputPeer inputPeer3;
        long j10;
        long j11;
        String str;
        long E;
        if (list == null || list.isEmpty() || this.c.remove(tLObject)) {
            return true;
        }
        boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
        if (z10) {
            inputPeer2 = ((TLRPC.TL_messages_sendMessage) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            inputPeer2 = ((TLRPC.TL_messages_sendMedia) tLObject).peer;
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            inputPeer2 = ((TL_ephemeral.TL_sendMessage) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            inputPeer2 = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            inputPeer2 = ((TLRPC.TL_messages_forwardMessages) tLObject).to_peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            inputPeer2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).peer;
        } else {
            inputPeer = null;
            final long n10 = o5.n(inputPeer);
            if (inputPeer != null || n10 <= 0 || !h20.v(getMessagesController().Z1(Long.valueOf(n10)))) {
                return true;
            }
            final long[] jArr = new long[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                jArr[i10] = ((jj) list.get(i10)).f1();
            }
            if (z10) {
                j11 = ((TLRPC.TL_messages_sendMessage) tLObject).random_id;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                j11 = ((TLRPC.TL_messages_sendMedia) tLObject).random_id;
            } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                j11 = ((TL_ephemeral.TL_sendMessage) tLObject).random_id;
            } else {
                if (!(tLObject instanceof TLRPC.TL_messages_sendInlineBotResult)) {
                    if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                        ArrayList<Long> arrayList = ((TLRPC.TL_messages_forwardMessages) tLObject).random_id;
                        int size = arrayList.size();
                        long j12 = 0;
                        j10 = 0;
                        int i11 = 0;
                        while (i11 < size) {
                            Long l4 = arrayList.get(i11);
                            i11++;
                            j12 = ui.p(j12, l4.longValue());
                            inputPeer = inputPeer;
                        }
                        inputPeer3 = inputPeer;
                        j11 = j12;
                    } else {
                        inputPeer3 = inputPeer;
                        j10 = 0;
                        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            ArrayList<TLRPC.TL_inputSingleMedia> arrayList2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                            int size2 = arrayList2.size();
                            int i12 = 0;
                            j11 = 0;
                            while (i12 < size2) {
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia = arrayList2.get(i12);
                                i12++;
                                j11 = ui.p(j11, tL_inputSingleMedia.random_id);
                            }
                        } else {
                            j11 = 0;
                        }
                    }
                    if (!((!z10 ? ((TLRPC.TL_messages_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject).reply_to : tLObject instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_forwardMessages ? ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to : null) instanceof TLRPC.TL_inputReplyToMessage)) {
                        return true;
                    }
                    if ((tLObject instanceof TLRPC.TL_messages_forwardMessages) && ((TLRPC.TL_messages_forwardMessages) tLObject).top_msg_id != 0) {
                        return true;
                    }
                    if (z10) {
                        str = ((TLRPC.TL_messages_sendMessage) tLObject).message;
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        str = ((TLRPC.TL_messages_sendMedia) tLObject).message;
                    } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                        str = ((TL_ephemeral.TL_sendMessage) tLObject).message;
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            ArrayList<TLRPC.TL_inputSingleMedia> arrayList3 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                            int size3 = arrayList3.size();
                            int i13 = 0;
                            while (i13 < size3) {
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia2 = arrayList3.get(i13);
                                i13++;
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia3 = tL_inputSingleMedia2;
                                if (!TextUtils.isEmpty(tL_inputSingleMedia3.message)) {
                                    str = tL_inputSingleMedia3.message;
                                    break;
                                }
                            }
                        }
                        str = null;
                    }
                    if (j11 != j10) {
                        E = ~j11;
                    } else {
                        getSendMessagesHelper().getClass();
                        E = qz.E();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = cd.L0(2131744005, null);
                    } else if (str.length() > 16) {
                        str = str.substring(0, 16) + "...";
                    }
                    final String str2 = str;
                    bs bsVar = new bs() { // from class: org.telegram.messenger.a2
                        @Override // org.telegram.messenger.bs
                        public final void a(int i14) {
                            j2 j2Var = j2.this;
                            TLObject tLObject2 = tLObject;
                            Runnable runnable2 = runnable;
                            if (i14 <= 0) {
                                j2Var.c.add(tLObject2);
                                i0.g3(runnable2);
                                return;
                            }
                            boolean z11 = tLObject2 instanceof TLRPC.TL_messages_forwardMessages;
                            if (z11) {
                                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject2;
                                tL_messages_forwardMessages.top_msg_id = i14;
                                tL_messages_forwardMessages.flags |= 512;
                            } else {
                                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                                tL_inputReplyToMessage.reply_to_msg_id = i14;
                                if (tLObject2 instanceof TLRPC.TL_messages_sendMessage) {
                                    TLRPC.TL_messages_sendMessage tL_messages_sendMessage = (TLRPC.TL_messages_sendMessage) tLObject2;
                                    tL_messages_sendMessage.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendMessage.flags |= 1;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                                    tL_messages_sendMedia.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendMedia.flags |= 1;
                                } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject2;
                                    tL_sendMessage.reply_to = tL_inputReplyToMessage;
                                    tL_sendMessage.flags |= 32;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_sendInlineBotResult) {
                                    TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult = (TLRPC.TL_messages_sendInlineBotResult) tLObject2;
                                    tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendInlineBotResult.flags |= 1;
                                } else if (z11) {
                                    TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = (TLRPC.TL_messages_forwardMessages) tLObject2;
                                    tL_messages_forwardMessages2.reply_to = tL_inputReplyToMessage;
                                    tL_messages_forwardMessages2.flags |= 1;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject2;
                                    tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendMultiMedia.flags |= 1;
                                }
                            }
                            j2Var.getMessagesStorage().a.c(new d2(j2Var, jArr, n10, i14, runnable2));
                        }
                    };
                    final long n11 = o5.n(inputPeer3);
                    LongSparseArray longSparseArray = this.d;
                    List list2 = (List) longSparseArray.get(n11);
                    if (list2 != null) {
                        list2.add(bsVar);
                        return false;
                    }
                    int i14 = 1;
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(bsVar);
                    longSparseArray.put(n11, arrayList4);
                    TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                    tL_messages_createForumTopic.title = TextUtils.isEmpty(str2) ? "#New Chat" : str2;
                    tL_messages_createForumTopic.title_missing = true;
                    tL_messages_createForumTopic.peer = inputPeer3;
                    tL_messages_createForumTopic.random_id = E;
                    final long j13 = E;
                    getConnectionsManager().sendRequestTyped(tL_messages_createForumTopic, new a3.b(i14), new j20() { // from class: org.telegram.messenger.c2
                        @Override // org.telegram.messenger.j20
                        public final void a(Object obj, Object obj2) {
                            ArrayList<TLRPC.Update> arrayList5;
                            TLRPC.Updates updates = (TLRPC.Updates) obj;
                            j2 j2Var = j2.this;
                            long j14 = n11;
                            if (updates == null) {
                                j2Var.f(-1, j14);
                                return;
                            }
                            ArrayList<TLRPC.Update> arrayList6 = updates.updates;
                            int size4 = arrayList6.size();
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = 0;
                            while (i17 < size4) {
                                TLRPC.Update update = arrayList6.get(i17);
                                i17++;
                                TLRPC.Update update2 = update;
                                if (update2 instanceof TL_update.TL_updateMessageID) {
                                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                                    arrayList5 = arrayList6;
                                    if (tL_updateMessageID.random_id == j13) {
                                        i15 = tL_updateMessageID.id;
                                    }
                                } else {
                                    arrayList5 = arrayList6;
                                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                                        TLRPC.Message message = ((TL_update.TL_updateNewMessage) update2).message;
                                        if (i16 == 0 && message != null && (message.action instanceof TLRPC.TL_messageActionTopicCreate) && jj.B0(message) == j14) {
                                            i16 = message.id;
                                        }
                                    }
                                }
                                arrayList6 = arrayList5;
                            }
                            if (i15 == 0) {
                                i15 = i16;
                            }
                            j2Var.getMessagesController().L3(updates, false);
                            if (i15 == 0) {
                                j2Var.f(-1, j14);
                                return;
                            }
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            String str3 = str2;
                            tL_messageActionTopicCreate.title = str3;
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = j2Var.getMessagesController().y1(j14);
                            tL_messageService.dialog_id = j14;
                            tL_messageService.id = i15;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            tL_forumTopic.id = i15;
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str3;
                            tL_forumTopic.top_message = i15;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = j2Var.getMessagesController().y1(j2Var.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = 0;
                            tL_forumTopic.title_missing = true;
                            j2Var.getMessagesController().r7.q(j14, tL_forumTopic, true);
                            j2Var.f(i15, j14);
                            j2Var.getNotificationCenter().k(zs.J5, new h2(j14, i15));
                        }
                    });
                    return false;
                }
                j11 = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).random_id;
            }
            inputPeer3 = inputPeer;
            j10 = 0;
            if (!((!z10 ? ((TLRPC.TL_messages_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject).reply_to : tLObject instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_forwardMessages ? ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to : null) instanceof TLRPC.TL_inputReplyToMessage)) {
            }
        }
        inputPeer = inputPeer2;
        final long n102 = o5.n(inputPeer);
        return inputPeer != null ? true : true;
    }

    public final boolean c(int i10, long j10) {
        LongSparseArray s10 = this.a.s(j10, i10);
        if (s10 != null && s10.size() > 0) {
            int size = s10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!((e2) s10.valueAt(i11)).e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j10, long j11) {
        return this.e.getBoolean(j10 + "_" + j11, false);
    }

    public final void e(long j10, int i10, long j11) {
        long j12 = i10;
        e2 e2Var = (e2) this.a.P(j10, j12, j11);
        if (e2Var == null) {
            return;
        }
        getNotificationCenter().k(zs.L5, new f2(j10, e2Var.b, j12));
    }

    public final void f(int i10, long j10) {
        LongSparseArray longSparseArray = this.d;
        List list = (List) longSparseArray.get(j10);
        if (list != null) {
            longSparseArray.remove(j10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((bs) it.next()).a(i10);
            }
        }
    }

    public final void g(int i10, long j10) {
        long j11;
        long j12;
        long j13 = i10;
        LongSparseArray s10 = this.a.s(j10, j13);
        if (s10 == null) {
            return;
        }
        int size = s10.size();
        int i11 = 0;
        while (i11 < size) {
            e2 e2Var = (e2) s10.valueAt(i11);
            if (e2Var.e) {
                long j14 = j13;
                j11 = j10;
                getNotificationCenter().k(zs.L5, new f2(j11, e2Var.b, j14));
                this.a.P(j11, j14, e2Var.a);
                j12 = j14;
                i11--;
                size--;
            } else {
                j11 = j10;
                j12 = j13;
            }
            i11++;
            j10 = j11;
            j13 = j12;
        }
    }

    public final void h(long j10, long j11, boolean z10) {
        this.e.edit().putBoolean(j10 + "_" + j11, z10).apply();
    }
}
