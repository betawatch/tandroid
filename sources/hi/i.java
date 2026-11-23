package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class i implements TextWatcher {
    public int a;
    public boolean b;
    public final /* synthetic */ o c;

    public i(o oVar) {
        this.c = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        o oVar = this.c;
        f fVar = oVar.d0;
        org.telegram.ui.Components.o6 o6Var = oVar.w;
        oVar.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = oVar.getCaptionLimit();
        if (oVar.x + 25 > captionLimit) {
            str = "" + (captionLimit - oVar.x);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        o6Var.setTextColor(oVar.x >= captionLimit ? -1280137 : -1);
        if (oVar.x > captionLimit && !k10.i(oVar.V).q() && oVar.x < oVar.getCaptionPremiumLimit() && oVar.x > this.a && (oVar.e() || np.u1(oVar.V).K3())) {
            int i7 = -oVar.O;
            oVar.O = i7;
            org.telegram.messenger.g0.E3(i7, o6Var, null);
            org.telegram.messenger.q2.E.a();
        }
        int i10 = oVar.x;
        this.a = i10;
        boolean z10 = i10 > captionLimit;
        if (z10 != this.b) {
            oVar.q(z10);
        }
        this.b = z10;
        if (!oVar.W) {
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 1500L);
        }
        oVar.W = false;
        org.telegram.messenger.g0.g3(new f2.a(this, 29));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        o oVar = this.c;
        ObjectAnimator objectAnimator = oVar.g0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            oVar.b0 = oVar.f.getEditText().getScrollY();
            oVar.a0 = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        o oVar = this.c;
        h hVar = oVar.f;
        if (hVar.getEditText().h) {
            return;
        }
        if (oVar.N == null) {
            j jVar = new j(oVar, oVar.getContext(), oVar.y, LaunchActivity.Q(), new fi.b(), 0);
            oVar.N = jVar;
            oVar.U = new org.telegram.ui.Components.ga(oVar.P, jVar, 0, false);
            oVar.N.p(new ze.b(oVar));
            dh.c cVar = oVar.h0;
            if (cVar != null) {
                j jVar2 = oVar.N;
                fh.g c10 = cVar.c(jVar2, null, false);
                c10.p(c8.i0.j(oVar.a));
                jVar2.setBackgroundDrawable(c10);
            }
            oVar.b.addView(oVar.N, c8.ma.e(-1, -1, 83));
            oVar.w();
        }
        if (oVar.N.getAdapter() != null) {
            jg.h1 adapter = oVar.N.getAdapter();
            np.u1(oVar.V).c2(Long.valueOf(oVar.y));
            TLRPC.Chat O0 = np.u1(oVar.V).O0(Long.valueOf(-oVar.y));
            adapter.getClass();
            adapter.m0 = O0;
            oVar.N.getAdapter().U(charSequence, hVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
