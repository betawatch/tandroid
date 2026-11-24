// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b52 implements TextWatcher {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ TextView c;

    public b52(a52 a52Var, TextView textView) {
        this.c = textView;
        this.b = TextUtils.isEmpty(a52Var.getText());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        TextView textView = this.c;
        switch (b) {
            case 0:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.b) {
                    this.b = isEmpty;
                    textView.setText(jb6.M0(isEmpty ? 2131746054 : 2131754483, null));
                    break;
                }
                break;
            default:
                boolean isEmpty2 = TextUtils.isEmpty(editable);
                if (isEmpty2 != this.b) {
                    this.b = isEmpty2;
                    textView.setText(jb6.M0(isEmpty2 ? 2131746054 : 2131754483, null));
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    public b52(a52 a52Var, TextView textView, byte b) {
        this.c = textView;
        this.b = TextUtils.isEmpty(a52Var.getText());
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
