package eg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ee0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y3 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public y3(z3 z3Var) {
        this.c = z3Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                z3 z3Var = (z3) this.c;
                x3 x3Var = z3Var.n0;
                if (this.b && z3Var.t0 > 0 && z3Var.u0 > 0 && !z3Var.w0 && x3Var.getLayout() != null) {
                    float f10 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = x3Var.getLayout().getHeight();
                    if (height > f10 && (clamp = Utilities.clamp((int) ((f10 / height) * z3Var.getBaseFontSize()), z3Var.u0, z3Var.t0)) != z3Var.getBaseFontSize()) {
                        z3Var.setBaseFontSize(clamp);
                        Runnable runnable = z3Var.v0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                z3Var.s();
                break;
            default:
                ee0 ee0Var = (ee0) this.c;
                if (this.b) {
                    if (ee0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ee0Var.y) {
                            ee0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ee0Var.f, true, 0.1f, true);
                        break;
                    } else if (ee0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ee0Var.f, false, 0.1f, true);
                        break;
                    }
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

    public y3(ee0 ee0Var, boolean z4) {
        this.c = ee0Var;
        this.b = z4;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
