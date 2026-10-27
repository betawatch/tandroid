package li;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v implements TextWatcher {
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        w wVar = this.a;
        TL_iv.RichMessage richMessage = wVar.i0;
        if (richMessage != null && richMessage != null) {
            wVar.i0 = null;
            wVar.f0.i(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            k71 k71Var = wVar.Z;
            if (k71Var != null) {
                k71Var.O(true);
            }
        }
        wVar.P();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
