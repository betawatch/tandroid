package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i00 implements TextWatcher {
    public final /* synthetic */ k00 a;

    public i00(k00 k00Var) {
        this.a = k00Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        n00 n00Var = this.a.e;
        if (!TextUtils.equals(editable, n00Var.w)) {
            n00Var.n = !TextUtils.isEmpty(editable);
            n00Var.w = org.telegram.ui.Components.t5.onlyEmojiSpans(editable);
            b00 b00Var = n00Var.E;
            if (b00Var != null) {
                b00Var.e(org.telegram.ui.Components.t5.cloneSpans(n00Var.w, -1, b00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            c00 c00Var = n00Var.F;
            if (c00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = c00Var.r;
                if (n00.j0(n00Var.w)) {
                    str = LocaleController.getString(n00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                u3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.o2) n00Var).actionBar;
            CharSequence charSequence = n00Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.o2) n00Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.t5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        n00Var.h0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
