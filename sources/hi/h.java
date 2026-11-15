package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h implements TextWatcher {
    public int a;
    public boolean b;
    public final /* synthetic */ m c;

    public h(m mVar) {
        this.c = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        m mVar = this.c;
        e eVar = mVar.d0;
        org.telegram.ui.Components.h6 h6Var = mVar.w;
        mVar.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.x + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.x);
        } else {
            str = null;
        }
        h6Var.a();
        h6Var.setText(str);
        h6Var.setTextColor(mVar.x >= captionLimit ? -1280137 : -1);
        if (mVar.x > captionLimit && !m10.i(mVar.V).q() && mVar.x < mVar.getCaptionPremiumLimit() && mVar.x > this.a && (mVar.e() || np.s1(mVar.V).D3())) {
            int i7 = -mVar.O;
            mVar.O = i7;
            org.telegram.messenger.g0.F3(i7, h6Var, null);
            org.telegram.messenger.p2.E.a();
        }
        int i10 = mVar.x;
        this.a = i10;
        boolean z10 = i10 > captionLimit;
        if (z10 != this.b) {
            mVar.q(z10);
        }
        this.b = z10;
        if (!mVar.W) {
            org.telegram.messenger.g0.r(eVar);
            org.telegram.messenger.g0.i3(eVar, 1500L);
        }
        mVar.W = false;
        org.telegram.messenger.g0.h3(new fi.c1(this, 25));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.c;
        ObjectAnimator objectAnimator = mVar.g0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            mVar.b0 = mVar.f.getEditText().getScrollY();
            mVar.a0 = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.c;
        g gVar = mVar.f;
        if (gVar.getEditText().h) {
            return;
        }
        if (mVar.N == null) {
            i iVar = new i(mVar, mVar.getContext(), mVar.y, LaunchActivity.Q(), new fi.b(), 0);
            mVar.N = iVar;
            mVar.U = new org.telegram.ui.Components.y9(mVar.P, iVar, 0, false);
            mVar.N.p(new gc.b(mVar, 3));
            dh.c cVar = mVar.h0;
            if (cVar != null) {
                i iVar2 = mVar.N;
                fh.g c10 = cVar.c(iVar2, null, false);
                c10.p(c8.g0.i(mVar.a));
                iVar2.setBackgroundDrawable(c10);
            }
            mVar.b.addView(mVar.N, c8.ja.e(-1, -1, 83));
            mVar.w();
        }
        if (mVar.N.getAdapter() != null) {
            jg.h1 adapter = mVar.N.getAdapter();
            np.s1(mVar.V).a2(Long.valueOf(mVar.y));
            TLRPC.Chat M0 = np.s1(mVar.V).M0(Long.valueOf(-mVar.y));
            adapter.getClass();
            adapter.m0 = M0;
            mVar.N.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
