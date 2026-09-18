package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fh1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;

    public /* synthetic */ fh1(ih1 ih1Var, int i10) {
        this.a = i10;
        this.b = ih1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.yi0 yi0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                ih1 ih1Var = this.b;
                if (!ih1Var.M) {
                    int i10 = ih1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                ih1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                ih1Var.f0[6].P((int) ((Math.min(1.0f, ih1Var.n.getLayout().getLineWidth(0) / ih1Var.n.getWidth()) * 142.0f) + 18.0f));
                                ih1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.yi0 animatedDrawable = ih1Var.a.getAnimatedDrawable();
                        if (ih1Var.n.length() <= 0) {
                            if (animatedDrawable != ih1Var.f0[3] || ih1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.yi0[] yi0VarArr = ih1Var.f0;
                                if (animatedDrawable != yi0VarArr[5]) {
                                    yi0VarArr[2].P(-1);
                                    org.telegram.ui.Components.yi0 yi0Var2 = ih1Var.f0[2];
                                    if (animatedDrawable != yi0Var2) {
                                        ih1Var.a.setAnimation(yi0Var2);
                                        ih1Var.f0[2].N(49, false, false);
                                    }
                                    ih1Var.a.d();
                                    break;
                                }
                            }
                            ih1Var.a.setAnimation(ih1Var.f0[4]);
                            ih1Var.f0[4].T(0.0f, false);
                            ih1Var.a.d();
                            break;
                        } else if (ih1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.yi0[] yi0VarArr2 = ih1Var.f0;
                            if (animatedDrawable != yi0VarArr2[3]) {
                                org.telegram.ui.Components.yi0 yi0Var3 = yi0VarArr2[2];
                                if (animatedDrawable == yi0Var3) {
                                    if (yi0Var3.a0 < 49) {
                                        yi0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    ih1Var.a.setAnimation(yi0Var3);
                                    ih1Var.f0[2].P(49);
                                    ih1Var.f0[2].T(0.0f, false);
                                    ih1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.yi0[] yi0VarArr3 = ih1Var.f0;
                            if (animatedDrawable != yi0VarArr3[3] && animatedDrawable != (yi0Var = yi0VarArr3[5])) {
                                ih1Var.a.setAnimation(yi0Var);
                                ih1Var.f0[5].T(0.0f, false);
                                ih1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ih1 ih1Var2 = this.b;
                if (ih1Var2.F) {
                    if (ih1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ih1Var2.E, true, 0.1f, true);
                        break;
                    } else if (ih1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ih1Var2.E, false, 0.1f, true);
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
