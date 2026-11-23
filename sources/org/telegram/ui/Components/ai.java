package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ai implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 c;
    public final /* synthetic */ ti d;

    public ai(ti tiVar, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = tiVar;
        this.c = g2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i7;
        ti tiVar = this.d;
        n6 n6Var = tiVar.u1;
        yh yhVar = tiVar.N2;
        int i10 = tiVar.H3;
        n6 n6Var2 = tiVar.v1;
        if (this.b != TextUtils.isEmpty(editable)) {
            li liVar = tiVar.w2;
            if (liVar != null) {
                liVar.D(liVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, yhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        tiVar.G1 = codePointCount;
        tiVar.p1.a(codePointCount > 0, true);
        int i11 = tiVar.F1;
        if (i11 <= 0 || (i7 = i11 - tiVar.G1) > 100) {
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
                org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.p7, tiVar.J0);
                z10 = false;
            } else {
                org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.y6, tiVar.J0);
                z10 = true;
            }
            n6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
            n6Var.setAlpha(1.0f);
        }
        if (tiVar.S2 != z10) {
            tiVar.S2 = z10;
            tiVar.G2.invalidate();
        }
        if (!tiVar.g4 && !org.telegram.messenger.mp.u1(i10).K3() && !org.telegram.messenger.i10.i(i10).q() && tiVar.G1 > org.telegram.messenger.mp.u1(i10).W4 && tiVar.G1 < org.telegram.messenger.mp.u1(i10).X4) {
            tiVar.g4 = true;
            tiVar.E1(this.c);
        }
        if (tiVar.X1) {
            if (yhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(yhVar.getText().toString().trim())) {
                z11 = true;
            }
            tiVar.C1(z11);
        }
        tiVar.R0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.a = true;
        }
        ti tiVar = this.d;
        if (tiVar.C4 == null) {
            ti.L0(tiVar);
        }
        if (tiVar.C4.getAdapter() != null) {
            tiVar.C4.setReversed(true);
            tiVar.C4.getAdapter().U(charSequence, tiVar.N2.getEditText().getSelectionStart(), null, false, false);
            tiVar.K1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
