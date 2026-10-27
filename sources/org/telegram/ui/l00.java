package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l00 implements TextWatcher {
    public final /* synthetic */ n00 a;

    public l00(n00 n00Var) {
        this.a = n00Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3;
        String str;
        q00 q00Var = this.a.e;
        if (!TextUtils.equals(editable, q00Var.w)) {
            q00Var.n = !TextUtils.isEmpty(editable);
            q00Var.w = org.telegram.ui.Components.c6.onlyEmojiSpans(editable);
            e00 e00Var = q00Var.I;
            if (e00Var != null) {
                e00Var.e(org.telegram.ui.Components.c6.cloneSpans(q00Var.w, -1, e00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            f00 f00Var = q00Var.J;
            if (f00Var != null) {
                org.telegram.ui.Cells.y3 y3Var = f00Var.r;
                if (q00.m0(q00Var.w)) {
                    str = LocaleController.getString(q00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                y3Var.setText(str);
            }
            if (q00Var.s && TextUtils.isEmpty(q00Var.w)) {
                r5Var3 = ((org.telegram.ui.ActionBar.r2) q00Var).simpleActionBar;
                r5Var3.setTitle(LocaleController.getString(R.string.FilterNew));
            } else {
                r5Var = ((org.telegram.ui.ActionBar.r2) q00Var).simpleActionBar;
                CharSequence charSequence = q00Var.w;
                r5Var2 = ((org.telegram.ui.ActionBar.r2) q00Var).simpleActionBar;
                r5Var.setTitle(org.telegram.ui.Components.c6.cloneSpans(charSequence, -1, r5Var2.getTitleFontMetricsInt()));
            }
        }
        q00Var.k0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
