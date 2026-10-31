package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ vj(vp vpVar, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.a = i13;
        this.b = vpVar;
        this.c = j10;
        this.d = i10;
        this.e = z10;
        this.f = i11;
        this.h = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        ap[] apVarArr;
        int i11;
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                ot notificationsController = vpVar.getNotificationsController();
                long j10 = this.c;
                notificationsController.L(null, j10, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) vpVar.Q.f(j10);
                if (dialog != null) {
                    int i12 = dialog.unread_count;
                    int i13 = this.f;
                    if (i13 != 0) {
                        int i14 = dialog.top_message;
                        int i15 = this.h;
                        if (i15 > i14) {
                            int max = Math.max(i12 - i13, 0);
                            dialog.unread_count = max;
                            if (i15 != Integer.MAX_VALUE && max > (i11 = i15 - dialog.top_message)) {
                                dialog.unread_count = i11;
                            }
                            z10 = dialog.unread_mark;
                            if (z10) {
                                dialog.unread_mark = false;
                                vpVar.getMessagesStorage().F1(dialog.id, false);
                            }
                            if ((i12 == 0 || z10) && dialog.unread_count == 0) {
                                vpVar.q2(j10, 0L, null);
                                i10 = 0;
                                while (true) {
                                    apVarArr = vpVar.M;
                                    if (i10 < apVarArr.length) {
                                        ap apVar = apVarArr[i10];
                                        if (apVar == null || (apVar.g & 64) == 0) {
                                            i10++;
                                        } else {
                                            vpVar.Q4(null);
                                            vpVar.getNotificationCenter().k(3, new Object[0]);
                                        }
                                    }
                                }
                            }
                            vpVar.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z10 = dialog.unread_mark;
                    if (z10) {
                    }
                    if (i12 == 0) {
                    }
                    vpVar.q2(j10, 0L, null);
                    i10 = 0;
                    while (true) {
                        apVarArr = vpVar.M;
                        if (i10 < apVarArr.length) {
                        }
                        i10++;
                    }
                    vpVar.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j10, 0);
                vpVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                i0.g3(new vj(this.b, this.c, this.d, this.e, this.f, this.h, 0));
                break;
        }
    }
}
