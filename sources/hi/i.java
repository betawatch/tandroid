package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class i implements TextWatcher {
    public int a;
    public boolean b;
    public final /* synthetic */ n c;

    public i(n nVar) {
        this.c = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        n nVar = this.c;
        f fVar = nVar.d0;
        org.telegram.ui.Components.n6 n6Var = nVar.w;
        nVar.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = nVar.getCaptionLimit();
        if (nVar.x + 25 > captionLimit) {
            str = "" + (captionLimit - nVar.x);
        } else {
            str = null;
        }
        n6Var.a();
        n6Var.setText(str);
        n6Var.setTextColor(nVar.x >= captionLimit ? -1280137 : -1);
        if (nVar.x > captionLimit && !i10.i(nVar.V).q() && nVar.x < nVar.getCaptionPremiumLimit() && nVar.x > this.a && (nVar.e() || mp.u1(nVar.V).K3())) {
            int i7 = -nVar.O;
            nVar.O = i7;
            org.telegram.messenger.g0.E3(i7, n6Var, null);
            org.telegram.messenger.q2.E.a();
        }
        int i10 = nVar.x;
        this.a = i10;
        boolean z10 = i10 > captionLimit;
        if (z10 != this.b) {
            nVar.q(z10);
        }
        this.b = z10;
        if (!nVar.W) {
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 1500L);
        }
        nVar.W = false;
        org.telegram.messenger.g0.g3(new f2.a(this, 28));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        n nVar = this.c;
        ObjectAnimator objectAnimator = nVar.g0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            nVar.b0 = nVar.f.getEditText().getScrollY();
            nVar.a0 = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        n nVar = this.c;
        h hVar = nVar.f;
        if (hVar.getEditText().h) {
            return;
        }
        if (nVar.N == null) {
            j jVar = new j(nVar, nVar.getContext(), nVar.y, LaunchActivity.Q(), new fi.b(), 0);
            nVar.N = jVar;
            nVar.U = new org.telegram.ui.Components.fa(nVar.P, jVar, 0, false);
            nVar.N.p(new d6.i(nVar, 29));
            dh.c cVar = nVar.h0;
            if (cVar != null) {
                j jVar2 = nVar.N;
                fh.g c10 = cVar.c(jVar2, null, false);
                c10.p(c8.j0.j(nVar.a));
                jVar2.setBackgroundDrawable(c10);
            }
            nVar.b.addView(nVar.N, c8.na.e(-1, -1, 83));
            nVar.w();
        }
        if (nVar.N.getAdapter() != null) {
            jg.h1 adapter = nVar.N.getAdapter();
            mp.u1(nVar.V).c2(Long.valueOf(nVar.y));
            TLRPC.Chat O0 = mp.u1(nVar.V).O0(Long.valueOf(-nVar.y));
            adapter.getClass();
            adapter.m0 = O0;
            nVar.N.getAdapter().U(charSequence, hVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
