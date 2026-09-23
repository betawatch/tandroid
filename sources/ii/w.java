package ii;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
            xVar.f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            v51 v51Var = xVar.Z;
            if (v51Var != null) {
                v51Var.N(true);
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
