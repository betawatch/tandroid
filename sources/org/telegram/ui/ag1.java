package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ag1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg1 b;

    public /* synthetic */ ag1(dg1 dg1Var, int i10) {
        this.a = i10;
        this.b = dg1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.xj0 xj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                dg1 dg1Var = this.b;
                if (!dg1Var.M) {
                    int i10 = dg1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                dg1Var.I0(true);
                                break;
                            }
                        } else {
                            try {
                                dg1Var.f0[6].P((int) ((Math.min(1.0f, dg1Var.n.getLayout().getLineWidth(0) / dg1Var.n.getWidth()) * 142.0f) + 18.0f));
                                dg1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.xj0 animatedDrawable = dg1Var.a.getAnimatedDrawable();
                        if (dg1Var.n.length() <= 0) {
                            if (animatedDrawable != dg1Var.f0[3] || dg1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.xj0[] xj0VarArr = dg1Var.f0;
                                if (animatedDrawable != xj0VarArr[5]) {
                                    xj0VarArr[2].P(-1);
                                    org.telegram.ui.Components.xj0 xj0Var2 = dg1Var.f0[2];
                                    if (animatedDrawable != xj0Var2) {
                                        dg1Var.a.setAnimation(xj0Var2);
                                        dg1Var.f0[2].N(49, false, false);
                                    }
                                    dg1Var.a.d();
                                    break;
                                }
                            }
                            dg1Var.a.setAnimation(dg1Var.f0[4]);
                            dg1Var.f0[4].T(0.0f, false);
                            dg1Var.a.d();
                            break;
                        } else if (dg1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.xj0[] xj0VarArr2 = dg1Var.f0;
                            if (animatedDrawable != xj0VarArr2[3]) {
                                org.telegram.ui.Components.xj0 xj0Var3 = xj0VarArr2[2];
                                if (animatedDrawable == xj0Var3) {
                                    if (xj0Var3.a0 < 49) {
                                        xj0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    dg1Var.a.setAnimation(xj0Var3);
                                    dg1Var.f0[2].P(49);
                                    dg1Var.f0[2].T(0.0f, false);
                                    dg1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.xj0[] xj0VarArr3 = dg1Var.f0;
                            if (animatedDrawable != xj0VarArr3[3] && animatedDrawable != (xj0Var = xj0VarArr3[5])) {
                                dg1Var.a.setAnimation(xj0Var);
                                dg1Var.f0[5].T(0.0f, false);
                                dg1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                dg1 dg1Var2 = this.b;
                if (dg1Var2.F) {
                    if (dg1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(dg1Var2.E, true, 0.1f, true);
                        break;
                    } else if (dg1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(dg1Var2.E, false, 0.1f, true);
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
