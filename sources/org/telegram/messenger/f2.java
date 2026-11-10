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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f2 extends c1 {
    public static volatile f2[] f = new f2[4];
    public final g6.d0 a;
    public final g6.d0 b;
    public final Set c;
    public final LongSparseArray d;
    public final SharedPreferences e;

    public f2(int i7) {
        super(i7);
        this.a = new g6.d0(24);
        this.b = new g6.d0(24);
        this.c = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new LongSparseArray();
        this.e = t0.b.getSharedPreferences("bot_drafts" + i7, 0);
    }

    public static f2 b(int i7) {
        f2 f2Var;
        f2 f2Var2 = f[i7];
        if (f2Var2 != null) {
            return f2Var2;
        }
        synchronized (f2.class) {
            try {
                f2Var = f[i7];
                if (f2Var == null) {
                    f2[] f2VarArr = f;
                    f2 f2Var3 = new f2(i7);
                    f2VarArr[i7] = f2Var3;
                    f2Var = f2Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f2Var;
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
        long j3;
        long j10;
        String str;
        long E;
        if (list == null || list.isEmpty() || this.c.remove(tLObject)) {
            return true;
        }
        boolean z9 = tLObject instanceof TLRPC.TL_messages_sendMessage;
        if (z9) {
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
            final long n10 = m5.n(inputPeer);
            if (inputPeer != null || n10 <= 0 || !t10.v(getMessagesController().a2(Long.valueOf(n10)))) {
                return true;
            }
            final long[] jArr = new long[list.size()];
            for (int i7 = 0; i7 < list.size(); i7++) {
                jArr[i7] = ((ij) list.get(i7)).e1();
            }
            if (z9) {
                j10 = ((TLRPC.TL_messages_sendMessage) tLObject).random_id;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                j10 = ((TLRPC.TL_messages_sendMedia) tLObject).random_id;
            } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                j10 = ((TL_ephemeral.TL_sendMessage) tLObject).random_id;
            } else {
                if (!(tLObject instanceof TLRPC.TL_messages_sendInlineBotResult)) {
                    if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                        ArrayList<Long> arrayList = ((TLRPC.TL_messages_forwardMessages) tLObject).random_id;
                        int size = arrayList.size();
                        long j11 = 0;
                        j3 = 0;
                        int i10 = 0;
                        while (i10 < size) {
                            Long l10 = arrayList.get(i10);
                            i10++;
                            j11 = ui.p(j11, l10.longValue());
                            inputPeer = inputPeer;
                        }
                        inputPeer3 = inputPeer;
                        j10 = j11;
                    } else {
                        inputPeer3 = inputPeer;
                        j3 = 0;
                        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            ArrayList<TLRPC.TL_inputSingleMedia> arrayList2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                            int size2 = arrayList2.size();
                            int i11 = 0;
                            j10 = 0;
                            while (i11 < size2) {
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia = arrayList2.get(i11);
                                i11++;
                                j10 = ui.p(j10, tL_inputSingleMedia.random_id);
                            }
                        } else {
                            j10 = 0;
                        }
                    }
                    if (!((!z9 ? ((TLRPC.TL_messages_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject).reply_to : tLObject instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_forwardMessages ? ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to : null) instanceof TLRPC.TL_inputReplyToMessage)) {
                        return true;
                    }
                    if ((tLObject instanceof TLRPC.TL_messages_forwardMessages) && ((TLRPC.TL_messages_forwardMessages) tLObject).top_msg_id != 0) {
                        return true;
                    }
                    if (z9) {
                        str = ((TLRPC.TL_messages_sendMessage) tLObject).message;
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        str = ((TLRPC.TL_messages_sendMedia) tLObject).message;
                    } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                        str = ((TL_ephemeral.TL_sendMessage) tLObject).message;
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            ArrayList<TLRPC.TL_inputSingleMedia> arrayList3 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                            int size3 = arrayList3.size();
                            int i12 = 0;
                            while (i12 < size3) {
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia2 = arrayList3.get(i12);
                                i12++;
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia3 = tL_inputSingleMedia2;
                                if (!TextUtils.isEmpty(tL_inputSingleMedia3.message)) {
                                    str = tL_inputSingleMedia3.message;
                                    break;
                                }
                            }
                        }
                        str = null;
                    }
                    if (j10 != j3) {
                        E = ~j10;
                    } else {
                        getSendMessagesHelper().getClass();
                        E = gz.E();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = id.M0(2131743980, null);
                    } else if (str.length() > 16) {
                        str = str.substring(0, 16) + "...";
                    }
                    final String str2 = str;
                    sr srVar = new sr() { // from class: org.telegram.messenger.w1
                        @Override // org.telegram.messenger.sr
                        public final void a(int i13) {
                            f2 f2Var = f2.this;
                            TLObject tLObject2 = tLObject;
                            Runnable runnable2 = runnable;
                            if (i13 <= 0) {
                                f2Var.c.add(tLObject2);
                                g0.h3(runnable2);
                                return;
                            }
                            boolean z10 = tLObject2 instanceof TLRPC.TL_messages_forwardMessages;
                            if (z10) {
                                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject2;
                                tL_messages_forwardMessages.top_msg_id = i13;
                                tL_messages_forwardMessages.flags |= 512;
                            } else {
                                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                                tL_inputReplyToMessage.reply_to_msg_id = i13;
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
                                } else if (z10) {
                                    TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = (TLRPC.TL_messages_forwardMessages) tLObject2;
                                    tL_messages_forwardMessages2.reply_to = tL_inputReplyToMessage;
                                    tL_messages_forwardMessages2.flags |= 1;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject2;
                                    tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendMultiMedia.flags |= 1;
                                }
                            }
                            f2Var.getMessagesStorage().a.c(new z1(f2Var, jArr, n10, i13, runnable2));
                        }
                    };
                    final long n11 = m5.n(inputPeer3);
                    LongSparseArray longSparseArray = this.d;
                    List list2 = (List) longSparseArray.get(n11);
                    if (list2 != null) {
                        list2.add(srVar);
                        return false;
                    }
                    int i13 = 1;
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(srVar);
                    longSparseArray.put(n11, arrayList4);
                    TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                    tL_messages_createForumTopic.title = TextUtils.isEmpty(str2) ? "#New Chat" : str2;
                    tL_messages_createForumTopic.title_missing = true;
                    tL_messages_createForumTopic.peer = inputPeer3;
                    tL_messages_createForumTopic.random_id = E;
                    final long j12 = E;
                    getConnectionsManager().sendRequestTyped(tL_messages_createForumTopic, new d3.b(i13), new v10() { // from class: org.telegram.messenger.y1
                        @Override // org.telegram.messenger.v10
                        public final void a(Object obj, Object obj2) {
                            ArrayList<TLRPC.Update> arrayList5;
                            TLRPC.Updates updates = (TLRPC.Updates) obj;
                            f2 f2Var = f2.this;
                            long j13 = n11;
                            if (updates == null) {
                                f2Var.f(-1, j13);
                                return;
                            }
                            ArrayList<TLRPC.Update> arrayList6 = updates.updates;
                            int size4 = arrayList6.size();
                            int i14 = 0;
                            int i15 = 0;
                            int i16 = 0;
                            while (i16 < size4) {
                                TLRPC.Update update = arrayList6.get(i16);
                                i16++;
                                TLRPC.Update update2 = update;
                                if (update2 instanceof TL_update.TL_updateMessageID) {
                                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                                    arrayList5 = arrayList6;
                                    if (tL_updateMessageID.random_id == j12) {
                                        i14 = tL_updateMessageID.id;
                                    }
                                } else {
                                    arrayList5 = arrayList6;
                                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                                        TLRPC.Message message = ((TL_update.TL_updateNewMessage) update2).message;
                                        if (i15 == 0 && message != null && (message.action instanceof TLRPC.TL_messageActionTopicCreate) && ij.B0(message) == j13) {
                                            i15 = message.id;
                                        }
                                    }
                                }
                                arrayList6 = arrayList5;
                            }
                            if (i14 == 0) {
                                i14 = i15;
                            }
                            f2Var.getMessagesController().O3(updates, false);
                            if (i14 == 0) {
                                f2Var.f(-1, j13);
                                return;
                            }
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            String str3 = str2;
                            tL_messageActionTopicCreate.title = str3;
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = f2Var.getMessagesController().z1(j13);
                            tL_messageService.dialog_id = j13;
                            tL_messageService.id = i14;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            tL_forumTopic.id = i14;
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str3;
                            tL_forumTopic.top_message = i14;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = f2Var.getMessagesController().z1(f2Var.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = 0;
                            tL_forumTopic.title_missing = true;
                            f2Var.getMessagesController().q7.q(j13, tL_forumTopic, true);
                            f2Var.f(i14, j13);
                            f2Var.getNotificationCenter().k(qs.J5, new d2(j13, i14));
                        }
                    });
                    return false;
                }
                j10 = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).random_id;
            }
            inputPeer3 = inputPeer;
            j3 = 0;
            if (!((!z9 ? ((TLRPC.TL_messages_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject).reply_to : tLObject instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_forwardMessages ? ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to : null) instanceof TLRPC.TL_inputReplyToMessage)) {
            }
        }
        inputPeer = inputPeer2;
        final long n102 = m5.n(inputPeer);
        return inputPeer != null ? true : true;
    }

    public final boolean c(int i7, long j3) {
        LongSparseArray V = this.a.V(j3, i7);
        if (V != null && V.size() > 0) {
            int size = V.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!((a2) V.valueAt(i10)).e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j3, long j10) {
        return this.e.getBoolean(j3 + "_" + j10, false);
    }

    public final void e(long j3, int i7, long j10) {
        long j11 = i7;
        a2 a2Var = (a2) this.a.a0(j3, j11, j10);
        if (a2Var == null) {
            return;
        }
        getNotificationCenter().k(qs.L5, new b2(j3, a2Var.b, j11));
    }

    public final void f(int i7, long j3) {
        LongSparseArray longSparseArray = this.d;
        List list = (List) longSparseArray.get(j3);
        if (list != null) {
            longSparseArray.remove(j3);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((sr) it.next()).a(i7);
            }
        }
    }

    public final void g(int i7, long j3) {
        long j10;
        long j11;
        long j12 = i7;
        LongSparseArray V = this.a.V(j3, j12);
        if (V == null) {
            return;
        }
        int size = V.size();
        int i10 = 0;
        while (i10 < size) {
            a2 a2Var = (a2) V.valueAt(i10);
            if (a2Var.e) {
                long j13 = j12;
                j10 = j3;
                getNotificationCenter().k(qs.L5, new b2(j10, a2Var.b, j13));
                this.a.a0(j10, j13, a2Var.a);
                j11 = j13;
                i10--;
                size--;
            } else {
                j10 = j3;
                j11 = j12;
            }
            i10++;
            j3 = j10;
            j12 = j11;
        }
    }

    public final void h(long j3, long j10, boolean z9) {
        this.e.edit().putBoolean(j3 + "_" + j10, z9).apply();
    }
}
