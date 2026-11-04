package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class mv {
    public long a;
    public boolean b;
    public int c;
    public zi d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static mv a(int i3, TLRPC.Message message) {
        mv mvVar = new mv();
        mvVar.a = zi.R1(h10.i(i3).e(), message);
        mvVar.b = false;
        mvVar.c = message.id;
        mvVar.d = new zi(i3, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return mvVar;
    }

    public static mv b(int i3, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        mv mvVar = new mv();
        mvVar.a = m5.o(saveddialog.peer);
        mvVar.b = saveddialog.pinned;
        mvVar.c = saveddialog.top_message;
        mvVar.f = saveddialog.unread_count;
        mvVar.g = saveddialog.read_inbox_max_id;
        mvVar.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i10);
            if (mvVar.c == message.id) {
                break;
            }
            i10++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            mvVar.d = new zi(i3, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return mvVar;
    }

    public final int c() {
        TLRPC.Message message;
        zi ziVar = this.d;
        return (ziVar == null || (message = ziVar.k) == null) ? this.j : (message.flags & 32768) != 0 ? message.edit_date : message.date;
    }

    public final boolean d() {
        TLRPC.Message message;
        zi ziVar = this.d;
        return (ziVar == null || (message = ziVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
    }
}
