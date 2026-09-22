package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class a51 extends Fade {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SecretMediaViewer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a51(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.b = z10;
                this.c = z11;
                super(2);
                break;
            default:
                this.d = secretMediaViewer;
                this.b = z10;
                this.c = z11;
                break;
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.b && !this.c && view == this.d.Z) {
                    onAppear.addListener(new gp0(this, 18));
                    ((ObjectAnimator) onAppear).addUpdateListener(new i21(this, 3));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.b && this.c && view == this.d.Z) {
                    onDisappear.addListener(new gp0(this, 19));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new i21(this, 4));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
