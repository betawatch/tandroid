package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a80 implements TextWatcher {
    public final /* synthetic */ b80 a;

    public a80(b80 b80Var) {
        this.a = b80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        d80 d80Var = this.a.f;
        if (d80Var.d.d.length() != 0) {
            d80Var.B = true;
            d80Var.y = true;
            z70 z70Var = d80Var.s;
            if (!z70Var.h) {
                z70Var.h = true;
                z70Var.l();
            }
            d80Var.s.E(d80Var.d.d.toString());
            d80Var.h.setFastScrollVisible(false);
            d80Var.h.setVerticalScrollBarEnabled(true);
            d80Var.r.e(true, true);
            d80Var.r.setStickerType(1);
            d80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            d80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        d80Var.B = false;
        d80Var.y = false;
        z70 z70Var2 = d80Var.s;
        if (z70Var2.h) {
            z70Var2.h = false;
            z70Var2.l();
        }
        d80Var.s.E(null);
        d80Var.h.setFastScrollVisible(true);
        d80Var.h.setVerticalScrollBarEnabled(false);
        d80Var.r.e(false, true);
        d80Var.r.setStickerType(0);
        d80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        d80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
