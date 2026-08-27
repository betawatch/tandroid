package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;

    public /* synthetic */ hf0(if0 if0Var, int i10) {
        this.a = i10;
        this.b = if0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if0 if0Var = this.b;
                if0Var.h = false;
                if0Var.a = if0Var.c;
                if0Var.invalidate();
                int i10 = if0Var.F;
                if (i10 >= 0) {
                    if0Var.b(i10);
                    if0Var.F = -1;
                    break;
                }
                break;
            default:
                if0 if0Var2 = this.b;
                if0Var2.n = false;
                if0Var2.h = false;
                if0Var2.invalidate();
                int i11 = if0Var2.F;
                if (i11 >= 0) {
                    if0Var2.b(i11);
                    if0Var2.F = -1;
                }
                if0Var2.a();
                break;
        }
    }
}
