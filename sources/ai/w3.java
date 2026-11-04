package ai;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.ui.qb0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w3 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ View c;

    public /* synthetic */ w3(int i3, View view) {
        this.a = i3;
        this.c = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int j10;
        int i3 = this.a;
        View view = this.c;
        switch (i3) {
            case 0:
                u3 u3Var = (u3) view;
                if (!this.b && editable.length() > 12) {
                    this.b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.F3(u3Var);
                    try {
                        u3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    break;
                }
                break;
            case 1:
                qb0 qb0Var = (qb0) view;
                if (this.b) {
                    if (qb0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (qb0Var.E) {
                            qb0Var.f.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(qb0Var.f, true, 0.1f, true, true);
                        break;
                    } else if (qb0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(qb0Var.f, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.b) {
                    TextView textView = (TextView) view;
                    this.b = isEmpty;
                    textView.setText(bd.M0(isEmpty ? 2131746329 : 2131754486, null));
                    break;
                }
                break;
            default:
                ug.l2 l2Var = (ug.l2) view;
                ug.k2 k2Var = l2Var.r0;
                if (this.b && l2Var.x0 > 0 && l2Var.y0 > 0 && !l2Var.A0 && k2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.q.y / 3.0f;
                    float height = k2Var.getLayout().getHeight();
                    if (height > f10 && (j10 = Utilities.j((int) ((f10 / height) * l2Var.getBaseFontSize()), l2Var.y0, l2Var.x0)) != l2Var.getBaseFontSize()) {
                        l2Var.setBaseFontSize(j10);
                        Runnable runnable = l2Var.z0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                l2Var.s();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
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
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    public w3(lg.y0 y0Var, TextView textView) {
        this.a = 2;
        this.c = textView;
        this.b = TextUtils.isEmpty(y0Var.getText());
    }

    public w3(qb0 qb0Var, boolean z10) {
        this.a = 1;
        this.c = qb0Var;
        this.b = z10;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
