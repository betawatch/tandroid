package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class sv {
    public long a;
    public boolean b;
    public int c;
    public gj d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static sv a(int i7, TLRPC.Message message) {
        sv svVar = new sv();
        svVar.a = gj.Q1(m10.i(i7).e(), message);
        svVar.b = false;
        svVar.c = message.id;
        svVar.d = new gj(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return svVar;
    }

    public static sv b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        sv svVar = new sv();
        svVar.a = m5.o(saveddialog.peer);
        svVar.b = saveddialog.pinned;
        svVar.c = saveddialog.top_message;
        svVar.f = saveddialog.unread_count;
        svVar.g = saveddialog.read_inbox_max_id;
        svVar.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i10);
            if (svVar.c == message.id) {
                break;
            }
            i10++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            svVar.d = new gj(i7, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return svVar;
    }

    public final int c() {
        TLRPC.Message message;
        gj gjVar = this.d;
        return (gjVar == null || (message = gjVar.k) == null) ? this.j : (message.flags & 32768) != 0 ? message.edit_date : message.date;
    }

    public final boolean d() {
        TLRPC.Message message;
        gj gjVar = this.d;
        return (gjVar == null || (message = gjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
    }
}
