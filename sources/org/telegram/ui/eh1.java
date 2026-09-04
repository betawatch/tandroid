package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class eh1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;

    public /* synthetic */ eh1(hh1 hh1Var, int i10) {
        this.a = i10;
        this.b = hh1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.xi0 xi0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                hh1 hh1Var = this.b;
                if (!hh1Var.M) {
                    int i10 = hh1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                hh1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                hh1Var.f0[6].N((int) ((Math.min(1.0f, hh1Var.n.getLayout().getLineWidth(0) / hh1Var.n.getWidth()) * 142.0f) + 18.0f));
                                hh1Var.a.d();
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.xi0 animatedDrawable = hh1Var.a.getAnimatedDrawable();
                        if (hh1Var.n.length() <= 0) {
                            if (animatedDrawable != hh1Var.f0[3] || hh1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.xi0[] xi0VarArr = hh1Var.f0;
                                if (animatedDrawable != xi0VarArr[5]) {
                                    xi0VarArr[2].N(-1);
                                    org.telegram.ui.Components.xi0 xi0Var2 = hh1Var.f0[2];
                                    if (animatedDrawable != xi0Var2) {
                                        hh1Var.a.setAnimation(xi0Var2);
                                        hh1Var.f0[2].L(49, false, false);
                                    }
                                    hh1Var.a.d();
                                    break;
                                }
                            }
                            hh1Var.a.setAnimation(hh1Var.f0[4]);
                            hh1Var.f0[4].Q(0.0f, false);
                            hh1Var.a.d();
                            break;
                        } else if (hh1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.xi0[] xi0VarArr2 = hh1Var.f0;
                            if (animatedDrawable != xi0VarArr2[3]) {
                                org.telegram.ui.Components.xi0 xi0Var3 = xi0VarArr2[2];
                                if (animatedDrawable == xi0Var3) {
                                    if (xi0Var3.b0 < 49) {
                                        xi0Var3.N(49);
                                        break;
                                    }
                                } else {
                                    hh1Var.a.setAnimation(xi0Var3);
                                    hh1Var.f0[2].N(49);
                                    hh1Var.f0[2].Q(0.0f, false);
                                    hh1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.xi0[] xi0VarArr3 = hh1Var.f0;
                            if (animatedDrawable != xi0VarArr3[3] && animatedDrawable != (xi0Var = xi0VarArr3[5])) {
                                hh1Var.a.setAnimation(xi0Var);
                                hh1Var.f0[5].Q(0.0f, false);
                                hh1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                hh1 hh1Var2 = this.b;
                if (hh1Var2.F) {
                    if (hh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(hh1Var2.E, true, 0.1f, true);
                        break;
                    } else if (hh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(hh1Var2.E, false, 0.1f, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
