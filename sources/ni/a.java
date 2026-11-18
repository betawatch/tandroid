package ni;

import ah.h;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.h8;
import c8.ma;
import di.p6;
import hi.d;
import hi.e7;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import v4.q0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class a extends sa {
    public z41 T1;
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
    public a(Context context, TLRPC.Chat chat, long j3, x10 x10Var) {
        super(context, (i6) null, false);
        h6 h6Var;
        int i7;
        int i10;
        h6 h6Var2;
        TLRPC.User c22 = mp.u1(this.a).c2(Long.valueOf(j3));
        TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(-j3));
        this.X1 = o10.u(c22);
        this.W1 = v3.V(O0);
        this.G1 = false;
        this.F1 = g0.L(12.0f);
        this.p1.setTitle(P0());
        w0(n6.a7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.setPadding(0, g0.L(3.0f), 0, g0.L(3.0f));
        frameLayout.setLayoutParams(new q0(-1, -2));
        h6 h6Var3 = new h6(context, null);
        if (O0 != null) {
            h6Var = h6Var3;
            i7 = -1;
            h6Var.x(O0, null, O0.title, gd.H(' ', "Members", O0.participants_count), false, false);
        } else {
            h6Var = h6Var3;
            i7 = -1;
            if (c22 != null) {
                i10 = -1;
                h6Var2 = h6Var;
                h6Var2.x(c22, null, n5.m(c22), gd.M0(2131753154, null), false, false);
                frameLayout.addView(h6Var2, ma.c(-2.0f, i10));
                ck0 ck0Var = this.o1;
                int i11 = this.u0;
                ck0Var.setPadding(i11, 0, i11, g0.L(64.0f) + g0.n);
                this.o1.r1();
                this.o1.setClipToPadding(false);
                int i12 = 18;
                this.o1.setOnItemClickListener(new h8(this, i12));
                d dVar = new d(context, this.J0, true);
                if (chat == null) {
                    dVar.setText(gd.M0(v3.w(27, chat) ? 2131751963 : 2131751960, null));
                } else {
                    dVar.setText(gd.M0(2131751928, null));
                }
                dVar.f();
                dVar.setOnClickListener(new h(this, x10Var, chat, i12));
                this.b.addView(dVar, ma.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
                this.T1.O(false);
            }
        }
        i10 = i7;
        h6Var2 = h6Var;
        frameLayout.addView(h6Var2, ma.c(-2.0f, i10));
        ck0 ck0Var2 = this.o1;
        int i112 = this.u0;
        ck0Var2.setPadding(i112, 0, i112, g0.L(64.0f) + g0.n);
        this.o1.r1();
        this.o1.setClipToPadding(false);
        int i122 = 18;
        this.o1.setOnItemClickListener(new h8(this, i122));
        d dVar2 = new d(context, this.J0, true);
        if (chat == null) {
        }
        dVar2.f();
        dVar2.setOnClickListener(new h(this, x10Var, chat, i122));
        this.b.addView(dVar2, ma.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
        this.T1.O(false);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.o1, getContext(), this.a, 0, false, new e7(this, 24), this.J0);
        this.T1 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return gd.M0(this.X1 ? 2131751971 : 2131751966, null);
    }

    public final void e1(x10 x10Var, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.X1) {
            b5.M(getContext(), this.J0, gd.M0(2131751959, null), gd.M0(this.W1 ? 2131751962 : 2131751961, null), gd.M0(2131754484, null), new p6(this, x10Var, z10, 6)).show();
        } else {
            x10Var.a(Boolean.valueOf(z10));
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
        ck0 ck0Var = this.o1;
        View T0 = ck0Var.T0(i7);
        if (T0 instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) T0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View T02 = ck0Var.T0(this.Y1 + 2);
        if (T02 instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) T02).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.T1.O(true);
        }
    }
}
