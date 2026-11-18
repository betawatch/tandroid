package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jz0 extends Fade {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SecretMediaViewer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i7) {
        super(1);
        this.a = i7;
        switch (i7) {
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
                if (this.b && !this.c && view == this.d.Y) {
                    onAppear.addListener(new ay(this, 25));
                    ((ObjectAnimator) onAppear).addUpdateListener(new iz0(this, 0));
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
                if (!this.b && this.c && view == this.d.Y) {
                    onDisappear.addListener(new ay(this, 26));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new iz0(this, 1));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
