package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.us c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nq(org.telegram.messenger.us usVar, Object obj, boolean z10, int i10) {
        this.a = i10;
        this.c = usVar;
        this.d = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        boolean z10 = this.b;
        Object obj3 = this.d;
        org.telegram.messenger.us usVar = this.c;
        switch (i10) {
            case 0:
                pr prVar = (pr) usVar;
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    prVar.getClass();
                    if (tL_error != null) {
                        p8Var.setChecked(z10);
                        org.telegram.ui.Components.cc.a0(prVar).f0(tL_error, false);
                        break;
                    }
                } else {
                    prVar.getMessagesController().L3(updates, false);
                    break;
                }
                break;
            default:
                qh.m0 m0Var = (qh.m0) usVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                qh.x0 x0Var = m0Var.b;
                if (m0Var.n == ((int[]) obj3)[0] && !m0Var.E) {
                    m0Var.n = 0;
                    if (tL_exportedNoPaidMessagesToken != null) {
                        int i11 = m0Var.d;
                        if (i11 != 0) {
                            if (z10 == (i11 == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    m0Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                m0Var.f = tL_exportedNoPaidMessagesToken;
                                m0Var.h = SystemClock.elapsedRealtime();
                                x0Var.setFreeLink(m0Var.d(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    } else {
                        String str = tL_error2 != null ? tL_error2.text : null;
                        org.telegram.messenger.f8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = m0Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z10) {
                                if (str != null) {
                                    x0Var.getClass();
                                    x0Var.d1(R.drawable.msg_warning, org.telegram.messenger.cd.L0(2131751106, null), null);
                                    break;
                                }
                            }
                        }
                        m0Var.d = 0;
                        m0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (!x0Var.v0) {
                            if (str != null) {
                                x0Var.d1(R.drawable.msg_warning, org.telegram.messenger.cd.L0(2131751106, null), null);
                                break;
                            }
                        } else {
                            x0Var.U0(str != null ? org.telegram.messenger.cd.L0(2131751106, null) : null);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
