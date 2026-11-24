// default package

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class db1 implements TextWatcher {
    public int a;
    public boolean b;
    public final /* synthetic */ ib1 c;

    public db1(ib1 ib1Var) {
        this.c = ib1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ib1 ib1Var = this.c;
        za1 za1Var = ib1Var.d0;
        hn hnVar = ib1Var.w;
        ib1Var.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = ib1Var.getCaptionLimit();
        int i = ib1Var.x;
        String valueOf = i + 25 > captionLimit ? String.valueOf(captionLimit - i) : null;
        hnVar.a();
        hnVar.setText(valueOf);
        hnVar.setTextColor(ib1Var.x >= captionLimit ? -1280137 : -1);
        if (ib1Var.x > captionLimit && !y6c.h(ib1Var.V).p() && ib1Var.x < ib1Var.getCaptionPremiumLimit() && ib1Var.x > this.a && (ib1Var.e() || na7.q1(ib1Var.V).E3())) {
            int i2 = -ib1Var.O;
            ib1Var.O = i2;
            gl.B3(i2, hnVar, null);
            pw0.E.a();
        }
        int i3 = ib1Var.x;
        this.a = i3;
        boolean z = i3 > captionLimit;
        if (z != this.b) {
            ib1Var.q(z);
        }
        this.b = z;
        if (!ib1Var.W) {
            gl.r(za1Var);
            gl.e3(za1Var, 1500L);
        }
        ib1Var.W = false;
        gl.d3(new nv0(this, (byte) 15));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ib1 ib1Var = this.c;
        ObjectAnimator objectAnimator = ib1Var.g0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ib1Var.b0 = ib1Var.f.getEditText().getScrollY();
            ib1Var.a0 = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ib1 ib1Var = this.c;
        cb1 cb1Var = ib1Var.f;
        if (cb1Var.getEditText().h) {
            return;
        }
        if (ib1Var.N == null) {
            eb1 eb1Var = new eb1(ib1Var, ib1Var.getContext(), ib1Var.y, LaunchActivity.Q(), new f53(), (byte) 0);
            ib1Var.N = eb1Var;
            ib1Var.U = new wl0(ib1Var.P, eb1Var, 0, false);
            ib1Var.N.p(new l69(ib1Var, (byte) 15));
            kl0 kl0Var = ib1Var.h0;
            if (kl0Var != null) {
                eb1 eb1Var2 = ib1Var.N;
                il0 c = kl0Var.c(eb1Var2, null, false);
                c.p(nod.i(ib1Var.a));
                eb1Var2.setBackgroundDrawable(c);
            }
            ib1Var.b.addView(ib1Var.N, nme.e(-1, -1, 83));
            ib1Var.w();
        }
        if (ib1Var.N.getAdapter() != null) {
            kz6 adapter = ib1Var.N.getAdapter();
            na7.q1(ib1Var.V).V1(Long.valueOf(ib1Var.y));
            TLRPC.Chat K0 = na7.q1(ib1Var.V).K0(Long.valueOf(-ib1Var.y));
            adapter.getClass();
            adapter.m0 = K0;
            ib1Var.N.getAdapter().U(charSequence, cb1Var.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
