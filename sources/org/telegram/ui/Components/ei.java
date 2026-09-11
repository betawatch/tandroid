package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ei implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ vi d;

    public ei(vi viVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = viVar;
        this.c = n2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        vi viVar = this.d;
        q6 q6Var = viVar.s;
        di diVar = viVar.P0;
        int i11 = viVar.J1;
        q6 q6Var2 = viVar.v;
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
            Emoji.replaceEmoji(editable, diVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        viVar.L = codePointCount;
        viVar.e.a(codePointCount > 0, true);
        int i12 = viVar.K;
        if (i12 <= 0 || (i10 = i12 - viVar.L) > 100) {
            q6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new j6(this, 8));
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
        if (!viVar.i2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && viVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && viVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            viVar.i2 = true;
            viVar.O1(this.c);
        }
        if (viVar.c0) {
            if (diVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(diVar.getText().toString().trim())) {
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
        vi viVar = this.d;
        if (viVar.B2 == null) {
            vi.Q(viVar);
        }
        if (viVar.B2.getAdapter() != null) {
            viVar.B2.setReversed(true);
            viVar.B2.getAdapter().U(charSequence, viVar.P0.getEditText().getSelectionStart(), null, false, false);
            viVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
