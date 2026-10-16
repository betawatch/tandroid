package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r1(e2 e2Var, Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.b = e2Var;
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
                final mh mhVar = (mh) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final e2 e2Var = this.b;
                k0 k0Var = e2Var.b;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j10 && tonconnectrequest.expires > e2Var.f.getCurrentTime()) {
                        final String r10 = k0Var.r();
                        final byte[] bArr = k0Var.w() != null ? (byte[]) k0Var.w().clone() : null;
                        k0Var.x(new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.s1
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj3, Object obj4) {
                                e2 e2Var2 = e2.this;
                                mh mhVar2 = mhVar;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = r10;
                                byte[] bArr2 = bArr;
                                long j11 = j10;
                                int i12 = i10;
                                h0 h0Var = (h0) obj3;
                                String str2 = (String) obj4;
                                e2Var2.getClass();
                                if (h0Var != null && str2 == null) {
                                    h0 b10 = h0Var.b();
                                    Utilities.globalQueue.postRunnable(new fi.f1(e2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new bi.f0(27, b10, mhVar2), j11, i12));
                                } else {
                                    e2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    mhVar2.run(null, str2);
                                }
                            }
                        }, true, false);
                        break;
                    } else {
                        e2Var.h = false;
                        mhVar.run(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    e2Var.h = false;
                    mhVar.run(null, e2.x(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2 e2Var2 = this.b;
                e2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    callback.run(e2.x(tL_error2, "closeSession"));
                    break;
                } else {
                    e2Var2.d(this.c, this.d, callback);
                    break;
                }
                break;
        }
    }
}
