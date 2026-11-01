package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ qj(wp wpVar, long j10, int i10, int i11, boolean z10, int i12) {
        this.a = i12;
        this.b = wpVar;
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
        vs vsVar = this.b;
        switch (i11) {
            case 0:
                wp wpVar = (wp) vsVar;
                a0.h hVar = wpVar.Q;
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
                        wpVar.getMessagesStorage().F1(dialog.id, false);
                    }
                    if ((i13 != 0 || z10) && dialog.unread_count == 0) {
                        j10 = j11;
                        wpVar.q2(j10, 0L, null);
                        int i15 = 0;
                        while (true) {
                            bp[] bpVarArr = wpVar.M;
                            if (i15 < bpVarArr.length) {
                                bp bpVar = bpVarArr[i15];
                                if (bpVar == null || (bpVar.g & 64) == 0) {
                                    i15++;
                                } else {
                                    wpVar.Q4(null);
                                    wpVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                        }
                    } else {
                        j10 = j11;
                    }
                    wpVar.getNotificationCenter().k(2, 256);
                } else {
                    j10 = j11;
                }
                if (!this.f) {
                    long j12 = j10;
                    wpVar.getNotificationsController().L(null, j12, 0, i12, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j12, 0);
                    wpVar.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    long j13 = j10;
                    wpVar.getNotificationsController().L(null, j13, 0, i12, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j13, -1);
                    wpVar.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
            case 1:
                i0.g3(new qj((wp) vsVar, this.c, this.d, this.e, this.f, 0));
                break;
            default:
                int i16 = ChatActivityEnterView.s5;
                ((ChatActivityEnterView) vsVar).R0(this.f, this.d, this.e, this.c, false);
                break;
        }
    }

    public /* synthetic */ qj(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.a = 2;
        this.b = chatActivityEnterView;
        this.f = z10;
        this.d = i10;
        this.e = i11;
        this.c = j10;
    }
}
