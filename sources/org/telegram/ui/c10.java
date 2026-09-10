package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c10 implements TextWatcher {
    public final /* synthetic */ e10 a;

    public c10(e10 e10Var) {
        this.a = e10Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        String str;
        h10 h10Var = this.a.e;
        if (!TextUtils.equals(editable, h10Var.w)) {
            h10Var.n = !TextUtils.isEmpty(editable);
            h10Var.w = org.telegram.ui.Components.y5.onlyEmojiSpans(editable);
            v00 v00Var = h10Var.I;
            if (v00Var != null) {
                v00Var.e(org.telegram.ui.Components.y5.cloneSpans(h10Var.w, -1, v00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            w00 w00Var = h10Var.J;
            if (w00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = w00Var.r;
                if (h10.k0(h10Var.w)) {
                    str = LocaleController.getString(h10Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                t3Var.setText(str);
            }
            lVar = ((org.telegram.ui.ActionBar.p2) h10Var).actionBar;
            CharSequence charSequence = h10Var.w;
            lVar2 = ((org.telegram.ui.ActionBar.p2) h10Var).actionBar;
            lVar.setTitle(org.telegram.ui.Components.y5.cloneSpans(charSequence, -1, lVar2.getTitleFontMetricsInt()));
        }
        h10Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
