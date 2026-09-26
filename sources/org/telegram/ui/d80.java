package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class d80 implements TextWatcher {
    public final /* synthetic */ e80 a;

    public d80(e80 e80Var) {
        this.a = e80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        g80 g80Var = this.a.f;
        if (g80Var.d.d.length() != 0) {
            g80Var.E = true;
            g80Var.y = true;
            c80 c80Var = g80Var.s;
            if (!c80Var.h) {
                c80Var.h = true;
                c80Var.l();
            }
            g80Var.s.E(g80Var.d.d.toString());
            g80Var.h.setFastScrollVisible(false);
            g80Var.h.setVerticalScrollBarEnabled(true);
            g80Var.r.e(true, true);
            g80Var.r.setStickerType(1);
            g80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            g80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        g80Var.E = false;
        g80Var.y = false;
        c80 c80Var2 = g80Var.s;
        if (c80Var2.h) {
            c80Var2.h = false;
            c80Var2.l();
        }
        g80Var.s.E(null);
        g80Var.h.setFastScrollVisible(true);
        g80Var.h.setVerticalScrollBarEnabled(false);
        g80Var.r.e(false, true);
        g80Var.r.setStickerType(0);
        g80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        g80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
