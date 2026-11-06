package li;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class u implements TextWatcher {
    public final /* synthetic */ v a;

    public u(v vVar) {
        this.a = vVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        v vVar = this.a;
        TL_iv.RichMessage richMessage = vVar.a2;
        if (richMessage != null && richMessage != null) {
            vVar.a2 = null;
            vVar.X1.i(hd.M0(2131754059, null), true, true);
            l41 l41Var = vVar.R1;
            if (l41Var != null) {
                l41Var.O(true);
            }
        }
        vVar.d1();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
