package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class fe0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public fe0(qg.v2 v2Var) {
        this.c = v2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                ge0 ge0Var = (ge0) this.c;
                if (this.b) {
                    if (ge0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ge0Var.y) {
                            ge0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ge0Var.f, true, 0.1f, true);
                        break;
                    } else if (ge0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ge0Var.f, false, 0.1f, true);
                        break;
                    }
                }
                break;
            default:
                qg.v2 v2Var = (qg.v2) this.c;
                qg.u2 u2Var = v2Var.q0;
                if (this.b && v2Var.w0 > 0 && v2Var.x0 > 0 && !v2Var.z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.x0, v2Var.w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                v2Var.s();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = i12 > 3;
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public fe0(ge0 ge0Var, boolean z10) {
        this.c = ge0Var;
        this.b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
