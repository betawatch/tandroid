package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k80 implements TextWatcher {
    public final /* synthetic */ l80 a;

    public k80(l80 l80Var) {
        this.a = l80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        n80 n80Var = this.a.f;
        if (n80Var.d.d.length() != 0) {
            n80Var.E = true;
            n80Var.y = true;
            j80 j80Var = n80Var.s;
            if (!j80Var.h) {
                j80Var.h = true;
                j80Var.l();
            }
            n80Var.s.E(n80Var.d.d.toString());
            n80Var.h.setFastScrollVisible(false);
            n80Var.h.setVerticalScrollBarEnabled(true);
            n80Var.r.e(true, true);
            n80Var.r.setStickerType(1);
            n80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            n80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        n80Var.E = false;
        n80Var.y = false;
        j80 j80Var2 = n80Var.s;
        if (j80Var2.h) {
            j80Var2.h = false;
            j80Var2.l();
        }
        n80Var.s.E(null);
        n80Var.h.setFastScrollVisible(true);
        n80Var.h.setVerticalScrollBarEnabled(false);
        n80Var.r.e(false, true);
        n80Var.r.setStickerType(0);
        n80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        n80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
