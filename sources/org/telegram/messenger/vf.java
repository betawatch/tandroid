package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ c1 f;
    public final /* synthetic */ Object h;

    public /* synthetic */ vf(ui uiVar, boolean z9, int i7, ArrayList arrayList, boolean z10, int i10) {
        this.f = uiVar;
        this.c = z9;
        this.b = i7;
        this.h = arrayList;
        this.d = z10;
        this.e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        int i11 = 3;
        int i12 = this.e;
        boolean z9 = this.d;
        boolean z10 = this.c;
        Object obj = this.h;
        int i13 = this.b;
        c1 c1Var = this.f;
        switch (i10) {
            case 0:
                ui uiVar = (ui) c1Var;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                    if (z10) {
                        i7 = uiVar.getMessagesController().f3;
                    } else {
                        if (i13 != 3 && i13 != 7) {
                            i7 = i13 == 2 ? uiVar.getMessagesController().e3 : uiVar.getMessagesController().d3;
                        }
                        i7 = qs.e3;
                    }
                    sQLiteDatabase.beginTransaction();
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    int size = arrayList.size();
                    int i14 = z10 ? 2 : i13 == 0 ? 3 : i13 == 1 ? 4 : i13 == 3 ? 6 : i13 == 5 ? 7 : i13 == 7 ? 8 : 5;
                    if (z9) {
                        sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i14).stepThis().dispose();
                    }
                    int i15 = 0;
                    while (i15 < size && i15 != i7) {
                        TLRPC.Document document = (TLRPC.Document) arrayList.get(i15);
                        executeFast.requery();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        int i16 = i12;
                        sb2.append(document.id);
                        executeFast.bindString(1, sb2.toString());
                        executeFast.bindInteger(2, i14);
                        executeFast.bindString(i11, "");
                        executeFast.bindString(4, "");
                        executeFast.bindString(5, "");
                        executeFast.bindInteger(6, 0);
                        executeFast.bindInteger(7, 0);
                        executeFast.bindInteger(8, 0);
                        executeFast.bindInteger(9, i16 != 0 ? i16 : size - i15);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                        document.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(10, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        i15++;
                        i12 = i16;
                        i11 = 3;
                    }
                    executeFast.dispose();
                    sQLiteDatabase.commitTransaction();
                    if (!z9 && arrayList.size() >= i7) {
                        sQLiteDatabase.beginTransaction();
                        while (i7 < arrayList.size()) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i7)).id + "' AND type = " + i14).stepThis().dispose();
                            i7++;
                        }
                        sQLiteDatabase.commitTransaction();
                        break;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
                break;
            default:
                ((qp) c1Var).getNotificationCenter().k(18, Integer.valueOf(i13), Integer.valueOf(((TLRPC.messages_Messages) obj).messages.size()), Boolean.valueOf(z10), Boolean.valueOf(z9), Integer.valueOf(i12));
                break;
        }
    }

    public /* synthetic */ vf(qp qpVar, int i7, TLRPC.messages_Messages messages_messages, boolean z9, boolean z10, int i10) {
        this.f = qpVar;
        this.b = i7;
        this.h = messages_messages;
        this.c = z9;
        this.d = z10;
        this.e = i10;
    }
}
