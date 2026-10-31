package org.telegram.ui.Components;

import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ y4(b5 b5Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = b5Var;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: SQLiteException -> 0x0058, TryCatch #4 {SQLiteException -> 0x0058, blocks: (B:5:0x0012, B:6:0x0019, B:8:0x001f, B:10:0x0027, B:18:0x0054, B:25:0x004e, B:20:0x005a, B:29:0x005d), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        NativeByteBuffer nativeByteBuffer;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                b5 b5Var = this.b;
                int i10 = b5Var.e;
                org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i10);
                SQLiteDatabase sQLiteDatabase = a02.b;
                if (sQLiteDatabase != null) {
                    try {
                        String join = TextUtils.join(",", arrayList);
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + join + ")", new Object[0]);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet(arrayList);
                        while (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            try {
                                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                                if (TLdeserialize != null && TLdeserialize.id != 0) {
                                    arrayList2.add(TLdeserialize);
                                    hashSet.remove(Long.valueOf(TLdeserialize.id));
                                }
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                            if (byteBufferValue != null) {
                                byteBufferValue.reuse();
                            }
                        }
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            b5Var.d(arrayList2);
                            if (!hashSet.isEmpty()) {
                                ArrayList<Long> arrayList3 = new ArrayList<>(hashSet);
                                TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                                tL_messages_getCustomEmojiDocuments.document_id = arrayList3;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new ag.k0(23, b5Var, arrayList3));
                            }
                        } else {
                            org.telegram.messenger.zs.f(i10).d(new z4(b5Var, arrayList2, hashSet, 0));
                        }
                        queryFinalized.dispose();
                        break;
                    } catch (SQLiteException e7) {
                        a02.o(e7, true);
                        return;
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.c;
                try {
                    SQLitePreparedStatement executeFast = org.telegram.messenger.hs.a0(this.b.e).b.executeFast("REPLACE INTO animated_emoji VALUES(?, ?)");
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        if (arrayList4.get(i11) instanceof TLRPC.Document) {
                            TLRPC.Document document = (TLRPC.Document) arrayList4.get(i11);
                            NativeByteBuffer nativeByteBuffer2 = null;
                            try {
                                nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                            } catch (Exception e10) {
                                e = e10;
                            }
                            try {
                                document.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindLong(1, document.id);
                                executeFast.bindByteBuffer(2, nativeByteBuffer);
                                executeFast.step();
                            } catch (Exception e11) {
                                e = e11;
                                nativeByteBuffer2 = nativeByteBuffer;
                                e.printStackTrace();
                                nativeByteBuffer = nativeByteBuffer2;
                                if (nativeByteBuffer == null) {
                                }
                            }
                            if (nativeByteBuffer == null) {
                                nativeByteBuffer.reuse();
                            }
                        }
                    }
                    executeFast.dispose();
                    break;
                } catch (SQLiteException e12) {
                    org.telegram.messenger.f8.g(e12, true);
                }
        }
    }
}
