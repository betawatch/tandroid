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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ d5(g5 g5Var, ArrayList arrayList, int i9) {
        this.a = i9;
        this.b = g5Var;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: SQLiteException -> 0x005a, TryCatch #2 {SQLiteException -> 0x005a, blocks: (B:5:0x0013, B:6:0x001a, B:8:0x0020, B:10:0x0028, B:18:0x0056, B:25:0x0050, B:20:0x005c, B:29:0x005f), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        NativeByteBuffer nativeByteBuffer;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                g5 g5Var = this.b;
                int i9 = g5Var.e;
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
                SQLiteDatabase database = messagesStorage.getDatabase();
                if (database != null) {
                    try {
                        String join = TextUtils.join(",", arrayList);
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + join + ")", new Object[0]);
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
                                FileLog.e(e10);
                            }
                            if (byteBufferValue != null) {
                                byteBufferValue.reuse();
                            }
                        }
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            g5Var.d(arrayList2);
                            if (!hashSet.isEmpty()) {
                                ArrayList<Long> arrayList3 = new ArrayList<>(hashSet);
                                TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                                tL_messages_getCustomEmojiDocuments.document_id = arrayList3;
                                ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.rc(10, g5Var, arrayList3));
                            }
                        } else {
                            NotificationCenter.getInstance(i9).doOnIdle(new e5(g5Var, arrayList2, hashSet, 0));
                        }
                        queryFinalized.dispose();
                        break;
                    } catch (SQLiteException e11) {
                        messagesStorage.checkSQLException(e11);
                        return;
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.c;
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(this.b.e).getDatabase().executeFast("REPLACE INTO animated_emoji VALUES(?, ?)");
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
                    FileLog.e(e14);
                }
        }
    }
}
