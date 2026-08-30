package dg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.de0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a4 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public a4(b4 b4Var) {
        this.c = b4Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.c;
                z3 z3Var = b4Var.n0;
                if (this.b && b4Var.t0 > 0 && b4Var.u0 > 0 && !b4Var.w0 && z3Var.getLayout() != null) {
                    float f10 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = z3Var.getLayout().getHeight();
                    if (height > f10 && (clamp = Utilities.clamp((int) ((f10 / height) * b4Var.getBaseFontSize()), b4Var.u0, b4Var.t0)) != b4Var.getBaseFontSize()) {
                        b4Var.setBaseFontSize(clamp);
                        Runnable runnable = b4Var.v0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                b4Var.s();
                break;
            default:
                de0 de0Var = (de0) this.c;
                if (this.b) {
                    if (de0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (de0Var.y) {
                            de0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(de0Var.f, true, 0.1f, true);
                        break;
                    } else if (de0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(de0Var.f, false, 0.1f, true);
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

    public a4(de0 de0Var, boolean z4) {
        this.c = de0Var;
        this.b = z4;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
