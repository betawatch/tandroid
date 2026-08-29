package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ni c;

    public vh(ni niVar) {
        this.c = niVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        ni niVar = this.c;
        o6 o6Var = niVar.v;
        th thVar = niVar.A0;
        o6 o6Var2 = niVar.s;
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
            Emoji.replaceEmoji(editable, thVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        niVar.H = codePointCount;
        niVar.e.a(codePointCount > 0, true);
        int i11 = niVar.G;
        if (i11 <= 0 || (i10 = i11 - niVar.H) > 100) {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.bm(this, 12));
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
        if (!niVar.Y) {
            if (thVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(thVar.getText().toString().trim())) {
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
        ni niVar = this.c;
        if (niVar.x2 == null) {
            ni.Q(niVar);
        }
        if (niVar.x2.getAdapter() != null) {
            niVar.x2.setReversed(false);
            niVar.x2.getAdapter().U(charSequence, niVar.A0.getEditText().getSelectionStart(), null, false, false);
            niVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
