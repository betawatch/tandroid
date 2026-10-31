package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class fw {
    public long a;
    public boolean b;
    public int c;
    public jj d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static fw a(int i10, TLRPC.Message message) {
        fw fwVar = new fw();
        fwVar.a = jj.R1(d20.i(i10).e(), message);
        fwVar.b = false;
        fwVar.c = message.id;
        fwVar.d = new jj(i10, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return fwVar;
    }

    public static fw b(int i10, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        fw fwVar = new fw();
        fwVar.a = o5.o(saveddialog.peer);
        fwVar.b = saveddialog.pinned;
        fwVar.c = saveddialog.top_message;
        fwVar.f = saveddialog.unread_count;
        fwVar.g = saveddialog.read_inbox_max_id;
        fwVar.h = saveddialog.read_outbox_max_id;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i11);
            if (fwVar.c == message.id) {
                break;
            }
            i11++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            fwVar.d = new jj(i10, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return fwVar;
    }

    public final int c() {
        TLRPC.Message message;
        jj jjVar = this.d;
        return (jjVar == null || (message = jjVar.k) == null) ? this.j : (message.flags & 32768) != 0 ? message.edit_date : message.date;
    }

    public final boolean d() {
        TLRPC.Message message;
        jj jjVar = this.d;
        return (jjVar == null || (message = jjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
    }
}
