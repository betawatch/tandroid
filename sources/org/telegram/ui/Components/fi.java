package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fi implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ yi c;

    public fi(yi yiVar) {
        this.c = yiVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        yi yiVar = this.c;
        o6 o6Var = yiVar.v;
        di diVar = yiVar.E0;
        o6 o6Var2 = yiVar.s;
        if (this.b != TextUtils.isEmpty(editable)) {
            qi qiVar = yiVar.y0;
            if (qiVar != null) {
                qiVar.A(qiVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, diVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        yiVar.L = codePointCount;
        yiVar.e.a(codePointCount > 0, true);
        int i11 = yiVar.K;
        if (i11 <= 0 || (i10 = i11 - yiVar.L) > 100) {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.Cells.v5(this, 24));
            o6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j3 = i10;
            o6Var2.c(LocaleController.formatNumber(j3, ','), o6Var2.getVisibility() == 0, true);
            if (o6Var2.getVisibility() != 0) {
                o6Var2.setVisibility(0);
                o6Var2.setAlpha(0.0f);
                o6Var2.setScaleX(0.5f);
                o6Var2.setScaleY(0.5f);
            }
            o6Var2.animate().setListener(null).cancel();
            o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                o6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                z10 = false;
            } else {
                o6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                z10 = true;
            }
            o6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            o6Var.setAlpha(1.0f);
        }
        if (yiVar.U0 != z10) {
            yiVar.U0 = z10;
            yiVar.I0.invalidate();
        }
        if (!yiVar.c0) {
            if (diVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(diVar.getText().toString().trim())) {
                z11 = true;
            }
            yiVar.M1(z11);
        }
        yiVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        yi yiVar = this.c;
        if (yiVar.B2 == null) {
            yi.Q(yiVar);
        }
        if (yiVar.B2.getAdapter() != null) {
            yiVar.B2.setReversed(false);
            yiVar.B2.getAdapter().U(charSequence, yiVar.E0.getEditText().getSelectionStart(), null, false, false);
            yiVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
