package ni;

import ah.g;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.b6;
import di.m6;
import hi.d;
import hi.q4;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import v4.p0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class a extends ja {
    public p41 T1;
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
    public a(Context context, TLRPC.Chat chat, long j3, z10 z10Var) {
        super(context, (e6) null, false);
        f6 f6Var;
        int i7;
        int i10;
        f6 f6Var2;
        TLRPC.User a22 = np.s1(this.a).a2(Long.valueOf(j3));
        TLRPC.Chat M0 = np.s1(this.a).M0(Long.valueOf(-j3));
        this.X1 = q10.t(a22);
        this.W1 = t3.V(M0);
        this.G1 = false;
        this.F1 = g0.L(12.0f);
        this.p1.setTitle(O0());
        w0(j6.a7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.setPadding(0, g0.L(3.0f), 0, g0.L(3.0f));
        frameLayout.setLayoutParams(new p0(-1, -2));
        f6 f6Var3 = new f6(context, null);
        if (M0 != null) {
            f6Var = f6Var3;
            i7 = -1;
            f6Var.x(M0, null, M0.title, hd.H(' ', "Members", M0.participants_count), false, false);
        } else {
            f6Var = f6Var3;
            i7 = -1;
            if (a22 != null) {
                i10 = -1;
                f6Var2 = f6Var;
                f6Var2.x(a22, null, m5.m(a22), hd.M0(2131753156, null), false, false);
                frameLayout.addView(f6Var2, c8.ja.c(-2.0f, i10));
                uj0 uj0Var = this.o1;
                int i11 = this.u0;
                uj0Var.setPadding(i11, 0, i11, g0.L(64.0f) + g0.n);
                this.o1.r1();
                this.o1.setClipToPadding(false);
                int i12 = 18;
                this.o1.setOnItemClickListener(new b6(this, i12));
                d dVar = new d(context, this.J0, true);
                if (chat == null) {
                    dVar.setText(hd.M0(t3.w(27, chat) ? 2131751974 : 2131751971, null));
                } else {
                    dVar.setText(hd.M0(2131751939, null));
                }
                dVar.f();
                dVar.setOnClickListener(new g(this, z10Var, chat, i12));
                this.b.addView(dVar, c8.ja.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
                this.T1.O(false);
            }
        }
        i10 = i7;
        f6Var2 = f6Var;
        frameLayout.addView(f6Var2, c8.ja.c(-2.0f, i10));
        uj0 uj0Var2 = this.o1;
        int i112 = this.u0;
        uj0Var2.setPadding(i112, 0, i112, g0.L(64.0f) + g0.n);
        this.o1.r1();
        this.o1.setClipToPadding(false);
        int i122 = 18;
        this.o1.setOnItemClickListener(new b6(this, i122));
        d dVar2 = new d(context, this.J0, true);
        if (chat == null) {
        }
        dVar2.f();
        dVar2.setOnClickListener(new g(this, z10Var, chat, i122));
        this.b.addView(dVar2, c8.ja.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
        this.T1.O(false);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.a, 0, false, new q4(this, 24), this.J0);
        this.T1 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(this.X1 ? 2131751982 : 2131751977, null);
    }

    public final void d1(z10 z10Var, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.X1) {
            t4.M(getContext(), this.J0, hd.M0(2131751970, null), hd.M0(this.W1 ? 2131751973 : 2131751972, null), hd.M0(2131754486, null), new m6(this, z10Var, z10, 6)).show();
        } else {
            z10Var.a(Boolean.valueOf(z10));
            dismiss();
        }
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.U1 == z10) {
            return;
        }
        this.U1 = z10;
        int i7 = this.Y1 + 1;
        uj0 uj0Var = this.o1;
        View T0 = uj0Var.T0(i7);
        if (T0 instanceof g6) {
            ((g6) T0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View T02 = uj0Var.T0(this.Y1 + 2);
        if (T02 instanceof g6) {
            ((g6) T02).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.T1.O(true);
        }
    }
}
