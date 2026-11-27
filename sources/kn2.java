// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kn2 extends ny0 {
    public l9c S1;
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
    public kn2(Context context, TLRPC.Chat chat, long j, pcc pccVar) {
        super((vnb) null, context, false);
        bv8 bv8Var;
        int i;
        int i2;
        bv8 bv8Var2;
        TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(j));
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-j));
        this.W1 = lbc.v(X1);
        this.V1 = xc2.V(M0);
        this.F1 = false;
        this.E1 = hl.L(12.0f);
        this.o1.setTitle(K0());
        t0(aob.a7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        frameLayout.setPadding(0, hl.L(3.0f), 0, hl.L(3.0f));
        frameLayout.setLayoutParams(new r79(-1, -2));
        bv8 bv8Var3 = new bv8(context, null);
        if (M0 != null) {
            bv8Var = bv8Var3;
            i = -1;
            bv8Var.C(M0, null, M0.title, ob6.H(' ', "Members", M0.participants_count), false, false);
        } else {
            bv8Var = bv8Var3;
            i = -1;
            if (X1 != null) {
                i2 = -1;
                bv8Var2 = bv8Var;
                bv8Var2.C(X1, null, wf3.l(X1), ob6.M0(2131753149, null), false, false);
                frameLayout.addView(bv8Var2, tre.c(-2.0f, i2));
                d79 d79Var = this.n1;
                int i3 = this.u0;
                d79Var.setPadding(i3, 0, i3, hl.L(64.0f) + hl.n);
                this.n1.s1();
                this.n1.setClipToPadding(false);
                this.n1.setOnItemClickListener(new u(this, (byte) 15));
                c51 c51Var = new c51(this.J0, context, true);
                if (chat == null) {
                    c51Var.setText(ob6.M0(xc2.w(27, chat) ? 2131751939 : 2131751936, null));
                } else {
                    c51Var.setText(ob6.M0(2131751904, null));
                }
                c51Var.f();
                c51Var.setOnClickListener(new c0(this, pccVar, chat, (byte) 25));
                this.b.addView(c51Var, tre.f(48.0f, -1, 80, hl.L(12.0f) + this.u0, 0, hl.L(12.0f) + this.u0, hl.L(12.0f) + hl.n));
                this.S1.O(false);
            }
        }
        i2 = i;
        bv8Var2 = bv8Var;
        frameLayout.addView(bv8Var2, tre.c(-2.0f, i2));
        d79 d79Var2 = this.n1;
        int i32 = this.u0;
        d79Var2.setPadding(i32, 0, i32, hl.L(64.0f) + hl.n);
        this.n1.s1();
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new u(this, (byte) 15));
        c51 c51Var2 = new c51(this.J0, context, true);
        if (chat == null) {
        }
        c51Var2.f();
        c51Var2.setOnClickListener(new c0(this, pccVar, chat, (byte) 25));
        this.b.addView(c51Var2, tre.f(48.0f, -1, 80, hl.L(12.0f) + this.u0, 0, hl.L(12.0f) + this.u0, hl.L(12.0f) + hl.n));
        this.S1.O(false);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, false, new n82(this, (byte) 7), this.J0);
        this.S1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        return ob6.M0(this.W1 ? 2131751947 : 2131751942, null);
    }

    public final void Z0(pcc pccVar, boolean z, boolean z2) {
        if (z2 && !z && !this.W1) {
            jj.M(getContext(), this.J0, ob6.M0(2131751935, null), ob6.M0(this.V1 ? 2131751938 : 2131751937, null), ob6.M0(2131754479, null), new ds6((Object) this, (Object) pccVar, z, (byte) 16)).show();
        } else {
            pccVar.a(Boolean.valueOf(z));
            dismiss();
        }
    }

    public final void a1(boolean z) {
        boolean z2;
        if (this.T1 != z) {
            this.T1 = z;
            int i = this.X1 + 1;
            d79 d79Var = this.n1;
            View V0 = d79Var.V0(i);
            if (V0 instanceof h29) {
                ((h29) V0).a(!z);
                z2 = false;
            } else {
                z2 = true;
            }
            View V02 = d79Var.V0(this.X1 + 2);
            if (V02 instanceof h29) {
                ((h29) V02).a(z);
            } else {
                z2 = true;
            }
            if (z2) {
                this.S1.O(true);
            }
        }
    }
}
