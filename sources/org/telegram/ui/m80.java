package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m80 implements TextWatcher {
    public final /* synthetic */ n80 a;

    public m80(n80 n80Var) {
        this.a = n80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        p80 p80Var = this.a.f;
        if (p80Var.d.d.length() != 0) {
            p80Var.E = true;
            p80Var.y = true;
            l80 l80Var = p80Var.s;
            if (!l80Var.h) {
                l80Var.h = true;
                l80Var.l();
            }
            p80Var.s.E(p80Var.d.d.toString());
            p80Var.h.setFastScrollVisible(false);
            p80Var.h.setVerticalScrollBarEnabled(true);
            p80Var.r.e(true, true);
            p80Var.r.setStickerType(1);
            p80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            p80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        p80Var.E = false;
        p80Var.y = false;
        l80 l80Var2 = p80Var.s;
        if (l80Var2.h) {
            l80Var2.h = false;
            l80Var2.l();
        }
        p80Var.s.E(null);
        p80Var.h.setFastScrollVisible(true);
        p80Var.h.setVerticalScrollBarEnabled(false);
        p80Var.r.e(false, true);
        p80Var.r.setStickerType(0);
        p80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        p80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
