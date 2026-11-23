package ni;

import ah.h;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.k8;
import c8.ma;
import di.p6;
import hi.d7;
import hi.e;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.v3;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.sa;
import v4.q0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class a extends sa {
    public c51 T1;
    public boolean U1;
    public final FrameLayout V1;
    public final boolean W1;
    public final boolean X1;
    public int Y1;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, TLRPC.Chat chat, long j3, y10 y10Var) {
        super(context, (h6) null, false);
        org.telegram.ui.Cells.h6 h6Var;
        int i7;
        int i10;
        org.telegram.ui.Cells.h6 h6Var2;
        TLRPC.User c22 = np.u1(this.a).c2(Long.valueOf(j3));
        TLRPC.Chat O0 = np.u1(this.a).O0(Long.valueOf(-j3));
        this.X1 = p10.u(c22);
        this.W1 = v3.V(O0);
        this.G1 = false;
        this.F1 = g0.L(12.0f);
        this.p1.setTitle(P0());
        w0(m6.a7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.setPadding(0, g0.L(3.0f), 0, g0.L(3.0f));
        frameLayout.setLayoutParams(new q0(-1, -2));
        org.telegram.ui.Cells.h6 h6Var3 = new org.telegram.ui.Cells.h6(context, null);
        if (O0 != null) {
            h6Var = h6Var3;
            i7 = -1;
            h6Var.x(O0, null, O0.title, hd.H(' ', "Members", O0.participants_count), false, false);
        } else {
            h6Var = h6Var3;
            i7 = -1;
            if (c22 != null) {
                i10 = -1;
                h6Var2 = h6Var;
                h6Var2.x(c22, null, n5.m(c22), hd.N0(2131753153, null), false, false);
                frameLayout.addView(h6Var2, ma.c(-2.0f, i10));
                ek0 ek0Var = this.o1;
                int i11 = this.u0;
                ek0Var.setPadding(i11, 0, i11, g0.L(64.0f) + g0.n);
                this.o1.r1();
                this.o1.setClipToPadding(false);
                int i12 = 18;
                this.o1.setOnItemClickListener(new k8(this, i12));
                e eVar = new e(context, this.J0, true);
                if (chat == null) {
                    eVar.setText(hd.N0(v3.w(27, chat) ? 2131751962 : 2131751959, null));
                } else {
                    eVar.setText(hd.N0(2131751927, null));
                }
                eVar.f();
                eVar.setOnClickListener(new h(this, y10Var, chat, i12));
                this.b.addView(eVar, ma.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
                this.T1.O(false);
            }
        }
        i10 = i7;
        h6Var2 = h6Var;
        frameLayout.addView(h6Var2, ma.c(-2.0f, i10));
        ek0 ek0Var2 = this.o1;
        int i112 = this.u0;
        ek0Var2.setPadding(i112, 0, i112, g0.L(64.0f) + g0.n);
        this.o1.r1();
        this.o1.setClipToPadding(false);
        int i122 = 18;
        this.o1.setOnItemClickListener(new k8(this, i122));
        e eVar2 = new e(context, this.J0, true);
        if (chat == null) {
        }
        eVar2.f();
        eVar2.setOnClickListener(new h(this, y10Var, chat, i122));
        this.b.addView(eVar2, ma.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
        this.T1.O(false);
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.o1, getContext(), this.a, 0, false, new d7(this, 24), this.J0);
        this.T1 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return hd.N0(this.X1 ? 2131751970 : 2131751965, null);
    }

    public final void e1(y10 y10Var, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.X1) {
            c5.M(getContext(), this.J0, hd.N0(2131751958, null), hd.N0(this.W1 ? 2131751961 : 2131751960, null), hd.N0(2131754483, null), new p6(this, y10Var, z10, 6)).show();
        } else {
            y10Var.a(Boolean.valueOf(z10));
            dismiss();
        }
    }

    public final void f1(boolean z10) {
        boolean z11;
        if (this.U1 == z10) {
            return;
        }
        this.U1 = z10;
        int i7 = this.Y1 + 1;
        ek0 ek0Var = this.o1;
        View T0 = ek0Var.T0(i7);
        if (T0 instanceof i6) {
            ((i6) T0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View T02 = ek0Var.T0(this.Y1 + 2);
        if (T02 instanceof i6) {
            ((i6) T02).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.T1.O(true);
        }
    }
}
