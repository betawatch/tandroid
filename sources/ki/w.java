package ki;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class w implements TextWatcher {
    public final /* synthetic */ x a;

    public w(x xVar) {
        this.a = xVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        x xVar = this.a;
        TL_iv.RichMessage richMessage = xVar.i0;
        if (richMessage != null && richMessage != null) {
            xVar.i0 = null;
            xVar.f0.i(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            b71 b71Var = xVar.Z;
            if (b71Var != null) {
                b71Var.N(true);
            }
        }
        xVar.P();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
