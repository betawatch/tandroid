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
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class bm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bm(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
        vr vrVar = (vr) this.b;
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
                            vrVar.o(e, z10);
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
                SQLitePreparedStatement executeFast2 = vrVar.b.executeFast("REPLACE INTO enc_chats VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
                                vrVar.o(e, z10);
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
                        executeFast2.bindString(3, vr.K(user));
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
                        executeFast = vrVar.b.executeFast("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
            vrVar.o(e, z10);
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
        vr vrVar = (vr) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        vrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = vrVar.b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = vrVar.b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                vrVar.o(e10, true);
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
        tv tvVar = (tv) this.b;
        rv rvVar = tvVar.n;
        TLObject tLObject = (TLObject) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        ArrayList arrayList2 = tvVar.c;
        ArrayList arrayList3 = tvVar.i;
        int i7 = tvVar.a;
        boolean z11 = tvVar.b;
        int i10 = 0;
        boolean z12 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            tvVar.e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            np.s1(i7).Y3(tL_messages_savedDialogs.users, false);
            np.s1(i7).S3(tL_messages_savedDialogs.chats, false);
            vr.a0(i7).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            vr.a0(i7).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i11 = 0;
            while (i11 < tL_messages_savedDialogs.dialogs.size()) {
                sv b10 = sv.b(i7, tL_messages_savedDialogs.dialogs.get(i11), tL_messages_savedDialogs.messages);
                int i12 = i10;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        z10 = z12;
                        break;
                    }
                    z10 = z12;
                    if (((sv) arrayList2.get(i12)).a == b10.a) {
                        b10.e = ((sv) arrayList2.get(i12)).e;
                        ((sv) arrayList2.get(i12)).b = b10.b;
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
                            tvVar.h++;
                        }
                    } else if (((sv) arrayList3.get(i13)).a == b10.a) {
                        break;
                    } else {
                        i13++;
                    }
                }
                i11++;
                z12 = z10;
                i10 = 0;
            }
            tvVar.f = z12;
            tvVar.g = tL_messages_savedDialogs.dialogs.size();
            tvVar.m();
            g0.r(rvVar);
            g0.i3(rvVar, 450L);
            tvVar.b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            tvVar.e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            np.s1(i7).Y3(tL_messages_savedDialogsSlice.users, false);
            np.s1(i7).S3(tL_messages_savedDialogsSlice.chats, false);
            vr.a0(i7).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            vr.a0(i7).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i14 = 0; i14 < tL_messages_savedDialogsSlice.dialogs.size(); i14++) {
                sv b11 = sv.b(i7, tL_messages_savedDialogsSlice.dialogs.get(i14), tL_messages_savedDialogsSlice.messages);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        break;
                    }
                    if (((sv) arrayList2.get(i15)).a == b11.a) {
                        b11.e = ((sv) arrayList2.get(i15)).e;
                        ((sv) arrayList2.get(i15)).b = b11.b;
                        break;
                    }
                    i15++;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList3.size()) {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            tvVar.h++;
                        }
                    } else if (((sv) arrayList3.get(i16)).a == b11.a) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            tvVar.g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = tvVar.j;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                if (((sv) arrayList4.get(i18)).b) {
                    i17++;
                }
            }
            tvVar.f = arrayList3.size() + i17 >= tvVar.g || tL_messages_savedDialogsSlice.dialogs.size() == 0;
            tvVar.m();
            g0.r(rvVar);
            g0.i3(rvVar, 450L);
            tvVar.b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            tvVar.e = true;
            arrayList3.addAll(arrayList);
            tvVar.g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            tvVar.h = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((sv) arrayList.get(i19)).d()) {
                    tvVar.h++;
                }
            }
            boolean z13 = tvVar.f;
            boolean z14 = arrayList3.size() >= tvVar.g;
            tvVar.f = z14;
            tvVar.b = false;
            if (z14 && !z13) {
                tvVar.m();
            }
        } else if (tL_error != null) {
            tvVar.e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                tvVar.b = true;
            }
        }
        if (tvVar.b != z11) {
            np.s1(i7).f7.edit().putBoolean("savedMessagesUnsupported", tvVar.b).apply();
        }
        tvVar.d = false;
    }

    private final void d() {
        ez ezVar = (ez) this.b;
        qy qyVar = (qy) this.c;
        File file = (File) this.d;
        gj gjVar = (gj) this.e;
        TLRPC.Document F0 = qyVar.m.F0();
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = fc.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    F0.thumbs.add(fc.Z(K, 90.0f, 90.0f, 55, qyVar.d != null));
                    K.recycle();
                }
            } catch (Exception e10) {
                F0.thumbs.clear();
                a8.g(e10, true);
            }
        }
        g0.h3(new jn(ezVar, qyVar, file, F0, gjVar, 16));
    }

    private final void f() {
        boolean z10;
        ez ezVar = (ez) this.b;
        TLObject tLObject = (TLObject) this.c;
        qy qyVar = (qy) this.d;
        String str = (String) this.e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            si mediaDataController = ezVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.J.k(tL_messages_stickerSet, stickerSet.id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.O.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) qyVar.h;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) ezVar.a.remove(str);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z10) {
            ezVar.getMessagesStorage().r1(((qy) arrayList.get(0)).m.k, null, null, false);
        }
        bw secretChatHelper = ezVar.getSecretChatHelper();
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) qyVar.d;
        gj gjVar = qyVar.m;
        secretChatHelper.j(decryptedMessage, gjVar.k, qyVar.n, null, null, gjVar);
    }

    private final void g() {
        sy syVar = (sy) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        vy vyVar = syVar.b;
        ez ezVar = vyVar.q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i7 = ns.v1;
        if (!z10) {
            ezVar.E.l(vyVar.j);
            ezVar.getNotificationCenter().k(i7, Long.valueOf(vyVar.j), tL_messages_initHistoryImport, tL_error);
            return;
        }
        vyVar.k = ((TLRPC.TL_messages_historyImport) tLObject).id;
        ArrayList arrayList = vyVar.f;
        HashSet hashSet = vyVar.c;
        hashSet.remove(vyVar.a);
        ezVar.getNotificationCenter().k(i7, Long.valueOf(vyVar.j));
        if (hashSet.isEmpty()) {
            vy.a(vyVar);
        }
        vyVar.n = SystemClock.elapsedRealtime();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ezVar.getFileLoader().h0(false, 67108864, (String) arrayList.get(i10), true);
        }
    }

    private final void h() {
        yy yyVar = (yy) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.e;
        zy zyVar = yyVar.b;
        ez ezVar = zyVar.o;
        ezVar.G.remove(zyVar.e);
        int i7 = ns.w1;
        if (tL_error == null) {
            ezVar.getNotificationCenter().k(i7, zyVar.e);
        } else {
            ezVar.getNotificationCenter().k(i7, zyVar.e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = ezVar.getNotificationCenter().a;
            int i10 = ns.x1;
            if (sparseArray.indexOfKey(i10) >= 0) {
                ezVar.getNotificationCenter().k(i10, tLObject);
            } else {
                ezVar.getMediaDataController().f2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        c10 c10Var = (c10) this.b;
        gj gjVar = (gj) this.c;
        f3.s sVar = (f3.s) this.d;
        di.l9 l9Var = (di.l9) this.e;
        gjVar.k.originalLanguage = "und";
        c10Var.getMessagesStorage().X1(sVar.a, gjVar.k);
        c10Var.L.remove(sVar);
        l9Var.a("und");
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
        np npVar;
        boolean z10;
        long j3;
        gj gjVar;
        TLRPC.Message message;
        ArrayList arrayList;
        TLRPC.User user;
        boolean z11;
        int i7;
        ArrayList arrayList2;
        int i10;
        a0.h hVar;
        np npVar2;
        si siVar;
        a0.h hVar2;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i11 = 4;
        switch (this.a) {
            case 0:
                np npVar3 = (np) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                if (!updates_difference.new_messages.isEmpty() || !updates_difference.new_encrypted_messages.isEmpty()) {
                    a0.h hVar5 = new a0.h();
                    for (int i12 = 0; i12 < updates_difference.new_encrypted_messages.size(); i12++) {
                        ArrayList g10 = npVar3.getSecretChatHelper().g(updates_difference.new_encrypted_messages.get(i12));
                        if (g10 != null && !g10.isEmpty()) {
                            updates_difference.new_messages.addAll(g10);
                        }
                    }
                    fc.X(updates_difference.new_messages);
                    ArrayList arrayList3 = new ArrayList();
                    long e10 = npVar3.getUserConfig().e();
                    for (int i13 = 0; i13 < updates_difference.new_messages.size(); i13++) {
                        TLRPC.Message message2 = updates_difference.new_messages.get(i13);
                        if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                            gj.B0(message2);
                            if (m5.C(message2.dialog_id)) {
                                npVar = npVar3;
                            } else {
                                TLRPC.MessageAction messageAction = message2.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) hVar3.f(messageAction.user_id)) != null && user.bot) {
                                    message2.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                    message2.flags |= 64;
                                }
                                TLRPC.MessageAction messageAction2 = message2.action;
                                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                                    npVar = npVar3;
                                    z10 = false;
                                    message2.unread = false;
                                    message2.media_unread = false;
                                    j3 = message2.dialog_id;
                                    if (j3 == e10) {
                                        message2.unread = z10;
                                        message2.media_unread = z10;
                                        message2.out = true;
                                    }
                                    np npVar4 = npVar;
                                    boolean contains = npVar4.v0.contains(Long.valueOf(j3));
                                    npVar3 = npVar4;
                                    gjVar = new gj(npVar3.currentAccount, message2, hVar3, hVar4, contains, contains);
                                    message = gjVar.k;
                                    if ((message.out || message.from_scheduled) && gjVar.F4()) {
                                        arrayList3.add(gjVar);
                                    }
                                    arrayList = (ArrayList) hVar5.f(message2.dialog_id);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        hVar5.k(arrayList, message2.dialog_id);
                                    }
                                    arrayList.add(gjVar);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = message2.out ? npVar3.Q : npVar3.P;
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(message2.dialog_id));
                                    if (num == null) {
                                        npVar = npVar3;
                                        num = Integer.valueOf(npVar3.getMessagesStorage().U(message2.dialog_id, message2.out));
                                        concurrentHashMap.put(Long.valueOf(message2.dialog_id), num);
                                    } else {
                                        npVar = npVar3;
                                    }
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                            z10 = false;
                            j3 = message2.dialog_id;
                            if (j3 == e10) {
                            }
                            np npVar42 = npVar;
                            boolean contains2 = npVar42.v0.contains(Long.valueOf(j3));
                            npVar3 = npVar42;
                            gjVar = new gj(npVar3.currentAccount, message2, hVar3, hVar4, contains2, contains2);
                            message = gjVar.k;
                            if (message.out) {
                            }
                            arrayList3.add(gjVar);
                            arrayList = (ArrayList) hVar5.f(message2.dialog_id);
                            if (arrayList == null) {
                            }
                            arrayList.add(gjVar);
                        }
                    }
                    npVar3.getMessagesStorage().a.c(new bm(npVar3, arrayList3, updates_difference, hVar5));
                    npVar3.getSecretChatHelper().m();
                }
                if (!updates_difference.other_updates.isEmpty()) {
                    npVar3.N3(updates_difference.other_updates, updates_difference.users, updates_difference.chats, true, 0);
                }
                if (updates_difference instanceof TLRPC.TL_updates_difference) {
                    npVar3.g2 = false;
                    npVar3.getMessagesStorage().K1(updates_difference.state.seq);
                    npVar3.getMessagesStorage().H1(updates_difference.state.date);
                    npVar3.getMessagesStorage().I1(updates_difference.state.pts);
                    npVar3.getMessagesStorage().J1(updates_difference.state.qts);
                    a8.b("received difference: isUpdating = false");
                    npVar3.getConnectionsManager().setIsUpdating(false);
                    for (int i14 = 0; i14 < 3; i14++) {
                        npVar3.P3(i14, 1);
                    }
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                    npVar3.getMessagesStorage().H1(updates_difference.intermediate_state.date);
                    npVar3.getMessagesStorage().I1(updates_difference.intermediate_state.pts);
                    npVar3.getMessagesStorage().J1(updates_difference.intermediate_state.qts);
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceEmpty) {
                    npVar3.g2 = false;
                    npVar3.getMessagesStorage().K1(updates_difference.seq);
                    npVar3.getMessagesStorage().H1(updates_difference.date);
                    npVar3.getConnectionsManager().setIsUpdating(false);
                    a8.b("received differenceEmpty: isUpdating = false");
                    for (int i15 = 0; i15 < 3; i15++) {
                        npVar3.P3(i15, 1);
                    }
                }
                vr messagesStorage = npVar3.getMessagesStorage();
                vr messagesStorage2 = npVar3.getMessagesStorage();
                messagesStorage2.H();
                int i16 = messagesStorage2.w;
                vr messagesStorage3 = npVar3.getMessagesStorage();
                messagesStorage3.H();
                int i17 = messagesStorage3.r;
                vr messagesStorage4 = npVar3.getMessagesStorage();
                messagesStorage4.H();
                int i18 = messagesStorage4.n;
                vr messagesStorage5 = npVar3.getMessagesStorage();
                messagesStorage5.H();
                messagesStorage.A1(i16, i17, i18, messagesStorage5.s);
                if (r2.a) {
                    StringBuilder sb2 = new StringBuilder("received difference with date = ");
                    vr messagesStorage6 = npVar3.getMessagesStorage();
                    messagesStorage6.H();
                    sb2.append(messagesStorage6.n);
                    sb2.append(" pts = ");
                    vr messagesStorage7 = npVar3.getMessagesStorage();
                    messagesStorage7.H();
                    sb2.append(messagesStorage7.r);
                    sb2.append(" seq = ");
                    vr messagesStorage8 = npVar3.getMessagesStorage();
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
                np npVar5 = (np) this.b;
                org.telegram.ui.Components.t4.c0(npVar5.currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.TL_channels_createChannel) this.e, new Object[0]);
                npVar5.getNotificationCenter().k(29, new Object[0]);
                return;
            case 2:
                np npVar6 = (np) this.b;
                org.telegram.ui.Components.t4.c0(npVar6.currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.TL_messages_createChat) this.e, new Object[0]);
                npVar6.getNotificationCenter().k(29, new Object[0]);
                return;
            case 3:
                org.telegram.ui.Components.t4.c0(((np) this.b).currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.TL_messages_editChatAdmin) this.e, Boolean.FALSE);
                return;
            case 4:
                ez ezVar = (ez) this.b;
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                qx qxVar = (qx) this.e;
                if (f2.b(ezVar.currentAccount).a(tL_messages_forwardMessages, arrayList4, qxVar)) {
                    qxVar.run();
                    return;
                }
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) this.c;
                xi.a aVar = (xi.a) this.d;
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                if (zArr[0]) {
                    return;
                }
                mg mgVar = new mg(zArr, ecVarArr, aVar, 6);
                SharedPreferences e12 = np.e1();
                if (e12.getBoolean("proxycheckstatusip", false)) {
                    mgVar.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                alertDialog$Builder.a.S = hd.M0(2131746608, null);
                alertDialog$Builder.a.U = hd.M0(2131746607, null);
                alertDialog$Builder.k(hd.M0(2131746743, null), new o(1, e12, mgVar));
                i5.c.x(null, 2131752589, alertDialog$Builder, null);
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
                        ((gj) arrayList5.get(i19)).K(false);
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
                ((r8) this.b).s((String) this.c, (String) this.d, (fi.b6) this.e, null, true, false);
                return;
            case 9:
                ((fc) this.b).S((String) this.c, (String) this.d, (gc) this.e);
                return;
            case 10:
                rd rdVar = (rd) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                rdVar.getMessagesController().Y3(arrayList8, true);
                rdVar.getMessagesController().S3(arrayList9, true);
                Utilities.d.c(new nd(rdVar, arrayList10, 0));
                return;
            case 11:
                try {
                    g0.h3(new bm((MediaController) this.b, (String) this.d, MediaController.getWaveform((String) this.c), (gj) this.e, 12));
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 12:
                MediaController mediaController = (MediaController) this.b;
                String str = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                gj gjVar2 = (gj) this.e;
                gj gjVar3 = (gj) mediaController.d0.remove(str);
                if (gjVar3 == null) {
                    return;
                }
                int i21 = gjVar3.K1;
                if (bArr == null || gjVar3.F0() == null) {
                    return;
                }
                int i22 = 0;
                while (true) {
                    if (i22 < gjVar3.F0().attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = gjVar3.F0().attributes.get(i22);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            documentAttribute.waveform = bArr;
                            documentAttribute.flags = 4 | documentAttribute.flags;
                        } else {
                            i22++;
                        }
                    }
                }
                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                tL_messages_messages.messages.add(gjVar3.k);
                vr.a0(i21).h1(-1, 0, gjVar2.r1 ? 1 : 0, gj.B0(gjVar3.k), 0L, tL_messages_messages, false);
                ns.f(i21).k(49, Long.valueOf(gj.B0(gjVar3.k)), k5.j(gjVar3));
                return;
            case 13:
                si siVar2 = (si) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                ArrayList arrayList11 = siVar2.F1;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                    arrayList11.clear();
                    arrayList11.addAll(tL_messages_reactions.reactions);
                    si.S1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                    z11 = false;
                    siVar2.getNotificationCenter().k(203, 0L);
                } else {
                    z11 = false;
                }
                siVar2.I1 = z11;
                return;
            case 14:
                si siVar3 = (si) this.b;
                String[] strArr = (String[]) this.c;
                pi piVar = (pi) this.d;
                ArrayList arrayList12 = (ArrayList) this.e;
                siVar3.getClass();
                for (String str2 : strArr) {
                    if (siVar3.A1.get(str2) != null) {
                        return;
                    }
                }
                piVar.c(null, arrayList12);
                return;
            case 15:
                ((si) this.b).b1(5, true, false, false, new d3((boolean[]) this.c, (ArrayList[]) this.d, (kh) this.e, i11));
                return;
            case 16:
                String str3 = (String) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                yz0 yz0Var = (yz0) this.e;
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
                yz0Var.a(arrayList15);
                return;
            case 17:
                np npVar7 = (np) this.b;
                ArrayList arrayList19 = (ArrayList) this.e;
                TLRPC.updates_Difference updates_difference2 = (TLRPC.updates_Difference) this.c;
                a0.h hVar6 = (a0.h) this.d;
                if (!arrayList19.isEmpty()) {
                    g0.h3(new kg(npVar7, arrayList19, updates_difference2, 13));
                }
                npVar7.getMessagesStorage().j1(updates_difference2.new_messages, true, false, false, npVar7.getDownloadController().l(), false, 0, 0L);
                for (int i29 = 0; i29 < hVar6.m(); i29++) {
                    long j11 = hVar6.j(i29);
                    ArrayList arrayList20 = (ArrayList) hVar6.n(i29);
                    npVar7.getMediaDataController().X0(arrayList20, j11, 0, 0L, new dk(npVar7, j11, arrayList20, 4), 0, null);
                }
                return;
            case 18:
                np npVar8 = (np) this.b;
                TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) this.c;
                a0.h hVar7 = (a0.h) this.d;
                a0.h hVar8 = (a0.h) this.e;
                SparseBooleanArray sparseBooleanArray = npVar8.d2;
                SparseBooleanArray sparseBooleanArray2 = npVar8.c2;
                a0.h hVar9 = npVar8.T;
                SparseArray sparseArray = npVar8.V;
                a0.h hVar10 = npVar8.S;
                a0.h hVar11 = npVar8.R;
                ArrayList arrayList21 = npVar8.y;
                npVar8.m2 = false;
                npVar8.r(messages_dialogs.dialogs);
                si mediaDataController = npVar8.getMediaDataController();
                mediaDataController.E(false);
                mediaDataController.J0();
                npVar8.Y3(messages_dialogs.users, false);
                npVar8.S3(messages_dialogs.chats, false);
                int i30 = 0;
                while (i30 < arrayList21.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList21.get(i30);
                    np npVar9 = npVar8;
                    if (m5.C(dialog.id)) {
                        siVar = mediaDataController;
                    } else {
                        hVar11.l(dialog.id);
                        ArrayList arrayList22 = (ArrayList) hVar10.f(dialog.id);
                        siVar = mediaDataController;
                        hVar10.l(dialog.id);
                        if (arrayList22 != null) {
                            int i31 = 0;
                            while (i31 < arrayList22.size()) {
                                gj gjVar4 = (gj) arrayList22.get(i31);
                                if (gjVar4 != null) {
                                    a0.h hVar12 = hVar9;
                                    if (gjVar4.k.peer_id.channel_id == 0) {
                                        sparseArray.remove(gjVar4.e1());
                                    }
                                    long j12 = gjVar4.k.random_id;
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
                    mediaDataController = siVar;
                    npVar8 = npVar9;
                }
                si siVar4 = mediaDataController;
                np npVar10 = npVar8;
                a0.h hVar13 = hVar9;
                int i32 = 0;
                while (i32 < hVar7.m()) {
                    long j13 = hVar7.j(i32);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar7.n(i32);
                    TLRPC.DraftMessage draftMessage = dialog2.draft;
                    if (draftMessage instanceof TLRPC.TL_draftMessage) {
                        i7 = i32;
                        siVar4.R1(dialog2.id, 0L, draftMessage, null, false);
                    } else {
                        i7 = i32;
                    }
                    hVar11.k(dialog2, j13);
                    ArrayList arrayList23 = (ArrayList) hVar8.f(dialog2.id);
                    hVar10.k(arrayList23, j13);
                    if (arrayList23 != null) {
                        int i33 = 0;
                        while (i33 < arrayList23.size()) {
                            gj gjVar5 = (gj) arrayList23.get(i33);
                            if (gjVar5 != null) {
                                arrayList2 = arrayList23;
                                i10 = i33;
                                if (gjVar5.k.peer_id.channel_id == 0) {
                                    sparseArray.put(gjVar5.e1(), gjVar5);
                                    npVar2 = npVar10;
                                    npVar2.O = Math.min(npVar2.O, gjVar5.k.date);
                                    hVar = hVar7;
                                    long j14 = gjVar5.k.random_id;
                                    if (j14 != 0) {
                                        hVar13.k(gjVar5, j14);
                                    }
                                    i33 = i10 + 1;
                                    npVar10 = npVar2;
                                    hVar7 = hVar;
                                    arrayList23 = arrayList2;
                                }
                            } else {
                                arrayList2 = arrayList23;
                                i10 = i33;
                            }
                            hVar = hVar7;
                            npVar2 = npVar10;
                            i33 = i10 + 1;
                            npVar10 = npVar2;
                            hVar7 = hVar;
                            arrayList23 = arrayList2;
                        }
                    }
                    np npVar11 = npVar10;
                    npVar11.t7.d(j13);
                    npVar10 = npVar11;
                    i32 = i7 + 1;
                    hVar7 = hVar7;
                }
                np npVar12 = npVar10;
                arrayList21.clear();
                int m10 = hVar11.m();
                for (int i34 = 0; i34 < m10; i34++) {
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar11.n(i34);
                    if (npVar12.E0.h(dialog3.id) < 0) {
                        arrayList21.add(dialog3);
                    }
                }
                npVar12.U4(null);
                sparseBooleanArray2.put(0, true);
                sparseBooleanArray.put(0, false);
                sparseBooleanArray2.put(1, true);
                sparseBooleanArray.put(1, false);
                int n10 = npVar12.getUserConfig().n(0);
                long[] g11 = npVar12.getUserConfig().g(0);
                if (n10 < 400) {
                    long j15 = g11[0];
                    if (j15 != -1 && j15 != 2147483647L) {
                        npVar12.U2(0, 0, 100, false, null);
                    }
                }
                npVar12.getNotificationCenter().k(3, new Object[0]);
                return;
            case 19:
                vr vrVar = (vr) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                SparseIntArray sparseIntArray = (SparseIntArray) this.e;
                vrVar.getClass();
                try {
                    if (!vr.t0(longSparseIntArray)) {
                        SQLitePreparedStatement executeFast = vrVar.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                        for (int i35 = 0; i35 < longSparseIntArray.size(); i35++) {
                            try {
                                long keyAt = longSparseIntArray.keyAt(i35);
                                int i36 = longSparseIntArray.get(keyAt);
                                SQLiteDatabase sQLiteDatabase = vrVar.b;
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
                                    vrVar.o(e, true);
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
                    if (!vr.t0(longSparseIntArray2)) {
                        for (int i37 = 0; i37 < longSparseIntArray2.size(); i37++) {
                            long keyAt2 = longSparseIntArray2.keyAt(i37);
                            int i38 = longSparseIntArray2.get(keyAt2);
                            SQLiteDatabase sQLiteDatabase2 = vrVar.b;
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
                            SQLitePreparedStatement executeFast2 = vrVar.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 1");
                            try {
                                executeFast2.requery();
                                executeFast2.bindLong(1, F);
                                executeFast2.bindInteger(2, valueAt);
                                executeFast2.step();
                                executeFast2.dispose();
                            } catch (Exception e15) {
                                e = e15;
                                sQLitePreparedStatement = executeFast2;
                                vrVar.o(e, true);
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
                c10 c10Var = (c10) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                String str6 = (String) this.d;
                a10 a10Var = (a10) this.e;
                storyItem.detectedLng = str6;
                c10Var.getMessagesController().P1().k.h(storyItem.dialogId, storyItem);
                c10Var.J.remove(a10Var);
                return;
        }
    }

    public /* synthetic */ bm(np npVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.a = 17;
        this.b = npVar;
        this.e = arrayList;
        this.c = updates_difference;
        this.d = hVar;
    }
}
