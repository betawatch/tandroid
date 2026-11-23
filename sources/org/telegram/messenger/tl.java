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
import org.telegram.ui.b01;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class tl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tl(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
        boolean z10;
        int length;
        SQLitePreparedStatement executeFast;
        tr trVar = (tr) this.b;
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
                        z10 = true;
                        sQLitePreparedStatement = null;
                        try {
                            trVar.o(e, z10);
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
                SQLitePreparedStatement executeFast2 = trVar.b.executeFast("REPLACE INTO enc_chats VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    try {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                        byte[] bArr4 = encryptedChat.a_or_b;
                        if (bArr4 != null) {
                            try {
                                length = bArr4.length;
                            } catch (Exception e11) {
                                e = e11;
                                z10 = true;
                                sQLitePreparedStatement = executeFast2;
                                trVar.o(e, z10);
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
                        executeFast2.bindString(3, tr.K(user));
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
                        executeFast = trVar.b.executeFast("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
            z10 = true;
            trVar.o(e, z10);
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
        tr trVar = (tr) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        trVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = trVar.b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = trVar.b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                trVar.o(e10, true);
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
        boolean z10;
        pv pvVar = (pv) this.b;
        nv nvVar = pvVar.n;
        TLObject tLObject = (TLObject) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        ArrayList arrayList2 = pvVar.c;
        ArrayList arrayList3 = pvVar.i;
        int i7 = pvVar.a;
        boolean z11 = pvVar.b;
        int i10 = 0;
        boolean z12 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            pvVar.e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            mp.u1(i7).f4(tL_messages_savedDialogs.users, false);
            mp.u1(i7).Z3(tL_messages_savedDialogs.chats, false);
            tr.a0(i7).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            tr.a0(i7).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i11 = 0;
            while (i11 < tL_messages_savedDialogs.dialogs.size()) {
                ov b10 = ov.b(i7, tL_messages_savedDialogs.dialogs.get(i11), tL_messages_savedDialogs.messages);
                int i12 = i10;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        z10 = z12;
                        break;
                    }
                    z10 = z12;
                    if (((ov) arrayList2.get(i12)).a == b10.a) {
                        b10.e = ((ov) arrayList2.get(i12)).e;
                        ((ov) arrayList2.get(i12)).b = b10.b;
                        break;
                    } else {
                        i12++;
                        z12 = z10;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList3.size()) {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            pvVar.h++;
                        }
                    } else if (((ov) arrayList3.get(i13)).a == b10.a) {
                        break;
                    } else {
                        i13++;
                    }
                }
                i11++;
                z12 = z10;
                i10 = 0;
            }
            pvVar.f = z12;
            pvVar.g = tL_messages_savedDialogs.dialogs.size();
            pvVar.m();
            g0.r(nvVar);
            g0.h3(nvVar, 450L);
            pvVar.b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            pvVar.e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            mp.u1(i7).f4(tL_messages_savedDialogsSlice.users, false);
            mp.u1(i7).Z3(tL_messages_savedDialogsSlice.chats, false);
            tr.a0(i7).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            tr.a0(i7).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i14 = 0; i14 < tL_messages_savedDialogsSlice.dialogs.size(); i14++) {
                ov b11 = ov.b(i7, tL_messages_savedDialogsSlice.dialogs.get(i14), tL_messages_savedDialogsSlice.messages);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        break;
                    }
                    if (((ov) arrayList2.get(i15)).a == b11.a) {
                        b11.e = ((ov) arrayList2.get(i15)).e;
                        ((ov) arrayList2.get(i15)).b = b11.b;
                        break;
                    }
                    i15++;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList3.size()) {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            pvVar.h++;
                        }
                    } else if (((ov) arrayList3.get(i16)).a == b11.a) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            pvVar.g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = pvVar.j;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                if (((ov) arrayList4.get(i18)).b) {
                    i17++;
                }
            }
            pvVar.f = arrayList3.size() + i17 >= pvVar.g || tL_messages_savedDialogsSlice.dialogs.size() == 0;
            pvVar.m();
            g0.r(nvVar);
            g0.h3(nvVar, 450L);
            pvVar.b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            pvVar.e = true;
            arrayList3.addAll(arrayList);
            pvVar.g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            pvVar.h = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((ov) arrayList.get(i19)).d()) {
                    pvVar.h++;
                }
            }
            boolean z13 = pvVar.f;
            boolean z14 = arrayList3.size() >= pvVar.g;
            pvVar.f = z14;
            pvVar.b = false;
            if (z14 && !z13) {
                pvVar.m();
            }
        } else if (tL_error != null) {
            pvVar.e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                pvVar.b = true;
            }
        }
        if (pvVar.b != z11) {
            mp.u1(i7).h7.edit().putBoolean("savedMessagesUnsupported", pvVar.b).apply();
        }
        pvVar.d = false;
    }

    private final void d() {
        zy zyVar = (zy) this.b;
        ly lyVar = (ly) this.c;
        File file = (File) this.d;
        fj fjVar = (fj) this.e;
        TLRPC.Document F0 = lyVar.m.F0();
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = ec.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    F0.thumbs.add(ec.Z(K, 90.0f, 90.0f, 55, lyVar.d != null));
                    K.recycle();
                }
            } catch (Exception e10) {
                F0.thumbs.clear();
                a8.g(e10, true);
            }
        }
        g0.g3(new fn(zyVar, lyVar, file, F0, fjVar, 16));
    }

    private final void f() {
        boolean z10;
        zy zyVar = (zy) this.b;
        TLObject tLObject = (TLObject) this.c;
        ly lyVar = (ly) this.d;
        String str = (String) this.e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            ri mediaDataController = zyVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.J.k(tL_messages_stickerSet, stickerSet.id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.O.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) lyVar.h;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) zyVar.a.remove(str);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z10) {
            zyVar.getMessagesStorage().r1(((ly) arrayList.get(0)).m.k, null, null, false);
        }
        xv secretChatHelper = zyVar.getSecretChatHelper();
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) lyVar.d;
        fj fjVar = lyVar.m;
        secretChatHelper.j(decryptedMessage, fjVar.k, lyVar.n, null, null, fjVar);
    }

    private final void g() {
        ny nyVar = (ny) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        qy qyVar = nyVar.b;
        zy zyVar = qyVar.q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i7 = ks.v1;
        if (!z10) {
            zyVar.E.l(qyVar.j);
            zyVar.getNotificationCenter().k(i7, Long.valueOf(qyVar.j), tL_messages_initHistoryImport, tL_error);
            return;
        }
        qyVar.k = ((TLRPC.TL_messages_historyImport) tLObject).id;
        ArrayList arrayList = qyVar.f;
        HashSet hashSet = qyVar.c;
        hashSet.remove(qyVar.a);
        zyVar.getNotificationCenter().k(i7, Long.valueOf(qyVar.j));
        if (hashSet.isEmpty()) {
            qy.a(qyVar);
        }
        qyVar.n = SystemClock.elapsedRealtime();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zyVar.getFileLoader().h0(false, 67108864, (String) arrayList.get(i10), true);
        }
    }

    private final void h() {
        ty tyVar = (ty) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.e;
        uy uyVar = tyVar.b;
        zy zyVar = uyVar.o;
        zyVar.G.remove(uyVar.e);
        int i7 = ks.w1;
        if (tL_error == null) {
            zyVar.getNotificationCenter().k(i7, uyVar.e);
        } else {
            zyVar.getNotificationCenter().k(i7, uyVar.e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = zyVar.getNotificationCenter().a;
            int i10 = ks.x1;
            if (sparseArray.indexOfKey(i10) >= 0) {
                zyVar.getNotificationCenter().k(i10, tLObject);
            } else {
                zyVar.getMediaDataController().k2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        y00 y00Var = (y00) this.b;
        fj fjVar = (fj) this.c;
        f3.s sVar = (f3.s) this.d;
        di.p9 p9Var = (di.p9) this.e;
        fjVar.k.originalLanguage = "und";
        y00Var.getMessagesStorage().X1(sVar.a, fjVar.k);
        y00Var.L.remove(sVar);
        p9Var.a("und");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        mp mpVar;
        boolean z10;
        long j3;
        fj fjVar;
        TLRPC.Message message;
        ArrayList arrayList;
        TLRPC.User user;
        boolean z11;
        ArrayList arrayList2;
        int i7;
        a0.h hVar;
        mp mpVar2;
        ri riVar;
        a0.h hVar2;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i10 = 4;
        switch (this.a) {
            case 0:
                mp mpVar3 = (mp) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                if (!updates_difference.new_messages.isEmpty() || !updates_difference.new_encrypted_messages.isEmpty()) {
                    a0.h hVar5 = new a0.h();
                    for (int i11 = 0; i11 < updates_difference.new_encrypted_messages.size(); i11++) {
                        ArrayList g10 = mpVar3.getSecretChatHelper().g(updates_difference.new_encrypted_messages.get(i11));
                        if (g10 != null && !g10.isEmpty()) {
                            updates_difference.new_messages.addAll(g10);
                        }
                    }
                    ec.X(updates_difference.new_messages);
                    ArrayList arrayList3 = new ArrayList();
                    long e10 = mpVar3.getUserConfig().e();
                    for (int i12 = 0; i12 < updates_difference.new_messages.size(); i12++) {
                        TLRPC.Message message2 = updates_difference.new_messages.get(i12);
                        if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                            fj.B0(message2);
                            if (n5.C(message2.dialog_id)) {
                                mpVar = mpVar3;
                            } else {
                                TLRPC.MessageAction messageAction = message2.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) hVar3.f(messageAction.user_id)) != null && user.bot) {
                                    message2.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                    message2.flags |= 64;
                                }
                                TLRPC.MessageAction messageAction2 = message2.action;
                                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                                    mpVar = mpVar3;
                                    z10 = false;
                                    message2.unread = false;
                                    message2.media_unread = false;
                                    j3 = message2.dialog_id;
                                    if (j3 == e10) {
                                        message2.unread = z10;
                                        message2.media_unread = z10;
                                        message2.out = true;
                                    }
                                    mp mpVar4 = mpVar;
                                    boolean contains = mpVar4.v0.contains(Long.valueOf(j3));
                                    mpVar3 = mpVar4;
                                    fjVar = new fj(mpVar3.currentAccount, message2, hVar3, hVar4, contains, contains);
                                    message = fjVar.k;
                                    if ((message.out || message.from_scheduled) && fjVar.F4()) {
                                        arrayList3.add(fjVar);
                                    }
                                    arrayList = (ArrayList) hVar5.f(message2.dialog_id);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        hVar5.k(arrayList, message2.dialog_id);
                                    }
                                    arrayList.add(fjVar);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = message2.out ? mpVar3.Q : mpVar3.P;
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(message2.dialog_id));
                                    if (num == null) {
                                        mpVar = mpVar3;
                                        num = Integer.valueOf(mpVar3.getMessagesStorage().U(message2.dialog_id, message2.out));
                                        concurrentHashMap.put(Long.valueOf(message2.dialog_id), num);
                                    } else {
                                        mpVar = mpVar3;
                                    }
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                            z10 = false;
                            j3 = message2.dialog_id;
                            if (j3 == e10) {
                            }
                            mp mpVar42 = mpVar;
                            boolean contains2 = mpVar42.v0.contains(Long.valueOf(j3));
                            mpVar3 = mpVar42;
                            fjVar = new fj(mpVar3.currentAccount, message2, hVar3, hVar4, contains2, contains2);
                            message = fjVar.k;
                            if (message.out) {
                            }
                            arrayList3.add(fjVar);
                            arrayList = (ArrayList) hVar5.f(message2.dialog_id);
                            if (arrayList == null) {
                            }
                            arrayList.add(fjVar);
                        }
                    }
                    mpVar3.getMessagesStorage().a.c(new tl(mpVar3, arrayList3, updates_difference, hVar5));
                    mpVar3.getSecretChatHelper().m();
                }
                if (!updates_difference.other_updates.isEmpty()) {
                    mpVar3.U3(updates_difference.other_updates, updates_difference.users, updates_difference.chats, true, 0);
                }
                if (updates_difference instanceof TLRPC.TL_updates_difference) {
                    mpVar3.i2 = false;
                    mpVar3.getMessagesStorage().K1(updates_difference.state.seq);
                    mpVar3.getMessagesStorage().H1(updates_difference.state.date);
                    mpVar3.getMessagesStorage().I1(updates_difference.state.pts);
                    mpVar3.getMessagesStorage().J1(updates_difference.state.qts);
                    a8.b("received difference: isUpdating = false");
                    mpVar3.getConnectionsManager().setIsUpdating(false);
                    for (int i13 = 0; i13 < 3; i13++) {
                        mpVar3.W3(i13, 1);
                    }
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                    mpVar3.getMessagesStorage().H1(updates_difference.intermediate_state.date);
                    mpVar3.getMessagesStorage().I1(updates_difference.intermediate_state.pts);
                    mpVar3.getMessagesStorage().J1(updates_difference.intermediate_state.qts);
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceEmpty) {
                    mpVar3.i2 = false;
                    mpVar3.getMessagesStorage().K1(updates_difference.seq);
                    mpVar3.getMessagesStorage().H1(updates_difference.date);
                    mpVar3.getConnectionsManager().setIsUpdating(false);
                    a8.b("received differenceEmpty: isUpdating = false");
                    for (int i14 = 0; i14 < 3; i14++) {
                        mpVar3.W3(i14, 1);
                    }
                }
                tr messagesStorage = mpVar3.getMessagesStorage();
                tr messagesStorage2 = mpVar3.getMessagesStorage();
                messagesStorage2.H();
                int i15 = messagesStorage2.w;
                tr messagesStorage3 = mpVar3.getMessagesStorage();
                messagesStorage3.H();
                int i16 = messagesStorage3.r;
                tr messagesStorage4 = mpVar3.getMessagesStorage();
                messagesStorage4.H();
                int i17 = messagesStorage4.n;
                tr messagesStorage5 = mpVar3.getMessagesStorage();
                messagesStorage5.H();
                messagesStorage.A1(i15, i16, i17, messagesStorage5.s);
                if (s2.a) {
                    StringBuilder sb2 = new StringBuilder("received difference with date = ");
                    tr messagesStorage6 = mpVar3.getMessagesStorage();
                    messagesStorage6.H();
                    sb2.append(messagesStorage6.n);
                    sb2.append(" pts = ");
                    tr messagesStorage7 = mpVar3.getMessagesStorage();
                    messagesStorage7.H();
                    sb2.append(messagesStorage7.r);
                    sb2.append(" seq = ");
                    tr messagesStorage8 = mpVar3.getMessagesStorage();
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
                mp mpVar5 = (mp) this.b;
                org.telegram.ui.Components.b5.c0(mpVar5.currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.TL_channels_createChannel) this.e, new Object[0]);
                mpVar5.getNotificationCenter().k(29, new Object[0]);
                return;
            case 2:
                mp mpVar6 = (mp) this.b;
                org.telegram.ui.Components.b5.c0(mpVar6.currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.TL_messages_createChat) this.e, new Object[0]);
                mpVar6.getNotificationCenter().k(29, new Object[0]);
                return;
            case 3:
                org.telegram.ui.Components.b5.c0(((mp) this.b).currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.TL_messages_editChatAdmin) this.e, Boolean.FALSE);
                return;
            case 4:
                zy zyVar = (zy) this.b;
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                lx lxVar = (lx) this.e;
                if (f2.b(zyVar.currentAccount).a(tL_messages_forwardMessages, arrayList4, lxVar)) {
                    lxVar.run();
                    return;
                }
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.mc[] mcVarArr = (org.telegram.ui.Components.mc[]) this.c;
                xi.a aVar = (xi.a) this.d;
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                if (zArr[0]) {
                    return;
                }
                yf yfVar = new yf(zArr, mcVarArr, aVar, 6);
                SharedPreferences g12 = mp.g1();
                if (g12.getBoolean("proxycheckstatusip", false)) {
                    yfVar.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                alertDialog$Builder.a.S = gd.N0(2131746412, null);
                alertDialog$Builder.a.U = gd.N0(2131746411, null);
                alertDialog$Builder.k(gd.N0(2131746549, null), new o(1, g12, yfVar));
                i5.c.y(null, 2131752577, alertDialog$Builder, null);
                return;
            case 6:
                e8 e8Var = (e8) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                long[] jArr = (long[]) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                e8Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                e8Var.c();
                for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                    try {
                        ((fj) arrayList5.get(i18)).K(false);
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
                e8 e8Var2 = (e8) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                LongSparseArray longSparseArray = (LongSparseArray) this.d;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.e;
                e8Var2.getClass();
                try {
                    e8Var2.c();
                    d8 d8Var = new d8();
                    for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                        d8 e11 = e8Var2.e(((u2) arrayList6.get(i19)).a, d8Var);
                        if (e11 != null) {
                            long j10 = e11.a;
                            if (j10 != 0) {
                                ArrayList arrayList7 = (ArrayList) longSparseArray.get(j10);
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                    longSparseArray.put(e11.a, arrayList7);
                                }
                                ((u2) arrayList6.get(i19)).d = e11.c == 23;
                                arrayList7.add((u2) arrayList6.get(i19));
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
                ((q8) this.b).s((String) this.c, (String) this.d, (fi.z5) this.e, null, true, false);
                return;
            case 9:
                ((ec) this.b).S((String) this.c, (String) this.d, (fc) this.e);
                return;
            case 10:
                qd qdVar = (qd) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                qdVar.getMessagesController().f4(arrayList8, true);
                qdVar.getMessagesController().Z3(arrayList9, true);
                Utilities.d.c(new md(qdVar, arrayList10, 0));
                return;
            case 11:
                try {
                    g0.g3(new tl((MediaController) this.b, (String) this.d, MediaController.getWaveform((String) this.c), (fj) this.e, 12));
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 12:
                MediaController mediaController = (MediaController) this.b;
                String str = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                fj fjVar2 = (fj) this.e;
                fj fjVar3 = (fj) mediaController.d0.remove(str);
                if (fjVar3 == null) {
                    return;
                }
                int i20 = fjVar3.K1;
                if (bArr == null || fjVar3.F0() == null) {
                    return;
                }
                int i21 = 0;
                while (true) {
                    if (i21 < fjVar3.F0().attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = fjVar3.F0().attributes.get(i21);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            documentAttribute.waveform = bArr;
                            documentAttribute.flags = 4 | documentAttribute.flags;
                        } else {
                            i21++;
                        }
                    }
                }
                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                tL_messages_messages.messages.add(fjVar3.k);
                tr.a0(i20).h1(-1, 0, fjVar2.r1 ? 1 : 0, fj.B0(fjVar3.k), 0L, tL_messages_messages, false);
                ks.f(i20).k(49, Long.valueOf(fj.B0(fjVar3.k)), f3.i(fjVar3));
                return;
            case 13:
                ri riVar2 = (ri) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                ArrayList arrayList11 = riVar2.H1;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                    arrayList11.clear();
                    arrayList11.addAll(tL_messages_reactions.reactions);
                    ri.X1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                    z11 = false;
                    riVar2.getNotificationCenter().k(ks.j3, 0L);
                } else {
                    z11 = false;
                }
                riVar2.K1 = z11;
                return;
            case 14:
                ((ri) this.b).e1(5, true, false, false, new e3((boolean[]) this.c, (ArrayList[]) this.d, (kh) this.e, i10));
                return;
            case 15:
                ri riVar3 = (ri) this.b;
                String[] strArr = (String[]) this.c;
                oi oiVar = (oi) this.d;
                ArrayList arrayList12 = (ArrayList) this.e;
                riVar3.getClass();
                for (String str2 : strArr) {
                    if (riVar3.C1.get(str2) != null) {
                        return;
                    }
                }
                oiVar.c(null, arrayList12);
                return;
            case 16:
                String str3 = (String) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                b01 b01Var = (b01) this.e;
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                String lowerCase = str3.toLowerCase();
                for (int i22 = 0; i22 < arrayList13.size(); i22++) {
                    if (((TLRPC.TL_messages_stickerSet) arrayList13.get(i22)).keywords != null) {
                        ArrayList<TLRPC.TL_stickerKeyword> arrayList17 = ((TLRPC.TL_messages_stickerSet) arrayList13.get(i22)).keywords;
                        for (int i23 = 0; i23 < arrayList17.size(); i23++) {
                            for (int i24 = 0; i24 < arrayList17.get(i23).keyword.size(); i24++) {
                                String str4 = arrayList17.get(i23).keyword.get(i24);
                                if (lowerCase.equals(str4)) {
                                    arrayList15.add(Long.valueOf(arrayList17.get(i23).document_id));
                                } else if (lowerCase.contains(str4) || str4.contains(lowerCase)) {
                                    arrayList16.add(Long.valueOf(arrayList17.get(i23).document_id));
                                }
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < arrayList14.size(); i25++) {
                    if ((arrayList14.get(i25) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList14.get(i25)).keywords != null) {
                        ArrayList<TLRPC.TL_stickerKeyword> arrayList18 = ((TLRPC.TL_stickerSetFullCovered) arrayList14.get(i25)).keywords;
                        for (int i26 = 0; i26 < arrayList18.size(); i26++) {
                            for (int i27 = 0; i27 < arrayList18.get(i26).keyword.size(); i27++) {
                                String str5 = arrayList18.get(i26).keyword.get(i27);
                                if (lowerCase.equals(str5)) {
                                    arrayList15.add(Long.valueOf(arrayList18.get(i26).document_id));
                                } else if (lowerCase.contains(str5) || str5.contains(lowerCase)) {
                                    arrayList16.add(Long.valueOf(arrayList18.get(i26).document_id));
                                }
                            }
                        }
                    }
                }
                arrayList15.addAll(arrayList16);
                b01Var.a(arrayList15);
                return;
            case 17:
                mp mpVar7 = (mp) this.b;
                ArrayList arrayList19 = (ArrayList) this.e;
                TLRPC.updates_Difference updates_difference2 = (TLRPC.updates_Difference) this.c;
                a0.h hVar6 = (a0.h) this.d;
                if (!arrayList19.isEmpty()) {
                    g0.g3(new kg(mpVar7, arrayList19, updates_difference2, 13));
                }
                mpVar7.getMessagesStorage().j1(updates_difference2.new_messages, true, false, false, mpVar7.getDownloadController().l(), false, 0, 0L);
                for (int i28 = 0; i28 < hVar6.m(); i28++) {
                    long j11 = hVar6.j(i28);
                    ArrayList arrayList20 = (ArrayList) hVar6.n(i28);
                    mpVar7.getMediaDataController().a1(arrayList20, j11, 0, 0L, new ck(mpVar7, j11, arrayList20, 4), 0, null);
                }
                return;
            case 18:
                mp mpVar8 = (mp) this.b;
                TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) this.c;
                a0.h hVar7 = (a0.h) this.d;
                a0.h hVar8 = (a0.h) this.e;
                SparseBooleanArray sparseBooleanArray = mpVar8.f2;
                SparseBooleanArray sparseBooleanArray2 = mpVar8.e2;
                a0.h hVar9 = mpVar8.T;
                SparseArray sparseArray = mpVar8.V;
                a0.h hVar10 = mpVar8.S;
                a0.h hVar11 = mpVar8.R;
                ArrayList arrayList21 = mpVar8.y;
                mpVar8.o2 = false;
                mpVar8.r(messages_dialogs.dialogs);
                ri mediaDataController = mpVar8.getMediaDataController();
                mediaDataController.G(false);
                mediaDataController.M0();
                mpVar8.f4(messages_dialogs.users, false);
                mpVar8.Z3(messages_dialogs.chats, false);
                int i29 = 0;
                while (i29 < arrayList21.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList21.get(i29);
                    mp mpVar9 = mpVar8;
                    if (n5.C(dialog.id)) {
                        riVar = mediaDataController;
                    } else {
                        hVar11.l(dialog.id);
                        ArrayList arrayList22 = (ArrayList) hVar10.f(dialog.id);
                        riVar = mediaDataController;
                        hVar10.l(dialog.id);
                        if (arrayList22 != null) {
                            int i30 = 0;
                            while (i30 < arrayList22.size()) {
                                fj fjVar4 = (fj) arrayList22.get(i30);
                                if (fjVar4 != null) {
                                    a0.h hVar12 = hVar9;
                                    if (fjVar4.k.peer_id.channel_id == 0) {
                                        sparseArray.remove(fjVar4.e1());
                                    }
                                    long j12 = fjVar4.k.random_id;
                                    if (j12 != 0) {
                                        hVar2 = hVar12;
                                        hVar2.l(j12);
                                    } else {
                                        hVar2 = hVar12;
                                    }
                                } else {
                                    hVar2 = hVar9;
                                }
                                i30++;
                                hVar9 = hVar2;
                            }
                        }
                    }
                    i29++;
                    hVar9 = hVar9;
                    mediaDataController = riVar;
                    mpVar8 = mpVar9;
                }
                ri riVar4 = mediaDataController;
                mp mpVar10 = mpVar8;
                a0.h hVar13 = hVar9;
                int i31 = 0;
                while (i31 < hVar7.m()) {
                    long j13 = hVar7.j(i31);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar7.n(i31);
                    int i32 = i31;
                    riVar4.D1(dialog2.id, 0L, dialog2.draft);
                    TLRPC.DraftMessage draftMessage = dialog2.draft;
                    if (draftMessage instanceof TLRPC.TL_draftMessage) {
                        riVar4.W1(dialog2.id, 0L, draftMessage, null, false);
                    }
                    hVar11.k(dialog2, j13);
                    ArrayList arrayList23 = (ArrayList) hVar8.f(dialog2.id);
                    hVar10.k(arrayList23, j13);
                    if (arrayList23 != null) {
                        int i33 = 0;
                        while (i33 < arrayList23.size()) {
                            fj fjVar5 = (fj) arrayList23.get(i33);
                            if (fjVar5 != null) {
                                arrayList2 = arrayList23;
                                i7 = i33;
                                if (fjVar5.k.peer_id.channel_id == 0) {
                                    sparseArray.put(fjVar5.e1(), fjVar5);
                                    mpVar2 = mpVar10;
                                    mpVar2.O = Math.min(mpVar2.O, fjVar5.k.date);
                                    hVar = hVar7;
                                    long j14 = fjVar5.k.random_id;
                                    if (j14 != 0) {
                                        hVar13.k(fjVar5, j14);
                                    }
                                    i33 = i7 + 1;
                                    mpVar10 = mpVar2;
                                    hVar7 = hVar;
                                    arrayList23 = arrayList2;
                                }
                            } else {
                                arrayList2 = arrayList23;
                                i7 = i33;
                            }
                            hVar = hVar7;
                            mpVar2 = mpVar10;
                            i33 = i7 + 1;
                            mpVar10 = mpVar2;
                            hVar7 = hVar;
                            arrayList23 = arrayList2;
                        }
                    }
                    mp mpVar11 = mpVar10;
                    mpVar11.v7.d(j13);
                    mpVar10 = mpVar11;
                    i31 = i32 + 1;
                    hVar7 = hVar7;
                }
                mp mpVar12 = mpVar10;
                arrayList21.clear();
                int m10 = hVar11.m();
                for (int i34 = 0; i34 < m10; i34++) {
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar11.n(i34);
                    if (mpVar12.E0.h(dialog3.id) < 0) {
                        arrayList21.add(dialog3);
                    }
                }
                mpVar12.f5(null);
                sparseBooleanArray2.put(0, true);
                sparseBooleanArray.put(0, false);
                sparseBooleanArray2.put(1, true);
                sparseBooleanArray.put(1, false);
                int n10 = mpVar12.getUserConfig().n(0);
                long[] g11 = mpVar12.getUserConfig().g(0);
                if (n10 < 400) {
                    long j15 = g11[0];
                    if (j15 != -1 && j15 != 2147483647L) {
                        mpVar12.a3(0, 0, 100, false, null);
                    }
                }
                mpVar12.getNotificationCenter().k(3, new Object[0]);
                return;
            case 19:
                tr trVar = (tr) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                SparseIntArray sparseIntArray = (SparseIntArray) this.e;
                trVar.getClass();
                try {
                    if (!tr.t0(longSparseIntArray)) {
                        SQLitePreparedStatement executeFast = trVar.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                        for (int i35 = 0; i35 < longSparseIntArray.size(); i35++) {
                            try {
                                long keyAt = longSparseIntArray.keyAt(i35);
                                int i36 = longSparseIntArray.get(keyAt);
                                SQLiteDatabase sQLiteDatabase = trVar.b;
                                Locale locale = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt + " AND mid > 0 AND mid <= " + i36 + " AND read_state IN(0,2) AND out = 0").stepThis().dispose();
                                executeFast.requery();
                                executeFast.bindLong(1, keyAt);
                                executeFast.bindInteger(2, i36);
                                executeFast.step();
                            } catch (Exception e13) {
                                e = e13;
                                sQLitePreparedStatement = executeFast;
                                try {
                                    trVar.o(e, true);
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
                    if (!tr.t0(longSparseIntArray2)) {
                        for (int i37 = 0; i37 < longSparseIntArray2.size(); i37++) {
                            long keyAt2 = longSparseIntArray2.keyAt(i37);
                            int i38 = longSparseIntArray2.get(keyAt2);
                            SQLiteDatabase sQLiteDatabase2 = trVar.b;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt2 + " AND mid > 0 AND mid <= " + i38 + " AND read_state IN(0,2) AND out = 1").stepThis().dispose();
                        }
                    }
                    if (sparseIntArray != null) {
                        if (sparseIntArray.size() == 0) {
                            return;
                        }
                        for (int i39 = 0; i39 < sparseIntArray.size(); i39++) {
                            long F = n5.F(sparseIntArray.keyAt(i39));
                            int valueAt = sparseIntArray.valueAt(i39);
                            SQLitePreparedStatement executeFast2 = trVar.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 1");
                            try {
                                executeFast2.requery();
                                executeFast2.bindLong(1, F);
                                executeFast2.bindInteger(2, valueAt);
                                executeFast2.step();
                                executeFast2.dispose();
                            } catch (Exception e14) {
                                e = e14;
                                sQLitePreparedStatement = executeFast2;
                                trVar.o(e, true);
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
                } catch (Exception e15) {
                    e = e15;
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
                y00 y00Var = (y00) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                String str6 = (String) this.d;
                w00 w00Var = (w00) this.e;
                storyItem.detectedLng = str6;
                y00Var.getMessagesController().R1().k.h(storyItem.dialogId, storyItem);
                y00Var.J.remove(w00Var);
                return;
        }
    }

    public /* synthetic */ tl(mp mpVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.a = 17;
        this.b = mpVar;
        this.e = arrayList;
        this.c = updates_difference;
        this.d = hVar;
    }
}
