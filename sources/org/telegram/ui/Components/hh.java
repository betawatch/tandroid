package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;
    public final /* synthetic */ bi d;

    public hh(bi biVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.d = biVar;
        this.c = d2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i3;
        bi biVar = this.d;
        h6 h6Var = biVar.r1;
        fh fhVar = biVar.K2;
        int i10 = biVar.E3;
        h6 h6Var2 = biVar.s1;
        if (this.b != TextUtils.isEmpty(editable)) {
            th thVar = biVar.t2;
            if (thVar != null) {
                thVar.D(thVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, fhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        biVar.D1 = codePointCount;
        biVar.m1.a(codePointCount > 0, true);
        int i11 = biVar.C1;
        if (i11 <= 0 || (i3 = i11 - biVar.D1) > 100) {
            h6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 9));
            h6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i3 < -9999) {
                i3 = -9999;
            }
            long j10 = i3;
            h6Var2.c(org.telegram.messenger.bd.E(j10, ','), h6Var2.getVisibility() == 0, true);
            if (h6Var2.getVisibility() != 0) {
                h6Var2.setVisibility(0);
                h6Var2.setAlpha(0.0f);
                h6Var2.setScaleX(0.5f);
                h6Var2.setScaleY(0.5f);
            }
            h6Var2.animate().setListener(null).cancel();
            h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i3 < 0) {
                org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.p7, biVar.J0);
                z10 = false;
            } else {
                org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.y6, biVar.J0);
                z10 = true;
            }
            h6Var.c(org.telegram.messenger.bd.E(j10, ','), false, true);
            h6Var.setAlpha(1.0f);
        }
        if (biVar.P2 != z10) {
            biVar.P2 = z10;
            biVar.D2.invalidate();
        }
        if (!biVar.d4 && !org.telegram.messenger.hp.s1(i10).D3() && !org.telegram.messenger.h10.i(i10).q() && biVar.D1 > org.telegram.messenger.hp.s1(i10).T4 && biVar.D1 < org.telegram.messenger.hp.s1(i10).U4) {
            biVar.d4 = true;
            biVar.D1(this.c);
        }
        if (biVar.U1) {
            if (fhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fhVar.getText().toString().trim())) {
                z11 = true;
            }
            biVar.B1(z11);
        }
        biVar.Q0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.a = true;
        }
        bi biVar = this.d;
        if (biVar.z4 == null) {
            bi.K0(biVar);
        }
        if (biVar.z4.getAdapter() != null) {
            biVar.z4.setReversed(true);
            biVar.z4.getAdapter().U(charSequence, biVar.K2.getEditText().getSelectionStart(), null, false, false);
            biVar.J1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
