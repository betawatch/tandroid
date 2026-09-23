package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f80 implements TextWatcher {
    public final /* synthetic */ g80 a;

    public f80(g80 g80Var) {
        this.a = g80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        i80 i80Var = this.a.f;
        if (i80Var.d.d.length() != 0) {
            i80Var.E = true;
            i80Var.y = true;
            e80 e80Var = i80Var.s;
            if (!e80Var.h) {
                e80Var.h = true;
                e80Var.l();
            }
            i80Var.s.E(i80Var.d.d.toString());
            i80Var.h.setFastScrollVisible(false);
            i80Var.h.setVerticalScrollBarEnabled(true);
            i80Var.r.e(true, true);
            i80Var.r.setStickerType(1);
            i80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            i80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        i80Var.E = false;
        i80Var.y = false;
        e80 e80Var2 = i80Var.s;
        if (e80Var2.h) {
            e80Var2.h = false;
            e80Var2.l();
        }
        i80Var.s.E(null);
        i80Var.h.setFastScrollVisible(true);
        i80Var.h.setVerticalScrollBarEnabled(false);
        i80Var.r.e(false, true);
        i80Var.r.setStickerType(0);
        i80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        i80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
