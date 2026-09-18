package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class me0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public me0(qg.u2 u2Var) {
        this.c = u2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                ne0 ne0Var = (ne0) this.c;
                if (this.b) {
                    if (ne0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ne0Var.y) {
                            ne0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ne0Var.f, true, 0.1f, true);
                        break;
                    } else if (ne0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ne0Var.f, false, 0.1f, true);
                        break;
                    }
                }
                break;
            default:
                qg.u2 u2Var = (qg.u2) this.c;
                qg.t2 t2Var = u2Var.q0;
                if (this.b && u2Var.w0 > 0 && u2Var.x0 > 0 && !u2Var.z0 && t2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = t2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * u2Var.getBaseFontSize()), u2Var.x0, u2Var.w0)) != u2Var.getBaseFontSize()) {
                        u2Var.setBaseFontSize(clamp);
                        Runnable runnable = u2Var.y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                u2Var.s();
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

    public me0(ne0 ne0Var, boolean z10) {
        this.c = ne0Var;
        this.b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
