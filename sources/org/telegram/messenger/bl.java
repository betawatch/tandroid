package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ int c;

    public /* synthetic */ bl(vp vpVar, int i10, int i11) {
        this.a = i11;
        this.b = vpVar;
        this.c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        long j11;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequestsForGuid(this.c);
                break;
            case 1:
                vp vpVar = this.b;
                int i14 = this.c;
                if ((vpVar.V1 == null && vpVar.W1 == null && !vpVar.T1) || ((i10 = vpVar.U1) != 0 && i14 < i10)) {
                    a0.h hVar = null;
                    Utilities.d.c(new xj(vpVar, hVar, hVar, 2));
                    break;
                }
                break;
            case 2:
                vp vpVar2 = this.b;
                int i15 = this.c;
                if (i15 != 1) {
                    vpVar2.f4(i15);
                    break;
                } else {
                    vpVar2.k0 = false;
                    vpVar2.D();
                    break;
                }
            default:
                final vp vpVar3 = this.b;
                int i16 = this.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a0.h hVar2 = vpVar3.K0;
                int m10 = hVar2.m();
                int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i18 = 0;
                while (i18 < m10) {
                    SparseArray sparseArray = (SparseArray) hVar2.n(i18);
                    if (sparseArray == null) {
                        i11 = i16;
                        j10 = elapsedRealtime;
                    } else {
                        int size = sparseArray.size();
                        int i19 = 0;
                        while (true) {
                            int i20 = 1000;
                            if (i19 < size) {
                                jj jjVar = (jj) sparseArray.valueAt(i19);
                                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) jjVar.k.media).poll;
                                int i21 = poll.close_date;
                                final boolean z10 = (i21 == 0 || poll.closed) ? false : true;
                                if (z10) {
                                    if (i21 <= i16) {
                                        i12 = m10;
                                        int i22 = i17;
                                        if (Math.abs(elapsedRealtime - jjVar.u0) >= i20) {
                                            if (!jjVar.t0 && !z10) {
                                                sparseArray.remove(jjVar.f1());
                                                size--;
                                                i19--;
                                            }
                                            i13 = i16;
                                            j11 = elapsedRealtime;
                                        } else {
                                            jjVar.u0 = elapsedRealtime;
                                            TLRPC.TL_messages_getPollResults tL_messages_getPollResults = new TLRPC.TL_messages_getPollResults();
                                            i13 = i16;
                                            j11 = elapsedRealtime;
                                            tL_messages_getPollResults.peer = vpVar3.i1(jj.B0(jjVar.k));
                                            tL_messages_getPollResults.msg_id = jjVar.f1();
                                            TLRPC.Message message = jjVar.k;
                                            long j12 = 0;
                                            if (message != null && jjVar.D == 17) {
                                                TLRPC.MessageMedia o12 = jj.o1(message);
                                                if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                                                    j12 = ((TLRPC.TL_messageMediaPoll) o12).poll.hash;
                                                }
                                            }
                                            tL_messages_getPollResults.poll_hash = j12;
                                            vpVar3.getConnectionsManager().sendRequest(tL_messages_getPollResults, new RequestDelegate() { // from class: org.telegram.messenger.hk
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    TLRPC.Poll poll2;
                                                    vp vpVar4 = vp.this;
                                                    vpVar4.getClass();
                                                    if (tL_error == null) {
                                                        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                                        if (z10) {
                                                            for (int i23 = 0; i23 < updates.updates.size(); i23++) {
                                                                TLRPC.Update update = updates.updates.get(i23);
                                                                if ((update instanceof TL_update.TL_updateMessagePoll) && (poll2 = ((TL_update.TL_updateMessagePoll) update).poll) != null && !poll2.closed) {
                                                                    vpVar4.M0 = System.currentTimeMillis() - 4000;
                                                                }
                                                            }
                                                        }
                                                        vpVar4.L3(updates, false);
                                                    }
                                                }
                                            });
                                        }
                                        i19++;
                                        m10 = i12;
                                        i17 = i22;
                                        i16 = i13;
                                        elapsedRealtime = j11;
                                    } else {
                                        i17 = Math.min(i17, i21 - i16);
                                    }
                                }
                                i12 = m10;
                                i20 = 30000;
                                int i222 = i17;
                                if (Math.abs(elapsedRealtime - jjVar.u0) >= i20) {
                                }
                                i19++;
                                m10 = i12;
                                i17 = i222;
                                i16 = i13;
                                elapsedRealtime = j11;
                            } else {
                                i11 = i16;
                                j10 = elapsedRealtime;
                                int i23 = m10;
                                if (i17 < 5) {
                                    vpVar3.M0 = Math.min(vpVar3.M0, System.currentTimeMillis() - ((5 - i17) * 1000));
                                }
                                if (sparseArray.size() == 0) {
                                    hVar2.l(hVar2.j(i18));
                                    m10 = i23 - 1;
                                    i18--;
                                } else {
                                    m10 = i23;
                                }
                            }
                        }
                    }
                    i18++;
                    i16 = i11;
                    elapsedRealtime = j10;
                }
                vpVar3.L0 = hVar2.m();
                break;
        }
    }
}
