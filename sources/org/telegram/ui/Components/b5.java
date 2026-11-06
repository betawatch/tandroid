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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ b5(e5 e5Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = e5Var;
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
                e5 e5Var = this.b;
                int i7 = e5Var.e;
                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
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
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            if (byteBufferValue != null) {
                                byteBufferValue.reuse();
                            }
                        }
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            e5Var.d(arrayList2);
                            if (!hashSet.isEmpty()) {
                                ArrayList<Long> arrayList3 = new ArrayList<>(hashSet);
                                TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                                tL_messages_getCustomEmojiDocuments.document_id = arrayList3;
                                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ld(9, e5Var, arrayList3));
                            }
                        } else {
                            org.telegram.messenger.qs.f(i7).d(new c5(e5Var, arrayList2, hashSet, 0));
                        }
                        queryFinalized.dispose();
                        break;
                    } catch (SQLiteException e11) {
                        a02.o(e11, true);
                        return;
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.c;
                try {
                    SQLitePreparedStatement executeFast = org.telegram.messenger.yr.a0(this.b.e).b.executeFast("REPLACE INTO animated_emoji VALUES(?, ?)");
                    for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                        if (arrayList4.get(i10) instanceof TLRPC.Document) {
                            TLRPC.Document document = (TLRPC.Document) arrayList4.get(i10);
                            NativeByteBuffer nativeByteBuffer2 = null;
                            try {
                                nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                            } catch (Exception e12) {
                                e = e12;
                            }
                            try {
                                document.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindLong(1, document.id);
                                executeFast.bindByteBuffer(2, nativeByteBuffer);
                                executeFast.step();
                            } catch (Exception e13) {
                                e = e13;
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
                } catch (SQLiteException e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
        }
    }
}
