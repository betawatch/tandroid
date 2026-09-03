package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b80 implements TextWatcher {
    public final /* synthetic */ c80 a;

    public b80(c80 c80Var) {
        this.a = c80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        e80 e80Var = this.a.f;
        if (e80Var.d.d.length() != 0) {
            e80Var.B = true;
            e80Var.y = true;
            a80 a80Var = e80Var.s;
            if (!a80Var.h) {
                a80Var.h = true;
                a80Var.l();
            }
            e80Var.s.E(e80Var.d.d.toString());
            e80Var.h.setFastScrollVisible(false);
            e80Var.h.setVerticalScrollBarEnabled(true);
            e80Var.r.e(true, true);
            e80Var.r.setStickerType(1);
            e80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            e80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        e80Var.B = false;
        e80Var.y = false;
        a80 a80Var2 = e80Var.s;
        if (a80Var2.h) {
            a80Var2.h = false;
            a80Var2.l();
        }
        e80Var.s.E(null);
        e80Var.h.setFastScrollVisible(true);
        e80Var.h.setVerticalScrollBarEnabled(false);
        e80Var.r.e(false, true);
        e80Var.r.setStickerType(0);
        e80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        e80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
