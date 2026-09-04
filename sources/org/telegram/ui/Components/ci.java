package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ci implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ vi c;

    public ci(vi viVar) {
        this.c = viVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        vi viVar = this.c;
        q6 q6Var = viVar.v;
        ai aiVar = viVar.E0;
        q6 q6Var2 = viVar.s;
        if (this.b != TextUtils.isEmpty(editable)) {
            ni niVar = viVar.y0;
            if (niVar != null) {
                niVar.B(niVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, aiVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        viVar.L = codePointCount;
        viVar.e.a(codePointCount > 0, true);
        int i11 = viVar.K;
        if (i11 <= 0 || (i10 = i11 - viVar.L) > 100) {
            q6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new j6(this, 7));
            q6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j3 = i10;
            q6Var2.c(LocaleController.formatNumber(j3, ','), q6Var2.getVisibility() == 0, true);
            if (q6Var2.getVisibility() != 0) {
                q6Var2.setVisibility(0);
                q6Var2.setAlpha(0.0f);
                q6Var2.setScaleX(0.5f);
                q6Var2.setScaleY(0.5f);
            }
            q6Var2.animate().setListener(null).cancel();
            q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                q6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                z10 = false;
            } else {
                q6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                z10 = true;
            }
            q6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            q6Var.setAlpha(1.0f);
        }
        if (viVar.U0 != z10) {
            viVar.U0 = z10;
            viVar.I0.invalidate();
        }
        if (!viVar.c0) {
            if (aiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(aiVar.getText().toString().trim())) {
                z11 = true;
            }
            viVar.M1(z11);
        }
        viVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        vi viVar = this.c;
        if (viVar.B2 == null) {
            vi.Q(viVar);
        }
        if (viVar.B2.getAdapter() != null) {
            viVar.B2.setReversed(false);
            viVar.B2.getAdapter().U(charSequence, viVar.E0.getEditText().getSelectionStart(), null, false, false);
            viVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
