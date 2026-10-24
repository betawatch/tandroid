package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ng1 implements TextWatcher {
    public final /* synthetic */ UsersSelectActivity a;

    public ng1(UsersSelectActivity usersSelectActivity) {
        this.a = usersSelectActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.a;
        if (usersSelectActivity.c.length() == 0) {
            usersSelectActivity.M = false;
            usersSelectActivity.L = false;
            qg1 qg1Var = usersSelectActivity.h;
            if (qg1Var.n) {
                qg1Var.n = false;
                qg1Var.l();
            }
            usersSelectActivity.h.L(null);
            usersSelectActivity.d.setFastScrollVisible(true);
            usersSelectActivity.d.setVerticalScrollBarEnabled(false);
            usersSelectActivity.f.d.setText(LocaleController.getString(R.string.NoContacts));
            return;
        }
        qg1 qg1Var2 = usersSelectActivity.h;
        boolean z10 = qg1Var2.n;
        if (!z10) {
            usersSelectActivity.M = true;
            usersSelectActivity.L = true;
            if (!z10) {
                qg1Var2.n = true;
                qg1Var2.l();
            }
            usersSelectActivity.d.setFastScrollVisible(false);
            usersSelectActivity.d.setVerticalScrollBarEnabled(true);
            usersSelectActivity.f.d.setText(LocaleController.getString(R.string.NoResult));
        }
        usersSelectActivity.f.e(true, true);
        usersSelectActivity.h.L(usersSelectActivity.c.getText().toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
