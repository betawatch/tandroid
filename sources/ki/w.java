package ki;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
            t61 t61Var = xVar.Z;
            if (t61Var != null) {
                t61Var.N(true);
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
