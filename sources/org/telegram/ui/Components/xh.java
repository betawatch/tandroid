package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ ni d;

    public xh(ni niVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = niVar;
        this.c = o2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        ni niVar = this.d;
        o6 o6Var = niVar.s;
        wh whVar = niVar.L0;
        int i11 = niVar.F1;
        o6 o6Var2 = niVar.v;
        if (this.b != TextUtils.isEmpty(editable)) {
            fi fiVar = niVar.u0;
            if (fiVar != null) {
                fiVar.B(fiVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, whVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        niVar.H = codePointCount;
        niVar.e.a(codePointCount > 0, true);
        int i12 = niVar.G;
        if (i12 <= 0 || (i10 = i12 - niVar.H) > 100) {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.bm(this, 13));
            o6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            o6Var2.c(LocaleController.formatNumber(j10, ','), o6Var2.getVisibility() == 0, true);
            if (o6Var2.getVisibility() != 0) {
                o6Var2.setVisibility(0);
                o6Var2.setAlpha(0.0f);
                o6Var2.setScaleX(0.5f);
                o6Var2.setScaleY(0.5f);
            }
            o6Var2.animate().setListener(null).cancel();
            o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                o6Var2.setTextColor(niVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                z10 = false;
            } else {
                o6Var2.setTextColor(niVar.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
                z10 = true;
            }
            o6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            o6Var.setAlpha(1.0f);
        }
        if (niVar.Q0 != z10) {
            niVar.Q0 = z10;
            niVar.E0.invalidate();
        }
        if (!niVar.e2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && niVar.H > MessagesController.getInstance(i11).captionLengthLimitDefault && niVar.H < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            niVar.e2 = true;
            niVar.O1(this.c);
        }
        if (niVar.Y) {
            if (whVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(whVar.getText().toString().trim())) {
                z11 = true;
            }
            niVar.M1(z11);
        }
        niVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        ni niVar = this.d;
        if (niVar.x2 == null) {
            ni.Q(niVar);
        }
        if (niVar.x2.getAdapter() != null) {
            niVar.x2.setReversed(true);
            niVar.x2.getAdapter().U(charSequence, niVar.L0.getEditText().getSelectionStart(), null, false, false);
            niVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
