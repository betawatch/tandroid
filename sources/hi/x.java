package hi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x implements TextWatcher {
    public final /* synthetic */ y a;

    public x(y yVar) {
        this.a = yVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        y yVar = this.a;
        TL_iv.RichMessage richMessage = yVar.i0;
        if (richMessage != null && richMessage != null) {
            yVar.i0 = null;
            yVar.f0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            j61 j61Var = yVar.Z;
            if (j61Var != null) {
                j61Var.N(true);
            }
        }
        yVar.P();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
