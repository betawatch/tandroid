package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class o70 implements TextWatcher {
    public final /* synthetic */ p70 a;

    public o70(p70 p70Var) {
        this.a = p70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        r70 r70Var = this.a.f;
        if (r70Var.d.d.length() != 0) {
            r70Var.E = true;
            r70Var.y = true;
            n70 n70Var = r70Var.s;
            if (!n70Var.h) {
                n70Var.h = true;
                n70Var.l();
            }
            r70Var.s.E(r70Var.d.d.toString());
            r70Var.h.setFastScrollVisible(false);
            r70Var.h.setVerticalScrollBarEnabled(true);
            r70Var.r.e(true, true);
            r70Var.r.setStickerType(1);
            r70Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            r70Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        r70Var.E = false;
        r70Var.y = false;
        n70 n70Var2 = r70Var.s;
        if (n70Var2.h) {
            n70Var2.h = false;
            n70Var2.l();
        }
        r70Var.s.E(null);
        r70Var.h.setFastScrollVisible(true);
        r70Var.h.setVerticalScrollBarEnabled(false);
        r70Var.r.e(false, true);
        r70Var.r.setStickerType(0);
        r70Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        r70Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
