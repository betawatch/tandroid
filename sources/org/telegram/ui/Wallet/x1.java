package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.m60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x1(m2 m2Var, Object obj, long j3, int i7, int i10) {
        this.a = i10;
        this.b = m2Var;
        this.e = obj;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.p10
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
                final m2 m2Var = this.b;
                v0 v0Var = m2Var.b;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j3 && tonconnectrequest.expires > m2Var.f.getCurrentTime()) {
                        final String y10 = v0Var.y();
                        final byte[] bArr = v0Var.E() != null ? (byte[]) v0Var.E().clone() : null;
                        v0Var.F(true, false, false, new p10() { // from class: org.telegram.ui.Wallet.c2
                            @Override // org.telegram.messenger.p10
                            public final void a(Object obj3, Object obj4) {
                                m2 m2Var2 = m2.this;
                                m60 m60Var2 = m60Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = y10;
                                byte[] bArr2 = bArr;
                                long j10 = j3;
                                int i11 = i7;
                                s0 s0Var = (s0) obj3;
                                String str2 = (String) obj4;
                                m2Var2.getClass();
                                if (s0Var != null && str2 == null) {
                                    s0 b10 = s0Var.b();
                                    Utilities.e.c(new ki.y0(m2Var2, tonconnectpending2, tonconnectrequest4, b10, str, bArr2, new f0(4, b10, m60Var2), j10, i11));
                                } else {
                                    m2Var2.h = false;
                                    if (str2 == null) {
                                        str2 = "Recovery phrase is unavailable";
                                    }
                                    m60Var2.a(null, str2);
                                }
                            }
                        });
                        break;
                    } else {
                        m2Var.h = false;
                        m60Var.a(null, "This request has expired or has already been answered");
                        break;
                    }
                } else {
                    m2Var.h = false;
                    m60Var.a(null, m2.z(tL_error, "getPending"));
                    break;
                }
                break;
            default:
                w10 w10Var = (w10) this.e;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m2 m2Var2 = this.b;
                m2Var2.getClass();
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    w10Var.a(m2.z(tL_error2, "closeSession"));
                    break;
                } else {
                    m2Var2.e(this.d, this.c, w10Var);
                    break;
                }
                break;
        }
    }
}
