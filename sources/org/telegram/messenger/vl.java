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
import org.telegram.ui.q11;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class vl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vl(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
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
        is isVar = (is) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.e;
        try {
            try {
                byte[] bArr = encryptedChat.key_hash;
                if (bArr != null) {
                    try {
                    } catch (Exception e) {
                        e = e;
                        z10 = true;
                        sQLitePreparedStatement = null;
                        try {
                            isVar.o(e, z10);
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
                    Typeface typeface = i0.a;
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                    encryptedChat.key_hash = bArr3;
                }
                SQLitePreparedStatement executeFast2 = isVar.b.executeFast("REPLACE INTO enc_chats VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    try {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                        byte[] bArr4 = encryptedChat.a_or_b;
                        if (bArr4 != null) {
                            try {
                                length = bArr4.length;
                            } catch (Exception e7) {
                                e = e7;
                                z10 = true;
                                sQLitePreparedStatement = executeFast2;
                                isVar.o(e, z10);
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
                        executeFast2.bindString(3, is.K(user));
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
                        executeFast = isVar.b.executeFast("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = executeFast2;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLitePreparedStatement = executeFast2;
                }
            } catch (Exception e11) {
                e = e11;
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
        } catch (Exception e12) {
            e = e12;
            sQLitePreparedStatement = executeFast;
            z10 = true;
            isVar.o(e, z10);
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
        is isVar = (is) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        isVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = isVar.b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = isVar.b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                isVar.o(e, true);
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
        hw hwVar = (hw) this.b;
        fw fwVar = hwVar.n;
        TLObject tLObject = (TLObject) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        ArrayList arrayList2 = hwVar.c;
        ArrayList arrayList3 = hwVar.i;
        int i10 = hwVar.a;
        boolean z11 = hwVar.b;
        int i11 = 0;
        boolean z12 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            hwVar.e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            wp.r1(i10).V3(tL_messages_savedDialogs.users, false);
            wp.r1(i10).P3(tL_messages_savedDialogs.chats, false);
            is.a0(i10).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            is.a0(i10).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i12 = 0;
            while (i12 < tL_messages_savedDialogs.dialogs.size()) {
                gw b10 = gw.b(i10, tL_messages_savedDialogs.dialogs.get(i12), tL_messages_savedDialogs.messages);
                int i13 = i11;
                while (true) {
                    if (i13 >= arrayList2.size()) {
                        z10 = z12;
                        break;
                    }
                    z10 = z12;
                    if (((gw) arrayList2.get(i13)).a == b10.a) {
                        b10.e = ((gw) arrayList2.get(i13)).e;
                        ((gw) arrayList2.get(i13)).b = b10.b;
                        break;
                    } else {
                        i13++;
                        z12 = z10;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList3.size()) {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            hwVar.h++;
                        }
                    } else if (((gw) arrayList3.get(i14)).a == b10.a) {
                        break;
                    } else {
                        i14++;
                    }
                }
                i12++;
                z12 = z10;
                i11 = 0;
            }
            hwVar.f = z12;
            hwVar.g = tL_messages_savedDialogs.dialogs.size();
            hwVar.m();
            i0.r(fwVar);
            i0.h3(fwVar, 450L);
            hwVar.b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            hwVar.e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            wp.r1(i10).V3(tL_messages_savedDialogsSlice.users, false);
            wp.r1(i10).P3(tL_messages_savedDialogsSlice.chats, false);
            is.a0(i10).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            is.a0(i10).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i15 = 0; i15 < tL_messages_savedDialogsSlice.dialogs.size(); i15++) {
                gw b11 = gw.b(i10, tL_messages_savedDialogsSlice.dialogs.get(i15), tL_messages_savedDialogsSlice.messages);
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList2.size()) {
                        break;
                    }
                    if (((gw) arrayList2.get(i16)).a == b11.a) {
                        b11.e = ((gw) arrayList2.get(i16)).e;
                        ((gw) arrayList2.get(i16)).b = b11.b;
                        break;
                    }
                    i16++;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= arrayList3.size()) {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            hwVar.h++;
                        }
                    } else if (((gw) arrayList3.get(i17)).a == b11.a) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            hwVar.g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = hwVar.j;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                if (((gw) arrayList4.get(i19)).b) {
                    i18++;
                }
            }
            hwVar.f = arrayList3.size() + i18 >= hwVar.g || tL_messages_savedDialogsSlice.dialogs.size() == 0;
            hwVar.m();
            i0.r(fwVar);
            i0.h3(fwVar, 450L);
            hwVar.b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            hwVar.e = true;
            arrayList3.addAll(arrayList);
            hwVar.g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            hwVar.h = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((gw) arrayList.get(i20)).d()) {
                    hwVar.h++;
                }
            }
            boolean z13 = hwVar.f;
            boolean z14 = arrayList3.size() >= hwVar.g;
            hwVar.f = z14;
            hwVar.b = false;
            if (z14 && !z13) {
                hwVar.m();
            }
        } else if (tL_error != null) {
            hwVar.e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                hwVar.b = true;
            }
        }
        if (hwVar.b != z11) {
            wp.r1(i10).f7.edit().putBoolean("savedMessagesUnsupported", hwVar.b).apply();
        }
        hwVar.d = false;
    }

    private final void d() {
        rz rzVar = (rz) this.b;
        dz dzVar = (dz) this.c;
        File file = (File) this.d;
        kj kjVar = (kj) this.e;
        TLRPC.Document F0 = dzVar.m.F0();
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = ic.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    F0.thumbs.add(ic.Z(K, 90.0f, 90.0f, 55, dzVar.d != null));
                    K.recycle();
                }
            } catch (Exception e) {
                F0.thumbs.clear();
                f8.g(e, true);
            }
        }
        i0.g3(new dn(rzVar, dzVar, file, F0, kjVar, 16));
    }

    private final void f() {
        boolean z10;
        rz rzVar = (rz) this.b;
        TLObject tLObject = (TLObject) this.c;
        dz dzVar = (dz) this.d;
        String str = (String) this.e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            vi mediaDataController = rzVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.I.k(tL_messages_stickerSet, stickerSet.id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.N.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) dzVar.h;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) rzVar.a.remove(str);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z10) {
            rzVar.getMessagesStorage().r1(((dz) arrayList.get(0)).m.k, null, null, false);
        }
        pw secretChatHelper = rzVar.getSecretChatHelper();
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) dzVar.d;
        kj kjVar = dzVar.m;
        secretChatHelper.j(decryptedMessage, kjVar.k, dzVar.n, null, null, kjVar);
    }

    private final void g() {
        fz fzVar = (fz) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        iz izVar = fzVar.b;
        rz rzVar = izVar.q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i10 = at.v1;
        if (!z10) {
            rzVar.D.l(izVar.j);
            rzVar.getNotificationCenter().k(i10, Long.valueOf(izVar.j), tL_messages_initHistoryImport, tL_error);
            return;
        }
        izVar.k = ((TLRPC.TL_messages_historyImport) tLObject).id;
        ArrayList arrayList = izVar.f;
        HashSet hashSet = izVar.c;
        hashSet.remove(izVar.a);
        rzVar.getNotificationCenter().k(i10, Long.valueOf(izVar.j));
        if (hashSet.isEmpty()) {
            iz.a(izVar);
        }
        izVar.n = SystemClock.elapsedRealtime();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            rzVar.getFileLoader().i0(false, 67108864, (String) arrayList.get(i11), true);
        }
    }

    private final void h() {
        lz lzVar = (lz) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.e;
        mz mzVar = lzVar.b;
        rz rzVar = mzVar.o;
        rzVar.F.remove(mzVar.e);
        int i10 = at.w1;
        if (tL_error == null) {
            rzVar.getNotificationCenter().k(i10, mzVar.e);
        } else {
            rzVar.getNotificationCenter().k(i10, mzVar.e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = rzVar.getNotificationCenter().a;
            int i11 = at.x1;
            if (sparseArray.indexOfKey(i11) >= 0) {
                rzVar.getNotificationCenter().k(i11, tLObject);
            } else {
                rzVar.getMediaDataController().f2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        u10 u10Var = (u10) this.b;
        kj kjVar = (kj) this.c;
        c3.s sVar = (c3.s) this.d;
        bi.i6 i6Var = (bi.i6) this.e;
        kjVar.k.originalLanguage = "und";
        u10Var.getMessagesStorage().X1(sVar.a, kjVar.k);
        u10Var.K.remove(sVar);
        i6Var.a("und");
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
        wp wpVar;
        boolean z10;
        long j10;
        kj kjVar;
        TLRPC.Message message;
        ArrayList arrayList;
        TLRPC.User user;
        boolean z11;
        int i10;
        ArrayList arrayList2;
        int i11;
        a0.h hVar;
        wp wpVar2;
        vi viVar;
        a0.h hVar2;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i12 = 4;
        switch (this.a) {
            case 0:
                wp wpVar3 = (wp) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                if (!updates_difference.new_messages.isEmpty() || !updates_difference.new_encrypted_messages.isEmpty()) {
                    a0.h hVar5 = new a0.h();
                    for (int i13 = 0; i13 < updates_difference.new_encrypted_messages.size(); i13++) {
                        ArrayList g10 = wpVar3.getSecretChatHelper().g(updates_difference.new_encrypted_messages.get(i13));
                        if (g10 != null && !g10.isEmpty()) {
                            updates_difference.new_messages.addAll(g10);
                        }
                    }
                    ic.X(updates_difference.new_messages);
                    ArrayList arrayList3 = new ArrayList();
                    long e = wpVar3.getUserConfig().e();
                    for (int i14 = 0; i14 < updates_difference.new_messages.size(); i14++) {
                        TLRPC.Message message2 = updates_difference.new_messages.get(i14);
                        if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                            kj.B0(message2);
                            if (o5.C(message2.dialog_id)) {
                                wpVar = wpVar3;
                            } else {
                                TLRPC.MessageAction messageAction = message2.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) hVar3.f(messageAction.user_id)) != null && user.bot) {
                                    message2.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                    message2.flags |= 64;
                                }
                                TLRPC.MessageAction messageAction2 = message2.action;
                                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                                    wpVar = wpVar3;
                                    z10 = false;
                                    message2.unread = false;
                                    message2.media_unread = false;
                                    j10 = message2.dialog_id;
                                    if (j10 == e) {
                                        message2.unread = z10;
                                        message2.media_unread = z10;
                                        message2.out = true;
                                    }
                                    wp wpVar4 = wpVar;
                                    boolean contains = wpVar4.u0.contains(Long.valueOf(j10));
                                    wpVar3 = wpVar4;
                                    kjVar = new kj(wpVar3.currentAccount, message2, hVar3, hVar4, contains, contains);
                                    message = kjVar.k;
                                    if ((message.out || message.from_scheduled) && kjVar.F4()) {
                                        arrayList3.add(kjVar);
                                    }
                                    arrayList = (ArrayList) hVar5.f(message2.dialog_id);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        hVar5.k(arrayList, message2.dialog_id);
                                    }
                                    arrayList.add(kjVar);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = message2.out ? wpVar3.P : wpVar3.O;
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(message2.dialog_id));
                                    if (num == null) {
                                        wpVar = wpVar3;
                                        num = Integer.valueOf(wpVar3.getMessagesStorage().U(message2.dialog_id, message2.out));
                                        concurrentHashMap.put(Long.valueOf(message2.dialog_id), num);
                                    } else {
                                        wpVar = wpVar3;
                                    }
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                            z10 = false;
                            j10 = message2.dialog_id;
                            if (j10 == e) {
                            }
                            wp wpVar42 = wpVar;
                            boolean contains2 = wpVar42.u0.contains(Long.valueOf(j10));
                            wpVar3 = wpVar42;
                            kjVar = new kj(wpVar3.currentAccount, message2, hVar3, hVar4, contains2, contains2);
                            message = kjVar.k;
                            if (message.out) {
                            }
                            arrayList3.add(kjVar);
                            arrayList = (ArrayList) hVar5.f(message2.dialog_id);
                            if (arrayList == null) {
                            }
                            arrayList.add(kjVar);
                        }
                    }
                    wpVar3.getMessagesStorage().a.c(new vl(wpVar3, arrayList3, updates_difference, hVar5));
                    wpVar3.getSecretChatHelper().m();
                }
                if (!updates_difference.other_updates.isEmpty()) {
                    wpVar3.K3(updates_difference.other_updates, updates_difference.users, updates_difference.chats, true, 0);
                }
                if (updates_difference instanceof TLRPC.TL_updates_difference) {
                    wpVar3.f2 = false;
                    wpVar3.getMessagesStorage().K1(updates_difference.state.seq);
                    wpVar3.getMessagesStorage().H1(updates_difference.state.date);
                    wpVar3.getMessagesStorage().I1(updates_difference.state.pts);
                    wpVar3.getMessagesStorage().J1(updates_difference.state.qts);
                    f8.b("received difference: isUpdating = false");
                    wpVar3.getConnectionsManager().setIsUpdating(false);
                    for (int i15 = 0; i15 < 3; i15++) {
                        wpVar3.M3(i15, 1);
                    }
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                    wpVar3.getMessagesStorage().H1(updates_difference.intermediate_state.date);
                    wpVar3.getMessagesStorage().I1(updates_difference.intermediate_state.pts);
                    wpVar3.getMessagesStorage().J1(updates_difference.intermediate_state.qts);
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceEmpty) {
                    wpVar3.f2 = false;
                    wpVar3.getMessagesStorage().K1(updates_difference.seq);
                    wpVar3.getMessagesStorage().H1(updates_difference.date);
                    wpVar3.getConnectionsManager().setIsUpdating(false);
                    f8.b("received differenceEmpty: isUpdating = false");
                    for (int i16 = 0; i16 < 3; i16++) {
                        wpVar3.M3(i16, 1);
                    }
                }
                is messagesStorage = wpVar3.getMessagesStorage();
                is messagesStorage2 = wpVar3.getMessagesStorage();
                messagesStorage2.H();
                int i17 = messagesStorage2.w;
                is messagesStorage3 = wpVar3.getMessagesStorage();
                messagesStorage3.H();
                int i18 = messagesStorage3.r;
                is messagesStorage4 = wpVar3.getMessagesStorage();
                messagesStorage4.H();
                int i19 = messagesStorage4.n;
                is messagesStorage5 = wpVar3.getMessagesStorage();
                messagesStorage5.H();
                messagesStorage.A1(i17, i18, i19, messagesStorage5.s);
                if (v2.a) {
                    StringBuilder sb2 = new StringBuilder("received difference with date = ");
                    is messagesStorage6 = wpVar3.getMessagesStorage();
                    messagesStorage6.H();
                    sb2.append(messagesStorage6.n);
                    sb2.append(" pts = ");
                    is messagesStorage7 = wpVar3.getMessagesStorage();
                    messagesStorage7.H();
                    sb2.append(messagesStorage7.r);
                    sb2.append(" seq = ");
                    is messagesStorage8 = wpVar3.getMessagesStorage();
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
                    f8.b(sb2.toString());
                    return;
                }
                return;
            case 1:
                wp wpVar5 = (wp) this.b;
                org.telegram.ui.Components.s4.e0(wpVar5.currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.k2) this.d, (TLRPC.TL_messages_createChat) this.e, new Object[0]);
                wpVar5.getNotificationCenter().k(29, new Object[0]);
                return;
            case 2:
                wp wpVar6 = (wp) this.b;
                org.telegram.ui.Components.s4.e0(wpVar6.currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.k2) this.d, (TLRPC.TL_channels_createChannel) this.e, new Object[0]);
                wpVar6.getNotificationCenter().k(29, new Object[0]);
                return;
            case 3:
                org.telegram.ui.Components.s4.e0(((wp) this.b).currentAccount, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.k2) this.d, (TLRPC.TL_messages_editChatAdmin) this.e, Boolean.FALSE);
                return;
            case 4:
                rz rzVar = (rz) this.b;
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                fy fyVar = (fy) this.e;
                if (j2.b(rzVar.currentAccount).a(tL_messages_forwardMessages, arrayList4, fyVar)) {
                    fyVar.run();
                    return;
                }
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) this.c;
                ji.b bVar = (ji.b) this.d;
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                if (zArr[0]) {
                    return;
                }
                ng ngVar = new ng(zArr, ecVarArr, bVar, 6);
                SharedPreferences d12 = wp.d1();
                if (d12.getBoolean("proxycheckstatusip", false)) {
                    ngVar.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                alertDialog$Builder.a.R = dd.L0(2131746623, null);
                alertDialog$Builder.a.T = dd.L0(2131746622, null);
                alertDialog$Builder.k(dd.L0(2131746758, null), new p(1, d12, ngVar));
                i0.a.s(null, 2131752589, alertDialog$Builder, null);
                return;
            case 6:
                k8 k8Var = (k8) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                long[] jArr = (long[]) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                k8Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                k8Var.c();
                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                    try {
                        ((kj) arrayList5.get(i20)).K(false);
                    } finally {
                        try {
                            f8.g(th, true);
                            return;
                        } finally {
                        }
                    }
                }
                jArr[0] = System.currentTimeMillis() - currentTimeMillis;
                return;
            case 7:
                k8 k8Var2 = (k8) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                LongSparseArray longSparseArray = (LongSparseArray) this.d;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.e;
                k8Var2.getClass();
                try {
                    k8Var2.c();
                    j8 j8Var = new j8();
                    for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                        j8 e7 = k8Var2.e(((x2) arrayList6.get(i21)).a, j8Var);
                        if (e7 != null) {
                            long j11 = e7.a;
                            if (j11 != 0) {
                                ArrayList arrayList7 = (ArrayList) longSparseArray.get(j11);
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                    longSparseArray.put(e7.a, arrayList7);
                                }
                                ((x2) arrayList6.get(i21)).d = e7.c == 23;
                                arrayList7.add((x2) arrayList6.get(i21));
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
                ((w8) this.b).s((String) this.c, (String) this.d, (th.p4) this.e, null, true, false);
                return;
            case 9:
                ((ic) this.b).S((String) this.c, (String) this.d, (jc) this.e);
                return;
            case 10:
                od odVar = (od) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                odVar.getMessagesController().V3(arrayList8, true);
                odVar.getMessagesController().P3(arrayList9, true);
                Utilities.d.c(new kd(odVar, arrayList10, 0));
                return;
            case 11:
                MediaController mediaController = (MediaController) this.b;
                String str = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                kj kjVar2 = (kj) this.e;
                kj kjVar3 = (kj) mediaController.c0.remove(str);
                if (kjVar3 == null) {
                    return;
                }
                int i22 = kjVar3.I1;
                if (bArr == null || kjVar3.F0() == null) {
                    return;
                }
                int i23 = 0;
                while (true) {
                    if (i23 < kjVar3.F0().attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = kjVar3.F0().attributes.get(i23);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            documentAttribute.waveform = bArr;
                            documentAttribute.flags = 4 | documentAttribute.flags;
                        } else {
                            i23++;
                        }
                    }
                }
                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                tL_messages_messages.messages.add(kjVar3.k);
                is.a0(i22).h1(-1, 0, kjVar2.p1 ? 1 : 0, kj.B0(kjVar3.k), 0L, tL_messages_messages, false);
                at.f(i22).k(49, Long.valueOf(kj.B0(kjVar3.k)), m5.j(kjVar3));
                return;
            case 12:
                try {
                    i0.g3(new vl((MediaController) this.b, (String) this.d, MediaController.getWaveform((String) this.c), (kj) this.e, 11));
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            case 13:
                vi viVar2 = (vi) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                ArrayList arrayList11 = viVar2.E1;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                    arrayList11.clear();
                    arrayList11.addAll(tL_messages_reactions.reactions);
                    vi.S1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                    z11 = false;
                    viVar2.getNotificationCenter().k(203, 0L);
                } else {
                    z11 = false;
                }
                viVar2.H1 = z11;
                return;
            case 14:
                vi viVar3 = (vi) this.b;
                String[] strArr = (String[]) this.c;
                si siVar = (si) this.d;
                ArrayList arrayList12 = (ArrayList) this.e;
                viVar3.getClass();
                for (String str2 : strArr) {
                    if (viVar3.z1.get(str2) != null) {
                        return;
                    }
                }
                siVar.c(null, arrayList12);
                return;
            case 15:
                ((vi) this.b).b1(5, true, false, false, new g3((boolean[]) this.c, (ArrayList[]) this.d, (lh) this.e, i12));
                return;
            case 16:
                String str3 = (String) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                q11 q11Var = (q11) this.e;
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                String lowerCase = str3.toLowerCase();
                for (int i24 = 0; i24 < arrayList13.size(); i24++) {
                    if (((TLRPC.TL_messages_stickerSet) arrayList13.get(i24)).keywords != null) {
                        ArrayList<TLRPC.TL_stickerKeyword> arrayList17 = ((TLRPC.TL_messages_stickerSet) arrayList13.get(i24)).keywords;
                        for (int i25 = 0; i25 < arrayList17.size(); i25++) {
                            for (int i26 = 0; i26 < arrayList17.get(i25).keyword.size(); i26++) {
                                String str4 = arrayList17.get(i25).keyword.get(i26);
                                if (lowerCase.equals(str4)) {
                                    arrayList15.add(Long.valueOf(arrayList17.get(i25).document_id));
                                } else if (lowerCase.contains(str4) || str4.contains(lowerCase)) {
                                    arrayList16.add(Long.valueOf(arrayList17.get(i25).document_id));
                                }
                            }
                        }
                    }
                }
                for (int i27 = 0; i27 < arrayList14.size(); i27++) {
                    if ((arrayList14.get(i27) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList14.get(i27)).keywords != null) {
                        ArrayList<TLRPC.TL_stickerKeyword> arrayList18 = ((TLRPC.TL_stickerSetFullCovered) arrayList14.get(i27)).keywords;
                        for (int i28 = 0; i28 < arrayList18.size(); i28++) {
                            for (int i29 = 0; i29 < arrayList18.get(i28).keyword.size(); i29++) {
                                String str5 = arrayList18.get(i28).keyword.get(i29);
                                if (lowerCase.equals(str5)) {
                                    arrayList15.add(Long.valueOf(arrayList18.get(i28).document_id));
                                } else if (lowerCase.contains(str5) || str5.contains(lowerCase)) {
                                    arrayList16.add(Long.valueOf(arrayList18.get(i28).document_id));
                                }
                            }
                        }
                    }
                }
                arrayList15.addAll(arrayList16);
                q11Var.a(arrayList15);
                return;
            case 17:
                wp wpVar7 = (wp) this.b;
                ArrayList arrayList19 = (ArrayList) this.e;
                TLRPC.updates_Difference updates_difference2 = (TLRPC.updates_Difference) this.c;
                a0.h hVar6 = (a0.h) this.d;
                if (!arrayList19.isEmpty()) {
                    i0.g3(new lg(wpVar7, arrayList19, updates_difference2, 13));
                }
                wpVar7.getMessagesStorage().j1(updates_difference2.new_messages, true, false, false, wpVar7.getDownloadController().l(), false, 0, 0L);
                for (int i30 = 0; i30 < hVar6.m(); i30++) {
                    long j12 = hVar6.j(i30);
                    ArrayList arrayList20 = (ArrayList) hVar6.n(i30);
                    wpVar7.getMediaDataController().X0(arrayList20, j12, 0, 0L, new pk(wpVar7, j12, arrayList20, 4), 0, null);
                }
                return;
            case 18:
                wp wpVar8 = (wp) this.b;
                TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) this.c;
                a0.h hVar7 = (a0.h) this.d;
                a0.h hVar8 = (a0.h) this.e;
                SparseBooleanArray sparseBooleanArray = wpVar8.c2;
                SparseBooleanArray sparseBooleanArray2 = wpVar8.b2;
                a0.h hVar9 = wpVar8.S;
                SparseArray sparseArray = wpVar8.U;
                a0.h hVar10 = wpVar8.R;
                a0.h hVar11 = wpVar8.Q;
                ArrayList arrayList21 = wpVar8.y;
                wpVar8.l2 = false;
                wpVar8.r(messages_dialogs.dialogs);
                vi mediaDataController = wpVar8.getMediaDataController();
                mediaDataController.E(false);
                mediaDataController.J0();
                wpVar8.V3(messages_dialogs.users, false);
                wpVar8.P3(messages_dialogs.chats, false);
                int i31 = 0;
                while (i31 < arrayList21.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList21.get(i31);
                    wp wpVar9 = wpVar8;
                    if (o5.C(dialog.id)) {
                        viVar = mediaDataController;
                    } else {
                        hVar11.l(dialog.id);
                        ArrayList arrayList22 = (ArrayList) hVar10.f(dialog.id);
                        viVar = mediaDataController;
                        hVar10.l(dialog.id);
                        if (arrayList22 != null) {
                            int i32 = 0;
                            while (i32 < arrayList22.size()) {
                                kj kjVar4 = (kj) arrayList22.get(i32);
                                if (kjVar4 != null) {
                                    a0.h hVar12 = hVar9;
                                    if (kjVar4.k.peer_id.channel_id == 0) {
                                        sparseArray.remove(kjVar4.f1());
                                    }
                                    long j13 = kjVar4.k.random_id;
                                    if (j13 != 0) {
                                        hVar2 = hVar12;
                                        hVar2.l(j13);
                                    } else {
                                        hVar2 = hVar12;
                                    }
                                } else {
                                    hVar2 = hVar9;
                                }
                                i32++;
                                hVar9 = hVar2;
                            }
                        }
                    }
                    i31++;
                    hVar9 = hVar9;
                    mediaDataController = viVar;
                    wpVar8 = wpVar9;
                }
                vi viVar4 = mediaDataController;
                wp wpVar10 = wpVar8;
                a0.h hVar13 = hVar9;
                int i33 = 0;
                while (i33 < hVar7.m()) {
                    long j14 = hVar7.j(i33);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar7.n(i33);
                    TLRPC.DraftMessage draftMessage = dialog2.draft;
                    if (draftMessage instanceof TLRPC.TL_draftMessage) {
                        i10 = i33;
                        viVar4.R1(dialog2.id, 0L, draftMessage, null, false);
                    } else {
                        i10 = i33;
                    }
                    hVar11.k(dialog2, j14);
                    ArrayList arrayList23 = (ArrayList) hVar8.f(dialog2.id);
                    hVar10.k(arrayList23, j14);
                    if (arrayList23 != null) {
                        int i34 = 0;
                        while (i34 < arrayList23.size()) {
                            kj kjVar5 = (kj) arrayList23.get(i34);
                            if (kjVar5 != null) {
                                arrayList2 = arrayList23;
                                i11 = i34;
                                if (kjVar5.k.peer_id.channel_id == 0) {
                                    sparseArray.put(kjVar5.f1(), kjVar5);
                                    wpVar2 = wpVar10;
                                    wpVar2.N = Math.min(wpVar2.N, kjVar5.k.date);
                                    hVar = hVar7;
                                    long j15 = kjVar5.k.random_id;
                                    if (j15 != 0) {
                                        hVar13.k(kjVar5, j15);
                                    }
                                    i34 = i11 + 1;
                                    wpVar10 = wpVar2;
                                    hVar7 = hVar;
                                    arrayList23 = arrayList2;
                                }
                            } else {
                                arrayList2 = arrayList23;
                                i11 = i34;
                            }
                            hVar = hVar7;
                            wpVar2 = wpVar10;
                            i34 = i11 + 1;
                            wpVar10 = wpVar2;
                            hVar7 = hVar;
                            arrayList23 = arrayList2;
                        }
                    }
                    wp wpVar11 = wpVar10;
                    wpVar11.t7.d(j14);
                    wpVar10 = wpVar11;
                    i33 = i10 + 1;
                    hVar7 = hVar7;
                }
                wp wpVar12 = wpVar10;
                arrayList21.clear();
                int m10 = hVar11.m();
                for (int i35 = 0; i35 < m10; i35++) {
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar11.n(i35);
                    if (wpVar12.D0.h(dialog3.id) < 0) {
                        arrayList21.add(dialog3);
                    }
                }
                wpVar12.Q4(null);
                sparseBooleanArray2.put(0, true);
                sparseBooleanArray.put(0, false);
                sparseBooleanArray2.put(1, true);
                sparseBooleanArray.put(1, false);
                int n10 = wpVar12.getUserConfig().n(0);
                long[] g11 = wpVar12.getUserConfig().g(0);
                if (n10 < 400) {
                    long j16 = g11[0];
                    if (j16 != -1 && j16 != 2147483647L) {
                        wpVar12.S2(0, 0, 100, false, null);
                    }
                }
                wpVar12.getNotificationCenter().k(3, new Object[0]);
                return;
            case 19:
                is isVar = (is) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                SparseIntArray sparseIntArray = (SparseIntArray) this.e;
                isVar.getClass();
                try {
                    if (!is.t0(longSparseIntArray)) {
                        SQLitePreparedStatement executeFast = isVar.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                        for (int i36 = 0; i36 < longSparseIntArray.size(); i36++) {
                            try {
                                long keyAt = longSparseIntArray.keyAt(i36);
                                int i37 = longSparseIntArray.get(keyAt);
                                SQLiteDatabase sQLiteDatabase = isVar.b;
                                Locale locale = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt + " AND mid > 0 AND mid <= " + i37 + " AND read_state IN(0,2) AND out = 0").stepThis().dispose();
                                executeFast.requery();
                                executeFast.bindLong(1, keyAt);
                                executeFast.bindInteger(2, i37);
                                executeFast.step();
                            } catch (Exception e11) {
                                e = e11;
                                sQLitePreparedStatement = executeFast;
                                try {
                                    isVar.o(e, true);
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
                    if (!is.t0(longSparseIntArray2)) {
                        for (int i38 = 0; i38 < longSparseIntArray2.size(); i38++) {
                            long keyAt2 = longSparseIntArray2.keyAt(i38);
                            int i39 = longSparseIntArray2.get(keyAt2);
                            SQLiteDatabase sQLiteDatabase2 = isVar.b;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt2 + " AND mid > 0 AND mid <= " + i39 + " AND read_state IN(0,2) AND out = 1").stepThis().dispose();
                        }
                    }
                    if (sparseIntArray != null) {
                        if (sparseIntArray.size() == 0) {
                            return;
                        }
                        for (int i40 = 0; i40 < sparseIntArray.size(); i40++) {
                            long F = o5.F(sparseIntArray.keyAt(i40));
                            int valueAt = sparseIntArray.valueAt(i40);
                            SQLitePreparedStatement executeFast2 = isVar.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 1");
                            try {
                                executeFast2.requery();
                                executeFast2.bindLong(1, F);
                                executeFast2.bindInteger(2, valueAt);
                                executeFast2.step();
                                executeFast2.dispose();
                            } catch (Exception e12) {
                                e = e12;
                                sQLitePreparedStatement = executeFast2;
                                isVar.o(e, true);
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
                } catch (Exception e13) {
                    e = e13;
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
                d();
                return;
            case 24:
                f();
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
                u10 u10Var = (u10) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                String str6 = (String) this.d;
                s10 s10Var = (s10) this.e;
                storyItem.detectedLng = str6;
                u10Var.getMessagesController().O1().k.h(storyItem.dialogId, storyItem);
                u10Var.I.remove(s10Var);
                return;
        }
    }

    public /* synthetic */ vl(wp wpVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.a = 17;
        this.b = wpVar;
        this.e = arrayList;
        this.c = updates_difference;
        this.d = hVar;
    }
}
