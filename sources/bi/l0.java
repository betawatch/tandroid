package bi;

import android.os.SystemClock;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.nq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(cs csVar, Object obj, boolean z10, int i3) {
        this.a = i3;
        this.c = csVar;
        this.d = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        boolean z10 = this.b;
        Object obj3 = this.d;
        cs csVar = this.c;
        switch (i3) {
            case 0:
                o0 o0Var = (o0) csVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a1 a1Var = o0Var.b;
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
                                a1Var.setFreeLink(o0Var.d(tL_exportedNoPaidMessagesToken));
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
                                    a1Var.getClass();
                                    a1Var.d1(R.drawable.msg_warning, bd.M0(2131751106, null), null);
                                    break;
                                }
                            }
                        }
                        o0Var.d = 0;
                        o0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (!a1Var.w0) {
                            if (str != null) {
                                a1Var.d1(R.drawable.msg_warning, bd.M0(2131751106, null), null);
                                break;
                            }
                        } else {
                            a1Var.U0(str != null ? bd.M0(2131751106, null) : null);
                            break;
                        }
                    }
                }
                break;
            default:
                nq nqVar = (nq) csVar;
                l8 l8Var = (l8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    nqVar.getClass();
                    if (tL_error2 != null) {
                        l8Var.setChecked(z10);
                        fc.a0(nqVar).f0(tL_error2, false);
                        break;
                    }
                } else {
                    nqVar.getMessagesController().O3(updates, false);
                    break;
                }
                break;
        }
    }
}
