package li;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class u implements TextWatcher {
    public final /* synthetic */ v a;

    public u(v vVar) {
        this.a = vVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        v vVar = this.a;
        TL_iv.RichMessage richMessage = vVar.d2;
        if (richMessage != null && richMessage != null) {
            vVar.d2 = null;
            vVar.a2.i(id.M0(2131754059, null), true, true);
            m41 m41Var = vVar.U1;
            if (m41Var != null) {
                m41Var.O(true);
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
