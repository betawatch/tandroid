package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class di implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ ti d;

    public di(ti tiVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = tiVar;
        this.c = n2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        ti tiVar = this.d;
        q6 q6Var = tiVar.s;
        ci ciVar = tiVar.S0;
        int i11 = tiVar.M1;
        q6 q6Var2 = tiVar.v;
        if (this.b != TextUtils.isEmpty(editable)) {
            li liVar = tiVar.B0;
            if (liVar != null) {
                liVar.D(liVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, ciVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        tiVar.L = codePointCount;
        tiVar.e.a(codePointCount > 0, true);
        int i12 = tiVar.K;
        if (i12 <= 0 || (i10 = i12 - tiVar.L) > 100) {
            q6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.nq(this, 10));
            q6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            q6Var2.c(LocaleController.formatNumber(j10, ','), q6Var2.getVisibility() == 0, true);
            if (q6Var2.getVisibility() != 0) {
                q6Var2.setVisibility(0);
                q6Var2.setAlpha(0.0f);
                q6Var2.setScaleX(0.5f);
                q6Var2.setScaleY(0.5f);
            }
            q6Var2.animate().setListener(null).cancel();
            q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                q6Var2.setTextColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.p7));
                z10 = false;
            } else {
                q6Var2.setTextColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.y6));
                z10 = true;
            }
            q6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            q6Var.setAlpha(1.0f);
        }
        if (tiVar.X0 != z10) {
            tiVar.X0 = z10;
            tiVar.L0.invalidate();
        }
        if (!tiVar.l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && tiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && tiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            tiVar.l2 = true;
            tiVar.S1(this.c);
        }
        if (tiVar.c0) {
            if (ciVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ciVar.getText().toString().trim())) {
                z11 = true;
            }
            tiVar.Q1(z11);
        }
        tiVar.f1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        ti tiVar = this.d;
        if (tiVar.E2 == null) {
            ti.S(tiVar);
        }
        if (tiVar.E2.getAdapter() != null) {
            tiVar.E2.setReversed(true);
            tiVar.E2.getAdapter().U(charSequence, tiVar.S0.getEditText().getSelectionStart(), null, false, false);
            tiVar.Y1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
