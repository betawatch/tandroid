package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class uv {
    public long a;
    public boolean b;
    public int c;
    public ij d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static uv a(int i7, TLRPC.Message message) {
        uv uvVar = new uv();
        uvVar.a = ij.Q1(p10.i(i7).e(), message);
        uvVar.b = false;
        uvVar.c = message.id;
        uvVar.d = new ij(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return uvVar;
    }

    public static uv b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        uv uvVar = new uv();
        uvVar.a = m5.o(saveddialog.peer);
        uvVar.b = saveddialog.pinned;
        uvVar.c = saveddialog.top_message;
        uvVar.f = saveddialog.unread_count;
        uvVar.g = saveddialog.read_inbox_max_id;
        uvVar.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i10);
            if (uvVar.c == message.id) {
                break;
            }
            i10++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            uvVar.d = new ij(i7, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return uvVar;
    }

    public final int c() {
        TLRPC.Message message;
        ij ijVar = this.d;
        return (ijVar == null || (message = ijVar.k) == null) ? this.j : (message.flags & 32768) != 0 ? message.edit_date : message.date;
    }

    public final boolean d() {
        TLRPC.Message message;
        ij ijVar = this.d;
        return (ijVar == null || (message = ijVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
    }
}
