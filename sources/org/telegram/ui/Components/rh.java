package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;
    public final /* synthetic */ ki d;

    public rh(ki kiVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.d = kiVar;
        this.c = e2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i7;
        ki kiVar = this.d;
        h6 h6Var = kiVar.u1;
        ph phVar = kiVar.N2;
        int i10 = kiVar.H3;
        h6 h6Var2 = kiVar.v1;
        if (this.b != TextUtils.isEmpty(editable)) {
            ci ciVar = kiVar.w2;
            if (ciVar != null) {
                ciVar.D(ciVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, phVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        kiVar.G1 = codePointCount;
        kiVar.p1.a(codePointCount > 0, true);
        int i11 = kiVar.F1;
        if (i11 <= 0 || (i7 = i11 - kiVar.G1) > 100) {
            h6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 9));
            h6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            h6Var2.c(org.telegram.messenger.hd.E(j3, ','), h6Var2.getVisibility() == 0, true);
            if (h6Var2.getVisibility() != 0) {
                h6Var2.setVisibility(0);
                h6Var2.setAlpha(0.0f);
                h6Var2.setScaleX(0.5f);
                h6Var2.setScaleY(0.5f);
            }
            h6Var2.animate().setListener(null).cancel();
            h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.p7, kiVar.J0);
                z10 = false;
            } else {
                org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.y6, kiVar.J0);
                z10 = true;
            }
            h6Var.c(org.telegram.messenger.hd.E(j3, ','), false, true);
            h6Var.setAlpha(1.0f);
        }
        if (kiVar.S2 != z10) {
            kiVar.S2 = z10;
            kiVar.G2.invalidate();
        }
        if (!kiVar.g4 && !org.telegram.messenger.np.s1(i10).D3() && !org.telegram.messenger.m10.i(i10).q() && kiVar.G1 > org.telegram.messenger.np.s1(i10).U4 && kiVar.G1 < org.telegram.messenger.np.s1(i10).V4) {
            kiVar.g4 = true;
            kiVar.D1(this.c);
        }
        if (kiVar.X1) {
            if (phVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(phVar.getText().toString().trim())) {
                z11 = true;
            }
            kiVar.B1(z11);
        }
        kiVar.Q0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.a = true;
        }
        ki kiVar = this.d;
        if (kiVar.C4 == null) {
            ki.K0(kiVar);
        }
        if (kiVar.C4.getAdapter() != null) {
            kiVar.C4.setReversed(true);
            kiVar.C4.getAdapter().U(charSequence, kiVar.N2.getEditText().getSelectionStart(), null, false, false);
            kiVar.J1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
