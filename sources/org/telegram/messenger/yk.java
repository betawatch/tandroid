package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class yk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ yk(hp hpVar, long j10, int i3, int i10, boolean z10, int i11) {
        this.a = i11;
        this.b = hpVar;
        this.c = j10;
        this.d = i3;
        this.e = i10;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i3;
        int i10 = this.a;
        cs csVar = this.b;
        switch (i10) {
            case 0:
                hp hpVar = (hp) csVar;
                a0.h hVar = hpVar.R;
                long j11 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                int i11 = this.e;
                if (dialog != null) {
                    int i12 = dialog.unread_count;
                    int i13 = this.d;
                    if (i13 == 0 || i11 >= dialog.top_message) {
                        dialog.unread_count = 0;
                    } else {
                        int max = Math.max(i12 - i13, 0);
                        dialog.unread_count = max;
                        if (i11 != Integer.MIN_VALUE && max > (i3 = dialog.top_message - i11)) {
                            dialog.unread_count = i3;
                        }
                    }
                    boolean z10 = dialog.unread_mark;
                    if (z10) {
                        dialog.unread_mark = false;
                        hpVar.getMessagesStorage().F1(dialog.id, false);
                    }
                    if ((i12 != 0 || z10) && dialog.unread_count == 0) {
                        j10 = j11;
                        hpVar.r2(j10, 0L, null);
                        int i14 = 0;
                        while (true) {
                            mo[] moVarArr = hpVar.N;
                            if (i14 < moVarArr.length) {
                                mo moVar = moVarArr[i14];
                                if (moVar == null || (moVar.g & 64) == 0) {
                                    i14++;
                                } else {
                                    hpVar.T4(null);
                                    hpVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                        }
                    } else {
                        j10 = j11;
                    }
                    hpVar.getNotificationCenter().k(2, 256);
                } else {
                    j10 = j11;
                }
                if (!this.f) {
                    long j12 = j10;
                    hpVar.getNotificationsController().L(null, j12, 0, i11, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j12, 0);
                    hpVar.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    long j13 = j10;
                    hpVar.getNotificationsController().L(null, j13, 0, i11, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j13, -1);
                    hpVar.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
            case 1:
                g0.h3(new yk((hp) csVar, this.c, this.d, this.e, this.f, 0));
                break;
            default:
                int i15 = ChatActivityEnterView.t5;
                ((ChatActivityEnterView) csVar).S0(this.f, this.d, this.e, this.c, false);
                break;
        }
    }

    public /* synthetic */ yk(ChatActivityEnterView chatActivityEnterView, boolean z10, int i3, int i10, long j10) {
        this.a = 2;
        this.b = chatActivityEnterView;
        this.f = z10;
        this.d = i3;
        this.e = i10;
        this.c = j10;
    }
}
