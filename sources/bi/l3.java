package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l3 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ View c;

    public /* synthetic */ l3(int i7, View view) {
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
                j3 j3Var = (j3) view;
                if (!this.b && editable.length() > 12) {
                    this.b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.E3(j3Var);
                    try {
                        j3Var.performHapticFeedback(3, 2);
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
                        org.telegram.messenger.g0.Y3(tb0Var.f, true, 0.1f, true, true);
                        break;
                    } else if (tb0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Y3(tb0Var.f, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.b) {
                    TextView textView = (TextView) view;
                    this.b = isEmpty;
                    textView.setText(hd.M0(isEmpty ? 2131746321 : 2131754486, null));
                    break;
                }
                break;
            default:
                tg.n2 n2Var = (tg.n2) view;
                tg.m2 m2Var = n2Var.r0;
                if (this.b && n2Var.x0 > 0 && n2Var.y0 > 0 && !n2Var.A0 && m2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.q.y / 3.0f;
                    float height = m2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * n2Var.getBaseFontSize()), n2Var.y0, n2Var.x0)) != n2Var.getBaseFontSize()) {
                        n2Var.setBaseFontSize(j3);
                        Runnable runnable = n2Var.z0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                n2Var.s();
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

    public l3(kg.x0 x0Var, TextView textView) {
        this.a = 2;
        this.c = textView;
        this.b = TextUtils.isEmpty(x0Var.getText());
    }

    public l3(tb0 tb0Var, boolean z10) {
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
