package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d70;
import org.telegram.ui.j70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o1(e2 e2Var, Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.b = e2Var;
        this.e = obj;
        this.c = j10;
        this.d = i10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        final long j10;
        final int i10;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                final j70 j70Var = (j70) this.e;
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
                        final String t10 = k0Var.t();
                        final byte[] bArr = k0Var.y() != null ? (byte[]) k0Var.y().clone() : null;
                        k0Var.z(new j20() { // from class: org.telegram.ui.Wallet.t1
                            @Override // org.telegram.messenger.j20
                            public final void a(Object obj3, Object obj4) {
                                e2 e2Var2 = e2.this;
                                j70 j70Var2 = j70Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = t10;
                                byte[] bArr2 = bArr;
                                long j11 = j10;
                                int i12 = i10;
                                h0 h0Var = (h0) obj3;
                                String str2 = (String) obj4;
                                e2Var2.getClass();
                                if (h0Var != null && str2 == null) {
                                    h0 b10 = h0Var.b();
                                    Utilities.e.c(new d70(e2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new ih.s(24, b10, j70Var2), j11, i12));
                                } else {
                                    e2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    j70Var2.a(null, str2);
                                }
                            }
                        }, true, false);
                        break;
                    } else {
                        e2Var.h = false;
                        j70Var.a(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    e2Var.h = false;
                    j70Var.a(null, e2.z(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                q20 q20Var = (q20) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2 e2Var2 = this.b;
                e2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    q20Var.a(e2.z(tL_error2, "closeSession"));
                    break;
                } else {
                    e2Var2.e(this.d, this.c, q20Var);
                    break;
                }
                break;
        }
    }
}
