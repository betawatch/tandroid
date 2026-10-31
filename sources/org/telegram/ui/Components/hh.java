package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;
    public final /* synthetic */ bi d;

    public hh(bi biVar, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = biVar;
        this.c = k2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        bi biVar = this.d;
        f6 f6Var = biVar.q1;
        fh fhVar = biVar.J2;
        int i11 = biVar.D3;
        f6 f6Var2 = biVar.r1;
        if (this.b != TextUtils.isEmpty(editable)) {
            uh uhVar = biVar.s2;
            if (uhVar != null) {
                uhVar.D(uhVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.k6.l(editable, fhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        biVar.C1 = codePointCount;
        biVar.l1.a(codePointCount > 0, true);
        int i12 = biVar.B1;
        if (i12 <= 0 || (i10 = i12 - biVar.C1) > 100) {
            f6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new w5(this, 9));
            f6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            f6Var2.c(org.telegram.messenger.cd.E(j10, ','), f6Var2.getVisibility() == 0, true);
            if (f6Var2.getVisibility() != 0) {
                f6Var2.setVisibility(0);
                f6Var2.setAlpha(0.0f);
                f6Var2.setScaleX(0.5f);
                f6Var2.setScaleY(0.5f);
            }
            f6Var2.animate().setListener(null).cancel();
            f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.p7, biVar.I0);
                z10 = false;
            } else {
                org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.y6, biVar.I0);
                z10 = true;
            }
            f6Var.c(org.telegram.messenger.cd.E(j10, ','), false, true);
            f6Var.setAlpha(1.0f);
        }
        if (biVar.O2 != z10) {
            biVar.O2 = z10;
            biVar.C2.invalidate();
        }
        if (!biVar.c4 && !org.telegram.messenger.vp.r1(i11).A3() && !org.telegram.messenger.d20.i(i11).q() && biVar.C1 > org.telegram.messenger.vp.r1(i11).U4 && biVar.C1 < org.telegram.messenger.vp.r1(i11).V4) {
            biVar.c4 = true;
            biVar.C1(this.c);
        }
        if (biVar.T1) {
            if (fhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fhVar.getText().toString().trim())) {
                z11 = true;
            }
            biVar.A1(z11);
        }
        biVar.Q0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        bi biVar = this.d;
        if (biVar.y4 == null) {
            bi.K0(biVar);
        }
        if (biVar.y4.getAdapter() != null) {
            biVar.y4.setReversed(true);
            biVar.y4.getAdapter().U(charSequence, biVar.J2.getEditText().getSelectionStart(), null, false, false);
            biVar.I1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
