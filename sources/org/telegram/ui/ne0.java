package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ne0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public ne0(qg.x2 x2Var) {
        this.c = x2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                oe0 oe0Var = (oe0) this.c;
                if (this.b) {
                    if (oe0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (oe0Var.y) {
                            oe0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(oe0Var.f, true, 0.1f, true);
                        break;
                    } else if (oe0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(oe0Var.f, false, 0.1f, true);
                        break;
                    }
                }
                break;
            default:
                qg.x2 x2Var = (qg.x2) this.c;
                qg.w2 w2Var = x2Var.q0;
                if (this.b && x2Var.w0 > 0 && x2Var.x0 > 0 && !x2Var.z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.x0, x2Var.w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                x2Var.s();
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

    public ne0(oe0 oe0Var, boolean z10) {
        this.c = oe0Var;
        this.b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
