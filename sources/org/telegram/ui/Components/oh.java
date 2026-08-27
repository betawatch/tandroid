package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class oh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ gi c;

    public oh(gi giVar) {
        this.c = giVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        gi giVar = this.c;
        j6 j6Var = giVar.v;
        mh mhVar = giVar.A0;
        j6 j6Var2 = giVar.s;
        if (this.b != TextUtils.isEmpty(editable)) {
            yh yhVar = giVar.u0;
            if (yhVar != null) {
                yhVar.C(yhVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z11 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        giVar.H = codePointCount;
        giVar.e.a(codePointCount > 0, true);
        int i11 = giVar.G;
        if (i11 <= 0 || (i10 = i11 - giVar.H) > 100) {
            j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.am(this, 12));
            j6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            j6Var2.c(LocaleController.formatNumber(j10, ','), j6Var2.getVisibility() == 0, true);
            if (j6Var2.getVisibility() != 0) {
                j6Var2.setVisibility(0);
                j6Var2.setAlpha(0.0f);
                j6Var2.setScaleX(0.5f);
                j6Var2.setScaleY(0.5f);
            }
            j6Var2.animate().setListener(null).cancel();
            j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                j6Var2.setTextColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                z10 = false;
            } else {
                j6Var2.setTextColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
                z10 = true;
            }
            j6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            j6Var.setAlpha(1.0f);
        }
        if (giVar.Q0 != z10) {
            giVar.Q0 = z10;
            giVar.E0.invalidate();
        }
        if (!giVar.Y) {
            if (mhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(mhVar.getText().toString().trim())) {
                z11 = true;
            }
            giVar.M1(z11);
        }
        giVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        gi giVar = this.c;
        if (giVar.x2 == null) {
            gi.Q(giVar);
        }
        if (giVar.x2.getAdapter() != null) {
            giVar.x2.setReversed(false);
            giVar.x2.getAdapter().U(charSequence, giVar.A0.getEditText().getSelectionStart(), null, false, false);
            giVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
