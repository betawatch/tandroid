package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class el implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ el(np npVar, long j3, int i7, int i10, boolean z10, int i11) {
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
        int i10 = this.a;
        is isVar = this.b;
        switch (i10) {
            case 0:
                np npVar = (np) isVar;
                a0.h hVar = npVar.R;
                long j10 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                int i11 = this.e;
                if (dialog != null) {
                    int i12 = dialog.unread_count;
                    int i13 = this.d;
                    if (i13 == 0 || i11 >= dialog.top_message) {
                        dialog.unread_count = 0;
                    } else {
                        int max = Math.max(i12 - i13, 0);
                        dialog.unread_count = max;
                        if (i11 != Integer.MIN_VALUE && max > (i7 = dialog.top_message - i11)) {
                            dialog.unread_count = i7;
                        }
                    }
                    boolean z10 = dialog.unread_mark;
                    if (z10) {
                        dialog.unread_mark = false;
                        npVar.getMessagesStorage().F1(dialog.id, false);
                    }
                    if ((i12 != 0 || z10) && dialog.unread_count == 0) {
                        j3 = j10;
                        npVar.r2(j3, 0L, null);
                        int i14 = 0;
                        while (true) {
                            so[] soVarArr = npVar.N;
                            if (i14 < soVarArr.length) {
                                so soVar = soVarArr[i14];
                                if (soVar == null || (soVar.g & 64) == 0) {
                                    i14++;
                                } else {
                                    npVar.U4(null);
                                    npVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
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
                    npVar.getNotificationsController().L(null, j11, 0, i11, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j11, 0);
                    npVar.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    long j12 = j3;
                    npVar.getNotificationsController().L(null, j12, 0, i11, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j12, -1);
                    npVar.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
            case 1:
                g0.h3(new el((np) isVar, this.c, this.d, this.e, this.f, 0));
                break;
            default:
                int i15 = ChatActivityEnterView.N6;
                ((ChatActivityEnterView) isVar).k1(this.f, this.d, this.e, this.c, false);
                break;
        }
    }

    public /* synthetic */ el(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7, int i10, long j3) {
        this.a = 2;
        this.b = chatActivityEnterView;
        this.f = z10;
        this.d = i7;
        this.e = i10;
        this.c = j3;
    }
}
