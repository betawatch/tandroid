package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m1(c2 c2Var, Object obj, long j10, int i3, int i10) {
        this.a = i10;
        this.b = c2Var;
        this.e = obj;
        this.c = j10;
        this.d = i3;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        final long j10;
        final int i3;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                final f60 f60Var = (f60) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final c2 c2Var = this.b;
                k0 k0Var = c2Var.b;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        j10 = this.c;
                        i3 = this.d;
                        if (i10 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i10);
                            i10++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j10 && tonconnectrequest3.msg_id == i3) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j10 && tonconnectrequest.expires > c2Var.f.getCurrentTime()) {
                        final String t10 = k0Var.t();
                        final byte[] bArr = k0Var.y() != null ? (byte[]) k0Var.y().clone() : null;
                        k0Var.z(new n10() { // from class: org.telegram.ui.Wallet.r1
                            @Override // org.telegram.messenger.n10
                            public final void a(Object obj3, Object obj4) {
                                c2 c2Var2 = c2.this;
                                f60 f60Var2 = f60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = t10;
                                byte[] bArr2 = bArr;
                                long j11 = j10;
                                int i11 = i3;
                                h0 h0Var = (h0) obj3;
                                String str2 = (String) obj4;
                                c2Var2.getClass();
                                if (h0Var != null && str2 == null) {
                                    h0 b10 = h0Var.b();
                                    Utilities.e.c(new ii.b1(c2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new s1(1, b10, f60Var2), j11, i11));
                                } else {
                                    c2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    f60Var2.a(null, str2);
                                }
                            }
                        }, true, false);
                        break;
                    } else {
                        c2Var.h = false;
                        f60Var.a(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    c2Var.h = false;
                    f60Var.a(null, c2.z(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                u10 u10Var = (u10) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c2 c2Var2 = this.b;
                c2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    u10Var.a(c2.z(tL_error2, "closeSession"));
                    break;
                } else {
                    c2Var2.e(this.d, this.c, u10Var);
                    break;
                }
                break;
        }
    }
}
