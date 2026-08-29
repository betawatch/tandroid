package bg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ud0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e4 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public e4(f4 f4Var) {
        this.c = f4Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.c;
                d4 d4Var = f4Var.m0;
                if (this.b && f4Var.s0 > 0 && f4Var.t0 > 0 && !f4Var.v0 && d4Var.getLayout() != null) {
                    float f9 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = d4Var.getLayout().getHeight();
                    if (height > f9 && (clamp = Utilities.clamp((int) ((f9 / height) * f4Var.getBaseFontSize()), f4Var.t0, f4Var.s0)) != f4Var.getBaseFontSize()) {
                        f4Var.setBaseFontSize(clamp);
                        Runnable runnable = f4Var.u0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                f4Var.s();
                break;
            default:
                ud0 ud0Var = (ud0) this.c;
                if (this.b) {
                    if (ud0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ud0Var.y) {
                            ud0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f, true, 0.1f, true);
                        break;
                    } else if (ud0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f, false, 0.1f, true);
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

    public e4(ud0 ud0Var, boolean z10) {
        this.c = ud0Var;
        this.b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
