package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class oc1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc1 b;

    public /* synthetic */ oc1(rc1 rc1Var, int i10) {
        this.a = i10;
        this.b = rc1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ci0 ci0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                rc1 rc1Var = this.b;
                if (!rc1Var.M) {
                    int i10 = rc1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                rc1Var.M0(true);
                                break;
                            }
                        } else {
                            try {
                                rc1Var.f0[6].P((int) ((Math.min(1.0f, rc1Var.n.getLayout().getLineWidth(0) / rc1Var.n.getWidth()) * 142.0f) + 18.0f));
                                rc1Var.a.d();
                                break;
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.ci0 animatedDrawable = rc1Var.a.getAnimatedDrawable();
                        if (rc1Var.n.length() <= 0) {
                            if (animatedDrawable != rc1Var.f0[3] || rc1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.ci0[] ci0VarArr = rc1Var.f0;
                                if (animatedDrawable != ci0VarArr[5]) {
                                    ci0VarArr[2].P(-1);
                                    org.telegram.ui.Components.ci0 ci0Var2 = rc1Var.f0[2];
                                    if (animatedDrawable != ci0Var2) {
                                        rc1Var.a.setAnimation(ci0Var2);
                                        rc1Var.f0[2].N(49, false, false);
                                    }
                                    rc1Var.a.d();
                                    break;
                                }
                            }
                            rc1Var.a.setAnimation(rc1Var.f0[4]);
                            rc1Var.f0[4].T(false, 0.0f);
                            rc1Var.a.d();
                            break;
                        } else if (rc1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ci0[] ci0VarArr2 = rc1Var.f0;
                            if (animatedDrawable != ci0VarArr2[3]) {
                                org.telegram.ui.Components.ci0 ci0Var3 = ci0VarArr2[2];
                                if (animatedDrawable == ci0Var3) {
                                    if (ci0Var3.a0 < 49) {
                                        ci0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    rc1Var.a.setAnimation(ci0Var3);
                                    rc1Var.f0[2].P(49);
                                    rc1Var.f0[2].T(false, 0.0f);
                                    rc1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.ci0[] ci0VarArr3 = rc1Var.f0;
                            if (animatedDrawable != ci0VarArr3[3] && animatedDrawable != (ci0Var = ci0VarArr3[5])) {
                                rc1Var.a.setAnimation(ci0Var);
                                rc1Var.f0[5].T(false, 0.0f);
                                rc1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                rc1 rc1Var2 = this.b;
                if (rc1Var2.F) {
                    if (rc1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(rc1Var2.E, true, 0.1f, true, true);
                        break;
                    } else if (rc1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(rc1Var2.E, false, 0.1f, true, true);
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
