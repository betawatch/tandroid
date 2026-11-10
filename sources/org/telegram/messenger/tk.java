package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ int c;

    public /* synthetic */ tk(qp qpVar, int i7, int i10) {
        this.a = i10;
        this.b = qpVar;
        this.c = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int i10;
        long j3;
        int i11;
        int i12;
        long j10;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequestsForGuid(this.c);
                break;
            case 1:
                qp qpVar = this.b;
                int i13 = this.c;
                if ((qpVar.V1 == null && qpVar.W1 == null && !qpVar.T1) || ((i7 = qpVar.U1) != 0 && i13 < i7)) {
                    a0.h hVar = null;
                    Utilities.d.c(new tj(qpVar, hVar, hVar, 2));
                    break;
                }
                break;
            case 2:
                final qp qpVar2 = this.b;
                int i14 = this.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a0.h hVar2 = qpVar2.K0;
                int m10 = hVar2.m();
                int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i16 = 0;
                while (i16 < m10) {
                    SparseArray sparseArray = (SparseArray) hVar2.n(i16);
                    if (sparseArray == null) {
                        i10 = i14;
                        j3 = elapsedRealtime;
                    } else {
                        int size = sparseArray.size();
                        int i17 = 0;
                        while (true) {
                            int i18 = 1000;
                            if (i17 < size) {
                                ij ijVar = (ij) sparseArray.valueAt(i17);
                                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) ijVar.k.media).poll;
                                int i19 = poll.close_date;
                                final boolean z9 = (i19 == 0 || poll.closed) ? false : true;
                                if (z9) {
                                    if (i19 <= i14) {
                                        i11 = m10;
                                        int i20 = i15;
                                        if (Math.abs(elapsedRealtime - ijVar.u0) >= i18) {
                                            if (!ijVar.t0 && !z9) {
                                                sparseArray.remove(ijVar.e1());
                                                size--;
                                                i17--;
                                            }
                                            i12 = i14;
                                            j10 = elapsedRealtime;
                                        } else {
                                            ijVar.u0 = elapsedRealtime;
                                            TLRPC.TL_messages_getPollResults tL_messages_getPollResults = new TLRPC.TL_messages_getPollResults();
                                            i12 = i14;
                                            j10 = elapsedRealtime;
                                            tL_messages_getPollResults.peer = qpVar2.j1(ij.B0(ijVar.k));
                                            tL_messages_getPollResults.msg_id = ijVar.e1();
                                            TLRPC.Message message = ijVar.k;
                                            long j11 = 0;
                                            if (message != null && ijVar.D == 17) {
                                                TLRPC.MessageMedia n1 = ij.n1(message);
                                                if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                                                    j11 = ((TLRPC.TL_messageMediaPoll) n1).poll.hash;
                                                }
                                            }
                                            tL_messages_getPollResults.poll_hash = j11;
                                            qpVar2.getConnectionsManager().sendRequest(tL_messages_getPollResults, new RequestDelegate() { // from class: org.telegram.messenger.dl
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    TLRPC.Poll poll2;
                                                    qp qpVar3 = qp.this;
                                                    qpVar3.getClass();
                                                    if (tL_error == null) {
                                                        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                                        if (z9) {
                                                            for (int i21 = 0; i21 < updates.updates.size(); i21++) {
                                                                TLRPC.Update update = updates.updates.get(i21);
                                                                if ((update instanceof TL_update.TL_updateMessagePoll) && (poll2 = ((TL_update.TL_updateMessagePoll) update).poll) != null && !poll2.closed) {
                                                                    qpVar3.M0 = System.currentTimeMillis() - 4000;
                                                                }
                                                            }
                                                        }
                                                        qpVar3.O3(updates, false);
                                                    }
                                                }
                                            });
                                        }
                                        i17++;
                                        m10 = i11;
                                        i15 = i20;
                                        i14 = i12;
                                        elapsedRealtime = j10;
                                    } else {
                                        i15 = Math.min(i15, i19 - i14);
                                    }
                                }
                                i11 = m10;
                                i18 = 30000;
                                int i202 = i15;
                                if (Math.abs(elapsedRealtime - ijVar.u0) >= i18) {
                                }
                                i17++;
                                m10 = i11;
                                i15 = i202;
                                i14 = i12;
                                elapsedRealtime = j10;
                            } else {
                                i10 = i14;
                                j3 = elapsedRealtime;
                                int i21 = m10;
                                if (i15 < 5) {
                                    qpVar2.M0 = Math.min(qpVar2.M0, System.currentTimeMillis() - ((5 - i15) * 1000));
                                }
                                if (sparseArray.size() == 0) {
                                    hVar2.l(hVar2.j(i16));
                                    m10 = i21 - 1;
                                    i16--;
                                } else {
                                    m10 = i21;
                                }
                            }
                        }
                    }
                    i16++;
                    i14 = i10;
                    elapsedRealtime = j3;
                }
                qpVar2.L0 = hVar2.m();
                break;
            default:
                qp qpVar3 = this.b;
                int i22 = this.c;
                if (i22 != 1) {
                    qpVar3.i4(i22);
                    break;
                } else {
                    qpVar3.k0 = false;
                    qpVar3.D();
                    break;
                }
        }
    }
}
