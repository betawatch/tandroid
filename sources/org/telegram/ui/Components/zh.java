package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 c;
    public final /* synthetic */ si d;

    public zh(si siVar, org.telegram.ui.ActionBar.h2 h2Var) {
        this.d = siVar;
        this.c = h2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i7;
        si siVar = this.d;
        n6 n6Var = siVar.u1;
        xh xhVar = siVar.N2;
        int i10 = siVar.H3;
        n6 n6Var2 = siVar.v1;
        if (this.b != TextUtils.isEmpty(editable)) {
            ki kiVar = siVar.w2;
            if (kiVar != null) {
                kiVar.E(kiVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, xhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        siVar.G1 = codePointCount;
        siVar.p1.a(codePointCount > 0, true);
        int i11 = siVar.F1;
        if (i11 <= 0 || (i7 = i11 - siVar.G1) > 100) {
            n6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x(this, 10));
            n6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            n6Var2.c(org.telegram.messenger.gd.E(j3, ','), n6Var2.getVisibility() == 0, true);
            if (n6Var2.getVisibility() != 0) {
                n6Var2.setVisibility(0);
                n6Var2.setAlpha(0.0f);
                n6Var2.setScaleX(0.5f);
                n6Var2.setScaleY(0.5f);
            }
            n6Var2.animate().setListener(null).cancel();
            n6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.p7, siVar.J0);
                z10 = false;
            } else {
                org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.y6, siVar.J0);
                z10 = true;
            }
            n6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
            n6Var.setAlpha(1.0f);
        }
        if (siVar.S2 != z10) {
            siVar.S2 = z10;
            siVar.G2.invalidate();
        }
        if (!siVar.g4 && !org.telegram.messenger.mp.u1(i10).K3() && !org.telegram.messenger.j10.i(i10).q() && siVar.G1 > org.telegram.messenger.mp.u1(i10).W4 && siVar.G1 < org.telegram.messenger.mp.u1(i10).X4) {
            siVar.g4 = true;
            siVar.E1(this.c);
        }
        if (siVar.X1) {
            if (xhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(xhVar.getText().toString().trim())) {
                z11 = true;
            }
            siVar.C1(z11);
        }
        siVar.R0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.a = true;
        }
        si siVar = this.d;
        if (siVar.C4 == null) {
            si.L0(siVar);
        }
        if (siVar.C4.getAdapter() != null) {
            siVar.C4.setReversed(true);
            siVar.C4.getAdapter().U(charSequence, siVar.N2.getEditText().getSelectionStart(), null, false, false);
            siVar.K1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
