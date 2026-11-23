package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class co implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ co(np npVar, long j3, int i7, int i10, boolean z10, int i11) {
        this.a = i11;
        this.b = npVar;
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
                g0.g3(new co(this.b, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                np npVar = this.b;
                a0.h hVar = npVar.R;
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
                        npVar.getMessagesStorage().F1(dialog.id, false);
                    }
                    if ((i11 != 0 || z10) && dialog.unread_count == 0) {
                        j3 = j10;
                        npVar.u2(j3, 0L, null);
                        if (npVar.n0()) {
                            npVar.f5(null);
                            npVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    } else {
                        j3 = j10;
                    }
                    npVar.getNotificationCenter().k(2, 256);
                } else {
                    j3 = j10;
                }
                if (!this.f) {
                    long j11 = j3;
                    npVar.getNotificationsController().L(null, j11, 0, i10, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j11, 0);
                    npVar.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    long j12 = j3;
                    npVar.getNotificationsController().L(null, j12, 0, i10, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j12, -1);
                    npVar.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
        }
    }
}
