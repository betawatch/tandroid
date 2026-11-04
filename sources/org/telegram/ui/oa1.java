package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oa1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;

    public /* synthetic */ oa1(ra1 ra1Var, int i3) {
        this.a = i3;
        this.b = ra1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ch0 ch0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                ra1 ra1Var = this.b;
                if (!ra1Var.N) {
                    int i3 = ra1Var.P;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 8 && editable.length() > 0) {
                                ra1Var.M0(true);
                                break;
                            }
                        } else {
                            try {
                                ra1Var.g0[6].P((int) ((Math.min(1.0f, ra1Var.n.getLayout().getLineWidth(0) / ra1Var.n.getWidth()) * 142.0f) + 18.0f));
                                ra1Var.a.d();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.a.getAnimatedDrawable();
                        if (ra1Var.n.length() <= 0) {
                            if (animatedDrawable != ra1Var.g0[3] || ra1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.ch0[] ch0VarArr = ra1Var.g0;
                                if (animatedDrawable != ch0VarArr[5]) {
                                    ch0VarArr[2].P(-1);
                                    org.telegram.ui.Components.ch0 ch0Var2 = ra1Var.g0[2];
                                    if (animatedDrawable != ch0Var2) {
                                        ra1Var.a.setAnimation(ch0Var2);
                                        ra1Var.g0[2].N(49, false, false);
                                    }
                                    ra1Var.a.d();
                                    break;
                                }
                            }
                            ra1Var.a.setAnimation(ra1Var.g0[4]);
                            ra1Var.g0[4].T(false, 0.0f);
                            ra1Var.a.d();
                            break;
                        } else if (ra1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ch0[] ch0VarArr2 = ra1Var.g0;
                            if (animatedDrawable != ch0VarArr2[3]) {
                                org.telegram.ui.Components.ch0 ch0Var3 = ch0VarArr2[2];
                                if (animatedDrawable == ch0Var3) {
                                    if (ch0Var3.b0 < 49) {
                                        ch0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    ra1Var.a.setAnimation(ch0Var3);
                                    ra1Var.g0[2].P(49);
                                    ra1Var.g0[2].T(false, 0.0f);
                                    ra1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.ch0[] ch0VarArr3 = ra1Var.g0;
                            if (animatedDrawable != ch0VarArr3[3] && animatedDrawable != (ch0Var = ch0VarArr3[5])) {
                                ra1Var.a.setAnimation(ch0Var);
                                ra1Var.g0[5].T(false, 0.0f);
                                ra1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ra1 ra1Var2 = this.b;
                if (ra1Var2.G) {
                    if (ra1Var2.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ra1Var2.F, true, 0.1f, true, true);
                        break;
                    } else if (ra1Var2.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ra1Var2.F, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
