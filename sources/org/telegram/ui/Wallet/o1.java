package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.l60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o1(e2 e2Var, Object obj, long j3, int i7, int i10) {
        this.a = i10;
        this.b = e2Var;
        this.e = obj;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        final long j3;
        final int i7;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                final l60 l60Var = (l60) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final e2 e2Var = this.b;
                m0 m0Var = e2Var.b;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        j3 = this.c;
                        i7 = this.d;
                        if (i10 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i10);
                            i10++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j3 && tonconnectrequest3.msg_id == i7) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j3 && tonconnectrequest.expires > e2Var.f.getCurrentTime()) {
                        final String t6 = m0Var.t();
                        final byte[] bArr = m0Var.y() != null ? (byte[]) m0Var.y().clone() : null;
                        m0Var.z(new v10() { // from class: org.telegram.ui.Wallet.t1
                            @Override // org.telegram.messenger.v10
                            public final void a(Object obj3, Object obj4) {
                                e2 e2Var2 = e2.this;
                                l60 l60Var2 = l60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = t6;
                                byte[] bArr2 = bArr;
                                long j10 = j3;
                                int i11 = i7;
                                j0 j0Var = (j0) obj3;
                                String str2 = (String) obj4;
                                e2Var2.getClass();
                                if (j0Var != null && str2 == null) {
                                    j0 b10 = j0Var.b();
                                    Utilities.e.c(new hi.a1(e2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new u1(0, b10, l60Var2), j10, i11));
                                } else {
                                    e2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    l60Var2.a(null, str2);
                                }
                            }
                        }, true, false);
                        break;
                    } else {
                        e2Var.h = false;
                        l60Var.a(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    e2Var.h = false;
                    l60Var.a(null, e2.z(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                c20 c20Var = (c20) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2 e2Var2 = this.b;
                e2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    c20Var.a(e2.z(tL_error2, "closeSession"));
                    break;
                } else {
                    e2Var2.e(this.d, this.c, c20Var);
                    break;
                }
                break;
        }
    }
}
