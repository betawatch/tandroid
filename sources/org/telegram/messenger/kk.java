package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ int c;

    public /* synthetic */ kk(hp hpVar, int i3, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.c = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        int i10;
        long j10;
        int i11;
        int i12;
        long j11;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequestsForGuid(this.c);
                break;
            case 1:
                hp hpVar = this.b;
                int i13 = this.c;
                if ((hpVar.W1 == null && hpVar.X1 == null && !hpVar.U1) || ((i3 = hpVar.V1) != 0 && i13 < i3)) {
                    a0.h hVar = null;
                    Utilities.d.c(new kj(hpVar, hVar, hVar, 2));
                    break;
                }
                break;
            case 2:
                final hp hpVar2 = this.b;
                int i14 = this.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a0.h hVar2 = hpVar2.L0;
                int m10 = hVar2.m();
                int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i16 = 0;
                while (i16 < m10) {
                    SparseArray sparseArray = (SparseArray) hVar2.n(i16);
                    if (sparseArray == null) {
                        i10 = i14;
                        j10 = elapsedRealtime;
                    } else {
                        int size = sparseArray.size();
                        int i17 = 0;
                        while (true) {
                            int i18 = 1000;
                            if (i17 < size) {
                                zi ziVar = (zi) sparseArray.valueAt(i17);
                                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) ziVar.k.media).poll;
                                int i19 = poll.close_date;
                                final boolean z10 = (i19 == 0 || poll.closed) ? false : true;
                                if (z10) {
                                    if (i19 <= i14) {
                                        i11 = m10;
                                        int i20 = i15;
                                        if (Math.abs(elapsedRealtime - ziVar.u0) >= i18) {
                                            if (!ziVar.t0 && !z10) {
                                                sparseArray.remove(ziVar.f1());
                                                size--;
                                                i17--;
                                            }
                                            i12 = i14;
                                            j11 = elapsedRealtime;
                                        } else {
                                            ziVar.u0 = elapsedRealtime;
                                            TLRPC.TL_messages_getPollResults tL_messages_getPollResults = new TLRPC.TL_messages_getPollResults();
                                            i12 = i14;
                                            j11 = elapsedRealtime;
                                            tL_messages_getPollResults.peer = hpVar2.j1(zi.B0(ziVar.k));
                                            tL_messages_getPollResults.msg_id = ziVar.f1();
                                            TLRPC.Message message = ziVar.k;
                                            long j12 = 0;
                                            if (message != null && ziVar.D == 17) {
                                                TLRPC.MessageMedia o12 = zi.o1(message);
                                                if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                                                    j12 = ((TLRPC.TL_messageMediaPoll) o12).poll.hash;
                                                }
                                            }
                                            tL_messages_getPollResults.poll_hash = j12;
                                            hpVar2.getConnectionsManager().sendRequest(tL_messages_getPollResults, new RequestDelegate() { // from class: org.telegram.messenger.uk
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    TLRPC.Poll poll2;
                                                    hp hpVar3 = hp.this;
                                                    hpVar3.getClass();
                                                    if (tL_error == null) {
                                                        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                                        if (z10) {
                                                            for (int i21 = 0; i21 < updates.updates.size(); i21++) {
                                                                TLRPC.Update update = updates.updates.get(i21);
                                                                if ((update instanceof TL_update.TL_updateMessagePoll) && (poll2 = ((TL_update.TL_updateMessagePoll) update).poll) != null && !poll2.closed) {
                                                                    hpVar3.N0 = System.currentTimeMillis() - 4000;
                                                                }
                                                            }
                                                        }
                                                        hpVar3.O3(updates, false);
                                                    }
                                                }
                                            });
                                        }
                                        i17++;
                                        m10 = i11;
                                        i15 = i20;
                                        i14 = i12;
                                        elapsedRealtime = j11;
                                    } else {
                                        i15 = Math.min(i15, i19 - i14);
                                    }
                                }
                                i11 = m10;
                                i18 = 30000;
                                int i202 = i15;
                                if (Math.abs(elapsedRealtime - ziVar.u0) >= i18) {
                                }
                                i17++;
                                m10 = i11;
                                i15 = i202;
                                i14 = i12;
                                elapsedRealtime = j11;
                            } else {
                                i10 = i14;
                                j10 = elapsedRealtime;
                                int i21 = m10;
                                if (i15 < 5) {
                                    hpVar2.N0 = Math.min(hpVar2.N0, System.currentTimeMillis() - ((5 - i15) * 1000));
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
                    elapsedRealtime = j10;
                }
                hpVar2.M0 = hVar2.m();
                break;
            default:
                hp hpVar3 = this.b;
                int i22 = this.c;
                if (i22 != 1) {
                    hpVar3.i4(i22);
                    break;
                } else {
                    hpVar3.l0 = false;
                    hpVar3.D();
                    break;
                }
        }
    }
}
