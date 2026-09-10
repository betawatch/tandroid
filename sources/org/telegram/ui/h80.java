package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h80 implements TextWatcher {
    public final /* synthetic */ i80 a;

    public h80(i80 i80Var) {
        this.a = i80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        k80 k80Var = this.a.f;
        if (k80Var.d.d.length() != 0) {
            k80Var.E = true;
            k80Var.y = true;
            g80 g80Var = k80Var.s;
            if (!g80Var.h) {
                g80Var.h = true;
                g80Var.l();
            }
            k80Var.s.E(k80Var.d.d.toString());
            k80Var.h.setFastScrollVisible(false);
            k80Var.h.setVerticalScrollBarEnabled(true);
            k80Var.r.e(true, true);
            k80Var.r.setStickerType(1);
            k80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            k80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        k80Var.E = false;
        k80Var.y = false;
        g80 g80Var2 = k80Var.s;
        if (g80Var2.h) {
            g80Var2.h = false;
            g80Var2.l();
        }
        k80Var.s.E(null);
        k80Var.h.setFastScrollVisible(true);
        k80Var.h.setVerticalScrollBarEnabled(false);
        k80Var.r.e(false, true);
        k80Var.r.setStickerType(0);
        k80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        k80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
