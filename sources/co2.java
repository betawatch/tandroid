// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class co2 extends mz0 {
    public l7c S1;
    public boolean T1;
    public final FrameLayout U1;
    public final boolean V1;
    public final boolean W1;
    public int X1;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public co2(Context context, TLRPC.Chat chat, long j, qac qacVar) {
        super((ylb) null, context, false);
        ut8 ut8Var;
        int i;
        int i2;
        ut8 ut8Var2;
        TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(j));
        TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-j));
        this.W1 = m9c.v(W1);
        this.V1 = sd2.V(L0);
        this.F1 = false;
        this.E1 = gm.L(12.0f);
        this.o1.setTitle(J0());
        t0(cmb.Z6);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        frameLayout.setPadding(0, gm.L(3.0f), 0, gm.L(3.0f));
        frameLayout.setLayoutParams(new g69(-1, -2));
        ut8 ut8Var3 = new ut8(context, null);
        if (L0 != null) {
            ut8Var = ut8Var3;
            i = -1;
            ut8Var.x(L0, null, L0.title, jb6.H(' ', "Members", L0.participants_count), false, false);
        } else {
            ut8Var = ut8Var3;
            i = -1;
            if (W1 != null) {
                i2 = -1;
                ut8Var2 = ut8Var;
                ut8Var2.x(W1, null, pg3.l(W1), jb6.M0(2131753121, null), false, false);
                frameLayout.addView(ut8Var2, qoe.c(-2.0f, i2));
                r59 r59Var = this.n1;
                int i3 = this.u0;
                r59Var.setPadding(i3, 0, i3, gm.L(64.0f) + gm.n);
                this.n1.r1();
                this.n1.setClipToPadding(false);
                this.n1.setOnItemClickListener(new u(this, (byte) 16));
                b61 b61Var = new b61(this.J0, context, true);
                if (chat == null) {
                    b61Var.setText(jb6.M0(sd2.w(27, chat) ? 2131751911 : 2131751908, null));
                } else {
                    b61Var.setText(jb6.M0(2131751876, null));
                }
                b61Var.f();
                b61Var.setOnClickListener(new b0(this, qacVar, chat, (byte) 25));
                this.b.addView(b61Var, qoe.f(48.0f, -1, 80, gm.L(12.0f) + this.u0, 0, gm.L(12.0f) + this.u0, gm.L(12.0f) + gm.n));
                this.S1.O(false);
            }
        }
        i2 = i;
        ut8Var2 = ut8Var;
        frameLayout.addView(ut8Var2, qoe.c(-2.0f, i2));
        r59 r59Var2 = this.n1;
        int i32 = this.u0;
        r59Var2.setPadding(i32, 0, i32, gm.L(64.0f) + gm.n);
        this.n1.r1();
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new u(this, (byte) 16));
        b61 b61Var2 = new b61(this.J0, context, true);
        if (chat == null) {
        }
        b61Var2.f();
        b61Var2.setOnClickListener(new b0(this, qacVar, chat, (byte) 25));
        this.b.addView(b61Var2, qoe.f(48.0f, -1, 80, gm.L(12.0f) + this.u0, 0, gm.L(12.0f) + this.u0, gm.L(12.0f) + gm.n));
        this.S1.O(false);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, false, new h92(this, (byte) 7), this.J0);
        this.S1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(this.W1 ? 2131751919 : 2131751914, null);
    }

    public final void Y0(qac qacVar, boolean z, boolean z2) {
        if (z2 && !z && !this.W1) {
            ik.M(getContext(), this.J0, jb6.M0(2131751907, null), jb6.M0(this.V1 ? 2131751910 : 2131751909, null), jb6.M0(2131754483, null), new np6((Object) this, (Object) qacVar, z, (byte) 16)).show();
        } else {
            qacVar.a(Boolean.valueOf(z));
            dismiss();
        }
    }

    public final void Z0(boolean z) {
        boolean z2;
        if (this.T1 != z) {
            this.T1 = z;
            int i = this.X1 + 1;
            r59 r59Var = this.n1;
            View U0 = r59Var.U0(i);
            if (U0 instanceof v09) {
                ((v09) U0).a(!z);
                z2 = false;
            } else {
                z2 = true;
            }
            View U02 = r59Var.U0(this.X1 + 2);
            if (U02 instanceof v09) {
                ((v09) U02).a(z);
            } else {
                z2 = true;
            }
            if (z2) {
                this.S1.O(true);
            }
        }
    }
}
