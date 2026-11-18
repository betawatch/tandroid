package oi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class t implements TextWatcher {
    public final /* synthetic */ u a;

    public t(u uVar) {
        this.a = uVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        u uVar = this.a;
        TL_iv.RichMessage richMessage = uVar.e2;
        if (richMessage != null && richMessage != null) {
            uVar.e2 = null;
            uVar.b2.i(gd.M0(2131754057, null), true, true);
            z41 z41Var = uVar.V1;
            if (z41Var != null) {
                z41Var.O(true);
            }
        }
        uVar.e1();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
