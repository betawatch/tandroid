package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class hg1 implements TextWatcher {
    public final /* synthetic */ UsersSelectActivity a;

    public hg1(UsersSelectActivity usersSelectActivity) {
        this.a = usersSelectActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.a;
        if (usersSelectActivity.c.length() == 0) {
            usersSelectActivity.M = false;
            usersSelectActivity.L = false;
            kg1 kg1Var = usersSelectActivity.h;
            if (kg1Var.n) {
                kg1Var.n = false;
                kg1Var.l();
            }
            usersSelectActivity.h.L(null);
            usersSelectActivity.d.setFastScrollVisible(true);
            usersSelectActivity.d.setVerticalScrollBarEnabled(false);
            usersSelectActivity.f.d.setText(LocaleController.getString(R.string.NoContacts));
            return;
        }
        kg1 kg1Var2 = usersSelectActivity.h;
        boolean z10 = kg1Var2.n;
        if (!z10) {
            usersSelectActivity.M = true;
            usersSelectActivity.L = true;
            if (!z10) {
                kg1Var2.n = true;
                kg1Var2.l();
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
