package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class pj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ pj(vp vpVar, long j10, int i10, int i11, boolean z10, int i12) {
        this.a = i12;
        this.b = vpVar;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i10;
        int i11 = this.a;
        us usVar = this.b;
        switch (i11) {
            case 0:
                vp vpVar = (vp) usVar;
                a0.h hVar = vpVar.Q;
                long j11 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                int i12 = this.e;
                if (dialog != null) {
                    int i13 = dialog.unread_count;
                    int i14 = this.d;
                    if (i14 == 0 || i12 >= dialog.top_message) {
                        dialog.unread_count = 0;
                    } else {
                        int max = Math.max(i13 - i14, 0);
                        dialog.unread_count = max;
                        if (i12 != Integer.MIN_VALUE && max > (i10 = dialog.top_message - i12)) {
                            dialog.unread_count = i10;
                        }
                    }
                    boolean z10 = dialog.unread_mark;
                    if (z10) {
                        dialog.unread_mark = false;
                        vpVar.getMessagesStorage().F1(dialog.id, false);
                    }
                    if ((i13 != 0 || z10) && dialog.unread_count == 0) {
                        j10 = j11;
                        vpVar.q2(j10, 0L, null);
                        int i15 = 0;
                        while (true) {
                            ap[] apVarArr = vpVar.M;
                            if (i15 < apVarArr.length) {
                                ap apVar = apVarArr[i15];
                                if (apVar == null || (apVar.g & 64) == 0) {
                                    i15++;
                                } else {
                                    vpVar.Q4(null);
                                    vpVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                        }
                    } else {
                        j10 = j11;
                    }
                    vpVar.getNotificationCenter().k(2, 256);
                } else {
                    j10 = j11;
                }
                if (!this.f) {
                    long j12 = j10;
                    vpVar.getNotificationsController().L(null, j12, 0, i12, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j12, 0);
                    vpVar.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    long j13 = j10;
                    vpVar.getNotificationsController().L(null, j13, 0, i12, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j13, -1);
                    vpVar.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
            case 1:
                i0.g3(new pj((vp) usVar, this.c, this.d, this.e, this.f, 0));
                break;
            default:
                int i16 = ChatActivityEnterView.s5;
                ((ChatActivityEnterView) usVar).R0(this.f, this.d, this.e, this.c, false);
                break;
        }
    }

    public /* synthetic */ pj(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.a = 2;
        this.b = chatActivityEnterView;
        this.f = z10;
        this.d = i10;
        this.e = i11;
        this.c = j10;
    }
}
