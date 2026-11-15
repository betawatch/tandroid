package oi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.p41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            uVar.b2.i(hd.M0(2131754059, null), true, true);
            p41 p41Var = uVar.V1;
            if (p41Var != null) {
                p41Var.O(true);
            }
        }
        uVar.d1();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
