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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t8(Object obj, long j3, long j10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
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
        long j3;
        boolean z9;
        boolean z10;
        boolean z11;
        TLRPC.InputReplyTo inputReplyTo;
        String sb2;
        SQLiteCursor sQLiteCursor;
        int i7;
        SQLiteCursor queryFinalized;
        long j10;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        int i11;
        dw dwVar;
        TLRPC.EncryptedChat encryptedChat;
        int i12;
        long j11;
        ?? c10;
        int i13;
        int i14 = this.a;
        long j12 = this.c;
        long j13 = this.b;
        ?? r14 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i14) {
            case 0:
                y8 y8Var = (y8) obj2;
                Float f10 = (Float) obj;
                boolean[] zArr = y8Var.R;
                if (f10 != null && y8Var.G != 0 && j13 == 0) {
                    if (f10.floatValue() > 0.75f) {
                        z9 = true;
                        z9 = true;
                        if (!zArr[0]) {
                            zArr[0] = true;
                            z10 = true;
                            if (f10.floatValue() > 0.95f || zArr[z9 ? 1 : 0]) {
                                z11 = z10;
                            } else {
                                zArr[z9 ? 1 : 0] = z9;
                                z11 = z9 ? 1 : 0;
                            }
                            if (z11) {
                                y8Var.G = (long) (j12 / f10.floatValue());
                            }
                        }
                    } else {
                        z9 = true;
                    }
                    z10 = false;
                    if (f10.floatValue() > 0.95f) {
                    }
                    z11 = z10;
                    if (z11) {
                    }
                }
                if (y8Var.G == 0 || j13 == 0) {
                    j3 = 0;
                } else {
                    y8Var.G = 0L;
                    y8Var.t = j13;
                    y8Var.a();
                    if (!y8Var.P && y8Var.J) {
                        y8Var.f();
                    }
                    j3 = 0;
                }
                if (j13 > j3) {
                    j12 = j13;
                }
                y8Var.O = j12;
                if (y8Var.K < y8Var.e) {
                    y8Var.d();
                    return;
                }
                return;
            case 1:
                ui uiVar = (ui) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                a0.h hVar = uiVar.s1;
                a0.h hVar2 = (a0.h) uiVar.r1.f(j13);
                TLRPC.DraftMessage draftMessage = hVar2 != null ? (TLRPC.DraftMessage) hVar2.f(j12) : null;
                if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
                    return;
                }
                a0.h hVar3 = (a0.h) hVar.f(j13);
                a0.h hVar4 = hVar3;
                if (hVar3 == null) {
                    a0.h hVar5 = new a0.h();
                    hVar.k(hVar5, j13);
                    hVar4 = hVar5;
                }
                hVar4.k(message, j12);
                SerializedData serializedData = new SerializedData(message.getObjectSize());
                message.serializeToStream(serializedData);
                SharedPreferences.Editor edit = uiVar.t1.edit();
                if (j12 == 0) {
                    sb2 = a8.p0.o(j13, "r_");
                } else {
                    StringBuilder t6 = a8.p0.t(j13, "rt_", "_");
                    t6.append(j12);
                    sb2 = t6.toString();
                }
                edit.putString(sb2, Utilities.f(serializedData.toByteArray())).commit();
                uiVar.getNotificationCenter().k(85, Long.valueOf(j13));
                serializedData.cleanup();
                return;
            case 2:
                ((ui) obj2).P0(this.b, this.c, (ArrayList) obj, false);
                return;
            case 3:
                ((yr) obj2).getMessagesController().a0(null, null, null, this.b, true, 1, false, this.c, (TLRPC.TL_messages_deleteScheduledMessages) obj, 0);
                return;
            case 4:
                ((yr) obj2).getMessagesController().k3(this.b, (TLRPC.InputPeer) obj, this.c);
                return;
            case 5:
                yr yrVar = (yr) obj2;
                org.telegram.ui.fg fgVar = (org.telegram.ui.fg) obj;
                try {
                    if (j13 != 0) {
                        SQLiteDatabase sQLiteDatabase = yrVar.b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(mid) FROM messages_topics WHERE uid = " + j12 + " AND topic_id = " + j13 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                        i7 = 0;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                        Locale locale2 = Locale.US;
                        i7 = 0;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT MIN(mid) FROM messages_v2 WHERE uid = " + j12 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                    }
                    sQLiteCursor = queryFinalized;
                    try {
                        try {
                            int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(i7) : 0;
                            sQLiteCursor.dispose();
                            g0.h3(new x0(fgVar, intValue, 9));
                        } catch (Exception e10) {
                            e = e10;
                            yrVar.o(e, true);
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
                } catch (Exception e11) {
                    e = e11;
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
                et etVar = (et) obj2;
                TLRPC.PeerNotifySettings peerNotifySettings = (TLRPC.PeerNotifySettings) obj;
                long j14 = this.b;
                long j15 = this.c;
                String v = dt.v(j14, j15, true);
                int i15 = etVar.a;
                qp s12 = qp.s1(i15);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i15);
                yr a02 = yr.a0(i15);
                dt t10 = dt.t(i15);
                int c11 = k5.c("notify2_", v, etVar.b(), -1);
                int c12 = k5.c("notifyuntil_", v, etVar.b(), 0);
                SharedPreferences.Editor edit2 = etVar.b().edit();
                if ((peerNotifySettings.flags & 2) != 0) {
                    j10 = j15;
                    edit2.putBoolean(rf.b.i("silent_", v), peerNotifySettings.silent);
                } else {
                    j10 = j15;
                    edit2.remove("silent_" + v);
                }
                if ((peerNotifySettings.flags & 64) != 0) {
                    edit2.putBoolean(rf.b.i("stories_", v), !peerNotifySettings.stories_muted);
                } else {
                    edit2.remove("stories_" + v);
                }
                TLRPC.Dialog dialog = j10 == 0 ? (TLRPC.Dialog) s12.Q.f(j14) : null;
                if (dialog != null) {
                    dialog.notify_settings = peerNotifySettings;
                }
                if ((peerNotifySettings.flags & 4) == 0) {
                    if (c11 != -1) {
                        if (dialog != null) {
                            dialog.notify_settings.mute_until = 0;
                        }
                        edit2.remove("notify2_" + v);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (j10 == 0) {
                        a02.E1(j14, 0L);
                    }
                } else {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                        if (peerNotifySettings.mute_until <= connectionsManager.getCurrentTime() + 31536000) {
                            if (c11 == 3 && c12 == peerNotifySettings.mute_until) {
                                z14 = false;
                            } else {
                                edit2.putInt("notify2_" + v, 3);
                                edit2.putInt("notifyuntil_" + v, peerNotifySettings.mute_until);
                                if (dialog != null) {
                                    dialog.notify_settings.mute_until = 0;
                                }
                                z14 = true;
                            }
                            z13 = z14;
                            i11 = peerNotifySettings.mute_until;
                        } else if (c11 != 2) {
                            edit2.putInt("notify2_" + v, 2);
                            if (dialog != null) {
                                dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            i11 = 0;
                            z13 = true;
                        } else {
                            i11 = 0;
                            z13 = false;
                        }
                        if (j10 == 0) {
                            a02.E1(j14, (i11 << 32) | 1);
                            t10.N(j14);
                        }
                        etVar.a(peerNotifySettings.android_sound, edit2, j14, j10, 0);
                        edit2.apply();
                        if (z13) {
                            return;
                        }
                        g0.h3(new ds(etVar, 1));
                        return;
                    }
                    if (c11 == 0 || c11 == 1) {
                        z12 = false;
                    } else {
                        if (dialog != null) {
                            TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
                            i10 = 0;
                            peerNotifySettings2.mute_until = 0;
                        } else {
                            i10 = 0;
                        }
                        edit2.putInt("notify2_" + v, i10);
                        z12 = true;
                    }
                    if (j10 == 0) {
                        a02.E1(j14, 0L);
                    }
                }
                z13 = z12;
                etVar.a(peerNotifySettings.android_sound, edit2, j14, j10, 0);
                edit2.apply();
                if (z13) {
                }
                break;
            default:
                dw dwVar2 = (dw) obj2;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) obj;
                try {
                    if (encryptedChat2.admin_id == dwVar2.getUserConfig().e() && (j13 & 1) == 0) {
                        j13++;
                    }
                    if (j13 > j12) {
                        return;
                    }
                    int i16 = (int) j13;
                    int i17 = (int) j12;
                    SQLiteDatabase sQLiteDatabase3 = dwVar2.getMessagesStorage().b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + encryptedChat2.id + " AND ((seq_out_start >= " + i16 + " AND " + i16 + " <= seq_out_end) OR (seq_out_start >= " + i17 + " AND " + i17 + " <= seq_out_end))", new Object[0]);
                    boolean next = queryFinalized2.next();
                    queryFinalized2.dispose();
                    if (next) {
                        return;
                    }
                    long F = m5.F(encryptedChat2.id);
                    SparseArray sparseArray = new SparseArray();
                    ArrayList arrayList = new ArrayList();
                    while (j13 <= j12) {
                        sparseArray.put((int) j13, null);
                        j13 += 2;
                    }
                    SQLiteDatabase sQLiteDatabase4 = dwVar2.getMessagesStorage().b;
                    Locale locale4 = Locale.US;
                    ?? queryFinalized3 = sQLiteDatabase4.queryFinalized("SELECT m.data, r.random_id, s.seq_in, s.seq_out, m.ttl, s.mid FROM messages_seq as s LEFT JOIN randoms_v2 as r ON r.mid = s.mid LEFT JOIN messages_v2 as m ON m.mid = s.mid WHERE m.uid = " + F + " AND m.out = 1 AND s.seq_out >= " + i16 + " AND s.seq_out <= " + i17 + " ORDER BY seq_out ASC", new Object[0]);
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
                            i12 = i16;
                            c10.readAttachPath(byteBufferValue, dwVar2.getUserConfig().n);
                            byteBufferValue.reuse();
                            c10.random_id = longValue;
                            c10.dialog_id = F;
                            c10.seq_in = intValue2;
                            c10.seq_out = intValue3;
                            j11 = F;
                            c10.ttl = queryFinalized3.intValue(4);
                            i13 = intValue3;
                        } else {
                            i12 = i16;
                            long j16 = longValue;
                            j11 = F;
                            c10 = dwVar2.c(intValue4, intValue3, intValue2, j16, encryptedChat3);
                            i13 = intValue3;
                        }
                        arrayList.add(c10);
                        sparseArray.remove(i13);
                        F = j11;
                        i16 = i12;
                        encryptedChat2 = encryptedChat3;
                        r14 = 0;
                    }
                    int i18 = i16;
                    TLRPC.EncryptedChat encryptedChat4 = encryptedChat2;
                    queryFinalized3.dispose();
                    if (sparseArray.size() != 0) {
                        int i19 = 0;
                        while (i19 < sparseArray.size()) {
                            int keyAt = sparseArray.keyAt(i19);
                            arrayList.add(dwVar2.c(dwVar2.getUserConfig().j(), keyAt, keyAt + 1, Utilities.b.nextLong(), encryptedChat4));
                            i19++;
                            dwVar2 = dwVar2;
                            encryptedChat4 = encryptedChat4;
                        }
                        dwVar = dwVar2;
                        encryptedChat = encryptedChat4;
                        dwVar.getUserConfig().v(false);
                    } else {
                        dwVar = dwVar2;
                        encryptedChat = encryptedChat4;
                    }
                    Collections.sort(arrayList, new vj(19));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(encryptedChat);
                    g0.h3(new bw(dwVar, arrayList, 0));
                    gz sendMessagesHelper = dwVar.getSendMessagesHelper();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    sendMessagesHelper.getClass();
                    g0.h3(new zj(sendMessagesHelper, arrayList3, arrayList4, arrayList2, arrayList, (Object) null, 1));
                    SQLiteDatabase sQLiteDatabase5 = dwVar.getMessagesStorage().b;
                    Locale locale5 = Locale.US;
                    sQLiteDatabase5.executeFast("REPLACE INTO requested_holes VALUES(" + encryptedChat.id + ", " + i18 + ", " + i17 + ")").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
        }
    }

    public /* synthetic */ t8(c1 c1Var, long j3, TLObject tLObject, long j10, int i7) {
        this.a = i7;
        this.d = c1Var;
        this.b = j3;
        this.e = tLObject;
        this.c = j10;
    }

    public /* synthetic */ t8(y8 y8Var, Float f10, long j3, long j10) {
        this.a = 0;
        this.d = y8Var;
        this.e = f10;
        this.b = j3;
        this.c = j10;
    }
}
