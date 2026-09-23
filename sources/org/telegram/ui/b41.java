package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e41 b;

    public /* synthetic */ b41(e41 e41Var, int i10) {
        this.a = i10;
        this.b = e41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e41 e41Var = this.b;
                e41Var.getClass();
                e41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var.g();
                break;
            case 1:
                e41 e41Var2 = this.b;
                e41Var2.getClass();
                e41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var2.g();
                break;
            default:
                e41 e41Var3 = this.b;
                e41Var3.getClass();
                e41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var3.g();
                break;
        }
    }
}
