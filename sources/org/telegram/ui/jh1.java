package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jh1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ jh1(mh1 mh1Var, int i10) {
        this.a = i10;
        this.b = mh1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.hj0 hj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                mh1 mh1Var = this.b;
                if (!mh1Var.M) {
                    int i10 = mh1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                mh1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                mh1Var.f0[6].P((int) ((Math.min(1.0f, mh1Var.n.getLayout().getLineWidth(0) / mh1Var.n.getWidth()) * 142.0f) + 18.0f));
                                mh1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.hj0 animatedDrawable = mh1Var.a.getAnimatedDrawable();
                        if (mh1Var.n.length() <= 0) {
                            if (animatedDrawable != mh1Var.f0[3] || mh1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.hj0[] hj0VarArr = mh1Var.f0;
                                if (animatedDrawable != hj0VarArr[5]) {
                                    hj0VarArr[2].P(-1);
                                    org.telegram.ui.Components.hj0 hj0Var2 = mh1Var.f0[2];
                                    if (animatedDrawable != hj0Var2) {
                                        mh1Var.a.setAnimation(hj0Var2);
                                        mh1Var.f0[2].N(49, false, false);
                                    }
                                    mh1Var.a.d();
                                    break;
                                }
                            }
                            mh1Var.a.setAnimation(mh1Var.f0[4]);
                            mh1Var.f0[4].S(0.0f, false);
                            mh1Var.a.d();
                            break;
                        } else if (mh1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.hj0[] hj0VarArr2 = mh1Var.f0;
                            if (animatedDrawable != hj0VarArr2[3]) {
                                org.telegram.ui.Components.hj0 hj0Var3 = hj0VarArr2[2];
                                if (animatedDrawable == hj0Var3) {
                                    if (hj0Var3.b0 < 49) {
                                        hj0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    mh1Var.a.setAnimation(hj0Var3);
                                    mh1Var.f0[2].P(49);
                                    mh1Var.f0[2].S(0.0f, false);
                                    mh1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.hj0[] hj0VarArr3 = mh1Var.f0;
                            if (animatedDrawable != hj0VarArr3[3] && animatedDrawable != (hj0Var = hj0VarArr3[5])) {
                                mh1Var.a.setAnimation(hj0Var);
                                mh1Var.f0[5].S(0.0f, false);
                                mh1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                mh1 mh1Var2 = this.b;
                if (mh1Var2.F) {
                    if (mh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(mh1Var2.E, true, 0.1f, true);
                        break;
                    } else if (mh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(mh1Var2.E, false, 0.1f, true);
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
