package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p70 implements TextWatcher {
    public final /* synthetic */ q70 a;

    public p70(q70 q70Var) {
        this.a = q70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        s70 s70Var = this.a.f;
        if (s70Var.d.d.length() != 0) {
            s70Var.A = true;
            s70Var.y = true;
            o70 o70Var = s70Var.s;
            if (!o70Var.h) {
                o70Var.h = true;
                o70Var.l();
            }
            s70Var.s.E(s70Var.d.d.toString());
            s70Var.h.setFastScrollVisible(false);
            s70Var.h.setVerticalScrollBarEnabled(true);
            s70Var.r.e(true, true);
            s70Var.r.setStickerType(1);
            s70Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            s70Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        s70Var.A = false;
        s70Var.y = false;
        o70 o70Var2 = s70Var.s;
        if (o70Var2.h) {
            o70Var2.h = false;
            o70Var2.l();
        }
        s70Var.s.E(null);
        s70Var.h.setFastScrollVisible(true);
        s70Var.h.setVerticalScrollBarEnabled(false);
        s70Var.r.e(false, true);
        s70Var.r.setStickerType(0);
        s70Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        s70Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
