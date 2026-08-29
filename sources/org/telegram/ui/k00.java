package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k00 implements TextWatcher {
    public final /* synthetic */ m00 a;

    public k00(m00 m00Var) {
        this.a = m00Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        String str;
        p00 p00Var = this.a.e;
        if (!TextUtils.equals(editable, p00Var.w)) {
            p00Var.n = !TextUtils.isEmpty(editable);
            p00Var.w = org.telegram.ui.Components.y5.onlyEmojiSpans(editable);
            d00 d00Var = p00Var.E;
            if (d00Var != null) {
                d00Var.e(org.telegram.ui.Components.y5.cloneSpans(p00Var.w, -1, d00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            e00 e00Var = p00Var.F;
            if (e00Var != null) {
                org.telegram.ui.Cells.r3 r3Var = e00Var.r;
                if (p00.k0(p00Var.w)) {
                    str = LocaleController.getString(p00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                r3Var.setText(str);
            }
            lVar = ((org.telegram.ui.ActionBar.o2) p00Var).actionBar;
            CharSequence charSequence = p00Var.w;
            lVar2 = ((org.telegram.ui.ActionBar.o2) p00Var).actionBar;
            lVar.setTitle(org.telegram.ui.Components.y5.cloneSpans(charSequence, -1, lVar2.getTitleFontMetricsInt()));
        }
        p00Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
