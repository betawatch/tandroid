package ci;

import android.os.SystemClock;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.qq;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ is c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k0(is isVar, Object obj, boolean z10, int i7) {
        this.a = i7;
        this.c = isVar;
        this.d = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        boolean z10 = this.b;
        Object obj3 = this.d;
        is isVar = this.c;
        switch (i7) {
            case 0:
                n0 n0Var = (n0) isVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                z0 z0Var = n0Var.b;
                if (n0Var.n == ((int[]) obj3)[0] && !n0Var.F) {
                    n0Var.n = 0;
                    if (tL_exportedNoPaidMessagesToken != null) {
                        int i10 = n0Var.d;
                        if (i10 != 0) {
                            if (z10 == (i10 == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    n0Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                n0Var.f = tL_exportedNoPaidMessagesToken;
                                n0Var.h = SystemClock.elapsedRealtime();
                                z0Var.setFreeLink(n0Var.d(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    } else {
                        String str = tL_error != null ? tL_error.text : null;
                        a8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = n0Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z10) {
                                if (str != null) {
                                    z0Var.getClass();
                                    z0Var.d1(R.drawable.msg_warning, hd.M0(2131751105, null), null);
                                    break;
                                }
                            }
                        }
                        n0Var.d = 0;
                        n0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (!z0Var.w0) {
                            if (str != null) {
                                z0Var.d1(R.drawable.msg_warning, hd.M0(2131751105, null), null);
                                break;
                            }
                        } else {
                            z0Var.U0(str != null ? hd.M0(2131751105, null) : null);
                            break;
                        }
                    }
                }
                break;
            default:
                qq qqVar = (qq) isVar;
                l8 l8Var = (l8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    qqVar.getClass();
                    if (tL_error2 != null) {
                        l8Var.setChecked(z10);
                        cc.a0(qqVar).f0(tL_error2, false);
                        break;
                    }
                } else {
                    qqVar.getMessagesController().O3(updates, false);
                    break;
                }
                break;
        }
    }
}
