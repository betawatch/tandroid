package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ai implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 c;
    public final /* synthetic */ ti d;

    public ai(ti tiVar, org.telegram.ui.ActionBar.r2 r2Var) {
        this.d = tiVar;
        this.c = r2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        ti tiVar = this.d;
        s6 s6Var = tiVar.s;
        yh yhVar = tiVar.S0;
        int i11 = tiVar.M1;
        s6 s6Var2 = tiVar.v;
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
            Emoji.replaceEmoji(editable, yhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        tiVar.L = codePointCount;
        tiVar.e.a(codePointCount > 0, true);
        int i12 = tiVar.K;
        if (i12 <= 0 || (i10 = i12 - tiVar.L) > 100) {
            s6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.qp(this, 11));
            s6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            s6Var2.c(LocaleController.formatNumber(j10, ','), s6Var2.getVisibility() == 0, true);
            if (s6Var2.getVisibility() != 0) {
                s6Var2.setVisibility(0);
                s6Var2.setAlpha(0.0f);
                s6Var2.setScaleX(0.5f);
                s6Var2.setScaleY(0.5f);
            }
            s6Var2.animate().setListener(null).cancel();
            s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                int i13 = org.telegram.ui.ActionBar.y6.p7;
                u6Var2 = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
                org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, u6Var2);
                z10 = false;
            } else {
                int i14 = org.telegram.ui.ActionBar.y6.y6;
                u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
                org.telegram.ui.ActionBar.f7.Z(s6Var2, i14, u6Var);
                z10 = true;
            }
            s6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            s6Var.setAlpha(1.0f);
        }
        if (tiVar.X0 != z10) {
            tiVar.X0 = z10;
            tiVar.L0.invalidate();
        }
        if (!tiVar.l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && tiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && tiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            tiVar.l2 = true;
            tiVar.V1(this.c);
        }
        if (tiVar.c0) {
            if (yhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(yhVar.getText().toString().trim())) {
                z11 = true;
            }
            tiVar.T1(z11);
        }
        tiVar.i1(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.a = true;
        }
        ti tiVar = this.d;
        if (tiVar.H2 == null) {
            ti.M(tiVar);
        }
        if (tiVar.H2.getAdapter() != null) {
            tiVar.H2.setReversed(true);
            tiVar.H2.getAdapter().U(charSequence, tiVar.S0.getEditText().getSelectionStart(), null, false, false);
            tiVar.b2();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
