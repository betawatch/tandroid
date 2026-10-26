package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q70 extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ w70 a;

    public q70(w70 w70Var) {
        this.a = w70Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        w70.Z(this.a);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        int length = editText.length();
        w70 w70Var = this.a;
        if (length == 0) {
            w70.Z(w70Var);
            return;
        }
        w70Var.x = true;
        t70 t70Var = w70Var.s;
        if (!t70Var.h) {
            t70Var.h = true;
            t70Var.l();
        }
        w70Var.s.E(editText.getText().toString());
        w70Var.h.setFastScrollVisible(false);
        w70Var.h.setVerticalScrollBarEnabled(true);
        w70Var.r.e(true, true);
        w70Var.r.setStickerType(1);
        w70Var.r.d.setText(LocaleController.getString(R.string.NoResult));
        w70Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
    }
}
