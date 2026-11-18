package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.m60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w1(l2 l2Var, Object obj, long j3, int i7, int i10) {
        this.a = i10;
        this.b = l2Var;
        this.e = obj;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        final long j3;
        final int i7;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                final m60 m60Var = (m60) this.e;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final l2 l2Var = this.b;
                u0 u0Var = l2Var.b;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j3 && tonconnectrequest.expires > l2Var.f.getCurrentTime()) {
                        final String y10 = u0Var.y();
                        final byte[] bArr = u0Var.E() != null ? (byte[]) u0Var.E().clone() : null;
                        u0Var.F(true, false, false, new q10() { // from class: org.telegram.ui.Wallet.b2
                            @Override // org.telegram.messenger.q10
                            public final void a(Object obj3, Object obj4) {
                                l2 l2Var2 = l2.this;
                                m60 m60Var2 = m60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = y10;
                                byte[] bArr2 = bArr;
                                long j10 = j3;
                                int i11 = i7;
                                r0 r0Var = (r0) obj3;
                                String str2 = (String) obj4;
                                l2Var2.getClass();
                                if (r0Var != null && str2 == null) {
                                    r0 b10 = r0Var.b();
                                    Utilities.e.c(new ki.z0(l2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new e0(4, b10, m60Var2), j10, i11));
                                } else {
                                    l2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    m60Var2.a(null, str2);
                                }
                            }
                        });
                        break;
                    } else {
                        l2Var.h = false;
                        m60Var.a(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    l2Var.h = false;
                    m60Var.a(null, l2.z(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                x10 x10Var = (x10) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l2 l2Var2 = this.b;
                l2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    x10Var.a(l2.z(tL_error2, "closeSession"));
                    break;
                } else {
                    l2Var2.e(this.d, this.c, x10Var);
                    break;
                }
                break;
        }
    }
}
