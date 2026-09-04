package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class i80 implements TextWatcher {
    public final /* synthetic */ j80 a;

    public i80(j80 j80Var) {
        this.a = j80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        l80 l80Var = this.a.f;
        if (l80Var.d.d.length() != 0) {
            l80Var.E = true;
            l80Var.y = true;
            h80 h80Var = l80Var.s;
            if (!h80Var.h) {
                h80Var.h = true;
                h80Var.l();
            }
            l80Var.s.E(l80Var.d.d.toString());
            l80Var.h.setFastScrollVisible(false);
            l80Var.h.setVerticalScrollBarEnabled(true);
            l80Var.r.e(true, true);
            l80Var.r.setStickerType(1);
            l80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            l80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        l80Var.E = false;
        l80Var.y = false;
        h80 h80Var2 = l80Var.s;
        if (h80Var2.h) {
            h80Var2.h = false;
            h80Var2.l();
        }
        l80Var.s.E(null);
        l80Var.h.setFastScrollVisible(true);
        l80Var.h.setVerticalScrollBarEnabled(false);
        l80Var.r.e(false, true);
        l80Var.r.setStickerType(0);
        l80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        l80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
