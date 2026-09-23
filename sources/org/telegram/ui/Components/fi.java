package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fi implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ wi d;

    public fi(wi wiVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = wiVar;
        this.c = n2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        wi wiVar = this.d;
        p6 p6Var = wiVar.s;
        ei eiVar = wiVar.P0;
        int i11 = wiVar.J1;
        p6 p6Var2 = wiVar.v;
        if (this.b != TextUtils.isEmpty(editable)) {
            oi oiVar = wiVar.y0;
            if (oiVar != null) {
                oiVar.A(oiVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, eiVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        wiVar.L = codePointCount;
        wiVar.e.a(codePointCount > 0, true);
        int i12 = wiVar.K;
        if (i12 <= 0 || (i10 = i12 - wiVar.L) > 100) {
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
                p6Var2.setTextColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.p7));
                z10 = false;
            } else {
                p6Var2.setTextColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.y6));
                z10 = true;
            }
            p6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            p6Var.setAlpha(1.0f);
        }
        if (wiVar.U0 != z10) {
            wiVar.U0 = z10;
            wiVar.I0.invalidate();
        }
        if (!wiVar.i2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && wiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && wiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            wiVar.i2 = true;
            wiVar.O1(this.c);
        }
        if (wiVar.c0) {
            if (eiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(eiVar.getText().toString().trim())) {
                z11 = true;
            }
            wiVar.M1(z11);
        }
        wiVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        wi wiVar = this.d;
        if (wiVar.B2 == null) {
            wi.Q(wiVar);
        }
        if (wiVar.B2.getAdapter() != null) {
            wiVar.B2.setReversed(true);
            wiVar.B2.getAdapter().U(charSequence, wiVar.P0.getEditText().getSelectionStart(), null, false, false);
            wiVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
