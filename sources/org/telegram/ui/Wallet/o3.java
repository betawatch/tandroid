package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ o3(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        switch (this.a) {
            case 0:
                m5.a0(this.b);
                break;
            case 1:
                m5 m5Var = this.b;
                m5Var.getClass();
                m5Var.presentFragment(new h8());
                break;
            case 2:
                m5 m5Var2 = this.b;
                m5Var2.getClass();
                m5Var2.presentFragment(new gi.h());
                break;
            case 3:
                m5 m5Var3 = this.b;
                t7 t7Var = m5Var3.j0;
                if (t7Var != null && (d0Var = m5Var3.E0) != null) {
                    t7Var.Y(d0Var);
                }
                d0 d0Var2 = m5Var3.E0;
                boolean z10 = (d0Var2 == null || d0Var2.a.isEmpty()) ? false : true;
                if (m5Var3.f0 != z10) {
                    m5Var3.H0(z10);
                }
                if (z10 && m5Var3.F0) {
                    n8 n8Var = m5Var3.i0;
                    if (n8Var != null) {
                        n8Var.b(false);
                    }
                    if (m5Var3.f0) {
                        m5Var3.F0 = false;
                        m5Var3.e0 = 1;
                        fi.h1 h1Var = m5Var3.p0;
                        if (h1Var != null) {
                            h1Var.setPosition(1);
                        }
                    } else {
                        m5Var3.F0 = true;
                    }
                }
                m71 m71Var = m5Var3.a;
                if (m71Var != null && m71Var.g3 != null) {
                    m5Var3.T0(true);
                    break;
                }
                break;
            case 4:
                this.b.o0(false);
                break;
            case 5:
                this.b.A0();
                break;
            case 6:
                this.b.z0();
                break;
            case 7:
                m5 m5Var4 = this.b;
                if (m5Var4.R.isAttachedToWindow()) {
                    if (!m5Var4.a.canScrollVertically(-1)) {
                        m5Var4.a.f3.h1(0, 0);
                    }
                    m5Var4.R.requestLayout();
                    break;
                }
                break;
            case 8:
                this.b.M0 = null;
                break;
            case 9:
                m5.d0(this.b);
                break;
            case 10:
                this.b.P0();
                break;
            case 11:
                wc.b0(this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 12:
                m5 m5Var5 = this.b;
                m5Var5.R.post(new o3(m5Var5, 7));
                break;
            case 13:
                this.b.z0();
                break;
            default:
                this.b.z0();
                break;
        }
    }
}
