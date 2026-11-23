package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bi implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 c;
    public final /* synthetic */ ui d;

    public bi(ui uiVar, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = uiVar;
        this.c = g2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i7;
        ui uiVar = this.d;
        o6 o6Var = uiVar.u1;
        zh zhVar = uiVar.N2;
        int i10 = uiVar.H3;
        o6 o6Var2 = uiVar.v1;
        if (this.b != TextUtils.isEmpty(editable)) {
            mi miVar = uiVar.w2;
            if (miVar != null) {
                miVar.E(miVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, zhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        uiVar.G1 = codePointCount;
        uiVar.p1.a(codePointCount > 0, true);
        int i11 = uiVar.F1;
        if (i11 <= 0 || (i7 = i11 - uiVar.G1) > 100) {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y(this, 10));
            o6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            o6Var2.c(org.telegram.messenger.hd.E(j3, ','), o6Var2.getVisibility() == 0, true);
            if (o6Var2.getVisibility() != 0) {
                o6Var2.setVisibility(0);
                o6Var2.setAlpha(0.0f);
                o6Var2.setScaleX(0.5f);
                o6Var2.setScaleY(0.5f);
            }
            o6Var2.animate().setListener(null).cancel();
            o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.p7, uiVar.J0);
                z10 = false;
            } else {
                org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.y6, uiVar.J0);
                z10 = true;
            }
            o6Var.c(org.telegram.messenger.hd.E(j3, ','), false, true);
            o6Var.setAlpha(1.0f);
        }
        if (uiVar.S2 != z10) {
            uiVar.S2 = z10;
            uiVar.G2.invalidate();
        }
        if (!uiVar.g4 && !org.telegram.messenger.np.u1(i10).K3() && !org.telegram.messenger.k10.i(i10).q() && uiVar.G1 > org.telegram.messenger.np.u1(i10).W4 && uiVar.G1 < org.telegram.messenger.np.u1(i10).X4) {
            uiVar.g4 = true;
            uiVar.E1(this.c);
        }
        if (uiVar.X1) {
            if (zhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(zhVar.getText().toString().trim())) {
                z11 = true;
            }
            uiVar.C1(z11);
        }
        uiVar.R0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.a = true;
        }
        ui uiVar = this.d;
        if (uiVar.C4 == null) {
            ui.L0(uiVar);
        }
        if (uiVar.C4.getAdapter() != null) {
            uiVar.C4.setReversed(true);
            uiVar.C4.getAdapter().U(charSequence, uiVar.N2.getEditText().getSelectionStart(), null, false, false);
            uiVar.K1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
