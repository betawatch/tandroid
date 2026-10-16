package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f10 implements TextWatcher {
    public final /* synthetic */ h10 a;

    public f10(h10 h10Var) {
        this.a = h10Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        k10 k10Var = this.a.e;
        if (!TextUtils.equals(editable, k10Var.w)) {
            k10Var.n = !TextUtils.isEmpty(editable);
            k10Var.w = org.telegram.ui.Components.b6.onlyEmojiSpans(editable);
            y00 y00Var = k10Var.I;
            if (y00Var != null) {
                y00Var.e(org.telegram.ui.Components.b6.cloneSpans(k10Var.w, -1, y00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            z00 z00Var = k10Var.J;
            if (z00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = z00Var.r;
                if (k10.k0(k10Var.w)) {
                    str = LocaleController.getString(k10Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                u3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.m2) k10Var).actionBar;
            CharSequence charSequence = k10Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.m2) k10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.b6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        k10Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
