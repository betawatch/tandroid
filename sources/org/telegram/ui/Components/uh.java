package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ ki d;

    public uh(ki kiVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = kiVar;
        this.c = o2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i9;
        ki kiVar = this.d;
        j6 j6Var = kiVar.s;
        th thVar = kiVar.L0;
        int i10 = kiVar.F1;
        j6 j6Var2 = kiVar.v;
        if (this.b != TextUtils.isEmpty(editable)) {
            ci ciVar = kiVar.u0;
            if (ciVar != null) {
                ciVar.A(ciVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, thVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        kiVar.H = codePointCount;
        kiVar.e.a(codePointCount > 0, true);
        int i11 = kiVar.G;
        if (i11 <= 0 || (i9 = i11 - kiVar.H) > 100) {
            j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.xp(this, 11));
            j6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i9 < -9999) {
                i9 = -9999;
            }
            long j10 = i9;
            j6Var2.c(LocaleController.formatNumber(j10, ','), j6Var2.getVisibility() == 0, true);
            if (j6Var2.getVisibility() != 0) {
                j6Var2.setVisibility(0);
                j6Var2.setAlpha(0.0f);
                j6Var2.setScaleX(0.5f);
                j6Var2.setScaleY(0.5f);
            }
            j6Var2.animate().setListener(null).cancel();
            j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i9 < 0) {
                j6Var2.setTextColor(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
                z10 = false;
            } else {
                j6Var2.setTextColor(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.y6));
                z10 = true;
            }
            j6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            j6Var.setAlpha(1.0f);
        }
        if (kiVar.Q0 != z10) {
            kiVar.Q0 = z10;
            kiVar.E0.invalidate();
        }
        if (!kiVar.e2 && !MessagesController.getInstance(i10).premiumFeaturesBlocked() && !UserConfig.getInstance(i10).isPremium() && kiVar.H > MessagesController.getInstance(i10).captionLengthLimitDefault && kiVar.H < MessagesController.getInstance(i10).captionLengthLimitPremium) {
            kiVar.e2 = true;
            kiVar.O1(this.c);
        }
        if (kiVar.Y) {
            if (thVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(thVar.getText().toString().trim())) {
                z11 = true;
            }
            kiVar.M1(z11);
        }
        kiVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.a = true;
        }
        ki kiVar = this.d;
        if (kiVar.x2 == null) {
            ki.P(kiVar);
        }
        if (kiVar.x2.getAdapter() != null) {
            kiVar.x2.setReversed(true);
            kiVar.x2.getAdapter().U(charSequence, kiVar.L0.getEditText().getSelectionStart(), null, false, false);
            kiVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
