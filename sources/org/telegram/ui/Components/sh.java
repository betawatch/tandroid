package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ li c;

    public sh(li liVar) {
        this.c = liVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        int i10;
        li liVar = this.c;
        k6 k6Var = liVar.v;
        qh qhVar = liVar.B0;
        k6 k6Var2 = liVar.s;
        if (this.b != TextUtils.isEmpty(editable)) {
            di diVar = liVar.v0;
            if (diVar != null) {
                diVar.B(diVar.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z10 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, qhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        liVar.I = codePointCount;
        liVar.e.a(codePointCount > 0, true);
        int i11 = liVar.H;
        if (i11 <= 0 || (i10 = i11 - liVar.I) > 100) {
            k6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new a9(this, 3));
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
                k6Var2.setTextColor(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                z4 = false;
            } else {
                k6Var2.setTextColor(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                z4 = true;
            }
            k6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            k6Var.setAlpha(1.0f);
        }
        if (liVar.R0 != z4) {
            liVar.R0 = z4;
            liVar.F0.invalidate();
        }
        if (!liVar.Z) {
            if (qhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(qhVar.getText().toString().trim())) {
                z10 = true;
            }
            liVar.M1(z10);
        }
        liVar.d1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        li liVar = this.c;
        if (liVar.y2 == null) {
            li.Q(liVar);
        }
        if (liVar.y2.getAdapter() != null) {
            liVar.y2.setReversed(false);
            liVar.y2.getAdapter().U(charSequence, liVar.B0.getEditText().getSelectionStart(), null, false, false);
            liVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
