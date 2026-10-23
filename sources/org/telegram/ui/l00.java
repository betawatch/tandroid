package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class l00 implements TextWatcher {
    public final /* synthetic */ n00 a;

    public l00(n00 n00Var) {
        this.a = n00Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        q00 q00Var = this.a.e;
        if (!TextUtils.equals(editable, q00Var.w)) {
            q00Var.n = !TextUtils.isEmpty(editable);
            q00Var.w = org.telegram.ui.Components.a6.onlyEmojiSpans(editable);
            e00 e00Var = q00Var.I;
            if (e00Var != null) {
                e00Var.e(org.telegram.ui.Components.a6.cloneSpans(q00Var.w, -1, e00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            f00 f00Var = q00Var.J;
            if (f00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = f00Var.r;
                if (q00.k0(q00Var.w)) {
                    str = LocaleController.getString(q00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                t3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.o2) q00Var).actionBar;
            CharSequence charSequence = q00Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.o2) q00Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.a6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        q00Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
