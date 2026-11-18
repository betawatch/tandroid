package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ int c;

    public /* synthetic */ pk(mp mpVar, int i7, int i10) {
        this.a = i10;
        this.b = mpVar;
        this.c = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
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
                mp mpVar = this.b;
                int i13 = this.c;
                if ((mpVar.Y1 == null && mpVar.Z1 == null && !mpVar.W1) || ((i7 = mpVar.X1) != 0 && i13 < i7)) {
                    a0.h hVar = null;
                    Utilities.d.c(new pj(mpVar, hVar, hVar, 2));
                    break;
                }
                break;
            case 2:
                mp mpVar2 = this.b;
                int i14 = this.c;
                if (i14 != 1) {
                    mpVar2.q4(i14);
                    break;
                } else {
                    mpVar2.l0 = false;
                    mpVar2.D();
                    break;
                }
            default:
                final mp mpVar3 = this.b;
                int i15 = this.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a0.h hVar2 = mpVar3.L0;
                int m10 = hVar2.m();
                int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i17 = 0;
                while (i17 < m10) {
                    SparseArray sparseArray = (SparseArray) hVar2.n(i17);
                    if (sparseArray == null) {
                        i10 = i15;
                        j3 = elapsedRealtime;
                    } else {
                        int size = sparseArray.size();
                        int i18 = 0;
                        while (true) {
                            int i19 = 1000;
                            if (i18 < size) {
                                fj fjVar = (fj) sparseArray.valueAt(i18);
                                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) fjVar.k.media).poll;
                                int i20 = poll.close_date;
                                final boolean z10 = (i20 == 0 || poll.closed) ? false : true;
                                if (z10) {
                                    if (i20 <= i15) {
                                        i11 = m10;
                                        int i21 = i16;
                                        if (Math.abs(elapsedRealtime - fjVar.w0) >= i19) {
                                            if (!fjVar.v0 && !z10) {
                                                sparseArray.remove(fjVar.e1());
                                                size--;
                                                i18--;
                                            }
                                            i12 = i15;
                                            j10 = elapsedRealtime;
                                        } else {
                                            fjVar.w0 = elapsedRealtime;
                                            TLRPC.TL_messages_getPollResults tL_messages_getPollResults = new TLRPC.TL_messages_getPollResults();
                                            i12 = i15;
                                            j10 = elapsedRealtime;
                                            tL_messages_getPollResults.peer = mpVar3.l1(fj.B0(fjVar.k));
                                            tL_messages_getPollResults.msg_id = fjVar.e1();
                                            TLRPC.Message message = fjVar.k;
                                            long j11 = 0;
                                            if (message != null && fjVar.D == 17) {
                                                TLRPC.MessageMedia n1 = fj.n1(message);
                                                if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                                                    j11 = ((TLRPC.TL_messageMediaPoll) n1).poll.hash;
                                                }
                                            }
                                            tL_messages_getPollResults.poll_hash = j11;
                                            mpVar3.getConnectionsManager().sendRequest(tL_messages_getPollResults, new RequestDelegate() { // from class: org.telegram.messenger.rk
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    TLRPC.Poll poll2;
                                                    mp mpVar4 = mp.this;
                                                    mpVar4.getClass();
                                                    if (tL_error == null) {
                                                        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                                        if (z10) {
                                                            for (int i22 = 0; i22 < updates.updates.size(); i22++) {
                                                                TLRPC.Update update = updates.updates.get(i22);
                                                                if ((update instanceof TL_update.TL_updateMessagePoll) && (poll2 = ((TL_update.TL_updateMessagePoll) update).poll) != null && !poll2.closed) {
                                                                    mpVar4.N0 = System.currentTimeMillis() - 4000;
                                                                }
                                                            }
                                                        }
                                                        mpVar4.V3(updates, false);
                                                    }
                                                }
                                            });
                                        }
                                        i18++;
                                        m10 = i11;
                                        i16 = i21;
                                        i15 = i12;
                                        elapsedRealtime = j10;
                                    } else {
                                        i16 = Math.min(i16, i20 - i15);
                                    }
                                }
                                i11 = m10;
                                i19 = 30000;
                                int i212 = i16;
                                if (Math.abs(elapsedRealtime - fjVar.w0) >= i19) {
                                }
                                i18++;
                                m10 = i11;
                                i16 = i212;
                                i15 = i12;
                                elapsedRealtime = j10;
                            } else {
                                i10 = i15;
                                j3 = elapsedRealtime;
                                int i22 = m10;
                                if (i16 < 5) {
                                    mpVar3.N0 = Math.min(mpVar3.N0, System.currentTimeMillis() - ((5 - i16) * 1000));
                                }
                                if (sparseArray.size() == 0) {
                                    hVar2.l(hVar2.j(i17));
                                    m10 = i22 - 1;
                                    i17--;
                                } else {
                                    m10 = i22;
                                }
                            }
                        }
                    }
                    i17++;
                    i15 = i10;
                    elapsedRealtime = j3;
                }
                mpVar3.M0 = hVar2.m();
                break;
        }
    }
}
