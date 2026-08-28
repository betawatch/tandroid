package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.y11;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i extends ChangeBounds {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i9) {
        this.a = i9;
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.a) {
            case 0:
                super.captureEndValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof h5) {
                    transitionValues.values.put("text_size", Float.valueOf(((h5) view).getTextPaint().getTextSize()));
                    break;
                }
                break;
            default:
                super.captureEndValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof org.telegram.ui.Components.voip.j) {
                    int i9 = ((org.telegram.ui.Components.voip.j) view2).n;
                    int i10 = ((org.telegram.ui.Components.voip.j) view2).r;
                    int i11 = ((org.telegram.ui.Components.voip.j) view2).s;
                    int i12 = ((org.telegram.ui.Components.voip.j) view2).v;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i9));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i10));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i11));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i12));
                    break;
                }
                break;
        }
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.a) {
            case 0:
                super.captureStartValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof h5) {
                    transitionValues.values.put("text_size", Float.valueOf(((h5) view).getTextPaint().getTextSize()));
                    break;
                }
                break;
            default:
                super.captureStartValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof org.telegram.ui.Components.voip.j) {
                    int i9 = ((org.telegram.ui.Components.voip.j) view2).n;
                    int i10 = ((org.telegram.ui.Components.voip.j) view2).r;
                    int i11 = ((org.telegram.ui.Components.voip.j) view2).s;
                    int i12 = ((org.telegram.ui.Components.voip.j) view2).v;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i9));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i10));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i11));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i12));
                    break;
                }
                break;
        }
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, final TransitionValues transitionValues, TransitionValues transitionValues2) {
        final int i9 = 1;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                if (transitionValues != null && (transitionValues.view instanceof h5)) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (transitionValues2 != null) {
                        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                        float floatValue = ((Float) transitionValues.values.get("text_size")).floatValue() / ((Float) transitionValues2.values.get("text_size")).floatValue();
                        transitionValues.view.setScaleX(floatValue);
                        transitionValues.view.setScaleY(floatValue);
                        if (createAnimator != null) {
                            animatorSet.playTogether(createAnimator);
                        }
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_X, 1.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new h(transitionValues, 0));
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (transitionValues != null && transitionValues2 != null && (transitionValues.view instanceof org.telegram.ui.Components.voip.j)) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    Animator createAnimator2 = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                    if (createAnimator2 != null) {
                        animatorSet2.playTogether(createAnimator2);
                    }
                    Integer num = (Integer) transitionValues.values.get("back_color_end_close");
                    Integer num2 = (Integer) transitionValues2.values.get("back_color_end_close");
                    Integer num3 = (Integer) transitionValues.values.get("round_end_close");
                    Integer num4 = (Integer) transitionValues2.values.get("round_end_close");
                    Integer num5 = (Integer) transitionValues.values.get("decline_call_alpha_end_close");
                    Integer num6 = (Integer) transitionValues2.values.get("decline_call_alpha_end_close");
                    Integer num7 = (Integer) transitionValues.values.get("close_text_alpha_end_close");
                    Integer num8 = (Integer) transitionValues2.values.get("close_text_alpha_end_close");
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(num.intValue(), num2.intValue());
                    valueAnimator.setEvaluator(new ArgbEvaluator());
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.i
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i10) {
                                case 0:
                                    ((j) transitionValues.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((j) transitionValues.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((j) transitionValues.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(valueAnimator);
                    ValueAnimator ofInt = ValueAnimator.ofInt(num3.intValue(), num4.intValue());
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.i
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i9) {
                                case 0:
                                    ((j) transitionValues.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((j) transitionValues.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((j) transitionValues.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt);
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(num5.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue());
                    final int i11 = 2;
                    ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.i
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i11) {
                                case 0:
                                    ((j) transitionValues.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((j) transitionValues.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((j) transitionValues.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt2);
                    ValueAnimator ofInt3 = ValueAnimator.ofInt(num7.intValue(), num7.intValue(), (int) (num8.intValue() * 0.25f), (int) (num8.intValue() * 0.5f), (int) (num8.intValue() * 0.75f), num8.intValue());
                    final int i12 = 3;
                    ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.i
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i12) {
                                case 0:
                                    ((j) transitionValues.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((j) transitionValues.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((j) transitionValues.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((j) transitionValues.view).v = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt3);
                    animatorSet2.addListener(new y11(transitionValues, 8));
                    break;
                } else {
                    break;
                }
        }
        return super.createAnimator(viewGroup, transitionValues, transitionValues2);
    }
}
