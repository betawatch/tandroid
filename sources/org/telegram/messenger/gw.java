package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class gw {
    public long a;
    public boolean b;
    public int c;
    public kj d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static gw a(int i10, TLRPC.Message message) {
        gw gwVar = new gw();
        gwVar.a = kj.R1(e20.i(i10).e(), message);
        gwVar.b = false;
        gwVar.c = message.id;
        gwVar.d = new kj(i10, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return gwVar;
    }

    public static gw b(int i10, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        gw gwVar = new gw();
        gwVar.a = o5.o(saveddialog.peer);
        gwVar.b = saveddialog.pinned;
        gwVar.c = saveddialog.top_message;
        gwVar.f = saveddialog.unread_count;
        gwVar.g = saveddialog.read_inbox_max_id;
        gwVar.h = saveddialog.read_outbox_max_id;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i11);
            if (gwVar.c == message.id) {
                break;
            }
            i11++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            gwVar.d = new kj(i10, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return gwVar;
    }

    public final int c() {
        TLRPC.Message message;
        kj kjVar = this.d;
        return (kjVar == null || (message = kjVar.k) == null) ? this.j : (message.flags & 32768) != 0 ? message.edit_date : message.date;
    }

    public final boolean d() {
        TLRPC.Message message;
        kj kjVar = this.d;
        return (kjVar == null || (message = kjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
    }
}
