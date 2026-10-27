package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cg1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    public /* synthetic */ cg1(fg1 fg1Var, int i10) {
        this.a = i10;
        this.b = fg1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.yj0 yj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                fg1 fg1Var = this.b;
                if (!fg1Var.M) {
                    int i10 = fg1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                fg1Var.I0(true);
                                break;
                            }
                        } else {
                            try {
                                fg1Var.f0[6].P((int) ((Math.min(1.0f, fg1Var.n.getLayout().getLineWidth(0) / fg1Var.n.getWidth()) * 142.0f) + 18.0f));
                                fg1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.yj0 animatedDrawable = fg1Var.a.getAnimatedDrawable();
                        if (fg1Var.n.length() <= 0) {
                            if (animatedDrawable != fg1Var.f0[3] || fg1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.yj0[] yj0VarArr = fg1Var.f0;
                                if (animatedDrawable != yj0VarArr[5]) {
                                    yj0VarArr[2].P(-1);
                                    org.telegram.ui.Components.yj0 yj0Var2 = fg1Var.f0[2];
                                    if (animatedDrawable != yj0Var2) {
                                        fg1Var.a.setAnimation(yj0Var2);
                                        fg1Var.f0[2].N(49, false, false);
                                    }
                                    fg1Var.a.d();
                                    break;
                                }
                            }
                            fg1Var.a.setAnimation(fg1Var.f0[4]);
                            fg1Var.f0[4].T(0.0f, false);
                            fg1Var.a.d();
                            break;
                        } else if (fg1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.yj0[] yj0VarArr2 = fg1Var.f0;
                            if (animatedDrawable != yj0VarArr2[3]) {
                                org.telegram.ui.Components.yj0 yj0Var3 = yj0VarArr2[2];
                                if (animatedDrawable == yj0Var3) {
                                    if (yj0Var3.a0 < 49) {
                                        yj0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    fg1Var.a.setAnimation(yj0Var3);
                                    fg1Var.f0[2].P(49);
                                    fg1Var.f0[2].T(0.0f, false);
                                    fg1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.yj0[] yj0VarArr3 = fg1Var.f0;
                            if (animatedDrawable != yj0VarArr3[3] && animatedDrawable != (yj0Var = yj0VarArr3[5])) {
                                fg1Var.a.setAnimation(yj0Var);
                                fg1Var.f0[5].T(0.0f, false);
                                fg1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                fg1 fg1Var2 = this.b;
                if (fg1Var2.F) {
                    if (fg1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(fg1Var2.E, true, 0.1f, true);
                        break;
                    } else if (fg1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(fg1Var2.E, false, 0.1f, true);
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
