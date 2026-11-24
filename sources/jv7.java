// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jv7 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ jv7(PasscodeActivity passcodeActivity, byte b) {
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
                ev7 ev7Var = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.n.removeCallbacks(ev7Var);
                    ev7Var.run();
                    break;
                }
                break;
            default:
                ev7 ev7Var2 = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.n.removeCallbacks(ev7Var2);
                    ev7Var2.run();
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
