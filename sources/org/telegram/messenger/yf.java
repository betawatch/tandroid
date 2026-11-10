package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class yf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yf(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
    }

    private final void a() {
        w7 w7Var = (w7) this.c;
        boolean z9 = this.b;
        String str = (String) this.d;
        y8 y8Var = !z9 ? (y8) w7Var.h.get(str) : (y8) w7Var.n.get(str);
        w7Var.y.remove(str);
        if (y8Var != null) {
            w7Var.n.remove(str);
            w7Var.e.remove(y8Var);
            w7Var.f.remove(y8Var);
            if (y8Var.m == 3) {
                return;
            }
            y8Var.m = 2;
            Utilities.d.c(new u8(y8Var, 1));
            String str2 = y8Var.l;
            if (str2 == null) {
                Set set = z0.a;
            } else {
                z0.a.remove(str2);
            }
            y8Var.o.a();
            y8Var.b();
        }
    }

    private final void b() {
        gc gcVar = (gc) this.c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i7 = 0;
        while (true) {
            int i10 = 3;
            if (i7 >= 3) {
                return;
            }
            if (i7 > 0 && !this.b) {
                return;
            }
            if (i7 == 0) {
                i10 = 1;
            } else if (i7 == 1) {
                i10 = 0;
            }
            int G = imageReceiver.G(i10);
            if (G != 0) {
                if (i7 == 0) {
                    HashMap hashMap = gcVar.l;
                    SparseArray sparseArray = gcVar.m;
                    String str = (String) sparseArray.get(G);
                    if (str != null) {
                        ec ecVar = (ec) hashMap.get(str);
                        if (ecVar != null) {
                            ArrayList arrayList = ecVar.c;
                            int indexOf = arrayList.indexOf(imageReceiver);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                                ecVar.d.remove(indexOf);
                            }
                            if (arrayList.isEmpty()) {
                                hashMap.remove(str);
                            }
                        }
                        sparseArray.remove(G);
                    }
                }
                ub ubVar = (ub) gcVar.k.get(G);
                if (ubVar != null) {
                    ubVar.b(imageReceiver);
                }
            }
            i7++;
        }
    }

    private final void c() {
        int i7;
        int writeFrame;
        m.f3 f3Var = (m.f3) this.c;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        MediaController mediaController = (MediaController) f3Var.b;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = mediaController.y1;
            if (remaining > byteBuffer2.remaining()) {
                i7 = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
            } else {
                i7 = -1;
            }
            byteBuffer2.put(byteBuffer);
            int position = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            boolean z9 = this.b;
            if (position == limit || z9) {
                writeFrame = mediaController.writeFrame(byteBuffer2, !z9 ? byteBuffer2.limit() : byteBuffer.position());
                if (writeFrame != 0) {
                    byteBuffer2.rewind();
                    mediaController.k1 += (byteBuffer2.limit() / 2) / (mediaController.A1 / 1000);
                    mediaController.l1++;
                } else {
                    a8.d("writing frame failed");
                }
            }
            if (i7 != -1) {
                byteBuffer.limit(i7);
            }
        }
        mediaController.M1.c(new x4(24, f3Var, byteBuffer));
    }

    private final void d() {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        ui uiVar = (ui) this.c;
        xr xrVar = (xr) this.d;
        try {
            if (xrVar.b != 0) {
                SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                Locale locale = Locale.US;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + xrVar.a + " AND tid = " + xrVar.b, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().b;
                Locale locale2 = Locale.US;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + xrVar.a, new Object[0]);
            }
            if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                message = null;
            } else {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (message != null || this.b) {
                g0.h3(new qg(uiVar, message, xrVar));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        SQLiteCursor queryFinalized;
        yr yrVar = (yr) this.c;
        TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
        TLRPC.User user = userFull.user;
        long j3 = user != null ? user.id : userFull.id;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        if (this.b) {
            try {
                queryFinalized = yrVar.b.queryFinalized("SELECT uid FROM user_settings WHERE uid = " + j3, new Object[0]);
                try {
                    try {
                        boolean next = queryFinalized.next();
                        queryFinalized.dispose();
                        if (!next) {
                            return;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        yrVar.o(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (queryFinalized == null) {
                            queryFinalized.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (queryFinalized != null) {
                        queryFinalized.dispose();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                queryFinalized = null;
            } catch (Throwable th3) {
                th = th3;
                queryFinalized = null;
                if (sQLitePreparedStatement != null) {
                }
                if (queryFinalized != null) {
                }
                throw th;
            }
        }
        SQLitePreparedStatement executeFast = yrVar.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
            userFull.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, j3);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.bindInteger(3, userFull.pinned_msg_id);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            if ((userFull.flags & 2048) != 0) {
                SQLitePreparedStatement executeFast2 = yrVar.b.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                executeFast2.bindInteger(1, userFull.folder_id);
                executeFast2.bindLong(2, j3);
                executeFast2.step();
                executeFast2.dispose();
                yrVar.J.l(j3);
            }
            if ((userFull.flags & TLObject.FLAG_14) != 0) {
                executeFast = yrVar.b.executeFast("UPDATE dialogs SET ttl_period = ? WHERE did = ?");
                executeFast.bindInteger(1, userFull.ttl_period);
                executeFast.bindLong(2, j3);
                executeFast.step();
                executeFast.dispose();
            }
        } catch (Exception e12) {
            e = e12;
            sQLitePreparedStatement = executeFast;
            queryFinalized = null;
            yrVar.o(e, true);
            if (sQLitePreparedStatement != null) {
            }
            if (queryFinalized == null) {
            }
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = executeFast;
            queryFinalized = null;
            if (sQLitePreparedStatement != null) {
            }
            if (queryFinalized != null) {
            }
            throw th;
        }
    }

    private final void g() {
        yr yrVar = (yr) this.c;
        yrVar.x1((vo) this.d, this.b);
        yrVar.j(false);
        g0.h3(new rq(yrVar, 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        boolean z9;
        yr yrVar = (yr) this.c;
        HashMap hashMap = (HashMap) this.d;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        try {
            try {
                if (r2.a) {
                    a8.b(yrVar.currentAccount + " save contacts to db " + hashMap.size());
                }
                yrVar.b.executeFast("DELETE FROM user_contacts_v7 WHERE 1").stepThis().dispose();
                yrVar.b.executeFast("DELETE FROM user_phones_v7 WHERE 1").stepThis().dispose();
                yrVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = yrVar.b.executeFast("REPLACE INTO user_contacts_v7 VALUES(?, ?, ?, ?, ?)");
                try {
                    sQLitePreparedStatement = yrVar.b.executeFast("REPLACE INTO user_phones_v7 VALUES(?, ?, ?, ?)");
                    try {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            z9 = false;
                            if (!it.hasNext()) {
                                break;
                            }
                            d5 d5Var = (d5) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList = d5Var.e;
                            ArrayList arrayList2 = d5Var.g;
                            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                                executeFast.requery();
                                executeFast.bindString(1, d5Var.b);
                                executeFast.bindInteger(2, d5Var.a);
                                executeFast.bindString(3, d5Var.i);
                                executeFast.bindString(4, d5Var.j);
                                executeFast.bindInteger(5, d5Var.l);
                                executeFast.step();
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindString(1, d5Var.b);
                                    sQLitePreparedStatement.bindString(2, (String) arrayList.get(i7));
                                    sQLitePreparedStatement.bindString(3, (String) arrayList2.get(i7));
                                    sQLitePreparedStatement.bindInteger(4, ((Integer) d5Var.h.get(i7)).intValue());
                                    sQLitePreparedStatement.step();
                                }
                            }
                        }
                        executeFast.dispose();
                        try {
                            sQLitePreparedStatement.dispose();
                            yrVar.b.commitTransaction();
                            if (this.b) {
                                yrVar.b.executeFast("DROP TABLE IF EXISTS user_contacts_v6;").stepThis().dispose();
                                yrVar.b.executeFast("DROP TABLE IF EXISTS user_phones_v6;").stepThis().dispose();
                                sQLitePreparedStatement = null;
                                yrVar.a.c(new dr(yrVar, z9 ? 1 : 0, false ? 1 : 0));
                            }
                            SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                            yrVar = sQLiteDatabase2;
                            if (sQLiteDatabase2 != 0) {
                                sQLiteDatabase2.commitTransaction();
                            }
                        } catch (Exception e10) {
                            e = e10;
                            yrVar.o(e, true);
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            sQLiteDatabase = yrVar.b;
                            yrVar = sQLiteDatabase;
                            if (sQLiteDatabase != 0) {
                                sQLiteDatabase.commitTransaction();
                                yrVar = sQLiteDatabase;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        sQLitePreparedStatement2 = executeFast;
                        yrVar.o(e, true);
                        if (sQLitePreparedStatement2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        sQLiteDatabase = yrVar.b;
                        yrVar = sQLiteDatabase;
                        if (sQLiteDatabase != 0) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement2 = executeFast;
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e13) {
            e = e13;
            sQLitePreparedStatement = null;
        } catch (Throwable th5) {
            th = th5;
            sQLitePreparedStatement = null;
        }
    }

    private final void i() {
        int i7;
        yr yrVar = (yr) this.c;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = yrVar.b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.id);
                sQLitePreparedStatement.step();
                if (this.b && (i7 = encryptedChat.in_seq_no) != 0) {
                    long j3 = (int) (encryptedChat.id & 4294967295L);
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j3 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i7 + ") AND uid = " + j3).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                yrVar.o(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(4:9|10|(2:12|13)(3:15|(3:18|19|16)|20)|14)|6|7) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0106, code lost:
    
        if (r9 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0109, code lost:
    
        r0 = new a0.h();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0113, code lost:
    
        if (r3 >= r4.m()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0115, code lost:
    
        r5 = r4.j(r3);
        r7 = (java.util.ArrayList) r4.n(r3);
        r9 = r7.size();
        r10 = r8;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0125, code lost:
    
        if (r11 >= r9) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0127, code lost:
    
        r12 = r7.get(r11);
        r11 = r11 + 1;
        r12 = (org.telegram.tgnet.tl.TL_ephemeral.EphemeralMessage) r12;
        r13 = r12.anchor_msg_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
    
        if (r13 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0133, code lost:
    
        r14 = r2.d0;
        r15 = r12.id;
        r14 = (a0.h) r14.b;
        r8 = (android.util.SparseIntArray) r14.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0143, code lost:
    
        if (r8 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014b, code lost:
    
        if (r8.get(r13, -1) == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014e, code lost:
    
        r8.delete(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0155, code lost:
    
        if (r8.size() != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0157, code lost:
    
        r14.l(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015a, code lost:
    
        r1 = r12.anchor_msg_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015c, code lost:
    
        if (r1 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015e, code lost:
    
        r1 = r2.c0(r5, r1);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0163, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0165, code lost:
    
        if (r10 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0167, code lost:
    
        r10 = org.telegram.messenger.k5.j(r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016b, code lost:
    
        r10.add(new org.telegram.messenger.ij(r2.currentAccount, r1, true, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017c, code lost:
    
        r3 = r3 + 1;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0187, code lost:
    
        if (r0.i() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0189, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.messenger.bq(r2, r0, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0192, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
    
        r9.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        if (r9 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f1, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void j() {
        boolean z9;
        SQLitePreparedStatement sQLitePreparedStatement;
        yr yrVar = (yr) this.c;
        a0.h hVar = (a0.h) this.d;
        a0.h hVar2 = new a0.h();
        boolean z10 = this.b;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        if (z10) {
            try {
                try {
                    yrVar.b.beginTransaction();
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                z9 = true;
                sQLitePreparedStatement = null;
                yrVar.o(e, z9);
            }
        }
        try {
            sQLitePreparedStatement = yrVar.b.executeFast("DELETE FROM ephemeral_messages WHERE dialog_id = ? AND id = ?;");
            for (int i7 = 0; i7 < hVar.m(); i7++) {
                try {
                    try {
                        long j3 = hVar.j(i7);
                        ArrayList arrayList = (ArrayList) hVar.n(i7);
                        if (arrayList != null) {
                            hVar2.k(yrVar.Y(arrayList, j3), j3);
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, j3);
                                sQLitePreparedStatement.bindInteger(2, ((Integer) arrayList.get(i10)).intValue());
                                sQLitePreparedStatement.step();
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        z9 = true;
                        yrVar.o(e, z9);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th;
                }
            }
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                long j10 = hVar.j(i11);
                ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                ui mediaDataController = yrVar.getMediaDataController();
                xr a10 = xr.a(j10, 0L);
                mediaDataController.getClass();
                g0.h3(new lg(mediaDataController, sQLitePreparedStatement2, a10, 2));
                String join = TextUtils.join(",", arrayList2);
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("DELETE FROM bot_keyboard WHERE mid IN(" + join + ") AND uid = " + j10).stepThis().dispose();
                yrVar.b.executeFast("DELETE FROM bot_keyboard_topics WHERE mid IN(" + join + ") AND uid = " + j10).stepThis().dispose();
            }
            if (z10) {
                yrVar.b.commitTransaction();
            }
        } catch (Exception e12) {
            e = e12;
            sQLitePreparedStatement = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0267, code lost:
    
        if (org.telegram.messenger.t3.r0(r4) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0286, code lost:
    
        if (org.telegram.messenger.t3.r0(r4) != false) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0713 A[Catch: all -> 0x07a4, TryCatch #0 {all -> 0x07a4, blocks: (B:224:0x03e1, B:226:0x03e5, B:227:0x0407, B:230:0x041c, B:231:0x049e, B:234:0x04ea, B:237:0x04f0, B:240:0x04f5, B:241:0x0512, B:242:0x051e, B:244:0x0524, B:246:0x053f, B:248:0x056b, B:251:0x0582, B:253:0x058f, B:254:0x059c, B:257:0x06da, B:260:0x06f4, B:262:0x0713, B:264:0x071f, B:266:0x0733, B:268:0x073d, B:270:0x0741, B:272:0x0744, B:274:0x077e, B:276:0x074a, B:277:0x074f, B:280:0x0750, B:281:0x0755, B:282:0x0756, B:284:0x075e, B:286:0x0762, B:288:0x0765, B:290:0x0770, B:291:0x077b, B:293:0x0776, B:295:0x078c, B:296:0x0791, B:299:0x0792, B:300:0x0797, B:301:0x0726, B:342:0x06cb, B:374:0x0594, B:376:0x059a, B:380:0x0554, B:383:0x04fb, B:385:0x0504, B:386:0x050f, B:387:0x050a, B:388:0x0798, B:389:0x079d, B:390:0x079e, B:391:0x07a3, B:392:0x0425, B:394:0x042d, B:396:0x0433, B:397:0x0437, B:399:0x043d, B:402:0x0466, B:404:0x046c, B:406:0x047a, B:408:0x047d, B:411:0x0483, B:413:0x0489, B:417:0x0493, B:419:0x0499), top: B:223:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x071f A[Catch: all -> 0x07a4, TryCatch #0 {all -> 0x07a4, blocks: (B:224:0x03e1, B:226:0x03e5, B:227:0x0407, B:230:0x041c, B:231:0x049e, B:234:0x04ea, B:237:0x04f0, B:240:0x04f5, B:241:0x0512, B:242:0x051e, B:244:0x0524, B:246:0x053f, B:248:0x056b, B:251:0x0582, B:253:0x058f, B:254:0x059c, B:257:0x06da, B:260:0x06f4, B:262:0x0713, B:264:0x071f, B:266:0x0733, B:268:0x073d, B:270:0x0741, B:272:0x0744, B:274:0x077e, B:276:0x074a, B:277:0x074f, B:280:0x0750, B:281:0x0755, B:282:0x0756, B:284:0x075e, B:286:0x0762, B:288:0x0765, B:290:0x0770, B:291:0x077b, B:293:0x0776, B:295:0x078c, B:296:0x0791, B:299:0x0792, B:300:0x0797, B:301:0x0726, B:342:0x06cb, B:374:0x0594, B:376:0x059a, B:380:0x0554, B:383:0x04fb, B:385:0x0504, B:386:0x050f, B:387:0x050a, B:388:0x0798, B:389:0x079d, B:390:0x079e, B:391:0x07a3, B:392:0x0425, B:394:0x042d, B:396:0x0433, B:397:0x0437, B:399:0x043d, B:402:0x0466, B:404:0x046c, B:406:0x047a, B:408:0x047d, B:411:0x0483, B:413:0x0489, B:417:0x0493, B:419:0x0499), top: B:223:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0733 A[Catch: all -> 0x07a4, TryCatch #0 {all -> 0x07a4, blocks: (B:224:0x03e1, B:226:0x03e5, B:227:0x0407, B:230:0x041c, B:231:0x049e, B:234:0x04ea, B:237:0x04f0, B:240:0x04f5, B:241:0x0512, B:242:0x051e, B:244:0x0524, B:246:0x053f, B:248:0x056b, B:251:0x0582, B:253:0x058f, B:254:0x059c, B:257:0x06da, B:260:0x06f4, B:262:0x0713, B:264:0x071f, B:266:0x0733, B:268:0x073d, B:270:0x0741, B:272:0x0744, B:274:0x077e, B:276:0x074a, B:277:0x074f, B:280:0x0750, B:281:0x0755, B:282:0x0756, B:284:0x075e, B:286:0x0762, B:288:0x0765, B:290:0x0770, B:291:0x077b, B:293:0x0776, B:295:0x078c, B:296:0x0791, B:299:0x0792, B:300:0x0797, B:301:0x0726, B:342:0x06cb, B:374:0x0594, B:376:0x059a, B:380:0x0554, B:383:0x04fb, B:385:0x0504, B:386:0x050f, B:387:0x050a, B:388:0x0798, B:389:0x079d, B:390:0x079e, B:391:0x07a3, B:392:0x0425, B:394:0x042d, B:396:0x0433, B:397:0x0437, B:399:0x043d, B:402:0x0466, B:404:0x046c, B:406:0x047a, B:408:0x047d, B:411:0x0483, B:413:0x0489, B:417:0x0493, B:419:0x0499), top: B:223:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0756 A[Catch: all -> 0x07a4, TryCatch #0 {all -> 0x07a4, blocks: (B:224:0x03e1, B:226:0x03e5, B:227:0x0407, B:230:0x041c, B:231:0x049e, B:234:0x04ea, B:237:0x04f0, B:240:0x04f5, B:241:0x0512, B:242:0x051e, B:244:0x0524, B:246:0x053f, B:248:0x056b, B:251:0x0582, B:253:0x058f, B:254:0x059c, B:257:0x06da, B:260:0x06f4, B:262:0x0713, B:264:0x071f, B:266:0x0733, B:268:0x073d, B:270:0x0741, B:272:0x0744, B:274:0x077e, B:276:0x074a, B:277:0x074f, B:280:0x0750, B:281:0x0755, B:282:0x0756, B:284:0x075e, B:286:0x0762, B:288:0x0765, B:290:0x0770, B:291:0x077b, B:293:0x0776, B:295:0x078c, B:296:0x0791, B:299:0x0792, B:300:0x0797, B:301:0x0726, B:342:0x06cb, B:374:0x0594, B:376:0x059a, B:380:0x0554, B:383:0x04fb, B:385:0x0504, B:386:0x050f, B:387:0x050a, B:388:0x0798, B:389:0x079d, B:390:0x079e, B:391:0x07a3, B:392:0x0425, B:394:0x042d, B:396:0x0433, B:397:0x0437, B:399:0x043d, B:402:0x0466, B:404:0x046c, B:406:0x047a, B:408:0x047d, B:411:0x0483, B:413:0x0489, B:417:0x0493, B:419:0x0499), top: B:223:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0726 A[Catch: all -> 0x07a4, TryCatch #0 {all -> 0x07a4, blocks: (B:224:0x03e1, B:226:0x03e5, B:227:0x0407, B:230:0x041c, B:231:0x049e, B:234:0x04ea, B:237:0x04f0, B:240:0x04f5, B:241:0x0512, B:242:0x051e, B:244:0x0524, B:246:0x053f, B:248:0x056b, B:251:0x0582, B:253:0x058f, B:254:0x059c, B:257:0x06da, B:260:0x06f4, B:262:0x0713, B:264:0x071f, B:266:0x0733, B:268:0x073d, B:270:0x0741, B:272:0x0744, B:274:0x077e, B:276:0x074a, B:277:0x074f, B:280:0x0750, B:281:0x0755, B:282:0x0756, B:284:0x075e, B:286:0x0762, B:288:0x0765, B:290:0x0770, B:291:0x077b, B:293:0x0776, B:295:0x078c, B:296:0x0791, B:299:0x0792, B:300:0x0797, B:301:0x0726, B:342:0x06cb, B:374:0x0594, B:376:0x059a, B:380:0x0554, B:383:0x04fb, B:385:0x0504, B:386:0x050f, B:387:0x050a, B:388:0x0798, B:389:0x079d, B:390:0x079e, B:391:0x07a3, B:392:0x0425, B:394:0x042d, B:396:0x0433, B:397:0x0437, B:399:0x043d, B:402:0x0466, B:404:0x046c, B:406:0x047a, B:408:0x047d, B:411:0x0483, B:413:0x0489, B:417:0x0493, B:419:0x0499), top: B:223:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018e  */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r15v7, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.graphics.Bitmap] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ui uiVar;
        ArrayList arrayList;
        TLRPC.User user;
        ?? r15;
        boolean z9;
        ArrayList arrayList2;
        ui uiVar2;
        ArrayList arrayList3;
        SQLiteCursor sQLiteCursor;
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        boolean z10;
        ?? r19;
        Bitmap bitmap;
        TLRPC.Chat chat;
        LongSparseIntArray longSparseIntArray;
        TLRPC.Chat chat2;
        ArrayList arrayList4;
        TLRPC.Message message;
        int i7;
        int i10;
        ArrayList arrayList5;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i11;
        int i12;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor4 = null;
        switch (this.a) {
            case 0:
                ui uiVar3 = (ui) this.c;
                boolean z11 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                try {
                    if (iz.q == null) {
                        iz.q = UUID.randomUUID().toString();
                        t0.b.getSharedPreferences("mainconfig", 0).edit().putString("directShareHash2", iz.q).commit();
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    if (z11) {
                        g0.f.n(t0.b);
                        uiVar = uiVar3;
                    } else {
                        List e10 = g0.f.e(t0.b);
                        if (e10 == null || e10.isEmpty()) {
                            uiVar = uiVar3;
                        } else {
                            arrayList8.add("compose");
                            int i13 = 0;
                            while (i13 < arrayList6.size()) {
                                arrayList8.add("did3_" + ij.B1(((TLRPC.TL_topPeer) arrayList6.get(i13)).peer));
                                i13++;
                                uiVar3 = uiVar3;
                            }
                            uiVar = uiVar3;
                            for (int i14 = 0; i14 < e10.size(); i14++) {
                                String str3 = ((g0.c) e10.get(i14)).b;
                                if (!arrayList8.remove(str3)) {
                                    arrayList9.add(str3);
                                }
                                arrayList7.add(str3);
                            }
                            if (arrayList8.isEmpty() && arrayList9.isEmpty()) {
                                return;
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            g0.f.o(t0.b, arrayList9);
                        }
                    }
                    Intent intent = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                    intent.setAction("new_dialog");
                    ArrayList arrayList10 = new ArrayList();
                    Context context = t0.b;
                    g0.c cVar = new g0.c();
                    cVar.a = context;
                    cVar.b = "compose";
                    cVar.e = id.M0(2131748275, null);
                    cVar.f = id.M0(2131748275, null);
                    cVar.h = IconCompat.d(t0.b, R.drawable.shortcut_compose);
                    cVar.m = 0;
                    cVar.c = new Intent[]{intent};
                    if (TextUtils.isEmpty(cVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = cVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    if (z11) {
                        g0.f.m(t0.b, cVar);
                    } else {
                        arrayList10.add(cVar);
                        if (arrayList7.contains("compose")) {
                            g0.f.x(t0.b, arrayList10);
                        } else {
                            g0.f.a(t0.b, arrayList10);
                        }
                        arrayList10.clear();
                    }
                    HashSet hashSet = new HashSet(1);
                    hashSet.add(ui.V1);
                    int i15 = 0;
                    while (i15 < arrayList6.size()) {
                        Intent intent2 = new Intent(t0.b, (Class<?>) OpenChatReceiver.class);
                        long B1 = ij.B1(((TLRPC.TL_topPeer) arrayList6.get(i15)).peer);
                        if (m5.E(B1)) {
                            intent2.putExtra("userId", B1);
                            user = uiVar.getMessagesController().a2(Long.valueOf(B1));
                            r15 = sQLiteCursor4;
                            arrayList = arrayList10;
                        } else {
                            arrayList = arrayList10;
                            long j3 = -B1;
                            TLRPC.Chat M0 = uiVar.getMessagesController().M0(Long.valueOf(j3));
                            intent2.putExtra("chatId", j3);
                            user = null;
                            r15 = M0;
                        }
                        if ((user == null || t10.x(user)) && r15 == 0) {
                            z9 = z11;
                            arrayList2 = arrayList6;
                            uiVar2 = uiVar;
                            arrayList3 = arrayList;
                            sQLiteCursor = null;
                        } else if (user != null) {
                            str = g5.m(0, user.first_name, user.last_name);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                                ui uiVar4 = uiVar;
                                intent2.putExtra("currentAccount", uiVar4.currentAccount);
                                intent2.setAction("com.tmessages.openchat" + B1);
                                intent2.putExtra("dialogId", B1);
                                intent2.putExtra("hash", iz.q);
                                intent2.addFlags(67108864);
                                if (fileLocation == null) {
                                    try {
                                        try {
                                            uiVar4.getFileLoader().getClass();
                                            str2 = str;
                                            try {
                                                try {
                                                    ?? decodeFile = BitmapFactory.decodeFile(w7.J(fileLocation, null, true, true).toString());
                                                    if (decodeFile != null) {
                                                        try {
                                                            int L = g0.L(48.0f);
                                                            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                                                            ?? canvas = new Canvas(createBitmap);
                                                            if (ui.Y1 == null) {
                                                                try {
                                                                    bitmap = createBitmap;
                                                                    ui.Y1 = new Paint(3);
                                                                    ui.a2 = new RectF();
                                                                    Paint paint = new Paint(1);
                                                                    ui.Z1 = paint;
                                                                    uiVar2 = uiVar4;
                                                                    try {
                                                                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                                                        Path path = new Path();
                                                                        ui.b2 = path;
                                                                        z9 = z11;
                                                                        arrayList2 = arrayList6;
                                                                        try {
                                                                            path.addCircle(L / 2, L / 2, (L / 2) - g0.L(2.0f), Path.Direction.CW);
                                                                            ui.b2.toggleInverseFillType();
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            sQLiteCursor3 = decodeFile;
                                                                            z10 = true;
                                                                            sQLiteCursor = null;
                                                                            a8.g(th, z10);
                                                                            r19 = sQLiteCursor3;
                                                                            String str4 = "did3_" + B1;
                                                                            if (!TextUtils.isEmpty(str2)) {
                                                                            }
                                                                            Context context2 = t0.b;
                                                                            g0.c cVar2 = new g0.c();
                                                                            cVar2.a = context2;
                                                                            cVar2.b = str4;
                                                                            cVar2.e = r2;
                                                                            cVar2.f = r2;
                                                                            cVar2.m = i15 + 1;
                                                                            cVar2.c = new Intent[]{intent2};
                                                                            if (iz.x0) {
                                                                            }
                                                                            if (r19 == 0) {
                                                                            }
                                                                            if (!z9) {
                                                                            }
                                                                            i15++;
                                                                            sQLiteCursor4 = sQLiteCursor;
                                                                            arrayList6 = arrayList2;
                                                                            uiVar = uiVar2;
                                                                            z11 = z9;
                                                                            arrayList10 = arrayList3;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        z9 = z11;
                                                                        arrayList2 = arrayList6;
                                                                        sQLiteCursor3 = decodeFile;
                                                                        z10 = true;
                                                                        sQLiteCursor = null;
                                                                        a8.g(th, z10);
                                                                        r19 = sQLiteCursor3;
                                                                        String str42 = "did3_" + B1;
                                                                        if (!TextUtils.isEmpty(str2)) {
                                                                        }
                                                                        Context context22 = t0.b;
                                                                        g0.c cVar22 = new g0.c();
                                                                        cVar22.a = context22;
                                                                        cVar22.b = str42;
                                                                        cVar22.e = r2;
                                                                        cVar22.f = r2;
                                                                        cVar22.m = i15 + 1;
                                                                        cVar22.c = new Intent[]{intent2};
                                                                        if (iz.x0) {
                                                                        }
                                                                        if (r19 == 0) {
                                                                        }
                                                                        if (!z9) {
                                                                        }
                                                                        i15++;
                                                                        sQLiteCursor4 = sQLiteCursor;
                                                                        arrayList6 = arrayList2;
                                                                        uiVar = uiVar2;
                                                                        z11 = z9;
                                                                        arrayList10 = arrayList3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    uiVar2 = uiVar4;
                                                                }
                                                            } else {
                                                                bitmap = createBitmap;
                                                                uiVar2 = uiVar4;
                                                                z9 = z11;
                                                                arrayList2 = arrayList6;
                                                            }
                                                            try {
                                                                ui.a2.set(g0.L(2.0f), g0.L(2.0f), g0.L(46.0f), g0.L(46.0f));
                                                                sQLiteCursor = null;
                                                                try {
                                                                    canvas.drawBitmap(decodeFile, null, ui.a2, ui.Y1);
                                                                    canvas.drawPath(ui.b2, ui.Z1);
                                                                    try {
                                                                        canvas.setBitmap(null);
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    r19 = bitmap;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    sQLiteCursor2 = decodeFile;
                                                                    z10 = true;
                                                                    sQLiteCursor3 = sQLiteCursor2;
                                                                    a8.g(th, z10);
                                                                    r19 = sQLiteCursor3;
                                                                    String str422 = "did3_" + B1;
                                                                    if (!TextUtils.isEmpty(str2)) {
                                                                    }
                                                                    Context context222 = t0.b;
                                                                    g0.c cVar222 = new g0.c();
                                                                    cVar222.a = context222;
                                                                    cVar222.b = str422;
                                                                    cVar222.e = r2;
                                                                    cVar222.f = r2;
                                                                    cVar222.m = i15 + 1;
                                                                    cVar222.c = new Intent[]{intent2};
                                                                    if (iz.x0) {
                                                                    }
                                                                    if (r19 == 0) {
                                                                    }
                                                                    if (!z9) {
                                                                    }
                                                                    i15++;
                                                                    sQLiteCursor4 = sQLiteCursor;
                                                                    arrayList6 = arrayList2;
                                                                    uiVar = uiVar2;
                                                                    z11 = z9;
                                                                    arrayList10 = arrayList3;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                sQLiteCursor = null;
                                                                sQLiteCursor2 = decodeFile;
                                                                z10 = true;
                                                                sQLiteCursor3 = sQLiteCursor2;
                                                                a8.g(th, z10);
                                                                r19 = sQLiteCursor3;
                                                                String str4222 = "did3_" + B1;
                                                                if (!TextUtils.isEmpty(str2)) {
                                                                }
                                                                Context context2222 = t0.b;
                                                                g0.c cVar2222 = new g0.c();
                                                                cVar2222.a = context2222;
                                                                cVar2222.b = str4222;
                                                                cVar2222.e = r2;
                                                                cVar2222.f = r2;
                                                                cVar2222.m = i15 + 1;
                                                                cVar2222.c = new Intent[]{intent2};
                                                                if (iz.x0) {
                                                                }
                                                                if (r19 == 0) {
                                                                }
                                                                if (!z9) {
                                                                }
                                                                i15++;
                                                                sQLiteCursor4 = sQLiteCursor;
                                                                arrayList6 = arrayList2;
                                                                uiVar = uiVar2;
                                                                z11 = z9;
                                                                arrayList10 = arrayList3;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            uiVar2 = uiVar4;
                                                            z9 = z11;
                                                            arrayList2 = arrayList6;
                                                        }
                                                    } else {
                                                        uiVar2 = uiVar4;
                                                        z9 = z11;
                                                        arrayList2 = arrayList6;
                                                        sQLiteCursor = null;
                                                        r19 = decodeFile;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    uiVar2 = uiVar4;
                                                    z9 = z11;
                                                    arrayList2 = arrayList6;
                                                    sQLiteCursor = null;
                                                    sQLiteCursor2 = sQLiteCursor;
                                                    z10 = true;
                                                    sQLiteCursor3 = sQLiteCursor2;
                                                    a8.g(th, z10);
                                                    r19 = sQLiteCursor3;
                                                    String str42222 = "did3_" + B1;
                                                    if (!TextUtils.isEmpty(str2)) {
                                                    }
                                                    Context context22222 = t0.b;
                                                    g0.c cVar22222 = new g0.c();
                                                    cVar22222.a = context22222;
                                                    cVar22222.b = str42222;
                                                    cVar22222.e = r2;
                                                    cVar22222.f = r2;
                                                    cVar22222.m = i15 + 1;
                                                    cVar22222.c = new Intent[]{intent2};
                                                    if (iz.x0) {
                                                    }
                                                    if (r19 == 0) {
                                                    }
                                                    if (!z9) {
                                                    }
                                                    i15++;
                                                    sQLiteCursor4 = sQLiteCursor;
                                                    arrayList6 = arrayList2;
                                                    uiVar = uiVar2;
                                                    z11 = z9;
                                                    arrayList10 = arrayList3;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                uiVar2 = uiVar4;
                                                sQLiteCursor = null;
                                                z9 = z11;
                                                arrayList2 = arrayList6;
                                                sQLiteCursor2 = sQLiteCursor;
                                                z10 = true;
                                                sQLiteCursor3 = sQLiteCursor2;
                                                a8.g(th, z10);
                                                r19 = sQLiteCursor3;
                                                String str422222 = "did3_" + B1;
                                                if (!TextUtils.isEmpty(str2)) {
                                                }
                                                Context context222222 = t0.b;
                                                g0.c cVar222222 = new g0.c();
                                                cVar222222.a = context222222;
                                                cVar222222.b = str422222;
                                                cVar222222.e = r2;
                                                cVar222222.f = r2;
                                                cVar222222.m = i15 + 1;
                                                cVar222222.c = new Intent[]{intent2};
                                                if (iz.x0) {
                                                }
                                                if (r19 == 0) {
                                                }
                                                if (!z9) {
                                                }
                                                i15++;
                                                sQLiteCursor4 = sQLiteCursor;
                                                arrayList6 = arrayList2;
                                                uiVar = uiVar2;
                                                z11 = z9;
                                                arrayList10 = arrayList3;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            str2 = str;
                                            uiVar2 = uiVar4;
                                            sQLiteCursor = null;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        str2 = str;
                                    }
                                } else {
                                    str2 = str;
                                    uiVar2 = uiVar4;
                                    z9 = z11;
                                    arrayList2 = arrayList6;
                                    sQLiteCursor = null;
                                    r19 = 0;
                                }
                                String str4222222 = "did3_" + B1;
                                String str5 = !TextUtils.isEmpty(str2) ? " " : str2;
                                Context context2222222 = t0.b;
                                g0.c cVar2222222 = new g0.c();
                                cVar2222222.a = context2222222;
                                cVar2222222.b = str4222222;
                                cVar2222222.e = str5;
                                cVar2222222.f = str5;
                                cVar2222222.m = i15 + 1;
                                cVar2222222.c = new Intent[]{intent2};
                                if (iz.x0) {
                                    a0.g gVar = new a0.g(0);
                                    gVar.addAll(hashSet);
                                    cVar2222222.j = gVar;
                                }
                                if (r19 == 0) {
                                    cVar2222222.h = IconCompat.c(r19);
                                } else {
                                    cVar2222222.h = IconCompat.d(t0.b, R.drawable.shortcut_user);
                                }
                                if (!z9) {
                                    Context context3 = t0.b;
                                    if (TextUtils.isEmpty(cVar2222222.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr2 = cVar2222222.c;
                                    if (intentArr2 == null || intentArr2.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    g0.f.m(context3, cVar2222222);
                                    arrayList3 = arrayList;
                                } else {
                                    if (TextUtils.isEmpty(cVar2222222.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr3 = cVar2222222.c;
                                    if (intentArr3 == null || intentArr3.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    arrayList3 = arrayList;
                                    arrayList3.add(cVar2222222);
                                    if (arrayList7.contains(str4222222)) {
                                        g0.f.x(t0.b, arrayList3);
                                    } else {
                                        g0.f.a(t0.b, arrayList3);
                                    }
                                    arrayList3.clear();
                                }
                            }
                            fileLocation = null;
                            ui uiVar42 = uiVar;
                            intent2.putExtra("currentAccount", uiVar42.currentAccount);
                            intent2.setAction("com.tmessages.openchat" + B1);
                            intent2.putExtra("dialogId", B1);
                            intent2.putExtra("hash", iz.q);
                            intent2.addFlags(67108864);
                            if (fileLocation == null) {
                            }
                            String str42222222 = "did3_" + B1;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            Context context22222222 = t0.b;
                            g0.c cVar22222222 = new g0.c();
                            cVar22222222.a = context22222222;
                            cVar22222222.b = str42222222;
                            cVar22222222.e = str5;
                            cVar22222222.f = str5;
                            cVar22222222.m = i15 + 1;
                            cVar22222222.c = new Intent[]{intent2};
                            if (iz.x0) {
                            }
                            if (r19 == 0) {
                            }
                            if (!z9) {
                            }
                        } else {
                            str = r15.title;
                            TLRPC.ChatPhoto chatPhoto = r15.photo;
                            if (chatPhoto != null) {
                                fileLocation = chatPhoto.photo_small;
                                ui uiVar422 = uiVar;
                                intent2.putExtra("currentAccount", uiVar422.currentAccount);
                                intent2.setAction("com.tmessages.openchat" + B1);
                                intent2.putExtra("dialogId", B1);
                                intent2.putExtra("hash", iz.q);
                                intent2.addFlags(67108864);
                                if (fileLocation == null) {
                                }
                                String str422222222 = "did3_" + B1;
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                Context context222222222 = t0.b;
                                g0.c cVar222222222 = new g0.c();
                                cVar222222222.a = context222222222;
                                cVar222222222.b = str422222222;
                                cVar222222222.e = str5;
                                cVar222222222.f = str5;
                                cVar222222222.m = i15 + 1;
                                cVar222222222.c = new Intent[]{intent2};
                                if (iz.x0) {
                                }
                                if (r19 == 0) {
                                }
                                if (!z9) {
                                }
                            }
                            fileLocation = null;
                            ui uiVar4222 = uiVar;
                            intent2.putExtra("currentAccount", uiVar4222.currentAccount);
                            intent2.setAction("com.tmessages.openchat" + B1);
                            intent2.putExtra("dialogId", B1);
                            intent2.putExtra("hash", iz.q);
                            intent2.addFlags(67108864);
                            if (fileLocation == null) {
                            }
                            String str4222222222 = "did3_" + B1;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            Context context2222222222 = t0.b;
                            g0.c cVar2222222222 = new g0.c();
                            cVar2222222222.a = context2222222222;
                            cVar2222222222.b = str4222222222;
                            cVar2222222222.e = str5;
                            cVar2222222222.f = str5;
                            cVar2222222222.m = i15 + 1;
                            cVar2222222222.c = new Intent[]{intent2};
                            if (iz.x0) {
                            }
                            if (r19 == 0) {
                            }
                            if (!z9) {
                            }
                        }
                        i15++;
                        sQLiteCursor4 = sQLiteCursor;
                        arrayList6 = arrayList2;
                        uiVar = uiVar2;
                        z11 = z9;
                        arrayList10 = arrayList3;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 1:
                qp qpVar = (qp) this.c;
                TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) this.d;
                boolean z12 = this.b;
                ConcurrentHashMap concurrentHashMap = qpVar.P;
                ConcurrentHashMap concurrentHashMap2 = qpVar.O;
                a0.h hVar = new a0.h();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h(tL_messages_dialogs.users.size());
                a0.h hVar4 = new a0.h(tL_messages_dialogs.chats.size());
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray();
                int i16 = 0;
                while (i16 < tL_messages_dialogs.users.size()) {
                    TLRPC.User user2 = tL_messages_dialogs.users.get(i16);
                    hVar3.k(user2, user2.id);
                    i16++;
                    longSparseIntArray2 = longSparseIntArray2;
                }
                LongSparseIntArray longSparseIntArray3 = longSparseIntArray2;
                for (int i17 = 0; i17 < tL_messages_dialogs.chats.size(); i17++) {
                    TLRPC.Chat chat3 = tL_messages_dialogs.chats.get(i17);
                    hVar4.k(chat3, chat3.id);
                }
                ArrayList arrayList11 = new ArrayList();
                int i18 = 0;
                while (i18 < tL_messages_dialogs.messages.size()) {
                    TLRPC.Message message2 = tL_messages_dialogs.messages.get(i18);
                    long j10 = qpVar.z2;
                    ArrayList arrayList12 = arrayList11;
                    if (j10 == 0 || j10 != message2.dialog_id) {
                        TLRPC.Peer peer = message2.peer_id;
                        if (peer != null) {
                            long j11 = peer.channel_id;
                            if (j11 != 0) {
                                TLRPC.Chat chat4 = (TLRPC.Chat) hVar4.f(j11);
                                if (chat4 != null) {
                                    break;
                                }
                            }
                        }
                        if (peer != null) {
                            long j12 = peer.chat_id;
                            if (j12 != 0) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) hVar4.f(j12);
                                if (chat5 != null) {
                                    if (chat5.migrated_to == null) {
                                        break;
                                    }
                                    i10 = i18;
                                    arrayList5 = arrayList12;
                                    i18 = i10 + 1;
                                    arrayList11 = arrayList5;
                                }
                            }
                        }
                    }
                    ij ijVar = new ij(qpVar.currentAccount, message2, hVar3, hVar4, false, false);
                    arrayList5 = arrayList12;
                    arrayList5.add(ijVar);
                    long B0 = ij.B0(ijVar.k);
                    ArrayList arrayList13 = (ArrayList) hVar2.f(B0);
                    if (arrayList13 == null) {
                        i10 = i18;
                        arrayList13 = new ArrayList(1);
                    } else {
                        i10 = i18;
                    }
                    arrayList13.add(ijVar);
                    hVar2.k(arrayList13, B0);
                    i18 = i10 + 1;
                    arrayList11 = arrayList5;
                }
                qpVar.getFileLoader().l(arrayList11);
                int i19 = 0;
                while (i19 < tL_messages_dialogs.dialogs.size()) {
                    TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i19);
                    m5.x(dialog);
                    long j13 = qpVar.z2;
                    if ((j13 == 0 || j13 != dialog.id) && (!m5.y(dialog) ? !(!m5.z(dialog.id) || (chat = (TLRPC.Chat) hVar4.f(-dialog.id)) == null || (chat.migrated_to == null && !t3.r0(chat))) : !((chat2 = (TLRPC.Chat) hVar4.f(-dialog.id)) == null || !t3.r0(chat2)))) {
                        longSparseIntArray = longSparseIntArray3;
                    } else {
                        if (dialog.last_message_date == 0 && (arrayList4 = (ArrayList) hVar2.f(dialog.id)) != null) {
                            int i20 = Integer.MIN_VALUE;
                            for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                                ij ijVar2 = (ij) arrayList4.get(i21);
                                if (ijVar2 != null && (message = ijVar2.k) != null && (i7 = message.date) > i20) {
                                    i20 = i7;
                                }
                            }
                            if (i20 > Integer.MIN_VALUE) {
                                dialog.last_message_date = i20;
                            }
                        }
                        hVar.k(dialog, dialog.id);
                        longSparseIntArray = longSparseIntArray3;
                        longSparseIntArray.put(dialog.id, dialog.unread_count);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                        if (num == null) {
                            num = 0;
                        }
                        int i22 = dialog.read_inbox_max_id;
                        int i23 = dialog.top_message;
                        if (i22 > i23) {
                            dialog.read_inbox_max_id = i23;
                        }
                        int intValue = num.intValue();
                        int i24 = dialog.top_message;
                        if (intValue > i24) {
                            num = Integer.valueOf(i24);
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                    }
                    i19++;
                    longSparseIntArray3 = longSparseIntArray;
                }
                g0.h3(new gy(qpVar, tL_messages_dialogs, hVar, hVar2, z12, longSparseIntArray3));
                return;
            case 2:
                h();
                return;
            case 3:
                j();
                return;
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                c();
                return;
            case 7:
                d();
                return;
            case 8:
                f();
                return;
            case 9:
                g();
                return;
            case 10:
                i();
                return;
            default:
                yr yrVar = (yr) this.c;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                boolean z13 = this.b;
                try {
                    SQLiteCursor queryFinalized = yrVar.b.queryFinalized("SELECT online, inviter, links FROM chat_settings_v2 WHERE uid = " + chatFull.id, new Object[0]);
                    try {
                        if (queryFinalized.next()) {
                            i12 = queryFinalized.intValue(0);
                            chatFull.inviterId = queryFinalized.longValue(1);
                            i11 = queryFinalized.intValue(2);
                        } else {
                            i11 = 0;
                            i12 = -1;
                        }
                        queryFinalized.dispose();
                        if (z13 && i12 == -1) {
                            return;
                        }
                        if (i12 >= 0 && (chatFull.flags & TLObject.FLAG_13) == 0) {
                            chatFull.online_count = i12;
                        }
                        if (i11 >= 0) {
                            chatFull.invitesCount = i11;
                        }
                        sQLitePreparedStatement = yrVar.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                        try {
                            try {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chatFull.getObjectSize());
                                chatFull.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(1, chatFull.id);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindInteger(3, chatFull.pinned_msg_id);
                                sQLitePreparedStatement.bindInteger(4, chatFull.online_count);
                                sQLitePreparedStatement.bindLong(5, chatFull.inviterId);
                                sQLitePreparedStatement.bindInteger(6, chatFull.invitesCount);
                                sQLitePreparedStatement.bindInteger(7, chatFull.participants_count);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                nativeByteBuffer.reuse();
                                if (chatFull instanceof TLRPC.TL_channelFull) {
                                    SQLiteCursor queryFinalized2 = yrVar.b.queryFinalized("SELECT inbox_max, outbox_max FROM dialogs WHERE did = " + (-chatFull.id), new Object[0]);
                                    try {
                                        if (!queryFinalized2.next() || queryFinalized2.intValue(0) >= chatFull.read_inbox_max_id) {
                                            sQLitePreparedStatement2 = null;
                                        } else {
                                            int intValue2 = queryFinalized2.intValue(1);
                                            sQLitePreparedStatement2 = yrVar.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ?, outbox_max = ? WHERE did = ?");
                                            try {
                                                sQLitePreparedStatement2.bindInteger(1, chatFull.unread_count);
                                                sQLitePreparedStatement2.bindInteger(2, chatFull.read_inbox_max_id);
                                                sQLitePreparedStatement2.bindInteger(3, Math.max(intValue2, chatFull.read_outbox_max_id));
                                                sQLitePreparedStatement2.bindLong(4, -chatFull.id);
                                                sQLitePreparedStatement2.step();
                                                sQLitePreparedStatement2.dispose();
                                            } catch (Exception e11) {
                                                e = e11;
                                                sQLiteCursor4 = queryFinalized2;
                                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                                yrVar.o(e, true);
                                                if (sQLiteCursor4 != null) {
                                                }
                                                if (sQLitePreparedStatement == null) {
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                sQLiteCursor4 = queryFinalized2;
                                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                                if (sQLiteCursor4 != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        queryFinalized2.dispose();
                                    } catch (Exception e12) {
                                        e = e12;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor4 = queryFinalized2;
                                        yrVar.o(e, true);
                                        if (sQLiteCursor4 != null) {
                                            sQLiteCursor4.dispose();
                                        }
                                        if (sQLitePreparedStatement == null) {
                                            sQLitePreparedStatement.dispose();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor4 = queryFinalized2;
                                        if (sQLiteCursor4 != null) {
                                            sQLiteCursor4.dispose();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sQLitePreparedStatement2 = null;
                                }
                            } catch (Exception e13) {
                                e = e13;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                        }
                        try {
                            if ((chatFull.flags & 2048) != 0) {
                                executeFast = yrVar.b.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                                try {
                                    executeFast.bindInteger(1, chatFull.folder_id);
                                    executeFast.bindLong(2, -chatFull.id);
                                    executeFast.step();
                                    executeFast.dispose();
                                    yrVar.J.l(-chatFull.id);
                                    sQLitePreparedStatement2 = null;
                                } catch (Exception e14) {
                                    e = e14;
                                    sQLitePreparedStatement = executeFast;
                                    yrVar.o(e, true);
                                    if (sQLiteCursor4 != null) {
                                    }
                                    if (sQLitePreparedStatement == null) {
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    sQLitePreparedStatement = executeFast;
                                    if (sQLiteCursor4 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                            executeFast = yrVar.b.executeFast("UPDATE dialogs SET ttl_period = ? WHERE did = ?");
                            executeFast.bindInteger(1, chatFull.ttl_period);
                            executeFast.bindLong(2, -chatFull.id);
                            executeFast.step();
                            executeFast.dispose();
                            return;
                        } catch (Exception e15) {
                            e = e15;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            yrVar.o(e, true);
                            if (sQLiteCursor4 != null) {
                            }
                            if (sQLitePreparedStatement == null) {
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            if (sQLiteCursor4 != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        sQLitePreparedStatement = null;
                        sQLiteCursor4 = queryFinalized;
                    } catch (Throwable th17) {
                        th = th17;
                        sQLitePreparedStatement = null;
                        sQLiteCursor4 = queryFinalized;
                    }
                } catch (Exception e17) {
                    e = e17;
                    sQLitePreparedStatement = null;
                } catch (Throwable th18) {
                    th = th18;
                    sQLitePreparedStatement = null;
                }
                break;
        }
    }

    public /* synthetic */ yf(Object obj, boolean z9, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
        this.d = obj2;
    }
}
