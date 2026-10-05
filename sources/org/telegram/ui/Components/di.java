package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class di implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ xi d;

    public di(xi xiVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = xiVar;
        this.c = n2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        xi xiVar = this.d;
        p6 p6Var = xiVar.s;
        bi biVar = xiVar.P0;
        int i11 = xiVar.J1;
        p6 p6Var2 = xiVar.v;
        if (this.b != TextUtils.isEmpty(editable)) {
            pi piVar = xiVar.y0;
            if (piVar != null) {
                piVar.A(piVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, biVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        xiVar.L = codePointCount;
        xiVar.e.a(codePointCount > 0, true);
        int i12 = xiVar.K;
        if (i12 <= 0 || (i10 = i12 - xiVar.L) > 100) {
            p6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new r8(this, 5));
            p6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j3 = i10;
            p6Var2.c(LocaleController.formatNumber(j3, ','), p6Var2.getVisibility() == 0, true);
            if (p6Var2.getVisibility() != 0) {
                p6Var2.setVisibility(0);
                p6Var2.setAlpha(0.0f);
                p6Var2.setScaleX(0.5f);
                p6Var2.setScaleY(0.5f);
            }
            p6Var2.animate().setListener(null).cancel();
            p6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                p6Var2.setTextColor(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.p7));
                z10 = false;
            } else {
                p6Var2.setTextColor(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.y6));
                z10 = true;
            }
            p6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            p6Var.setAlpha(1.0f);
        }
        if (xiVar.U0 != z10) {
            xiVar.U0 = z10;
            xiVar.I0.invalidate();
        }
        if (!xiVar.i2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && xiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && xiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            xiVar.i2 = true;
            xiVar.N1(this.c);
        }
        if (xiVar.c0) {
            if (biVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(biVar.getText().toString().trim())) {
                z11 = true;
            }
            xiVar.L1(z11);
        }
        xiVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        xi xiVar = this.d;
        if (xiVar.B2 == null) {
            xi.H(xiVar);
        }
        if (xiVar.B2.getAdapter() != null) {
            xiVar.B2.setReversed(true);
            xiVar.B2.getAdapter().U(charSequence, xiVar.P0.getEditText().getSelectionStart(), null, false, false);
            xiVar.T1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
