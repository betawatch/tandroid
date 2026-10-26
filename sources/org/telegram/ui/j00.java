package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j00 implements TextWatcher {
    public final /* synthetic */ l00 a;

    public j00(l00 l00Var) {
        this.a = l00Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3;
        String str;
        o00 o00Var = this.a.e;
        if (!TextUtils.equals(editable, o00Var.w)) {
            o00Var.n = !TextUtils.isEmpty(editable);
            o00Var.w = org.telegram.ui.Components.c6.onlyEmojiSpans(editable);
            c00 c00Var = o00Var.I;
            if (c00Var != null) {
                c00Var.e(org.telegram.ui.Components.c6.cloneSpans(o00Var.w, -1, c00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            d00 d00Var = o00Var.J;
            if (d00Var != null) {
                org.telegram.ui.Cells.y3 y3Var = d00Var.r;
                if (o00.m0(o00Var.w)) {
                    str = LocaleController.getString(o00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                y3Var.setText(str);
            }
            if (o00Var.s && TextUtils.isEmpty(o00Var.w)) {
                r5Var3 = ((org.telegram.ui.ActionBar.r2) o00Var).simpleActionBar;
                r5Var3.setTitle(LocaleController.getString(R.string.FilterNew));
            } else {
                r5Var = ((org.telegram.ui.ActionBar.r2) o00Var).simpleActionBar;
                CharSequence charSequence = o00Var.w;
                r5Var2 = ((org.telegram.ui.ActionBar.r2) o00Var).simpleActionBar;
                r5Var.setTitle(org.telegram.ui.Components.c6.cloneSpans(charSequence, -1, r5Var2.getTitleFontMetricsInt()));
            }
        }
        o00Var.k0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
