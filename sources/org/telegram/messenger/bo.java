package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class bo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ bo(mp mpVar, long j3, int i7, int i10, boolean z10, int i11) {
        this.a = i11;
        this.b = mpVar;
        this.c = j3;
        this.d = i7;
        this.e = i10;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        int i7;
        switch (this.a) {
            case 0:
                g0.g3(new bo(this.b, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                mp mpVar = this.b;
                a0.h hVar = mpVar.R;
                long j10 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                int i10 = this.e;
                if (dialog != null) {
                    int i11 = dialog.unread_count;
                    int i12 = this.d;
                    if (i12 == 0 || i10 >= dialog.top_message) {
                        dialog.unread_count = 0;
                    } else {
                        int max = Math.max(i11 - i12, 0);
                        dialog.unread_count = max;
                        if (i10 != Integer.MIN_VALUE && max > (i7 = dialog.top_message - i10)) {
                            dialog.unread_count = i7;
                        }
                    }
                    boolean z10 = dialog.unread_mark;
                    if (z10) {
                        dialog.unread_mark = false;
                        mpVar.getMessagesStorage().F1(dialog.id, false);
                    }
                    if ((i11 != 0 || z10) && dialog.unread_count == 0) {
                        j3 = j10;
                        mpVar.u2(j3, 0L, null);
                        if (mpVar.n0()) {
                            mpVar.f5(null);
                            mpVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    } else {
                        j3 = j10;
                    }
                    mpVar.getNotificationCenter().k(2, 256);
                } else {
                    j3 = j10;
                }
                if (!this.f) {
                    long j11 = j3;
                    mpVar.getNotificationsController().L(null, j11, 0, i10, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j11, 0);
                    mpVar.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    long j12 = j3;
                    mpVar.getNotificationsController().L(null, j12, 0, i10, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j12, -1);
                    mpVar.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
        }
    }
}
