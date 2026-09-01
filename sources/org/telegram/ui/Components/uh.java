package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class uh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ mi d;

    public uh(mi miVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = miVar;
        this.c = p2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        int i10;
        mi miVar = this.d;
        k6 k6Var = miVar.s;
        th thVar = miVar.M0;
        int i11 = miVar.G1;
        k6 k6Var2 = miVar.v;
        if (this.b != TextUtils.isEmpty(editable)) {
            ei eiVar = miVar.v0;
            if (eiVar != null) {
                eiVar.B(eiVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z10 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, thVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        miVar.I = codePointCount;
        miVar.e.a(codePointCount > 0, true);
        int i12 = miVar.H;
        if (i12 <= 0 || (i10 = i12 - miVar.I) > 100) {
            k6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new a9(this, 4));
            k6Var.setAlpha(0.0f);
            z4 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            k6Var2.c(LocaleController.formatNumber(j10, ','), k6Var2.getVisibility() == 0, true);
            if (k6Var2.getVisibility() != 0) {
                k6Var2.setVisibility(0);
                k6Var2.setAlpha(0.0f);
                k6Var2.setScaleX(0.5f);
                k6Var2.setScaleY(0.5f);
            }
            k6Var2.animate().setListener(null).cancel();
            k6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                k6Var2.setTextColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                z4 = false;
            } else {
                k6Var2.setTextColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.y6));
                z4 = true;
            }
            k6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            k6Var.setAlpha(1.0f);
        }
        if (miVar.R0 != z4) {
            miVar.R0 = z4;
            miVar.F0.invalidate();
        }
        if (!miVar.f2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && miVar.I > MessagesController.getInstance(i11).captionLengthLimitDefault && miVar.I < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            miVar.f2 = true;
            miVar.O1(this.c);
        }
        if (miVar.Z) {
            if (thVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(thVar.getText().toString().trim())) {
                z10 = true;
            }
            miVar.M1(z10);
        }
        miVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        mi miVar = this.d;
        if (miVar.y2 == null) {
            mi.Q(miVar);
        }
        if (miVar.y2.getAdapter() != null) {
            miVar.y2.setReversed(true);
            miVar.y2.getAdapter().U(charSequence, miVar.M0.getEditText().getSelectionStart(), null, false, false);
            miVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
