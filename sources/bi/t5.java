package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t5 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ View c;

    public /* synthetic */ t5(int i7, View view) {
        this.a = i7;
        this.c = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int j3;
        int i7 = this.a;
        View view = this.c;
        switch (i7) {
            case 0:
                r5 r5Var = (r5) view;
                if (!this.b && editable.length() > 12) {
                    this.b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.D3(r5Var);
                    try {
                        r5Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    break;
                }
                break;
            case 1:
                tb0 tb0Var = (tb0) view;
                if (this.b) {
                    if (tb0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (tb0Var.E) {
                            tb0Var.f.callOnClick();
                        }
                        org.telegram.messenger.g0.X3(tb0Var.f, true, 0.1f, true, true);
                        break;
                    } else if (tb0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(tb0Var.f, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.b) {
                    TextView textView = (TextView) view;
                    this.b = isEmpty;
                    textView.setText(gd.M0(isEmpty ? 2131746126 : 2131754484, null));
                    break;
                }
                break;
            default:
                tg.m2 m2Var = (tg.m2) view;
                tg.l2 l2Var = m2Var.r0;
                if (this.b && m2Var.x0 > 0 && m2Var.y0 > 0 && !m2Var.A0 && l2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.q.y / 3.0f;
                    float height = l2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * m2Var.getBaseFontSize()), m2Var.y0, m2Var.x0)) != m2Var.getBaseFontSize()) {
                        m2Var.setBaseFontSize(j3);
                        Runnable runnable = m2Var.z0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                m2Var.s();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                this.b = i11 > 3;
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    public t5(kg.a1 a1Var, TextView textView) {
        this.a = 2;
        this.c = textView;
        this.b = TextUtils.isEmpty(a1Var.getText());
    }

    public t5(tb0 tb0Var, boolean z10) {
        this.a = 1;
        this.c = tb0Var;
        this.b = z10;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
