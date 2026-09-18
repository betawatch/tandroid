package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c10 implements TextWatcher {
    public final /* synthetic */ e10 a;

    public c10(e10 e10Var) {
        this.a = e10Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        h10 h10Var = this.a.e;
        if (!TextUtils.equals(editable, h10Var.w)) {
            h10Var.n = !TextUtils.isEmpty(editable);
            h10Var.w = org.telegram.ui.Components.x5.onlyEmojiSpans(editable);
            v00 v00Var = h10Var.I;
            if (v00Var != null) {
                v00Var.e(org.telegram.ui.Components.x5.cloneSpans(h10Var.w, -1, v00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
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
            kVar = ((org.telegram.ui.ActionBar.o2) h10Var).actionBar;
            CharSequence charSequence = h10Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.o2) h10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.x5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
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
