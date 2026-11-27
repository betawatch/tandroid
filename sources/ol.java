// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ol implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sl b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ol(sl slVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = slVar;
        this.c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: SQLiteException -> 0x005e, TryCatch #3 {SQLiteException -> 0x005e, blocks: (B:5:0x0013, B:6:0x0019, B:8:0x001f, B:10:0x0027, B:18:0x0054, B:25:0x004e, B:20:0x0057, B:29:0x005a), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        NativeByteBuffer nativeByteBuffer;
        byte b = this.a;
        ArrayList arrayList = this.c;
        sl slVar = this.b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (b) {
            case 0:
                int i = slVar.e;
                jf7 Y = jf7.Y(i);
                SQLiteDatabase sQLiteDatabase = Y.b;
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
                                cc4.g(e, true);
                            }
                            if (byteBufferValue != null) {
                                byteBufferValue.reuse();
                            }
                        }
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            slVar.d(arrayList2);
                            if (!hashSet.isEmpty()) {
                                ArrayList<Long> arrayList3 = new ArrayList<>(hashSet);
                                TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                                tL_messages_getCustomEmojiDocuments.document_id = arrayList3;
                                ConnectionsManager.getInstance(i).sendRequest(tL_messages_getCustomEmojiDocuments, new ql(slVar, arrayList3, objArr2 == true ? 1 : 0));
                            }
                        } else {
                            jn7.f(i).d(new pl(slVar, arrayList2, hashSet, objArr == true ? 1 : 0));
                        }
                        queryFinalized.dispose();
                        break;
                    } catch (SQLiteException e2) {
                        Y.n(e2, true);
                        return;
                    }
                }
                break;
            default:
                try {
                    SQLitePreparedStatement executeFast = jf7.Y(slVar.e).b.executeFast("REPLACE INTO animated_emoji VALUES(?, ?)");
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (arrayList.get(i2) instanceof TLRPC.Document) {
                            TLRPC.Document document = (TLRPC.Document) arrayList.get(i2);
                            NativeByteBuffer nativeByteBuffer2 = null;
                            try {
                                nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                            } catch (Exception e3) {
                                e = e3;
                            }
                            try {
                                document.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindLong(1, document.id);
                                executeFast.bindByteBuffer(2, nativeByteBuffer);
                                executeFast.step();
                            } catch (Exception e4) {
                                e = e4;
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
                } catch (SQLiteException e5) {
                    cc4.g(e5, true);
                }
        }
    }
}
