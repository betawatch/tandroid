package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a01;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class em implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ em(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x001c, code lost:
    
        if (r7.length < 16) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z9;
        int length;
        SQLitePreparedStatement executeFast;
        yr yrVar = (yr) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.e;
        try {
            try {
                byte[] bArr = encryptedChat.key_hash;
                if (bArr != null) {
                    try {
                    } catch (Exception e10) {
                        e = e10;
                        z9 = true;
                        sQLitePreparedStatement = null;
                        try {
                            yrVar.o(e, z9);
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                }
                byte[] bArr2 = encryptedChat.auth_key;
                if (bArr2 != null) {
                    Typeface typeface = g0.a;
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                    encryptedChat.key_hash = bArr3;
                }
                SQLitePreparedStatement executeFast2 = yrVar.b.executeFast("REPLACE INTO enc_chats VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    try {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                        byte[] bArr4 = encryptedChat.a_or_b;
                        if (bArr4 != null) {
                            try {
                                length = bArr4.length;
                            } catch (Exception e11) {
                                e = e11;
                                z9 = true;
                                sQLitePreparedStatement = executeFast2;
                                yrVar.o(e, z9);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        } else {
                            length = 1;
                        }
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length);
                        byte[] bArr5 = encryptedChat.auth_key;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(bArr5 != null ? bArr5.length : 1);
                        byte[] bArr6 = encryptedChat.future_auth_key;
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(bArr6 != null ? bArr6.length : 1);
                        byte[] bArr7 = encryptedChat.key_hash;
                        NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(bArr7 != null ? bArr7.length : 1);
                        encryptedChat.serializeToStream(nativeByteBuffer);
                        executeFast2.bindInteger(1, encryptedChat.id);
                        executeFast2.bindLong(2, user.id);
                        executeFast2.bindString(3, yr.K(user));
                        executeFast2.bindByteBuffer(4, nativeByteBuffer);
                        byte[] bArr8 = encryptedChat.a_or_b;
                        if (bArr8 != null) {
                            nativeByteBuffer2.writeBytes(bArr8);
                        }
                        byte[] bArr9 = encryptedChat.auth_key;
                        if (bArr9 != null) {
                            nativeByteBuffer3.writeBytes(bArr9);
                        }
                        byte[] bArr10 = encryptedChat.future_auth_key;
                        if (bArr10 != null) {
                            nativeByteBuffer4.writeBytes(bArr10);
                        }
                        byte[] bArr11 = encryptedChat.key_hash;
                        if (bArr11 != null) {
                            nativeByteBuffer5.writeBytes(bArr11);
                        }
                        executeFast2.bindByteBuffer(5, nativeByteBuffer2);
                        executeFast2.bindByteBuffer(6, nativeByteBuffer3);
                        executeFast2.bindInteger(7, encryptedChat.ttl);
                        executeFast2.bindInteger(8, encryptedChat.layer);
                        executeFast2.bindInteger(9, encryptedChat.seq_in);
                        executeFast2.bindInteger(10, encryptedChat.seq_out);
                        executeFast2.bindInteger(11, encryptedChat.key_use_count_out | (encryptedChat.key_use_count_in << 16));
                        executeFast2.bindLong(12, encryptedChat.exchange_id);
                        executeFast2.bindInteger(13, encryptedChat.key_create_date);
                        executeFast2.bindLong(14, encryptedChat.future_key_fingerprint);
                        executeFast2.bindByteBuffer(15, nativeByteBuffer4);
                        executeFast2.bindByteBuffer(16, nativeByteBuffer5);
                        executeFast2.bindInteger(17, encryptedChat.in_seq_no);
                        executeFast2.bindLong(18, encryptedChat.admin_id);
                        executeFast2.bindInteger(19, encryptedChat.mtproto_seq);
                        executeFast2.step();
                        executeFast2.dispose();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        nativeByteBuffer3.reuse();
                        nativeByteBuffer4.reuse();
                        nativeByteBuffer5.reuse();
                        executeFast = yrVar.b.executeFast("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = executeFast2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement = executeFast2;
                }
            } catch (Exception e13) {
                e = e13;
                sQLitePreparedStatement = null;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
        try {
            executeFast.bindLong(1, tL_dialog.id);
            executeFast.bindInteger(2, tL_dialog.last_message_date);
            executeFast.bindInteger(3, tL_dialog.unread_count);
            executeFast.bindInteger(4, tL_dialog.top_message);
            executeFast.bindInteger(5, tL_dialog.read_inbox_max_id);
            executeFast.bindInteger(6, tL_dialog.read_outbox_max_id);
            executeFast.bindInteger(7, 0);
            executeFast.bindInteger(8, tL_dialog.unread_mentions_count);
            executeFast.bindInteger(9, tL_dialog.pts);
            executeFast.bindInteger(10, 0);
            executeFast.bindInteger(11, tL_dialog.pinnedNum);
            executeFast.bindInteger(12, tL_dialog.flags);
            executeFast.bindInteger(13, tL_dialog.folder_id);
            executeFast.bindNull(14);
            executeFast.bindInteger(15, tL_dialog.unread_reactions_count);
            executeFast.bindInteger(16, 0);
            executeFast.bindInteger(17, tL_dialog.ttl_period);
            executeFast.bindInteger(18, tL_dialog.unread_poll_votes_count);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e14) {
            e = e14;
            sQLitePreparedStatement = executeFast;
            z9 = true;
            yrVar.o(e, z9);
            if (sQLitePreparedStatement != null) {
            }
        } catch (Throwable th5) {
            th = th5;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
            }
            throw th;
        }
    }

    private final void b() {
        yr yrVar = (yr) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        yrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = yrVar.b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = yrVar.b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
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

    private final void c() {
        boolean z9;
        vv vvVar = (vv) this.b;
        tv tvVar = vvVar.n;
        TLObject tLObject = (TLObject) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        ArrayList arrayList2 = vvVar.c;
        ArrayList arrayList3 = vvVar.i;
        int i7 = vvVar.a;
        boolean z10 = vvVar.b;
        int i10 = 0;
        boolean z11 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            vvVar.e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            qp.s1(i7).Y3(tL_messages_savedDialogs.users, false);
            qp.s1(i7).S3(tL_messages_savedDialogs.chats, false);
            yr.a0(i7).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            yr.a0(i7).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i11 = 0;
            while (i11 < tL_messages_savedDialogs.dialogs.size()) {
                uv b10 = uv.b(i7, tL_messages_savedDialogs.dialogs.get(i11), tL_messages_savedDialogs.messages);
                int i12 = i10;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        z9 = z11;
                        break;
                    }
                    z9 = z11;
                    if (((uv) arrayList2.get(i12)).a == b10.a) {
                        b10.e = ((uv) arrayList2.get(i12)).e;
                        ((uv) arrayList2.get(i12)).b = b10.b;
                        break;
                    } else {
                        i12++;
                        z11 = z9;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList3.size()) {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            vvVar.h++;
                        }
                    } else if (((uv) arrayList3.get(i13)).a == b10.a) {
                        break;
                    } else {
                        i13++;
                    }
                }
                i11++;
                z11 = z9;
                i10 = 0;
            }
            vvVar.f = z11;
            vvVar.g = tL_messages_savedDialogs.dialogs.size();
            vvVar.m();
            g0.r(tvVar);
            g0.i3(tvVar, 450L);
            vvVar.b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            vvVar.e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            qp.s1(i7).Y3(tL_messages_savedDialogsSlice.users, false);
            qp.s1(i7).S3(tL_messages_savedDialogsSlice.chats, false);
            yr.a0(i7).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            yr.a0(i7).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i14 = 0; i14 < tL_messages_savedDialogsSlice.dialogs.size(); i14++) {
                uv b11 = uv.b(i7, tL_messages_savedDialogsSlice.dialogs.get(i14), tL_messages_savedDialogsSlice.messages);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        break;
                    }
                    if (((uv) arrayList2.get(i15)).a == b11.a) {
                        b11.e = ((uv) arrayList2.get(i15)).e;
                        ((uv) arrayList2.get(i15)).b = b11.b;
                        break;
                    }
                    i15++;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList3.size()) {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            vvVar.h++;
                        }
                    } else if (((uv) arrayList3.get(i16)).a == b11.a) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            vvVar.g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = vvVar.j;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                if (((uv) arrayList4.get(i18)).b) {
                    i17++;
                }
            }
            vvVar.f = arrayList3.size() + i17 >= vvVar.g || tL_messages_savedDialogsSlice.dialogs.size() == 0;
            vvVar.m();
            g0.r(tvVar);
            g0.i3(tvVar, 450L);
            vvVar.b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            vvVar.e = true;
            arrayList3.addAll(arrayList);
            vvVar.g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            vvVar.h = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((uv) arrayList.get(i19)).d()) {
                    vvVar.h++;
                }
            }
            boolean z12 = vvVar.f;
            boolean z13 = arrayList3.size() >= vvVar.g;
            vvVar.f = z13;
            vvVar.b = false;
            if (z13 && !z12) {
                vvVar.m();
            }
        } else if (tL_error != null) {
            vvVar.e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                vvVar.b = true;
            }
        }
        if (vvVar.b != z10) {
            qp.s1(i7).e7.edit().putBoolean("savedMessagesUnsupported", vvVar.b).apply();
        }
        vvVar.d = false;
    }

    private final void d() {
        gz gzVar = (gz) this.b;
        sy syVar = (sy) this.c;
        File file = (File) this.d;
        ij ijVar = (ij) this.e;
        TLRPC.Document F0 = syVar.m.F0();
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = gc.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    F0.thumbs.add(gc.Z(K, 90.0f, 90.0f, 55, syVar.d != null));
                    K.recycle();
                }
            } catch (Exception e10) {
                F0.thumbs.clear();
                a8.g(e10, true);
            }
        }
        g0.h3(new mn(gzVar, syVar, file, F0, ijVar, 16));
    }

    private final void f() {
        boolean z9;
        gz gzVar = (gz) this.b;
        TLObject tLObject = (TLObject) this.c;
        sy syVar = (sy) this.d;
        String str = (String) this.e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            ui mediaDataController = gzVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.I.k(tL_messages_stickerSet, stickerSet.id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.N.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) syVar.h;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = (ArrayList) gzVar.a.remove(str);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z9) {
            gzVar.getMessagesStorage().r1(((sy) arrayList.get(0)).m.k, null, null, false);
        }
        dw secretChatHelper = gzVar.getSecretChatHelper();
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) syVar.d;
        ij ijVar = syVar.m;
        secretChatHelper.j(decryptedMessage, ijVar.k, syVar.n, null, null, ijVar);
    }

    private final void g() {
        uy uyVar = (uy) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        xy xyVar = uyVar.b;
        gz gzVar = xyVar.q;
        boolean z9 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i7 = qs.v1;
        if (!z9) {
            gzVar.D.l(xyVar.j);
            gzVar.getNotificationCenter().k(i7, Long.valueOf(xyVar.j), tL_messages_initHistoryImport, tL_error);
            return;
        }
        xyVar.k = ((TLRPC.TL_messages_historyImport) tLObject).id;
        ArrayList arrayList = xyVar.f;
        HashSet hashSet = xyVar.c;
        hashSet.remove(xyVar.a);
        gzVar.getNotificationCenter().k(i7, Long.valueOf(xyVar.j));
        if (hashSet.isEmpty()) {
            xy.a(xyVar);
        }
        xyVar.n = SystemClock.elapsedRealtime();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            gzVar.getFileLoader().h0(false, 67108864, (String) arrayList.get(i10), true);
        }
    }

    private final void h() {
        az azVar = (az) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.e;
        bz bzVar = azVar.b;
        gz gzVar = bzVar.o;
        gzVar.F.remove(bzVar.e);
        int i7 = qs.w1;
        if (tL_error == null) {
            gzVar.getNotificationCenter().k(i7, bzVar.e);
        } else {
            gzVar.getNotificationCenter().k(i7, bzVar.e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = gzVar.getNotificationCenter().a;
            int i10 = qs.x1;
            if (sparseArray.indexOfKey(i10) >= 0) {
                gzVar.getNotificationCenter().k(i10, tLObject);
            } else {
                gzVar.getMediaDataController().f2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        f10 f10Var = (f10) this.b;
        ij ijVar = (ij) this.c;
        f3.s sVar = (f3.s) this.d;
        bi.ya yaVar = (bi.ya) this.e;
        ijVar.k.originalLanguage = "und";
        f10Var.getMessagesStorage().X1(sVar.a, ijVar.k);
        f10Var.K.remove(sVar);
        yaVar.a("und");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        qp qpVar;
        boolean z9;
        long j3;
        ij ijVar;
        TLRPC.Message message;
        ArrayList arrayList;
        TLRPC.User user;
        boolean z10;
        int i7;
        ArrayList arrayList2;
        int i10;
        a0.h hVar;
        qp qpVar2;
        ui uiVar;
        a0.h hVar2;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i11 = 4;
        switch (this.a) {
            case 0:
                qp qpVar3 = (qp) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                if (!updates_difference.new_messages.isEmpty() || !updates_difference.new_encrypted_messages.isEmpty()) {
                    a0.h hVar5 = new a0.h();
                    for (int i12 = 0; i12 < updates_difference.new_encrypted_messages.size(); i12++) {
                        ArrayList g10 = qpVar3.getSecretChatHelper().g(updates_difference.new_encrypted_messages.get(i12));
                        if (g10 != null && !g10.isEmpty()) {
                            updates_difference.new_messages.addAll(g10);
                        }
                    }
                    gc.X(updates_difference.new_messages);
                    ArrayList arrayList3 = new ArrayList();
                    long e10 = qpVar3.getUserConfig().e();
                    for (int i13 = 0; i13 < updates_difference.new_messages.size(); i13++) {
                        TLRPC.Message message2 = updates_difference.new_messages.get(i13);
                        if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                            ij.B0(message2);
                            if (m5.C(message2.dialog_id)) {
                                qpVar = qpVar3;
                            } else {
                                TLRPC.MessageAction messageAction = message2.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) hVar3.f(messageAction.user_id)) != null && user.bot) {
                                    message2.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                    message2.flags |= 64;
                                }
                                TLRPC.MessageAction messageAction2 = message2.action;
                                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                                    qpVar = qpVar3;
                                    z9 = false;
                                    message2.unread = false;
                                    message2.media_unread = false;
                                    j3 = message2.dialog_id;
                                    if (j3 == e10) {
                                        message2.unread = z9;
                                        message2.media_unread = z9;
                                        message2.out = true;
                                    }
                                    qp qpVar4 = qpVar;
                                    boolean contains = qpVar4.u0.contains(Long.valueOf(j3));
                                    qpVar3 = qpVar4;
                                    ijVar = new ij(qpVar3.currentAccount, message2, hVar3, hVar4, contains, contains);
                                    message = ijVar.k;
                                    if ((message.out || message.from_scheduled) && ijVar.G4()) {
                                        arrayList3.add(ijVar);
                                    }
                                    arrayList = (ArrayList) hVar5.f(message2.dialog_id);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        hVar5.k(arrayList, message2.dialog_id);
                                    }
                                    arrayList.add(ijVar);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = message2.out ? qpVar3.P : qpVar3.O;
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(message2.dialog_id));
                                    if (num == null) {
                                        qpVar = qpVar3;
                                        num = Integer.valueOf(qpVar3.getMessagesStorage().U(message2.dialog_id, message2.out));
                                        concurrentHashMap.put(Long.valueOf(message2.dialog_id), num);
                                    } else {
                                        qpVar = qpVar3;
                                    }
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                            z9 = false;
                            j3 = message2.dialog_id;
                            if (j3 == e10) {
                            }
                            qp qpVar42 = qpVar;
                            boolean contains2 = qpVar42.u0.contains(Long.valueOf(j3));
                            qpVar3 = qpVar42;
                            ijVar = new ij(qpVar3.currentAccount, message2, hVar3, hVar4, contains2, contains2);
                            message = ijVar.k;
                            if (message.out) {
                            }
                            arrayList3.add(ijVar);
                            arrayList = (ArrayList) hVar5.f(message2.dialog_id);
                            if (arrayList == null) {
                            }
                            arrayList.add(ijVar);
                        }
                    }
                    qpVar3.getMessagesStorage().a.c(new em(qpVar3, arrayList3, updates_difference, hVar5));
                    qpVar3.getSecretChatHelper().m();
                }
                if (!updates_difference.other_updates.isEmpty()) {
                    qpVar3.N3(updates_difference.other_updates, updates_difference.users, updates_difference.chats, true, 0);
                }
                if (updates_difference instanceof TLRPC.TL_updates_difference) {
                    qpVar3.f2 = false;
                    qpVar3.getMessagesStorage().K1(updates_difference.state.seq);
                    qpVar3.getMessagesStorage().H1(updates_difference.state.date);
                    qpVar3.getMessagesStorage().I1(updates_difference.state.pts);
                    qpVar3.getMessagesStorage().J1(updates_difference.state.qts);
                    a8.b("received difference: isUpdating = false");
                    qpVar3.getConnectionsManager().setIsUpdating(false);
                    for (int i14 = 0; i14 < 3; i14++) {
                        qpVar3.P3(i14, 1);
                    }
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                    qpVar3.getMessagesStorage().H1(updates_difference.intermediate_state.date);
                    qpVar3.getMessagesStorage().I1(updates_difference.intermediate_state.pts);
                    qpVar3.getMessagesStorage().J1(updates_difference.intermediate_state.qts);
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceEmpty) {
                    qpVar3.f2 = false;
                    qpVar3.getMessagesStorage().K1(updates_difference.seq);
                    qpVar3.getMessagesStorage().H1(updates_difference.date);
                    qpVar3.getConnectionsManager().setIsUpdating(false);
                    a8.b("received differenceEmpty: isUpdating = false");
                    for (int i15 = 0; i15 < 3; i15++) {
                        qpVar3.P3(i15, 1);
                    }
                }
                yr messagesStorage = qpVar3.getMessagesStorage();
                yr messagesStorage2 = qpVar3.getMessagesStorage();
                messagesStorage2.H();
                int i16 = messagesStorage2.w;
                yr messagesStorage3 = qpVar3.getMessagesStorage();
                messagesStorage3.H();
                int i17 = messagesStorage3.r;
                yr messagesStorage4 = qpVar3.getMessagesStorage();
                messagesStorage4.H();
                int i18 = messagesStorage4.n;
                yr messagesStorage5 = qpVar3.getMessagesStorage();
                messagesStorage5.H();
                messagesStorage.A1(i16, i17, i18, messagesStorage5.s);
                if (r2.a) {
                    StringBuilder sb2 = new StringBuilder("received difference with date = ");
                    yr messagesStorage6 = qpVar3.getMessagesStorage();
                    messagesStorage6.H();
                    sb2.append(messagesStorage6.n);
                    sb2.append(" pts = ");
                    yr messagesStorage7 = qpVar3.getMessagesStorage();
                    messagesStorage7.H();
                    sb2.append(messagesStorage7.r);
                    sb2.append(" seq = ");
                    yr messagesStorage8 = qpVar3.getMessagesStorage();
                    messagesStorage8.H();
                    sb2.append(messagesStorage8.w);
                    sb2.append(" messages = ");
                    sb2.append(updates_difference.new_messages.size());
                    sb2.append(" users = ");
                    sb2.append(updates_difference.users.size());
                    sb2.append(" chats = ");
                    sb2.append(updates_difference.chats.size());
                    sb2.append(" other updates = ");
                    sb2.append(updates_difference.other_updates.size());
                    a8.b(sb2.toString());
                    return;
                }
                return;
            case 1:
                qp qpVar5 = (qp) this.b;
                org.telegram.ui.Components.v4.c0(qpVar5.currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.TL_channels_createChannel) this.e, new Object[0]);
                qpVar5.getNotificationCenter().k(29, new Object[0]);
                return;
            case 2:
                qp qpVar6 = (qp) this.b;
                org.telegram.ui.Components.v4.c0(qpVar6.currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.TL_messages_createChat) this.e, new Object[0]);
                qpVar6.getNotificationCenter().k(29, new Object[0]);
                return;
            case 3:
                org.telegram.ui.Components.v4.c0(((qp) this.b).currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.TL_messages_editChatAdmin) this.e, Boolean.FALSE);
                return;
            case 4:
                gz gzVar = (gz) this.b;
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                sx sxVar = (sx) this.e;
                if (f2.b(gzVar.currentAccount).a(tL_messages_forwardMessages, arrayList4, sxVar)) {
                    sxVar.run();
                    return;
                }
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.jc[] jcVarArr = (org.telegram.ui.Components.jc[]) this.c;
                ui.a aVar = (ui.a) this.d;
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                if (zArr[0]) {
                    return;
                }
                ng ngVar = new ng(zArr, jcVarArr, aVar, 6);
                SharedPreferences e12 = qp.e1();
                if (e12.getBoolean("proxycheckstatusip", false)) {
                    ngVar.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                alertDialog$Builder.a.R = id.M0(2131746609, null);
                alertDialog$Builder.a.T = id.M0(2131746608, null);
                alertDialog$Builder.k(id.M0(2131746744, null), new o(1, e12, ngVar));
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                return;
            case 6:
                f8 f8Var = (f8) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                long[] jArr = (long[]) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                f8Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                f8Var.c();
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    try {
                        ((ij) arrayList5.get(i19)).K(false);
                    } finally {
                        try {
                            a8.g(th, true);
                            return;
                        } finally {
                        }
                    }
                }
                jArr[0] = System.currentTimeMillis() - currentTimeMillis;
                return;
            case 7:
                f8 f8Var2 = (f8) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                LongSparseArray longSparseArray = (LongSparseArray) this.d;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.e;
                f8Var2.getClass();
                try {
                    f8Var2.c();
                    e8 e8Var = new e8();
                    for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                        e8 e11 = f8Var2.e(((t2) arrayList6.get(i20)).a, e8Var);
                        if (e11 != null) {
                            long j10 = e11.a;
                            if (j10 != 0) {
                                ArrayList arrayList7 = (ArrayList) longSparseArray.get(j10);
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                    longSparseArray.put(e11.a, arrayList7);
                                }
                                ((t2) arrayList6.get(i20)).d = e11.c == 23;
                                arrayList7.add((t2) arrayList6.get(i20));
                            }
                        }
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 8:
                ((r8) this.b).s((String) this.c, (String) this.d, (di.i6) this.e, null, true, false);
                return;
            case 9:
                ((gc) this.b).S((String) this.c, (String) this.d, (hc) this.e);
                return;
            case 10:
                sd sdVar = (sd) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                sdVar.getMessagesController().Y3(arrayList8, true);
                sdVar.getMessagesController().S3(arrayList9, true);
                Utilities.d.c(new od(sdVar, arrayList10, 0));
                return;
            case 11:
                MediaController mediaController = (MediaController) this.b;
                String str = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                ij ijVar2 = (ij) this.e;
                ij ijVar3 = (ij) mediaController.c0.remove(str);
                if (ijVar3 == null) {
                    return;
                }
                int i21 = ijVar3.I1;
                if (bArr == null || ijVar3.F0() == null) {
                    return;
                }
                int i22 = 0;
                while (true) {
                    if (i22 < ijVar3.F0().attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = ijVar3.F0().attributes.get(i22);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            documentAttribute.waveform = bArr;
                            documentAttribute.flags = 4 | documentAttribute.flags;
                        } else {
                            i22++;
                        }
                    }
                }
                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                tL_messages_messages.messages.add(ijVar3.k);
                yr.a0(i21).h1(-1, 0, ijVar2.p1 ? 1 : 0, ij.B0(ijVar3.k), 0L, tL_messages_messages, false);
                qs.f(i21).k(49, Long.valueOf(ij.B0(ijVar3.k)), k5.k(ijVar3));
                return;
            case 12:
                try {
                    g0.h3(new em((MediaController) this.b, (String) this.d, MediaController.getWaveform((String) this.c), (ij) this.e, 11));
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 13:
                ui uiVar2 = (ui) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                ArrayList arrayList11 = uiVar2.E1;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                    arrayList11.clear();
                    arrayList11.addAll(tL_messages_reactions.reactions);
                    ui.S1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                    z10 = false;
                    uiVar2.getNotificationCenter().k(203, 0L);
                } else {
                    z10 = false;
                }
                uiVar2.H1 = z10;
                return;
            case 14:
                ui uiVar3 = (ui) this.b;
                String[] strArr = (String[]) this.c;
                ri riVar = (ri) this.d;
                ArrayList arrayList12 = (ArrayList) this.e;
                uiVar3.getClass();
                for (String str2 : strArr) {
                    if (uiVar3.z1.get(str2) != null) {
                        return;
                    }
                }
                riVar.e(null, arrayList12);
                return;
            case 15:
                ((ui) this.b).b1(5, true, false, false, new d3((boolean[]) this.c, (ArrayList[]) this.d, (mh) this.e, i11));
                return;
            case 16:
                String str3 = (String) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                a01 a01Var = (a01) this.e;
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                String lowerCase = str3.toLowerCase();
                for (int i23 = 0; i23 < arrayList13.size(); i23++) {
                    if (((TLRPC.TL_messages_stickerSet) arrayList13.get(i23)).keywords != null) {
                        ArrayList<TLRPC.TL_stickerKeyword> arrayList17 = ((TLRPC.TL_messages_stickerSet) arrayList13.get(i23)).keywords;
                        for (int i24 = 0; i24 < arrayList17.size(); i24++) {
                            for (int i25 = 0; i25 < arrayList17.get(i24).keyword.size(); i25++) {
                                String str4 = arrayList17.get(i24).keyword.get(i25);
                                if (lowerCase.equals(str4)) {
                                    arrayList15.add(Long.valueOf(arrayList17.get(i24).document_id));
                                } else if (lowerCase.contains(str4) || str4.contains(lowerCase)) {
                                    arrayList16.add(Long.valueOf(arrayList17.get(i24).document_id));
                                }
                            }
                        }
                    }
                }
                for (int i26 = 0; i26 < arrayList14.size(); i26++) {
                    if ((arrayList14.get(i26) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList14.get(i26)).keywords != null) {
                        ArrayList<TLRPC.TL_stickerKeyword> arrayList18 = ((TLRPC.TL_stickerSetFullCovered) arrayList14.get(i26)).keywords;
                        for (int i27 = 0; i27 < arrayList18.size(); i27++) {
                            for (int i28 = 0; i28 < arrayList18.get(i27).keyword.size(); i28++) {
                                String str5 = arrayList18.get(i27).keyword.get(i28);
                                if (lowerCase.equals(str5)) {
                                    arrayList15.add(Long.valueOf(arrayList18.get(i27).document_id));
                                } else if (lowerCase.contains(str5) || str5.contains(lowerCase)) {
                                    arrayList16.add(Long.valueOf(arrayList18.get(i27).document_id));
                                }
                            }
                        }
                    }
                }
                arrayList15.addAll(arrayList16);
                a01Var.a(arrayList15);
                return;
            case 17:
                qp qpVar7 = (qp) this.b;
                ArrayList arrayList19 = (ArrayList) this.e;
                TLRPC.updates_Difference updates_difference2 = (TLRPC.updates_Difference) this.c;
                a0.h hVar6 = (a0.h) this.d;
                if (!arrayList19.isEmpty()) {
                    g0.h3(new lg(qpVar7, arrayList19, updates_difference2, 13));
                }
                qpVar7.getMessagesStorage().j1(updates_difference2.new_messages, true, false, false, qpVar7.getDownloadController().l(), false, 0, 0L);
                for (int i29 = 0; i29 < hVar6.m(); i29++) {
                    long j11 = hVar6.j(i29);
                    ArrayList arrayList20 = (ArrayList) hVar6.n(i29);
                    qpVar7.getMediaDataController().X0(arrayList20, j11, 0, 0L, new fk(qpVar7, j11, arrayList20, 4), 0, null);
                }
                return;
            case 18:
                qp qpVar8 = (qp) this.b;
                TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) this.c;
                a0.h hVar7 = (a0.h) this.d;
                a0.h hVar8 = (a0.h) this.e;
                SparseBooleanArray sparseBooleanArray = qpVar8.c2;
                SparseBooleanArray sparseBooleanArray2 = qpVar8.b2;
                a0.h hVar9 = qpVar8.S;
                SparseArray sparseArray = qpVar8.U;
                a0.h hVar10 = qpVar8.R;
                a0.h hVar11 = qpVar8.Q;
                ArrayList arrayList21 = qpVar8.y;
                qpVar8.l2 = false;
                qpVar8.r(messages_dialogs.dialogs);
                ui mediaDataController = qpVar8.getMediaDataController();
                mediaDataController.E(false);
                mediaDataController.J0();
                qpVar8.Y3(messages_dialogs.users, false);
                qpVar8.S3(messages_dialogs.chats, false);
                int i30 = 0;
                while (i30 < arrayList21.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList21.get(i30);
                    qp qpVar9 = qpVar8;
                    if (m5.C(dialog.id)) {
                        uiVar = mediaDataController;
                    } else {
                        hVar11.l(dialog.id);
                        ArrayList arrayList22 = (ArrayList) hVar10.f(dialog.id);
                        uiVar = mediaDataController;
                        hVar10.l(dialog.id);
                        if (arrayList22 != null) {
                            int i31 = 0;
                            while (i31 < arrayList22.size()) {
                                ij ijVar4 = (ij) arrayList22.get(i31);
                                if (ijVar4 != null) {
                                    a0.h hVar12 = hVar9;
                                    if (ijVar4.k.peer_id.channel_id == 0) {
                                        sparseArray.remove(ijVar4.f1());
                                    }
                                    long j12 = ijVar4.k.random_id;
                                    if (j12 != 0) {
                                        hVar2 = hVar12;
                                        hVar2.l(j12);
                                    } else {
                                        hVar2 = hVar12;
                                    }
                                } else {
                                    hVar2 = hVar9;
                                }
                                i31++;
                                hVar9 = hVar2;
                            }
                        }
                    }
                    i30++;
                    hVar9 = hVar9;
                    mediaDataController = uiVar;
                    qpVar8 = qpVar9;
                }
                ui uiVar4 = mediaDataController;
                qp qpVar10 = qpVar8;
                a0.h hVar13 = hVar9;
                int i32 = 0;
                while (i32 < hVar7.m()) {
                    long j13 = hVar7.j(i32);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar7.n(i32);
                    TLRPC.DraftMessage draftMessage = dialog2.draft;
                    if (draftMessage instanceof TLRPC.TL_draftMessage) {
                        i7 = i32;
                        uiVar4.R1(dialog2.id, 0L, draftMessage, null, false);
                    } else {
                        i7 = i32;
                    }
                    hVar11.k(dialog2, j13);
                    ArrayList arrayList23 = (ArrayList) hVar8.f(dialog2.id);
                    hVar10.k(arrayList23, j13);
                    if (arrayList23 != null) {
                        int i33 = 0;
                        while (i33 < arrayList23.size()) {
                            ij ijVar5 = (ij) arrayList23.get(i33);
                            if (ijVar5 != null) {
                                arrayList2 = arrayList23;
                                i10 = i33;
                                if (ijVar5.k.peer_id.channel_id == 0) {
                                    sparseArray.put(ijVar5.f1(), ijVar5);
                                    qpVar2 = qpVar10;
                                    qpVar2.N = Math.min(qpVar2.N, ijVar5.k.date);
                                    hVar = hVar7;
                                    long j14 = ijVar5.k.random_id;
                                    if (j14 != 0) {
                                        hVar13.k(ijVar5, j14);
                                    }
                                    i33 = i10 + 1;
                                    qpVar10 = qpVar2;
                                    hVar7 = hVar;
                                    arrayList23 = arrayList2;
                                }
                            } else {
                                arrayList2 = arrayList23;
                                i10 = i33;
                            }
                            hVar = hVar7;
                            qpVar2 = qpVar10;
                            i33 = i10 + 1;
                            qpVar10 = qpVar2;
                            hVar7 = hVar;
                            arrayList23 = arrayList2;
                        }
                    }
                    qp qpVar11 = qpVar10;
                    qpVar11.s7.d(j13);
                    qpVar10 = qpVar11;
                    i32 = i7 + 1;
                    hVar7 = hVar7;
                }
                qp qpVar12 = qpVar10;
                arrayList21.clear();
                int m10 = hVar11.m();
                for (int i34 = 0; i34 < m10; i34++) {
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar11.n(i34);
                    if (qpVar12.D0.h(dialog3.id) < 0) {
                        arrayList21.add(dialog3);
                    }
                }
                qpVar12.T4(null);
                sparseBooleanArray2.put(0, true);
                sparseBooleanArray.put(0, false);
                sparseBooleanArray2.put(1, true);
                sparseBooleanArray.put(1, false);
                int n10 = qpVar12.getUserConfig().n(0);
                long[] g11 = qpVar12.getUserConfig().g(0);
                if (n10 < 400) {
                    long j15 = g11[0];
                    if (j15 != -1 && j15 != 2147483647L) {
                        qpVar12.U2(0, 0, 100, false, null);
                    }
                }
                qpVar12.getNotificationCenter().k(3, new Object[0]);
                return;
            case 19:
                yr yrVar = (yr) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                SparseIntArray sparseIntArray = (SparseIntArray) this.e;
                yrVar.getClass();
                try {
                    if (!yr.t0(longSparseIntArray)) {
                        SQLitePreparedStatement executeFast = yrVar.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                        for (int i35 = 0; i35 < longSparseIntArray.size(); i35++) {
                            try {
                                long keyAt = longSparseIntArray.keyAt(i35);
                                int i36 = longSparseIntArray.get(keyAt);
                                SQLiteDatabase sQLiteDatabase = yrVar.b;
                                Locale locale = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt + " AND mid > 0 AND mid <= " + i36 + " AND read_state IN(0,2) AND out = 0").stepThis().dispose();
                                executeFast.requery();
                                executeFast.bindLong(1, keyAt);
                                executeFast.bindInteger(2, i36);
                                executeFast.step();
                            } catch (Exception e14) {
                                e = e14;
                                sQLitePreparedStatement = executeFast;
                                try {
                                    yrVar.o(e, true);
                                    if (sQLitePreparedStatement == null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = executeFast;
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast.dispose();
                    }
                    if (!yr.t0(longSparseIntArray2)) {
                        for (int i37 = 0; i37 < longSparseIntArray2.size(); i37++) {
                            long keyAt2 = longSparseIntArray2.keyAt(i37);
                            int i38 = longSparseIntArray2.get(keyAt2);
                            SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt2 + " AND mid > 0 AND mid <= " + i38 + " AND read_state IN(0,2) AND out = 1").stepThis().dispose();
                        }
                    }
                    if (sparseIntArray != null) {
                        if (sparseIntArray.size() == 0) {
                            return;
                        }
                        for (int i39 = 0; i39 < sparseIntArray.size(); i39++) {
                            long F = m5.F(sparseIntArray.keyAt(i39));
                            int valueAt = sparseIntArray.valueAt(i39);
                            SQLitePreparedStatement executeFast2 = yrVar.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 1");
                            try {
                                executeFast2.requery();
                                executeFast2.bindLong(1, F);
                                executeFast2.bindInteger(2, valueAt);
                                executeFast2.step();
                                executeFast2.dispose();
                            } catch (Exception e15) {
                                e = e15;
                                sQLitePreparedStatement = executeFast2;
                                yrVar.o(e, true);
                                if (sQLitePreparedStatement == null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement = executeFast2;
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e16) {
                    e = e16;
                    sQLitePreparedStatement = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                }
            case 20:
                a();
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                f();
                return;
            case 24:
                d();
                return;
            case 25:
                g();
                return;
            case 26:
                h();
                return;
            case 27:
                i();
                return;
            default:
                f10 f10Var = (f10) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                String str6 = (String) this.d;
                d10 d10Var = (d10) this.e;
                storyItem.detectedLng = str6;
                f10Var.getMessagesController().P1().k.h(storyItem.dialogId, storyItem);
                f10Var.I.remove(d10Var);
                return;
        }
    }

    public /* synthetic */ em(qp qpVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.a = 17;
        this.b = qpVar;
        this.e = arrayList;
        this.c = updates_difference;
        this.d = hVar;
    }
}
