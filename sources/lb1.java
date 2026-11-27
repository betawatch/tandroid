// default package

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lb1 implements TextWatcher {
    public int a;
    public boolean b;
    public final /* synthetic */ qb1 c;

    public lb1(qb1 qb1Var) {
        this.c = qb1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        qb1 qb1Var = this.c;
        hb1 hb1Var = qb1Var.d0;
        in inVar = qb1Var.w;
        qb1Var.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = qb1Var.getCaptionLimit();
        int i = qb1Var.x;
        String valueOf = i + 25 > captionLimit ? String.valueOf(captionLimit - i) : null;
        inVar.a();
        inVar.setText(valueOf);
        inVar.setTextColor(qb1Var.x >= captionLimit ? -1280137 : -1);
        if (qb1Var.x > captionLimit && !yac.h(qb1Var.V).p() && qb1Var.x < qb1Var.getCaptionPremiumLimit() && qb1Var.x > this.a && (qb1Var.e() || uc7.s1(qb1Var.V).M3())) {
            int i2 = -qb1Var.O;
            qb1Var.O = i2;
            hl.A3(i2, inVar, null);
            yw0.E.a();
        }
        int i3 = qb1Var.x;
        this.a = i3;
        boolean z = i3 > captionLimit;
        if (z != this.b) {
            qb1Var.q(z);
        }
        this.b = z;
        if (!qb1Var.W) {
            hl.r(hb1Var);
            hl.d3(hb1Var, 1500L);
        }
        qb1Var.W = false;
        hl.c3(new fv0(this, (byte) 18));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        qb1 qb1Var = this.c;
        ObjectAnimator objectAnimator = qb1Var.g0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            qb1Var.b0 = qb1Var.f.getEditText().getScrollY();
            qb1Var.a0 = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        qb1 qb1Var = this.c;
        kb1 kb1Var = qb1Var.f;
        if (kb1Var.getEditText().h) {
            return;
        }
        if (qb1Var.N == null) {
            mb1 mb1Var = new mb1(qb1Var, qb1Var.getContext(), qb1Var.y, LaunchActivity.Q(), new x53(), (byte) 0);
            qb1Var.N = mb1Var;
            qb1Var.U = new xl0(qb1Var.P, mb1Var, 0, false);
            qb1Var.N.p(new ri6(qb1Var, (byte) 14));
            ll0 ll0Var = qb1Var.h0;
            if (ll0Var != null) {
                mb1 mb1Var2 = qb1Var.N;
                jl0 c = ll0Var.c(mb1Var2, null, false);
                c.p(dtd.i(qb1Var.a));
                mb1Var2.setBackgroundDrawable(c);
            }
            qb1Var.b.addView(qb1Var.N, tre.e(-1, -1, 83));
            qb1Var.w();
        }
        if (qb1Var.N.getAdapter() != null) {
            r17 adapter = qb1Var.N.getAdapter();
            uc7.s1(qb1Var.V).X1(Long.valueOf(qb1Var.y));
            TLRPC.Chat M0 = uc7.s1(qb1Var.V).M0(Long.valueOf(-qb1Var.y));
            adapter.getClass();
            adapter.m0 = M0;
            qb1Var.N.getAdapter().U(charSequence, kb1Var.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
