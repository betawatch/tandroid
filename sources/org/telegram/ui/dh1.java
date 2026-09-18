package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class dh1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh1 b;

    public /* synthetic */ dh1(gh1 gh1Var, int i10) {
        this.a = i10;
        this.b = gh1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ij0 ij0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                gh1 gh1Var = this.b;
                if (!gh1Var.M) {
                    int i10 = gh1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                gh1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                gh1Var.f0[6].P((int) ((Math.min(1.0f, gh1Var.n.getLayout().getLineWidth(0) / gh1Var.n.getWidth()) * 142.0f) + 18.0f));
                                gh1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.ij0 animatedDrawable = gh1Var.a.getAnimatedDrawable();
                        if (gh1Var.n.length() <= 0) {
                            if (animatedDrawable != gh1Var.f0[3] || gh1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.ij0[] ij0VarArr = gh1Var.f0;
                                if (animatedDrawable != ij0VarArr[5]) {
                                    ij0VarArr[2].P(-1);
                                    org.telegram.ui.Components.ij0 ij0Var2 = gh1Var.f0[2];
                                    if (animatedDrawable != ij0Var2) {
                                        gh1Var.a.setAnimation(ij0Var2);
                                        gh1Var.f0[2].N(49, false, false);
                                    }
                                    gh1Var.a.d();
                                    break;
                                }
                            }
                            gh1Var.a.setAnimation(gh1Var.f0[4]);
                            gh1Var.f0[4].T(0.0f, false);
                            gh1Var.a.d();
                            break;
                        } else if (gh1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ij0[] ij0VarArr2 = gh1Var.f0;
                            if (animatedDrawable != ij0VarArr2[3]) {
                                org.telegram.ui.Components.ij0 ij0Var3 = ij0VarArr2[2];
                                if (animatedDrawable == ij0Var3) {
                                    if (ij0Var3.a0 < 49) {
                                        ij0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    gh1Var.a.setAnimation(ij0Var3);
                                    gh1Var.f0[2].P(49);
                                    gh1Var.f0[2].T(0.0f, false);
                                    gh1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.ij0[] ij0VarArr3 = gh1Var.f0;
                            if (animatedDrawable != ij0VarArr3[3] && animatedDrawable != (ij0Var = ij0VarArr3[5])) {
                                gh1Var.a.setAnimation(ij0Var);
                                gh1Var.f0[5].T(0.0f, false);
                                gh1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                gh1 gh1Var2 = this.b;
                if (gh1Var2.F) {
                    if (gh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(gh1Var2.E, true, 0.1f, true);
                        break;
                    } else if (gh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(gh1Var2.E, false, 0.1f, true);
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
