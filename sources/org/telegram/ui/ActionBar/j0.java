package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ j0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        s0 searchListener;
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.b;
                s0 s0Var = w0Var.H;
                if (s0Var != null) {
                    s0Var.l(w0Var.e);
                }
                w0Var.j();
                if (!w0Var.g0.isEmpty() && !TextUtils.isEmpty(w0Var.e.getText()) && w0Var.h0 >= 0) {
                    w0Var.h0 = -1;
                    w0Var.D();
                    break;
                }
                break;
            default:
                r5 r5Var = (r5) this.b;
                r5Var.d();
                searchListener = r5Var.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(r5Var.s);
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
