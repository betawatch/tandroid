package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class tf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ f1 f;
    public final /* synthetic */ Object h;

    public /* synthetic */ tf(ui uiVar, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f = uiVar;
        this.c = z10;
        this.b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        int i12 = 3;
        int i13 = this.e;
        boolean z10 = this.d;
        boolean z11 = this.c;
        Object obj = this.h;
        int i14 = this.b;
        f1 f1Var = this.f;
        switch (i11) {
            case 0:
                ui uiVar = (ui) f1Var;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                    if (z11) {
                        i10 = uiVar.getMessagesController().f3;
                    } else {
                        if (i14 != 3 && i14 != 7) {
                            i10 = i14 == 2 ? uiVar.getMessagesController().e3 : uiVar.getMessagesController().d3;
                        }
                        i10 = zs.e3;
                    }
                    sQLiteDatabase.beginTransaction();
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    int size = arrayList.size();
                    int i15 = z11 ? 2 : i14 == 0 ? 3 : i14 == 1 ? 4 : i14 == 3 ? 6 : i14 == 5 ? 7 : i14 == 7 ? 8 : 5;
                    if (z10) {
                        sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i15).stepThis().dispose();
                    }
                    int i16 = 0;
                    while (i16 < size && i16 != i10) {
                        TLRPC.Document document = (TLRPC.Document) arrayList.get(i16);
                        executeFast.requery();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        int i17 = i13;
                        sb2.append(document.id);
                        executeFast.bindString(1, sb2.toString());
                        executeFast.bindInteger(2, i15);
                        executeFast.bindString(i12, "");
                        executeFast.bindString(4, "");
                        executeFast.bindString(5, "");
                        executeFast.bindInteger(6, 0);
                        executeFast.bindInteger(7, 0);
                        executeFast.bindInteger(8, 0);
                        executeFast.bindInteger(9, i17 != 0 ? i17 : size - i16);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                        document.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(10, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        i16++;
                        i13 = i17;
                        i12 = 3;
                    }
                    executeFast.dispose();
                    sQLiteDatabase.commitTransaction();
                    if (!z10 && arrayList.size() >= i10) {
                        sQLiteDatabase.beginTransaction();
                        while (i10 < arrayList.size()) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i10)).id + "' AND type = " + i15).stepThis().dispose();
                            i10++;
                        }
                        sQLiteDatabase.commitTransaction();
                        break;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
                break;
            default:
                ((vp) f1Var).getNotificationCenter().k(18, Integer.valueOf(i14), Integer.valueOf(((TLRPC.messages_Messages) obj).messages.size()), Boolean.valueOf(z11), Boolean.valueOf(z10), Integer.valueOf(i13));
                break;
        }
    }

    public /* synthetic */ tf(vp vpVar, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f = vpVar;
        this.b = i10;
        this.h = messages_messages;
        this.c = z10;
        this.d = z11;
        this.e = i11;
    }
}
