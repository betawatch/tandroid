package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g10 implements TextWatcher {
    public final /* synthetic */ i10 a;

    public g10(i10 i10Var) {
        this.a = i10Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        l10 l10Var = this.a.e;
        if (!TextUtils.equals(editable, l10Var.w)) {
            l10Var.n = !TextUtils.isEmpty(editable);
            l10Var.w = org.telegram.ui.Components.b6.onlyEmojiSpans(editable);
            z00 z00Var = l10Var.I;
            if (z00Var != null) {
                z00Var.e(org.telegram.ui.Components.b6.cloneSpans(l10Var.w, -1, z00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            a10 a10Var = l10Var.J;
            if (a10Var != null) {
                org.telegram.ui.Cells.u3 u3Var = a10Var.r;
                if (l10.k0(l10Var.w)) {
                    str = LocaleController.getString(l10Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                u3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.m2) l10Var).actionBar;
            CharSequence charSequence = l10Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.m2) l10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.b6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        l10Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
