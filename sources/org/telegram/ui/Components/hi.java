package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hi implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ yi d;

    public hi(yi yiVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = yiVar;
        this.c = n2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        yi yiVar = this.d;
        r6 r6Var = yiVar.s;
        gi giVar = yiVar.S0;
        int i11 = yiVar.M1;
        r6 r6Var2 = yiVar.v;
        if (this.b != TextUtils.isEmpty(editable)) {
            qi qiVar = yiVar.B0;
            if (qiVar != null) {
                qiVar.E(qiVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, giVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        yiVar.L = codePointCount;
        yiVar.e.a(codePointCount > 0, true);
        int i12 = yiVar.K;
        if (i12 <= 0 || (i10 = i12 - yiVar.L) > 100) {
            r6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new t8(this, 5));
            r6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j3 = i10;
            r6Var2.c(LocaleController.formatNumber(j3, ','), r6Var2.getVisibility() == 0, true);
            if (r6Var2.getVisibility() != 0) {
                r6Var2.setVisibility(0);
                r6Var2.setAlpha(0.0f);
                r6Var2.setScaleX(0.5f);
                r6Var2.setScaleY(0.5f);
            }
            r6Var2.animate().setListener(null).cancel();
            r6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                r6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.p7));
                z10 = false;
            } else {
                r6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.y6));
                z10 = true;
            }
            r6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            r6Var.setAlpha(1.0f);
        }
        if (yiVar.X0 != z10) {
            yiVar.X0 = z10;
            yiVar.L0.invalidate();
        }
        if (!yiVar.l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && yiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && yiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            yiVar.l2 = true;
            yiVar.S1(this.c);
        }
        if (yiVar.c0) {
            if (giVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(giVar.getText().toString().trim())) {
                z11 = true;
            }
            yiVar.Q1(z11);
        }
        yiVar.f1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        yi yiVar = this.d;
        if (yiVar.E2 == null) {
            yi.S(yiVar);
        }
        if (yiVar.E2.getAdapter() != null) {
            yiVar.E2.setReversed(true);
            yiVar.E2.getAdapter().U(charSequence, yiVar.S0.getEditText().getSelectionStart(), null, false, false);
            yiVar.Y1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
