// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class i87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ i87(oc7 oc7Var, long j, int i, int i2, boolean z, byte b) {
        this.a = b;
        this.b = oc7Var;
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
                oc7 oc7Var = this.b;
                vh6 vh6Var = oc7Var.R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) vh6Var.f(j2);
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
                        oc7Var.getMessagesStorage().C1(dialog.id, false);
                    }
                    if ((i3 != 0 || z) && dialog.unread_count == 0) {
                        j = j2;
                        oc7Var.o2(j, 0L, null);
                        if (oc7Var.j0()) {
                            oc7Var.b5(null);
                            oc7Var.getNotificationCenter().k(3, new Object[0]);
                        }
                    } else {
                        j = j2;
                    }
                    oc7Var.getNotificationCenter().k(2, 256);
                } else {
                    j = j2;
                }
                long j3 = j;
                if (!this.f) {
                    oc7Var.getNotificationsController().L(null, j3, 0, i2, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j3, 0);
                    oc7Var.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    oc7Var.getNotificationsController().L(null, j3, 0, i2, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j3, -1);
                    oc7Var.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
            default:
                gm.c3(new i87(this.b, this.c, this.d, this.e, this.f, (byte) 0));
                break;
        }
    }
}
