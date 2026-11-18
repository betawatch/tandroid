package ci;

import android.os.SystemClock;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.rq;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(fs fsVar, Object obj, boolean z10, int i7) {
        this.a = i7;
        this.c = fsVar;
        this.d = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        boolean z10 = this.b;
        Object obj3 = this.d;
        fs fsVar = this.c;
        switch (i7) {
            case 0:
                o0 o0Var = (o0) fsVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                z0 z0Var = o0Var.b;
                if (o0Var.n == ((int[]) obj3)[0] && !o0Var.F) {
                    o0Var.n = 0;
                    if (tL_exportedNoPaidMessagesToken != null) {
                        int i10 = o0Var.d;
                        if (i10 != 0) {
                            if (z10 == (i10 == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    o0Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                o0Var.f = tL_exportedNoPaidMessagesToken;
                                o0Var.h = SystemClock.elapsedRealtime();
                                z0Var.setFreeLink(o0Var.d(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    } else {
                        String str = tL_error != null ? tL_error.text : null;
                        a8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = o0Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z10) {
                                if (str != null) {
                                    z0Var.getClass();
                                    z0Var.d1(R.drawable.msg_warning, gd.M0(2131751094, null), null);
                                    break;
                                }
                            }
                        }
                        o0Var.d = 0;
                        o0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (!z0Var.w0) {
                            if (str != null) {
                                z0Var.d1(R.drawable.msg_warning, gd.M0(2131751094, null), null);
                                break;
                            }
                        } else {
                            z0Var.U0(str != null ? gd.M0(2131751094, null) : null);
                            break;
                        }
                    }
                }
                break;
            default:
                rq rqVar = (rq) fsVar;
                n8 n8Var = (n8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    rqVar.getClass();
                    if (tL_error2 != null) {
                        n8Var.setChecked(z10);
                        lc.b0(rqVar).g0(tL_error2, false);
                        break;
                    }
                } else {
                    rqVar.getMessagesController().V3(updates, false);
                    break;
                }
                break;
        }
    }
}
