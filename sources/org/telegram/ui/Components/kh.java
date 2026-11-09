package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;
    public final /* synthetic */ di d;

    public kh(di diVar, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = diVar;
        this.c = f2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        int i7;
        di diVar = this.d;
        j6 j6Var = diVar.q1;
        ih ihVar = diVar.J2;
        int i10 = diVar.D3;
        j6 j6Var2 = diVar.r1;
        if (this.b != TextUtils.isEmpty(editable)) {
            vh vhVar = diVar.s2;
            if (vhVar != null) {
                vhVar.D(vhVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z10 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, ihVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        diVar.C1 = codePointCount;
        diVar.l1.a(codePointCount > 0, true);
        int i11 = diVar.B1;
        if (i11 <= 0 || (i7 = i11 - diVar.C1) > 100) {
            j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new z5(this, 9));
            j6Var.setAlpha(0.0f);
            z9 = true;
        } else {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            j6Var2.c(org.telegram.messenger.id.E(j3, ','), j6Var2.getVisibility() == 0, true);
            if (j6Var2.getVisibility() != 0) {
                j6Var2.setVisibility(0);
                j6Var2.setAlpha(0.0f);
                j6Var2.setScaleX(0.5f);
                j6Var2.setScaleY(0.5f);
            }
            j6Var2.animate().setListener(null).cancel();
            j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.s6.Y(j6Var2, org.telegram.ui.ActionBar.l6.p7, diVar.I0);
                z9 = false;
            } else {
                org.telegram.ui.ActionBar.s6.Y(j6Var2, org.telegram.ui.ActionBar.l6.y6, diVar.I0);
                z9 = true;
            }
            j6Var.c(org.telegram.messenger.id.E(j3, ','), false, true);
            j6Var.setAlpha(1.0f);
        }
        if (diVar.O2 != z9) {
            diVar.O2 = z9;
            diVar.C2.invalidate();
        }
        if (!diVar.c4 && !org.telegram.messenger.qp.s1(i10).D3() && !org.telegram.messenger.p10.i(i10).q() && diVar.C1 > org.telegram.messenger.qp.s1(i10).T4 && diVar.C1 < org.telegram.messenger.qp.s1(i10).U4) {
            diVar.c4 = true;
            diVar.D1(this.c);
        }
        if (diVar.T1) {
            if (ihVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ihVar.getText().toString().trim())) {
                z10 = true;
            }
            diVar.B1(z10);
        }
        diVar.Q0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.a = true;
        }
        di diVar = this.d;
        if (diVar.y4 == null) {
            di.K0(diVar);
        }
        if (diVar.y4.getAdapter() != null) {
            diVar.y4.setReversed(true);
            diVar.y4.getAdapter().U(charSequence, diVar.J2.getEditText().getSelectionStart(), null, false, false);
            diVar.J1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
