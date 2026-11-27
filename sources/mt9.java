// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mt9 {
    public long a;
    public boolean b;
    public int c;
    public r47 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static mt9 a(int i, TLRPC.Message message) {
        mt9 mt9Var = new mt9();
        mt9Var.a = r47.Q1(yac.h(i).e(), message);
        mt9Var.b = false;
        mt9Var.c = message.id;
        mt9Var.d = new r47(i, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return mt9Var;
    }

    public static mt9 b(int i, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        mt9 mt9Var = new mt9();
        mt9Var.a = wf3.n(saveddialog.peer);
        mt9Var.b = saveddialog.pinned;
        mt9Var.c = saveddialog.top_message;
        mt9Var.f = saveddialog.unread_count;
        mt9Var.g = saveddialog.read_inbox_max_id;
        mt9Var.h = saveddialog.read_outbox_max_id;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i2);
            if (mt9Var.c == message.id) {
                break;
            }
            i2++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            mt9Var.d = new r47(i, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return mt9Var;
    }

    public final int c() {
        TLRPC.Message message;
        r47 r47Var = this.d;
        return (r47Var == null || (message = r47Var.k) == null) ? this.j : (message.flags & 32768) != 0 ? message.edit_date : message.date;
    }

    public final boolean d() {
        TLRPC.Message message;
        r47 r47Var = this.d;
        return (r47Var == null || (message = r47Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
    }
}
