package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o0 extends Visibility {
    public final /* synthetic */ int a;

    public /* synthetic */ o0(int i9) {
        this.a = i9;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                if (!(view instanceof v0)) {
                    return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                animatorSet.setInterpolator(gr.f);
                return animatorSet;
            case 1:
                if (!(view instanceof v0)) {
                    return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                animatorSet2.setInterpolator(gr.f);
                return animatorSet2;
            case 2:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                animatorSet3.setInterpolator(gr.f);
                return animatorSet3;
            case 3:
                AnimatorSet animatorSet4 = new AnimatorSet();
                view.setAlpha(0.0f);
                view.setScaleY(0.6f);
                view.setScaleX(0.6f);
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.6f, 1.0f));
                animatorSet4.setInterpolator(gr.k);
                return animatorSet4;
            case 4:
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(100.0f), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f));
                if (view instanceof org.telegram.ui.Components.voip.u2) {
                    view.setTranslationY(AndroidUtilities.dp(100.0f));
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    ofPropertyValuesHolder.setStartDelay(((org.telegram.ui.Components.voip.u2) view).B);
                }
                if (view instanceof org.telegram.ui.Components.voip.j3) {
                    view.setTranslationY(AndroidUtilities.dp(100.0f));
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    ofPropertyValuesHolder.setStartDelay(((org.telegram.ui.Components.voip.j3) view).f);
                }
                return ofPropertyValuesHolder;
            default:
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(20.0f), 0.0f));
                animatorSet5.setInterpolator(gr.f);
                return animatorSet5;
        }
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                if (!(view instanceof v0)) {
                    return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                animatorSet.setInterpolator(gr.f);
                return animatorSet;
            case 1:
                if (!(view instanceof v0)) {
                    return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                animatorSet2.setInterpolator(gr.f);
                return animatorSet2;
            case 2:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                animatorSet3.setInterpolator(gr.f);
                return animatorSet3;
            case 3:
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (view instanceof org.telegram.ui.Components.voip.f2) {
                    ((org.telegram.ui.Components.voip.f2) view).d = true;
                }
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.7f, 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.6f));
                animatorSet4.setInterpolator(gr.f);
                return animatorSet4;
            case 4:
                return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), AndroidUtilities.dp(100.0f)), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, view.getScaleX(), 0.0f));
            default:
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(20.0f)));
                animatorSet5.setInterpolator(gr.f);
                return animatorSet5;
        }
    }
}
