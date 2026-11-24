// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b3b implements TextWatcher {
    public final /* synthetic */ NumberTextView a;
    public final /* synthetic */ a3b b;

    public b3b(NumberTextView numberTextView, a3b a3bVar) {
        this.a = numberTextView;
        this.b = a3bVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.b.setErrorText(null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
