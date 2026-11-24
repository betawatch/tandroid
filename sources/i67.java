// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i67 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ i67(na7 na7Var, long j, int i, int i2, boolean z, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        int i;
        switch (this.a) {
            case 0:
                na7 na7Var = this.b;
                vf6 vf6Var = na7Var.R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var.f(j2);
                int i2 = this.e;
                if (dialog != null) {
                    int i3 = dialog.unread_count;
                    int i4 = this.d;
                    if (i4 == 0 || i2 >= dialog.top_message) {
                        dialog.unread_count = 0;
                    } else {
                        int max = Math.max(i3 - i4, 0);
                        dialog.unread_count = max;
                        if (i2 != Integer.MIN_VALUE && max > (i = dialog.top_message - i2)) {
                            dialog.unread_count = i;
                        }
                    }
                    boolean z = dialog.unread_mark;
                    if (z) {
                        dialog.unread_mark = false;
                        na7Var.getMessagesStorage().C1(dialog.id, false);
                    }
                    if ((i3 != 0 || z) && dialog.unread_count == 0) {
                        j = j2;
                        na7Var.n2(j, 0L, null);
                        if (na7Var.j0()) {
                            na7Var.Y4(null);
                            na7Var.getNotificationCenter().k(3, new Object[0]);
                        }
                    } else {
                        j = j2;
                    }
                    na7Var.getNotificationCenter().k(2, 256);
                } else {
                    j = j2;
                }
                long j3 = j;
                if (!this.f) {
                    na7Var.getNotificationsController().L(null, j3, 0, i2, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j3, 0);
                    na7Var.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    na7Var.getNotificationsController().L(null, j3, 0, i2, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j3, -1);
                    na7Var.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
            default:
                gl.d3(new i67(this.b, this.c, this.d, this.e, this.f, (byte) 0));
                break;
        }
    }
}
