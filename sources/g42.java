// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g42 implements TextWatcher {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ TextView c;

    public g42(f42 f42Var, TextView textView) {
        this.c = textView;
        this.b = TextUtils.isEmpty(f42Var.getText());
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
                    textView.setText(ob6.M0(isEmpty ? 2131746048 : 2131754479, null));
                    break;
                }
                break;
            default:
                boolean isEmpty2 = TextUtils.isEmpty(editable);
                if (isEmpty2 != this.b) {
                    this.b = isEmpty2;
                    textView.setText(ob6.M0(isEmpty2 ? 2131746048 : 2131754479, null));
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

    public g42(f42 f42Var, TextView textView, byte b) {
        this.c = textView;
        this.b = TextUtils.isEmpty(f42Var.getText());
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
