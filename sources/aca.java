// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aca implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tca b;

    public /* synthetic */ aca(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                gm.c3(new c0a(this, (byte) 9));
                break;
            default:
                tca tcaVar = this.b;
                mca mcaVar = tcaVar.F1;
                a1b a1bVar = tcaVar.L1;
                oq4 oq4Var = tcaVar.t2;
                if (!TextUtils.isEmpty(oq4Var.r.getText())) {
                    tcaVar.D0(false);
                }
                if (tcaVar.v2) {
                    String obj = oq4Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (a1bVar != null) {
                            a1bVar.d.setText(jb6.M0(2131747901, null));
                        }
                    } else if (tcaVar.A1.getAdapter() != mcaVar) {
                        int H0 = tcaVar.H0();
                        a1bVar.d.setText(jb6.M0(2131747901, null));
                        a1bVar.e(false, true);
                        tcaVar.D0(false);
                        mcaVar.f();
                        if (H0 > 0) {
                            tcaVar.C1.g1(0, -H0);
                        }
                    }
                    qca qcaVar = tcaVar.H1;
                    if (qcaVar != null) {
                        qcaVar.E(obj);
                        break;
                    }
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

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
