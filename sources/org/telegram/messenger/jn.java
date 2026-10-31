package org.telegram.messenger;

import android.graphics.Typeface;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jn implements Runnable {
    public final /* synthetic */ vp a;
    public final /* synthetic */ TLRPC.TL_messages_dialogs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLRPC.messages_Dialogs d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ Runnable r;

    public /* synthetic */ jn(vp vpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.a = vpVar;
        this.b = tL_messages_dialogs;
        this.c = arrayList;
        this.d = messages_dialogs;
        this.e = i10;
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
        vp vpVar;
        ConcurrentHashMap concurrentHashMap;
        vp vpVar2;
        TLRPC.User user;
        SparseArray sparseArray2;
        TLRPC.Chat chat;
        Integer num;
        Integer num2;
        ArrayList arrayList;
        TLRPC.Message message;
        int i10;
        Integer num3;
        long B0;
        ArrayList arrayList2;
        vp vpVar3 = this.a;
        ConcurrentHashMap concurrentHashMap2 = vpVar3.P;
        ConcurrentHashMap concurrentHashMap3 = vpVar3.O;
        final a0.h hVar = new a0.h();
        final a0.h hVar2 = new a0.h();
        a0.h hVar3 = new a0.h();
        a0.h hVar4 = new a0.h();
        Integer num4 = 0;
        int i11 = 0;
        while (true) {
            tL_messages_dialogs = this.b;
            if (i11 >= tL_messages_dialogs.users.size()) {
                break;
            }
            TLRPC.User user2 = tL_messages_dialogs.users.get(i11);
            hVar3.k(user2, user2.id);
            i11++;
        }
        for (int i12 = 0; i12 < tL_messages_dialogs.chats.size(); i12++) {
            TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i12);
            hVar4.k(chat2, chat2.id);
        }
        final ArrayList arrayList3 = this.c;
        if (arrayList3 != null) {
            sparseArray = new SparseArray();
            int size = arrayList3.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) arrayList3.get(i13);
                sparseArray.put(encryptedChat.id, encryptedChat);
            }
        } else {
            sparseArray = null;
        }
        ArrayList arrayList4 = new ArrayList();
        int i14 = 0;
        while (i14 < tL_messages_dialogs.messages.size()) {
            TLRPC.Message message2 = tL_messages_dialogs.messages.get(i14);
            TLRPC.Peer peer = message2.peer_id;
            int i15 = i14;
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat3 = (TLRPC.Chat) hVar4.f(j10);
                if (chat3 != null && chat3.left) {
                    long j11 = vpVar3.z2;
                    if (j11 != 0) {
                    }
                    arrayList2 = arrayList4;
                    num3 = num4;
                }
                num3 = num4;
                jj jjVar = new jj(vpVar3.currentAccount, message2, hVar3, hVar4, false, false);
                arrayList4.add(jjVar);
                B0 = jj.B0(jjVar.k);
                if (hVar2.d(B0)) {
                    arrayList2 = arrayList4;
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayList5.add(jjVar);
                    hVar2.k(arrayList5, B0);
                } else {
                    ((ArrayList) hVar2.f(B0)).add(jjVar);
                    arrayList2 = arrayList4;
                }
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) hVar4.f(j12);
                    if (chat4 != null) {
                    }
                }
                num3 = num4;
                jj jjVar2 = new jj(vpVar3.currentAccount, message2, hVar3, hVar4, false, false);
                arrayList4.add(jjVar2);
                B0 = jj.B0(jjVar2.k);
                if (hVar2.d(B0)) {
                }
            }
            i14 = i15 + 1;
            arrayList4 = arrayList2;
            num4 = num3;
        }
        Integer num5 = num4;
        int i16 = 0;
        while (i16 < tL_messages_dialogs.dialogs.size()) {
            TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i16);
            o5.x(dialog);
            long j13 = dialog.id;
            if (j13 == 0 || (o5.C(j13) && sparseArray != null && sparseArray.get((int) (dialog.id & 4294967295L)) == null)) {
                sparseArray2 = sparseArray;
            } else {
                long j14 = vpVar3.z2;
                if (j14 != 0) {
                    sparseArray2 = sparseArray;
                    if (j14 == dialog.id) {
                        vpVar3.x2 = dialog;
                    }
                } else {
                    sparseArray2 = sparseArray;
                }
                if (dialog.last_message_date == 0 && (arrayList = (ArrayList) hVar2.f(dialog.id)) != null) {
                    int i17 = TLObject.FLAG_31;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        jj jjVar3 = (jj) arrayList.get(i18);
                        if (jjVar3 != null && (message = jjVar3.k) != null && i17 < (i10 = message.date)) {
                            i17 = i10;
                        }
                    }
                    if (i17 > Integer.MIN_VALUE) {
                        dialog.last_message_date = i17;
                    }
                }
                if (o5.y(dialog)) {
                    TLRPC.Chat chat5 = (TLRPC.Chat) hVar4.f(-dialog.id);
                    if (chat5 != null && chat5.left) {
                        long j15 = vpVar3.z2;
                        if (j15 != 0) {
                            if (j15 != dialog.id) {
                            }
                        }
                    }
                    vpVar3.Y0.put(-dialog.id, dialog.pts);
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
                    long j16 = dialog.id;
                    if (j16 < 0 && (chat = (TLRPC.Chat) hVar4.f(-j16)) != null && chat.migrated_to != null) {
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
            i16++;
            sparseArray = sparseArray2;
        }
        final TLRPC.messages_Dialogs messages_dialogs = this.d;
        if (messages_dialogs == null || messages_dialogs.dialogs.isEmpty()) {
            vpVar = vpVar3;
        } else {
            hc.X(messages_dialogs.messages);
            int i19 = 0;
            while (i19 < messages_dialogs.messages.size()) {
                TLRPC.Message message3 = messages_dialogs.messages.get(i19);
                TLRPC.MessageAction messageAction = message3.action;
                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) hVar3.f(messageAction.user_id)) != null && user.bot) {
                    message3.reply_markup = new TLRPC.TL_replyKeyboardHide();
                    message3.flags |= 64;
                }
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                    concurrentHashMap = concurrentHashMap2;
                    vpVar2 = vpVar3;
                    message3.unread = false;
                    message3.media_unread = false;
                } else {
                    ConcurrentHashMap concurrentHashMap4 = message3.out ? concurrentHashMap2 : concurrentHashMap3;
                    Integer num6 = (Integer) concurrentHashMap4.get(Long.valueOf(message3.dialog_id));
                    if (num6 == null) {
                        concurrentHashMap = concurrentHashMap2;
                        vpVar2 = vpVar3;
                        num6 = Integer.valueOf(vpVar3.getMessagesStorage().U(message3.dialog_id, message3.out));
                        concurrentHashMap4.put(Long.valueOf(message3.dialog_id), num6);
                    } else {
                        concurrentHashMap = concurrentHashMap2;
                        vpVar2 = vpVar3;
                    }
                    message3.unread = num6.intValue() < message3.id;
                }
                i19++;
                vpVar3 = vpVar2;
                concurrentHashMap2 = concurrentHashMap;
            }
            vpVar = vpVar3;
            vpVar.getMessagesStorage().d1(messages_dialogs, 0);
        }
        final int i20 = this.e;
        final ArrayList arrayList6 = this.f;
        final ArrayList arrayList7 = this.h;
        final ArrayList arrayList8 = this.n;
        final Runnable runnable = this.r;
        final vp vpVar4 = vpVar;
        i0.g3(new Runnable() { // from class: org.telegram.messenger.un
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
            
                r11 = (org.telegram.messenger.jj) r9.get(r10);
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
            
                r7.remove(r11.f1());
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
            
                r1 = (org.telegram.messenger.jj) r3.get(r0);
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
            
                r11 = (org.telegram.messenger.jj) r9.get(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:181:0x01e6, code lost:
            
                if (r11 == null) goto L221;
             */
            /* JADX WARN: Code restructure failed: missing block: B:183:0x01f0, code lost:
            
                if (r11.f1() != r1.f1()) goto L222;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x01f2, code lost:
            
                r1.Z = r11.Z;
             */
            /* JADX WARN: Code restructure failed: missing block: B:186:0x01fa, code lost:
            
                r7.put(r1.f1(), r1);
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
                vp vpVar5;
                int i21;
                int i22;
                TLRPC.messages_Dialogs messages_dialogs2;
                int i23;
                int i24;
                vp vpVar6;
                un unVar = this;
                vp vpVar7 = vp.this;
                ArrayList arrayList9 = vpVar7.y;
                SparseArray sparseArray3 = vpVar7.S0;
                t10 t10Var = vpVar7.t7;
                a0.h hVar5 = vpVar7.R;
                a0.h hVar6 = vpVar7.S;
                SparseArray sparseArray4 = vpVar7.U;
                a0.h hVar7 = vpVar7.Q;
                int i25 = i20;
                boolean z10 = true;
                if (i25 != 2) {
                    vpVar7.P0 = arrayList6;
                    sparseArray3.clear();
                    int size2 = vpVar7.P0.size();
                    for (int i26 = 0; i26 < size2; i26++) {
                        ap apVar = (ap) vpVar7.P0.get(i26);
                        sparseArray3.put(apVar.a, apVar);
                    }
                    Collections.sort(vpVar7.P0, new bk(7));
                    vpVar7.V3(arrayList7, true);
                    vpVar7.P3(arrayList8, true);
                    vpVar7.U0 = true;
                    vpVar7.getNotificationCenter().k(zs.O2, new Object[0]);
                    if (i25 == 0) {
                        vpVar7.a3(false, null);
                    }
                    TLRPC.messages_Dialogs messages_dialogs3 = messages_dialogs;
                    if (messages_dialogs3 != null && !messages_dialogs3.dialogs.isEmpty()) {
                        vpVar7.r(messages_dialogs3.dialogs);
                    }
                    ArrayList arrayList10 = arrayList3;
                    if (arrayList10 != null) {
                        int i27 = 0;
                        while (i27 < arrayList10.size()) {
                            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList10.get(i27);
                            if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                int i28 = encryptedChat2.layer;
                                Typeface typeface = i0.a;
                                if ((i28 & 65535) < 151) {
                                    vpVar7.getSecretChatHelper().w(encryptedChat2, null);
                                }
                                z10 = true;
                            }
                            vpVar7.R3(encryptedChat2, z10);
                            i27++;
                            z10 = true;
                        }
                    }
                    int i29 = 0;
                    while (true) {
                        a0.h hVar8 = hVar;
                        if (i29 >= hVar8.m()) {
                            break;
                        }
                        long j17 = hVar8.j(i29);
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar8.n(i29);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar7.f(j17);
                        if (messages_dialogs3 == null || !messages_dialogs3.dialogs.contains(dialog2)) {
                            messages_dialogs2 = messages_dialogs3;
                            i23 = i25;
                        } else {
                            if (dialog2.draft instanceof TLRPC.TL_draftMessage) {
                                messages_dialogs2 = messages_dialogs3;
                                i23 = i25;
                                vpVar7.getMediaDataController().R1(dialog2.id, 0L, dialog2.draft, null, false);
                            } else {
                                messages_dialogs2 = messages_dialogs3;
                                i23 = i25;
                            }
                            if (dialog3 != null) {
                                dialog3.notify_settings = dialog2.notify_settings;
                            }
                        }
                        ArrayList arrayList11 = (ArrayList) hVar2.f(dialog2.id);
                        if (dialog3 == null) {
                            hVar7.k(dialog2, j17);
                            hVar5.k(arrayList11, j17);
                            if (arrayList11 != null) {
                                for (int i30 = 0; i30 < arrayList11.size(); i30++) {
                                    jj jjVar4 = (jj) arrayList11.get(i30);
                                    if (jjVar4 != null && jjVar4.k.peer_id.channel_id == 0) {
                                        sparseArray4.put(jjVar4.f1(), jjVar4);
                                        long j18 = jjVar4.k.random_id;
                                        if (j18 != 0) {
                                            hVar6.k(jjVar4, j18);
                                        }
                                    }
                                }
                            }
                            t10Var.d(j17);
                            vpVar6 = vpVar7;
                            i24 = i29;
                        } else {
                            dialog3.pinned = dialog2.pinned;
                            dialog3.pinnedNum = dialog2.pinnedNum;
                            ArrayList arrayList12 = (ArrayList) hVar5.f(j17);
                            int i31 = 0;
                            while (true) {
                                i24 = i29;
                                if (arrayList12 == null || i31 >= arrayList12.size()) {
                                    break;
                                }
                                if (arrayList12.get(i31) != null && ((jj) arrayList12.get(i31)).Z) {
                                    break;
                                }
                                i31++;
                                i29 = i24;
                            }
                            vpVar6 = vpVar7;
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
                            hVar7.k(dialog2, j17);
                            hVar5.k(arrayList11, j17);
                            if (arrayList12 != null) {
                                for (int i32 = 0; i32 < arrayList12.size(); i32++) {
                                    jj jjVar5 = (jj) arrayList12.get(i32);
                                    if (jjVar5 != null) {
                                        if (jjVar5.k.peer_id.channel_id == 0) {
                                            sparseArray4.remove(jjVar5.f1());
                                        }
                                        long j19 = jjVar5.k.random_id;
                                        if (j19 != 0) {
                                            hVar6.l(j19);
                                        }
                                    }
                                }
                            }
                            if (arrayList11 != null) {
                                for (int i33 = 0; i33 < arrayList11.size(); i33++) {
                                    jj jjVar6 = (jj) arrayList11.get(i33);
                                    if (jjVar6 != null && jjVar6.k.peer_id.channel_id == 0) {
                                        int i34 = 0;
                                        while (true) {
                                            if (arrayList12 == null || i34 >= arrayList12.size()) {
                                                break;
                                            }
                                            jj jjVar7 = (jj) arrayList12.get(i34);
                                            if (jjVar7 != null && jjVar7.f1() == jjVar6.f1()) {
                                                jjVar6.Z = jjVar7.Z;
                                                break;
                                            }
                                            i34++;
                                        }
                                        sparseArray4.put(jjVar6.f1(), jjVar6);
                                        long j20 = jjVar6.k.random_id;
                                        if (j20 != 0) {
                                            hVar6.k(jjVar6, j20);
                                        }
                                    }
                                }
                            }
                            t10Var.d(j17);
                        }
                        i29 = i24 + 1;
                        unVar = this;
                        vpVar7 = vpVar6;
                        messages_dialogs3 = messages_dialogs2;
                        i25 = i23;
                    }
                    vp vpVar8 = vpVar7;
                    i21 = i25;
                    arrayList9.clear();
                    int m10 = hVar7.m();
                    int i35 = 0;
                    while (i35 < m10) {
                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar7.n(i35);
                        vp vpVar9 = vpVar8;
                        if (vpVar9.D0.h(dialog4.id) < 0) {
                            arrayList9.add(dialog4);
                        }
                        i35++;
                        vpVar8 = vpVar9;
                    }
                    vpVar5 = vpVar8;
                    vpVar5.Q4(null);
                    i22 = 0;
                    vpVar5.getNotificationCenter().k(zs.s, new Object[0]);
                } else {
                    vpVar5 = vpVar7;
                    i21 = i25;
                    i22 = 0;
                }
                if (i21 != 0) {
                    vpVar5.getUserConfig().P = true;
                    vpVar5.getUserConfig().v(i22);
                    vpVar5.getNotificationCenter().k(zs.P2, new Object[i22]);
                }
                vpVar5.g3();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }
}
