package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k c;

    public /* synthetic */ c(k kVar, boolean z9, int i7) {
        this.a = i7;
        this.c = kVar;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                k kVar = this.c;
                kVar.D1 = f10;
                kVar.f();
                break;
            default:
                float f11 = this.b ? 1.0f : 0.0f;
                k kVar2 = this.c;
                kVar2.D1 = f11;
                kVar2.f();
                break;
        }
    }
}
