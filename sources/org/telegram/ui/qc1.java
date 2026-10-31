package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qc1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;

    public /* synthetic */ qc1(tc1 tc1Var, int i10) {
        this.a = i10;
        this.b = tc1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.bi0 bi0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                tc1 tc1Var = this.b;
                if (!tc1Var.M) {
                    int i10 = tc1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                tc1Var.L0(true);
                                break;
                            }
                        } else {
                            try {
                                tc1Var.f0[6].P((int) ((Math.min(1.0f, tc1Var.n.getLayout().getLineWidth(0) / tc1Var.n.getWidth()) * 142.0f) + 18.0f));
                                tc1Var.a.d();
                                break;
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.a.getAnimatedDrawable();
                        if (tc1Var.n.length() <= 0) {
                            if (animatedDrawable != tc1Var.f0[3] || tc1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.bi0[] bi0VarArr = tc1Var.f0;
                                if (animatedDrawable != bi0VarArr[5]) {
                                    bi0VarArr[2].P(-1);
                                    org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f0[2];
                                    if (animatedDrawable != bi0Var2) {
                                        tc1Var.a.setAnimation(bi0Var2);
                                        tc1Var.f0[2].N(49, false, false);
                                    }
                                    tc1Var.a.d();
                                    break;
                                }
                            }
                            tc1Var.a.setAnimation(tc1Var.f0[4]);
                            tc1Var.f0[4].T(false, 0.0f);
                            tc1Var.a.d();
                            break;
                        } else if (tc1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.bi0[] bi0VarArr2 = tc1Var.f0;
                            if (animatedDrawable != bi0VarArr2[3]) {
                                org.telegram.ui.Components.bi0 bi0Var3 = bi0VarArr2[2];
                                if (animatedDrawable == bi0Var3) {
                                    if (bi0Var3.a0 < 49) {
                                        bi0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    tc1Var.a.setAnimation(bi0Var3);
                                    tc1Var.f0[2].P(49);
                                    tc1Var.f0[2].T(false, 0.0f);
                                    tc1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.bi0[] bi0VarArr3 = tc1Var.f0;
                            if (animatedDrawable != bi0VarArr3[3] && animatedDrawable != (bi0Var = bi0VarArr3[5])) {
                                tc1Var.a.setAnimation(bi0Var);
                                tc1Var.f0[5].T(false, 0.0f);
                                tc1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                tc1 tc1Var2 = this.b;
                if (tc1Var2.F) {
                    if (tc1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(tc1Var2.E, true, 0.1f, true, true);
                        break;
                    } else if (tc1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(tc1Var2.E, false, 0.1f, true, true);
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
