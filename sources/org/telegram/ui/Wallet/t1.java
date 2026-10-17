package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.eh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t1(f2 f2Var, Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.b = f2Var;
        this.e = obj;
        this.c = j10;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        final long j10;
        final int i10;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                final eh ehVar = (eh) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final f2 f2Var = this.b;
                m0 m0Var = f2Var.b;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        j10 = this.c;
                        i10 = this.d;
                        if (i11 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i11);
                            i11++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j10 && tonconnectrequest3.msg_id == i10) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j10 && tonconnectrequest.expires > f2Var.f.getCurrentTime()) {
                        final String s10 = m0Var.s();
                        final byte[] bArr = m0Var.x() != null ? (byte[]) m0Var.x().clone() : null;
                        m0Var.y(new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.u1
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj3, Object obj4) {
                                f2 f2Var2 = f2.this;
                                eh ehVar2 = ehVar;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = s10;
                                byte[] bArr2 = bArr;
                                long j11 = j10;
                                int i12 = i10;
                                j0 j0Var = (j0) obj3;
                                String str2 = (String) obj4;
                                f2Var2.getClass();
                                if (j0Var != null && str2 == null) {
                                    j0 b10 = j0Var.b();
                                    Utilities.globalQueue.postRunnable(new gi.d1(f2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new s1(2, b10, ehVar2), j11, i12));
                                } else {
                                    f2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    ehVar2.run(null, str2);
                                }
                            }
                        }, true, false);
                        break;
                    } else {
                        f2Var.h = false;
                        ehVar.run(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    f2Var.h = false;
                    ehVar.run(null, f2.x(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f2 f2Var2 = this.b;
                f2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    callback.run(f2.x(tL_error2, "closeSession"));
                    break;
                } else {
                    f2Var2.d(this.c, this.d, callback);
                    break;
                }
                break;
        }
    }
}
