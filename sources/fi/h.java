package fi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        e eVar = mVar.c0;
        org.telegram.ui.Components.j6 j6Var = mVar.w;
        mVar.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.x + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.x);
        } else {
            str = null;
        }
        j6Var.a();
        j6Var.setText(str);
        j6Var.setTextColor(mVar.x >= captionLimit ? -1280137 : -1);
        if (mVar.x > captionLimit && !p10.i(mVar.U).q() && mVar.x < mVar.getCaptionPremiumLimit() && mVar.x > this.a && (mVar.e() || qp.s1(mVar.U).D3())) {
            int i7 = -mVar.N;
            mVar.N = i7;
            org.telegram.messenger.g0.G3(i7, j6Var, null);
            org.telegram.messenger.p2.D.a();
        }
        int i10 = mVar.x;
        this.a = i10;
        boolean z9 = i10 > captionLimit;
        if (z9 != this.b) {
            mVar.q(z9);
        }
        this.b = z9;
        if (!mVar.V) {
            org.telegram.messenger.g0.r(eVar);
            org.telegram.messenger.g0.i3(eVar, 1500L);
        }
        mVar.V = false;
        org.telegram.messenger.g0.h3(new di.s7(this, 12));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.c;
        ObjectAnimator objectAnimator = mVar.f0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            mVar.a0 = mVar.f.getEditText().getScrollY();
            mVar.W = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.c;
        g gVar = mVar.f;
        if (gVar.getEditText().h) {
            return;
        }
        if (mVar.M == null) {
            i iVar = new i(mVar, mVar.getContext(), mVar.y, LaunchActivity.Q(), new di.b(), 0);
            mVar.M = iVar;
            mVar.T = new org.telegram.ui.Components.ca(mVar.O, iVar, 0, false);
            mVar.M.p(new cb.c(mVar, 24));
            dh.c cVar = mVar.g0;
            if (cVar != null) {
                i iVar2 = mVar.M;
                fh.g c10 = cVar.c(iVar2, null, false);
                c10.p(c8.g0.i(mVar.a));
                iVar2.setBackgroundDrawable(c10);
            }
            mVar.b.addView(mVar.M, c8.ha.e(-1, -1, 83));
            mVar.w();
        }
        if (mVar.M.getAdapter() != null) {
            jg.i1 adapter = mVar.M.getAdapter();
            qp.s1(mVar.U).a2(Long.valueOf(mVar.y));
            TLRPC.Chat M0 = qp.s1(mVar.U).M0(Long.valueOf(-mVar.y));
            adapter.getClass();
            adapter.l0 = M0;
            mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
