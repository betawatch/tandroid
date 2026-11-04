package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ c1 f;
    public final /* synthetic */ Object h;

    public /* synthetic */ nf(li liVar, boolean z10, int i3, ArrayList arrayList, boolean z11, int i10) {
        this.f = liVar;
        this.c = z10;
        this.b = i3;
        this.h = arrayList;
        this.d = z11;
        this.e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10 = this.a;
        int i11 = 3;
        int i12 = this.e;
        boolean z10 = this.d;
        boolean z11 = this.c;
        Object obj = this.h;
        int i13 = this.b;
        c1 c1Var = this.f;
        switch (i10) {
            case 0:
                li liVar = (li) c1Var;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().b;
                    if (z11) {
                        i3 = liVar.getMessagesController().g3;
                    } else {
                        if (i13 != 3 && i13 != 7) {
                            i3 = i13 == 2 ? liVar.getMessagesController().f3 : liVar.getMessagesController().e3;
                        }
                        i3 = hs.e3;
                    }
                    sQLiteDatabase.beginTransaction();
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    int size = arrayList.size();
                    int i14 = z11 ? 2 : i13 == 0 ? 3 : i13 == 1 ? 4 : i13 == 3 ? 6 : i13 == 5 ? 7 : i13 == 7 ? 8 : 5;
                    if (z10) {
                        sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i14).stepThis().dispose();
                    }
                    int i15 = 0;
                    while (i15 < size && i15 != i3) {
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
                    if (!z10 && arrayList.size() >= i3) {
                        sQLiteDatabase.beginTransaction();
                        while (i3 < arrayList.size()) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i3)).id + "' AND type = " + i14).stepThis().dispose();
                            i3++;
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
                ((hp) c1Var).getNotificationCenter().k(18, Integer.valueOf(i13), Integer.valueOf(((TLRPC.messages_Messages) obj).messages.size()), Boolean.valueOf(z11), Boolean.valueOf(z10), Integer.valueOf(i12));
                break;
        }
    }

    public /* synthetic */ nf(hp hpVar, int i3, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i10) {
        this.f = hpVar;
        this.b = i3;
        this.h = messages_messages;
        this.c = z10;
        this.d = z11;
        this.e = i10;
    }
}
