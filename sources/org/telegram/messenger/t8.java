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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t8(Object obj, long j10, long j11, Object obj2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = j10;
        this.c = j11;
        this.e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0542  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [org.telegram.tgnet.TLRPC$TL_messageService] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r9v27, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        boolean z10;
        boolean z11;
        TLRPC.InputReplyTo inputReplyTo;
        String sb2;
        SQLiteCursor sQLiteCursor;
        int i3;
        SQLiteCursor queryFinalized;
        boolean z12;
        int i10;
        int i11;
        vv vvVar;
        TLRPC.EncryptedChat encryptedChat;
        int i12;
        TLRPC.EncryptedChat encryptedChat2;
        ?? c2;
        int i13;
        int i14 = this.a;
        SQLiteCursor sQLiteCursor2 = null;
        long j11 = this.c;
        long j12 = this.b;
        ?? r62 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i14) {
            case 0:
                y8 y8Var = (y8) obj2;
                Float f10 = (Float) obj;
                boolean[] zArr = y8Var.R;
                if (f10 != null && y8Var.G != 0 && j12 == 0) {
                    if (f10.floatValue() > 0.75f) {
                        z10 = true;
                        z10 = true;
                        if (!zArr[0]) {
                            zArr[0] = true;
                            z11 = true;
                            if (f10.floatValue() > 0.95f || zArr[z10 ? 1 : 0]) {
                                z10 = z11;
                            } else {
                                zArr[z10 ? 1 : 0] = z10;
                            }
                            if (z10) {
                                y8Var.G = (long) (j11 / f10.floatValue());
                            }
                        }
                    } else {
                        z10 = true;
                    }
                    z11 = false;
                    if (f10.floatValue() > 0.95f) {
                    }
                    z10 = z11;
                    if (z10) {
                    }
                }
                if (y8Var.G == 0 || j12 == 0) {
                    j10 = 0;
                } else {
                    y8Var.G = 0L;
                    y8Var.t = j12;
                    y8Var.a();
                    if (!y8Var.P && y8Var.J) {
                        y8Var.f();
                    }
                    j10 = 0;
                }
                if (j12 > j10) {
                    j11 = j12;
                }
                y8Var.O = j11;
                if (y8Var.K < y8Var.e) {
                    y8Var.d();
                    return;
                }
                return;
            case 1:
                li liVar = (li) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                a0.h hVar = liVar.t1;
                a0.h hVar2 = (a0.h) liVar.s1.f(j12);
                TLRPC.DraftMessage draftMessage = hVar2 != null ? (TLRPC.DraftMessage) hVar2.f(j11) : null;
                if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
                    return;
                }
                a0.h hVar3 = (a0.h) hVar.f(j12);
                a0.h hVar4 = hVar3;
                if (hVar3 == null) {
                    a0.h hVar5 = new a0.h();
                    hVar.k(hVar5, j12);
                    hVar4 = hVar5;
                }
                hVar4.k(message, j11);
                SerializedData serializedData = new SerializedData(message.getObjectSize());
                message.serializeToStream(serializedData);
                SharedPreferences.Editor edit = liVar.u1.edit();
                if (j11 == 0) {
                    sb2 = a1.g.p(j12, "r_");
                } else {
                    StringBuilder t10 = a1.g.t(j12, "rt_", "_");
                    t10.append(j11);
                    sb2 = t10.toString();
                }
                edit.putString(sb2, Utilities.f(serializedData.toByteArray())).commit();
                liVar.getNotificationCenter().k(85, Long.valueOf(j12));
                serializedData.cleanup();
                return;
            case 2:
                ((li) obj2).P0(this.b, this.c, (ArrayList) obj, false);
                return;
            case 3:
                ((qr) obj2).getMessagesController().a0(null, null, null, this.b, true, 1, false, this.c, (TLRPC.TL_messages_deleteScheduledMessages) obj, 0);
                return;
            case 4:
                ((qr) obj2).getMessagesController().k3(this.b, (TLRPC.InputPeer) obj, this.c);
                return;
            case 5:
                qr qrVar = (qr) obj2;
                org.telegram.ui.bg bgVar = (org.telegram.ui.bg) obj;
                try {
                    try {
                        if (j12 != 0) {
                            SQLiteDatabase sQLiteDatabase = qrVar.b;
                            Locale locale = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(mid) FROM messages_topics WHERE uid = " + j11 + " AND topic_id = " + j12 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                            i3 = 0;
                        } else {
                            SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                            Locale locale2 = Locale.US;
                            i3 = 0;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT MIN(mid) FROM messages_v2 WHERE uid = " + j11 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                        }
                        sQLiteCursor = queryFinalized;
                        try {
                            int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(i3) : 0;
                            sQLiteCursor.dispose();
                            g0.h3(new x0(bgVar, intValue, 9));
                        } catch (Exception e10) {
                            e = e10;
                            qrVar.o(e, true);
                            if (sQLiteCursor == null) {
                                return;
                            }
                            sQLiteCursor.dispose();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor2 = null;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
                sQLiteCursor.dispose();
                return;
            case 6:
                ws wsVar = (ws) obj2;
                TLRPC.PeerNotifySettings peerNotifySettings = (TLRPC.PeerNotifySettings) obj;
                long j13 = this.b;
                long j14 = this.c;
                String v = us.v(j13, j14, true);
                int i15 = wsVar.a;
                hp s12 = hp.s1(i15);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i15);
                qr a02 = qr.a0(i15);
                us t11 = us.t(i15);
                int c10 = k5.c("notify2_", v, wsVar.b(), -1);
                int c11 = k5.c("notifyuntil_", v, wsVar.b(), 0);
                SharedPreferences.Editor edit2 = wsVar.b().edit();
                if ((peerNotifySettings.flags & 2) != 0) {
                    edit2.putBoolean(t4.c.f("silent_", v), peerNotifySettings.silent);
                } else {
                    edit2.remove("silent_" + v);
                }
                if ((peerNotifySettings.flags & 64) != 0) {
                    edit2.putBoolean(t4.c.f("stories_", v), !peerNotifySettings.stories_muted);
                } else {
                    edit2.remove("stories_" + v);
                }
                TLRPC.Dialog dialog = j14 == 0 ? (TLRPC.Dialog) s12.R.f(j13) : null;
                if (dialog != null) {
                    dialog.notify_settings = peerNotifySettings;
                }
                if ((peerNotifySettings.flags & 4) == 0) {
                    if (c10 != -1) {
                        if (dialog != null) {
                            dialog.notify_settings.mute_until = 0;
                        }
                        edit2.remove("notify2_" + v);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (j14 == 0) {
                        a02.E1(j13, 0L);
                    }
                } else if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                    if (peerNotifySettings.mute_until <= connectionsManager.getCurrentTime() + 31536000) {
                        if (c10 == 3 && c11 == peerNotifySettings.mute_until) {
                            z12 = false;
                        } else {
                            edit2.putInt("notify2_" + v, 3);
                            edit2.putInt("notifyuntil_" + v, peerNotifySettings.mute_until);
                            if (dialog != null) {
                                dialog.notify_settings.mute_until = 0;
                            }
                            z12 = true;
                        }
                        i11 = peerNotifySettings.mute_until;
                    } else if (c10 != 2) {
                        edit2.putInt("notify2_" + v, 2);
                        if (dialog != null) {
                            dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        i11 = 0;
                        z12 = true;
                    } else {
                        i11 = 0;
                        z12 = false;
                    }
                    if (j14 == 0) {
                        a02.E1(j13, (i11 << 32) | 1);
                        t11.N(j13);
                    }
                } else {
                    if (c10 == 0 || c10 == 1) {
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
                    if (j14 == 0) {
                        a02.E1(j13, 0L);
                    }
                }
                wsVar.a(peerNotifySettings.android_sound, edit2, j13, j14, 0);
                edit2.apply();
                if (z12) {
                    g0.h3(new vs(wsVar, 0));
                    return;
                }
                return;
            default:
                vv vvVar2 = (vv) obj2;
                TLRPC.EncryptedChat encryptedChat3 = (TLRPC.EncryptedChat) obj;
                try {
                    if (encryptedChat3.admin_id == vvVar2.getUserConfig().e() && (j12 & 1) == 0) {
                        j12++;
                    }
                    if (j12 > j11) {
                        return;
                    }
                    int i16 = (int) j12;
                    int i17 = (int) j11;
                    SQLiteDatabase sQLiteDatabase3 = vvVar2.getMessagesStorage().b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + encryptedChat3.id + " AND ((seq_out_start >= " + i16 + " AND " + i16 + " <= seq_out_end) OR (seq_out_start >= " + i17 + " AND " + i17 + " <= seq_out_end))", new Object[0]);
                    boolean next = queryFinalized2.next();
                    queryFinalized2.dispose();
                    if (next) {
                        return;
                    }
                    long F = m5.F(encryptedChat3.id);
                    SparseArray sparseArray = new SparseArray();
                    ArrayList arrayList = new ArrayList();
                    while (j12 <= j11) {
                        sparseArray.put((int) j12, null);
                        j12 += 2;
                    }
                    SQLiteDatabase sQLiteDatabase4 = vvVar2.getMessagesStorage().b;
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
                        ?? byteBufferValue = queryFinalized3.byteBufferValue(r62);
                        if (byteBufferValue != 0) {
                            encryptedChat2 = encryptedChat3;
                            c2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r62), r62);
                            i12 = i16;
                            c2.readAttachPath(byteBufferValue, vvVar2.getUserConfig().n);
                            byteBufferValue.reuse();
                            c2.random_id = longValue;
                            c2.dialog_id = F;
                            c2.seq_in = intValue2;
                            c2.seq_out = intValue3;
                            c2.ttl = queryFinalized3.intValue(4);
                            i13 = intValue3;
                        } else {
                            i12 = i16;
                            encryptedChat2 = encryptedChat3;
                            c2 = vvVar2.c(intValue4, intValue3, intValue2, longValue, encryptedChat2);
                            i13 = intValue3;
                        }
                        arrayList.add(c2);
                        sparseArray.remove(i13);
                        i16 = i12;
                        encryptedChat3 = encryptedChat2;
                        r62 = 0;
                    }
                    int i18 = i16;
                    TLRPC.EncryptedChat encryptedChat4 = encryptedChat3;
                    queryFinalized3.dispose();
                    if (sparseArray.size() != 0) {
                        int i19 = 0;
                        while (i19 < sparseArray.size()) {
                            int keyAt = sparseArray.keyAt(i19);
                            arrayList.add(vvVar2.c(vvVar2.getUserConfig().j(), keyAt, keyAt + 1, Utilities.b.nextLong(), encryptedChat4));
                            i19++;
                            vvVar2 = vvVar2;
                            encryptedChat4 = encryptedChat4;
                        }
                        vvVar = vvVar2;
                        encryptedChat = encryptedChat4;
                        vvVar.getUserConfig().v(false);
                    } else {
                        vvVar = vvVar2;
                        encryptedChat = encryptedChat4;
                    }
                    Collections.sort(arrayList, new tq(9));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(encryptedChat);
                    g0.h3(new tv(vvVar, arrayList, 0));
                    yy sendMessagesHelper = vvVar.getSendMessagesHelper();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    sendMessagesHelper.getClass();
                    g0.h3(new pj(sendMessagesHelper, arrayList3, arrayList4, arrayList2, arrayList, (Object) null, 1));
                    SQLiteDatabase sQLiteDatabase5 = vvVar.getMessagesStorage().b;
                    Locale locale5 = Locale.US;
                    sQLiteDatabase5.executeFast("REPLACE INTO requested_holes VALUES(" + encryptedChat.id + ", " + i18 + ", " + i17 + ")").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
        }
    }

    public /* synthetic */ t8(c1 c1Var, long j10, TLObject tLObject, long j11, int i3) {
        this.a = i3;
        this.d = c1Var;
        this.b = j10;
        this.e = tLObject;
        this.c = j11;
    }

    public /* synthetic */ t8(y8 y8Var, Float f10, long j10, long j11) {
        this.a = 0;
        this.d = y8Var;
        this.e = f10;
        this.b = j10;
        this.c = j11;
    }
}
