// default package

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class iye {
    public static void a(View view) {
        b(view, 0.1f, 1.5f);
    }

    public static void b(View view, float f, float f2) {
        if (view == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        float f3 = 1.0f - f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f3);
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f3));
        animatorSet.setDuration(80L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f));
        animatorSet2.setInterpolator(new OvershootInterpolator(f2));
        animatorSet2.setDuration(350L);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{R.attr.state_pressed}, animatorSet);
        stateListAnimator.addState(new int[0], animatorSet2);
        view.setStateListAnimator(stateListAnimator);
    }
}
