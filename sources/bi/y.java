package bi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.p51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class y implements TextWatcher {
    public final /* synthetic */ z a;

    public y(z zVar) {
        this.a = zVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        z zVar = this.a;
        TL_iv.RichMessage richMessage = zVar.a2;
        if (richMessage != null && richMessage != null) {
            zVar.a2 = null;
            zVar.X1.i(cd.L0(2131754059, null), true, true);
            p51 p51Var = zVar.R1;
            if (p51Var != null) {
                p51Var.O(true);
            }
        }
        zVar.d1();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
