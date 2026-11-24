// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o36 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s36 b;

    public /* synthetic */ o36(s36 s36Var, byte b) {
        this.a = b;
        this.b = s36Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        s36 s36Var = this.b;
        switch (b) {
            case 0:
                if (!s36Var.O) {
                    if (editable.toString().equals("0")) {
                        s36Var.G.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                s36Var.a0(parseInt);
                                break;
                            } else {
                                s36Var.b0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            s36Var.b0();
                            return;
                        }
                    }
                }
                break;
            default:
                vu3.l(editable, s36Var.L.getPaint().getFontMetricsInt(), false);
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

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
