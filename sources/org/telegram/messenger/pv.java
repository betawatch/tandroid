package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class pv {
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

    public static pv a(int i7, TLRPC.Message message) {
        pv pvVar = new pv();
        pvVar.a = gj.Q1(k10.i(i7).e(), message);
        pvVar.b = false;
        pvVar.c = message.id;
        pvVar.d = new gj(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return pvVar;
    }

    public static pv b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        pv pvVar = new pv();
        pvVar.a = n5.o(saveddialog.peer);
        pvVar.b = saveddialog.pinned;
        pvVar.c = saveddialog.top_message;
        pvVar.f = saveddialog.unread_count;
        pvVar.g = saveddialog.read_inbox_max_id;
        pvVar.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i10);
            if (pvVar.c == message.id) {
                break;
            }
            i10++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            pvVar.d = new gj(i7, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return pvVar;
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
