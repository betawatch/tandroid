package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        org.telegram.ui.Components.hj0 hj0Var;
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
                        org.telegram.ui.Components.hj0 animatedDrawable = ih1Var.a.getAnimatedDrawable();
                        if (ih1Var.n.length() <= 0) {
                            if (animatedDrawable != ih1Var.f0[3] || ih1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.hj0[] hj0VarArr = ih1Var.f0;
                                if (animatedDrawable != hj0VarArr[5]) {
                                    hj0VarArr[2].P(-1);
                                    org.telegram.ui.Components.hj0 hj0Var2 = ih1Var.f0[2];
                                    if (animatedDrawable != hj0Var2) {
                                        ih1Var.a.setAnimation(hj0Var2);
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
                            org.telegram.ui.Components.hj0[] hj0VarArr2 = ih1Var.f0;
                            if (animatedDrawable != hj0VarArr2[3]) {
                                org.telegram.ui.Components.hj0 hj0Var3 = hj0VarArr2[2];
                                if (animatedDrawable == hj0Var3) {
                                    if (hj0Var3.a0 < 49) {
                                        hj0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    ih1Var.a.setAnimation(hj0Var3);
                                    ih1Var.f0[2].P(49);
                                    ih1Var.f0[2].T(0.0f, false);
                                    ih1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.hj0[] hj0VarArr3 = ih1Var.f0;
                            if (animatedDrawable != hj0VarArr3[3] && animatedDrawable != (hj0Var = hj0VarArr3[5])) {
                                ih1Var.a.setAnimation(hj0Var);
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
