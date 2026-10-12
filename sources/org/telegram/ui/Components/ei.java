package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ei implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;
    public final /* synthetic */ vi d;

    public ei(vi viVar, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = viVar;
        this.c = m2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        vi viVar = this.d;
        s6 s6Var = viVar.s;
        di diVar = viVar.S0;
        int i11 = viVar.M1;
        s6 s6Var2 = viVar.v;
        if (this.b != TextUtils.isEmpty(editable)) {
            ni niVar = viVar.B0;
            if (niVar != null) {
                niVar.E(niVar.getSelectedItemsCount());
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
        viVar.L = codePointCount;
        viVar.e.a(codePointCount > 0, true);
        int i12 = viVar.K;
        if (i12 <= 0 || (i10 = i12 - viVar.L) > 100) {
            s6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new l6(this, 8));
            s6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            s6Var2.c(LocaleController.formatNumber(j10, ','), s6Var2.getVisibility() == 0, true);
            if (s6Var2.getVisibility() != 0) {
                s6Var2.setVisibility(0);
                s6Var2.setAlpha(0.0f);
                s6Var2.setScaleX(0.5f);
                s6Var2.setScaleY(0.5f);
            }
            s6Var2.animate().setListener(null).cancel();
            s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                s6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                z10 = false;
            } else {
                s6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
                z10 = true;
            }
            s6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            s6Var.setAlpha(1.0f);
        }
        if (viVar.X0 != z10) {
            viVar.X0 = z10;
            viVar.L0.invalidate();
        }
        if (!viVar.l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && viVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && viVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            viVar.l2 = true;
            viVar.S1(this.c);
        }
        if (viVar.c0) {
            if (diVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(diVar.getText().toString().trim())) {
                z11 = true;
            }
            viVar.Q1(z11);
        }
        viVar.f1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        vi viVar = this.d;
        if (viVar.E2 == null) {
            vi.S(viVar);
        }
        if (viVar.E2.getAdapter() != null) {
            viVar.E2.setReversed(true);
            viVar.E2.getAdapter().U(charSequence, viVar.S0.getEditText().getSelectionStart(), null, false, false);
            viVar.Y1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
