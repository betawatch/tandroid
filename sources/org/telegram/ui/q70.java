package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q70 implements TextWatcher {
    public final /* synthetic */ r70 a;

    public q70(r70 r70Var) {
        this.a = r70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        t70 t70Var = this.a.f;
        if (t70Var.d.d.length() != 0) {
            t70Var.A = true;
            t70Var.y = true;
            p70 p70Var = t70Var.s;
            if (!p70Var.h) {
                p70Var.h = true;
                p70Var.l();
            }
            t70Var.s.E(t70Var.d.d.toString());
            t70Var.h.setFastScrollVisible(false);
            t70Var.h.setVerticalScrollBarEnabled(true);
            t70Var.r.e(true, true);
            t70Var.r.setStickerType(1);
            t70Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            t70Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        t70Var.A = false;
        t70Var.y = false;
        p70 p70Var2 = t70Var.s;
        if (p70Var2.h) {
            p70Var2.h = false;
            p70Var2.l();
        }
        t70Var.s.E(null);
        t70Var.h.setFastScrollVisible(true);
        t70Var.h.setVerticalScrollBarEnabled(false);
        t70Var.r.e(false, true);
        t70Var.r.setStickerType(0);
        t70Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        t70Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
