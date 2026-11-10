package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;
    public final /* synthetic */ ci d;

    public jh(ci ciVar, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = ciVar;
        this.c = f2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        int i7;
        ci ciVar = this.d;
        i6 i6Var = ciVar.t1;
        hh hhVar = ciVar.M2;
        int i10 = ciVar.G3;
        i6 i6Var2 = ciVar.u1;
        if (this.b != TextUtils.isEmpty(editable)) {
            uh uhVar = ciVar.v2;
            if (uhVar != null) {
                uhVar.D(uhVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z10 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, hhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        ciVar.F1 = codePointCount;
        ciVar.o1.a(codePointCount > 0, true);
        int i11 = ciVar.E1;
        if (i11 <= 0 || (i7 = i11 - ciVar.F1) > 100) {
            i6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y5(this, 9));
            i6Var.setAlpha(0.0f);
            z9 = true;
        } else {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            i6Var2.c(org.telegram.messenger.id.E(j3, ','), i6Var2.getVisibility() == 0, true);
            if (i6Var2.getVisibility() != 0) {
                i6Var2.setVisibility(0);
                i6Var2.setAlpha(0.0f);
                i6Var2.setScaleX(0.5f);
                i6Var2.setScaleY(0.5f);
            }
            i6Var2.animate().setListener(null).cancel();
            i6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.p7, ciVar.I0);
                z9 = false;
            } else {
                org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.y6, ciVar.I0);
                z9 = true;
            }
            i6Var.c(org.telegram.messenger.id.E(j3, ','), false, true);
            i6Var.setAlpha(1.0f);
        }
        if (ciVar.R2 != z9) {
            ciVar.R2 = z9;
            ciVar.F2.invalidate();
        }
        if (!ciVar.f4 && !org.telegram.messenger.qp.s1(i10).D3() && !org.telegram.messenger.p10.i(i10).q() && ciVar.F1 > org.telegram.messenger.qp.s1(i10).T4 && ciVar.F1 < org.telegram.messenger.qp.s1(i10).U4) {
            ciVar.f4 = true;
            ciVar.D1(this.c);
        }
        if (ciVar.W1) {
            if (hhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(hhVar.getText().toString().trim())) {
                z10 = true;
            }
            ciVar.B1(z10);
        }
        ciVar.Q0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.a = true;
        }
        ci ciVar = this.d;
        if (ciVar.B4 == null) {
            ci.K0(ciVar);
        }
        if (ciVar.B4.getAdapter() != null) {
            ciVar.B4.setReversed(true);
            ciVar.B4.getAdapter().U(charSequence, ciVar.M2.getEditText().getSelectionStart(), null, false, false);
            ciVar.J1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
