package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lh1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ lh1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.yj0 yj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                oh1 oh1Var = this.b;
                if (!oh1Var.M) {
                    int i10 = oh1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                oh1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                oh1Var.f0[6].P((int) ((Math.min(1.0f, oh1Var.n.getLayout().getLineWidth(0) / oh1Var.n.getWidth()) * 142.0f) + 18.0f));
                                oh1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.yj0 animatedDrawable = oh1Var.a.getAnimatedDrawable();
                        if (oh1Var.n.length() <= 0) {
                            if (animatedDrawable != oh1Var.f0[3] || oh1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.yj0[] yj0VarArr = oh1Var.f0;
                                if (animatedDrawable != yj0VarArr[5]) {
                                    yj0VarArr[2].P(-1);
                                    org.telegram.ui.Components.yj0 yj0Var2 = oh1Var.f0[2];
                                    if (animatedDrawable != yj0Var2) {
                                        oh1Var.a.setAnimation(yj0Var2);
                                        oh1Var.f0[2].N(49, false, false);
                                    }
                                    oh1Var.a.d();
                                    break;
                                }
                            }
                            oh1Var.a.setAnimation(oh1Var.f0[4]);
                            oh1Var.f0[4].T(0.0f, false);
                            oh1Var.a.d();
                            break;
                        } else if (oh1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.yj0[] yj0VarArr2 = oh1Var.f0;
                            if (animatedDrawable != yj0VarArr2[3]) {
                                org.telegram.ui.Components.yj0 yj0Var3 = yj0VarArr2[2];
                                if (animatedDrawable == yj0Var3) {
                                    if (yj0Var3.a0 < 49) {
                                        yj0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    oh1Var.a.setAnimation(yj0Var3);
                                    oh1Var.f0[2].P(49);
                                    oh1Var.f0[2].T(0.0f, false);
                                    oh1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.yj0[] yj0VarArr3 = oh1Var.f0;
                            if (animatedDrawable != yj0VarArr3[3] && animatedDrawable != (yj0Var = yj0VarArr3[5])) {
                                oh1Var.a.setAnimation(yj0Var);
                                oh1Var.f0[5].T(0.0f, false);
                                oh1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                oh1 oh1Var2 = this.b;
                if (oh1Var2.F) {
                    if (oh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(oh1Var2.E, true, 0.1f, true);
                        break;
                    } else if (oh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(oh1Var2.E, false, 0.1f, true);
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
