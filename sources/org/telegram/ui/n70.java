package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n70 implements TextWatcher {
    public final /* synthetic */ o70 a;

    public n70(o70 o70Var) {
        this.a = o70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        q70 q70Var = this.a.f;
        if (q70Var.d.d.length() != 0) {
            q70Var.A = true;
            q70Var.y = true;
            m70 m70Var = q70Var.s;
            if (!m70Var.h) {
                m70Var.h = true;
                m70Var.l();
            }
            q70Var.s.E(q70Var.d.d.toString());
            q70Var.h.setFastScrollVisible(false);
            q70Var.h.setVerticalScrollBarEnabled(true);
            q70Var.r.e(true, true);
            q70Var.r.setStickerType(1);
            q70Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            q70Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        q70Var.A = false;
        q70Var.y = false;
        m70 m70Var2 = q70Var.s;
        if (m70Var2.h) {
            m70Var2.h = false;
            m70Var2.l();
        }
        q70Var.s.E(null);
        q70Var.h.setFastScrollVisible(true);
        q70Var.h.setVerticalScrollBarEnabled(false);
        q70Var.r.e(false, true);
        q70Var.r.setStickerType(0);
        q70Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        q70Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
