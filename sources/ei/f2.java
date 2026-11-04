package ei;

import gi.qa;
import gi.va;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.r10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.e51;
import org.telegram.ui.mv;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    @Override // org.telegram.messenger.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        mv mvVar;
        org.telegram.ui.ActionBar.d2 d2Var;
        org.telegram.ui.ActionBar.q4 parentLayout;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.b;
                va vaVar = (va) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                r9 r9Var = j4Var.t0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    i4 i4Var = j4Var.w2;
                    if (i4Var == null || ((q9) i4Var.c) != null) {
                        q9 q9Var = (q9) i4Var.c;
                        q9Var.firstFrameRendered = false;
                        i4Var.a = false;
                        q9Var.setOnReadyListener(new i2(0, currentTimeMillis, runnable));
                        ((i9) j4Var.A1).g(false);
                        fh0 fh0Var = j4Var.j0;
                        if (fh0Var != null) {
                            fh0Var.setAnimation(j4Var.h1.u);
                        }
                        if (j4Var.B2 > 0 && l10.longValue() > j4Var.B2 - 1400) {
                            l10 = 0L;
                        }
                        j4Var.R0(l10.longValue(), true);
                        j4Var.E3 = false;
                        org.telegram.messenger.g0.i3(runnable, 400L);
                        if (bool.booleanValue()) {
                            j4Var.d1(false);
                            break;
                        }
                    } else {
                        ((i9) j4Var.A1).g(false);
                        j4Var.setActive(true);
                        j4Var.E3 = false;
                        j4Var.S0 = new h2(0, runnable);
                        if (bool.booleanValue()) {
                            j4Var.d1(false);
                        }
                        org.telegram.messenger.g0.i3(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.d2 d2Var2 = r9Var.f;
                    if (d2Var2 != null && (parentLayout = d2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) fragmentStack.get(size);
                            if (d2Var3 instanceof uw) {
                                uw uwVar = (uw) d2Var3;
                                uwVar.W3();
                                mvVar = uwVar.F0;
                                r3 = mvVar != null ? mvVar.e(l11.longValue()) : null;
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.d2) arrayList.get(i3), false);
                                }
                                d2Var = r9Var.f;
                                if (d2Var != null) {
                                    d2Var.clearSheets();
                                }
                                r9Var.J();
                                j4Var.E3 = false;
                                if (mvVar != null || !mvVar.k(l11.longValue())) {
                                    vaVar.X(qa.c(r3));
                                    org.telegram.messenger.g0.i3(runnable, 400L);
                                    break;
                                } else {
                                    mvVar.c0.add(new ai.t6(r3, mvVar, l11, vaVar, runnable, 9));
                                    break;
                                }
                            } else {
                                arrayList.add(d2Var3);
                            }
                        }
                    }
                    mvVar = null;
                    d2Var = r9Var.f;
                    if (d2Var != null) {
                    }
                    r9Var.J();
                    j4Var.E3 = false;
                    if (mvVar != null) {
                    }
                    vaVar.X(qa.c(r3));
                    org.telegram.messenger.g0.i3(runnable, 400L);
                }
                break;
            case 1:
                is0 is0Var = (is0) this.b;
                org.telegram.ui.f4 f4Var = (org.telegram.ui.f4) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i10 = is0Var.d;
                hp.s1(i10).Y3((ArrayList) obj2, true);
                hp.s1(i10).S3((ArrayList) obj3, true);
                org.telegram.ui.Components.g5.g(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    zi ziVar = (zi) arrayList2.get(i11);
                    if (ziVar.A2() && ziVar.k.reactions != null) {
                        ziVar.Q2 = true;
                    }
                    ziVar.L5(is0Var.x, true);
                    is0Var.n.add(ziVar);
                }
                is0Var.G(true);
                org.telegram.messenger.g0.i3(f4Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.g8 g8Var = (org.telegram.ui.Wallet.g8) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && h0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.k0.H("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.f0 f0Var = new org.telegram.ui.Wallet.f0();
                    f0Var.c = bArr;
                    f0Var.b = h0Var.b();
                    f0Var.a = sendtransfer;
                    k0Var.c.p(h10.i(k0Var.a).e(), bArr, h0Var, new e51(k0Var, f0Var, g8Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.k0.j("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    g8Var.a(null, str);
                    break;
                }
        }
    }
}
