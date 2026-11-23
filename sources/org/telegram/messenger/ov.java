package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class ov {
    public long a;
    public boolean b;
    public int c;
    public fj d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static ov a(int i7, TLRPC.Message message) {
        ov ovVar = new ov();
        ovVar.a = fj.Q1(i10.i(i7).e(), message);
        ovVar.b = false;
        ovVar.c = message.id;
        ovVar.d = new fj(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return ovVar;
    }

    public static ov b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ov ovVar = new ov();
        ovVar.a = n5.o(saveddialog.peer);
        ovVar.b = saveddialog.pinned;
        ovVar.c = saveddialog.top_message;
        ovVar.f = saveddialog.unread_count;
        ovVar.g = saveddialog.read_inbox_max_id;
        ovVar.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i10);
            if (ovVar.c == message.id) {
                break;
            }
            i10++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            ovVar.d = new fj(i7, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return ovVar;
    }

    public final int c() {
        TLRPC.Message message;
        fj fjVar = this.d;
        return (fjVar == null || (message = fjVar.k) == null) ? this.j : (message.flags & 32768) != 0 ? message.edit_date : message.date;
    }

    public final boolean d() {
        TLRPC.Message message;
        fj fjVar = this.d;
        return (fjVar == null || (message = fjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
    }
}
