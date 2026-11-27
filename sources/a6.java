// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a6 extends ChangeBounds {
    public final /* synthetic */ byte a;

    public /* synthetic */ a6(byte b) {
        this.a = b;
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.a) {
            case 0:
                super.captureEndValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof ema) {
                    transitionValues.values.put("text_size", Float.valueOf(((ema) view).getTextPaint().getTextSize()));
                    break;
                }
                break;
            default:
                super.captureEndValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof q34) {
                    int i = ((q34) view2).n;
                    int i2 = ((q34) view2).r;
                    int i3 = ((q34) view2).s;
                    int i4 = ((q34) view2).w;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i2));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i3));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i4));
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
                if (view instanceof ema) {
                    transitionValues.values.put("text_size", Float.valueOf(((ema) view).getTextPaint().getTextSize()));
                    break;
                }
                break;
            default:
                super.captureStartValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof q34) {
                    int i = ((q34) view2).n;
                    int i2 = ((q34) view2).r;
                    int i3 = ((q34) view2).s;
                    int i4 = ((q34) view2).w;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i2));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i3));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i4));
                    break;
                }
                break;
        }
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, final TransitionValues transitionValues, TransitionValues transitionValues2) {
        final byte b = 0;
        final byte b2 = 1;
        switch (this.a) {
            case 0:
                if (transitionValues != null && (transitionValues.view instanceof ema)) {
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
                    animatorSet.addListener(new z5(transitionValues, (byte) 0));
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (transitionValues != null && transitionValues2 != null && (transitionValues.view instanceof q34)) {
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
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p34
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b3 = b;
                            TransitionValues transitionValues3 = transitionValues;
                            switch (b3) {
                                case 0:
                                    ((q34) transitionValues3.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((q34) transitionValues3.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((q34) transitionValues3.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((q34) transitionValues3.view).w = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(valueAnimator);
                    ValueAnimator ofInt = ValueAnimator.ofInt(num3.intValue(), num4.intValue());
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p34
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b3 = b2;
                            TransitionValues transitionValues3 = transitionValues;
                            switch (b3) {
                                case 0:
                                    ((q34) transitionValues3.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((q34) transitionValues3.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((q34) transitionValues3.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((q34) transitionValues3.view).w = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt);
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(num5.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue());
                    final byte b3 = 2;
                    ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p34
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b32 = b3;
                            TransitionValues transitionValues3 = transitionValues;
                            switch (b32) {
                                case 0:
                                    ((q34) transitionValues3.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((q34) transitionValues3.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((q34) transitionValues3.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((q34) transitionValues3.view).w = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt2);
                    ValueAnimator ofInt3 = ValueAnimator.ofInt(num7.intValue(), num7.intValue(), (int) (num8.intValue() * 0.25f), (int) (num8.intValue() * 0.5f), (int) (num8.intValue() * 0.75f), num8.intValue());
                    final byte b4 = 3;
                    ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p34
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b32 = b4;
                            TransitionValues transitionValues3 = transitionValues;
                            switch (b32) {
                                case 0:
                                    ((q34) transitionValues3.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((q34) transitionValues3.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((q34) transitionValues3.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((q34) transitionValues3.view).w = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt3);
                    animatorSet2.addListener(new z5(transitionValues, (byte) 1));
                    break;
                } else {
                    break;
                }
        }
        return super.createAnimator(viewGroup, transitionValues, transitionValues2);
    }
}
