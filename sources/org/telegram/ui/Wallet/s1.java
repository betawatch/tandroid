package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ih;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s1(e2 e2Var, Object obj, long j10, int i10, int i11) {
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
                final ih ihVar = (ih) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final e2 e2Var = this.b;
                l0 l0Var = e2Var.b;
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
                        final String s10 = l0Var.s();
                        final byte[] bArr = l0Var.x() != null ? (byte[]) l0Var.x().clone() : null;
                        l0Var.y(new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.t1
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj3, Object obj4) {
                                e2 e2Var2 = e2.this;
                                ih ihVar2 = ihVar;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = s10;
                                byte[] bArr2 = bArr;
                                long j11 = j10;
                                int i12 = i10;
                                i0 i0Var = (i0) obj3;
                                String str2 = (String) obj4;
                                e2Var2.getClass();
                                if (i0Var != null && str2 == null) {
                                    i0 b10 = i0Var.b();
                                    Utilities.globalQueue.postRunnable(new gi.d1(e2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new r1(2, b10, ihVar2), j11, i12));
                                } else {
                                    e2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    ihVar2.run(null, str2);
                                }
                            }
                        }, true, false);
                        break;
                    } else {
                        e2Var.h = false;
                        ihVar.run(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    e2Var.h = false;
                    ihVar.run(null, e2.x(tL_error, "getPending"));
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
