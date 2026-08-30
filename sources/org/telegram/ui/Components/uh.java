package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uh implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ li d;

    public uh(li liVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = liVar;
        this.c = p2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        int i10;
        li liVar = this.d;
        k6 k6Var = liVar.s;
        th thVar = liVar.M0;
        int i11 = liVar.G1;
        k6 k6Var2 = liVar.v;
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
            Emoji.replaceEmoji(editable, thVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        liVar.I = codePointCount;
        liVar.e.a(codePointCount > 0, true);
        int i12 = liVar.H;
        if (i12 <= 0 || (i10 = i12 - liVar.I) > 100) {
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
        if (!liVar.f2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && liVar.I > MessagesController.getInstance(i11).captionLengthLimitDefault && liVar.I < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            liVar.f2 = true;
            liVar.O1(this.c);
        }
        if (liVar.Z) {
            if (thVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(thVar.getText().toString().trim())) {
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
        li liVar = this.d;
        if (liVar.y2 == null) {
            li.Q(liVar);
        }
        if (liVar.y2.getAdapter() != null) {
            liVar.y2.setReversed(true);
            liVar.y2.getAdapter().U(charSequence, liVar.M0.getEditText().getSelectionStart(), null, false, false);
            liVar.U1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
