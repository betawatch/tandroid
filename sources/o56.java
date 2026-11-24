// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o56 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s56 b;

    public /* synthetic */ o56(s56 s56Var, byte b) {
        this.a = b;
        this.b = s56Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        s56 s56Var = this.b;
        switch (b) {
            case 0:
                if (!s56Var.O) {
                    if (editable.toString().equals("0")) {
                        s56Var.G.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                s56Var.b0(parseInt);
                                break;
                            } else {
                                s56Var.c0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            s56Var.c0();
                            return;
                        }
                    }
                }
                break;
            default:
                gw3.l(editable, s56Var.L.getPaint().getFontMetricsInt(), false);
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
