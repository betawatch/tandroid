package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q1(d2 d2Var, Object obj, long j3, int i10, int i11) {
        this.a = i11;
        this.b = d2Var;
        this.e = obj;
        this.c = j3;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        final long j3;
        final int i10;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                final jh jhVar = (jh) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final d2 d2Var = this.b;
                k0 k0Var = d2Var.b;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        j3 = this.c;
                        i10 = this.d;
                        if (i11 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i11);
                            i11++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j3 && tonconnectrequest3.msg_id == i10) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j3 && tonconnectrequest.expires > d2Var.f.getCurrentTime()) {
                        final String r10 = k0Var.r();
                        final byte[] bArr = k0Var.w() != null ? (byte[]) k0Var.w().clone() : null;
                        k0Var.x(new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.r1
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj3, Object obj4) {
                                d2 d2Var2 = d2.this;
                                jh jhVar2 = jhVar;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = r10;
                                byte[] bArr2 = bArr;
                                long j10 = j3;
                                int i12 = i10;
                                h0 h0Var = (h0) obj3;
                                String str2 = (String) obj4;
                                d2Var2.getClass();
                                if (h0Var != null && str2 == null) {
                                    h0 b10 = h0Var.b();
                                    Utilities.globalQueue.postRunnable(new ei.g1(d2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new ai.m0(27, b10, jhVar2), j10, i12));
                                } else {
                                    d2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    jhVar2.run(null, str2);
                                }
                            }
                        }, true, false);
                        break;
                    } else {
                        d2Var.h = false;
                        jhVar.run(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    d2Var.h = false;
                    jhVar.run(null, d2.x(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2 d2Var2 = this.b;
                d2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    callback.run(d2.x(tL_error2, "closeSession"));
                    break;
                } else {
                    d2Var2.d(this.c, this.d, callback);
                    break;
                }
                break;
        }
    }
}
