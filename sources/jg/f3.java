package jg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.ui.bd0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f3 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ View c;

    public /* synthetic */ f3(int i10, View view) {
        this.a = i10;
        this.c = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int j10;
        int i10 = this.a;
        View view = this.c;
        switch (i10) {
            case 0:
                g3 g3Var = (g3) view;
                e3 e3Var = g3Var.q0;
                if (this.b && g3Var.w0 > 0 && g3Var.x0 > 0 && !g3Var.z0 && e3Var.getLayout() != null) {
                    float f7 = org.telegram.messenger.i0.q.y / 3.0f;
                    float height = e3Var.getLayout().getHeight();
                    if (height > f7 && (j10 = Utilities.j((int) ((f7 / height) * g3Var.getBaseFontSize()), g3Var.x0, g3Var.w0)) != g3Var.getBaseFontSize()) {
                        g3Var.setBaseFontSize(j10);
                        Runnable runnable = g3Var.y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                g3Var.s();
                break;
            case 1:
                bd0 bd0Var = (bd0) view;
                if (this.b) {
                    if (bd0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (bd0Var.D) {
                            bd0Var.f.callOnClick();
                        }
                        org.telegram.messenger.i0.Y3(bd0Var.f, true, 0.1f, true, true);
                        break;
                    } else if (bd0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(bd0Var.f, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.b) {
                    TextView textView = (TextView) view;
                    this.b = isEmpty;
                    textView.setText(cd.L0(isEmpty ? 2131746336 : 2131754486, null));
                    break;
                }
                break;
            default:
                ph.t1 t1Var = (ph.t1) view;
                if (!this.b && editable.length() > 12) {
                    this.b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.i0.E3(t1Var);
                    try {
                        t1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                this.b = i12 > 3;
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public f3(ag.a2 a2Var, TextView textView) {
        this.a = 2;
        this.c = textView;
        this.b = TextUtils.isEmpty(a2Var.getText());
    }

    public f3(bd0 bd0Var, boolean z10) {
        this.a = 1;
        this.c = bd0Var;
        this.b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
