// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lx7 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ lx7(PasscodeActivity passcodeActivity, byte b) {
        this.a = b;
        this.b = passcodeActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        PasscodeActivity passcodeActivity = this.b;
        switch (b) {
            case 0:
                gx7 gx7Var = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.n.removeCallbacks(gx7Var);
                    gx7Var.run();
                    break;
                }
                break;
            default:
                gx7 gx7Var2 = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.n.removeCallbacks(gx7Var2);
                    gx7Var2.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
