package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y8(Object obj, long j10, long j11, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
        this.e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r5v12, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v26, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r8v23, types: [org.telegram.tgnet.TLRPC$TL_messageService] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [org.telegram.tgnet.TLRPC$Message] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.InputReplyTo inputReplyTo;
        String sb2;
        SQLiteCursor sQLiteCursor;
        int i10;
        SQLiteCursor queryFinalized;
        long j11;
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        int i12;
        ow owVar;
        TLRPC.EncryptedChat encryptedChat;
        int i13;
        long j12;
        ?? c10;
        int i14;
        int i15 = this.a;
        long j13 = this.c;
        long j14 = this.b;
        ?? r14 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i15) {
            case 0:
                d9 d9Var = (d9) obj2;
                Float f7 = (Float) obj;
                boolean[] zArr = d9Var.R;
                if (f7 != null && d9Var.G != 0 && j14 == 0) {
                    if (f7.floatValue() > 0.75f) {
                        z10 = true;
                        z10 = true;
                        if (!zArr[0]) {
                            zArr[0] = true;
                            z11 = true;
                            if (f7.floatValue() > 0.95f || zArr[z10 ? 1 : 0]) {
                                z12 = z11;
                            } else {
                                zArr[z10 ? 1 : 0] = z10;
                                z12 = z10 ? 1 : 0;
                            }
                            if (z12) {
                                d9Var.G = (long) (j13 / f7.floatValue());
                            }
                        }
                    } else {
                        z10 = true;
                    }
                    z11 = false;
                    if (f7.floatValue() > 0.95f) {
                    }
                    z12 = z11;
                    if (z12) {
                    }
                }
                if (d9Var.G == 0 || j14 == 0) {
                    j10 = 0;
                } else {
                    d9Var.G = 0L;
                    d9Var.t = j14;
                    d9Var.a();
                    if (!d9Var.P && d9Var.J) {
                        d9Var.f();
                    }
                    j10 = 0;
                }
                if (j14 > j10) {
                    j13 = j14;
                }
                d9Var.O = j13;
                if (d9Var.K < d9Var.e) {
                    d9Var.d();
                    return;
                }
                return;
            case 1:
                ui uiVar = (ui) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                a0.h hVar = uiVar.s1;
                a0.h hVar2 = (a0.h) uiVar.r1.f(j14);
                TLRPC.DraftMessage draftMessage = hVar2 != null ? (TLRPC.DraftMessage) hVar2.f(j13) : null;
                if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
                    return;
                }
                a0.h hVar3 = (a0.h) hVar.f(j14);
                a0.h hVar4 = hVar3;
                if (hVar3 == null) {
                    a0.h hVar5 = new a0.h();
                    hVar.k(hVar5, j14);
                    hVar4 = hVar5;
                }
                hVar4.k(message, j13);
                SerializedData serializedData = new SerializedData(message.getObjectSize());
                message.serializeToStream(serializedData);
                SharedPreferences.Editor edit = uiVar.t1.edit();
                if (j13 == 0) {
                    sb2 = a1.g.l(j14, "r_");
                } else {
                    StringBuilder s10 = a1.g.s(j14, "rt_", "_");
                    s10.append(j13);
                    sb2 = s10.toString();
                }
                edit.putString(sb2, Utilities.f(serializedData.toByteArray())).commit();
                uiVar.getNotificationCenter().k(85, Long.valueOf(j14));
                serializedData.cleanup();
                return;
            case 2:
                ((ui) obj2).P0(this.b, this.c, (ArrayList) obj, false);
                return;
            case 3:
                ((hs) obj2).getMessagesController().a0(null, null, null, this.b, true, 1, false, this.c, (TLRPC.TL_messages_deleteScheduledMessages) obj, 0);
                return;
            case 4:
                ((hs) obj2).getMessagesController().i3(this.b, (TLRPC.InputPeer) obj, this.c);
                return;
            case 5:
                hs hsVar = (hs) obj2;
                org.telegram.ui.sg sgVar = (org.telegram.ui.sg) obj;
                try {
                    if (j14 != 0) {
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(mid) FROM messages_topics WHERE uid = " + j13 + " AND topic_id = " + j14 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                        i10 = 0;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                        Locale locale2 = Locale.US;
                        i10 = 0;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT MIN(mid) FROM messages_v2 WHERE uid = " + j13 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                    }
                    sQLiteCursor = queryFinalized;
                    try {
                        try {
                            int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(i10) : 0;
                            sQLiteCursor.dispose();
                            i0.g3(new a1(sgVar, intValue, 9));
                        } catch (Exception e) {
                            e = e;
                            hsVar.o(e, true);
                            if (sQLiteCursor == null) {
                                return;
                            }
                            sQLiteCursor.dispose();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor.dispose();
                return;
            case 6:
                pt ptVar = (pt) obj2;
                TLRPC.PeerNotifySettings peerNotifySettings = (TLRPC.PeerNotifySettings) obj;
                long j15 = this.b;
                long j16 = this.c;
                String v = ot.v(j15, j16, true);
                int i16 = ptVar.a;
                vp r12 = vp.r1(i16);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i16);
                hs a02 = hs.a0(i16);
                ot t10 = ot.t(i16);
                int c11 = m5.c("notify2_", v, ptVar.b(), -1);
                int c12 = m5.c("notifyuntil_", v, ptVar.b(), 0);
                SharedPreferences.Editor edit2 = ptVar.b().edit();
                if ((peerNotifySettings.flags & 2) != 0) {
                    j11 = j16;
                    edit2.putBoolean(sc.e.h("silent_", v), peerNotifySettings.silent);
                } else {
                    j11 = j16;
                    edit2.remove("silent_" + v);
                }
                if ((peerNotifySettings.flags & 64) != 0) {
                    edit2.putBoolean(sc.e.h("stories_", v), !peerNotifySettings.stories_muted);
                } else {
                    edit2.remove("stories_" + v);
                }
                TLRPC.Dialog dialog = j11 == 0 ? (TLRPC.Dialog) r12.Q.f(j15) : null;
                if (dialog != null) {
                    dialog.notify_settings = peerNotifySettings;
                }
                if ((peerNotifySettings.flags & 4) == 0) {
                    if (c11 != -1) {
                        if (dialog != null) {
                            dialog.notify_settings.mute_until = 0;
                        }
                        edit2.remove("notify2_" + v);
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (j11 == 0) {
                        a02.E1(j15, 0L);
                    }
                } else {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                        if (peerNotifySettings.mute_until <= connectionsManager.getCurrentTime() + 31536000) {
                            if (c11 == 3 && c12 == peerNotifySettings.mute_until) {
                                z15 = false;
                            } else {
                                edit2.putInt("notify2_" + v, 3);
                                edit2.putInt("notifyuntil_" + v, peerNotifySettings.mute_until);
                                if (dialog != null) {
                                    dialog.notify_settings.mute_until = 0;
                                }
                                z15 = true;
                            }
                            z14 = z15;
                            i12 = peerNotifySettings.mute_until;
                        } else if (c11 != 2) {
                            edit2.putInt("notify2_" + v, 2);
                            if (dialog != null) {
                                dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            i12 = 0;
                            z14 = true;
                        } else {
                            i12 = 0;
                            z14 = false;
                        }
                        if (j11 == 0) {
                            a02.E1(j15, (i12 << 32) | 1);
                            t10.N(j15);
                        }
                        ptVar.a(peerNotifySettings.android_sound, edit2, j15, j11, 0);
                        edit2.apply();
                        if (z14) {
                            return;
                        }
                        i0.g3(new ms(ptVar, 1));
                        return;
                    }
                    if (c11 == 0 || c11 == 1) {
                        z13 = false;
                    } else {
                        if (dialog != null) {
                            TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
                            i11 = 0;
                            peerNotifySettings2.mute_until = 0;
                        } else {
                            i11 = 0;
                        }
                        edit2.putInt("notify2_" + v, i11);
                        z13 = true;
                    }
                    if (j11 == 0) {
                        a02.E1(j15, 0L);
                    }
                }
                z14 = z13;
                ptVar.a(peerNotifySettings.android_sound, edit2, j15, j11, 0);
                edit2.apply();
                if (z14) {
                }
                break;
            default:
                ow owVar2 = (ow) obj2;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) obj;
                try {
                    if (encryptedChat2.admin_id == owVar2.getUserConfig().e() && (j14 & 1) == 0) {
                        j14++;
                    }
                    if (j14 > j13) {
                        return;
                    }
                    int i17 = (int) j14;
                    int i18 = (int) j13;
                    SQLiteDatabase sQLiteDatabase3 = owVar2.getMessagesStorage().b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + encryptedChat2.id + " AND ((seq_out_start >= " + i17 + " AND " + i17 + " <= seq_out_end) OR (seq_out_start >= " + i18 + " AND " + i18 + " <= seq_out_end))", new Object[0]);
                    boolean next = queryFinalized2.next();
                    queryFinalized2.dispose();
                    if (next) {
                        return;
                    }
                    long F = o5.F(encryptedChat2.id);
                    SparseArray sparseArray = new SparseArray();
                    ArrayList arrayList = new ArrayList();
                    while (j14 <= j13) {
                        sparseArray.put((int) j14, null);
                        j14 += 2;
                    }
                    SQLiteDatabase sQLiteDatabase4 = owVar2.getMessagesStorage().b;
                    Locale locale4 = Locale.US;
                    ?? queryFinalized3 = sQLiteDatabase4.queryFinalized("SELECT m.data, r.random_id, s.seq_in, s.seq_out, m.ttl, s.mid FROM messages_seq as s LEFT JOIN randoms_v2 as r ON r.mid = s.mid LEFT JOIN messages_v2 as m ON m.mid = s.mid WHERE m.uid = " + F + " AND m.out = 1 AND s.seq_out >= " + i17 + " AND s.seq_out <= " + i18 + " ORDER BY seq_out ASC", new Object[0]);
                    while (queryFinalized3.next()) {
                        long longValue = queryFinalized3.longValue(1);
                        if (longValue == 0) {
                            longValue = Utilities.b.nextLong();
                        }
                        int intValue2 = queryFinalized3.intValue(2);
                        int intValue3 = queryFinalized3.intValue(3);
                        int intValue4 = queryFinalized3.intValue(5);
                        TLRPC.EncryptedChat encryptedChat3 = encryptedChat2;
                        ?? byteBufferValue = queryFinalized3.byteBufferValue(r14);
                        if (byteBufferValue != 0) {
                            c10 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r14), r14);
                            i13 = i17;
                            c10.readAttachPath(byteBufferValue, owVar2.getUserConfig().n);
                            byteBufferValue.reuse();
                            c10.random_id = longValue;
                            c10.dialog_id = F;
                            c10.seq_in = intValue2;
                            c10.seq_out = intValue3;
                            j12 = F;
                            c10.ttl = queryFinalized3.intValue(4);
                            i14 = intValue3;
                        } else {
                            i13 = i17;
                            long j17 = longValue;
                            j12 = F;
                            c10 = owVar2.c(intValue4, intValue3, intValue2, j17, encryptedChat3);
                            i14 = intValue3;
                        }
                        arrayList.add(c10);
                        sparseArray.remove(i14);
                        F = j12;
                        i17 = i13;
                        encryptedChat2 = encryptedChat3;
                        r14 = 0;
                    }
                    int i19 = i17;
                    TLRPC.EncryptedChat encryptedChat4 = encryptedChat2;
                    queryFinalized3.dispose();
                    if (sparseArray.size() != 0) {
                        int i20 = 0;
                        while (i20 < sparseArray.size()) {
                            int keyAt = sparseArray.keyAt(i20);
                            arrayList.add(owVar2.c(owVar2.getUserConfig().j(), keyAt, keyAt + 1, Utilities.b.nextLong(), encryptedChat4));
                            i20++;
                            owVar2 = owVar2;
                            encryptedChat4 = encryptedChat4;
                        }
                        owVar = owVar2;
                        encryptedChat = encryptedChat4;
                        owVar.getUserConfig().v(false);
                    } else {
                        owVar = owVar2;
                        encryptedChat = encryptedChat4;
                    }
                    Collections.sort(arrayList, new bk(21));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(encryptedChat);
                    i0.g3(new mw(owVar, arrayList, 0));
                    qz sendMessagesHelper = owVar.getSendMessagesHelper();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    sendMessagesHelper.getClass();
                    i0.g3(new ek(sendMessagesHelper, arrayList3, arrayList4, arrayList2, arrayList, (Object) null, 1));
                    SQLiteDatabase sQLiteDatabase5 = owVar.getMessagesStorage().b;
                    Locale locale5 = Locale.US;
                    sQLiteDatabase5.executeFast("REPLACE INTO requested_holes VALUES(" + encryptedChat.id + ", " + i19 + ", " + i18 + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
        }
    }

    public /* synthetic */ y8(f1 f1Var, long j10, TLObject tLObject, long j11, int i10) {
        this.a = i10;
        this.d = f1Var;
        this.b = j10;
        this.e = tLObject;
        this.c = j11;
    }

    public /* synthetic */ y8(d9 d9Var, Float f7, long j10, long j11) {
        this.a = 0;
        this.d = d9Var;
        this.e = f7;
        this.b = j10;
        this.c = j11;
    }
}
