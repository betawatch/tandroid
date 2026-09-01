package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ng1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg1 b;

    public /* synthetic */ ng1(qg1 qg1Var, int i10) {
        this.a = i10;
        this.b = qg1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ij0 ij0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                qg1 qg1Var = this.b;
                if (!qg1Var.J) {
                    int i10 = qg1Var.L;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                qg1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                qg1Var.c0[6].N((int) ((Math.min(1.0f, qg1Var.n.getLayout().getLineWidth(0) / qg1Var.n.getWidth()) * 142.0f) + 18.0f));
                                qg1Var.a.d();
                                break;
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.ij0 animatedDrawable = qg1Var.a.getAnimatedDrawable();
                        if (qg1Var.n.length() <= 0) {
                            if (animatedDrawable != qg1Var.c0[3] || qg1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.ij0[] ij0VarArr = qg1Var.c0;
                                if (animatedDrawable != ij0VarArr[5]) {
                                    ij0VarArr[2].N(-1);
                                    org.telegram.ui.Components.ij0 ij0Var2 = qg1Var.c0[2];
                                    if (animatedDrawable != ij0Var2) {
                                        qg1Var.a.setAnimation(ij0Var2);
                                        qg1Var.c0[2].L(49, false, false);
                                    }
                                    qg1Var.a.d();
                                    break;
                                }
                            }
                            qg1Var.a.setAnimation(qg1Var.c0[4]);
                            qg1Var.c0[4].Q(0.0f, false);
                            qg1Var.a.d();
                            break;
                        } else if (qg1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ij0[] ij0VarArr2 = qg1Var.c0;
                            if (animatedDrawable != ij0VarArr2[3]) {
                                org.telegram.ui.Components.ij0 ij0Var3 = ij0VarArr2[2];
                                if (animatedDrawable == ij0Var3) {
                                    if (ij0Var3.Y < 49) {
                                        ij0Var3.N(49);
                                        break;
                                    }
                                } else {
                                    qg1Var.a.setAnimation(ij0Var3);
                                    qg1Var.c0[2].N(49);
                                    qg1Var.c0[2].Q(0.0f, false);
                                    qg1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.ij0[] ij0VarArr3 = qg1Var.c0;
                            if (animatedDrawable != ij0VarArr3[3] && animatedDrawable != (ij0Var = ij0VarArr3[5])) {
                                qg1Var.a.setAnimation(ij0Var);
                                qg1Var.c0[5].Q(0.0f, false);
                                qg1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                qg1 qg1Var2 = this.b;
                if (qg1Var2.C) {
                    if (qg1Var2.B.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(qg1Var2.B, true, 0.1f, true);
                        break;
                    } else if (qg1Var2.B.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(qg1Var2.B, false, 0.1f, true);
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
