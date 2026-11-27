// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class i87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ i87(uc7 uc7Var, long j, int i, boolean z, int i2, int i3, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.h = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        switch (this.a) {
            case 0:
                hl.c3(new i87(this.b, this.c, this.d, this.e, this.f, this.h, (byte) 1));
                break;
            default:
                uc7 uc7Var = this.b;
                ip7 notificationsController = uc7Var.getNotificationsController();
                long j = this.c;
                notificationsController.L(null, j, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) uc7Var.R.f(j);
                if (dialog != null) {
                    int i2 = dialog.unread_count;
                    int i3 = this.f;
                    if (i3 != 0) {
                        int i4 = dialog.top_message;
                        int i5 = this.h;
                        if (i5 > i4) {
                            int max = Math.max(i2 - i3, 0);
                            dialog.unread_count = max;
                            if (i5 != Integer.MAX_VALUE && max > (i = i5 - dialog.top_message)) {
                                dialog.unread_count = i;
                            }
                            z = dialog.unread_mark;
                            if (z) {
                                dialog.unread_mark = false;
                                uc7Var.getMessagesStorage().C1(dialog.id, false);
                            }
                            if ((i2 == 0 || z) && dialog.unread_count == 0) {
                                uc7Var.p2(j, 0L, null);
                                if (uc7Var.l0()) {
                                    uc7Var.h5(null);
                                    uc7Var.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            uc7Var.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z = dialog.unread_mark;
                    if (z) {
                    }
                    if (i2 == 0) {
                    }
                    uc7Var.p2(j, 0L, null);
                    if (uc7Var.l0()) {
                    }
                    uc7Var.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j, 0);
                uc7Var.getNotificationsController().J(longSparseIntArray);
                break;
        }
    }
}
