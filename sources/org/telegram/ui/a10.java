package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class a10 implements TextWatcher {
    public final /* synthetic */ c10 a;

    public a10(c10 c10Var) {
        this.a = c10Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        f10 f10Var = this.a.e;
        if (!TextUtils.equals(editable, f10Var.w)) {
            f10Var.n = !TextUtils.isEmpty(editable);
            f10Var.w = org.telegram.ui.Components.z5.onlyEmojiSpans(editable);
            t00 t00Var = f10Var.I;
            if (t00Var != null) {
                t00Var.e(org.telegram.ui.Components.z5.cloneSpans(f10Var.w, -1, t00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            u00 u00Var = f10Var.J;
            if (u00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = u00Var.r;
                if (f10.k0(f10Var.w)) {
                    str = LocaleController.getString(f10Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                t3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.n2) f10Var).actionBar;
            CharSequence charSequence = f10Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.n2) f10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.z5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        f10Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
