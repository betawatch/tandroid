package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.l60;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p1(f2 f2Var, Object obj, long j3, int i7, int i10) {
        this.a = i10;
        this.b = f2Var;
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
                final f2 f2Var = this.b;
                n0 n0Var = f2Var.b;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j3 && tonconnectrequest.expires > f2Var.f.getCurrentTime()) {
                        final String t6 = n0Var.t();
                        final byte[] bArr = n0Var.y() != null ? (byte[]) n0Var.y().clone() : null;
                        n0Var.z(new v10() { // from class: org.telegram.ui.Wallet.u1
                            @Override // org.telegram.messenger.v10
                            public final void a(Object obj3, Object obj4) {
                                f2 f2Var2 = f2.this;
                                l60 l60Var2 = l60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = t6;
                                byte[] bArr2 = bArr;
                                long j10 = j3;
                                int i11 = i7;
                                k0 k0Var = (k0) obj3;
                                String str2 = (String) obj4;
                                f2Var2.getClass();
                                if (k0Var != null && str2 == null) {
                                    k0 b10 = k0Var.b();
                                    Utilities.e.c(new hi.a1(f2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new v1(0, b10, l60Var2), j10, i11));
                                } else {
                                    f2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    l60Var2.a(null, str2);
                                }
                            }
                        }, true, false);
                        break;
                    } else {
                        f2Var.h = false;
                        l60Var.a(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    f2Var.h = false;
                    l60Var.a(null, f2.z(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                c20 c20Var = (c20) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f2 f2Var2 = this.b;
                f2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    c20Var.a(f2.z(tL_error2, "closeSession"));
                    break;
                } else {
                    f2Var2.e(this.d, this.c, c20Var);
                    break;
                }
                break;
        }
    }
}
