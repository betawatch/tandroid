package bi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.q51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
            zVar.X1.i(dd.L0(2131754059, null), true, true);
            q51 q51Var = zVar.R1;
            if (q51Var != null) {
                q51Var.O(true);
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
