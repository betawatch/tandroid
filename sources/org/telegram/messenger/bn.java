package org.telegram.messenger;

import android.graphics.Typeface;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class bn implements Runnable {
    public final /* synthetic */ qp a;
    public final /* synthetic */ TLRPC.TL_messages_dialogs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLRPC.messages_Dialogs d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ Runnable r;

    public /* synthetic */ bn(qp qpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.a = qpVar;
        this.b = tL_messages_dialogs;
        this.c = arrayList;
        this.d = messages_dialogs;
        this.e = i7;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = arrayList4;
        this.r = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r12 == (-r11.id)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (r11.migrated_to != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        SparseArray sparseArray;
        qp qpVar;
        ConcurrentHashMap concurrentHashMap;
        qp qpVar2;
        TLRPC.User user;
        SparseArray sparseArray2;
        TLRPC.Chat chat;
        Integer num;
        Integer num2;
        ArrayList arrayList;
        TLRPC.Message message;
        int i7;
        Integer num3;
        long B0;
        ArrayList arrayList2;
        qp qpVar3 = this.a;
        ConcurrentHashMap concurrentHashMap2 = qpVar3.P;
        ConcurrentHashMap concurrentHashMap3 = qpVar3.O;
        final a0.h hVar = new a0.h();
        final a0.h hVar2 = new a0.h();
        a0.h hVar3 = new a0.h();
        a0.h hVar4 = new a0.h();
        Integer num4 = 0;
        int i10 = 0;
        while (true) {
            tL_messages_dialogs = this.b;
            if (i10 >= tL_messages_dialogs.users.size()) {
                break;
            }
            TLRPC.User user2 = tL_messages_dialogs.users.get(i10);
            hVar3.k(user2, user2.id);
            i10++;
        }
        for (int i11 = 0; i11 < tL_messages_dialogs.chats.size(); i11++) {
            TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i11);
            hVar4.k(chat2, chat2.id);
        }
        final ArrayList arrayList3 = this.c;
        if (arrayList3 != null) {
            sparseArray = new SparseArray();
            int size = arrayList3.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) arrayList3.get(i12);
                sparseArray.put(encryptedChat.id, encryptedChat);
            }
        } else {
            sparseArray = null;
        }
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        while (i13 < tL_messages_dialogs.messages.size()) {
            TLRPC.Message message2 = tL_messages_dialogs.messages.get(i13);
            TLRPC.Peer peer = message2.peer_id;
            int i14 = i13;
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat chat3 = (TLRPC.Chat) hVar4.f(j3);
                if (chat3 != null && chat3.left) {
                    long j10 = qpVar3.z2;
                    if (j10 != 0) {
                    }
                    arrayList2 = arrayList4;
                    num3 = num4;
                }
                num3 = num4;
                ij ijVar = new ij(qpVar3.currentAccount, message2, hVar3, hVar4, false, false);
                arrayList4.add(ijVar);
                B0 = ij.B0(ijVar.k);
                if (hVar2.d(B0)) {
                    arrayList2 = arrayList4;
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayList5.add(ijVar);
                    hVar2.k(arrayList5, B0);
                } else {
                    ((ArrayList) hVar2.f(B0)).add(ijVar);
                    arrayList2 = arrayList4;
                }
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) hVar4.f(j11);
                    if (chat4 != null) {
                    }
                }
                num3 = num4;
                ij ijVar2 = new ij(qpVar3.currentAccount, message2, hVar3, hVar4, false, false);
                arrayList4.add(ijVar2);
                B0 = ij.B0(ijVar2.k);
                if (hVar2.d(B0)) {
                }
            }
            i13 = i14 + 1;
            arrayList4 = arrayList2;
            num4 = num3;
        }
        Integer num5 = num4;
        int i15 = 0;
        while (i15 < tL_messages_dialogs.dialogs.size()) {
            TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i15);
            m5.x(dialog);
            long j12 = dialog.id;
            if (j12 == 0 || (m5.C(j12) && sparseArray != null && sparseArray.get((int) (dialog.id & 4294967295L)) == null)) {
                sparseArray2 = sparseArray;
            } else {
                long j13 = qpVar3.z2;
                if (j13 != 0) {
                    sparseArray2 = sparseArray;
                    if (j13 == dialog.id) {
                        qpVar3.x2 = dialog;
                    }
                } else {
                    sparseArray2 = sparseArray;
                }
                if (dialog.last_message_date == 0 && (arrayList = (ArrayList) hVar2.f(dialog.id)) != null) {
                    int i16 = TLObject.FLAG_31;
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        ij ijVar3 = (ij) arrayList.get(i17);
                        if (ijVar3 != null && (message = ijVar3.k) != null && i16 < (i7 = message.date)) {
                            i16 = i7;
                        }
                    }
                    if (i16 > Integer.MIN_VALUE) {
                        dialog.last_message_date = i16;
                    }
                }
                if (m5.y(dialog)) {
                    TLRPC.Chat chat5 = (TLRPC.Chat) hVar4.f(-dialog.id);
                    if (chat5 != null && chat5.left) {
                        long j14 = qpVar3.z2;
                        if (j14 != 0) {
                            if (j14 != dialog.id) {
                            }
                        }
                    }
                    qpVar3.Y0.put(-dialog.id, dialog.pts);
                    hVar.k(dialog, dialog.id);
                    num = (Integer) concurrentHashMap3.get(Long.valueOf(dialog.id));
                    if (num == null) {
                        num = num5;
                    }
                    concurrentHashMap3.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                    num2 = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                    if (num2 == null) {
                        num2 = num5;
                    }
                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                } else {
                    long j15 = dialog.id;
                    if (j15 < 0 && (chat = (TLRPC.Chat) hVar4.f(-j15)) != null && chat.migrated_to != null) {
                    }
                    hVar.k(dialog, dialog.id);
                    num = (Integer) concurrentHashMap3.get(Long.valueOf(dialog.id));
                    if (num == null) {
                    }
                    concurrentHashMap3.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                    num2 = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                    if (num2 == null) {
                    }
                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                }
            }
            i15++;
            sparseArray = sparseArray2;
        }
        final TLRPC.messages_Dialogs messages_dialogs = this.d;
        if (messages_dialogs == null || messages_dialogs.dialogs.isEmpty()) {
            qpVar = qpVar3;
        } else {
            gc.X(messages_dialogs.messages);
            int i18 = 0;
            while (i18 < messages_dialogs.messages.size()) {
                TLRPC.Message message3 = messages_dialogs.messages.get(i18);
                TLRPC.MessageAction messageAction = message3.action;
                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) hVar3.f(messageAction.user_id)) != null && user.bot) {
                    message3.reply_markup = new TLRPC.TL_replyKeyboardHide();
                    message3.flags |= 64;
                }
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                    concurrentHashMap = concurrentHashMap2;
                    qpVar2 = qpVar3;
                    message3.unread = false;
                    message3.media_unread = false;
                } else {
                    ConcurrentHashMap concurrentHashMap4 = message3.out ? concurrentHashMap2 : concurrentHashMap3;
                    Integer num6 = (Integer) concurrentHashMap4.get(Long.valueOf(message3.dialog_id));
                    if (num6 == null) {
                        concurrentHashMap = concurrentHashMap2;
                        qpVar2 = qpVar3;
                        num6 = Integer.valueOf(qpVar3.getMessagesStorage().U(message3.dialog_id, message3.out));
                        concurrentHashMap4.put(Long.valueOf(message3.dialog_id), num6);
                    } else {
                        concurrentHashMap = concurrentHashMap2;
                        qpVar2 = qpVar3;
                    }
                    message3.unread = num6.intValue() < message3.id;
                }
                i18++;
                qpVar3 = qpVar2;
                concurrentHashMap2 = concurrentHashMap;
            }
            qpVar = qpVar3;
            qpVar.getMessagesStorage().d1(messages_dialogs, 0);
        }
        final int i19 = this.e;
        final ArrayList arrayList6 = this.f;
        final ArrayList arrayList7 = this.h;
        final ArrayList arrayList8 = this.n;
        final Runnable runnable = this.r;
        final qp qpVar4 = qpVar;
        g0.h3(new Runnable() { // from class: org.telegram.messenger.pn
            /* JADX WARN: Code restructure failed: missing block: B:148:0x0178, code lost:
            
                if (r9 == null) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:150:0x017c, code lost:
            
                if (r15.top_message <= 0) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:151:0x017f, code lost:
            
                r8.k(r12, r13);
                r5.k(r3, r13);
                r10 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:153:0x018a, code lost:
            
                if (r10 >= r9.size()) goto L210;
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x018c, code lost:
            
                r11 = (org.telegram.messenger.ij) r9.get(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:155:0x0192, code lost:
            
                if (r11 != null) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:0x0194, code lost:
            
                r20 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:158:0x01b5, code lost:
            
                r10 = r10 + 1;
                r1 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x0197, code lost:
            
                r20 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:160:0x01a1, code lost:
            
                if (r11.k.peer_id.channel_id != 0) goto L81;
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x01a3, code lost:
            
                r7.remove(r11.e1());
             */
            /* JADX WARN: Code restructure failed: missing block: B:162:0x01aa, code lost:
            
                r0 = r11.k.random_id;
             */
            /* JADX WARN: Code restructure failed: missing block: B:163:0x01b0, code lost:
            
                if (r0 == 0) goto L213;
             */
            /* JADX WARN: Code restructure failed: missing block: B:164:0x01b2, code lost:
            
                r6.l(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:168:0x01bc, code lost:
            
                r20 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x01be, code lost:
            
                if (r3 == null) goto L107;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x01c0, code lost:
            
                r0 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:172:0x01c5, code lost:
            
                if (r0 >= r3.size()) goto L214;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x01c7, code lost:
            
                r1 = (org.telegram.messenger.ij) r3.get(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:174:0x01cd, code lost:
            
                if (r1 == null) goto L216;
             */
            /* JADX WARN: Code restructure failed: missing block: B:176:0x01d7, code lost:
            
                if (r1.k.peer_id.channel_id != 0) goto L217;
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x01d9, code lost:
            
                r10 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x01de, code lost:
            
                if (r10 >= r9.size()) goto L220;
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x01e0, code lost:
            
                r11 = (org.telegram.messenger.ij) r9.get(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:181:0x01e6, code lost:
            
                if (r11 == null) goto L221;
             */
            /* JADX WARN: Code restructure failed: missing block: B:183:0x01f0, code lost:
            
                if (r11.e1() != r1.e1()) goto L222;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x01f2, code lost:
            
                r1.Z = r11.Z;
             */
            /* JADX WARN: Code restructure failed: missing block: B:186:0x01fa, code lost:
            
                r7.put(r1.e1(), r1);
                r10 = r1.k.random_id;
             */
            /* JADX WARN: Code restructure failed: missing block: B:187:0x0207, code lost:
            
                if (r10 == 0) goto L218;
             */
            /* JADX WARN: Code restructure failed: missing block: B:188:0x0209, code lost:
            
                r6.k(r1, r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:190:0x020c, code lost:
            
                r0 = r0 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:193:0x01f7, code lost:
            
                r10 = r10 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:199:0x020f, code lost:
            
                r4.d(r13);
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                qp qpVar5;
                int i20;
                int i21;
                TLRPC.messages_Dialogs messages_dialogs2;
                int i22;
                int i23;
                qp qpVar6;
                pn pnVar = this;
                qp qpVar7 = qp.this;
                ArrayList arrayList9 = qpVar7.y;
                SparseArray sparseArray3 = qpVar7.S0;
                f10 f10Var = qpVar7.s7;
                a0.h hVar5 = qpVar7.R;
                a0.h hVar6 = qpVar7.S;
                SparseArray sparseArray4 = qpVar7.U;
                a0.h hVar7 = qpVar7.Q;
                int i24 = i19;
                boolean z9 = true;
                if (i24 != 2) {
                    qpVar7.P0 = arrayList6;
                    sparseArray3.clear();
                    int size2 = qpVar7.P0.size();
                    for (int i25 = 0; i25 < size2; i25++) {
                        vo voVar = (vo) qpVar7.P0.get(i25);
                        sparseArray3.put(voVar.a, voVar);
                    }
                    Collections.sort(qpVar7.P0, new jl(6));
                    qpVar7.Y3(arrayList7, true);
                    qpVar7.S3(arrayList8, true);
                    qpVar7.U0 = true;
                    qpVar7.getNotificationCenter().k(qs.O2, new Object[0]);
                    if (i24 == 0) {
                        qpVar7.c3(false, null);
                    }
                    TLRPC.messages_Dialogs messages_dialogs3 = messages_dialogs;
                    if (messages_dialogs3 != null && !messages_dialogs3.dialogs.isEmpty()) {
                        qpVar7.r(messages_dialogs3.dialogs);
                    }
                    ArrayList arrayList10 = arrayList3;
                    if (arrayList10 != null) {
                        int i26 = 0;
                        while (i26 < arrayList10.size()) {
                            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList10.get(i26);
                            if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                int i27 = encryptedChat2.layer;
                                Typeface typeface = g0.a;
                                if ((i27 & 65535) < 151) {
                                    qpVar7.getSecretChatHelper().w(encryptedChat2, null);
                                }
                                z9 = true;
                            }
                            qpVar7.U3(encryptedChat2, z9);
                            i26++;
                            z9 = true;
                        }
                    }
                    int i28 = 0;
                    while (true) {
                        a0.h hVar8 = hVar;
                        if (i28 >= hVar8.m()) {
                            break;
                        }
                        long j16 = hVar8.j(i28);
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar8.n(i28);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar7.f(j16);
                        if (messages_dialogs3 == null || !messages_dialogs3.dialogs.contains(dialog2)) {
                            messages_dialogs2 = messages_dialogs3;
                            i22 = i24;
                        } else {
                            if (dialog2.draft instanceof TLRPC.TL_draftMessage) {
                                messages_dialogs2 = messages_dialogs3;
                                i22 = i24;
                                qpVar7.getMediaDataController().R1(dialog2.id, 0L, dialog2.draft, null, false);
                            } else {
                                messages_dialogs2 = messages_dialogs3;
                                i22 = i24;
                            }
                            if (dialog3 != null) {
                                dialog3.notify_settings = dialog2.notify_settings;
                            }
                        }
                        ArrayList arrayList11 = (ArrayList) hVar2.f(dialog2.id);
                        if (dialog3 == null) {
                            hVar7.k(dialog2, j16);
                            hVar5.k(arrayList11, j16);
                            if (arrayList11 != null) {
                                for (int i29 = 0; i29 < arrayList11.size(); i29++) {
                                    ij ijVar4 = (ij) arrayList11.get(i29);
                                    if (ijVar4 != null && ijVar4.k.peer_id.channel_id == 0) {
                                        sparseArray4.put(ijVar4.e1(), ijVar4);
                                        long j17 = ijVar4.k.random_id;
                                        if (j17 != 0) {
                                            hVar6.k(ijVar4, j17);
                                        }
                                    }
                                }
                            }
                            f10Var.d(j16);
                            qpVar6 = qpVar7;
                            i23 = i28;
                        } else {
                            dialog3.pinned = dialog2.pinned;
                            dialog3.pinnedNum = dialog2.pinnedNum;
                            ArrayList arrayList12 = (ArrayList) hVar5.f(j16);
                            int i30 = 0;
                            while (true) {
                                i23 = i28;
                                if (arrayList12 == null || i30 >= arrayList12.size()) {
                                    break;
                                }
                                if (arrayList12.get(i30) != null && ((ij) arrayList12.get(i30)).Z) {
                                    break;
                                }
                                i30++;
                                i28 = i23;
                            }
                            qpVar6 = qpVar7;
                            if (dialog2.top_message < dialog3.top_message) {
                                if ((arrayList12 == null) == (arrayList11 == null)) {
                                    if (arrayList12 != null) {
                                        if (arrayList11 != null) {
                                            if (arrayList12.size() == arrayList11.size()) {
                                            }
                                        }
                                    }
                                }
                            }
                            hVar7.k(dialog2, j16);
                            hVar5.k(arrayList11, j16);
                            if (arrayList12 != null) {
                                for (int i31 = 0; i31 < arrayList12.size(); i31++) {
                                    ij ijVar5 = (ij) arrayList12.get(i31);
                                    if (ijVar5 != null) {
                                        if (ijVar5.k.peer_id.channel_id == 0) {
                                            sparseArray4.remove(ijVar5.e1());
                                        }
                                        long j18 = ijVar5.k.random_id;
                                        if (j18 != 0) {
                                            hVar6.l(j18);
                                        }
                                    }
                                }
                            }
                            if (arrayList11 != null) {
                                for (int i32 = 0; i32 < arrayList11.size(); i32++) {
                                    ij ijVar6 = (ij) arrayList11.get(i32);
                                    if (ijVar6 != null && ijVar6.k.peer_id.channel_id == 0) {
                                        int i33 = 0;
                                        while (true) {
                                            if (arrayList12 == null || i33 >= arrayList12.size()) {
                                                break;
                                            }
                                            ij ijVar7 = (ij) arrayList12.get(i33);
                                            if (ijVar7 != null && ijVar7.e1() == ijVar6.e1()) {
                                                ijVar6.Z = ijVar7.Z;
                                                break;
                                            }
                                            i33++;
                                        }
                                        sparseArray4.put(ijVar6.e1(), ijVar6);
                                        long j19 = ijVar6.k.random_id;
                                        if (j19 != 0) {
                                            hVar6.k(ijVar6, j19);
                                        }
                                    }
                                }
                            }
                            f10Var.d(j16);
                        }
                        i28 = i23 + 1;
                        pnVar = this;
                        qpVar7 = qpVar6;
                        messages_dialogs3 = messages_dialogs2;
                        i24 = i22;
                    }
                    qp qpVar8 = qpVar7;
                    i20 = i24;
                    arrayList9.clear();
                    int m10 = hVar7.m();
                    int i34 = 0;
                    while (i34 < m10) {
                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar7.n(i34);
                        qp qpVar9 = qpVar8;
                        if (qpVar9.D0.h(dialog4.id) < 0) {
                            arrayList9.add(dialog4);
                        }
                        i34++;
                        qpVar8 = qpVar9;
                    }
                    qpVar5 = qpVar8;
                    qpVar5.T4(null);
                    i21 = 0;
                    qpVar5.getNotificationCenter().k(qs.s, new Object[0]);
                } else {
                    qpVar5 = qpVar7;
                    i20 = i24;
                    i21 = 0;
                }
                if (i20 != 0) {
                    qpVar5.getUserConfig().P = true;
                    qpVar5.getUserConfig().v(i21);
                    qpVar5.getNotificationCenter().k(qs.P2, new Object[i21]);
                }
                qpVar5.i3();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }
}
