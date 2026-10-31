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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wf(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    private final void a() {
        b8 b8Var = (b8) this.c;
        boolean z10 = this.b;
        String str = (String) this.d;
        d9 d9Var = !z10 ? (d9) b8Var.h.get(str) : (d9) b8Var.n.get(str);
        b8Var.y.remove(str);
        if (d9Var != null) {
            b8Var.n.remove(str);
            b8Var.e.remove(d9Var);
            b8Var.f.remove(d9Var);
            if (d9Var.m == 3) {
                return;
            }
            d9Var.m = 2;
            Utilities.d.c(new z8(d9Var, 1));
            String str2 = d9Var.l;
            if (str2 == null) {
                Set set = c1.a;
            } else {
                c1.a.remove(str2);
            }
            d9Var.o.a();
            d9Var.b();
        }
    }

    private final void b() {
        hc hcVar = (hc) this.c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i10 = 0;
        while (true) {
            int i11 = 3;
            if (i10 >= 3) {
                return;
            }
            if (i10 > 0 && !this.b) {
                return;
            }
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 1) {
                i11 = 0;
            }
            int G = imageReceiver.G(i11);
            if (G != 0) {
                if (i10 == 0) {
                    HashMap hashMap = hcVar.l;
                    SparseArray sparseArray = hcVar.m;
                    String str = (String) sparseArray.get(G);
                    if (str != null) {
                        fc fcVar = (fc) hashMap.get(str);
                        if (fcVar != null) {
                            ArrayList arrayList = fcVar.c;
                            int indexOf = arrayList.indexOf(imageReceiver);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                                fcVar.d.remove(indexOf);
                            }
                            if (arrayList.isEmpty()) {
                                hashMap.remove(str);
                            }
                        }
                        sparseArray.remove(G);
                    }
                }
                vb vbVar = (vb) hcVar.k.get(G);
                if (vbVar != null) {
                    vbVar.b(imageReceiver);
                }
            }
            i10++;
        }
    }

    private final void c() {
        int i10;
        int writeFrame;
        mg.c2 c2Var = (mg.c2) this.c;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        MediaController mediaController = (MediaController) c2Var.b;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = mediaController.x1;
            if (remaining > byteBuffer2.remaining()) {
                i10 = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
            } else {
                i10 = -1;
            }
            byteBuffer2.put(byteBuffer);
            int position = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            boolean z10 = this.b;
            if (position == limit || z10) {
                writeFrame = mediaController.writeFrame(byteBuffer2, !z10 ? byteBuffer2.limit() : byteBuffer.position());
                if (writeFrame != 0) {
                    byteBuffer2.rewind();
                    mediaController.j1 += (byteBuffer2.limit() / 2) / (mediaController.z1 / 1000);
                    mediaController.k1++;
                } else {
                    f8.d("writing frame failed");
                }
            }
            if (i10 != -1) {
                byteBuffer.limit(i10);
            }
        }
        mediaController.L1.c(new t6(22, c2Var, byteBuffer));
    }

    private final void d() {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        ui uiVar = (ui) this.c;
        gs gsVar = (gs) this.d;
        try {
            if (gsVar.b != 0) {
                SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                Locale locale = Locale.US;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + gsVar.a + " AND tid = " + gsVar.b, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().b;
                Locale locale2 = Locale.US;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + gsVar.a, new Object[0]);
            }
            if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                message = null;
            } else {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (message != null || this.b) {
                i0.g3(new pg(uiVar, message, gsVar));
            }
        } catch (Exception e) {
            f8.g(e, true);
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
        hs hsVar = (hs) this.c;
        TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
        TLRPC.User user = userFull.user;
        long j10 = user != null ? user.id : userFull.id;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        if (this.b) {
            try {
                queryFinalized = hsVar.b.queryFinalized("SELECT uid FROM user_settings WHERE uid = " + j10, new Object[0]);
                try {
                    try {
                        boolean next = queryFinalized.next();
                        queryFinalized.dispose();
                        if (!next) {
                            return;
                        }
                    } catch (Exception e) {
                        e = e;
                        hsVar.o(e, true);
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
            } catch (Exception e7) {
                e = e7;
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
        SQLitePreparedStatement executeFast = hsVar.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
            userFull.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, j10);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.bindInteger(3, userFull.pinned_msg_id);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            if ((userFull.flags & 2048) != 0) {
                SQLitePreparedStatement executeFast2 = hsVar.b.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                executeFast2.bindInteger(1, userFull.folder_id);
                executeFast2.bindLong(2, j10);
                executeFast2.step();
                executeFast2.dispose();
                hsVar.J.l(j10);
            }
            if ((userFull.flags & TLObject.FLAG_14) != 0) {
                executeFast = hsVar.b.executeFast("UPDATE dialogs SET ttl_period = ? WHERE did = ?");
                executeFast.bindInteger(1, userFull.ttl_period);
                executeFast.bindLong(2, j10);
                executeFast.step();
                executeFast.dispose();
            }
        } catch (Exception e10) {
            e = e10;
            sQLitePreparedStatement = executeFast;
            queryFinalized = null;
            hsVar.o(e, true);
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
        hs hsVar = (hs) this.c;
        hsVar.x1((ap) this.d, this.b);
        hsVar.j(false);
        i0.g3(new br(hsVar, 17));
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
        boolean z10;
        hs hsVar = (hs) this.c;
        HashMap hashMap = (HashMap) this.d;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        try {
            try {
                if (v2.a) {
                    f8.b(hsVar.currentAccount + " save contacts to db " + hashMap.size());
                }
                hsVar.b.executeFast("DELETE FROM user_contacts_v7 WHERE 1").stepThis().dispose();
                hsVar.b.executeFast("DELETE FROM user_phones_v7 WHERE 1").stepThis().dispose();
                hsVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = hsVar.b.executeFast("REPLACE INTO user_contacts_v7 VALUES(?, ?, ?, ?, ?)");
                try {
                    sQLitePreparedStatement = hsVar.b.executeFast("REPLACE INTO user_phones_v7 VALUES(?, ?, ?, ?)");
                    try {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            z10 = false;
                            if (!it.hasNext()) {
                                break;
                            }
                            f5 f5Var = (f5) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList = f5Var.e;
                            ArrayList arrayList2 = f5Var.g;
                            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                                executeFast.requery();
                                executeFast.bindString(1, f5Var.b);
                                executeFast.bindInteger(2, f5Var.a);
                                executeFast.bindString(3, f5Var.i);
                                executeFast.bindString(4, f5Var.j);
                                executeFast.bindInteger(5, f5Var.l);
                                executeFast.step();
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindString(1, f5Var.b);
                                    sQLitePreparedStatement.bindString(2, (String) arrayList.get(i10));
                                    sQLitePreparedStatement.bindString(3, (String) arrayList2.get(i10));
                                    sQLitePreparedStatement.bindInteger(4, ((Integer) f5Var.h.get(i10)).intValue());
                                    sQLitePreparedStatement.step();
                                }
                            }
                        }
                        executeFast.dispose();
                        try {
                            sQLitePreparedStatement.dispose();
                            hsVar.b.commitTransaction();
                            if (this.b) {
                                hsVar.b.executeFast("DROP TABLE IF EXISTS user_contacts_v6;").stepThis().dispose();
                                hsVar.b.executeFast("DROP TABLE IF EXISTS user_phones_v6;").stepThis().dispose();
                                sQLitePreparedStatement = null;
                                hsVar.a.c(new kr(hsVar, z10 ? 1 : 0, false ? 1 : 0));
                            }
                            SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                            hsVar = sQLiteDatabase2;
                            if (sQLiteDatabase2 != 0) {
                                sQLiteDatabase2.commitTransaction();
                            }
                        } catch (Exception e) {
                            e = e;
                            hsVar.o(e, true);
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            sQLiteDatabase = hsVar.b;
                            hsVar = sQLiteDatabase;
                            if (sQLiteDatabase != 0) {
                                sQLiteDatabase.commitTransaction();
                                hsVar = sQLiteDatabase;
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        sQLitePreparedStatement2 = executeFast;
                        hsVar.o(e, true);
                        if (sQLitePreparedStatement2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        sQLiteDatabase = hsVar.b;
                        hsVar = sQLiteDatabase;
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
                        SQLiteDatabase sQLiteDatabase3 = hsVar.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLitePreparedStatement = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = null;
        } catch (Throwable th5) {
            th = th5;
            sQLitePreparedStatement = null;
        }
    }

    private final void i() {
        int i10;
        hs hsVar = (hs) this.c;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = hsVar.b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.id);
                sQLitePreparedStatement.step();
                if (this.b && (i10 = encryptedChat.in_seq_no) != 0) {
                    long j10 = (int) (encryptedChat.id & 4294967295L);
                    SQLiteDatabase sQLiteDatabase = hsVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j10 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i10 + ") AND uid = " + j10).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                hsVar.o(e, true);
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
    
        r10 = org.telegram.messenger.m5.i(r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016b, code lost:
    
        r10.add(new org.telegram.messenger.jj(r2.currentAccount, r1, true, true));
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
    
        org.telegram.messenger.i0.g3(new org.telegram.messenger.hq(r2, r0, 1));
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
        boolean z10;
        SQLitePreparedStatement sQLitePreparedStatement;
        hs hsVar = (hs) this.c;
        a0.h hVar = (a0.h) this.d;
        a0.h hVar2 = new a0.h();
        boolean z11 = this.b;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        if (z11) {
            try {
                try {
                    hsVar.b.beginTransaction();
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                z10 = true;
                sQLitePreparedStatement = null;
                hsVar.o(e, z10);
            }
        }
        try {
            sQLitePreparedStatement = hsVar.b.executeFast("DELETE FROM ephemeral_messages WHERE dialog_id = ? AND id = ?;");
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                try {
                    try {
                        long j10 = hVar.j(i10);
                        ArrayList arrayList = (ArrayList) hVar.n(i10);
                        if (arrayList != null) {
                            hVar2.k(hsVar.Y(arrayList, j10), j10);
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, j10);
                                sQLitePreparedStatement.bindInteger(2, ((Integer) arrayList.get(i11)).intValue());
                                sQLitePreparedStatement.step();
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        z10 = true;
                        hsVar.o(e, z10);
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
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                long j11 = hVar.j(i12);
                ArrayList arrayList2 = (ArrayList) hVar.n(i12);
                ui mediaDataController = hsVar.getMediaDataController();
                gs a2 = gs.a(j11, 0L);
                mediaDataController.getClass();
                i0.g3(new kg(mediaDataController, sQLitePreparedStatement2, a2, 2));
                String join = TextUtils.join(",", arrayList2);
                SQLiteDatabase sQLiteDatabase = hsVar.b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("DELETE FROM bot_keyboard WHERE mid IN(" + join + ") AND uid = " + j11).stepThis().dispose();
                hsVar.b.executeFast("DELETE FROM bot_keyboard_topics WHERE mid IN(" + join + ") AND uid = " + j11).stepThis().dispose();
            }
            if (z11) {
                hsVar.b.commitTransaction();
            }
        } catch (Exception e10) {
            e = e10;
            sQLitePreparedStatement = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0267, code lost:
    
        if (org.telegram.messenger.w3.r0(r4) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0286, code lost:
    
        if (org.telegram.messenger.w3.r0(r4) != false) goto L127;
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
        boolean z10;
        ArrayList arrayList2;
        ui uiVar2;
        ArrayList arrayList3;
        SQLiteCursor sQLiteCursor;
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        boolean z11;
        ?? r19;
        Bitmap bitmap;
        TLRPC.Chat chat;
        LongSparseIntArray longSparseIntArray;
        TLRPC.Chat chat2;
        ArrayList arrayList4;
        TLRPC.Message message;
        int i10;
        int i11;
        ArrayList arrayList5;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i12;
        int i13;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor4 = null;
        switch (this.a) {
            case 0:
                ui uiVar3 = (ui) this.c;
                boolean z12 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                try {
                    if (tz.q == null) {
                        tz.q = UUID.randomUUID().toString();
                        w0.b.getSharedPreferences("mainconfig", 0).edit().putString("directShareHash2", tz.q).commit();
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    if (z12) {
                        g0.f.n(w0.b);
                        uiVar = uiVar3;
                    } else {
                        List e = g0.f.e(w0.b);
                        if (e == null || e.isEmpty()) {
                            uiVar = uiVar3;
                        } else {
                            arrayList8.add("compose");
                            int i14 = 0;
                            while (i14 < arrayList6.size()) {
                                arrayList8.add("did3_" + jj.C1(((TLRPC.TL_topPeer) arrayList6.get(i14)).peer));
                                i14++;
                                uiVar3 = uiVar3;
                            }
                            uiVar = uiVar3;
                            for (int i15 = 0; i15 < e.size(); i15++) {
                                String str3 = ((g0.c) e.get(i15)).b;
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
                            g0.f.o(w0.b, arrayList9);
                        }
                    }
                    Intent intent = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                    intent.setAction("new_dialog");
                    ArrayList arrayList10 = new ArrayList();
                    Context context = w0.b;
                    g0.c cVar = new g0.c();
                    cVar.a = context;
                    cVar.b = "compose";
                    cVar.e = cd.L0(2131748292, null);
                    cVar.f = cd.L0(2131748292, null);
                    cVar.h = IconCompat.d(w0.b, R.drawable.shortcut_compose);
                    cVar.m = 0;
                    cVar.c = new Intent[]{intent};
                    if (TextUtils.isEmpty(cVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = cVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    if (z12) {
                        g0.f.m(w0.b, cVar);
                    } else {
                        arrayList10.add(cVar);
                        if (arrayList7.contains("compose")) {
                            g0.f.x(w0.b, arrayList10);
                        } else {
                            g0.f.a(w0.b, arrayList10);
                        }
                        arrayList10.clear();
                    }
                    HashSet hashSet = new HashSet(1);
                    hashSet.add(ui.V1);
                    int i16 = 0;
                    while (i16 < arrayList6.size()) {
                        Intent intent2 = new Intent(w0.b, (Class<?>) OpenChatReceiver.class);
                        long C1 = jj.C1(((TLRPC.TL_topPeer) arrayList6.get(i16)).peer);
                        if (o5.E(C1)) {
                            intent2.putExtra("userId", C1);
                            user = uiVar.getMessagesController().Z1(Long.valueOf(C1));
                            r15 = sQLiteCursor4;
                            arrayList = arrayList10;
                        } else {
                            arrayList = arrayList10;
                            long j10 = -C1;
                            TLRPC.Chat L0 = uiVar.getMessagesController().L0(Long.valueOf(j10));
                            intent2.putExtra("chatId", j10);
                            user = null;
                            r15 = L0;
                        }
                        if ((user == null || h20.x(user)) && r15 == 0) {
                            z10 = z12;
                            arrayList2 = arrayList6;
                            uiVar2 = uiVar;
                            arrayList3 = arrayList;
                            sQLiteCursor = null;
                        } else if (user != null) {
                            str = i5.m(0, user.first_name, user.last_name);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                                ui uiVar4 = uiVar;
                                intent2.putExtra("currentAccount", uiVar4.currentAccount);
                                intent2.setAction("com.tmessages.openchat" + C1);
                                intent2.putExtra("dialogId", C1);
                                intent2.putExtra("hash", tz.q);
                                intent2.addFlags(67108864);
                                if (fileLocation == null) {
                                    try {
                                        try {
                                            uiVar4.getFileLoader().getClass();
                                            str2 = str;
                                            try {
                                                try {
                                                    ?? decodeFile = BitmapFactory.decodeFile(b8.K(fileLocation, null, true, true).toString());
                                                    if (decodeFile != null) {
                                                        try {
                                                            int L = i0.L(48.0f);
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
                                                                        z10 = z12;
                                                                        arrayList2 = arrayList6;
                                                                        try {
                                                                            path.addCircle(L / 2, L / 2, (L / 2) - i0.L(2.0f), Path.Direction.CW);
                                                                            ui.b2.toggleInverseFillType();
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            sQLiteCursor3 = decodeFile;
                                                                            z11 = true;
                                                                            sQLiteCursor = null;
                                                                            f8.g(th, z11);
                                                                            r19 = sQLiteCursor3;
                                                                            String str4 = "did3_" + C1;
                                                                            if (!TextUtils.isEmpty(str2)) {
                                                                            }
                                                                            Context context2 = w0.b;
                                                                            g0.c cVar2 = new g0.c();
                                                                            cVar2.a = context2;
                                                                            cVar2.b = str4;
                                                                            cVar2.e = r2;
                                                                            cVar2.f = r2;
                                                                            cVar2.m = i16 + 1;
                                                                            cVar2.c = new Intent[]{intent2};
                                                                            if (tz.x0) {
                                                                            }
                                                                            if (r19 == 0) {
                                                                            }
                                                                            if (!z10) {
                                                                            }
                                                                            i16++;
                                                                            sQLiteCursor4 = sQLiteCursor;
                                                                            arrayList6 = arrayList2;
                                                                            uiVar = uiVar2;
                                                                            z12 = z10;
                                                                            arrayList10 = arrayList3;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        z10 = z12;
                                                                        arrayList2 = arrayList6;
                                                                        sQLiteCursor3 = decodeFile;
                                                                        z11 = true;
                                                                        sQLiteCursor = null;
                                                                        f8.g(th, z11);
                                                                        r19 = sQLiteCursor3;
                                                                        String str42 = "did3_" + C1;
                                                                        if (!TextUtils.isEmpty(str2)) {
                                                                        }
                                                                        Context context22 = w0.b;
                                                                        g0.c cVar22 = new g0.c();
                                                                        cVar22.a = context22;
                                                                        cVar22.b = str42;
                                                                        cVar22.e = r2;
                                                                        cVar22.f = r2;
                                                                        cVar22.m = i16 + 1;
                                                                        cVar22.c = new Intent[]{intent2};
                                                                        if (tz.x0) {
                                                                        }
                                                                        if (r19 == 0) {
                                                                        }
                                                                        if (!z10) {
                                                                        }
                                                                        i16++;
                                                                        sQLiteCursor4 = sQLiteCursor;
                                                                        arrayList6 = arrayList2;
                                                                        uiVar = uiVar2;
                                                                        z12 = z10;
                                                                        arrayList10 = arrayList3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    uiVar2 = uiVar4;
                                                                }
                                                            } else {
                                                                bitmap = createBitmap;
                                                                uiVar2 = uiVar4;
                                                                z10 = z12;
                                                                arrayList2 = arrayList6;
                                                            }
                                                            try {
                                                                ui.a2.set(i0.L(2.0f), i0.L(2.0f), i0.L(46.0f), i0.L(46.0f));
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
                                                                    z11 = true;
                                                                    sQLiteCursor3 = sQLiteCursor2;
                                                                    f8.g(th, z11);
                                                                    r19 = sQLiteCursor3;
                                                                    String str422 = "did3_" + C1;
                                                                    if (!TextUtils.isEmpty(str2)) {
                                                                    }
                                                                    Context context222 = w0.b;
                                                                    g0.c cVar222 = new g0.c();
                                                                    cVar222.a = context222;
                                                                    cVar222.b = str422;
                                                                    cVar222.e = r2;
                                                                    cVar222.f = r2;
                                                                    cVar222.m = i16 + 1;
                                                                    cVar222.c = new Intent[]{intent2};
                                                                    if (tz.x0) {
                                                                    }
                                                                    if (r19 == 0) {
                                                                    }
                                                                    if (!z10) {
                                                                    }
                                                                    i16++;
                                                                    sQLiteCursor4 = sQLiteCursor;
                                                                    arrayList6 = arrayList2;
                                                                    uiVar = uiVar2;
                                                                    z12 = z10;
                                                                    arrayList10 = arrayList3;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                sQLiteCursor = null;
                                                                sQLiteCursor2 = decodeFile;
                                                                z11 = true;
                                                                sQLiteCursor3 = sQLiteCursor2;
                                                                f8.g(th, z11);
                                                                r19 = sQLiteCursor3;
                                                                String str4222 = "did3_" + C1;
                                                                if (!TextUtils.isEmpty(str2)) {
                                                                }
                                                                Context context2222 = w0.b;
                                                                g0.c cVar2222 = new g0.c();
                                                                cVar2222.a = context2222;
                                                                cVar2222.b = str4222;
                                                                cVar2222.e = r2;
                                                                cVar2222.f = r2;
                                                                cVar2222.m = i16 + 1;
                                                                cVar2222.c = new Intent[]{intent2};
                                                                if (tz.x0) {
                                                                }
                                                                if (r19 == 0) {
                                                                }
                                                                if (!z10) {
                                                                }
                                                                i16++;
                                                                sQLiteCursor4 = sQLiteCursor;
                                                                arrayList6 = arrayList2;
                                                                uiVar = uiVar2;
                                                                z12 = z10;
                                                                arrayList10 = arrayList3;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            uiVar2 = uiVar4;
                                                            z10 = z12;
                                                            arrayList2 = arrayList6;
                                                        }
                                                    } else {
                                                        uiVar2 = uiVar4;
                                                        z10 = z12;
                                                        arrayList2 = arrayList6;
                                                        sQLiteCursor = null;
                                                        r19 = decodeFile;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    uiVar2 = uiVar4;
                                                    z10 = z12;
                                                    arrayList2 = arrayList6;
                                                    sQLiteCursor = null;
                                                    sQLiteCursor2 = sQLiteCursor;
                                                    z11 = true;
                                                    sQLiteCursor3 = sQLiteCursor2;
                                                    f8.g(th, z11);
                                                    r19 = sQLiteCursor3;
                                                    String str42222 = "did3_" + C1;
                                                    if (!TextUtils.isEmpty(str2)) {
                                                    }
                                                    Context context22222 = w0.b;
                                                    g0.c cVar22222 = new g0.c();
                                                    cVar22222.a = context22222;
                                                    cVar22222.b = str42222;
                                                    cVar22222.e = r2;
                                                    cVar22222.f = r2;
                                                    cVar22222.m = i16 + 1;
                                                    cVar22222.c = new Intent[]{intent2};
                                                    if (tz.x0) {
                                                    }
                                                    if (r19 == 0) {
                                                    }
                                                    if (!z10) {
                                                    }
                                                    i16++;
                                                    sQLiteCursor4 = sQLiteCursor;
                                                    arrayList6 = arrayList2;
                                                    uiVar = uiVar2;
                                                    z12 = z10;
                                                    arrayList10 = arrayList3;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                uiVar2 = uiVar4;
                                                sQLiteCursor = null;
                                                z10 = z12;
                                                arrayList2 = arrayList6;
                                                sQLiteCursor2 = sQLiteCursor;
                                                z11 = true;
                                                sQLiteCursor3 = sQLiteCursor2;
                                                f8.g(th, z11);
                                                r19 = sQLiteCursor3;
                                                String str422222 = "did3_" + C1;
                                                if (!TextUtils.isEmpty(str2)) {
                                                }
                                                Context context222222 = w0.b;
                                                g0.c cVar222222 = new g0.c();
                                                cVar222222.a = context222222;
                                                cVar222222.b = str422222;
                                                cVar222222.e = r2;
                                                cVar222222.f = r2;
                                                cVar222222.m = i16 + 1;
                                                cVar222222.c = new Intent[]{intent2};
                                                if (tz.x0) {
                                                }
                                                if (r19 == 0) {
                                                }
                                                if (!z10) {
                                                }
                                                i16++;
                                                sQLiteCursor4 = sQLiteCursor;
                                                arrayList6 = arrayList2;
                                                uiVar = uiVar2;
                                                z12 = z10;
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
                                    z10 = z12;
                                    arrayList2 = arrayList6;
                                    sQLiteCursor = null;
                                    r19 = 0;
                                }
                                String str4222222 = "did3_" + C1;
                                String str5 = !TextUtils.isEmpty(str2) ? " " : str2;
                                Context context2222222 = w0.b;
                                g0.c cVar2222222 = new g0.c();
                                cVar2222222.a = context2222222;
                                cVar2222222.b = str4222222;
                                cVar2222222.e = str5;
                                cVar2222222.f = str5;
                                cVar2222222.m = i16 + 1;
                                cVar2222222.c = new Intent[]{intent2};
                                if (tz.x0) {
                                    a0.g gVar = new a0.g(0);
                                    gVar.addAll(hashSet);
                                    cVar2222222.j = gVar;
                                }
                                if (r19 == 0) {
                                    cVar2222222.h = IconCompat.c(r19);
                                } else {
                                    cVar2222222.h = IconCompat.d(w0.b, R.drawable.shortcut_user);
                                }
                                if (!z10) {
                                    Context context3 = w0.b;
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
                                        g0.f.x(w0.b, arrayList3);
                                    } else {
                                        g0.f.a(w0.b, arrayList3);
                                    }
                                    arrayList3.clear();
                                }
                            }
                            fileLocation = null;
                            ui uiVar42 = uiVar;
                            intent2.putExtra("currentAccount", uiVar42.currentAccount);
                            intent2.setAction("com.tmessages.openchat" + C1);
                            intent2.putExtra("dialogId", C1);
                            intent2.putExtra("hash", tz.q);
                            intent2.addFlags(67108864);
                            if (fileLocation == null) {
                            }
                            String str42222222 = "did3_" + C1;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            Context context22222222 = w0.b;
                            g0.c cVar22222222 = new g0.c();
                            cVar22222222.a = context22222222;
                            cVar22222222.b = str42222222;
                            cVar22222222.e = str5;
                            cVar22222222.f = str5;
                            cVar22222222.m = i16 + 1;
                            cVar22222222.c = new Intent[]{intent2};
                            if (tz.x0) {
                            }
                            if (r19 == 0) {
                            }
                            if (!z10) {
                            }
                        } else {
                            str = r15.title;
                            TLRPC.ChatPhoto chatPhoto = r15.photo;
                            if (chatPhoto != null) {
                                fileLocation = chatPhoto.photo_small;
                                ui uiVar422 = uiVar;
                                intent2.putExtra("currentAccount", uiVar422.currentAccount);
                                intent2.setAction("com.tmessages.openchat" + C1);
                                intent2.putExtra("dialogId", C1);
                                intent2.putExtra("hash", tz.q);
                                intent2.addFlags(67108864);
                                if (fileLocation == null) {
                                }
                                String str422222222 = "did3_" + C1;
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                Context context222222222 = w0.b;
                                g0.c cVar222222222 = new g0.c();
                                cVar222222222.a = context222222222;
                                cVar222222222.b = str422222222;
                                cVar222222222.e = str5;
                                cVar222222222.f = str5;
                                cVar222222222.m = i16 + 1;
                                cVar222222222.c = new Intent[]{intent2};
                                if (tz.x0) {
                                }
                                if (r19 == 0) {
                                }
                                if (!z10) {
                                }
                            }
                            fileLocation = null;
                            ui uiVar4222 = uiVar;
                            intent2.putExtra("currentAccount", uiVar4222.currentAccount);
                            intent2.setAction("com.tmessages.openchat" + C1);
                            intent2.putExtra("dialogId", C1);
                            intent2.putExtra("hash", tz.q);
                            intent2.addFlags(67108864);
                            if (fileLocation == null) {
                            }
                            String str4222222222 = "did3_" + C1;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            Context context2222222222 = w0.b;
                            g0.c cVar2222222222 = new g0.c();
                            cVar2222222222.a = context2222222222;
                            cVar2222222222.b = str4222222222;
                            cVar2222222222.e = str5;
                            cVar2222222222.f = str5;
                            cVar2222222222.m = i16 + 1;
                            cVar2222222222.c = new Intent[]{intent2};
                            if (tz.x0) {
                            }
                            if (r19 == 0) {
                            }
                            if (!z10) {
                            }
                        }
                        i16++;
                        sQLiteCursor4 = sQLiteCursor;
                        arrayList6 = arrayList2;
                        uiVar = uiVar2;
                        z12 = z10;
                        arrayList10 = arrayList3;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 1:
                vp vpVar = (vp) this.c;
                TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) this.d;
                boolean z13 = this.b;
                ConcurrentHashMap concurrentHashMap = vpVar.P;
                ConcurrentHashMap concurrentHashMap2 = vpVar.O;
                a0.h hVar = new a0.h();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h(tL_messages_dialogs.users.size());
                a0.h hVar4 = new a0.h(tL_messages_dialogs.chats.size());
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < tL_messages_dialogs.users.size()) {
                    TLRPC.User user2 = tL_messages_dialogs.users.get(i17);
                    hVar3.k(user2, user2.id);
                    i17++;
                    longSparseIntArray2 = longSparseIntArray2;
                }
                LongSparseIntArray longSparseIntArray3 = longSparseIntArray2;
                for (int i18 = 0; i18 < tL_messages_dialogs.chats.size(); i18++) {
                    TLRPC.Chat chat3 = tL_messages_dialogs.chats.get(i18);
                    hVar4.k(chat3, chat3.id);
                }
                ArrayList arrayList11 = new ArrayList();
                int i19 = 0;
                while (i19 < tL_messages_dialogs.messages.size()) {
                    TLRPC.Message message2 = tL_messages_dialogs.messages.get(i19);
                    long j11 = vpVar.z2;
                    ArrayList arrayList12 = arrayList11;
                    if (j11 == 0 || j11 != message2.dialog_id) {
                        TLRPC.Peer peer = message2.peer_id;
                        if (peer != null) {
                            long j12 = peer.channel_id;
                            if (j12 != 0) {
                                TLRPC.Chat chat4 = (TLRPC.Chat) hVar4.f(j12);
                                if (chat4 != null) {
                                    break;
                                }
                            }
                        }
                        if (peer != null) {
                            long j13 = peer.chat_id;
                            if (j13 != 0) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) hVar4.f(j13);
                                if (chat5 != null) {
                                    if (chat5.migrated_to == null) {
                                        break;
                                    }
                                    i11 = i19;
                                    arrayList5 = arrayList12;
                                    i19 = i11 + 1;
                                    arrayList11 = arrayList5;
                                }
                            }
                        }
                    }
                    jj jjVar = new jj(vpVar.currentAccount, message2, hVar3, hVar4, false, false);
                    arrayList5 = arrayList12;
                    arrayList5.add(jjVar);
                    long B0 = jj.B0(jjVar.k);
                    ArrayList arrayList13 = (ArrayList) hVar2.f(B0);
                    if (arrayList13 == null) {
                        i11 = i19;
                        arrayList13 = new ArrayList(1);
                    } else {
                        i11 = i19;
                    }
                    arrayList13.add(jjVar);
                    hVar2.k(arrayList13, B0);
                    i19 = i11 + 1;
                    arrayList11 = arrayList5;
                }
                vpVar.getFileLoader().l(arrayList11);
                int i20 = 0;
                while (i20 < tL_messages_dialogs.dialogs.size()) {
                    TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i20);
                    o5.x(dialog);
                    long j14 = vpVar.z2;
                    if ((j14 == 0 || j14 != dialog.id) && (!o5.y(dialog) ? !(!o5.z(dialog.id) || (chat = (TLRPC.Chat) hVar4.f(-dialog.id)) == null || (chat.migrated_to == null && !w3.r0(chat))) : !((chat2 = (TLRPC.Chat) hVar4.f(-dialog.id)) == null || !w3.r0(chat2)))) {
                        longSparseIntArray = longSparseIntArray3;
                    } else {
                        if (dialog.last_message_date == 0 && (arrayList4 = (ArrayList) hVar2.f(dialog.id)) != null) {
                            int i21 = Integer.MIN_VALUE;
                            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                                jj jjVar2 = (jj) arrayList4.get(i22);
                                if (jjVar2 != null && (message = jjVar2.k) != null && (i10 = message.date) > i21) {
                                    i21 = i10;
                                }
                            }
                            if (i21 > Integer.MIN_VALUE) {
                                dialog.last_message_date = i21;
                            }
                        }
                        hVar.k(dialog, dialog.id);
                        longSparseIntArray = longSparseIntArray3;
                        longSparseIntArray.put(dialog.id, dialog.unread_count);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                        if (num == null) {
                            num = 0;
                        }
                        int i23 = dialog.read_inbox_max_id;
                        int i24 = dialog.top_message;
                        if (i23 > i24) {
                            dialog.read_inbox_max_id = i24;
                        }
                        int intValue = num.intValue();
                        int i25 = dialog.top_message;
                        if (intValue > i25) {
                            num = Integer.valueOf(i25);
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                    }
                    i20++;
                    longSparseIntArray3 = longSparseIntArray;
                }
                i0.g3(new sy(vpVar, tL_messages_dialogs, hVar, hVar2, z13, longSparseIntArray3));
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
                hs hsVar = (hs) this.c;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                boolean z14 = this.b;
                try {
                    SQLiteCursor queryFinalized = hsVar.b.queryFinalized("SELECT online, inviter, links FROM chat_settings_v2 WHERE uid = " + chatFull.id, new Object[0]);
                    try {
                        if (queryFinalized.next()) {
                            i13 = queryFinalized.intValue(0);
                            chatFull.inviterId = queryFinalized.longValue(1);
                            i12 = queryFinalized.intValue(2);
                        } else {
                            i12 = 0;
                            i13 = -1;
                        }
                        queryFinalized.dispose();
                        if (z14 && i13 == -1) {
                            return;
                        }
                        if (i13 >= 0 && (chatFull.flags & TLObject.FLAG_13) == 0) {
                            chatFull.online_count = i13;
                        }
                        if (i12 >= 0) {
                            chatFull.invitesCount = i12;
                        }
                        sQLitePreparedStatement = hsVar.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
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
                                    SQLiteCursor queryFinalized2 = hsVar.b.queryFinalized("SELECT inbox_max, outbox_max FROM dialogs WHERE did = " + (-chatFull.id), new Object[0]);
                                    try {
                                        if (!queryFinalized2.next() || queryFinalized2.intValue(0) >= chatFull.read_inbox_max_id) {
                                            sQLitePreparedStatement2 = null;
                                        } else {
                                            int intValue2 = queryFinalized2.intValue(1);
                                            sQLitePreparedStatement2 = hsVar.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ?, outbox_max = ? WHERE did = ?");
                                            try {
                                                sQLitePreparedStatement2.bindInteger(1, chatFull.unread_count);
                                                sQLitePreparedStatement2.bindInteger(2, chatFull.read_inbox_max_id);
                                                sQLitePreparedStatement2.bindInteger(3, Math.max(intValue2, chatFull.read_outbox_max_id));
                                                sQLitePreparedStatement2.bindLong(4, -chatFull.id);
                                                sQLitePreparedStatement2.step();
                                                sQLitePreparedStatement2.dispose();
                                            } catch (Exception e7) {
                                                e = e7;
                                                sQLiteCursor4 = queryFinalized2;
                                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                                hsVar.o(e, true);
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
                                    } catch (Exception e10) {
                                        e = e10;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor4 = queryFinalized2;
                                        hsVar.o(e, true);
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
                            } catch (Exception e11) {
                                e = e11;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                        }
                        try {
                            if ((chatFull.flags & 2048) != 0) {
                                executeFast = hsVar.b.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                                try {
                                    executeFast.bindInteger(1, chatFull.folder_id);
                                    executeFast.bindLong(2, -chatFull.id);
                                    executeFast.step();
                                    executeFast.dispose();
                                    hsVar.J.l(-chatFull.id);
                                    sQLitePreparedStatement2 = null;
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLitePreparedStatement = executeFast;
                                    hsVar.o(e, true);
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
                            executeFast = hsVar.b.executeFast("UPDATE dialogs SET ttl_period = ? WHERE did = ?");
                            executeFast.bindInteger(1, chatFull.ttl_period);
                            executeFast.bindLong(2, -chatFull.id);
                            executeFast.step();
                            executeFast.dispose();
                            return;
                        } catch (Exception e13) {
                            e = e13;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            hsVar.o(e, true);
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
                    } catch (Exception e14) {
                        e = e14;
                        sQLitePreparedStatement = null;
                        sQLiteCursor4 = queryFinalized;
                    } catch (Throwable th17) {
                        th = th17;
                        sQLitePreparedStatement = null;
                        sQLiteCursor4 = queryFinalized;
                    }
                } catch (Exception e15) {
                    e = e15;
                    sQLitePreparedStatement = null;
                } catch (Throwable th18) {
                    th = th18;
                    sQLitePreparedStatement = null;
                }
                break;
        }
    }

    public /* synthetic */ wf(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
