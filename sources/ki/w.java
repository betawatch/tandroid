package ki;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
            u61 u61Var = xVar.Z;
            if (u61Var != null) {
                u61Var.N(true);
            }
        }
        xVar.Q();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
