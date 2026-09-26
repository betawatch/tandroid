package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class mh1 implements TextWatcher {
    public final /* synthetic */ UsersSelectActivity a;

    public mh1(UsersSelectActivity usersSelectActivity) {
        this.a = usersSelectActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.a;
        if (usersSelectActivity.c.length() == 0) {
            usersSelectActivity.M = false;
            usersSelectActivity.L = false;
            ph1 ph1Var = usersSelectActivity.h;
            if (ph1Var.n) {
                ph1Var.n = false;
                ph1Var.l();
            }
            usersSelectActivity.h.L(null);
            usersSelectActivity.d.setFastScrollVisible(true);
            usersSelectActivity.d.setVerticalScrollBarEnabled(false);
            usersSelectActivity.f.d.setText(LocaleController.getString(R.string.NoContacts));
            return;
        }
        ph1 ph1Var2 = usersSelectActivity.h;
        boolean z10 = ph1Var2.n;
        if (!z10) {
            usersSelectActivity.M = true;
            usersSelectActivity.L = true;
            if (!z10) {
                ph1Var2.n = true;
                ph1Var2.l();
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
