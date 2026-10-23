package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
            n00Var.w = org.telegram.ui.Components.a6.onlyEmojiSpans(editable);
            b00 b00Var = n00Var.I;
            if (b00Var != null) {
                b00Var.e(org.telegram.ui.Components.a6.cloneSpans(n00Var.w, -1, b00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            c00 c00Var = n00Var.J;
            if (c00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = c00Var.r;
                if (n00.k0(n00Var.w)) {
                    str = LocaleController.getString(n00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                t3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.n2) n00Var).actionBar;
            CharSequence charSequence = n00Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.n2) n00Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.a6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        n00Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
