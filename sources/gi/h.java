package gi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import b8.cd;
import b8.mf;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        if (mVar.x > captionLimit && !h10.i(mVar.V).q() && mVar.x < mVar.getCaptionPremiumLimit() && mVar.x > this.a && (mVar.e() || hp.s1(mVar.V).D3())) {
            int i3 = -mVar.O;
            mVar.O = i3;
            org.telegram.messenger.g0.G3(i3, h6Var, null);
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
        org.telegram.messenger.g0.h3(new ei.z5(this, 16));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        m mVar = this.c;
        ObjectAnimator objectAnimator = mVar.g0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            mVar.b0 = mVar.f.getEditText().getScrollY();
            mVar.a0 = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        m mVar = this.c;
        g gVar = mVar.f;
        if (gVar.getEditText().h) {
            return;
        }
        if (mVar.N == null) {
            i iVar = new i(mVar, mVar.getContext(), mVar.y, LaunchActivity.Q(), new ei.b(), 0);
            mVar.N = iVar;
            mVar.U = new org.telegram.ui.Components.ba(mVar.P, iVar, 0, false);
            mVar.N.p(new c6.i(mVar, 28));
            eh.c cVar = mVar.h0;
            if (cVar != null) {
                i iVar2 = mVar.N;
                gh.g c2 = cVar.c(iVar2, null, false);
                c2.p(cd.i(mVar.a));
                iVar2.setBackgroundDrawable(c2);
            }
            mVar.b.addView(mVar.N, mf.e(-1, -1, 83));
            mVar.w();
        }
        if (mVar.N.getAdapter() != null) {
            kg.e1 adapter = mVar.N.getAdapter();
            hp.s1(mVar.V).a2(Long.valueOf(mVar.y));
            TLRPC.Chat M0 = hp.s1(mVar.V).M0(Long.valueOf(-mVar.y));
            adapter.getClass();
            adapter.m0 = M0;
            mVar.N.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
